import java.awt.*;
import java.awt.Component;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.event.*;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import java.awt.Dimension;

  class Calculatrice extends Frame implements ActionListener

{  //on determine la taille de texte 

    TextField ecran=new TextField(38);

    private int y=0, z=0;
    private char operation;
    private double temp,temp1,result,a;

    Button b1=new Button("On");
    Button b2=new Button("+");
    Button b3=new Button("-");
    Button b4=new Button("*");
    Button b5=new Button("/");
    Button b6=new Button("=");
    Button b7=new Button("0");
    Button b8=new Button("1");
    Button b9=new Button("2");
    Button b10=new Button("3");
    Button b11=new Button("4");
    Button b12=new Button("5");
    Button b13=new Button("6");
    Button b14=new Button("7");
    Button b15=new Button("8");
    Button b16=new Button("9");
    Button b17=new Button(".");
    Button b18=new Button("x2");
    Button b19=new Button("x3");
    Button b20=new Button("1/x");
    Button b21=new Button("sqrt");
    Button b22=new Button("sin");
    Button b23=new Button("cos");
    Button b24=new Button("tan");
    Button b25=new Button("log");
    Button b26=new Button("log10");
    Button b27=new Button("exp");
   
    FlowLayout f=new FlowLayout();
    
    Dimension dim=new Dimension(90,40);
    

