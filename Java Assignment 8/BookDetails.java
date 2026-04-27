class BookDetails {
    String author, title, publisher;
    double price;

    BookDetails(String a, String t, String p, double pr) {
        author = a;
        title = t;
        publisher = p;
        price = pr;
    }

    public static void main(String[] args) {
        BookDetails[] b = {
            new BookDetails("A","B1","P1",200),
            new BookDetails("B","B2","P2",500),
            new BookDetails("C","B3","P3",300),
            new BookDetails("D","B4","P4",400)
        };

        BookDetails max = b[0];

        for(int i=1;i<b.length;i++){
            if(b[i].price > max.price)
                max = b[i];
        }

        System.out.println(max.title);
    }
}