package file2995195;

// Leaf - Individual File.
public class File implements Component {

    private String name;
    private int size;

    // Constructor.
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public String display(String prefix) {
        return String.format("%s (%d)\n", this.getName(), this.getSize());
    }

    @Override
    public Component search(String name) {
        if (this.getName() == name) {
            return this;
        } else {
            return null;
        }
    }

}
