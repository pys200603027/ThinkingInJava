package water.android.io.pattern_stragegy.example_2.strategy;

/**
 * 初级会员策略
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("对于初级会员的没有折扣");
        return bookPrice;
    }
}
