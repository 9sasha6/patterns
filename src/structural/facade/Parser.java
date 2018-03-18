package structural.facade;

/**
 * 
 * @author Alexander
 *
 */
class Parser {

  public String parse(String str) {
    System.out.println("syntactic analyze");
    return str.substring(0, 4);
  }
}
