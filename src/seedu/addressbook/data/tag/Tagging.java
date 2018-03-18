package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * represent the condition of a tag added or removed
 */
public class Tagging {
    private static final String ADDTAG_PREFIX = "+ ";
    private static final String REMOVETAG_PREFIX = "- ";

    private static Person person;
    private static Tag tag;
    private static boolean isAdded;

    /**
     * Add a tagging record
     * @param person Person who is added/removed a tag
     * @param tag Tag which is added/removed
     * @param added {@code true} if tag is added {@code false} if tag is removed
     */
    public Tagging(Person person, Tag tag, boolean added){
        this.person = person;
        this.tag = tag;
        this.isAdded = added;
    }

    @Override
    public String toString(){
        return (isAdded ? ADDTAG_PREFIX:REMOVETAG_PREFIX) + person.getName().toString() + " "
                + tag.toString();
    }

}
