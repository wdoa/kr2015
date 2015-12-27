import java.util.ArrayList;

/**
 * Created by forwi on 19.12.2015.
 */
public class Calculations {

    private ArrayList<Character> forCalculation;
    private ArrayList<Character> numbers;
    private ArrayList<Character> options;
    private ArrayList<Character> specialSymbols;
    private ArrayList<Character> specialNumbers;
    private ArrayList<Character> brackets;
    private ArrayList<Bracket> checkBrackets;
    private ArrayList<Character> checkComa;
    private boolean isNew;
    private int bracketsCounter;

    public Calculations(){
        isNew=true;
        numbers = new ArrayList<>();
        specialSymbols = new ArrayList<>();
        specialNumbers=new ArrayList<>();
        brackets=new ArrayList<>();
        options = new ArrayList<>();
        checkBrackets=new ArrayList<>();
        checkComa=new ArrayList<>();
        bracketsCounter=0;
        filling();
        forCalculation = new ArrayList<>();
    }

    public void add(char c){
        isNew=false;
        if(c=='(')
            bracketsCounter++;
        if(c==')')
            bracketsCounter--;
        forCalculation.add(c);
    }

    public boolean canBeResult(){
        if(bracketsCounter==0)
            return true;
        else
            return false;
    }

    private void filling(){
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
        numbers.add('0');
        options.add('+');
        options.add('-');
        options.add('/');
        options.add('*');
        options.add('^');
        options.add(',');
        specialSymbols.add('s');
        specialSymbols.add('o');
        specialSymbols.add('i');
        specialSymbols.add('t');
        specialSymbols.add('c');
        specialNumbers.add('e');
        specialNumbers.add('p');
        brackets.add('(');
        brackets.add(')');
    }

    public ArrayList<Character> getForCalculation() {
        return forCalculation;
    }

    public boolean isNew() {
        return isNew;
    }

    public void deleteLast(){
        if(forCalculation.size()>0) {
            if(forCalculation.get(forCalculation.size() - 1).equals('('))
                bracketsCounter--;
            if(forCalculation.get(forCalculation.size() - 1).equals(')'))
                bracketsCounter++;
            if(options.contains(forCalculation.get(forCalculation.size() - 1))){
                if(checkComa.size()>0)
                checkComa.remove(checkComa.size() - 1);
            }
            forCalculation.remove(forCalculation.size() - 1);
        }
    }

    public boolean fromString(String s){
        for (int i=0;i<s.length();i++){
            if(check(s.charAt(i))){
                add(s.charAt(i));
            }
            else return false;
        }
        return true;
    }


    public double calculate(){
        double d=0;
        ArrayList<Bracket> opt = new ArrayList<>();
        for (int i =0;i<forCalculation.size();i++){
            if(options.contains(forCalculation.get(i))||specialSymbols.contains(forCalculation.get(i))){
                opt.add(new Bracket(forCalculation.get(i),i));
            }
        }
        for (int i =0;i<forCalculation.size();i++){
            if(brackets.contains(forCalculation.get(i))){
                checkBrackets.add(new Bracket(forCalculation.get(i),i));
            }
        }
     //   int j;
        double currentNumber=0;
        double p1=10;
        boolean point = false;
        double pointer=0.1;
        int q=-1;
        ArrayList<Double> numbers1= new ArrayList<>();
        for (int i=0;i<forCalculation.size();i++){
            if(numbers.contains(forCalculation.get(i))){
                if(point){
                    currentNumber+=(forCalculation.get(i)-48)*pointer;
                    pointer*=0.1;
                }
                else{
                    double h=forCalculation.get(i)-48;
                    currentNumber=currentNumber*p1+(h);
                }
            }else{
                if(specialNumbers.contains(forCalculation.get(i))){
                    if(forCalculation.get(i).equals('e')){
                        currentNumber+=Math.E;
                    }
                    else {
                        currentNumber+=Math.PI;
                    }
                }else{
                q++;
                if(forCalculation.get(i).equals(',')) {
                    opt.remove(q);
                    q--;
                    point = true;
                    pointer = 0.1;
                }else{
                    if(options.contains(forCalculation.get(i))){
                    numbers1.add(currentNumber);
                    currentNumber=0;
                    point=false;
                    pointer=0.1;}
                }
            }
            }
        }
        numbers1.add(currentNumber);

        while (checkBrackets.size()!=0){
            int s=findS();
            calculateSimpleOptions(checkBrackets.get(s).getPos(),checkBrackets.get(s+1).getPos(),opt,numbers1);
            checkBrackets.remove(s);
            checkBrackets.remove(s);
        }

        if(opt.size()>0)
        calculateSimpleOptions(-1,100000,opt,numbers1);

        return numbers1.get(0);
    }

