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
      Dell.jenis="Netbook";
      Dell.spesifikasi="LAYAR IPS 4K DISPLAY"
              + "VGA 1080"
              + "CPU INTEL I7";
      Dell.harga="23.000.000";
      Dell.stok="tiga unit";
      
      Komputer Macbook = new Komputer();
      
      Macbook.merk="APPlE MACBOOK ";
      Macbook.jenis="Ultrabook";
      Macbook.spesifikasi="LAYAR  RETINA DISPLAY"
              + "VGA AMD RADEON PRO"
              + "CPU INTEL I7";
      Macbook.harga="25.000.000";
      Macbook.stok="lima unit";
      
      Komputer Asus = new Komputer();
      Asus.merk="ASUS ROG GX800";
      Asus.jenis="Gaming netbook";
      Asus.spesifikasi="LAYAR IPS 4K DISPLAY 144HZ"
              + "DUAL VGA 1080"
              + "CPU INTEL I7HQ";
      Asus.harga="90.000.000";
      Asus.stok="satu unit";
      
  }
}
