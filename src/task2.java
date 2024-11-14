class Circle{ 
    double radius;

    Circle(double r){
        radius = r;
    }

    Circle(){
        radius = 1;
    }

    double getArea(){
        double area = 3.14* radius*radius;
        return area;
    }
}

public class task2 {
    public static void main(String[] args) {
        
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(10.2);
        Circle circle3 = new Circle(12.0);

        double area1 = circle1.getArea();
        double area2 = circle2.getArea();
        double area3 = circle3.getArea();

        System.out.println("Area 1: "+area1);
        System.out.println("Area 2: "+area2);
        System.out.println("Area 3: "+area3);

    }
}
