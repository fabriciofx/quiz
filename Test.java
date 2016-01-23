import java.io.File;
import java.io.IOException;

public final class Test {
  public static void main(String... args) throws IOException {
    final Content content = new FileContent(
        new File("document.txt")
    );
    System.out.println(content.data());

    final Content contentWithoutUnicode = new NonUnicode(
      new FileContent(
        new File("document.txt")
      )
    );
    System.out.println(contentWithoutUnicode.data());
  }
}
