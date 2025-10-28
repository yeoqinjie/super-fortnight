package people;

public class Admin extends Person {
    private int role;

    public Admin(String name, int role) {
        super(name);
        this.role = role;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String toString() {
        return "Admin---\n" + super.toString() + "\nRole: " + getRole();
    }
    
}
