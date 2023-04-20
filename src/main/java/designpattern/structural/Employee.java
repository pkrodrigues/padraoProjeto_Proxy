package designpattern.structural;

public class Employee {
    private String name;
    private boolean administrador;

    public Employee(String name, boolean administrador) {
        this.name = name;
        this.administrador = administrador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}

