public class Plant2 {
    private boolean isAlive;
    private int soilMoistureLevel;
    private String nickname;
    private int height;

    public Plant2(boolean isAlive, int soilMoistureLevel, String nickname, int height) {
        this.isAlive = isAlive;
        this.soilMoistureLevel = soilMoistureLevel;
        this.nickname = nickname;
        this.height = height;
    }
    public void setNickname(String nick) {
        nickname = nick;
    }
    public String getNickname() {
        return nickname;
    }
    public void water(int water) {
        soilMoistureLevel += water;
    }
    public boolean isDead() {
        return !isAlive;
    }
}