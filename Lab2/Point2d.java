public class Point2d //двумерный класс точки
{
	private double xCoord; //координата X
	private double yCoord; //координата Y
	
	public static void main(String[] args) 
	{
		Point2d myPoint = new Point2d(Double.valueOf(args[0]), Double.valueOf(args[1]));
		//Point2D(args[0], args[1]);
		System.out.println(myPoint.getX());
    }
	
/* 	public static boolean isPrime (int n) //Метод, проверяющий условие задачи
	{
		for (int i = 2; i < n; i++)
			if (n%i == 0) //операция остатка от деления n на значение i
				return false;
		return true;
	} */
	
	public Point2d (double x, double y) //Конструктор инициализации
	{
		xCoord = x;
		yCoord = y;
	}
	
	public Point2d () //Конструктор по умолчанию
	{
		//Вызовите конструктор с двумя параметрами и определите источник.
		this(0, 0);
	}
	
	public double getX () //Возвращение координаты X
	{
		return xCoord;
	}
	
	public double getY () //Возвращение координаты Y
	{
		return yCoord;
	}
	
	public void setX (double val) //Установка значения координаты X
	{
		xCoord = val;
	}
	
	public void setY (double val) //Установка значения координаты Y
	{
		yCoord = val;
	}
}