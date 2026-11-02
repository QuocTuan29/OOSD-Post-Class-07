package adapter;

/**
 * Demo Adapter Pattern - Chốt vuông vào lỗ tròn
 */
public class AdapterDemo {
    public static void main(String[] args) {
        // Lỗ tròn bán kính 5
        RoundHole hole = new RoundHole(5);

        // Chốt tròn bán kính 5 → vừa
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println("Chốt tròn r=5 vừa lỗ? " + hole.fits(rpeg)); // true

        // Chốt vuông width=5 và width=10
        SquarePeg smallSq = new SquarePeg(5);
        SquarePeg largeSq = new SquarePeg(10);

        // Không thể gọi trực tiếp: hole.fits(smallSq); → lỗi compile

        // Dùng Adapter
        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSq);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largeSq);

        System.out.println("Chốt vuông w=5 (qua Adapter) vừa lỗ? " + hole.fits(smallAdapter)); // true
        System.out.println("Chốt vuông w=10 (qua Adapter) vừa lỗ? " + hole.fits(largeAdapter)); // false

        System.out.println("\nBán kính tương đương của chốt vuông w=5: " + String.format("%.2f", smallAdapter.getRadius()));
        System.out.println("Bán kính tương đương của chốt vuông w=10: " + String.format("%.2f", largeAdapter.getRadius()));
    }
}
