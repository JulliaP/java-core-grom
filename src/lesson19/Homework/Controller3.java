package lesson19.Homework;

import java.util.Arrays;

public class Controller3 {

    public File put(Storage storage, File file) {

        int freeSlotIndex = -1;
        long storageId = storage.getId();
        long fileId = file.getId();
        // naxodim pustoj slot v Files array
        for (int i = 0; i < storage.getFiles().length; i++) {
            if (storage.getFiles() != null && storage.getFiles()[i] == null) {
                freeSlotIndex = i;
                break;
            }
        }

        // Esli slot ne najden, pervyj exception - storage is full
        if (freeSlotIndex == -1) {

            // String errorMsg = "Storage is full";
            System.out.println("Can't save " + fileId + "into storage" + storageId);
            throw new RuntimeException("Can't save " + fileId + "Storage " + storageId + "is full");
            // throw no storage
        }

        // vtoroj exception - Unsupported format
        boolean formatIsSupported = false;

        for (String f : storage.getFormatsSupported()) {
            if (f != null && f.equals(file.getFormat())) {
                formatIsSupported = true;
                break;
            }
        }

        if (!formatIsSupported) {
            String errorMsg = "Format is not supported";
            System.out.println(errorMsg + storageId + fileId);
            throw new RuntimeException(errorMsg);
        }
        // third exception - Id is already present
        boolean idIsPresent = false;
        for (File f : storage.getFiles()) {
            if (f != null && f.getId() == file.getId()) {
                idIsPresent = true;
                break;
            }
        }

        if (idIsPresent) {
            String errorMsg = "Id is already present in storage";
            System.out.println(errorMsg + storageId + fileId);
            throw new RuntimeException(errorMsg);
        }

        storage.getFiles()[freeSlotIndex] = file;

        // Chtoby vyvesti Array v konsole ne dostatochno prosto napisat' Arrays.toString, nado eshjo dobavit' metod
        // ToString v klass Files cherez Generate

        System.out.println(Arrays.toString(storage.getFiles()));

        return file;
    }

    public File delete(Storage storage, File file) {

        boolean idIsFound = false;

        for (int i = 0; i < storage.getFiles().length; i++) {
            if (storage.getFiles() != null && storage.getFiles()[i].equals(file)) {
                storage.getFiles()[i] = null;
                idIsFound = true;
                break;
            }

            if (idIsFound != true) {
                String errorMsg = "Id is not found";
                System.out.println(errorMsg + storage.getId());
                throw new RuntimeException(errorMsg);
            }

        }
        System.out.println(Arrays.toString(storage.getFiles()));
        return file;
    }

    public File[] transferAll(Storage storageFrom, Storage storageTo) {

        for (File file : storageFrom.getFiles()) {
            try {
                put(storageTo, file);
            } catch (RuntimeException e) {
                if (e.getMessage() != null && e.getMessage().contains("Format is not supported")) {
                    continue;
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
     * public void transferAll2(Storage storageFrom, Storage storageTo) {
     * 
     * for (File file : storageFrom.getFiles()) { try { put(storageTo, file); } catch (UnsupportedFormatException e) {
     * continue; } catch (StorageIsFullException e2) { break; } } }
     */
    public File transferFile(Storage storageFrom, Storage storageTo, long id) {

        // (long id, String name, String format, long size)
        /*
         * for (int i = 0; i < storageFrom.getFiles().length; i++) { if (storageFrom.getFiles()[i].getId() == (id)) {
         * for (int j = 0; j < storageTo.getFiles().length; j++) { if (storageTo.getFiles()[j] == null) {
         * storageTo.getFiles()[j] = storageFrom.getFiles()[i]; break; } } } }
         * System.out.println(Arrays.toString(storageTo.getFiles()) + "Soxranili file v Storage#2"); return null; }
         */
        File fileToTransfer = null;

        for (File file : storageFrom.getFiles()) {
            if (file != null && file.getId() == id) {
                fileToTransfer = file;
                break;
            }

            try {
                put(storageTo, fileToTransfer);

            } catch (RuntimeException e) {

                if (e.getMessage() != null && e.getMessage().contains("Format is not supported")) {
                    continue;
                }

                if (e.getMessage() != null && e.getMessage().contains("Storage is full")) {
                    break;
                }

                throw e;
            }

            // delete fileToTransfer from storageFrom

        }
        return fileToTransfer;
    }

}
