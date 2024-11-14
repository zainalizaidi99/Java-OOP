class student{
    
    String Name;
    int id;
    double GPA;

    student(String n , int i , double g){
        Name = n ;
        id = i ;
        GPA = g ;

        System.out.println("Student Details: ");

        System.out.println("Name: "+Name);
        System.out.println("ID: "+id);
        System.out.println("GPA: "+GPA);
    }
}

public class task3 {
    public static void main(String[] args) {
        student Student = new student("Zain", 215, 3.5);
    }
}
