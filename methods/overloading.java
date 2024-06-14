package methods;

public class overloading {
    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.out.println(sum(3, 4, 5));
    }

    public static int sum(int x, int y){
        return x+y;
    }

    public static int sum(int x, int y, int z){
        return x+y+z;
    }
}
