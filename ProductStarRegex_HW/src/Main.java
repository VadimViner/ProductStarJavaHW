import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
String text1 = "В тексте, который вы видите на этом изображении, посчитайте количество букв \"е\" в каждом слове.";
StringBuilder sb1 = new StringBuilder(text1);
int count = 0;
for (int i = 0; i < sb1.length(); i++){
    if(sb1.charAt(i) == 'е'){
        count++;
    }
} System.out.print("Количество букв \"е\" в предложении: " + count);

        System.out.println();

        System.out.println();

String phone = "+7-905-123-45-67, +79818514951, ^987879wrf";
        Pattern pattern2 = Pattern.compile("\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher2 = pattern2.matcher(phone);
        System.out.println("Корректно написанные номера:");
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }

        System.out.println();

        String text3 = "0 H 1e2 l3 l4 o5";
        Pattern pattern3 = Pattern.compile("[^a-zA-Zа-яА-Я\\s]");
        Matcher matcher3 = pattern3.matcher(text3);

        while (matcher3.find()){
            System.out.print("Цифры в тексте: " + matcher3.group() + " ");
        }
    }
}