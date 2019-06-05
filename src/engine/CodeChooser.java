package engine;

public class CodeChooser {

    private int click;
    private String color;
    Colors colors;

    /**
     * The method sets the color corresponding to the number of clicked button.
     * @param click - number from 1 to 6 depends on how many times button was clicked.
     * @return color.
     */
    public String setColor(int click){
        this.click = click;

        if(click == 1){
            color = colors.RED.getColorName();
        }else if (click ==2){
            color = colors.GREEN.getColorName();
        }else if (click ==3){
            color = colors.BLUE.getColorName();
        }else if (click ==4){
            color = colors.YELLOW.getColorName();
        }else if (click ==5){
            color = colors.PURPLE.getColorName();
        }else if (click ==6) {
            color = colors.PINK.getColorName();
        }else if (click ==7) {
        color = colors.WHITE.getColorName();
        }else if (click ==8) {
            color = colors.BLACK.getColorName();
        }
            return color;
    }

    /**
     * The method resets the counter if it is greater than 6.
     * @param clickCode - how many times button was clicked.
     * @return zeroed counter
     */
    public static int searchClick(int clickCode){

        if(clickCode >=6){ clickCode = 0;}
        clickCode++;
        return clickCode;
    }



}
