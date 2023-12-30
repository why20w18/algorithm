package OOP.AbstractDataBase;


public class Main {
    
    public static void main(String[] args) {
        
        BaseDatabaseManager base;
        
        //base = new OracleDatabase();
        base = new SQLDatabase();
        
        base.erisimDataBase();
        base.notAbstract();
    }
    
}
