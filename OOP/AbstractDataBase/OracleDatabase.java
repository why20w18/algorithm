package OOP.AbstractDataBase;



public class OracleDatabase extends BaseDatabaseManager{

    @Override
    public void erisimDataBase() {
    
        System.out.println("Oracle Erisim Saglandi !");
    }

    @Override
    public void notAbstract() {
        super.notAbstract(); 
        System.out.println("Oracle Uzerinde");
    }
    
    

    

    
}
