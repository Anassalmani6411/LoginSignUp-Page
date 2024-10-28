import java.awt.*;
class Login
{
Frame f1;
Label l1,l2,l3,l4,l5;
Button b1, b2;
TextField t1,t2, t3, t4,t5;
Login()
{
f1=new Frame();
f1.setSize(500,500);
l1=new Label("Name");
l2=new Label("Pass");
l4=new Label("Subject");
l5=new Label("Koren");
b1=new Button("Login");
b2=new Button("SignUp");
l3=new Label("Course");
t1=new TextField("");
t2=new TextField("");
t3=new TextField("");
t4=new TextField("");
t5=new TextField("");
l1.setBounds(100,100,100,30);
l3.setBounds(100,150,100,30);
l2.setBounds(100,200,100,30);
l4.setBounds(100,250,100,30);
l5.setBounds(100,280,100,30);
b1.setBounds(150,360,100,30);
b2.setBounds(150,400,100,30);
t1.setBounds(250,100,100,30);
t3.setBounds(250,150,100,30);
t2.setBounds(250,200,100,30);
t4.setBounds(250,250,100,30);
t5.setBounds(250,300,100,30);
f1.add(l1);
f1.add(l2);
f1.add(t1);
f1.add(l4);
f1.add(t2);
f1.add(t5);
f1.add(l5);
f1.add(b1);
f1.add(b2);
f1.add(t3);
f1.add(t4);
f1.add(l3);
f1.setLayout(null);
f1.setVisible(true);
}
public static void main(String  arg[])
{
new Login();
}
}


