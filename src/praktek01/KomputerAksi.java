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
public class KomputerAksi {
  public static void main(String[]args){
      Komputer Dell = new Komputer();
      
      Dell.merk="DELL XPS 13";
      Dell.jenis="Ultrabook";
      Dell.spesifikasi="LAYAR TN PANEL 4K DISPLAY";
      Dell.harga="23.000.000";
      Dell.stok="tiga unit";
      
      Dell.cetakinfo();
      
      Komputer Macbook = new Komputer();
      
      Macbook.merk="APPlE MACBOOK ";
      Macbook.jenis="Ultrabook";
      Macbook.spesifikasi="LAYAR  RETINA DISPLAY";
      Macbook.harga="25.000.000";
      Macbook.stok="lima unit";
      
      Macbook.cetakinfo();
      
      Komputer Asus = new Komputer();
      Asus.merk="ASUS ROG GX800";
      Asus.jenis="Gaming netbook";
      Asus.spesifikasi="LAYAR IPS 4K DISPLAY 144HZ";
      Asus.harga="90.000.000";
      Asus.stok="satu unit";
      
      
      Asus.cetakinfo();
  }
}
