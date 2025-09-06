package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableByte extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR;
    public byte g;

    static {
        ObservableByte.CREATOR = new f(2);
    }

    public ObservableByte() {
    }

    public ObservableByte(byte b) {
        this.g = b;
    }

    public ObservableByte(Observable[] arr_observable) {
        super(arr_observable);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte get() {
        return this.g;
    }

    public void set(byte b) {
        if(b != this.g) {
            this.g = b;
            this.notifyChange();
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeByte(this.g);
    }
}

