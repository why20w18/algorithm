package OOP.AbstractDataBase;



public class SQLDatabase extends BaseDatabaseManager{

    @Override
    public void erisimDataBase() {
        System.out.println("SQL Erisim Saglandi !");
    }
    
    @Override
    public void notAbstract(){
        super.notAbstract();
        System.out.println("SQL Uzerinde");
    }


    
}
