class Books {
    String author, title, publisher;
    double price;

    Books(String a, String t, String p, double pr) {
        author = a;
        title = t;
        publisher = p;
        price = pr;
    }

    public static void main(String[] args) {
        Books[] b = {
            new Books("A","B1","P1",200),
            new Books("B","B2","P2",300),
            new Books("C","B3","P3",150),
            new Books("D","B4","P4",500),
            new Books("E","B5","P5",250),
            new Books("F","B6","P6",100),
            new Books("G","B7","P7",350),
            new Books("H","B8","P8",400),
            new Books("I","B9","P9",450),
            new Books("J","B10","P10",275)
        };

        Books max = b[0];

        for(int i=1;i<b.length;i++){
            if(b[i].price > max.price)
                max = b[i];
        }

        System.out.println(max.title);
    }
}
