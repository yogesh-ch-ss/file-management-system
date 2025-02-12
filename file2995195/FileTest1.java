package file2995195;

public class FileTest1 {
    public static void main(String[] args) {
        // Level 1: Root directory
        Directory root = new Directory("root");

        // Level 1: Adding a file
        File report = new File("report.txt", 5);
        root.add(report);

        // Level 2: Adding a subdirectory
        Directory projects = new Directory("projects");
        root.add(projects);

        // Level 3: Adding a file inside projects directory
        File projectFile = new File("project1.doc", 10);
        projects.add(projectFile);

        // Display structure before deletion
        System.out.println("Before Deletion:");
        System.out.println(root.display("+-"));

        // Search file
        System.out.println(root.search("report.txt").getName());
        System.out.println(root.search("project1.doc").getName());

        // Remove a file at level 1
        root.remove(report);

        // Display structure after deletion
        System.out.println("After Deletion:");
        System.out.println(root.display("+-"));

        // Searching for files
        System.out
                .println("Searching for 'report.txt': " + (root.search("report.txt") != null ? "Found" : "Not Found"));
        System.out.println(
                "Searching for 'project1.doc': " + (root.search("project1.doc") != null ? "Found" : "Not Found"));
        System.out.println(root.search("project1.doc").getName());

    }
}
