public class LabActivity1 {
    public static void main(String[] args) {
 
        Movie movie1 = new Movie();
        movie1.title = "The Great Gatsby";
        movie1.genre = "Drama";
        movie1.duration = 143;
 
        Movie movie2 = new Movie();
        movie2.title = "The Godfather";
        movie2.genre = "Crime";
        movie2.duration = 175;
 
        Movie movie3 = new Movie();
        movie3.title = "Narcos: Pablo Escobar";
        movie3.genre = "Crime";
        movie3.duration = 50;
 
        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}