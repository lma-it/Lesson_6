package solid.SRP_principle;

public class DataManager {
    
    private boolean check(String fileNameOfConnect){
        return true;
    }

    public void saveAllText(Planner planner, String path){
        if(check(path));
    }

    public void loadFromFile(Planner planner, String path){
        if(check(path));
    }

    public void loadFromBD(String url, String userName, String password){
        if(check(url));
    }
}
