package file2995195;

import java.util.ArrayList;

// Composite - Directory with multiple files/directory under it.
public class Directory implements Component {

    private String name;
    private int size;
    private int count;
    private ArrayList<Component> items;

    // Constructor.
    public Directory(String name) {
        this.name = name;
        this.size = 0;
        this.count = 0;
        this.items = new ArrayList<Component>();
    }

    // Adding a file/directory in a directory.
    public void add(Component c) {
        this.items.add(c);
        this.size += c.getSize();
        this.count++;
    }

    // Removing a file/directory in a directory.
    public void remove(Component c) {
        this.items.remove(c);
        this.size -= c.getSize();
        this.count--;
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
        return this.count;
    }

    @Override
    public String display(String prefix) {

        String output = "";

        for (int i = 0; i < this.items.size(); i++) {
            output += String.format("%s (count=%d, size=%d)\n", this.getName(), this.getCount(), this.getSize());
            output+= this.items.get(i).display(prefix);
        }

        return output;
    }

    @Override
    public Component search(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

}
