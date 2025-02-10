package file2995195;

public class FileTest0 {
    public static void main(String[] args) {
        File courseworkpdf = new File("courseworkpdf", 1);
        File courseworkzip = new File("coursework zip file", 2);

        Directory coursework = new Directory("coursework");
        coursework.add(courseworkpdf);
        coursework.add(courseworkzip);

        Directory unittests = new Directory("unit tests");
        File test1 = new File("unit test 1", 56);
        unittests.add(test1);

        coursework.add(unittests);
        coursework.remove(courseworkzip);

        Directory buffer = new Directory("buffer");
        File bufferfile = new File("buffer file", 1);

        buffer.add(bufferfile);
        unittests.add(buffer);

        System.out.println(coursework.display("\t"));

        // coursework.printItemsInThisDirectory();

        System.out.println(coursework.search("courseworkpdf").getName());
        System.out.println(coursework.search("unit test 1").getName());
        System.out.println(coursework.search("buffer file").getName());
        System.out.println();

        unittests.remove(buffer);
        System.out.println(coursework.display("\t"));

    }
}
