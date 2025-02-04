package file2995195;

import java.util.ArrayList;

// Composite - Directory with multiple files/directory under it.
public class Directory implements Component {

    private String name;
    private ArrayList<Component> items;

    // Constructor.
    public Directory(String name) {
        this.name = name;
        this.items = new ArrayList<Component>();
    }

    // Adding a file/directory in a directory.
    public void add(Component c) {
        this.items.add(c);
    }

    // Removing a file/directory in a directory.
    public void remove(Component c) {
        this.items.remove(c);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int sizeOfDir = 0;

        for (int i = 0; i < this.items.size(); i++) {
            sizeOfDir += this.items.get(i).getSize();
        }

        return sizeOfDir;
    }

    @Override
    public int getCount() {
        int countOfDir = 0;

        for (int i = 0; i < this.items.size(); i++) {
            countOfDir += this.items.get(i).getCount();
        }

        return countOfDir;
    }

    public void printItemsInThisDirectory() {
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(this.items.get(i).getName());
        }
    }

    @Override
    public String display(String prefix) {

        return this.displayHelper(prefix, 0);
    }

    public String displayHelper(String prefix, int level) {
        String output = "";
        String currentPrefix = "";
        for (int i = 0; i < level; i++) {
            currentPrefix += prefix;
        }

        output += String.format("%s%s: (count=%d, size=%d)\n", currentPrefix, this.getName(), this.getCount(),
                this.getSize());

        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i) instanceof Directory) {
                output += ((Directory) this.items.get(i)).displayHelper(prefix, level + 1);
            } else {

                output += ((File) this.items.get(i)).displayHelper(prefix, level + 1);
            }
        }

        return output;

    }

    @Override
    public Component search(String name) {

        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).search(name) != null
                    && this.items.get(i).search(name).getName().equals(name)) {
                return this;
            } else if (this.items.get(i).search(name) != null) {
                return this.items.get(i).search(name);
            } else {
                continue;
            }
        }

        return null;

    }

}
