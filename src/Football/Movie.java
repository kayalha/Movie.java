package Football;

public class Movie {
    String name;
    int year;
    String genre;
    int duration;

    public Movie ( String name , int year , String genre , int duration)
    {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
    }
    public void showMovie()
    {
        System.out.println("name : " + name);
        System.out.println("year : " + year);
        System.out.println("genre : " + genre);
        System.out.println("duration : " + duration);
    }
}
