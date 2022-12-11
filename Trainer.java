public class Trainer {
    String firstName;
    String lastName;
    String middleName;
    boolean hasPlayed;
    public Trainer(String f, String l, String m, boolean p) {
        firstName = f;
        lastName = l;
        middleName = m;
        hasPlayed = p;
    }
    public String getFirstName () {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }
    public String getMiddleName () {
        return middleName;
    }
    public boolean getHasPlayed () {
        return hasPlayed;
    }
    public void setFirstName(String f) {
        firstName = f;
    }
    public void setLastName(String l) {
        lastName = l;
    }
    public void setMiddleName(String m) {
        middleName = m;
    }
    public void setPlayed(boolean p) {
        setPlayed = p;
    }
}
