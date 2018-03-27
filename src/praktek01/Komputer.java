/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author ASUS
 */
public class Komputer {
    String merk;
    String jenis;
    String spesifikasi;
    Integer harga;
    Integer stok;
    
    void cetakinfo()
    {
        System.out.println("merk        :"+ merk);
        System.out.println("jenis       :"+ jenis);
        System.out.println("spesifikasi :"+ spesifikasi);
        System.out.println("harga       :"+harga);
        System.out.println("stok        :"+stok);
    }
    
    
}
