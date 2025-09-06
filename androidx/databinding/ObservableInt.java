package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableInt extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR;
    public int g;

    static {
        ObservableInt.CREATOR = new f(6);
    }

    public ObservableInt() {
    }

    public ObservableInt(int v) {
        this.g = v;
    }

    public ObservableInt(Observable[] arr_observable) {
        super(arr_observable);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int get() {
        return this.g;
    }

    public void set(int v) {
        if(v != this.g) {
            this.g = v;
            this.notifyChange();
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.g);
    }
}

