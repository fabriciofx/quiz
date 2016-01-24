import java.io.IOException;

public final class NonUnicode implements Content {
  private final Content origin;
  public NonUnicode(final Content content) {
    this.origin = content;
  }
  public String data() throws IOException {
    return origin.data().replaceAll("\\P{Print}", "");
  }
  public void save(final String data) throws IOException {
    origin.save(data);
  }
}
