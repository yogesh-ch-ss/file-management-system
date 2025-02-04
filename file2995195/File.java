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
        // If getCount() of an object is -1, it is a file,
        // Else, it is a directory.
        return 1;
    }

    @Override
    public String display(String prefix) {
        return this.displayHelper(prefix, 0);
    }

    public String displayHelper(String prefix, int level) {
        String currentPrefix = "";
        for (int i = 0; i < level; i++) {
            currentPrefix += prefix;
        }
        return String.format("%s%s (%d)\n", currentPrefix, this.getName(), this.getSize());
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
