package structural.facade;

/**
 * 
 * @author Alexander
 *
 */
class App {
  public static void main(String[] args) {
    Compiler compiler = new Compiler();
    compiler.compile("int a;");
  }
}
