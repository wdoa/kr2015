import javax.swing.*;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.text.Style;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

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
    private JLabel labelDry;
    private JLabel fileC;
    private JTextArea textArea1;
    private JButton convertButton2;
    private JComboBox comboBox17;
    private JButton convertButton1;
    private JComboBox comboBox18;
    private JButton bothButton;
    private JPanel testPanel;
    private JButton qButton1;
    private JButton qButton2;
    private JButton qButton3;
    private JButton qButton4;
    private JButton button5;
    private JButton startButton;
    private JLabel quest;
    private JLabel congrats;
    private JPanel customizeTest;
    private JTextField textField25;
    private JButton OKButton;
    private JLabel testFileName;
    private JTextField textField26;
    private JTextField textField27;
    private JTextField textField28;
    private JTextField textField29;
    private JTextField textField30;
    private JButton addToTestButton;
    private JButton createTestButton;
    private JLabel choseTest;
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
    private JPanel pane2;
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
    private JLabel writeQuestionLabel;
    private JLabel writeRightAnswerLabel;
    private JLabel otherAnswersLabel;
    private JButton addMoreIngridientsButton;
    private JButton proportionButton;
    private JTextField textField32;
    private JComboBox comboBox19;
    private JLabel ingridientLabel;
    private JLabel newAmountLabel;
    private JComboBox comboBox20;
    private JFileChooser chooser;
    private Controller controller;

    public MainForm() throws IOException {
        controller=new Controller();
        controller.hideButtons(qButton1,qButton2,qButton3,qButton4,quest,button5,false);
        setContentPane(panel);
        setTitle("Stupid program");
        Image im = new ImageIcon("1.png").getImage();
        setIconImage(im);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();

        setSize(600,430);
        tabbedPane1.setBackground(new Color(0xe9ece5));
        downloadRecipe.setBackground(new Color(0xe9ece5));
        textArea1.setFont( new Font("Georgia", Font.PLAIN,13));
        textArea1.setBackground(new Color(0xe9ece5));

        comboBoxStyle(comboBox20,new Color(0xb3c2bf), new Color(0xc0dfd9), new Font("Georgia", Font.PLAIN,11));
        comboBoxStyle(comboBox19,new Color(0xb3c2bf), new Color(0xc0dfd9), new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox18, comboBox17, comboBox16,new Color(0xb3c2bf), new Color(0xc0dfd9), new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox15, comboBox14, comboBox13,new Color(0xb3c2bf), new Color(0xc0dfd9), new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox12, comboBox11, comboBox10,new Color(0xb3c2bf), new Color(0xc0dfd9), new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox9, comboBox8, comboBox7,new Color(0xb3c2bf), new Color(0xc0dfd9), new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox6, comboBox5, comboBox4,new Color(0xb3c2bf), new Color(0xc0dfd9), new Font("Georgia", Font.PLAIN,11));
        comboBoxesStyle(comboBox3, comboBox2, comboBox1,new Color(0xb3c2bf), new Color(0xc0dfd9), new Font("Georgia", Font.PLAIN,11));

        textFieldsFont(textField1,textField2,textField3,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));
        textFieldsFont(textField4,textField5,textField6,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));
        textFieldsFont(textField7,textField8,textField9,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));
        textFieldsFont(textField10,textField11,textField12,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));
        textFieldsFont(textField13,textField14,textField15,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));
        textFieldsFont(textField16,textField17,textField18,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));
        textFieldsFont(textField19,textField20,textField21,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));
        textFieldsFont(textField22,textField23,textField24,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));
        textFieldsFont(textField25,textField26,textField27,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));
        textFieldsFont(textField28,textField29,textField30,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));
        textFieldsFont(recipeName,textField29,textField31,new Font("Georgia", Font.PLAIN,12),new Color(0xc0dfd9));

        labelsFont(weightLabel, liquidLabel, fileC, new Font("Georgia", Font.PLAIN, 12));
        labelsFont(dimensionsLabel,forLiquidLabel,forWeightLabel,new Font("Georgia",Font.PLAIN,12));
        labelsFont(typeLabel,productNameLabel,fromLabel,new Font("Georgia",Font.PLAIN,12));
        labelsFont(toLabel,quantityLabel,resultLabel1,new Font("Georgia",Font.PLAIN,12));
        labelsFont(productNameLabel1,weightLabel1,dimensionsLabel1,new Font("Georgia",Font.PLAIN,12));
        labelsFont(labelDry,label6,label7,new Font("Georgia",Font.PLAIN,12));
        labelsFont(label6,label6,label7,new Font("Georgia",Font.PLAIN,12));
        labelsFont(label8,label9,label10,new Font("Georgia",Font.PLAIN,12));
        labelsFont(label11,label12,label13,new Font("Georgia",Font.PLAIN,12));
        labelsFont(label14,label15,congrats,new Font("Georgia",Font.PLAIN,12));
        labelsFont(choseTest,testFileName,quest,new Font("Georgia",Font.PLAIN,12));
        labelsFont(writeQuestionLabel,writeRightAnswerLabel,otherAnswersLabel,new Font("Georgia",Font.PLAIN,12));
        labelsFont(newAmountLabel,ingridientLabel,resultLabel,new Font("Georgia",Font.PLAIN,12));

        tabbedPane1.setFont(new Font("Georgia",Font.PLAIN,11));
        panelColor(convertor, createRecipe, testPanel, new Color(0xe9ece5));
        panelColor(customizeTest, calculator, pane1, new Color(0xe9ece5));
        panelColor(pane2, pane3, pane1, new Color(0xe9ece5));
        UIManager.put("TabbedPane.contentAreaColor", new Color(0xe9ece5));

        buttonStyle(proportionButton, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.PLAIN,12));
        buttonsStyle(convertButton1, convertButton2, bothButton, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.PLAIN,12));
        buttonsStyle(convertButton, addLiquidButton, addWeightButton, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.PLAIN,12));
        buttonsStyle(saveRecipeButton,qButton4 , button5, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.PLAIN,12));
        buttonsStyle(qButton1, qButton2, qButton3, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.PLAIN,12));
        buttonsStyle(createTestButton, OKButton,addToTestButton, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.PLAIN,12));
        buttonsStyle(startButton, sqButton,cButton, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.BOLD,12));
        buttonsStyle(minusButton, multiButton,divideButton, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.BOLD,12));
        buttonsStyle(delButton, resButton,plusButton, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.BOLD,12));
        buttonsStyle(comaButton, powButton,a0Button, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.BOLD,12));
        buttonsStyle(a1Button, a2Button,a3Button, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.BOLD,12));
        buttonsStyle(a4Button, a5Button,a6Button, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.BOLD,12));
        buttonsStyle(a7Button, a8Button,a9Button, new Color(0x3b3a36), Color.white, new Font("Georgia", Font.BOLD,12));

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

        controller.setComboModel(comboBox17,new MyCBMDry(Liquid.dryDimensions));
        controller.setComboModel(comboBox18,new MyCBMDry());
        comboBox17.setSelectedIndex(0);
        comboBox18.setSelectedIndex(0);
        controller.setComboModel(comboBox1,new MyCBMDry(Recipe.types));
        convertButton.setEnabled(false);
        comboBox1.setSelectedIndex(0);
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

        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        choseTest.setText("Chose customize test");
        choseTest.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int r = chooser.showDialog(panel, "chooice dialog");
                if(r == JFileChooser.APPROVE_OPTION)
                {
                    String name
                            = chooser.getSelectedFile().getPath();
                    try {
                        controller.getModel().setTests(name);

                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        fileC.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int r = chooser.showDialog(panel, "Choice dialog");
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

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

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

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 congrats.setVisible(false);
                startButton.setVisible(false);
                choseTest.setVisible(false);
                hideButtons(qButton1, qButton2, qButton3, qButton4, quest, button5, true);
                try{
                makeButtons(qButton1, qButton2, qButton3, qButton4,controller.getModel().randomJustQuestion());}
                catch(IllegalArgumentException a){
                    controller.getModel().setTests(new Tests());
                    makeButtons(qButton1, qButton2, qButton3, qButton4,controller.getModel().randomJustQuestion() );
                }
                button5.setText("Right answer");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button5.getText().equals("Right answer")){
                    coloringRightAnswer(qButton1,qButton2,qButton3,qButton4,controller.getModel().showRightAnswer(qButton1.getText(),qButton2.getText(),qButton3.getText(),qButton4.getText(),quest.getText()));
                    setAnswering();
                }
                else{
                    recolour(qButton1, qButton2, qButton3, qButton4, new Color(0x3b3a36));
                         if(controller.getModel().getTotalQuestions()==controller.getModel().getTestQuestionCounter()){
                        hideButtons(qButton1, qButton2, qButton3, qButton4, quest, button5, false);
                        startButton.setVisible(true);
                        choseTest.setVisible(true);
                        congrats.setVisible(true);
                        congrats.setText("Right answers: "+String.valueOf(controller.getModel().getTests().getRightAnswersCounter()+"/" +controller.getModel().getTotalQuestions()));
                        controller.getModel().getTests().newTest();
                    }else
                    {
                        makeButtons(qButton1, qButton2, qButton3, qButton4,controller.getModel().randomJustQuestion());
                        button5.setText("Right answer");
                    }
                }
            }
        });

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    controller.getModel().newCustomTest(textField25.getText());
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                OKButton.setEnabled(false);
            }
        });

        addToTestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.getModel().addToTest(textField26.getText(),textField27.getText(),textField28.getText(),textField29.getText(),textField30.getText());
                emptyFields(textField26, textField27, textField28, textField29, textField30);
            }
        });

        createTestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addToTestButton.doClick();
                OKButton.setEnabled(true);
                try {
                    controller.getModel().createTestRewrite();
                } catch (IOException e1) {
                    return;
                }
            }
        });

        qButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.getModel().isRightAnswer(qButton1.getText(),qButton1.getBackground(),new Color(104,159,56),quest.getText()))
                    qButton1.setBackground(new Color(104,159,56));
                else{
                    qButton1.setBackground(new Color(150, 40, 27));
                    coloringRightAnswer(qButton1,qButton2,qButton3,qButton4,controller.getModel().rightAnswer(qButton2.getText(),qButton3.getText(),qButton4.getText(),quest.getText()));
                }
                setAnswering();
            }
        });

        qButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.getModel().isRightAnswer(qButton2.getText(),qButton2.getBackground(),new Color(104,159,56),quest.getText()))
                    qButton2.setBackground(new Color(104,159,56));
                else{
                    qButton2.setBackground(new Color(150, 40, 27));
                    coloringRightAnswer(qButton1,qButton2,qButton3,qButton4,controller.getModel().rightAnswer(qButton1.getText(),qButton3.getText(),qButton4.getText(),quest.getText()));
                }
                setAnswering();
            }
        });

        qButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.getModel().isRightAnswer(qButton3.getText(),qButton3.getBackground(),new Color(104,159,56),quest.getText()))
                    qButton3.setBackground(new Color(104,159,56));
                else{
                    qButton3.setBackground(new Color(150, 40, 27));
                    coloringRightAnswer(qButton1,qButton2,qButton3,qButton4,controller.getModel().rightAnswer(qButton2.getText(),qButton1.getText(),qButton4.getText(),quest.getText()));
                }
                setAnswering();
            }
        });

        qButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.getModel().isRightAnswer(qButton4.getText(),qButton4.getBackground(),new Color(104,159,56),quest.getText()))
                qButton4.setBackground(new Color(104,159,56));
                else{
                    qButton4.setBackground(new Color(150, 40, 27));
                    coloringRightAnswer(qButton1, qButton2, qButton3, qButton4, controller.getModel().rightAnswer(qButton2.getText(), qButton3.getText(), qButton1.getText(), quest.getText()));
                }
                setAnswering();
            }
        });


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck('1'))
                {
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
                    textField31.setText(textField31.getText() + '√');
                    controller.calculationsAdd('s');
                }
            }
        });

        comaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.calculationsCheck(','))
                {
                    textField31.setText(textField31.getText() + ',');
                    controller.calculationsAdd(',');
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
                textField31.setText(controller.getModel().cButtonWork(textField31.getText()));
            }
        });

        resButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           //     calculations = new Calculations();//////////////////////////////////////////////////////////////////////////////////////////////////////////////
          //      if(calculations.fromString(textField31.getText()))
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

        addMoreIngridientsButton.addActionListener(new ActionListener() {
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

    private void coloringRightAnswer(JButton b1,JButton b2,JButton b3,JButton b4,String s){
        if(b1.getText().equals(s)){
            b1.setBackground(new Color(104,159,56));
        }else{
            if(s.equals(b2.getText())){
                b2.setBackground(new Color(104,159,56));
            }
            else{
                if(s.equals(b3.getText())){
                    b3.setBackground(new Color(104,159,56));
                }
                else{
                    b4.setBackground(new Color(104,159,56));
                }
            }
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
                addMoreIngridientsButton.setVisible(true);
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

    public void makeButtons(JButton b1,JButton b2,JButton b3,JButton b4,String q){
        controller.getModel().makeButtons(q);
        quest.setText(q);/////////////////?
        b1.setText(controller.getModel().getAnswerForQuestion(0));
        b2.setText(controller.getModel().getAnswerForQuestion(1));
        b3.setText(controller.getModel().getAnswerForQuestion(2));
        b4.setText(controller.getModel().getAnswerForQuestion(3));
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
        addMoreIngridientsButton.setVisible(false);
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

    private void setAnswering(){
        if(controller.getModel().getTotalQuestions()==controller.getModel().getTestQuestionCounter()){
            button5.setText("Finish");
        }else
            button5.setText("Next question");
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
