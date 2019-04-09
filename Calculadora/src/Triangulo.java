
public class Triangulo extends Calculadora
{

	public Triangulo(float base, float altura) 
	{
		super(base, altura);
	}

	public float calcularArea() 
	{
		return (getBase() * getAltura()) / 2;
	}

}
