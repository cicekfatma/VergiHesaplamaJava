public class Yiyecek implements IUrun{
    @Override
    public void kabulEt(IZiyaretci ziyaretci){
        ziyaretci.yiyecekVisit(this);
    }
}
