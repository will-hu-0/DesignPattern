package AdapterPattern;

/**
 * Created by will on 16-12-19.
 * 德标插座
 */
public class DBSocket implements DBSocketInterface {
    @Override
    public void powerWithTwoRound() {
        System.out.printf("使用两项圆头的插孔供电");
    }
}
