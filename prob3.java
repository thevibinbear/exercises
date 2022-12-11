public class prob3 {
    public void compare() {
        prob2 p1 = new prob2();
        prob2 p2 = new prob3(9, 2, 1, 30);
        if (p1.getHP() > p2.getHP()) {
            System.out.println("Pokemon 1 has more health than Pokemon 2!");
        }
        else {
            System.out.println("Pokemon 2 has more health than Pokemon 1!");
        }
    }
}
