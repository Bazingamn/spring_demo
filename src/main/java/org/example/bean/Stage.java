package org.example.bean;

public class Stage {
    private static Stage instance;
    public static Stage getInstance() {
        if (instance == null){
            instance = new Stage();
        }
        return instance;
    }

    public void CreateStageSuccess() {
        System.out.println("Stage Build Success");
    }
}
