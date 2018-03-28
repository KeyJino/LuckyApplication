import java.util.ArrayList;
import java.util.List;

public class Checker {

    private List listWinCombination = new ArrayList();

    public List getWinCombination(Number[] numbers, Combination[] combinations){

        for (Combination item:
             combinations) {
            item.setResult(item.isWin(numbers));
            if(item.getResult()){
                listWinCombination.add(item);
            }
        }

        return listWinCombination;
    }
}
