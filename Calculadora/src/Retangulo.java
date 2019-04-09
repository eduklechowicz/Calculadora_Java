
public class Retangulo extends Calculadora
{

	public Retangulo(float base, float altura) 
	{
		super(base, altura);
	}

	public float calcularArea()
	{
		return getBase() * getAltura();
	}

}
