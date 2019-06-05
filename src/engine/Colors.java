package engine;

public enum Colors {

    RED(1,"red"),GREEN(2,"green"),BLUE(3,"blue"),YELLOW(4,"yellow"),PURPLE(5,"purple"),PINK(6,"pink"),WHITE(7,"white"),BLACK(8,"black");
    private final int colorNumber;
    private final String colorName;

    Colors(int colorNumber,String colorName) {
        this.colorNumber = colorNumber;
        this.colorName = colorName;
    }

    /**
     * The method returns the number corresponding to the color.
     * @return colorNumber.
     */
    public int getColorNumber() {
        return colorNumber;
    }
    /**
     * The method returns the color corresponding to the number.
     * @return colorName.
     */
    public String getColorName() {
        return colorName;
    }
}
