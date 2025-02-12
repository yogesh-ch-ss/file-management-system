package file2995195;

public class FileTest2 {
    public static void main(String[] args) {
        // Level 1: Root directory
        Directory root = new Directory("root");

        // Level 1: Adding a file
        File readme = new File("README.md", 3);
        root.add(readme);

        // Level 2: Adding a subdirectory
        Directory src = new Directory("src");
        root.add(src);

        // Level 2: Adding a file inside src
        File test = new File("test.java", 20);
        src.add(test);

        // Level 3: Adding another subdirectory inside src
        Directory components = new Directory("components");
        src.add(components);

        // Level 3: Adding a file inside components
        File componentFile = new File("UIComponent.java", 8);
        File dummy = new File("Dummy", 10);
        components.add(componentFile);
        components.add(dummy);

        // Display before deletion
        System.out.println("Before Deletion:");
        System.out.println(root.display("|->"));

        // Remove file from level 3
        components.remove(componentFile);

        // Display after deletion
        System.out.println("After Deletion of componentFile:");
        System.out.println(root.display("|->"));

        // Searching for files
        System.out.println("Searching for 'README.md': "
                + (root.search("README.md") != null ? "Found: " + root.search("README.md").getName() : "Not Found"));

        System.out.println("Searching for 'UIComponent.java': "
                + (root.search("UIComponent.java") != null ? "Found" : "Not Found"));
    }
}
