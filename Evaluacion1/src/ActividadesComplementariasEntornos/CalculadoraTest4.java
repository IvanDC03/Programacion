package ActividadesComplementariasEntornos;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import EjerciciosClaseU3.Calculadora;


@RunWith(Parameterized.class)
public class CalculadoraTest4 {
	
private int num1;


public CalculadoraTest4(int num1, int num2, int result) {
	int num11=0,num21=0,result1=0;
		this.num1 = num11;
		this.num1 = num21;
		this.num1 = result1;
	}
@Parameters
public static Collection<Object[]>numeros(){
	return Arrays.asList(new Object[][]{{20,10,2},{30,-2,-15},
		{5,2,3}});
	}

@Test
public void testDivide() {
	Calculadora calcu = new Calculadora();
	int resultado = calcu.divide();
	assertEquals(resultado, resultado);
}

}


