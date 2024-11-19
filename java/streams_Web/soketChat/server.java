package streams_Web.soketChat;

import java.io.*;
import java.net.*;



public class server {
    public static int portNo = 6666;
    public static void main(String[] args) {
     
        try{
            System.out.println("Server olusturuluyor ...");
            ServerSocket serverSoket = new ServerSocket(portNo);
            System.out.println("Server olusturuldu !");
            Socket soket = serverSoket.accept();
            System.out.println("Istemci baglandi !");
            
            DataInputStream  girdi = new DataInputStream(soket.getInputStream());
            DataOutputStream cikti = new DataOutputStream(soket.getOutputStream());
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            
            String mesaj1 = "",mesaj2 = "";
            
            while(mesaj1.equals("cikis")){
                mesaj1 = girdi.readUTF();
                System.out.println(mesaj1+"ilk mesaj");
                mesaj2 = buff.readLine();
                cikti.writeUTF(mesaj2);
                cikti.flush();
                
            }/*
            soket.close();
            serverSoket.close();
            girdi.close();
            */
        } 
        catch(Exception e){
        }
        
        
    }
    
}
