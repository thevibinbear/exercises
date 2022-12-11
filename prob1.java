public class prob1 {
    private boolean isFishing;
    private boolean isFighting;
    private int hitPoints;
    public prob1 (boolean isFishing, boolean isFighting, int hitPoints) {
        this.isFishing = isFishing;
        this.isFighting = isFighting;
        this.hitPoints = hitPoints;
    }
    public void damage(int amountOfDamage) {
        hitPoints -= amouuntOfDamage;
    }
}
