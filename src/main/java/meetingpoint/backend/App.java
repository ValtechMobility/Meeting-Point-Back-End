/*
 * App.java
 *
 * Created on 2019-04-05
 */
package meetingpoint.backend;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
