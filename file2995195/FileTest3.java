//import java.io.File; Not sure if I added by mistake
package file2995195;

public class FileTest3 {
    public static void main(String[] args) {
        
        File courseworkpdf = new File("courseworkpdf",1);
        File courseworkzip = new File("coursework zip file",2);

        Directory coursework = new Directory("coursework");
        coursework.add(courseworkpdf);
        coursework.add(courseworkzip);

        Directory unittests = new Directory("unit tests");
        File test1 = new File("unit test 1",56);
        unittests.add(test1);

        coursework.add(unittests);
        coursework.remove(courseworkzip);
        System.out.println(coursework.display("\t"));

        Component returnedComponent =coursework.search("unit test 1");

        System.out.println( coursework.search("unit test 1").getName() );


        
        Directory root = new Directory("root");
        File settings = new File("Settings", 10);
        root.add(settings);

        Directory music = new Directory("music");
        File ringtone = new File("ringtone", 120);
        music.add(ringtone);
        root.add(music);

        Directory pictures = new Directory("pictures");

        Directory personal = new Directory("personal");
        File familyHoliday = new File("family-holiday", 201);
        File portrait = new File("portrait", 134);
        personal.add(familyHoliday);
        personal.add(portrait);
        pictures.add(personal);

        Directory misc = new Directory("misc");
        File wallpaper = new File("wallpaper", 421);
        misc.add(wallpaper);

        pictures.add(misc);
        root.add(pictures);
        System.out.println(root.display("\t"));

         

        // Test Case 1: Single File in Root PASS
        
        Directory root1 = new Directory("root");
        File file1 = new File("singlefile", 10);
        root1.add(file1);
        System.out.println(root1.display("\t"));
        System.out.println(root1.search("singlefile").getName());
         

        // Test Case 2 PASS
        
        Directory root2 = new Directory("root");
        Directory level1 = new Directory("Level1");
        Directory level2 = new Directory("Level2");
        Directory level3 = new Directory("Level3");
        File targetfile = new File("targetfile", 500);

        level3.add(targetfile);
        level2.add(level3);
        level1.add(level2);
        root2.add(level1);

        System.out.println(root2.display("\t"));
        System.out.println(root2.search("targetfile").getName());
         

        // Test Case 3: Multiple Matches in Different Locations PASS
        
        Directory root3 = new Directory("root");
        Directory dirA = new Directory("A");
        Directory dirB = new Directory("B");
        File duplicate1 = new File("duplicatefile", 50);
        File duplicate2 = new File("duplicatefile", 11);
        File fileA = new File("anotherfile", 50);

        dirA.add(duplicate1);
        dirA.add(fileA);
        dirB.add(duplicate2);

        root3.add(dirA);
        root3.add(dirB);

        System.out.println(root3.display("\t"));
        System.out.println(root3.search("duplicatefile").getName());

        

        // Test Case 4: PASS

        Directory root4 = new Directory("root");
        File file2 = new File("file1", 10);
        Directory emptydir = new Directory("emptydir");

        root4.add(file2);
        root4.add(emptydir);

        System.out.println(root4.display("\t"));


        // Test 5 PASS

        Directory root5 = new Directory("root");
        File file3 = new File("file1", 100);
        File file4 = new File("file2", 200);

        root5.add(file3);
        root5.add(file4);

        System.out.println(root5.display("\t"));
        root5.remove(file3);
        System.out.println(root5.display("\t"));


        // Test 6 PASS
        Directory root6 = new Directory("root");
        File file5 = new File("fileX", 123);
        root6.add(file5);

        Component searchResult = root6.search("nonexistentfile");
        System.out.println(searchResult == null ? "null" : searchResult.getName());

    }
}
