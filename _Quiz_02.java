package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        int person1 = 115;
        int person2 = 121;
        int height = 120;
        String result1 = (person1 > height) ? "탑승가능" : "탑승불가능";
        System.out.println("키가 " + person1 + "cm 이므로 " + result1 + " 합니다");

        String result2 = (person2 > height) ? "탑승가능" : "탑승불가능";
        System.out.println("키가 " + person2 + "cm 이므로 " + result2 + " 합니다");
    }
}
