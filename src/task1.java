class Car{

    String brandClass;

    Car(String brand){
        brandClass = brand ;
    }

    void getBrand(){
         System.out.println("Tne car name is: "+brandClass);
    }
}

public class task1 {
    public static void main(String[] args) {
        Car carName = new Car("Ford"); 
        carName.getBrand();
    }
}
