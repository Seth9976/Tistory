package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableLong extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR;
    public long g;

    static {
        ObservableLong.CREATOR = new f(7);
    }

    public ObservableLong() {
    }

    public ObservableLong(long v) {
        this.g = v;
    }

    public ObservableLong(Observable[] arr_observable) {
        super(arr_observable);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long get() {
        return this.g;
    }

    public void set(long v) {
        if(v != this.g) {
            this.g = v;
            this.notifyChange();
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.g);
    }
}

