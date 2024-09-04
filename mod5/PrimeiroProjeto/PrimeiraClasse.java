public class PrimeiraClasse {
  public static void main(String[] args) {
    String message;

    if (args.length < 1 || args[0].trim().isEmpty()) {
      message = "Hello, World!";
    } else {
      String name = args[0].trim(); 
      message = "Hello, " + name + "!";
    }

    System.out.println(message);
  }
}
