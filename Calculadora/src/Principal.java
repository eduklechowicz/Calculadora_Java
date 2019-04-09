import java.util.ArrayList;

public class Principal 
{
	public static void main(String[] args) 
	{
		ArrayList <Calculadora> calculos = new ArrayList <Calculadora>();
		Calculadora c;
	
		//Calculo Quadrado
		c = new Quadrado(1,1);
		calculos.add(c);
		c = new Quadrado(2,2);
		calculos.add(c);
		c = new Quadrado(3,3);
		calculos.add(c);
	
		//Calculo Retangulo
		c = new Retangulo(1,1);
		calculos.add(c);
		c = new Retangulo(2,2);
		calculos.add(c);
		c = new Retangulo(3,3);
		calculos.add(c);
		
		//Calculo Triangulo
		c = new Triangulo(1,1);
		calculos.add(c);
		c = new Triangulo(2,2);
		calculos.add(c);
		c = new Triangulo(3,3);
		calculos.add(c);
	
		for(Calculadora x: calculos)
		{
			System.out.println("Tipo do objeto: " + x.getClass().getName());
			System.out.println("Resultado: " + x.calcularArea());
			System.out.println("-------------------------------------------");
		}
	}
}
