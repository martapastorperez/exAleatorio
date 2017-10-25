
package exaleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Product {
    String[] codes={"p1","p2","p3"};
        String[] descricion ={"parafusos","cravos ","tachas"};
        int[] prices ={3,4,5};
          RandomAccessFile fichero = null;

    public Product() {
    }

    public void setCodes(String[] codes) {
        this.codes = codes;
    }

    public void setDescricion(String[] descricion) {
        this.descricion = descricion;
    }

    public void setPrices(int[] prices) {
        this.prices = prices;
    }

    public String[] getCodes() {
        return codes;
    }

    public String[] getDescricion() {
        return descricion;
    }

    public int[] getPrices() {
        return prices;
    }
        
     
     
     public void lecturaEscritura() throws FileNotFoundException{
         
         try {    
             fichero =  new RandomAccessFile("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/textAleatorio.txt","rw");
            
            for(int i=0;i<3;i++){
            String formateoCodes =    String.format("%-"+3+"s",codes[i]);               
                fichero.writeChars(formateoCodes);
              String formateoDes =    String.format("%-"+10+"s",descricion[i]);  
              fichero.writeChars(formateoDes);
              fichero.writeInt(prices[i]);
               
            }
         
     }  catch (IOException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
          
     public void ler(int p) throws FileNotFoundException{
         
         String cod = " ";
         String desc = " ";
         int pre =0;
         try {
             
             fichero.seek((p-1)*30);
                      for(int i=0;i<3;i++){
             
             cod +=fichero.readChar();
             
                      }
                      
         for(int i=0;i<10;i++){
             
             desc +=fichero.readChar();
          
         }       
             
         pre = fichero.readInt();
             System.out.println(cod+desc+pre);
        
     }  catch (IOException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
          
  

}


