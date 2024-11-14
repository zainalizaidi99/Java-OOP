class Airplane{ 

    int f;
    String d;
    String dt;


    Airplane(int flightNumber, String destination, String deparureTime){

        f = flightNumber;
        d = destination;
        dt = deparureTime;
    }

    void display(){
        System.out.println("Flight Number: "+f);
        System.out.println("Destination: "+d);
        System.out.println("Departure Time: "+dt);
    }

    void status(){
        System.out.println("Delay: No Delay.");
        System.out.println("Status: In Work.");
    }
}

public class task4 {
    public static void main(String[] args) {
        Airplane details = new Airplane(021 ,"Karachi","1pm") ;
        details.display();
        details.status();
    }
}
