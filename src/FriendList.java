import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class FriendList {
    private HashMap<String,Product> contacts;
    private RandomAccessFile file;
    private String nameOfFile;

    FriendList(String s) throws IOException {
        nameOfFile=s;
        contacts = new HashMap<>();
    }

    public void createFile() throws IOException {
        if(!nameOfFile.endsWith("dat")){
            file = new RandomAccessFile(new File(nameOfFile+".dat"), "rw");}
        else{
            file = new RandomAccessFile(new File(nameOfFile), "rw");
        }
        contacts=getNicks();
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public String getType(String s){
        return contacts.get(s).getType();
    }

    //	////////////
    public void addToFile(String name,Product product)
            throws IOException {
        file.seek(file.length());
        file.writeUTF(name);
        file.writeDouble(product.getAmount());
        file.writeUTF(product.getDimension());
        file.writeUTF(product.getType());
    }
//////////

    public String[] makeString(){
        String[] strings;
        Set<String> n=contacts.keySet();
        strings=new String[n.size()];
        Iterator<String> itr = n.iterator();
        int i=0;
        String s;
        while (itr.hasNext()){
            s=itr.next();
            strings[i]=s;
            i++;
        }
        return strings;
    }

    public HashMap<String,Product> getNicks() throws IOException {
        file.seek(0);
        HashMap<String,Product> nicks = contacts;
        int b = file.read();
        if (b == -1) {
            return nicks;
        }
        file.seek(file.getFilePointer() - 1);
        while (b != -1) {
            String n = null;
            Double a = null;
            String d = null;
            String t = null;
            try {
                n = file.readUTF();
                a= file.readDouble();
                d = file.readUTF();
                t = file.readUTF();
            } catch (IOException e) {
                return new HashMap<>();
            }


            Product product;
            if(t.equals("Dry")){
            product = new Dry(n,a,d);
            }
            else{
                product = new Liquid(n,a,d);
            }
            nicks.put(n,product );
            b = file.read();
            file.seek(file.getFilePointer() - 1);
        }
        return nicks;
    }

    public void rewriteFile(HashMap<String,Product> hm)
            throws IOException {
        file.setLength(0);
        Set<String> n=hm.keySet();
        Iterator<String> itr = n.iterator();
        String s;
        while (itr.hasNext()){
            s=itr.next();
            file.writeUTF(s);
            file.writeDouble(hm.get(s).getAmount());
            file.writeUTF(hm.get(s).getDimension());
            file.writeUTF(hm.get(s).getType());
        }

    }

    public HashMap<String,Product> getContacts(){
        return contacts;
    }


    public void add(String nick,Product d){
        contacts.put(nick, d);
    }

    public void delete(String nick){
        if(contacts.containsKey(nick))
        contacts.remove(nick);
    }

    public Product getAmount(String nick){
        Product ip ;
        if (contacts.containsKey(nick)){
            ip = contacts.get(nick);}
        else{
            ip = null;
        }
        return ip;

    }

}

