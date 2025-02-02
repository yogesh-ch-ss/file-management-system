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
        return String.format("%s%s (%d)", prefix, this.getName(), this.getSize());
    }

    @Override
    public Component search(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

}
