import java.util.Scanner;

public class TextEditor{
    public static void main(String[] args){
        Functions f=new Functions();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Simple Text Editor!");
        f.commands();
        while(true){
            System.out.print("Enter Command: ");
            String str=sc.nextLine();
            if(str.equals("exit")){
                System.out.println("System exited. Thank you.");
                break;
            }
            if(!str.equals("delete") && !str.equals("undo") && !str.equals("redo") && !str.equals("display") && !str.equals("help")){
                f.add(str);
            }
            else if(str.equals("delete")){
                f.delete();
            }
            else if(str.equals("undo")){
                f.undo();
            }
            else if(str.equals("redo")){
                f.redo();
            }
            else if(str.equals("display")){
                System.out.println();
                System.out.println(f.display());
                System.out.println();
            }
            else if(str.equals("help")){
                System.out.println();
                f.commands();
                System.out.println();
            }
            
        }
        sc.close();
    }
}