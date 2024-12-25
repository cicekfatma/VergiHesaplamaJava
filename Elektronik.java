public class Elektronik implements IUrun {
    @Override
    public void kabulEt(IZiyaretci ziyaretci){
        ziyaretci.elektronikVisit(this);
    }
}
