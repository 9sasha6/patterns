package structural.bridge;

/**
 * 
 * @author Alexander
 *
 */
class App {

  public static void main(String[] args) {
    Shape triangle = new Triangle(new RedColor());
    triangle.draw();
    Shape sqShape = new Square(new BlueColor());
    sqShape.draw();
  }
}
