public class prob4 {
    public prob4 () {
        hp = 0;
        attack = 0;
        defense = 0;
        speed = 0;
    }
    public prob4(int h, int a, int d, int s) {
        if (h < 255 && a < 255 && d < 255 && s < 225) {
            hp = h;
            attack = a;
            defense = d;
            speed = s;
        }
    }
}
