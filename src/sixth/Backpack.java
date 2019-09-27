package sixth;

public class Backpack {
    static final int MAX_WEIGHT = 80;

    static Items[] items = {
            new Items(15, 30),
            new Items(30, 90),
            new Items(50, 80),
            new Items(60, 80),
            new Items(10, 100)
    };

    public static void main(String[] args) {

        System.out.print("\nМАКСИМАЛЬНАЯ СТОИМОСТЬ РЮКЗАКА: ");
        System.out.println(findBalance(items.length - 1, MAX_WEIGHT));
    }

    public static int findBalance(int i, int weight) {

        int i1;
        int i2;

        if (i < 0) {
            return 0;
        }
        if (items[i].getWeight() > weight) {
            i1 = findBalance(i - 1, weight);
            return i1;
        }
        else {
            i1 = findBalance(i - 1, weight);
            i2 = findBalance(i - 1, weight - items[i].getWeight()) + items[i].getValue();
            return Math.max(i1, i2);
        }
    }
}
class Items {
    private int weight;
    private int value;

    public Items(int weight, int value){
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }


}