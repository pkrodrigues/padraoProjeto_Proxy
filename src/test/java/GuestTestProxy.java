import designpattern.structural.BD;
import designpattern.structural.Employee;
import designpattern.structural.Guest;
import designpattern.structural.GuestProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class GuestTestProxy {

    @BeforeEach
    void setUp() {
        BD.addGuest(new Guest(1, "João", "Juiz de Fora", 101, 1000));
        BD.addGuest(new Guest(2, "Maria", "Juiz de Fora", 302, 500));
    }

    @Test
    void deveRetornarDadosPessoaisGuest() {
        GuestProxy guest = new GuestProxy(1);

        assertEquals(Arrays.asList("João", "Juiz de Fora"), guest.obterDadosPessoais());
    }

    @Test
    void deveRetonarNotasGuest() {
        Employee employee = new Employee("Ana", true);
        GuestProxy guest = new GuestProxy(2);

        assertEquals(Arrays.asList(302, 500), guest.obterPointsAndRoomNumber(employee));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarNotasGuest() {
        try {
            Employee employee = new Employee("Joana", false);
            GuestProxy guest = new GuestProxy(2);

            guest.obterPointsAndRoomNumber(employee);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }
}

