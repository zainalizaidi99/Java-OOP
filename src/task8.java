class restraunt {
    String menu ;
    int item;
    double prices;
    double reviews;

    restraunt (String m,int i,double p,double r){
      
      i = item;
      m = menu;
      p = prices;
      r = reviews ;
    
    }
    void additem(int additem){
        item = item + additem;
    }
    void removeitem(int removeitem){
        item = item - removeitem;
    }
    void printRestraunt(){   
        System.out.println("The ");
    }
}
   
public class task8{
    public static void main(String[] args) {
        restraunt rest = new  restraunt("Tikka , Pizza , Burger",300,350,500);
        
    } 
}
