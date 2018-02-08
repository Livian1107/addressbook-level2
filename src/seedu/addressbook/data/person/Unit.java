package seedu.addressbook.data.person;

public class Unit {
    private final String unit;

    public Unit(String uni){
        this.unit = uni;
    }

    public boolean isInvalid(){
        return unit == null;
    }

    public String getUnit() {
        return unit;
    }
}
