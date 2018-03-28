public abstract class Combination {

    private String title;
    private boolean isWin;

    Combination(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getResult() {
        return isWin;
    }

    public void setResult(boolean isWin) {
        this.isWin = isWin;
    }

    protected void isWin(){}

    public abstract boolean isWin(Number[] numbers);
}

