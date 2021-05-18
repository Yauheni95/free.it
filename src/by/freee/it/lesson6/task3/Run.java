package by.freee.it.lesson6.task3;

public class Run {
    public static void main(String[] args) {
        Catalog catalog =new Catalog(100);
        catalog.writeDownToCatalog("John","Johnson","Harry Potter");
        catalog.writeDownToCatalog("Bill","Simpson","Hobbit");
        catalog.writeDownToCatalog("Nelson","Wings","The lord of rings");
        catalog.writeDownToCatalog("Chandler", "Bing", "The alchemist");
        catalog.writeDownToCatalog("Will", "Black", "Animal farm");
        catalog.writeDownToCatalog("Jack","Nicholson", "Alice's adventures in Wonderland");
        catalog.checkBySurname("Black");
        catalog.checkById(4);
        catalog.checkByName("Ivan");
        catalog.handOverBook(5);
        catalog.checkById(5);
    }
}
