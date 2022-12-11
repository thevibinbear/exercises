public class prob2 {
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int total;

    public prob2 () {
        hp = 0;
        attack = 0;
        defense = 0;
        speed = 0;
    }
    public prob2 (int h, int a, int d, int s) {
        hp = h;
        attack = a;
        defense = d;
        speed = s;
    }
    public void calculateTotal() {
        total = hp + attack + defense + speed;
    }
    public int getTotal() {
        return total;
    }
    public int getHP() {
        return hp;
    }
}
