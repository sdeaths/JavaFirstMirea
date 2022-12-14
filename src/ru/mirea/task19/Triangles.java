package ru.mirea.task19;

public class Triangles {
    static class Triangle
    {
        double a, b, c;
        Triangle(double a, double b, double c) throws Exception
        {
            if (a + b + c != 180)
            {
                throw new Exception("Сумма углов не равна 180");
            }
            if (!(a == 90 || b == 90 || c == 90))
            {
                throw new Exception("Нет прямого угла");
            }
            if (a == 0 || b == 0 || c == 0)
            {
                throw new Exception("Угол не может быть равен 0");
            }

            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public String toString()
        {
            return "Прямоугольный треугольник " + " a = " + a + ", b = " + b + ", c = " + c;
        }
    }

    public static void main(String[] args)
    {
        Triangle triangle;
        try
        {
            triangle = new Triangle(90, 45, 45);
            System.out.println(triangle.toString());
        }
        catch (Exception e)
        {
            System.out.println("Ошибка №1: " + e.getMessage());
        }
        finally
        {
            System.out.println("----------------------------------------------");
        }

        try
        {
            triangle = new Triangle(45, 120, 15);
            System.out.println(triangle.toString());
        }
        catch (Exception e)
        {
            System.out.println("Ошибка №2: " + e.getMessage());
        }
        finally
        {
            System.out.println("----------------------------------------------");
        }

        try
        {
            triangle = new Triangle(90, 180, 90);
            System.out.println(triangle.toString());
        }
        catch (Exception e)
        {
            System.out.println("Ошибка №3: " + e.getMessage());
        }
        finally
        {
            System.out.println("----------------------------------------------");
        }

        try
        {
            triangle=new Triangle(0, 0, 0);
            System.out.println(triangle.toString());
        }
        catch (Exception e)
        {
            System.out.println("Ошибка №4: " + e.getMessage());
        }
        finally
        {
            System.out.println("----------------------------------------------");
        }
    }
}
