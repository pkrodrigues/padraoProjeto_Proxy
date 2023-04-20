package designpattern.structural;

import java.util.List;

public interface IGuest {
    List<String> obterDadosPessoais();
    List<Integer> obterPointsAndRoomNumber(Employee employee);
}
