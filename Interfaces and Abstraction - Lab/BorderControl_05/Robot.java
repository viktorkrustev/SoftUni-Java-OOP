package InterfacesAndAbstractionLab.BorderControl_05;

public class Robot implements Identifiable{
    private String id;
    private String model;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }


    @Override
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
