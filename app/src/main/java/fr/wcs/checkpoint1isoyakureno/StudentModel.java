package fr.wcs.checkpoint1isoyakureno;
import android.os.Parcel;
import android.os.Parcelable;

public class StudentModel implements Parcelable{
    private String firstname;
    private String lastname;
    private String school;
    private String language;
    public StudentModel(String n,String p,String s,String l){
        super();
        this.firstname=n;
        this.lastname=p;
        this.school=s;
        this.language=l;
    }
    public StudentModel(Parcel in){
        this.firstname=in.readString();
        this.lastname=in.readString();
        this.school=in.readString();
        this.language=in.readString();
    }
    @Override public int describeContents() {return 0;}
    @Override public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstname);
        parcel.writeString(lastname);
        parcel.writeString(school);
        parcel.writeString(language);
    }
    public static final Parcelable.Creator<StudentModel>CREATOR=new Parcelable.Creator<StudentModel>(){
        @Override public StudentModel createFromParcel(Parcel in) {return new StudentModel(in);}
        @Override public StudentModel[] newArray(int size) {return new StudentModel[size];}
    };

    public String getFirstname() {return firstname;}
    public String getLastname() {return lastname;}
    public String getSchool() {return school;}
    public String getLanguage() {return language;}
    public static Parcelable.Creator<StudentModel>getCreator(){return CREATOR;}
}
