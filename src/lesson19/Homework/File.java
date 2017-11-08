package lesson19.Homework;

public class File {

    private long id;
    private String name;
    private String format;
    private long size;

    public File(long id, String name, String format, long size) {

        if (name.length() > 10) {
            String errorMsg = "File name is too long";
            System.out.println(errorMsg);
            throw new RuntimeException(errorMsg);
        }

        this.id = id;
        this.name = name;
        this.format = format;
        this.size = size;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public long getSize() {
        return size;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        if (id != other.id) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        // zamenili ( na } chtoby udobnee chitat'
        // Ubrali probel v nachale
        return "File{id=" + id + ", name=" + name + ", format=" + format + ", size=" + size + "}";
    }
}
