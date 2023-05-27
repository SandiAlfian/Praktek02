package praktek02;
public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle rl = new Rectangle();
        
        rl.Panjang = 9;
        rl.Lebar = 3;
        
        rl.cetakInfo();
        
        System.out.println("Luas Rectangle = " + rl.hitungLuas());
    }
}
