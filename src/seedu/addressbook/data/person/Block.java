package seedu.addressbook.data.person;

public class Block {
    private final String block;

    public Block(String blk){
        this.block = blk;
    }

    public boolean isInvalid(){
        return block == null;
    }

    public String getBlock() {
        return block;
    }
}
