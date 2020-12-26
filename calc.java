package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class calc {
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
    private JButton del;
    private double total;
    private String sy;
    static ImageIcon logo = new ImageIcon("example.jpg");
    public calc() {
        File file = new File("history.txt");
        txtdisplay.setEditable(false);
        txtdisplay.setBackground(Color.white);
        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = null;
                try {
                    BufferedReader in = new BufferedReader(new FileReader(new File("history.txt")));
                    String line;
                    try {
                        while ((line = in.readLine()) != null) {
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
                jlabel.setFont(new Font("Verdana", 1, 10));
                panel.add(jlabel);
                panel.setVisible(true);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1txt = txtdisplay.getText() + a1Button.getText();
                txtdisplay.setText(a1txt);
            }
        });
        a2button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a2txt = txtdisplay.getText() + a2button.getText();
                txtdisplay.setText(a2txt);


            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a3txt = txtdisplay.getText() + a3Button.getText();
                txtdisplay.setText(a3txt);


            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a4txt = txtdisplay.getText() + a4Button.getText();
                txtdisplay.setText(a4txt);


            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a5txt = txtdisplay.getText() + a5Button.getText();
                txtdisplay.setText(a5txt);


            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a6txt = txtdisplay.getText() + a6Button.getText();
                txtdisplay.setText(a6txt);


            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a7txt = txtdisplay.getText() + a7Button.getText();
                txtdisplay.setText(a7txt);


            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a8txt = txtdisplay.getText() + a8Button.getText();
                txtdisplay.setText(a8txt);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a9txt = txtdisplay.getText() + a9Button.getText();
                txtdisplay.setText(a9txt);
            }
        });
        a0button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a0txt = txtdisplay.getText() + a0button.getText();
                txtdisplay.setText(a0txt);
            }
        });
        pointbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dis = txtdisplay.getText() + pointbutton.getText();
                txtdisplay.setText(dis);
            }
        });
        plusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total = total + Double.parseDouble(txtdisplay.getText());
                sy = plusbutton.getText();
                txtdisplay.setText("");

            }
        });
        divisonbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total = total + Double.parseDouble(txtdisplay.getText());
                sy = divisonbutton.getText();
                txtdisplay.setText("");

            }
        });
        multibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total = total + Double.parseDouble(txtdisplay.getText());
                sy = multibutton.getText();
                txtdisplay.setText("");

            }
        });
        minusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total = total + Double.parseDouble(txtdisplay.getText());
                sy = minusbutton.getText();
                txtdisplay.setText("");

            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total = 0;
                txtdisplay.setText("");
                sy = "";
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
                        if(Double.parseDouble(txtdisplay.getText())!=0) {
                            total = total / Double.parseDouble(txtdisplay.getText());
                            txtdisplay.setText(String.valueOf(total));
                        } else{
                            txtdisplay.setText("Error:Divison by 0");
                        }
                        break;
                    case "-":
                        total = total - Double.parseDouble(txtdisplay.getText());
                        txtdisplay.setText(String.valueOf(total));
                        break;
                }
                try {
                    FileWriter in = new FileWriter(file);
                    in.write(String.valueOf(total));
                    in.close();

                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

       del.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
               if (algarismos(Double.parseDouble(txtdisplay.getText())) == 1) {
                   txtdisplay.setText("");
               }else {
                   String txt=txtdisplay.getText();
                   txt = txt.substring(0,txt.length()-1);
                   txtdisplay.setText(txt);
               }
           }
      });
    }
public static int algarismos(double num){
    String s = "" + num;
    String[] result = s.split("\\.");
        return result[0].length() + result[1].length();
}
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new calc().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        ImageIcon logo = new ImageIcon("example.png");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setIconImage(logo.getImage());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int result = JOptionPane.showConfirmDialog(frame,
                        "Do you want to Exit ?", "Exit Confirmation : ",
                        JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION)
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                else if (result == JOptionPane.NO_OPTION)
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });
    }


}
