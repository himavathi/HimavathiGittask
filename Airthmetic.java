import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Airthmetic implements ActionListener
{
Frame f;
Button b1,b2,b3,b4,b5;
Airthmetic()
{
f=new Frame("airthmetic operations");
f.setVisible(true);
f.setSize(300,200);
f.setLayout(new FlowLayout());
b1=new Button("add");
b2=new Button("sub");
b3=new Button("mulyiply");
b4=new Button("division");
b5=new Button("cancel");
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent o)
{
if(o.getSource().equals(b1))
{
new Add(f);
}
else if(o.getSource().equals(b2))
{
new Sub(f);
}
else if(o.getSource().equals(b3))
{
new Mul(f);
}
else if(o.getSource().equals(b4))
{
new Div(f);
}
else
{
f.setVisible(false);
}
}
public static void main(String...x)
{
new Airthmetic();
}
}
class Add implements ActionListener
{
Frame g,h;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2;
Add(Frame p)
{
h=p;
h.setVisible(false);
g=new Frame("addition");
l1=new Label("enter the value of a");
l2=new Label("enter the value of b");
l3=new Label("the result is");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("add");
b2=new Button("home");
g.setVisible(true);
g.setSize(200,200);
g.setLayout(new FlowLayout());
g.add(l1);
g.add(t1);
g.add(l2);
g.add(l2);
g.add(t2);
g.add(b1);
g.add(l3);
g.add(t3);
g.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent kk)
{
if(kk.getSource().equals(b1))
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=a+b;
t3.setText(String.valueOf(c));
}
else
{
g.setVisible(false);
h.setVisible(true);
}
}
}
class Sub implements ActionListener
{
Frame g,h;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2;
Sub(Frame p)
{
h=p;
h.setVisible(false);
g=new Frame("subraction");
l1=new Label("enter the value of a");
l2=new Label("enter the value of b");
l3=new Label("the result is");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("sub");
b2=new Button("home");
g.setVisible(true);
g.setSize(200,200);
g.setLayout(new FlowLayout());
g.add(l1);
g.add(t1);
g.add(l2);
g.add(l2);
g.add(t2);
g.add(b1);
g.add(l3);
g.add(t3);
g.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent hh)
{
if(hh.getSource().equals(b1))
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=a-b;
t3.setText(String.valueOf(c));
}
else
{
g.setVisible(false);
h.setVisible(true);
}
}
}
class Mul implements ActionListener
{
Frame g,h;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2;
Mul(Frame p)
{
h=p;
h.setVisible(false);
g=new Frame("multiplication");
l1=new Label("enter the value of a");
l2=new Label("enter the value of b");
l3=new Label("the result is");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("mul");
b2=new Button("home");
g.setVisible(true);
g.setSize(200,200);
g.setLayout(new FlowLayout());
g.add(l1);
g.add(t1);
g.add(l2);
g.add(l2);
g.add(t2);
g.add(b1);
g.add(l3);
g.add(t3);
g.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ll)
{
if(ll.getSource().equals(b1))
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=a*b;
t3.setText(String.valueOf(c));
}
else
{
g.setVisible(false);
h.setVisible(true);
}
}
}
class Div implements ActionListener
{
Frame g,h;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2;
Div(Frame p)
{
h=p;
h.setVisible(false);
g=new Frame("division");
l1=new Label("enter the value of a");
l2=new Label("enter the value of b");
l3=new Label("the result is");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("div");
b2=new Button("home");
g.setVisible(true);
g.setSize(200,200);
g.setLayout(new FlowLayout());
g.add(l1);
g.add(t1);
g.add(l2);
g.add(l2);
g.add(t2);
g.add(b1);
g.add(l3);
g.add(t3);
g.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent bb)
{
if(bb.getSource().equals(b1))
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
try
{
if(b==0)
{
throw new Exception("number format exception");
}
else
{
int c=a/b;
t3.setText(String.valueOf(c));
}
}
catch(Exception ee)
{
JOptionPane.showMessageDialog(null,"exception is handled");
}
}
else
{
g.setVisible(false);
h.setVisible(true);
}
}
}






