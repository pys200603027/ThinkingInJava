package water.android.io.pattern_stragegy.example_2;

/**
 * 高级会员
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return bookPrice * 0.8;
    }
}
