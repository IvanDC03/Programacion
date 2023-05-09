package EjerciciosClaseU16.Hipoteca;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.*;

public class VistaImpl implements Vista {
	private Modelo modelo;
	private Controlador controlador;
	//Componenetes graficos
	private Container contenedor;
	private JTextField jtfCantidad;
	private JTextField jtfTiempo;
	private JTextField jtfInteres;
	private JLabel jlCuota;
	
	public VistaImpl(){
		super();
		creaGUI();
	}
	private void creaGUI(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					contenedor = new Container();
					contenedor.setLayout(new BorderLayout());
					JPanel jpDatos = new JPanel();
					jpDatos.add(new JLabel("Cantidad: "));
					jtfCantidad = new JTextField(8);
					jpDatos.add(jtfCantidad);
					jpDatos.add(new Label("Años: "));
					jtfTiempo = new JTextField(3);
					jpDatos.add(jtfTiempo);
					jpDatos.add(new Label("Interes: "));
					jtfInteres = new JTextField(5);
					jpDatos.add(jtfInteres);
					JButton jbCalcula = new JButton("Calcula");
					jbCalcula.addActionListener(new Escuchador());
					jpDatos.add(jbCalcula);
					contenedor.add(jpDatos, BorderLayout.NORTH);
					jlCuota = new JLabel("Cuota mensual: ");
					JPanel jpCuota = new JPanel();
					jpCuota.add(jlCuota);
					contenedor.add(jpCuota);
				}
			});
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		catch(InvocationTargetException e){
			e.printStackTrace();
		}
	}
	public Container getContenedor(){
		return contenedor;
	}
	public void setModelo(Modelo modelo){
		this.modelo = modelo;
	}
	public void setControlador(Controlador controlador){
		this.controlador = controlador;
	}
	private class Escuchador implements ActionListener{
		public void actionPerformed(ActionEvent e){
			controlador.solicitadoCalculo();
		}
	}
	public double getCantidad(){
		return Double.parseDouble(jtfCantidad.getText());
	}
	public int getTiempo(){
		return Integer.parseInt(jtfTiempo.getText());
	}
	public double getInteres(){
		return Double.parseDouble(jtfInteres.getText());
	}
	public void cuotaActualizada(){
		String cuota = String.format("Cuota mensual: %.2f", modelo.getCuota());
		jlCuota.setText(cuota);
	}
}
