package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableShort extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR;
    public short g;

    static {
        ObservableShort.CREATOR = new f(8);
    }

    public ObservableShort() {
    }

    public ObservableShort(short v) {
        this.g = v;
    }

    public ObservableShort(Observable[] arr_observable) {
        super(arr_observable);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public short get() {
        return this.g;
    }

    public void set(short v) {
        if(v != this.g) {
            this.g = v;
            this.notifyChange();
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(((int)this.g));
    }
}

