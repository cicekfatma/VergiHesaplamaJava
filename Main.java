//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            IUrun elektronik = new Elektronik();
            IUrun giyim = new Giyim();
            IUrun yiyecek = new Yiyecek();

            IZiyaretci fiyatziyaretcisi = new UrunFiyatZiyaretcisi();
            elektronik.kabulEt(fiyatziyaretcisi);
            giyim.kabulEt(fiyatziyaretcisi);
            yiyecek.kabulEt(fiyatziyaretcisi);

    }
}