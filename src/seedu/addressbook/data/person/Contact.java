package seedu.addressbook.data.person;

/**
 * Represents a Person's Contact in the address book.
 */
public class Contact {

    public Contact(){
    }

    /**
     * convert the contact information to a string and return the string
     */
    public String toString() {
        throw new UnsupportedOperationException("This method is to be implemented by child classes");
    }

    /**
    * judge whether the contacts are the same and return the result of judgement
    */
    public boolean equals(Object other) {
        throw new UnsupportedOperationException("This method is to be implemented by child classes");
    }

    /**
     * get the hash code of the contact and return it
     */
    public int hashCode() {
        throw new UnsupportedOperationException("This method is to be implemented by child classes");
    }
}
