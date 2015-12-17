import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by forwi on 17.12.2015.
 */
public class MainForm extends JFrame{
    private JTabbedPane tabbedPane1;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextField textField2;
    private JButton convertButton;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JButton saveRecipeButton;
    private JTextField textField3;
    private JTextField textField4;
    private JButton addWeightButton;
    private JButton addLiquidButton;
    private JComboBox comboBox90;
    private JButton choseButton;
    private JTextPane textPane1;
    private JPanel panel;
    private JPanel convertor;
    private JPanel createRecipe;
    private JPanel downloadRecipe;
    private JTextField textField5;
    private JTextField textField6;
    private JComboBox comboBox7;
    private JComboBox comboBox8;
    private JComboBox comboBox9;
    private JComboBox comboBox10;
    private JComboBox comboBox11;
    private JComboBox comboBox12;
    private JComboBox comboBox13;
    private JComboBox comboBox14;
    private JComboBox comboBox15;
    private JComboBox comboBox16;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;
    private JTextField textField21;
    private JTextField textField22;
    private JTextField textField23;
    private JTextField textField24;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JTextField recipeName;
    private JLabel resultLabel;
    Recipe recipe;

    public MainForm(){
        recipe=new Recipe();
        setContentPane(panel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(600,400);
        try {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        turnOff();

        comboBox1.setModel(new MyCBM());
        convertButton.setEnabled(false);
        comboBox1.setSelectedIndex(0);
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch ((String)comboBox1.getSelectedItem()){
                    case "Dry":
                        comboBox2.setModel(new MyCBMDry());
                        comboBox3.setModel(new MyCBMDry());
                        break;
                    case "Liquid":
                        comboBox2.setModel(new MyCBMLiquid());
                        comboBox3.setModel(new MyCBMLiquid());
                        break;
                }
                comboBox2.setSelectedIndex(0);
                comboBox3.setSelectedIndex(0);
                convertButton.setEnabled(true);
            }
        });



        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product product;
                switch ((String)comboBox1.getSelectedItem()){
                    case "Dry":
                        product = new Dry(textField1.getText(),Double.parseDouble(textField2.getText()),(String)comboBox2.getSelectedItem());
                        resultLabel.setText(String.valueOf(product.proportionalAmount((String)comboBox2.getSelectedItem(),(String)comboBox3.getSelectedItem())));
                        break;
                    case "Liquid":
                        product = new Liquid(textField1.getText(),Double.parseDouble(textField2.getText()),(String)comboBox2.getSelectedItem());
                        resultLabel.setText(String.valueOf(product.proportionalAmount((String)comboBox2.getSelectedItem(),(String)comboBox3.getSelectedItem())));
                        break;
                }
            }
        });

       tabbedPane1.setBackground(new Color(197,225,165));

    addWeightButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          recipe.add("Dry",null,0,null);
          turnOn("Dry");
        }
    });

        addLiquidButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                recipe.add("Liquid",null,0,null);
                turnOn("Liquid");
            }
        });

        saveRecipeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Save(recipeName.getText());
            }
        });

    }

    private void turnOn(String s){
        switch (recipe.getComboNumber()){
            case 7:{
                comboBox7.setVisible(true);
                label6.setVisible(true);
                label6.setText(s);
                textField5.setVisible(true);
                textField6.setVisible(true);
                break;
            }
            case 8:{
                comboBox8.setVisible(true);
                label7.setVisible(true);
                label7.setText(s);
                textField7.setVisible(true);
                textField8.setVisible(true);
                break;
            }
            case 9:{
                comboBox9.setVisible(true);
                label8.setVisible(true);
                label8.setText(s);
                textField9.setVisible(true);
                textField10.setVisible(true);
                break;
            }
            case 10:{
                comboBox10.setVisible(true);
                label9.setVisible(true);
                label9.setText(s);
                textField11.setVisible(true);
                textField12.setVisible(true);
                break;
            }
            case 11:{
                comboBox11.setVisible(true);
                label10.setVisible(true);
                label10.setText(s);
                textField13.setVisible(true);
                textField14.setVisible(true);
                break;
            }
            case 12:{
                comboBox12.setVisible(true);
                label11.setVisible(true);
                label11.setText(s);
                textField15.setVisible(true);
                textField16.setVisible(true);
                break;
            }
            case 13:{
                comboBox13.setVisible(true);
                label12.setVisible(true);
                label12.setText(s);
                textField17.setVisible(true);
                textField18.setVisible(true);
                break;
            }
            case 14:{
                comboBox14.setVisible(true);
                label13.setVisible(true);
                label13.setText(s);
                textField19.setVisible(true);
                textField20.setVisible(true);
                break;
            }
            case 15:{
                comboBox15.setVisible(true);
                label14.setVisible(true);
                label14.setText(s);
                textField21.setVisible(true);
                textField22.setVisible(true);
                break;
            }
            case 16:{
                comboBox16.setVisible(true);
                label15.setVisible(true);
                label15.setText(s);
                textField23.setVisible(true);
                textField24.setVisible(true);
                break;
            }
        }
        recipe.setComboNumber(recipe.getComboNumber()+1);
    }

    private void turnOff(){
        comboBox16.setVisible(false);
        comboBox15.setVisible(false);
        comboBox14.setVisible(false);
        comboBox13.setVisible(false);
        comboBox12.setVisible(false);
        comboBox11.setVisible(false);
        comboBox10.setVisible(false);
        comboBox9.setVisible(false);
        comboBox8.setVisible(false);
        comboBox7.setVisible(false);
        textField24.setVisible(false);
        textField23.setVisible(false);
        textField22.setVisible(false);
        textField21.setVisible(false);
        textField20.setVisible(false);
        textField19.setVisible(false);
        textField18.setVisible(false);
        textField17.setVisible(false);
        textField16.setVisible(false);
        textField15.setVisible(false);
        textField14.setVisible(false);
        textField13.setVisible(false);
        textField12.setVisible(false);
        textField11.setVisible(false);
        textField10.setVisible(false);
        textField9.setVisible(false);
        textField8.setVisible(false);
        textField7.setVisible(false);
        textField6.setVisible(false);
        textField5.setVisible(false);
        label6.setVisible(false);
        label7.setVisible(false);
        label8.setVisible(false);
        label9.setVisible(false);
        label10.setVisible(false);
        label11.setVisible(false);
        label12.setVisible(false);
        label13.setVisible(false);
        label14.setVisible(false);
        label15.setVisible(false);

        recipe.setComboNumber(7);
    }

    private void Save(String s){
        ;
    }

}
