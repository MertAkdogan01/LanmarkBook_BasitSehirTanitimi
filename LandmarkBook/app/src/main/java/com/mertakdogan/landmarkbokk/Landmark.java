package com.mertakdogan.landmarkbokk;

import java.io.Serializable;

public class Landmark implements Serializable {
    
    String name;
    String country;
    int image; //her bir görsele integer atanıyor yani resmi integer olarak saklayabiliyoruz


    public Landmark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
        //sağ taraftaki name country image parantezin içindekilere pararlel
    }
}
