public class Functions{
    public String str="";
    public SL s=new SL();
    public SL s2=new SL();
    public void commands(){
        System.out.println("Command Summary:");
        System.out.println("delete  -  Delete the last character");
        System.out.println("undo    -  Undo the last action (removes the last change you made).");
        System.out.println("redo    -  Redo the last undone action (restores the last undone change).");
        System.out.println("display -  Display the current text.");
        System.out.println("exit    -  Exit the editor (ends the editing session).");
        System.out.println("help    -  To view the command list");
    }
    public void add(String x){
        str+=" "+x;
        s.push(str);
    }
    public void delete(){
        String modified="";
        for(int i=0;i<str.length()-1;i++){
            modified+=str.charAt(i);
        }
        str=modified;
        s.push(str);
    }
    public void undo(){
        if(s.isEmpty()){
            System.out.println("Nothing to undo");
            return;
        }
        System.out.println();
        System.out.println("Last action undone");
        s2.push(s.pop());
        System.out.println("Current text: "+s.peek());
        System.out.println();
    }
    public void redo(){
        if(s2.isEmpty()){
            System.out.println("Nothing to undo");
            return;
        }
        System.out.println();
        System.out.println("Redo successful");
        s.push(s2.pop());
        System.out.println("Current text: "+s.peek());
        System.out.println();
    }
    public String display(){
        return s.peek();
    }
}