import sun.swing.FilePane;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
    private JTextPane textPane1;
    private JPanel panel;
    private JPanel converter;
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
    private JLabel labelDry;
    private JLabel fileC;
    private JTextArea textArea1;
    private JButton convertButton2;
    private JComboBox comboBox17;
    private JButton convertButton1;
    private JComboBox comboBox18;
    private JButton bothButton;
    private JTextField textField31;
    private JButton powButton;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton sqButton;
    private JButton cButton;
    private JButton delButton;
    private JButton resButton;
    private JButton a8Button;
    private JButton a9Button;
    private JButton plusButton;
    private JButton a5Button;
    private JButton a6Button;
    private JButton minusButton;
    private JButton a2Button;
    private JButton a0Button;
    private JButton a3Button;
    private JButton comaButton;
    private JButton multiButton;
    private JButton divideButton;
    private JScrollPane scrollPane;
    private JPanel calculator;
    private JPanel pane1;
    private JPanel pane3;
    private JLabel weightLabel;
    private JLabel liquidLabel;
    private JLabel typeLabel;
    private JLabel productNameLabel;
    private JLabel fromLabel;
    private JLabel toLabel;
    private JLabel quantityLabel;
    private JLabel resultLabel1;
    private JLabel dimensionsLabel;
    private JLabel forWeightLabel;
    private JLabel forLiquidLabel;
    private JLabel productNameLabel1;
    private JLabel weightLabel1;
    private JLabel dimensionsLabel1;
    private JButton addMoreIngredientsButton;
    private JButton proportionButton;
    private JTextField textField32;
    private JComboBox comboBox19;
    private JLabel ingredientLabel;
    private JLabel newAmountLabel;
    private JComboBox comboBox20;
    private JButton leftBracketButton;
    private JButton rightBracketButton;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tgButton;
    private JButton ctgButton;
    private JButton πButton;
    private JButton eButton;
    private JButton choseFileButton;
    private JFileChooser chooser;
    private Controller controller;
    private static Color panelColor=new Color(0xe9ece5);
    private static Color buttonColor=new Color(0xb3c2bf);//new Color(0x3b3a36);
    private static Color boxColor=new Color(0xb3c2bf);
    private static Color selectedBoxColor=new Color(0xc0dfd9);
    private static Color textButtonColor= Color.BLACK;//Color.white;

    public MainForm() throws IOException {
        ImageIcon i=new ImageIcon("4.jpg");
        pane3=new BgPanel();
        pane1=new BgPanel();
        createRecipe=new BgPanel();
        downloadRecipe=new BgPanel();
        calculator=new BgPanel();
        converter=new BgPanel();
        controller=new Controller();
        setContentPane(panel);
        setTitle("Stupid program");
        Image im = new ImageIcon("1.png").getImage();
        setIconImage(im);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();


        setSize(530, 530);
        setResizable(false);
        tabbedPane1.setBackground(panelColor);
        downloadRecipe.setBackground(panelColor);
        textArea1.setFont( new Font("Georgia", Font.PLAIN,13));
        textArea1.setBackground(calculator.getBackground());

        comboBoxStyle(comboBox20, boxColor, selectedBoxColor, new Font("Georgia", Font.PLAIN, 11));
        comboBoxStyle(comboBox19,boxColor, selectedBoxColor, new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox18, comboBox17, comboBox16,boxColor, selectedBoxColor, new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox15, comboBox14, comboBox13,boxColor, selectedBoxColor, new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox12, comboBox11, comboBox10,boxColor, selectedBoxColor, new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox9, comboBox8, comboBox7,boxColor, selectedBoxColor, new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox6, comboBox5, comboBox4,boxColor, selectedBoxColor, new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox3, comboBox2, comboBox1,boxColor, selectedBoxColor, new Font("Georgia", Font.PLAIN,11));

        textFieldsFont(textField1,textField2,textField3,new Font("Georgia", Font.PLAIN,12),selectedBoxColor);
        textFieldsFont(textField4,textField5,textField6,new Font("Georgia", Font.PLAIN,12),selectedBoxColor);
        textFieldsFont(textField7,textField8,textField9,new Font("Georgia", Font.PLAIN,12),selectedBoxColor);
        textFieldsFont(textField10,textField11,textField12,new Font("Georgia", Font.PLAIN,12),selectedBoxColor);
        textFieldsFont(textField13,textField14,textField15,new Font("Georgia", Font.PLAIN,12),selectedBoxColor);
        textFieldsFont(textField16,textField17,textField18,new Font("Georgia", Font.PLAIN,12),selectedBoxColor);
        textFieldsFont(textField19,textField20,textField21,new Font("Georgia", Font.PLAIN,12),selectedBoxColor);
        textFieldsFont(textField22,textField23,textField24,new Font("Georgia", Font.PLAIN,12),selectedBoxColor);
        textField31.setFont(new Font("Georgia", Font.PLAIN,19));

        labelsFont(weightLabel, liquidLabel, fileC, new Font("Georgia", Font.PLAIN, 12));
        labelsFont(dimensionsLabel,forLiquidLabel,forWeightLabel,new Font("Georgia",Font.PLAIN,12));
        labelsFont(typeLabel,productNameLabel,fromLabel,new Font("Georgia",Font.PLAIN,12));
        labelsFont(toLabel,quantityLabel,resultLabel1,new Font("Georgia",Font.PLAIN,12));
        labelsFont(productNameLabel1,weightLabel1,dimensionsLabel1,new Font("Georgia",Font.PLAIN,12));
        labelsFont(labelDry,label6,label7,new Font("Georgia",Font.PLAIN,12));
        labelsFont(label6,label6,label7,new Font("Georgia",Font.PLAIN,12));
        labelsFont(label8,label9,label10,new Font("Georgia",Font.PLAIN,12));
        labelsFont(label11,label12,label13,new Font("Georgia",Font.PLAIN,12));
        labelsFont(label14,label15,label15/*congrats*/,new Font("Georgia",Font.PLAIN,12));
        labelsFont(newAmountLabel, ingredientLabel,resultLabel,new Font("Georgia",Font.PLAIN,12));

        tabbedPane1.setFont(new Font("Georgia",Font.PLAIN,11));
    //    panelColor(converter, createRecipe, testPanel, panelColor);
 //       panelColor(customizeTest, calculator, pane1, panelColor);
  //      panelColor(pane2, pane3, pane1, panelColor);
        UIManager.put("TabbedPane.contentAreaColor", panelColor);

        UIManager.put("Button.select", new Color(0x716A64));

        buttonsStyle(convertButton1, convertButton2, bothButton, buttonColor, textButtonColor, new Font("Georgia", Font.PLAIN,12));
        buttonsStyle(convertButton, addLiquidButton, addWeightButton, buttonColor, textButtonColor, new Font("Georgia", Font.PLAIN,12));
        buttonStyle(saveRecipeButton, buttonColor, textButtonColor, new Font("Georgia", Font.PLAIN,12));
        buttonsStyle(/*startButton*/sqButton, sqButton,cButton, buttonColor, textButtonColor, new Font("Georgia", Font.BOLD,14));
        buttonsStyle(minusButton, multiButton,divideButton, buttonColor, textButtonColor, new Font("Georgia", Font.BOLD,14));
        buttonsStyle(delButton, resButton,plusButton, buttonColor, textButtonColor, new Font("Georgia", Font.BOLD,14));
        buttonsStyle(comaButton, powButton,a0Button, buttonColor, textButtonColor, new Font("Georgia", Font.BOLD,14));
        buttonsStyle(a1Button, a2Button,a3Button, buttonColor, textButtonColor, new Font("Georgia", Font.BOLD,14));
        buttonsStyle(a4Button, a5Button,a6Button, buttonColor, textButtonColor, new Font("Georgia", Font.BOLD,14));
        buttonsStyle(a7Button, a8Button,a9Button, buttonColor, textButtonColor, new Font("Georgia", Font.BOLD,14));
        buttonsStyle(sinButton, cosButton,tgButton, buttonColor, textButtonColor, new Font("Georgia", Font.BOLD,14));
        buttonsStyle(ctgButton, rightBracketButton,leftBracketButton, buttonColor, textButtonColor, new Font("Georgia", Font.BOLD,14));
        buttonsStyle(eButton, πButton,πButton, buttonColor, textButtonColor, new Font("Georgia", Font.BOLD,14));

        turnOff();

        controller.setComboModel(comboBox17,new MyCBMDry(Liquid.dryDimensions));
        controller.setComboModel(comboBox18,new MyCBMDry());
        comboBox17.setSelectedIndex(0);
        comboBox18.setSelectedIndex(0);
        controller.setComboModel(comboBox1,new MyCBMDry(Recipe.types));
     //   convertButton.setEnabled(false);


        controller.setComboModel(comboBox6,new MyCBMDry());

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox2.setModel(controller.getModel().choseCMB((String) comboBox1.getSelectedItem()));
                comboBox3.setModel(controller.getModel().choseCMB((String)comboBox1.getSelectedItem()));

                comboBox2.setSelectedIndex(0);
                comboBox3.setSelectedIndex(0);
                convertButton.setEnabled(true);
            }
        });
        comboBox1.setSelectedIndex(1);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText( controller.getModel().converting1((String)comboBox1.getSelectedItem(),(String)comboBox2.getSelectedItem(),textField2.getText(),(String)comboBox3.getSelectedItem()));
            }
        });

        comboBox19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setComboModel(comboBox20,controller.getModel().choseCMB((String)comboBox19.getSelectedItem()));
            }
        });

        convertButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printConvertRecipe(controller.getModel().getFriendList(),"Dry",comboBox18);
            }
        });

        convertButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printConvertRecipe(controller.getModel().getFriendList(),"Liquid",comboBox17);
            }
        });

        chooser = new JSystemFileChooser();

        chooser.setCurrentDirectory(new File("."));

        choseFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = chooser.showDialog(panel, "OK");
                if(r == JFileChooser.APPROVE_OPTION)
                {
                    String name
                            = chooser.getSelectedFile().getPath();
                    try {
                        textArea1.setText("");
                        controller.getModel().setFriendList(name);
                        printRecipe(controller.getModel().getFriendList());
                        controller.setComboModel(comboBox19,new MyCBMDry(controller.getModel().getFriendList().makeString()));
                        if(controller.getModel().selectedIndexFriendList())
                            comboBox19.setSelectedIndex(0);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                }
            }
        });

        comboBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                catchCBM();
            }
        });

        comboBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                catchCBM();
            }
        });



    addWeightButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.getModel().addWeight();
          turnOn("Dry");
        }
    });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('1'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '1');
                    controller.calculationsAdd('1');
                }
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('2'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '2');
                    controller.calculationsAdd('2');

                }
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('3'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '3');
                    controller.calculationsAdd('3');
                }
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('4'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '4');
                    controller.calculationsAdd('4');
                }
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('5'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '5');
                    controller.calculationsAdd('5');
                }
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('6'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '6');
                    controller.calculationsAdd('6');
                }
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('7'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '7');
                    controller.calculationsAdd('7');
                }
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('8'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '8');
                    controller.calculationsAdd('8');
                }
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('9'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '9');
                    controller.calculationsAdd('9');
                }
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('0'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '0');
                    controller.calculationsAdd('0');
                }
            }
        });

        powButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('^'))
                {
                    textField31.setText(textField31.getText() + '^');
                    controller.calculationsAdd('^');
                }
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('+'))
                {
                    textField31.setText(textField31.getText() + '+');
                    controller.calculationsAdd('+');
                }
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('-'))
                {
                    textField31.setText(textField31.getText() + '-');
                    controller.calculationsAdd('-');
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('/'))
                {
                    textField31.setText(textField31.getText() + '/');
                    controller.calculationsAdd('/');
                }
            }
        });

        multiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('*'))
                {
                    textField31.setText(textField31.getText() + '*');
                    controller.calculationsAdd('*');
                }
            }
        });

        sqButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('s'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '√');
                    controller.calculationsAdd('s');
                }
            }
        });

        textField31.setEnabled(false);
        textField31.setDisabledTextColor(Color.black);

        comaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controller.calculationsCheck(',')) {
                    textField31.setText(textField31.getText() + ',');
                    controller.calculationsAdd(',');
                }
            }
        });

        tgButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('t'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + "tg");
                    controller.calculationsAdd('t');
                }
            }
        });

        ctgButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('c'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + "ctg");
                    controller.calculationsAdd('c');
                }
            }
        });

        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('i'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + "sin");
                    controller.calculationsAdd('i');
                }
            }
        });

        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('o'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + "cos");
                    controller.calculationsAdd('o');
                }
            }
        });

        πButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('p'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + 'π');
                    controller.calculationsAdd('p');
                }
            }
        });

        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('e'))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + 'e');
                    controller.calculationsAdd('e');
                }
            }
        });

        rightBracketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck(')'))
                {
                    textField31.setText(textField31.getText() + ')');
                    controller.calculationsAdd(')');
                }
            }
        });

        leftBracketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('('))
                {
                    clearResult(textField31,controller.getModel().isNew());
                    textField31.setText(textField31.getText() + '(');
                    controller.calculationsAdd('(');
                }
            }
        });

        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField31.setText("");
                controller.getModel().newCalculations();
            }
        });

        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearResult(textField31,controller.getModel().isNew());
                textField31.setText(controller.getModel().cButtonWork(textField31.getText()));
            }
        });

        resButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           //     calculations = new Calculations();//////////////////////////////////////////////////////////////////////////////////////////////////////////////
          //      if(calculations.fromString(textField31.getText()))
                if(controller.getModel().getCalculations().canBeResult())
                textField31.setText(controller.getModel().calculationsToString());
                controller.getModel().newCalculations();
            }
        });


        bothButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printProportionRecipe(controller.getModel().getFriendList(),comboBox19,comboBox20,textField32,comboBox18, comboBox17);
            }
        });

        proportionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printProportionRecipe(controller.getModel().getFriendList(),comboBox19,comboBox20,textField32);
            }
        });

        addLiquidButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.getModel().addliquid();
                turnOn("Liquid");
            }
        });

        saveRecipeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!recipeName.getText().equals(""))
                    try {
                        Save(recipeName.getText());
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                else{
                    try {
                        Save("NewRecipe");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });

        addMoreIngredientsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                forFile(controller.getModel().getFriendListForSave());
            }
        });

        controller.setComboModel(comboBox4,new MyCBMDry(Dry.dryDimensionsC));
        comboBox4.setSelectedIndex(Dry.dryDimensionsC.length-1);
        controller.setComboModel(comboBox5,new MyCBMDry(Liquid.dryDimensionsC));
        comboBox5.setSelectedIndex(Liquid.dryDimensionsC.length-1);

    }

    public void printRecipe(FriendList fl){
        textArea1.setText("");
        ArrayList<String> a=controller.getModel().justRecipe(fl);
        for(int i =0;i<a.size();i++ ){
            textArea1.append(a.get(i));
        }
    }

    public void printConvertRecipe(FriendList fl,String t,JComboBox c){
        textArea1.setText("");
        ArrayList<String> a=controller.getModel().convertedRecipe(controller.getModel().getFriendList(),(String)c.getSelectedItem(),t);
        for(int i =0;i<a.size();i++ ){
            textArea1.append(a.get(i));
        }
    }

    public void printProportionRecipe(FriendList fl,JComboBox c1, JComboBox c2,JTextField t1){
        textArea1.setText("");
        ArrayList<String> a=controller.getModel().proportionRecipe1(controller.getModel().getFriendList(),(String)c1.getSelectedItem(),(String)c2.getSelectedItem(),t1.getText());
        for(int i =0;i<a.size();i++ ){
            textArea1.append(a.get(i));
        }
    }

    public void printProportionRecipe(FriendList fl,JComboBox c1, JComboBox c2,JTextField t1,JComboBox w,JComboBox l){
        textArea1.setText("");
        ArrayList<String> a=controller.getModel().proportionRecipe2(controller.getModel().getFriendList(), (String) c1.getSelectedItem(), (String) c2.getSelectedItem(), t1.getText(), (String) w.getSelectedItem(), (String) l.getSelectedItem());
        for(int i =0;i<a.size();i++ ){
            textArea1.append(a.get(i));
        }
    }

    public void catchCBM(){
        setCBM("Dry",comboBox6);
        setCBM(label6.getText(),comboBox7);
        setCBM(label7.getText(),comboBox8);
        setCBM(label8.getText(),comboBox9);
        setCBM(label9.getText(),comboBox10);
        setCBM(label10.getText(),comboBox11);
        setCBM(label11.getText(),comboBox12);
        setCBM(label12.getText(),comboBox13);
        setCBM(label13.getText(),comboBox14);
        setCBM(label14.getText(),comboBox15);
        setCBM(label15.getText(),comboBox16);
    }

    private void setCBM(String s,JComboBox b){
        switch (s){
            case "Dry":b.setModel(new MyCBMDry());
        switch ((String)comboBox4.getSelectedItem()){
            case "oz":b.setSelectedItem("oz");
                b.setEnabled(false);
                break;
            case "cup":b.setSelectedItem("cup");
                b.setEnabled(false);
                break;
            case "lbs":b.setSelectedItem("lbs");
                b.setEnabled(false);
                break;
            case "g":b.setSelectedItem("g");
                b.setEnabled(false);
                break;
            case "custom":b.setEnabled(true);
                b.setSelectedIndex(0);
                break;
        }
                break;
            case "Liquid":b.setModel(new MyCBMDry(Liquid.dryDimensions));
                switch ((String)comboBox5.getSelectedItem()){
                    case "oz":b.setSelectedItem("oz");
                        b.setEnabled(false);
                        break;
                    case "cup":b.setSelectedItem("cup");
                        b.setEnabled(false);
                        break;
                    case "ml":b.setSelectedItem("ml");
                        b.setEnabled(false);
                        break;
                    case "tsp":b.setSelectedItem("tsp");
                        b.setEnabled(false);
                        break;
                    case "tbsp":b.setSelectedItem("tbsp");
                        b.setEnabled(false);
                        break;
                    case "l":b.setSelectedItem("l");
                        b.setEnabled(false);
                        break;
                    case "g":b.setSelectedItem("g");
                        b.setEnabled(false);
                        break;
                    case "custom":b.setEnabled(true);
                        b.setSelectedIndex(0);
                        break;
                }
                break;
        }
    }

    private void forTurnOn(String s, JComboBox c,JLabel l,JTextField t1,JTextField t2){
        c.setVisible(true);
        setCBM(s,c);
        l.setVisible(true);
        l.setText(s);
        t1.setVisible(true);
        t2.setVisible(true);
    }

    private void clearResult(JTextField j,boolean b){
        if(b){
            j.setText("");
        }
    }


    private void turnOn(String s){
        switch (controller.getModel().getComboNumber()){
            case 7:{
                forTurnOn(s,comboBox7,label6,textField5,textField6);
                break;
            }
            case 8:{
                forTurnOn(s,comboBox8,label7,textField7,textField8);
                break;
            }
            case 9:{
                forTurnOn(s, comboBox9, label8, textField9, textField10);
                break;
            }
            case 10:{
                forTurnOn(s, comboBox10, label9, textField11, textField12);
                break;
            }
            case 11:{
                forTurnOn(s, comboBox11, label10, textField13, textField14);
                break;
            }
            case 12:{
                forTurnOn(s, comboBox12, label11, textField15, textField16);
                break;
            }
            case 13:{
                forTurnOn(s, comboBox13, label12, textField17, textField18);
                break;
            }
            case 14:{
                forTurnOn(s, comboBox14, label13, textField19, textField20);
                break;
            }
            case 15:{
                forTurnOn(s, comboBox15, label14, textField21, textField22);
                break;
            }
            case 16:{
                forTurnOn(s, comboBox16, label15, textField23, textField24);
                addMoreIngredientsButton.setVisible(true);
                break;
            }
        }
        controller.getModel().setComboNumber(controller.getModel().getComboNumber() + 1);
    }

    private void check(FriendList fl,JTextField t1,JTextField t2,JComboBox c,JLabel l){
        controller.getModel().someCheck(fl,t1.getText(),t2.getText(),l.getText(),(String)c.getSelectedItem());
            t1.setText("");
            t2.setText("");
    }

    private void buttonStyle(JButton b,Color c1,Color c2,Font f){
        b.setBackground(c1);
        b.setForeground(c2);
        b.setFont(f);
    }

    private void comboBoxesStyle(JComboBox cb,JComboBox cb1,JComboBox cb2,Color c1,Color c2,Font f){
        comboBoxStyle(cb,c1,c2,f);
        comboBoxStyle(cb1,c1,c2,f);
        comboBoxStyle(cb2,c1,c2,f);
    }

    private void buttonsStyle(JButton b,JButton b1, JButton b2,Color c1,Color c2,Font f){
        buttonStyle(b,c1,c2,f);
        buttonStyle(b1,c1,c2,f);
        buttonStyle(b2,c1,c2,f);
    }

    private void panelColor(JPanel p1,JPanel j2, JPanel j3,Color c){
        p1.setBackground(c);
        j2.setBackground(c);
        j3.setBackground(c);
    }

    private void labelsFont(JLabel l1, JLabel l2, JLabel l3, Font f){
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
    }

    private void comboBoxStyle(JComboBox cb,Color c1,Color c2,Font f){
        cb.setBackground(c1);
        cb.setFont(f);

        Object child = cb.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popup = (BasicComboPopup)child;
        JList list = popup.getList();
        list.setSelectionBackground(c2);
    }

    private void textFieldsFont(JTextField t1,JTextField t2,JTextField t3,Font f,Color c){
        t1.setFont(f);
        t2.setFont(f);
        t3.setFont(f);
    }

    private void forFile(FriendList fl){
        check(fl,textField3,textField4,comboBox6,labelDry);
        check(fl,textField5,textField6,comboBox7,label6);
        check(fl,textField7,textField8,comboBox8,label7);
        check(fl,textField9,textField10,comboBox9,label8);
        check(fl,textField11,textField12,comboBox10,label9);
        check(fl,textField13,textField14,comboBox11,label10);
        check(fl,textField15,textField16,comboBox12,label11);
        check(fl,textField17,textField18,comboBox13,label12);
        check(fl,textField19,textField20,comboBox14,label13);
        check(fl,textField21,textField22,comboBox15,label14);
        check(fl,textField23,textField24,comboBox16,label15);
        controller.getModel().setComboNumber(7);

        turnOff();
    }

    private void turnOff(){
        turnOffTesxtFields(false);
        turnOffLabels(false);
        turnOffComboBoxes(false);
        addMoreIngredientsButton.setVisible(false);
        controller.getModel().setComboNumber(7);
    }
    
    private void turnOffLabels(boolean b){
        labelDry.setVisible(b);
        label6.setVisible(b);
        label7.setVisible(b);
        label8.setVisible(b);
        label9.setVisible(b);
        label10.setVisible(b);
        label11.setVisible(b);
        label12.setVisible(b);
        label13.setVisible(b);
        label14.setVisible(b);
        label15.setVisible(b);
    }
    
    private void turnOffComboBoxes(boolean b){
        comboBox16.setVisible(b);
        comboBox15.setVisible(b);
        comboBox14.setVisible(b);
        comboBox13.setVisible(b);
        comboBox12.setVisible(b);
        comboBox11.setVisible(b);
        comboBox10.setVisible(b);
        comboBox9.setVisible(b);
        comboBox8.setVisible(b);
        comboBox7.setVisible(b);

        comboBox6.setVisible(b);
    }

    private void turnOffTesxtFields(boolean b){
        textField24.setVisible(b);
        textField23.setVisible(b);
        textField22.setVisible(b);
        textField21.setVisible(b);
        textField20.setVisible(b);
        textField19.setVisible(b);
        textField18.setVisible(b);
        textField17.setVisible(b);
        textField16.setVisible(b);
        textField15.setVisible(b);
        textField14.setVisible(b);
        textField13.setVisible(b);
        textField12.setVisible(b);
        textField11.setVisible(b);
        textField10.setVisible(b);
        textField9.setVisible(b);
        textField8.setVisible(b);
        textField7.setVisible(b);
        textField6.setVisible(b);
        textField5.setVisible(b);

        textField4.setVisible(b);
        textField3.setVisible(b);
    }

    public void emptyFields(JTextField j1,JTextField j2,JTextField j3,JTextField j4,JTextField j5){
        j1.setText("");
        j2.setText("");
        j3.setText("");
        j4.setText("");
        j5.setText("");
    }

    public void recolour(JButton b1,JButton b2,JButton b3,JButton b4,Color color){
        b1.setBackground(color);
        b2.setBackground(color);
        b3.setBackground(color);
        b4.setBackground(color);

    }

    public void hideButtons(JButton b1,JButton b2,JButton b3,JButton b4,JLabel l,JButton a,boolean b){
        b1.setVisible(b);
        b2.setVisible(b);
        b3.setVisible(b);
        b4.setVisible(b);
        l.setVisible(b);
        a.setVisible(b);
    }

    private void Save(String s) throws IOException {
        controller.getModel().createSavingFile(s);
        forFile(controller.getModel().getFriendListForSave());
        controller.getModel().rewriteListForSave();
        controller.getModel().newListForSave();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}

