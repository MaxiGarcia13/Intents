package example.com.prueba;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by maxig on 11/05/2018.
 */

public class Users implements Parcelable{

    String nombre, email,password;

    public Users(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }


    //PARCELABLE
    protected Users(Parcel in) {
        nombre = in.readString();
        email = in.readString();
        password = in.readString();
    }

    public static final Creator<Users> CREATOR = new Creator<Users>() {
        @Override
        public Users createFromParcel(Parcel in) {
            return new Users(in);
        }

        @Override
        public Users[] newArray(int size) {
            return new Users[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(email);
        parcel.writeString(password);
    }



    //PROPIEDADES
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
