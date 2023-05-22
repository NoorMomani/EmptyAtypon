// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ListOfStrings lst = new ListOfStrings();
        lst.add("c++");
        lst.add("java", 0);
        lst.add("c#", 2);
        System.out.println(lst.remove()); // c#
        lst.add("kotlin");
        System.out.println(lst.remove(1)); // c++
        System.out.println(lst.remove(1)); // kotlin
        System.out.println(lst.remove()); // java

    }
}