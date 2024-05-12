public class Book {

    //declaring fields
    String title;
    String author;
    long ISBN;

    //constractor with no input parameters
    public Book() {
        this.title = "Master and Margarita";
        this.author = "Unknown";
        this.ISBN = 0000000;
    }
    //constructor with 3 input parameters
    public Book(String titleFromInput, String authorFromInput, long ISBNFromInput) {
        this.title = titleFromInput;
        this.author = authorFromInput;
        this.ISBN = ISBNFromInput;
    }
    //constructor with 2 input parameters
    public Book(String titleFromInput, String authorFromInput) {
        this.title = titleFromInput;
        this.author = authorFromInput;
        this.ISBN = 78965480;
        }
    }


