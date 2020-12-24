package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class calc {
    File file=new File("history.txt");
    private JPanel mainpanel;
    private JButton a0button;
    private JTextField txtdisplay;
    private JButton a1Button;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a2button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton pointbutton;
    private JButton clearButton;
    private JButton plusbutton;
    private JButton minusbutton;
    private JButton divisonbutton;
    private JButton multibutton;
    private JButton equalbutton;
    private JButton historyButton;
    private  double total;
    private String sy;
     static ImageIcon logo= new ImageIcon("example.jpg");
    public calc() {








        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = null;
                try {
                    BufferedReader in = new BufferedReader(new FileReader(new File("history.txt")));
                    String line;
                    try {
                        while((line = in.readLine())!= null){
                            text = text + line;
                        }
                        in.close();
                    } catch (IOException f) {
                        f.printStackTrace();
                    }
                } catch (FileNotFoundException f) {
                    f.printStackTrace();
                }
                String textToDisplay = text;
                JPanel panel = new JPanel();
                JLabel jlabel = new JLabel(textToDisplay);
                jlabel.setFont(new Font("Verdana",1,10));
                panel.add(jlabel);
                panel.setVisible(true);
            }
        });


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1txt=txtdisplay.getText()+a1Button.getText();
                txtdisplay.setText(a1txt);
            }
        });
        a2button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a2txt=txtdisplay.getText()+a2button.getText();
                txtdisplay.setText(a2txt);


            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a3txt=txtdisplay.getText()+a3Button.getText();
                txtdisplay.setText(a3txt);


            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a4txt=txtdisplay.getText()+a4Button.getText();
                txtdisplay.setText(a4txt);


            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a5txt=txtdisplay.getText()+a5Button.getText();
                txtdisplay.setText(a5txt);


            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a6txt=txtdisplay.getText()+a6Button.getText();
                txtdisplay.setText(a6txt);


            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a7txt=txtdisplay.getText()+a7Button.getText();
                txtdisplay.setText(a7txt);


            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a8txt=txtdisplay.getText()+a8Button.getText();
                txtdisplay.setText(a8txt);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a9txt=txtdisplay.getText()+a9Button.getText();
                txtdisplay.setText(a9txt);
            }
        });
        a0button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a0txt=txtdisplay.getText()+a0button.getText();
                txtdisplay.setText(a0txt);
            }
        });
        pointbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dis=txtdisplay.getText()+pointbutton.getText();
                txtdisplay.setText(dis);
            }
        });
        plusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total=total+Double.parseDouble(txtdisplay.getText());
                sy=plusbutton.getText();
                txtdisplay.setText("");

            }
        });
        divisonbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total=total+Double.parseDouble(txtdisplay.getText());
                sy=divisonbutton.getText();
                txtdisplay.setText("");

            }
        });
        multibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total=total+Double.parseDouble(txtdisplay.getText());
                sy= multibutton.getText();
                txtdisplay.setText("");

            }
        });
        minusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total=total+Double.parseDouble(txtdisplay.getText());
                sy=minusbutton.getText();
                txtdisplay.setText("");

            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total=0;
                txtdisplay.setText("");
                sy="";
            }
        });
        equalbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (sy) {
                    case "+":
                    total = total + Double.parseDouble(txtdisplay.getText());
                    txtdisplay.setText(String.valueOf(total));
                    break;
                    case "*":
                        total = total * Double.parseDouble(txtdisplay.getText());
                        txtdisplay.setText(String.valueOf(total));
                        break;
                    case "/":
                        total = total / Double.parseDouble(txtdisplay.getText());
                        txtdisplay.setText(String.valueOf(total));
                        break;
                    case "-":
                        total = total - Double.parseDouble(txtdisplay.getText());
                        txtdisplay.setText(String.valueOf(total));
                        break;
                }
               try {
                   FileWriter in=new FileWriter(file);
                    in.write(String.valueOf(total));
                    in.close();

               }
             catch (IOException ioException) {
                   ioException.printStackTrace();
               }
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new calc().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        ImageIcon logo= new ImageIcon("example.png");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,300);
        frame.setIconImage(logo.getImage());
    }


}
