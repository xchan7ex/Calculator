import java.awt.*;
import  java.awt.event.*;

class Mycalc extends WindowAdapter implements ActionListener {
    Frame frame;
    Label label_1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button badd,bsub,bmul,bdiv,bmod,bdot,beql;
    Button bcle,bbac,bchs;
    double num1,num2, anwser,check;

    Mycalc(){
        frame = new Frame("My Calculator");
        label_1 = new Label();
        label_1.setBackground(Color.gray);
        label_1.setBounds(50,50,260,60);

        b1=new Button("1");
        b1.setBounds(50,340,50,50);
        b2=new Button("2");
        b2.setBounds(120,340,50,50);
        b3=new Button("3");
        b3.setBounds(190,340,50,50);
        b4=new Button("4");
        b4.setBounds(50,270,50,50);
        b5=new Button("5");
        b5.setBounds(120,270,50,50);
        b6=new Button("6");
        b6.setBounds(190,270,50,50);
        b7=new Button("7");
        b7.setBounds(50,200,50,50);
        b8=new Button("8");
        b8.setBounds(120,200,50,50);
        b9=new Button("9");
        b9.setBounds(190,200,50,50);
        b0=new Button("0");
        b0.setBounds(120,410,50,50);
        bchs=new Button("+/-");
        bchs.setBounds(50,410,50,50);
        bdot=new Button(".");
        bdot.setBounds(190,410,50,50);
        bbac=new Button("back");
        bbac.setBounds(120,130,50,50);

        badd=new Button("+");
        badd.setBounds(260,340,50,50);
        bsub=new Button("-");
        bsub.setBounds(260,270,50,50);
        bmul=new Button("*");
        bmul.setBounds(260,200,50,50);
        bdiv=new Button("/");
        bdiv.setBounds(260,130,50,50);
        bmod=new Button("%");
        bmod.setBounds(190,130,50,50);
        beql=new Button("=");
        beql.setBounds(245,410,65,50);
        bcle=new Button("CE");
        bcle.setBounds(50,130,65,50);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        bdot.addActionListener(this);
        bchs.addActionListener(this);
        bbac.addActionListener(this);

        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        beql.addActionListener(this);
        bcle.addActionListener(this);

        frame.addWindowListener(this);



        frame.add(label_1);
        frame.add(b1); frame.add(b2); frame.add(b3); frame.add(b4); frame.add(b5); frame.add(b6); frame.add(b7);
        frame.add(b8); frame.add(b9); frame.add(b0);

        frame.add(badd); frame.add(bsub); frame.add(bmod); frame.add(bmul); frame.add(bdiv); frame.add(bmod);
        frame.add(beql);

        frame.add(bcle); frame.add(bdot); frame.add(bchs); frame.add(bbac);

        frame.setSize(360,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        frame.dispose();
    }

    public void actionPerformed (ActionEvent e) {
        String temp_var_1,temp_var_2 ;

        if (e.getSource() == b0){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + "0";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == b1){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + "1";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == b2){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + "2";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == b3){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + "3";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == b4){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + "4";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == b5){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + "5";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == b6){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + "6";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == b7){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + "7";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == b8){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + "8";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == b9){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + "9";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == bdot){
            temp_var_1 = label_1.getText();
            temp_var_2 = temp_var_1 + ".";
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == bchs){
            temp_var_1 = label_1.getText();
            temp_var_2 = "-" + temp_var_1 ;
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == bbac){
            try {
                temp_var_1 = label_1.getText();
                temp_var_2 = temp_var_1.substring(0,temp_var_1.length()-1);
            }catch (IndexOutOfBoundsException f){return;}
            label_1.setText(temp_var_2);
        }
        if (e.getSource() == badd){
            try{
                num1 = Double.parseDouble(label_1.getText());
            }catch (NumberFormatException f){
                label_1.setText("Invalid Format");
                return;
            }
            temp_var_2="";
            label_1.setText(temp_var_2);
            check = 1;
        }
        if (e.getSource() == bsub){
            try{
                num1 = Double.parseDouble(label_1.getText());
            }catch (NumberFormatException f){
                label_1.setText("Invalid Format");
                return;
            }
            temp_var_2="";
            label_1.setText(temp_var_2);
            check = 2;
        }
        if (e.getSource() == bmul){
            try{
                num1 = Double.parseDouble(label_1.getText());
            }catch (NumberFormatException f){
                label_1.setText("Invalid Format");
                return;
            }
            temp_var_2="";
            label_1.setText(temp_var_2);
            check = 3;
        }
        if (e.getSource() == bdiv){
            try{
                num1 = Double.parseDouble(label_1.getText());
            }catch (NumberFormatException f){
                label_1.setText("Invalid Format");
                return;
            }
            temp_var_2="";
            label_1.setText(temp_var_2);
            check = 4;
        }
        if (e.getSource() == bmod){
            try{
                num1 = Double.parseDouble(label_1.getText());
            }catch (NumberFormatException f){
                label_1.setText("Invalid Format");
                return;
            }
            temp_var_2="";
            label_1.setText(temp_var_2);
            check = 5;
        }
        if (e.getSource() == beql){
            try {
                num2 = Double.parseDouble(label_1.getText());
            }catch (Exception f){
                label_1.setText("Enter a number first");
                return;
            }
            if (check == 1){
                anwser = num1 + num2;
            }
            if (check == 2){
                anwser = num1 - num2;
            }
            if (check == 3){
                anwser = num1 * num2;
            }
            if (check == 4){
                anwser = num1 / num2;
            }
            if (check == 5){
                anwser = num1 % num2;
            }
            label_1.setText(String.valueOf(anwser));
        }
        if(e.getSource()==bcle){
            num1=0;
            num2=0;
            check=0;
            anwser=0;
            temp_var_2="";
            label_1.setText(temp_var_2);
        }
    }

    public static void main(String[] args){
        new Mycalc();
    }
}