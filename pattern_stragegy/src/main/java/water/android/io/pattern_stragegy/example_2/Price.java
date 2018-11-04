package water.android.io.pattern_stragegy.example_2;

public class Price {

    private MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double booksPrice) {
        return this.strategy.calcPrice(booksPrice);
    }
}
