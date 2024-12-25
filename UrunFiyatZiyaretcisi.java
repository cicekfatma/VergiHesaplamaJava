public class UrunFiyatZiyaretcisi implements IZiyaretci {
    @Override
    public void elektronikVisit(Elektronik elektronik){
        System.out.println("Elektronik:fiyat hesaplandı.");
    }
    @Override
    public void giyimVisit(Giyim giyim){
        System.out.println("Giyim:indirim yapildi");
    }
    @Override
    public void yiyecekVisit(Yiyecek yiyecek){
        System.out.println("Yiyecek: vergi hesaplandi  ");
    }
}
