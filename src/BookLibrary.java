public class BookLibrary {
    public static void main(String[] args) {

        //creating instances with no parameters
        Book firstPopular = new Book();

        //creating instances with 3 parameter
        Book secondPopular = new Book("Dog's heart", "Michael Bulgakov", 59867638);

        //creating instances with 2 parameter
        Book thirdPopular = new Book("Ivan Vasilievich", "M.Bulgakov");

        System.out.println();
        System.out.println("The second popular book is: " + secondPopular.title + ", Author: " + secondPopular.author + ", ISBN: " + secondPopular.ISBN);
        System.out.println("The thrid popular book is: " + thirdPopular.title + ", " +thirdPopular.author + ", " + thirdPopular.ISBN);
    }
}
