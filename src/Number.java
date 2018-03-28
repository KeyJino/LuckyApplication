public class Number {
    private int position;
    private boolean even;
    private int value;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isEven() {
        setEven();
        return even;
    }

    private void setEven() {
        even = isEven(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
