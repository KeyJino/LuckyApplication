public class PeterHappy extends Combination{

    private int countEven;
    private int countUneven;

    PeterHappy(String title) {
        super(title);
    }

    @Override
    public boolean isWin(Number[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i].isEven()){
                countEven =+ numbers[i].getValue();
            } else {
                countUneven =+ numbers[i].getValue();
            }
        }

        if(countEven == countUneven) {
            return true;
        } else {
            return false;
        }
    }
}
