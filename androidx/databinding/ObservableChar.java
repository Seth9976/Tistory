package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableChar extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR;
    public char g;

    static {
        ObservableChar.CREATOR = new f(3);
    }

    public ObservableChar() {
    }

    public ObservableChar(char c) {
        this.g = c;
    }

    public ObservableChar(Observable[] arr_observable) {
        super(arr_observable);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public char get() {
        return this.g;
    }

    public void set(char c) {
        if(c != this.g) {
            this.g = c;
            this.notifyChange();
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(((int)this.g));
    }
}

