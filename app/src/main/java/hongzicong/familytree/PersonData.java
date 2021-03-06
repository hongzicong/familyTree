package hongzicong.familytree;

/**
 * Created by DELL-PC on 2017/12/4.
 */

public class PersonData {

    private String mName;
    private int mId;
    private int parentId;
    private boolean isMale;
    private int picture;
    private int mAge;

    public PersonData(int mId,int parentId,String mName,int picture,boolean isMale,int age){
        this.mId=mId;
        this.parentId=parentId;
        this.mName=mName;
        this.isMale=isMale;
        this.picture=picture;
        this.mAge=age;
    }

    public int getPicture(){
        return picture;
    }

    public void setPicture(int picture){
        this.picture=picture;
    }

    public int getId(){
        return mId;
    }

    public int getParentId(){
        return parentId;
    }

    public boolean getIsMale(){
        return isMale;
    }

    public String getName(){
        return this.mName;
    }

    public void setId(int id){
        this.mId=id;
    }

    public void setParentId(int id){
        this.parentId=id;
    }

    public void setAge(int age){
        this.mAge=age;
    }

    public int getAge(){
        return mAge;
    }
}
