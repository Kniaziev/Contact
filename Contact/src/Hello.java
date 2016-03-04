import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by admin on 3/3/2016.
 */
public class Hello {


    public static void main(String[] args) {
        int line = 1;

        //for (line=0;line<5;line++){
        switch (line) {
            case 3:
                if (line==3) {
                    System.out.println("Белеет парус одинокой");
                }
            case 2:
                if(line==2) {
                    System.out.println("В тумане моря голубом!..");
                }else{
                    System.out.println("В тумане моря голубом!..");
                }
            case 1:
                if(line==1) {
                    System.out.println("Что ищет он в стране далекой?");
                }else{
                    System.out.println("Что ищет он в стране далекой?");
                }
            case 0:
                System.out.println("Что кинул он в краю родном?..");
                break;
            default:
                System.out.println("Нет такой строки");
        }

    }
}




/*
* Белеет парус одинокой
В тумане моря голубом!..
Что ищет он в стране далекой?
Что кинул он в краю родном?..
* */
