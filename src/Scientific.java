import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class Scientific {

    private JTextField textField1;
    private JButton cosButton1;
    private JButton ACButton;
    private JButton CEButton;
    private JButton tanButton1;
    private JButton button5;
    private JButton logButton;
    private JButton degButton;
    private JButton radButton;
    private JButton lnButton;
    private JButton a10XButton;
    private JButton xButton;
    private JButton sinButton1;
    private JButton sinButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton a2XButton;
    private JButton cosButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton xYButton;
    private JButton DELButton;
    private JButton tanButton;
    private JButton button27;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton ANSButton;
    private JPanel Calculator;

    double a,b,c,result,ans;
    String op,angle,r;

    public Scientific() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"0");
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"00");
            }
        });
        button27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               a = Double.parseDouble(textField1.getText());
               textField1.setText("+");
               op="+";
            }
        });
        button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("-");
                op="-";
            }
        });
        button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("*");
                op="*";
            }
        });
        button34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("/");
                op="/";
            }

        });

        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("sin");
                angle = textField1.getText().substring(3,textField1.getText().length());
                op = "s";
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("cos");
                angle = textField1.getText().substring(3,textField1.getText().length());
                op = "c";
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("tan");
                angle = textField1.getText().substring(3,textField1.getText().length());
                op = "t";
            }
        });
        sinButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("sin⁻¹");
                angle = textField1.getText().substring(3,textField1.getText().length());
                op = "s1";
            }
        });
        cosButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("cos⁻¹");
                angle = textField1.getText().substring(3,textField1.getText().length());
                op = "c1";
            }
        });
        tanButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("tan⁻¹");
                angle = textField1.getText().substring(3,textField1.getText().length());
                op = "t1";
            }
        });
        DELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().length()>0)
                textField1.setText(textField1.getText().substring(0,textField1.getText().length()-1));
            }
        });

        ANSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="+"){
                    String s = textField1.getText();
                    b = Double.parseDouble(s.substring(1,s.length()));
                    textField1.setText(String.valueOf(a+b));
                }
                if(op=="-"){
                    String s = textField1.getText();
                    b = Double.parseDouble(s.substring(1,s.length()));
                    textField1.setText(String.valueOf(a-b));
                }
                if(op=="*"){
                    String s = textField1.getText();
                    b = Double.parseDouble(s.substring(1,s.length()));
                    textField1.setText(String.valueOf(a*b));
                }
                if(op=="/"){
                    String s = textField1.getText();
                    b = Double.parseDouble(s.substring(1,s.length()));
                    textField1.setText(String.valueOf(a/b));
                }
                if(op=="%"){
                    String s = textField1.getText();
                    b = Double.parseDouble(s.substring(1,s.length()));
                    textField1.setText(String.valueOf(a%b));
                }
                if(op=="s"){
                    double deg = Double.parseDouble(textField1.getText().substring(3,textField1.getText().length()));
                    if(r!="r") {
                        deg = Math.toRadians(deg);
                    }
                    textField1.setText(String.valueOf(Math.sin(deg)));
                }
                if(op=="c"){
                    double deg = Double.parseDouble(textField1.getText().substring(3,textField1.getText().length()));
                    if(r!="r") {
                        deg = Math.toRadians(deg);
                    }
                    textField1.setText(String.valueOf(Math.cos(deg)));
                }
                if(op=="t"){
                    double deg = Double.parseDouble(textField1.getText().substring(3,textField1.getText().length()));
                    if(r!="r") {
                        deg = Math.toRadians(deg);
                    }
                    textField1.setText(String.valueOf(Math.tan(deg)));
                }
                if(op=="s1"){

                    double deg = Double.parseDouble(textField1.getText().substring(5,textField1.getText().length()));
                    if(deg>=-1 && deg<=1) {
                        if(r!="r") {
                            ans = Math.asin(deg);
                            textField1.setText(String.valueOf(Math.toDegrees(ans)));
                        }else {
                            textField1.setText(String.valueOf(Math.asin(deg)));
                        }
                    }
                    else
                        textField1.setText("Math error");
                }
                if(op=="c1"){

                    double deg = Double.parseDouble(textField1.getText().substring(5,textField1.getText().length()));
                    if(deg>=-1 && deg<=1) {
                        if(r!="r") {
                            ans = Math.acos(deg);
                            textField1.setText(String.valueOf(Math.toDegrees(ans)));
                        }else {
                            textField1.setText(String.valueOf(Math.acos(deg)));
                        }
                    }
                    else
                        textField1.setText("Math error");
                }
                if(op=="t1"){

                    double deg = Double.parseDouble(textField1.getText().substring(5,textField1.getText().length()));
                    if(deg>=-1 && deg<=1) {
                        if(r!="r") {
                            ans = Math.atan(deg);
                            textField1.setText(String.valueOf(Math.toDegrees(ans)));
                        }else {
                            textField1.setText(String.valueOf(Math.atan(deg)));
                        }
                    }
                    else
                        textField1.setText("Math error");
                }
                if(op=="2pow"){
                    double d = Double.parseDouble(textField1.getText().substring(2,textField1.getText().length()));
                    textField1.setText(String.valueOf(Math.pow(2,d)));
                }
                if(op=="^"){
                    int i = textField1.getText().indexOf('^');
                    double f = Double.parseDouble(textField1.getText().substring(0,i));
                    double d = Double.parseDouble(textField1.getText().substring(i+1,textField1.getText().length()));
                    textField1.setText(String.valueOf(Math.pow(f,d)));
                }
                if(op=="!"){
                    if(textField1.getText().length()>0) {

                        int num = Integer.parseInt(textField1.getText().substring(0, textField1.getText().length() - 1));
                        int ans = 1;
                        for (int i = 1; i <= num; i++) {
                            ans *= i;
                        }
                        textField1.setText(String.valueOf(ans));
                    }
                }
                if(op=="10pow"){
                    double pow = Double.parseDouble(textField1.getText().substring(3,textField1.getText().length()));
                    textField1.setText(String.valueOf(Math.pow(10,pow)));
                }
                if(op=="ln"){
                    double val = Double.parseDouble(textField1.getText().substring(2,textField1.getText().length()));
                    textField1.setText(String.valueOf(Math.log(val)));
                }
                if(op=="log"){
                    double val = Double.parseDouble(textField1.getText().substring(3,textField1.getText().length()));
                    double ans = Math.log(val)/2.3025850929940456840179914546844;
                    textField1.setText(String.valueOf(ans));
                }

            }
        });

        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().substring(0,1));
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        a2XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("2^");
                op="2pow";
            }
        });
        xYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().length()>0){
                    textField1.setText(textField1.getText()+"^");
                    op="^";
                }
            }
        });

        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"!");
                op="!";

            }
        });
        a10XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("10^");
                op="10pow";
            }
        });


        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("ln");
                op="ln";
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("%");
                op="%";
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("log");
                op="log";
            }
        });
        radButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               r = "r";
            }
        });
        degButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r="d";
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scientific");
        frame.setContentPane(new Scientific().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
