/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.mp3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class ThreadMp3 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Integer> arr=new ArrayList<Integer>();
    public static void main(String[] args) {
        // TODO code application logic here
            oku("sarki.mp3");
        
        Thread thread1=new Thread(new Runnable() {
                @Override
                public void run() {
                    kopyala("sarki4.mp3");  
                }
            });
       Thread thread2=new Thread(new Runnable() {
                @Override
                public void run() {
                    kopyala("sarki5.mp3");
                }
            });
       long baslangic=System.currentTimeMillis();
       thread1.start();
       thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadMp3.class.getName()).log(Level.SEVERE, null, ex);
        }
     
               
        long bitis=System.currentTimeMillis();
        System.out.println("Süre:"+(bitis-baslangic)/1000);
      
    }
    public static void oku(String dosya){
          FileInputStream fis=null;
        try {
            fis=new FileInputStream(dosya);
            int deger;
            while((deger=fis.read())!=-1){
                arr.add(deger);
                deger++;
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Okuma hatası");
        }
        finally{
            try {
                if(fis!=null){
                     fis.close();
                }
            } catch (IOException ex) {
                System.out.println("Dosya kapama hatası");
            }
        }
    }
    public static void kopyala(String dosya){
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(dosya);
            for(int i:arr){
            fos.write(i);    
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dısya hatası");
        } catch (IOException ex) {
            System.out.println("Yazma hatası");
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Kapatma hatası");
            }
        }
    }
    }
    

