package contacts;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class File {
    protected String directory;
    protected String name;
    protected Path dataFile;
    protected Path dataDirectory;


    public File(String directory, String name) {
        this.name = name;
        this.directory = directory;
        this.dataFile = Paths.get("./"+ this.directory + "/" + this.name);
        this.dataDirectory = Paths.get("./"+ this.directory);
    }

    private boolean open() {
        return true;
    }

    public List<String> read() {

        if (Files.exists(this.dataFile)) {
            try {
                return Files.readAllLines(this.dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            return (create()) ? read() : null;
        }
        return null;
    }

    private boolean create() {

        if (Files.notExists(this.dataDirectory)) {
            try {
                Files.createDirectories(this.dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        if (! Files.exists(this.dataFile)) {
            try {
                Files.createFile(this.dataFile);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        return true;
    }

    public boolean overwrite(List<String> data) {

        try {
            Files.write(dataFile, data);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


}
