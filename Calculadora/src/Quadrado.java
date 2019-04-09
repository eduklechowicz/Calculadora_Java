
public class Quadrado extends Calculadora
{
	public Quadrado(float base, float altura)
	{
		super(base, altura);	
	}

	public float calcularArea()
	{	
		return getBase() * getAltura();
	}
	
}
