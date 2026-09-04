package jp.ac.meijou.android.a20260903teamwork;

public class SerachItem {

    private int imageTop;
    private int imageUser;
    private  String user;
    private String title;

    public SerachItem(int imageTop, int imageUser, String user, String title){
        this.imageTop = imageTop;
        this.imageUser = imageUser;
        this.user = user;
        this.title = title;
    }

    public int getImageTop(){
        return imageTop;
    }
    public int getImageUser(){
        return imageUser;
    }
    public String getUser(){
        return user;
    }
    public  String getTitle(){
        return title;
    }
}
