package engine;

public enum Colors {

    RED(1,"red"),GREEN(2,"green"),BLUE(3,"blue"),YELLOW(4,"yellow"),PURPLE(5,"purple"),PINK(6,"pink");

    private final int colorNumber;
    private final String colorName;

    Colors(int colorNumber,String colorName) {
        this.colorNumber = colorNumber;
        this.colorName = colorName;
    }

    public int getColorNumber() {
        return colorNumber;
    }

    public String getColorName() {
        return colorName;
    }
}
