package lesson19.Homework;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) throws Exception {
        // File file = new File(256, "File1gfhfhfhfhfhfh", "pdf", 2);
        // System.out.println("File has been created");

        Controller controller = new Controller();
        File file1 = new File(256, "File1", "pdf", 1);
        File file2 = new File(456, "File2", "txt", 2);
        File file3 = new File(562, "File3", "pdf", 3);
        File file4 = new File(862, "File3", "xls", 2);
        // long id, String name, String format, long size

        File[] files1 = new File[] { file1, file2, file3 };
        File[] files2 = new File[] { null, null, null };

        String formatSupported1 = "xls";
        String formatSupported2 = "txt";
        String formatSupported3 = "pdf";

        String[] formatSupportedSt1 = new String[] { formatSupported1, formatSupported3 };
        String[] formatSupportedSt2 = new String[] { formatSupported1, formatSupported2 };
        Storage st1 = new Storage(1, files1, formatSupportedSt1, "Ukraine", 3);

        Storage st2 = new Storage(2, files2, formatSupportedSt2, "Sweden", 6);
        // long id, File[] files, String[] formatsSupported, String storageCountry, long storageSize

        // controller.put(st1, file3);
        // controller.put(st1, file2);
        // controller.put(st1, file3);
        // System.out.println(controller.put(st1, file1) + "dobavili fail");

        // System.out.println(controller.delete(st1, file4) + "Removed this file");
        // controller.transferFile(st1, st2, 256);
        // System.out.println(Arrays.toString(controller.transferAll(st1, st2)) + "transfered all files");

        System.out.println(Arrays.toString(controller.transferFile(st1, st2, 256)) + "transfered file");
    }
}