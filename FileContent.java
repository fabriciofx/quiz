import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public final class FileContent implements Content {
  private final File file;
  public FileContent(final File file) {
    this.file = file;
  }
  public String data() throws IOException {
    return new String(Files.readAllBytes(file.toPath()));
  }
  public void save(final String data) throws IOException {
    Files.write(file.toPath(), data.getBytes());
  }
}
