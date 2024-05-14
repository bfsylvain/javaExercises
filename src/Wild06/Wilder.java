package Wild06;

public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

    private String  getName() {
        return this.firstname;
    }

    private boolean isAware() {
        return this.aware;
    }

    public String whoAmI() {

        String MyNameIsVF = "My name is "+ this.getName();
        String IamAwareVF = " et " +(this.isAware()? "je suis" : "je ne suis pas")+ " aware";
        return MyNameIsVF + IamAwareVF;
    }
}
