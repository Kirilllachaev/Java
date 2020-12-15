package Lab7;
import java.util.ArrayList;

public class OwnCollection {
    public static void main(String[] args) {
        ArrayList<String> manuls = new ArrayList<String>();
        manuls.add("Один манул");
        manuls.add("Два манул");
        manuls.add("Три манул");
        manuls.add(3, "Четыре манул");
        System.out.println(manuls.get(1));
        manuls.set(1, "2 манула");
        System.out.printf("В списке %d манулов \n", manuls.size());
        for(String state : manuls){
            System.out.println(state);
        }
        if(manuls.contains("Четыре манул")){
            System.out.println("Список содержит 4 манула");
        }
        Object[] countries = manuls.toArray();
        for(Object country : countries){
            System.out.println(country); }
    }
}
