package Classes;

public class Main {
    public static void main(String[] args) {
        Cookie cookie1 = new Cookie("blue");
        System.out.println(cookie1.getColor());

        Cookie cookie2 = new Cookie("red");
        System.out.println(cookie2.getColor());

        cookie1.setColor("green");
        System.out.println(cookie1.getColor());
    }
}
