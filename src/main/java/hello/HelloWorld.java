package hello;

import java.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = LocalTime.now();
    System.out.println("La hora local es : " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
    System.out.println("Hola");
  }
}
