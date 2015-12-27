import javax.swing.text.Document;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by forwi on 21.12.2015.
 */
public class Model {
    private FriendList friendList;
    private FriendList friendListForSave;
    private Recipe recipe;
    private Calculations calculations;


    public Model() throws IOException {
        recipe=new Recipe();
        friendListForSave= new FriendList("unnamed");
        calculations= new Calculations();
        friendList=null;
    }

    public  MyCBMDry choseCMB(String s){
        switch (s){
            case "Dry":
                return new MyCBMDry(Dry.dryDimensions);
            case "Liquid":
                return new MyCBMDry(Liquid.dryDimensions);
        }
        return new MyCBMDry();
    }

    public void setFriendList(String name) throws IOException {
        friendList=new FriendList(name);
        friendList.createFile();
    }


    public boolean selectedIndexFriendList(){
        if(friendList.makeString().length>0)
            return true;
        else
            return false;
    }

    public String converting1(String t,String selectedItem1,String t1,String selectedItem2){
        Product product;
        String r="0.00";
        switch (t){
            case "Dry":
                if(!t1.equals("")&&isNumeric(t1)){
                    product = new Dry("unnamed",Double.parseDouble(t1),selectedItem1);
                    r=String.valueOf(product.proportionalAmount(selectedItem1, selectedItem2) + " " + selectedItem2);
                    return r;}
            case "Liquid":
                if(!selectedItem1.equals("")&&isNumeric(t1)){
                    product = new Liquid("unnamed",Double.parseDouble(t1),selectedItem1);
                    r=(String.valueOf(product.proportionalAmount(selectedItem1,selectedItem2))+" "+selectedItem2);
                return r;}
        }
        return r;
    }

    public ArrayList<String>  justRecipe(FriendList fl){
        ArrayList<String> a=new ArrayList<>();
        a.add("Recipe:\n");
        Set<String> n=fl.getContacts().keySet();
        Iterator<String> itr = n.iterator();
        while (itr.hasNext()){
            String s=itr.next();
            Product product=fl.getAmount(s);
            a.add(product.getName() + ' ' + product.getAmount() + ' ' + product.getDimension() +'\n');
        }
        return a;
    }

    public void addWeight(){
        recipe.add("Dry",null,0,null);
    }

    public void addliquid(){
        recipe.add("Liquid",null,0,null);
    }

    public void createSavingFile(String s) throws IOException {
        friendListForSave.setNameOfFile(s);
        friendListForSave.createFile();
    }

    public boolean isNew(){
        return calculations.isNew();
    }

    public void setComboNumber(int t){
        recipe.setComboNumber(t);
    }

    public void someCheck(FriendList fl,String t1,String t2,String l,String dimen){
        Product product;
        if(!t1.equals("")&&!t2.equals("")&&isNumeric(t2)) {
            if (l.equals("Dry")) {
                product = new Dry(t1, Double.parseDouble(t2), dimen);
            } else {
                product = new Liquid(t1, Double.parseDouble(t2), dimen);
            }
            fl.add(t1, product);
        }
    }

    public void newListForSave() throws IOException {
        friendListForSave=new FriendList("unnamed");
    }

    public void rewriteListForSave() throws IOException {
        friendListForSave.rewriteFile(friendListForSave.getContacts());
    }

    public void calculationsAdd(char r){
        calculations.add(r);
    }

    public boolean calculationsCheck(char i){
        return calculations.check(i);
    }

    public void newCalculations(){
        calculations = new Calculations();
    }

    public String calculationsToString(){
        return String.valueOf(calculations.calculate());
    }

    public double calculationsCalculate(){
        return  calculations.calculate();
    }

    public String cButtonWork(String s){
        StringBuffer sb = new StringBuffer(s);
        if(sb.length()>0&&calculations.getForCalculation().size()>0){
            char c=calculations.getForCalculation().get(calculations.getForCalculation().size()-1);
            if(c=='i'||c=='o'||c=='c'){
                sb.setLength(sb.length()-3);
            }else
            if(c=='t'){
                sb.setLength(sb.length()-2);
            }else
            sb.setLength(sb.length()-1);}
        calculations.deleteLast();
        return sb.toString();
    }

