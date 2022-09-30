package bt3_bai4;

public class Fan {
    int slow,medium,fast;

    public Fan() {
    }

    public Fan(int slow, int medium, int fast) {
        this.slow = slow;
        this.medium = medium;
        this.fast = fast;
    }

    public int getSlow() {
        return slow;
    }

    public void setSlow(int slow) {
        this.slow = 1;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = 2;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = 3;
    }
}
