import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch=in.nextInt();
        double r,b,h,l,a,d1,d2,w;
        switch(ch){
            case 1:
                System.out.println("Enter the radius of circle");
                r=in.nextDouble();
                System.out.println("Area of circle: "+(Math.PI*r*r));
                break;
            case 2:
                System.out.println("Enter the base and height of triangle");
                b=in.nextDouble();
                h=in.nextDouble();
                System.out.println("Area of triangle: "+((1.0/2)*b*h));
                break;
            case 3:
                System.out.println("Enter the length and breadth of rectangle");
                l=in.nextDouble();
                b=in.nextDouble();
                System.out.println("Area of rectangle: "+(l*b));
                break;
            case 4:
                System.out.println("Enter the two sides of triangle");
                a=in.nextDouble();
                b=in.nextDouble();
                System.out.println("Area of isosceles triangle: "+((1.0/4)*b*Math.sqrt((4*a*a)-(b*b))));
                break;
            case 5:
                System.out.println("Enter the base and height of paralellogram");
                b=in.nextDouble();
                h=in.nextDouble();
                System.out.println("Area of paralellogram: "+(b*h));
                break;
            case 6:
                System.out.println("Enter the lengths of diagonals of rhombus");
                d1=in.nextDouble();
                d2=in.nextDouble();
                System.out.println("Area of rhombus: "+((1.0/2)*d2*d1));
                break;
            case 7:
                System.out.println("Enter the side of triangle");
                a=in.nextDouble();
                System.out.println("Area of equilateral triangle: "+((Math.sqrt(3)/4)*a*a));
                break;
            case 8:
                System.out.println("Enter the radius of circle");
                r=in.nextDouble();
                System.out.println("Perimeter of circle: "+(2*Math.PI*r));
                break;
            case 9:
                System.out.println("Enter the side of the triangle");
                a=in.nextDouble();
                System.out.println("Perimeter of equilateral triangle: "+(3*a));
                break;
            case 10:
                System.out.println("Enter the two sides of paralellogram");
                a=in.nextDouble();
                b=in.nextDouble();
                System.out.println("Perimeter of paralellogram: "+(2*(a+b)));
                break;
            case 11:
                System.out.println("Enter the two sides of rectangle");
                l=in.nextDouble();
                b=in.nextDouble();
                System.out.println("Perimeter of rectangle: "+(2*(l+b)));
                break;
            case 12:
                System.out.println("Enter the side of square");
                a=in.nextDouble();
                System.out.println("Perimeter of square: "+(4*a));
                break;
            case 13:
                System.out.println("Enter the side of rhoumbus");
                a=in.nextDouble();
                System.out.println("Perimeter of rhombus: "+(4*a));
                break;
            case 14:
                System.out.println("Enter the radius and height of cone");
                r=in.nextDouble();
                h=in.nextDouble();
                System.out.println("Volume of cone: "+((1.0/3)*Math.PI*r*r*h));
                break;
            case 15:
                System.out.println("Enter the length, width and height of rectangular prism");
                l=in.nextDouble();
                w=in.nextDouble();
                h=in.nextDouble();
                System.out.println("Volume of prism: "+(l*w*h));
                break;
            case 16:
                System.out.println("Enter the radius and height of cylinder");
                r=in.nextDouble();
                h=in.nextDouble();
                System.out.println("Volume of cylinder: "+(Math.PI*r*r*h));
                break;
            case 17:
                System.out.println("Enter the radius of sphere");
                r=in.nextDouble();
                System.out.println("Volume of sphere: "+((4.0/3)*Math.PI*r*r*r));
                break;
            case 18:
                System.out.println("Enter the length, width and height of pyramid");
                l=in.nextDouble();
                w=in.nextDouble();
                h=in.nextDouble();
                System.out.println("Volume of pyramid: "+((l*w*h)/3));
                break;
            case 19:
                System.out.println("Enter the radius and heigth of cylinder");
                r=in.nextDouble();
                h=in.nextDouble();
                System.out.println("Curved surface area of cylinder: "+(2*Math.PI*r*h));
                break;
            case 20:
                System.out.println("Enter the side of cube");
                a=in.nextDouble();
                System.out.println("Total surface area of cube: "+(6*a*a));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
