import java.util.ArrayList;
import java.util.HashSet;
public class EventGuests {
    public static void main(String[] args) {
        ArrayList<String> guestList = new ArrayList<>();
        guestList.add("Vidhiya");
        guestList.add("Priya");
        guestList.add("Varsha");
        guestList.add("Vidhiya");
        guestList.add("Lakshmi");
        HashSet<String> uniqueGuests = new HashSet<>();
        uniqueGuests.addAll(guestList);
        System.out.println("Total guests in ArrayList:" + guestList.size());
        System.out.println("Total guests in HashSet:" + uniqueGuests.size());
        String SearchName = "Vidhiya";
        if (uniqueGuests.contains(SearchName)) {
            System.out.println(SearchName  + "Guests name is in list");
        } else {
            System.out.println(SearchName  + "Guests name is not in list");
        }

    }
}
