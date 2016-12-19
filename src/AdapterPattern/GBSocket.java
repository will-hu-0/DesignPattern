package AdapterPattern;

/**
 * Created by will on 16-12-19.
 */
public class GBSocket implements GBSocketInterface {
    @Override
    public void powerWithThreeFlat() {
        System.out.printf("使用三项扁头插孔供电");
    }
}
