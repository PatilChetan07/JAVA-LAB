import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class A_StudentForm implements ActionListener {
    JFrame frame = new JFrame();
    JButton b1 = new JButton("Submit");

    Label l1 = new Label("Name");
    Label l2 = new Label("Mobile No");
    Label l3 = new Label("Gender");
    Label l4 = new Label("Age");
    Label l5 = new Label("Hobbies");

    TextField t1 = new TextField();
    TextField t2 = new TextField();

    JRadioButton rb1 = new JRadioButton("Male");
    JRadioButton rb2 = new JRadioButton("Female");

    String age [] = {"18","19","20","21","22"};
   JComboBox cb = new JComboBox(age);

   JCheckBox cb1 = new JCheckBox("Sports");
   JCheckBox cb2 = new JCheckBox("Study");
   JCheckBox cb3 = new JCheckBox("Sleep");

   JTextArea area = new JTextArea();

    A_StudentForm(){
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,140,100,20);
        l3.setBounds(50,180,100,20);
        l4.setBounds(50,220,100,20);
        l5.setBounds(50,260,100,20);

        t1.setBounds(200,100,100,20);
        t2.setBounds(200,140,100,20);

        rb1.setBounds(200,180,100,20);
        rb2.setBounds(300,180,100,20);

        cb.setBounds(200,220,100,20);

        cb1.setBounds(200,260,100,20);
        cb2.setBounds(200,300,100,20);
        cb3.setBounds(200,340,100,20);

        b1.setBounds(50,400,150,30);
        b1.addActionListener(this);

        area.setBounds(300,300,300,100);

        frame.add(l1);      frame.add(l2);      frame.add(l3);      frame.add(l4);      frame.add(l5);
        frame.add(t1);      frame.add(t2);
        frame.add(rb1);     frame.add(rb2);
        frame.add(cb);
        frame.add(cb1);     frame.add(cb2);     frame.add(cb3);
        frame.add(b1);
        frame.add(area);

        frame.setTitle("Student Form");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String name = t1.getText();
        String mobile = t2.getText();
        String gender = rb1.isSelected() ? "Male" : rb2.isSelected() ? "Female" : "-";

        String  age = cb.getItemAt(cb.getSelectedIndex()).toString();
        String hobby = "";

        if(cb1.isSelected()){
            hobby="Sports";
        }

        if(cb2.isSelected()){
            hobby=hobby+" "+" Study ";
        }

        if(cb3.isSelected()){
            hobby=hobby+" "+" Sleep ";
        }

        area.setText("Name:"+name+"\n"+"Mobile number :"+mobile+"\n"+"Gender :"+gender+"\n"+"Age :"+age+"\n"+"Hobbies :"+hobby);
    }

    public static void main(String[] args) {
        new A_StudentForm();
    }
}
