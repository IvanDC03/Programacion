package EjerciciosClaseU12;

public class Principal {

	public static void main(String[] args) {
A objetoA = new A();
B objetoB = new B();
C objetoC = new C();
D objetoD = new D();
E objetoE = new E();
System.out.println("*** Objeto a ***");
objetoA.metodoA();
System.out.println("*** Objeto b ***");
objetoB.metodoB();
objetoB.metodoA();
System.out.println("*** Objeto c ***");
objetoC.metodoC();
objetoC.metodoB();
objetoC.metodoA();
System.out.println("*** Objeto d ***");
objetoD.metodoD();
objetoD.metodoB();
objetoD.metodoA();
System.out.println("*** Objeto e ***");
objetoE.metodoE();
	}

}