    private int findS(){
        int s=0;
        for(int i =0 ; i<checkBrackets.size();i++){
            if(checkBrackets.get(i).getB()=='('&&checkBrackets.get(i+1).getB()==')'){
                s=i; break;
            }
        }
        return s;
    }


    private void calculateSimpleOptions(int s,int e,ArrayList<Bracket> opt, ArrayList<Double> numbers1){
        int j;
        j=0;
        if(opt.size()>0) {
            j= counter(j,opt,s);
            while (true) {
                if (j >= opt.size()) break;
                if (opt.get(j).getPos() > e) break;
                if (opt.get(j).getB() == ('s')) {
                    double g = Math.sqrt(numbers1.get(posCount(opt,j)+1));
                    numbers1.set(posCount(opt,j)+1, g);
                    opt.remove(j);
                    j--;
                }
                j++;
            }
        }

        j=0;
        if(opt.size()>0) {
            j= counter(j,opt,s);
            while (true) {
                if (j >= opt.size()) break;
                if (opt.get(j).getPos() > e) break;
                if (opt.get(j).getB() == ('o')) {
                    double g = Math.cos(numbers1.get(posCount(opt, j) + 1));
                    numbers1.set(posCount(opt,j)+1, g);
                    opt.remove(j);
                    j--;
                }
                j++;
            }
        }

        j=0;
        if(opt.size()>0) {
            j= counter(j,opt,s);
            while (true) {
                if (j >= opt.size()) break;
                if (opt.get(j).getPos() > e) break;
                if (opt.get(j).getB() == ('i')) {
                    double g = Math.sin(numbers1.get(posCount(opt, j) + 1));
                    numbers1.set(posCount(opt,j)+1, g);
                    opt.remove(j);
                    j--;
                }
                j++;
            }
        }

        j=0;
        if(opt.size()>0) {
           j= counter(j,opt,s);
            while (true) {
                if (j >= opt.size()) break;
                if (opt.get(j).getPos() > e) break;
                if (opt.get(j).getB() == ('t')) {
                    double g = Math.tan(numbers1.get(posCount(opt, j) + 1));
                    numbers1.set(posCount(opt,j)+1, g);
                    opt.remove(j);
                    j--;
                }
                j++;
            }
        }

        j=0;
        if(opt.size()>0) {
            j= counter(j,opt,s);
            while (true) {
                if (j >= opt.size()) break;
                if (opt.get(j).getPos() > e) break;
                if (opt.get(j).getB() == ('c')) {
                    double g = 1/Math.tan(numbers1.get(posCount(opt, j) + 1));
                    numbers1.set(posCount(opt,j)+1, g);
                    opt.remove(j);
                    j--;
                }
                j++;
            }
        }

        j=0;
        if(opt.size()>0) {
            j= counter(j,opt,s);
            while (true) {
                if (j >= opt.size()) break;
                if (opt.get(j).getPos() > e) break;
                if (opt.get(j).getB() == ('^')) {
                    double n1 = numbers1.get(posCount(opt,j)+1);
                    double n2 = numbers1.get(posCount(opt,j)+2);
                    double r = Math.pow(n1, n2);
                    numbers1.set(posCount(opt,j)+1, r);
                    opt.remove(j);
                    numbers1.remove(posCount(opt,j)+1 + 1);
                    j--;
                }
                j++;
            }
        }

        j=0;
        if(opt.size()>0) {
            j= counter(j,opt,s);
            while (true) {
                if (j >= opt.size()) break;
                if (opt.get(j).getPos() > e) break;
                if (opt.get(j).getB() == ('*')) {
                    double n1 = numbers1.get(posCount(opt,j)+1);
                    double n2 = numbers1.get(posCount(opt,j)+2);
                    double r = n1 * n2;
                    numbers1.set(posCount(opt,j)+1, r);
                    opt.remove(j);
                    numbers1.remove(posCount(opt,j)+1 + 1);
                    j--;
                } else if (opt.get(j).getB() == ('/')) {
                    double n1 = numbers1.get(posCount(opt,j)+1);
                    double n2 = numbers1.get(posCount(opt,j)+2);
                    double r = n1 / n2;
                    numbers1.set(posCount(opt,j)+1, r);
                    opt.remove(j);
                    numbers1.remove(posCount(opt,j)+1 + 1);
                    j--;
                }
                j++;
            }
        }

        j=0;
        if(opt.size()>0) {
            j= counter(j,opt,s);
            while (true) {
                if (j >= opt.size()) break;
                if (opt.get(j).getPos() > e) break;
                if (opt.get(j).getB() == ('+')) {
                    double n1 = numbers1.get(posCount(opt,j)+1);
                    double n2 = numbers1.get(posCount(opt,j)+2);
                    double r = n1 + n2;
                    numbers1.set(posCount(opt,j)+1, r);
                    opt.remove(j);
                    numbers1.remove(posCount(opt,j)+1 + 1);
                    j--;
                } else if (opt.get(j).getB() == ('-')) {
                    double n1 = numbers1.get(posCount(opt,j)+1);
                    double n2 = numbers1.get(posCount(opt,j)+2);
                    double r = n1 - n2;
                    numbers1.set(posCount(opt,j)+1, r);
                    opt.remove(j);
                    numbers1.remove(posCount(opt,j)+1 + 1);
                    j--;
                }
                j++;
            }
        }
    }

