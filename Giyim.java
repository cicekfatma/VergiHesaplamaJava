public class Giyim implements IUrun{
    @Override
    public void kabulEt(IZiyaretci ziyaretci){
        ziyaretci.giyimVisit(this);
    }
}
