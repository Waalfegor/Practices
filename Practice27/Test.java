package Practice27;

public class Test {
    public static void main(String[] args) {
        HashTabl<String, Integer> hashTab = new HashTabl<String, Integer>();
        hashTab.hashtabInit();

        hashTab.hashtabAdd("Simon", 1);
        hashTab.hashtabAdd("Andrey", 2);
        hashTab.hashtabAdd("Iakov", 3);
        hashTab.hashtabAdd("Ioann", 5);
        hashTab.hashtabAdd("Zevdeev", 6);
        hashTab.hashtabAdd("Filipp", 7);
        hashTab.hashtabAdd("Varfolomey", 8);
        hashTab.hashtabAdd("Foma", 9);
        hashTab.hashtabAdd("Matfey", 10);

        hashTab.hashtabHash();

        hashTab.hashtabAdd("Alfeev", 4);
        hashTab.hashtabDelete("Foma");

        hashTab.hashtabHash();

        System.out.println("Key of Simon: " + hashTab.hashtabLookup("Simon"));
    }
}
