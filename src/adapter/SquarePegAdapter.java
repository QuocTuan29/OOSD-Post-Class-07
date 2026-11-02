package adapter;

/**
 * Adapter - Chuyển SquarePeg thành RoundPeg
 * (Object Adapter - dùng composition)
 */
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        // Gọi constructor của RoundPeg với bán kính tạm thời
        super(0);
        this.peg = peg;
    }

    /**
     * Chuyển đổi: bán kính của hình tròn ngoại tiếp hình vuông
     * radius = (width * √2) / 2
     */
    @Override
    public double getRadius() {
        return (peg.getWidth() * Math.sqrt(2)) / 2;
    }
}
