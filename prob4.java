public class prob4 {
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int total;
    public prob4 () {
        hp = 0;
        attack = 0;
        defense = 0;
        speed = 0;
        total = 0;
    }
    public prob4(int h, int a, int d, int s) {
        if (h < 255 && a < 255 && d < 255 && s < 255) {
            if ( (h + a + d + s) <= 510) {
                hp = h;
                attack = a;
                defense = d;
                speed = s;
                total = h + a + d + s;
            }
        }
    }
}
