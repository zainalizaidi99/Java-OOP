class Total{ 

    int num1;
    int num2;

    int getTotal(int n1 , int n2){
        int sum = n1+n2;
        return sum;
    }

}

public class task5 {
    public static void main(String[] args) {
        Total number = new Total();
        int SUM =  number.getTotal(5,6);
        System.out.println("Sum is: "+SUM);
    }
}
