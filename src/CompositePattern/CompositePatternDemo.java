package CompositePattern;

/**
 * Created by will on 16-12-13.
 * http://www.runoob.com/design-pattern/composite-pattern.html
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        /**
         * Ready to build the file system like:
         *
         * MainFolder()
         * |-- m.txt
         * |-- m.jpg
         * |-- mSubFolder()
         *          |-- s.txt
         *          |-- s.jpg
         *          |-- s.rmvb
         */
        Folder mainFolder = new Folder("MainFolder");
        TextFile mText = new TextFile("m.txt");
        ImageFile mImage = new ImageFile("m.jpg");
        Folder mSubFolder = new Folder("mSubFolder");

        // Add all above stuff into MainFolder
        mainFolder.add(mText);
        mainFolder.add(mImage);
        mainFolder.add(mSubFolder);


        TextFile sText = new TextFile("s.txt");
        ImageFile sImage = new ImageFile("s.jpg");
        VideoFile sVideo = new VideoFile("s.rmvb");

        // Add all above stuff into mSubFolder, which is the folder in MainFolder
        mSubFolder.add(sText);
        mSubFolder.add(sImage);
        mSubFolder.add(sVideo);

        // Display
        System.out.println("Display the mSubFolder:");
        mSubFolder.display();

        // Remove s.txt from mSubFolder
        System.out.println("Removing s.txt");
        mSubFolder.remove(sText);

        System.out.println("Display the mSubFolder again:");
        mSubFolder.display();
    }
}
