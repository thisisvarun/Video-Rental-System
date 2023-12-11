import java.util.*;

class Video
{
    String VideoName;
    boolean checkOut;
    int rating;
    public Video(String name){
        VideoName = name;
    }
    public String getName(){
        return VideoName;
    }
    public void doCheckout(){
        
    }
    public void doReturn(){

    }
    public void recieveRating(int rating){
        this.rating = rating;
    }
    public int getRating(){
        return rating;
    }
    public boolean getCheckout(){
        return checkOut;
    }
}
class VideoStore
{
    Video[] store;
    public void addVideo(String name){

    }
    public void doCheckout(String name){

    }
    public void doReturn(String name){

    }
    public void recieveRating(String name,int rating){

    }
    public void listInventory(){

    }
}
class VideoLauncher
{
    static VideoStore v = new VideoStore();
    static Scanner sc = new Scanner(System.in);
    static String name;
    static int rating;
    public static void addVideo(){
        System.out.print("Enter the name of the video you want to add :");
        name = sc.nextLine();
        v.addVideo(name);
    }
    public static void doCheckout(){
        System.out.print("Enter the name of the video you want to Checkout :");
        name = sc.nextLine();
        v.doCheckout(name);
    }
    public static void doReturn(){
        System.out.print("Enter the name of the video you want to Return :");
        name = sc.nextLine();
        v.doReturn(name);
    }
    public static void recieveRating(){
        System.out.print("Enter the name of the video you want to rate :");
        name = sc.nextLine();
        System.out.print("Enter the rating for this Video :");
        rating = sc.nextInt();
        v.recieveRating(name, rating);
    }
    public static void listInventory(){
        v.listInventory();
    }
    public static void showOptions(){
        System.out.println("MAIN MENU");
        System.out.println("==========");
        System.out.println("1. Add Videos      :");
        System.out.println("2. Check out Video :");
        System.out.println("3. Return Video    :");
        System.out.println("4. Receive Rating  :");
        System.out.println("5. List Inventory  :");
        System.out.println("6. Exit            :");
        System.out.print("Enter your choice(1..6):");
    }
    public static void main(String args[]){
        int ch;
        while (true){
            showOptions();
            ch = sc.nextInt();
            switch(ch){
                case 1: {addVideo();break;}
                case 2: {doCheckout();break;}
                case 3: {doReturn();break;}
                case 4: {recieveRating();break;}
                case 5: {listInventory();break;}
                case 6:{
                    System.out.println("Exiting...!! Thanks for using the application.");
                    System.exit(0);
                }
            }
        }
    }
}