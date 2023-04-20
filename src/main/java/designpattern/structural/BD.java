package designpattern.structural;

import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<Integer, Guest> guests = new HashMap<>();

    public static Guest getGuest(int idGuest) {
        return guests.get(idGuest);
    }

    public static void addGuest(Guest guest){
        guests.put(guest.getIdGuest(), guest);
    }
}
