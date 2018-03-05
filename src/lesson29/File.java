package lesson29;

//dobavili implements Comparable iz-za togo chto sperva dobavili metod compareTo
public class File implements Comparable<File> {

    private String fileName;
    private long sizeInBytes;

    // public File() {
    // }

    public File(String fileName, long sizeInBytes) {
        this.fileName = fileName;
        this.sizeInBytes = sizeInBytes;
    }

    public String getFileName() {
        return fileName;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    // vot etot metod compareTo dobavili iz-za lesson30, gde my ispolzuem TreeSet. Poka etogo metoda ne bylo,
    // klass TreeSetIntro ne rabotal, import ne importilsja, metod ne ispolnjalsja.

    // napominalka - poskol'ku Comparable - eto interface, ego metody dolzhny implementitsja/override
    // sortiruem po razmeru i ubyvaniju
    // mozhno bylo prokastit' k intu (int), no zdes' ne podhodit - poskol'ku pazmer mozhet vyhodit' za razmery inta.
    // poetomu dobavljaem variable
    @Override
    public int compareTo(File file) {
        int res = 0;
        if (file.getSizeInBytes() > this.sizeInBytes) {
            res = 1;
        } else if (file.getSizeInBytes() < this.sizeInBytes) {
            res = -1;
        }
        return res;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        File other = (File) obj;
        if (fileName == null) {
            if (other.fileName != null) {
                return false;
            }
        } else if (!fileName.equals(other.fileName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "File [fileName=" + fileName + ", sizeInBytes=" + sizeInBytes + "]";
    }

}
