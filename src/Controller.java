import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by forwi on 21.12.2015.
 */
public class Controller {
    private Model model;
    public Controller(Model m){
        model=m;
    }
    public Controller() {
        try {
            model=new Model();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Model getModel() {
        return model;
    }

    public void calculationsAdd(char r){
        model.calculationsAdd(r);
    }

    public boolean calculationsCheck(char i){
        return model.calculationsCheck(i);
    }

    public void hideButtons(JButton b1,JButton b2,JButton b3,JButton b4,JLabel l,JButton a,boolean b){
        b1.setVisible(b);
        b2.setVisible(b);
        b3.setVisible(b);
        b4.setVisible(b);
        l.setVisible(b);
        a.setVisible(b);
    }

    public void setComboModel(JComboBox c, MyCBMDry mc){
        c.setModel(mc);
    }

}
