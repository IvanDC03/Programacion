package EjerciciosClaseU12;

import java.util.ArrayList;
import java.util.Collections;

public class GatoMain {

	public static void main(String[] args) {
ArrayList<Gato> gatos = new ArrayList<>();
gatos.add("Lucia",2,3455);
gatos.add("Alberto",3,3423);
gatos.add("Antonio",6,7874);
gatos.add("Jorge",7,8745);
gatos.add("Juan",8,4587);
gatos.add("Alvaro",6,1564);

System.out.println(gatos.toString());
Collections.sort(gatos);


	}

}
