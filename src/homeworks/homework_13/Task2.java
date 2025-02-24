package homeworks.homework_13;

public class Task2 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String a = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        String b = String.join(" ", str1, str2, str3, str4, str5);

        System.out.println(a + " " + a.length());
        System.out.println(b + " " + b.length());

        String replA = a.replace("powerful", "super");
        System.out.println(replA);

        boolean isAge = a.contains("age");
        System.out.println(isAge);

    }
}
