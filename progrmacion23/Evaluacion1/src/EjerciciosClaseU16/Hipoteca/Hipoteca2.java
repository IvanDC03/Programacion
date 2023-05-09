package EjerciciosClaseU16.Hipoteca;

import javax.swing.JFrame;

public class Hipoteca2 {
	
	public Hipoteca2(){
		Vista vista = new VistaImpl();
		Modelo modelo = new ModeloImpl();
		Controlador controlador = new ControladorImpl();
		//el modelo debe conocer a la vista
		modelo.setVista(vista);
		//la vista debe conocer al controlador y al modelo
		vista.setControlador(controlador);
		vista.setModelo(modelo);
		//el controlador debe conocer al modelo y a la vsita
		controlador.setModelo(modelo);
		controlador.setVista(vista);
		
		JFrame ventana = new JFrame("Calculo de la cuota mensual de una hipoteca");
		ventana.setContentPane(vista. getContenedor());
		ventana.pack();
		ventana.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}	
	
	public static void main(String[]args){
		new Hipoteca2();
	}
}
