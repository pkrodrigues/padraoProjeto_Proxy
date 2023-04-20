package designpattern.structural;

import java.util.List;

public class GuestProxy implements IGuest{
    private Guest guest;
    private int idGuest;

    public GuestProxy(int idGuest)
    {
        this.idGuest = idGuest;
    }



    @Override
    public List<String> obterDadosPessoais() {
        if (this.guest == null) {
            this.guest = new Guest(this.idGuest);
        }
        return this.guest.obterDadosPessoais();
    }

    @Override
    public List<Integer> obterPointsAndRoomNumber(Employee employee) {
        if (!employee.isAdministrador()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.guest == null) {
            this.guest = new Guest(this.idGuest);
        }
        return this.guest.obterPointsAndRoomNumber(employee);
    }
}
