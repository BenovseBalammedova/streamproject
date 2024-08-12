package serviceImpl;

import entity.TapAz;
import service.CommonService;
import service.TapAzService;

import java.util.ArrayList;
import java.util.List;

public class TapAzServiceImpl implements CommonService<TapAz>, TapAzService {
    static List<TapAz>tapAzList=new ArrayList<>();
    static {
        tapAzList.add(new TapAz("Watch", 1, 1200, true, true, "Baku", "Apple", "050"));
        tapAzList.add(new TapAz("Phone", 2, 2100, true, true, "Shaki", "Samsung", "055"));
        tapAzList.add(new TapAz("Notbook", 3, 1600, true, true, "Quba", "Acer", "070"));

    }
    @Override
    public void add(TapAz common) {
       tapAzList.add(common);

    }

    @Override
    public void delete(int id) {
        tapAzList.remove(id-1);

    }

    @Override
    public List<TapAz> common() {
        return tapAzList;
    }

    @Override
    public void update(TapAz common) {
         List<String>list=new ArrayList<>();
         for (TapAz name:tapAzList){
           list.add(name.getName());
         }
    }

    @Override
    public TapAz getById(int id) {
        return tapAzList.stream().filter(tapaz->tapaz.getId()==id).toList().get(0);
    }

    @Override
    public List<TapAz> getPrice(int price) {
        return tapAzList.stream().filter(tapAz -> tapAz.getPrice()>price&&tapAz.getPrice()<price).toList();
    }

    @Override
    public List<TapAz> getlocation(String location) {
        return tapAzList.stream().filter(tapAz -> tapAz.getLocation().equals(location)).toList();
    }

    @Override
    public List<TapAz> getbrand(String brand) {
        return tapAzList.stream().filter(tapAz -> tapAz.getBrand().equals(brand)).toList();
    }

    @Override
    public List<TapAz> getcontact(String contact) {
        return tapAzList.stream().filter(tapAz -> tapAz.getContact().substring(0,3).equals(contact)).toList();
    }

    @Override
    public List<TapAz> getPriceAndName(int price, String name) {
        return tapAzList.stream().filter(tapAz -> tapAz.getPrice()==price&&tapAz.getName().equals(name)).toList();
    }

    @Override
    public List<TapAz> getByDeliveredAndnewproduct(boolean delivered, boolean newproduct) {
        return tapAzList.stream().filter(tapAz -> tapAz.isDelivered()==delivered&&tapAz.isNewproduct()==newproduct).toList();
    }
}
