class car{
public void move() {
System.out.println("moving");

}
public void brake() {
System.out.println("brakeing");

}
}
class audi extends car{
public void autopilot() {
System.out.println("audi car on autopilot mode");


}
public void autogear() {
System.out.println("audi car on autogear mode");

}
}
class test{
public static void main(String [] args) {
  car c = new car();
  audi a = new audi();
  c.move();
  c.brake();
  a.autopilot();
  a.autogear();
  System.out.println("Testing");
  }
  }