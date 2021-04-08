public class Point3d //трехмерный класс точки
{
	private double xCoord; //координата X
	private double yCoord; //координата Y
	private double zCoord; //координата Z
	
	public Point3d (double x, double y, double z) //Конструктор инициализации
	{
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}
	
	public Point3d () //Конструктор по умолчанию
	{
		this(0, 0, 0);
	}
	
	public double distanceTo (Point3d p) //Метод, считающий расстояние между точками
	{
		double xx = this.xCoord - p.xCoord;
		double yy = this.yCoord - p.yCoord;
		double zz = this.zCoord - p.zCoord;
		return (Math.sqrt(xx*xx + yy*yy + zz*zz)); 
	}
	
	public double getX () //Возвращение координаты X
	{
		return xCoord;
	}
	
	public double getY () //Возвращение координаты Y
	{
		return yCoord;
	}
	
	public double getZ () //Возвращение координаты Z
	{
		return zCoord;
	}
	
	public void setX (double val) //Установка значения координаты X
	{
		xCoord = val;
	}
	
	public void setY (double val) //Установка значения координаты Y
	{
		yCoord = val;
	}
	
	public void setZ (double val) //Установка значения координаты Z
	{
		zCoord = val;
	}
}