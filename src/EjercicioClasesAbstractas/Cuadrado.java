package EjercicioClasesAbstractas;

public class Cuadrado extends Figura 
{
double lado;

public Cuadrado (double x, double y, double lado)
{
	super(x,y);
	this.lado=lado;
	}
@Override
public double area() {
	return lado*lado;
}}