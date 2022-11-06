package src;
class RandomNumbers extends Observable{
    private int number;
    public void setNumber() {
        this.number =  (int) (Math.random() * 200) + 1;
        super.notifying();
    }
    public int getNumber() {
        return number;
    }
}
