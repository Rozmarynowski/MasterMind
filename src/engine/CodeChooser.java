package engine;

public class CodeChooser {

    private int click;
    private String color;
    Colors colors;

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
        }

            return color;
    }

    public static int searchClick(int clickCode){

        if(clickCode >=6){ clickCode = 0;}
        clickCode++;
        System.out.println(clickCode);

        return clickCode;
    }



}