class JSystemFileChooser extends JFileChooser{
    public void updateUI(){
        LookAndFeel old = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Throwable ex) {
            old = null;
        }

        super.updateUI();

        if(old != null){
            FilePane filePane = findFilePane(this);
            filePane.setViewType(FilePane.VIEWTYPE_DETAILS);
            filePane.setViewType(FilePane.VIEWTYPE_LIST);

            Color background = UIManager.getColor("Label.background");
            setBackground(background);
            setOpaque(true);

            try {
                UIManager.setLookAndFeel(old);
            }
            catch (UnsupportedLookAndFeelException ignored) {} // shouldn't get here
        }
    }



    private static FilePane findFilePane(Container parent){
        for(Component comp: parent.getComponents()){
            if(FilePane.class.isInstance(comp)){
                return (FilePane)comp;
            }
            if(comp instanceof Container){
                Container cont = (Container)comp;
                if(cont.getComponentCount() > 0){
                    FilePane found = findFilePane(cont);
                    if (found != null) {
                        return found;
                    }
                }
            }
        }

        return null;
    }
}


class BgPanel extends JPanel{
    private String path;
    public void paintComponent(Graphics g) {
        Image im = null;
        try {
            im = ImageIO.read(new File("4.jpg"));
        } catch (IOException e) {
        }
        g.drawImage(im, 0, 0, null);
    }  }



