public class Main {
    public static void main(String[] args) {
        Book[]  books = new Book[10];
        books[0]=new ProgrammingBook(0,"book 0",10000,"kimdong","java","ok");
        books[1]=new ProgrammingBook(1,"book 1",30000,"kim dong","tieng viet","ok");
        books[2]=new ProgrammingBook(2,"book 2",20000,"kimdong","java","ok");
        books[3]=new ProgrammingBook(3,"book 3",40000,"kimdong","tienng viet","ok");
        books[4]=new ProgrammingBook(4,"book 4",60000,"kimdong","java","ok");
        books[5]=new FictionBook(5,"book 5",80000,"van cao","hanh dong");
        books[6]=new FictionBook(6,"book 6",670000,"van cao","hanh dong");
        books[7]=new FictionBook(7,"book 7",650000,"van cao","hanh dong");
        books[8]=new FictionBook(8,"book 8",620000,"van cao","hanh dong");
        books[9]=new FictionBook(9,"book 9",100000,"van cao","hanh dong");
        int a = 0;
        int count = 0;
        for (Book book:books) {
            a+= book.getPrice();
        }
        System.out.println(a);
        for (Book book:books) {
            if (book instanceof ProgrammingBook){
                if (((ProgrammingBook) book).getLanguage().equals("java"))
                count++;
            }
        }
        System.out.println(count);


        Book temp;
        for (int i = 0 ; i < books.length - 1; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].getPrice() > books[j].getPrice()) {
                    temp = books[j];
                    books[j] = books[i];
                    books[i] = temp;
                }
            }
        }
        for (Book book:books) {
            System.out.println(book);
        }
    }
}
