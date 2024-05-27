public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstName, boolean aware) {
       this.firstname = firstName;
       this.aware = aware;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (this.aware) {
            return "Je m'appelle " + this.firstname + " et je suis aware";
        } else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
        }
    }
}
