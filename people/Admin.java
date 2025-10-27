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

    @Override
    public String toString() {
        return "Admin [role=" + role + ", getRole()=" + getRole() + ", getName()=" + getName() + ", getAge()="
                + getAge() + ", getContactNumber()=" + getContactNumber() + ", toString()=" + super.toString() + "]";
    }
    
}
