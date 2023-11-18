package classwork.homework1.fileutil;

import java.io.Serializable;
import java.util.Objects;

public class  Files implements Serializable {
    private String PATH;
    private String FILE_NAME;

    public Files() {
    }

    public Files(String PATH, String FILE_NAME) {
        this.PATH = PATH;
        this.FILE_NAME = FILE_NAME;
    }

    @Override
    public String toString() {
        return "Files{" +
                "PATH='" + PATH + '\'' +
                ", FILE_NAME='" + FILE_NAME + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Files files = (Files) o;

        if (!Objects.equals(PATH, files.PATH)) return false;
        return Objects.equals(FILE_NAME, files.FILE_NAME);
    }

    @Override
    public int hashCode() {
        int result = PATH != null ? PATH.hashCode() : 0;
        result = 31 * result + (FILE_NAME != null ? FILE_NAME.hashCode() : 0);
        return result;
    }
}
