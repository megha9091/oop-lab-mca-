public class Square
{
    int side;
    void getData(int s)
    {
        side=s;

    }
    int calArea()
    {
        return side*side;

    }
    public static void main(String[]args)
    {
        Square s=new Square();
        s.getData(4);
        System.out.println("Area of square="+s.calArea());
    }

  
}
