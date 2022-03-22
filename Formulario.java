import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener, ChangeListener {
	
	private JTextField tf1, tf2;
	private ButtonGroup bg;
	private JRadioButton uno,dos;
	private JButton b1;
	private int resultado;

	public Formulario()
	{
		setLayout(null);
		tf1 = new JTextField("0");
		tf1.setBounds(20,20,120,50);
		add(tf1);
		tf2 = new JTextField("0");
		tf2.setBounds(140,20,120,50);
		add(tf2);
		bg = new ButtonGroup();
		uno = new JRadioButton("Sumar");
		uno.setBounds(1,80,100,35);
		uno.addChangeListener(this);
		add(uno);
		bg.add(uno);
		dos = new JRadioButton("Restar");
		dos.setBounds(1,135,100,35);
		dos.addChangeListener(this);
		add(dos);
		bg.add(dos);
		b1 = new JButton ("...");
		b1.setBounds(200,300,100,50);
		add(b1);
		b1.addActionListener(this);
		
		
	}
	
	public void stateChanged (ChangeEvent e)
	{
		String a = "";
		String b = "";
		int cad1 = 0;
		int cad2 = 0;
		a = tf1.getText();
		 cad1 = Integer.parseInt(a);
		 b = tf2.getText();
		 cad2 = Integer.parseInt(b);

		if(uno.isSelected () == true)
		{
		 resultado = cad1 + cad2;
         b1.setText("Sumar");
		}
		
		if(dos.isSelected()==true)
		{
			resultado = cad1 - cad2;
		b1.setText("Restar");
		}
		
		
	
	}
	
	public void actionPerformed (ActionEvent e)
	{
		String x = "";
		if (e.getSource()==b1)
		{
		    x = String.valueOf(resultado);
			setTitle(x);
		}
	}
	public static void main (String[]ar)
	{
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(15,15,600,400);
		formulario1.setVisible(true);
	}
}
