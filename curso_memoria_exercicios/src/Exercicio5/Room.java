package Exercicio5;

public class Room {

    private String student_name;
    private String student_email;
    private boolean occupied = false;
    
    public Room(String student_name, String student_email, boolean occupied) {
        this.student_name = student_name;
        this.student_email = student_email;
        this.occupied = occupied;
    }
    public String getStudent_name() {
        return student_name;
    }
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
    public String getStudent_email() {
        return student_email;
    }
    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void occupy(String name, String email){
        setStudent_name(name);
        setStudent_email(email);
        setOccupied(true);
    }
    
}
