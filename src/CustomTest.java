import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by forwi on 18.12.2015.
 */
public class CustomTest {
    private RandomAccessFile file;
    private HashMap<String,ArrayList<String>> questions;
    private ArrayList<String> justQuestions;

    CustomTest(String s) throws IOException {
        questions=new HashMap<>();
        justQuestions=new ArrayList<>();
        if(!s.endsWith("dat")){
        file = new RandomAccessFile(new File(s+".dat"), "rw");}
    else{
        file = new RandomAccessFile(new File(s), "rw");
    }
        getTest();
    }


    public void rewriteFile(HashMap<String,ArrayList<String>> hm)
            throws IOException {
        file.setLength(0);
        Set<String> n=questions.keySet();
        Iterator<String> itr = n.iterator();
        String s;
        while (itr.hasNext()){
            s=itr.next();
            file.writeUTF(s);
            for(int i=0;i<4;i++){
            file.writeUTF(questions.get(s).get(i));}
        }

    }

    public HashMap<String, ArrayList<String>> getQuestions() {
        return questions;
    }

    public void setQuestions(HashMap<String, ArrayList<String>> questions) {
        this.questions = questions;
    }

    public ArrayList<String> getJustQuestions() {
        return justQuestions;
    }

    public void setJustQuestions(ArrayList<String> justQuestions) {
        this.justQuestions = justQuestions;
    }

    public void add(String s,ArrayList a){
        questions.put(s,a);
    }

    public void add(String q,String a1,String a2,String a3,String a4){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a3);
        arrayList.add(a4);
        questions.put(q,arrayList);
        justQuestions.add(q);
    }

    public void getTest() throws IOException {
        file.seek(0);
        ArrayList<String> arrayList=new ArrayList<>();
        int b = file.read();
        if (b == -1) {
            return;
        }
        file.seek(file.getFilePointer() - 1);
        while (b != -1) {
            arrayList=new ArrayList<>();
            String q=null;
            try {
                q=file.readUTF();
                arrayList.add(file.readUTF());
                arrayList.add(file.readUTF());
                arrayList.add(file.readUTF());
                arrayList.add(file.readUTF());
            } catch (IOException e) {
                Tests t=new Tests();
                questions = t.getQuestions();
                justQuestions = t.getJustQuestions();
                return;
            }

            justQuestions.add(q);
            questions.put(q,arrayList);
            b = file.read();
            file.seek(file.getFilePointer() - 1);
        }

    }

    public void emptyFields(JTextField j1,JTextField j2,JTextField j3,JTextField j4,JTextField j5){
        j1.setText("");
        j2.setText("");
        j3.setText("");
        j4.setText("");
        j5.setText("");
    }

}
