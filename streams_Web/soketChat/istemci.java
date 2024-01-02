package streams_Web.soketChat;

import java.net.*;
import java.io.*;

public class istemci {
    
    public static String HostAdres = "192.168.68.31";
    public static int portNo = 6666;
    
    public static void main(String[] args) {
        
        try{ 
            System.out.println("Servera Baglanti Bekleniyor ...");
           Socket soket = new Socket(HostAdres, portNo);
            System.out.println("Servera Baglanti Basarili ...");
           
           //istemci hem mesaj alacak hem gönderecek bu yuzden 2stream birden calisir
           DataInputStream  girdi = new DataInputStream(soket.getInputStream());
           DataOutputStream cikti = new DataOutputStream(soket.getOutputStream());
           BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
           
           //
           String mesaj = "merhaba", mesaj2 = "dunya";
           
           while(!mesaj.equals("cikis")){
               mesaj = buff.readLine();
               cikti.writeUTF(mesaj);
               cikti.flush();
               
               mesaj2 = girdi.readUTF();
           }
           /*
           cikti.close();
           soket.close();
           */
        } 
        catch (Exception e){
        
        }
        
        
    }
}