    public ArrayList<String> convertedRecipe(FriendList fl,String string,String t){
        ArrayList<String> a=new ArrayList<>();
        a.add("Recipe:\n");
        if (fl==null){return a;}
        Set<String> n=fl.getContacts().keySet();
        Iterator<String> itr = n.iterator();
        while (itr.hasNext()){
            String s=itr.next();
            Product product=fl.getAmount(s);
            if(product.getType().equals(t))
                a.add(product.getName()+' '+product.proportionalAmount(product.getDimension(),string)+' '+string+'\n');
            else{
                a.add(product.getName()+' '+product.getAmount()+' '+product.getDimension()+'\n');
            }
        }
        return a;
    }

    public ArrayList<String> proportionRecipe1(FriendList fl,String c1, String c2,String t1){
        ArrayList<String> a=new ArrayList<>();
        a.add("Recipe:\n");
        if (fl==null){return a;}
        if(isNumeric(t1)) {
            Product p;
            if(fl.getAmount(c1).getType().equals("Dry")){
                p=new Dry(c1,Double.parseDouble(t1),c2);
            }else{
                p=new Liquid(c1,Double.parseDouble(t1),c2);
            }
            double normA=fl.getAmount(c1).NormalAmount(fl.getAmount(c1).getDimension());
            double newA=p.NormalAmount(p.getDimension());
            double proportion=newA/normA;
            Set<String> n = fl.getContacts().keySet();
            Iterator<String> itr = n.iterator();
            while (itr.hasNext()) {
                String s = itr.next();
                Product product = fl.getAmount(s);
                a.add(product.getName() + ' ' + product.proportionalAmount(product.ProportionalAmount(proportion, product.getDimension()), product.getDimension()) + ' ' + product.getDimension() +'\n');
            }
        }
        return a;
    }


    public int getComboNumber(){
        return recipe.getComboNumber();
    }

    public ArrayList<String> proportionRecipe2(FriendList fl,String c1, String c2,String t1,String w,String l){
        ArrayList<String> a=new ArrayList<>();
        a.add("Recipe:\n");
        if (fl==null){return a;}
        if(isNumeric(t1)) {
            Product p;
            if(fl.getAmount(c1).getType().equals("Dry")){
                p=new Dry(c1,Double.parseDouble(t1),c2);
            }else{
                p=new Liquid(c1,Double.parseDouble(t1),c2);
            }
            double normA=fl.getAmount(c1).NormalAmount(fl.getAmount(c1).getDimension());
            double newA=p.NormalAmount(p.getDimension());
            double proportion=newA/normA;
            Set<String> n = fl.getContacts().keySet();
            Iterator<String> itr = n.iterator();
            while (itr.hasNext()) {
                String s = itr.next();
                Product product = fl.getAmount(s);
                if(product.getType().equals("Dry"))
                    a.add( product.getName() + ' ' + product.proportionalAmount(product.ProportionalAmount(proportion,product.getDimension()),w) + ' ' + w+'\n');
                else
                    a.add( product.getName() + ' ' + product.proportionalAmount(product.ProportionalAmount(proportion,product.getDimension()),l) + ' ' + l+'\n');
            }
        }
        return a;
    }

    public FriendList getFriendList() {
        return friendList;
    }

    public void setFriendList(FriendList friendList) {
        this.friendList = friendList;
    }

    public FriendList getFriendListForSave() {
        return friendListForSave;
    }

    public void setFriendListForSave(FriendList friendListForSave) {
        this.friendListForSave = friendListForSave;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Calculations getCalculations() {
        return calculations;
    }

    public void setCalculations(Calculations calculations) {
        this.calculations = calculations;
    }

    private static boolean isNumeric(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
