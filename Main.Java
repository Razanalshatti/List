// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<String> PlayList = new ArrayList<>();
    List<String> BooksList = new ArrayList<>();
    List<String> MoviesList = new ArrayList<>();

    PlayList.add("Rolling in the Deep");
    ;
    PlayList.add("Shape of You");
    PlayList.add("Someone you loved");
    PlayList.add("Havana");
    PlayList.add("Blinding Lights");

    BooksList.add("1984");
    BooksList.add("To kill a mockingbird");
    BooksList.add("The Great Gatsby");
    BooksList.add("Harry Potter and the Sorcerer's Stone");
    BooksList.add("The Cather in the Rye");

    MoviesList.add("The GodFather");
    MoviesList.add("Inception");
    MoviesList.add("Forrest Gump");
    MoviesList.add("The Dark Knight");
    MoviesList.add("The Shawshank Redemption");

    PlayList.remove(2);

    System.out.println("PlayList: ");
    for (String song : PlayList) {
      System.out.println(song);

    }

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}
