public class Lab1
{
	public static void main (String[] args) 
	{
		Point3d[] myPoint = new Point3d[3]; //Объявление массива из трёх объектов-точек
		
		for (int i = 0; i <= 2; i++) //Цикл заполнения координат точек
		{
			myPoint[i] = new Point3d();
			myPoint[i].setX(Double.valueOf(args[0+3*i]));
			myPoint[i].setY(Double.valueOf(args[1+3*i]));
			myPoint[i].setZ(Double.valueOf(args[2+3*i]));
		}
		for (int i = 0; i <= 2; i++) //Просто вывод точек для красоты
		{
			System.out.println("Point " + i + ": (" + myPoint[i].getX() + "  " + myPoint[i].getY() + "  " + myPoint[i].getZ() + ")");
		}
		if (checkPoints(myPoint[0], myPoint[1], myPoint[2])) //Проверочка на совпадение (равность) точек
			System.out.printf("Area of a triangle: " + "%.2f", computeArea(myPoint[0], myPoint[1], myPoint[2]));
		else
			System.out.println("Some of points are equal. Please, enter correct input data");
    }
	
	public static double computeArea (Point3d p1, Point3d p2, Point3d p3) //Вычисление площади треугольника
	{
		double a = p1.distanceTo(p2); //Вычисление стороны a
		double b = p2.distanceTo(p3); //Вычисление стороны b
		double c = p3.distanceTo(p1); //Вычисление стороны c
		double per = ((a+b+c)/2); //Вычисление периметра
		return (Math.sqrt(per*(per-a)*(per-b)*(per-c))); //Возвращаемое значение - площадь треугольника по формуле Герона
	}
	
	public static boolean checkPoints(Point3d p1, Point3d p2, Point3d p3) //Проверочка на совпадение (равность) точек
	{
		if (((p1.getX() == p2.getX()) && (p1.getY() == p2.getY()) && (p1.getZ() == p2.getZ())) ||
			((p2.getX() == p3.getX()) && (p2.getY() == p3.getY()) && (p2.getZ() == p3.getZ())) ||
			((p1.getX() == p3.getX()) && (p1.getY() == p3.getY()) && (p1.getZ() == p3.getZ())))
			return false;
		return true;
	}

}