import java.util.Scanner ;

class inventory{

    int products ;

    inventory(int p){
        products = p;
    }
    void display(){
        System.out.println("The total products is "+products);
    }
}

public class task6 {
    public static void main(String[] args) {
        inventory sc = new inventory(10) ;
        sc.display();
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter 1 to add products or 2 to remove products");
        int products = 10 ;
        int item = scanner.nextInt() ;
      
        if(item==1){
            products++ ;
        }
        else{
            products-- ;
        }
        System.out.println("Now the products number are " +products);
    }
}