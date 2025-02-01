package basics;

public class ControlStatements {

    enum myChar{
        A,
        B
    }

    public static void main(String[] args){
        ControlStatements controlStatements = new ControlStatements();
        controlStatements.ifElseCheck();
        controlStatements.forLoopCheck();
        controlStatements.forEachLoopCheck();
        controlStatements.whileLoopCheck();
        controlStatements.switchCheck();

    }

    public void ifElseCheck(){
        boolean flag = false;
        String str = "tom";
        if(flag){
            System.out.println("I am in if");
        } else {
            System.out.println("I am in Else block");
        }
        if(str.equalsIgnoreCase("Tom") || flag){
            System.out.println("I am in if");
        } else {
            System.out.println("I am in Else block");
        }
    }

    public void forLoopCheck(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            if (i==3){
                break;
                //continue;
            }
        }
    }

    public void forEachLoopCheck(){
        String[] arr = {"a","b","c"};
        for (String letter : arr){
            System.out.println(letter);
            if (letter.equalsIgnoreCase("b")){
                break;
            }
        }
    }

    public void whileLoopCheck(){
        int i = 5;
        while(i > 0){
            System.out.println(i);
            i--;
            if (i == 4){
                break;
            }
        }
    }

    public void switchCheck(){
        String str = "Anything";
        myChar nowChar = myChar.B; //Enums can be used to get the compilation error if the wrong values are used in switch case
        switch (nowChar){
            case A:
                System.out.println(nowChar);
                break;
            case B:
                System.out.println(nowChar);
                break;
//            default:
//                System.out.println(str); // default is not required if you are using enums
        }
    }
}
