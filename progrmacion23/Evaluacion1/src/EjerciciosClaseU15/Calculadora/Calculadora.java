package EjerciciosClaseU15.Calculadora;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
Calcula calculo = new Calcula();
BotonesAsignacion botones1 = new BotonesAsignacion();
BotonesNumericos botones2 = new BotonesNumericos();
	}
}
class Calcula extends JFrame{
public Calcula() {
	setTitle("Calculadora Basica");
	setBounds(300,300,450,300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
}
}
class BotonesAsignacion extends JPanel{
	private JButton mas = new JButton("+");
	private JButton menos = new JButton("-");
	private JButton multiplicar = new JButton("*");
	private JButton dividir = new JButton("/");
	private JButton borrar = new JButton("C");
	public BotonesAsignacion() {
		add(mas);
		add(menos);
		add(multiplicar);
		add(dividir);
		add(borrar);
	}
}
class BotonesNumericos extends JPanel{
	private JButton uno = new JButton("1");
	private JButton dos = new JButton("2");
	private JButton tres = new JButton("3");
	private JButton cuatro = new JButton("4");
	private JButton cinco = new JButton("5");
	private JButton seis = new JButton("6");
	private JButton siete = new JButton("7");
	private JButton ocho = new JButton("8");
	private JButton nueve = new JButton("9");
	public BotonesNumericos() {
		add(uno);
		add(dos);
		add(tres);
		add(cuatro);
		add(cinco);
		add(seis);
		add(siete);
		add(ocho);
		add(nueve);
	}
}
