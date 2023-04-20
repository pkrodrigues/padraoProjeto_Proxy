package designpattern.structural;

import java.util.Arrays;
import java.util.List;

public class Guest implements IGuest {
    private int idGuest;
    private String name;
    private String city;
    private int roomNumber;
    private int points;

    public Guest(int idGuest)
    {
        this.idGuest = idGuest;
        Guest objeto = BD.getGuest(idGuest);
        this.name =objeto.name;
        this.city =objeto.city;
        this.roomNumber =objeto.roomNumber;
        this.points =objeto.points;

    }

    public Guest(int idGuest, String name, String city, int roomNumber, int points) {
        this.idGuest = idGuest;
        this.name = name;
        this.city = city;
        this.roomNumber = roomNumber;
        this.points = points;
    }

    public int getIdGuest(){
        return this.idGuest;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.name, this.city);
    }

    @Override
    public List<Integer> obterPointsAndRoomNumber(Employee employee){
        return Arrays.asList(this.roomNumber, this.points);
    }
}
