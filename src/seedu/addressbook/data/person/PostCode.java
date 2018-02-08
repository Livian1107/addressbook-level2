package seedu.addressbook.data.person;

public class PostCode {
    private final String postcode;

    public PostCode(String pos){
        this.postcode = pos;
    }

    public boolean isInvalid(){
        return postcode == null;
    }

    public String getPos() {
        return postcode;
    }
}
