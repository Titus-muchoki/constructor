public class constructor {
    int x;
    public constructor() {
        int x = 9;
    }
    public static void main(String[] args) {
        constructor myObj = new constructor();
        System.out.println(myObj.x);
    }
}
