package service;

import entity.TapAz;

import java.util.List;

public interface TapAzService {

    List<TapAz>getPrice(int price);
    List<TapAz>getlocation(String location);
    List<TapAz>getbrand(String brand);
    List<TapAz>getcontact(String contact);
    List<TapAz>getPriceAndName(int price,String name);
    List<TapAz>getByDeliveredAndnewproduct(boolean delivered,boolean newproduct);
}
