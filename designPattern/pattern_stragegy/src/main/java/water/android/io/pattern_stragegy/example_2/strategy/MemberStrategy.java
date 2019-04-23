package water.android.io.pattern_stragegy.example_2.strategy;

/**
 * 会员策略
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     *
     * @param bookPrice 图书的原价
     * @return 计算出打折后的价格
     */
    double calcPrice(double bookPrice);
}
