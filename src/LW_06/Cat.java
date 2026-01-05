package LW_06;

public class Cat extends Pet{

    private String coatColor;

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public String speak(){
        return "";
    }
}
