package conexiones;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TrabajandoConMenus {



public static void main(String[] args) {

MarcoMenu marco = new MarcoMenu();



}



}



class MarcoMenu extends JFrame{



public MarcoMenu() {



setTitle("Combo Box");

setBounds(300,300,400,300);

LaminaMenu lamina = new LaminaMenu();

add(lamina);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setVisible(true);



}

}



class LaminaMenu extends JPanel{



private JLabel lblTexto;





public LaminaMenu() {



BorderLayout disp = new BorderLayout();

setLayout(disp);



//1. CREAMOS EL SOPORTE PARA EL MENU (JMENUBAR)

JMenuBar barraMenu = new JMenuBar();



//2. CREAMOS LOS MENÚS

JMenu menuArchivo = new JMenu("Archivo");

JMenu menuEdicion = new JMenu("Edición");

JMenu menuHerramientas = new JMenu("Herramientas");



//3. AGREGAMOS LOS ÍTEMS DE CADA MENU

//3.1. Crear los items del menu archivo

JMenuItem ArchivoAbrir = new JMenuItem("Abrir");

JMenuItem ArchivoGuardar = new JMenuItem("Guardar");

menuArchivo.add(ArchivoAbrir);

menuArchivo.add(ArchivoGuardar);



//3.2. Crear los items del menu edición

JMenuItem edicionCortar = new JMenuItem("Cortar");

JMenuItem edicionPegar = new JMenuItem("Pegar");

menuEdicion.add(edicionCortar);

menuEdicion.add(edicionPegar);



//3.3. Crear los items del menu herramientas

JMenuItem herramOrtografia = new JMenuItem("Ortografía");

JMenuItem herramIdioma = new JMenuItem("Idioma");

menuHerramientas.add(herramOrtografia);

menuHerramientas.add(herramIdioma);



//4. AGREGAMOS LOS MENÚS A LA BARRA DE MENÚS

barraMenu.add(menuArchivo);

barraMenu.add(menuEdicion);

barraMenu.add(menuHerramientas);



//5. AGREGAMOS LA BARRA DE MENÚ A LA LÁMINA

add(barraMenu, BorderLayout.NORTH);

}

}
