package lesson19.Homework;

import java.util.Arrays;

public class Controller {

    public File put(Storage storage, File file) throws Exception {

        storageIsFull(storage, file);
        findEmptySlot(storage, file);
        validFormat(storage, file);
        idIsPresent(storage, file);

        storage.getFiles()[findEmptySlot(storage, file)] = file;

        // Chtoby vyvesti Array v konsole ne dostatochno prosto napisat' Arrays.toString, nado eshjo dobavit' metod
        // ToString v klass Files cherez Generate

        System.out.println(Arrays.toString(storage.getFiles()));

        return file;
    }

    public File delete(Storage storage, File file) throws Exception {
        boolean idIsFound = false;
        for (int i = 0; i < storage.getFiles().length; i++) {

            if (storage.getFiles() != null && storage.getFiles()[i].equals(file)) {
                storage.getFiles()[i] = null;
                idIsFound = true;
                break;
            }
        }
        if (idIsFound != true) {

            throw new Exception("Can't delete file " + file.getId() + " from storage " + storage.getId() + " reason:Id is not found");
        }

        System.out.println(Arrays.toString(storage.getFiles()));
        return file;
    }

    public File[] transferAll(Storage storageFrom, Storage storageTo) throws Exception {

        for (File file : storageFrom.getFiles()) {

            try {
                put(storageTo, file);
            } catch (Exception e) {

                if (e.getMessage() != null && e.getMessage().contains("Format is not supported")) {
                    continue;
                }

                if (e.getMessage() != null && e.getMessage().contains("No empty slot")) {
                    break;
                }
                if (e.getMessage() != null && e.getMessage().contains("Storage is full")) {
                    break;
                }
                throw e;
            }
        }

        return storageTo.getFiles();
    }

    // -------------------------------------------------------------------
    /*
     * class StorageIsFullException extends RuntimeException { }
     * 
     * class UnsupportedFormatException extends RuntimeException { }
     * 
     */
    public File[] transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {

        File fileToTransfer = null;

        for (File file : storageFrom.getFiles()) {
            if (file != null && file.getId() == id) {
                fileToTransfer = file;
                break;
            }

            try {
                put(storageTo, fileToTransfer);

            } catch (Exception e) {

                if (e.getMessage() != null && e.getMessage().contains("Format is not supported")) {

                    System.out.println("Can't save file " + file.getId() + " into storage " + storageTo.getId() + " reason: Format is not supported" + e.getMessage());

                }

                if (e.getMessage() != null && e.getMessage().contains("No empty slot")) {
                    throw new Exception(
                            "Can't save file " + file.getId() + " into storage " + storageTo.getId() + " reason: No empty slot");
                }

                if (e.getMessage() != null && e.getMessage().contains("Storage is full")) {
                    throw new Exception(
                            "Can't save file " + file.getId() + " into storage " + storageTo.getId() + " Storage is full");
                }

                throw e;
            }

            // delete fileToTransfer from storageFrom

        }
        return storageTo.getFiles();
    }

    private File storageIsFull(Storage st, File fileToCheck) throws Exception {

        int sumOfFileSizes = 0;

        for (File f : st.getFiles()) {
            if (f != null) {
                sumOfFileSizes += f.getSize();
                System.out.println(sumOfFileSizes);
            }
        }
        if (st.getStorageSize() < (fileToCheck.getSize() + sumOfFileSizes)) {

            throw new Exception(
                    "Can't save file " + fileToCheck.getId() + " into storage " + st.getId() + " reason: Storage is full");
        }

        return fileToCheck;
    }

    private File validFormat(Storage st, File fileToCheck) throws Exception {

        boolean formatIsSupported = false;

        for (String f : st.getFormatsSupported()) {
            if (f != null && f.equals(fileToCheck.getFormat())) {
                formatIsSupported = true;
                break;
            }
        }

        if (!formatIsSupported) {

            throw new Exception(
                    "Can't save file " + fileToCheck.getId() + " into storage " + st.getId() + " reason:" + fileToCheck.getFormat() + " Format is not supported");
        }
        return fileToCheck;
    }

    private File idIsPresent(Storage st, File fileToCheck) throws Exception {

        boolean idIsPresent = false;
        for (File f : st.getFiles()) {
            if (f != null && f.getId() == fileToCheck.getId()) {
                idIsPresent = true;
                break;
            }
        }

        if (idIsPresent) {

            throw new Exception("Can't save file " + fileToCheck.getId() + " into storage " + st.getId() + " reason:Id is already present ");
        }
        return fileToCheck;
    }

    private int findEmptySlot(Storage st, File fileToCheck) throws Exception {
        int freeSlotIndex = -1;

        for (int i = 0; i < st.getFiles().length; i++) {
            if (st.getFiles() != null && st.getFiles()[i] == null) {
                freeSlotIndex = i;
                break;
            }
        }
        // pervyj exception - storage is full
        if (freeSlotIndex == -1) {

            throw new Exception("Can't save file " + fileToCheck.getId() + " into storage " + st.getId() + " , reason:No empty slot");

        }
        return freeSlotIndex;
    }
}
