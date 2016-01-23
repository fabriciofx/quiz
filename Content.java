import java.io.IOException;

public interface Content {
  String data() throws IOException;
  void save(String content) throws IOException;
}
