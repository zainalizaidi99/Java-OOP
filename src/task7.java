class Movies {
    
    String title;
    String director;
    String actor;
    int review;

    Movies(String t,String d,String a,int r){
        t = title;
        a = actor;
        d = director;
        r = review;
    }

    int addreview(int addreview){
        review = addreview ;
        return review;
    }
    
    void printmovies(){
        System.out.println("The title of Movie is : "+ title);
        System.out.println("The director of Movie is : "+ director);
        System.out.println("The actor of Movie is : "+ actor);
        System.out.println("The review of Movie is : "+ review);
    
    }
}

public class task7 {
    public static void main(String[] args) {
        Movies sc = new Movies("Dark Knight","Christhoper Nolan","Christian Bale and Heath Ledger", 6);
        int rev = sc.addreview(10);
        System.out.println("Updated Review is: "+rev);
    }
}



