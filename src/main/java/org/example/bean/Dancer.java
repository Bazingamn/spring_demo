package org.example.bean;

public class Dancer {
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void Show() {
        stage.CreateStageSuccess();
        System.out.println("dancer up");
    }
}