    public Calculatrice(String titre){
        super(titre);
        setLayout(f);
        add(ecran);
        
        Font font = new Font("Arial", Font.BOLD,20);
        
        b1.setForeground(Color.red);b2.setForeground(Color.red);b3.setForeground(Color.red);b4.setForeground(Color.red);
        b5.setForeground(Color.red);b6.setForeground(Color.red);b18.setForeground(Color.green);b19.setForeground(Color.green);
        b20.setForeground(Color.green);b21.setForeground(Color.green);b22.setForeground(Color.green);b23.setForeground(Color.green);
        b24.setForeground(Color.green);b25.setForeground(Color.green);b26.setForeground(Color.green);b27.setForeground(Color.green);
        
        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);
        add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);add(b17);add(b18);add(b19);
        add(b20);add(b21);add(b22);add(b23);add(b24);add(b25);add(b26);add(b27);
        
        b1.addActionListener(this);b2.addActionListener(this); b3.addActionListener(this);b4.addActionListener(this);
        b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this); b8.addActionListener(this);
        b9.addActionListener(this);b10.addActionListener(this);b11.addActionListener(this); b12.addActionListener(this);
        b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this); b16.addActionListener(this);
        b17.addActionListener(this);b18.addActionListener(this);b19.addActionListener(this);b20.addActionListener(this);
        b21.addActionListener(this);b22.addActionListener(this);b23.addActionListener(this);b24.addActionListener(this);
        b25.addActionListener(this);b26.addActionListener(this);b27.addActionListener(this);
        
        b1.setPreferredSize(dim);b1.setFont(font);b2.setPreferredSize(dim);b2.setFont(font);b3.setPreferredSize(dim);b3.setFont(font);
        b4.setPreferredSize(dim);b4.setFont(font);b5.setPreferredSize(dim);b5.setFont(font);b6.setPreferredSize(dim);b6.setFont(font);
        b6.setPreferredSize(dim);b6.setFont(font);b7.setPreferredSize(dim);b7.setFont(font);b8.setPreferredSize(dim);b8.setFont(font);
        b9.setPreferredSize(dim);b9.setFont(font);b10.setPreferredSize(dim);b10.setFont(font);b11.setPreferredSize(dim);b11.setFont(font);
        b12.setPreferredSize(dim);b12.setFont(font);b13.setPreferredSize(dim);b13.setFont(font);b14.setPreferredSize(dim);b14.setFont(font);
        b15.setPreferredSize(dim);b15.setFont(font);b16.setPreferredSize(dim);b16.setFont(font);b17.setPreferredSize(dim);b17.setFont(font);
        b18.setPreferredSize(dim);b18.setFont(font);b19.setPreferredSize(dim);b19.setFont(font);b20.setPreferredSize(dim);b20.setFont(font);
        b21.setPreferredSize(dim);b21.setFont(font);b22.setPreferredSize(dim);b22.setFont(font);b23.setPreferredSize(dim);b23.setFont(font);
        b24.setPreferredSize(dim);b24.setFont(font);b25.setPreferredSize(dim);b25.setFont(font);b26.setPreferredSize(dim);b26.setFont(font);
        b27.setPreferredSize(dim);b27.setFont(font);

     }
    
    public void actionPerformed(ActionEvent e){ 
       ecran.setFont(new Font("DIALOG",Font.LAYOUT_RIGHT_TO_LEFT+Font.BOLD,20));                                   //actionPerformed(ActionEvent e) tres important
   
       if (e.getSource()==b1) {
                ecran.setText("");
        }
       if (e.getSource()==b2) {
               temp = Double.parseDouble(ecran.getText());
               operation = '+';
               ecran.setText("");
      }
       if (e.getSource()==b3) {
               temp = Double.parseDouble(ecran.getText());
               operation = '-';
               ecran.setText("");
      }
       if (e.getSource()==b4) {
               temp = Double.parseDouble(ecran.getText());
               operation = '*';
               ecran.setText("");
      }
       if (e.getSource()==b5) {
               temp = Double.parseDouble(ecran.getText());
               operation = '/';
               ecran.setText("");
      }
       
       if (e.getSource()==b7) {
            if (z == 0) {
                ecran.setText(ecran.getText() + "0");
            } else {
                ecran.setText("");
                ecran.setText(ecran.getText() + "0");
                z = 0;
            }
        }
       if (e.getSource()==b8) {
            if (z == 0) {
                ecran.setText(ecran.getText() + "1");
            } else {
                ecran.setText("");
                ecran.setText(ecran.getText() + "1");
                z = 0;
            }
        }
       if (e.getSource()==b9) {
            if (z == 0) {
                ecran.setText(ecran.getText() + "2");
            } else {
                ecran.setText("");
                ecran.setText(ecran.getText() + "2");
                z = 0;
            }
        }
       if (e.getSource()==b10) {
            if (z == 0) {
                ecran.setText(ecran.getText() + "3");
            } else {
                ecran.setText("");
                ecran.setText(ecran.getText() + "3");
                z = 0;
            }
        }
       if (e.getSource()==b11) {
            if (z == 0) {
                ecran.setText(ecran.getText() + "4");
            } else {
                ecran.setText("");
                ecran.setText(ecran.getText() + "4");
                z = 0;
            }
        }
       if (e.getSource()==b12) {
            if (z == 0) {
                ecran.setText(ecran.getText() + "5");
            } else {
                ecran.setText("");
                ecran.setText(ecran.getText() + "5");
                z = 0;
            }
        }
       if (e.getSource()==b13) {
            if (z == 0) {
                ecran.setText(ecran.getText() + "6");
            } else {
                ecran.setText("");
                ecran.setText(ecran.getText() + "6");
                z = 0;
            }
        }
       if (e.getSource()==b14) {
            if (z == 0) {
                ecran.setText(ecran.getText() + "7");
            } else {
                ecran.setText("");
                ecran.setText(ecran.getText() + "7");
                z = 0;
            }
        }
       if (e.getSource()==b15) {
            if (z == 0) {
                ecran.setText(ecran.getText() + "8");
            } else {
                ecran.setText("");
                ecran.setText(ecran.getText() + "8");
                z = 0;
            }
        }
       if (e.getSource()==b16) {
            if (z == 0) {
                ecran.setText(ecran.getText() + "9");
            } else {
                ecran.setText("");
                ecran.setText(ecran.getText() + "9");
                z = 0;
            }
        }
       if (e.getSource()==b17) {
            if (y == 0) {
                ecran.setText(ecran.getText() + ".");
                y = 1;
            } else {
                ecran.setText(ecran.getText());
            }
        }
       
       if (e.getSource()==b18) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                a = Math.pow(Double.parseDouble(ecran.getText()), 2);
                ecran.setText("");
                ecran.setText(ecran.getText() + a);
            }
        }
       if (e.getSource()==b19) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                a = Math.pow(Double.parseDouble(ecran.getText()), 3);
                ecran.setText("");
                ecran.setText(ecran.getText() + a);
            }
        }
       if (e.getSource()==b20) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                a = 1 / Double.parseDouble(ecran.getText());
                ecran.setText("");
                ecran.setText(ecran.getText() + a);
            }
        }
      if (e.getSource()==b21) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                a = Math.sqrt(Double.parseDouble(ecran.getText()));
                ecran.setText("");
                ecran.setText(ecran.getText() + a);
            }
        }
           
      if (e.getSource()==b22) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                a = Math.sin(Double.parseDouble(ecran.getText()));
                ecran.setText("");
                ecran.setText(ecran.getText() + a);
            }
        }
        if (e.getSource()==b23) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                a = Math.cos(Double.parseDouble(ecran.getText()));
                ecran.setText("");
                ecran.setText(ecran.getText() + a);
            }
        }
        if (e.getSource()==b24) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                a = Math.tan(Double.parseDouble(ecran.getText()));
                ecran.setText("");
                ecran.setText(ecran.getText() + a);
            }
        }
        if (e.getSource()==b25) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                a = Math.log(Double.parseDouble(ecran.getText()));
                ecran.setText("");
                ecran.setText(ecran.getText() + a);
            }
        }
        if (e.getSource()==b26) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                a = Math.log10(Double.parseDouble(ecran.getText()));
                ecran.setText("");
                ecran.setText(ecran.getText() + a);
            }
        }
      if (e.getSource()==b27) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                a = Math.exp(Double.parseDouble(ecran.getText()));
                ecran.setText("");
                ecran.setText(ecran.getText() + a);
            }
        }
      
       if (e.getSource()==b6) {
            if (ecran.getText().equals("")) {
                ecran.setText("");
            } else {
                temp1 = Double.parseDouble(ecran.getText());
                switch (operation) {
                    case '+':
                        result = temp + temp1;
                        break;
                    case '-':
                        result = temp - temp1;
                        break;
                    case '/':
                        result = temp / temp1;
                        break;
                    case '*':
                        result = temp * temp1;
                        break;
                }
                ecran.setText("");
                ecran.setText(ecran.getText() + result);
                z=1;
                
            }
           }
          }
         }
   
public class MiniProjet{
    public static void main(String[] args){
       Calculatrice= new Calculatrice("Calculatrice scientifique");
       p.setSize(490, 350);
       p.setResizable(false);
       p.setVisible(true);
    }
}