    private int posCount(ArrayList<Bracket> opt,int j){
        int y=-1;
        for(int i=0;i<j;i++){
            if(!specialSymbols.contains(opt.get(i).getB())){
                y++;
            }
        }
        return y;
    }

    private int counter(int j,ArrayList<Bracket> opt,int s){
        while (true) {
            if (j >= opt.size()) break;
            if (opt.get(j).getPos() > s) break;
            j++;
        }
        return j;
    }

     public boolean check(Character c){

         if(forCalculation.size()==0&&options.contains(c)){
             return false;
         }
         if(c==','){
             if(checkComa.size()==0){
                 if(numbers.contains(forCalculation.get(forCalculation.size()-1))){
                     checkComa.add(',');
                     return true;}
             }
             else
             {if (checkComa.get(checkComa.size()-1)==',')
                 return false;
             else{
                 if(numbers.contains(forCalculation.get(forCalculation.size()-1))){
                     checkComa.add(',');
                     return true;}
                 else return false;
             }}
         }
         if(options.contains(c)){
         if(forCalculation.get(forCalculation.size()-1)==')'||numbers.contains(forCalculation.get(forCalculation.size()-1))||specialNumbers.contains(forCalculation.get(forCalculation.size()-1))){
             checkComa.add(c);
             return true;
         }else
             return false;
         }

         if(specialSymbols.contains(c)){
             if(forCalculation.size()==0) return true;
             if(specialSymbols.contains(forCalculation.get(forCalculation.size()-1))||numbers.contains(forCalculation.get(forCalculation.size() - 1))||specialNumbers.contains(forCalculation.get(forCalculation.size() - 1))){
                 return false;
             }else
                 return true;
         }

         if(brackets.contains(c)) {
             if (bracketsCounter <= 0 && c == ')') {
                 return false;
             } else
             if(forCalculation.size()>0){
             if(forCalculation.get(forCalculation.size()-1)=='('&&c==')'){
                 return false;}
                 else{ if(forCalculation.get(forCalculation.size()-1)==')'&&c=='(')
                     return false;}
             if(specialSymbols.contains(forCalculation.get(forCalculation.size()-1))&&c==')'){
                     return false;}
                 if((specialNumbers.contains(forCalculation.get(forCalculation.size() - 1))||numbers.contains(forCalculation.get(forCalculation.size()-1)))&&c=='('){
                     return false;}
             }
                 return true;
         }
         if (specialNumbers.contains(c)){
             if(forCalculation.size()==0) return true;
             if(!specialNumbers.contains((forCalculation.get(forCalculation.size()-1)))&&!numbers.contains((forCalculation.get(forCalculation.size()-1)))){
                 return true;
             }else{
                 return false;
             }
         }

         if(!options.contains(c)&&!numbers.contains(c)&&!specialSymbols.contains(c)&&!specialNumbers.contains(c))
             return false;

         return true;
     }

}

class Bracket {
    private char b;
    private int pos;

    public Bracket(char b, int pos) {
        this.b = b;
        this.pos = pos;
    }

    public char getB() {
        return b;
    }

    public int getPos() {
        return pos;
    }
}
