package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableFloat extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR;
    public float g;

    static {
        ObservableFloat.CREATOR = new f(5);
    }

    public ObservableFloat() {
    }

    public ObservableFloat(float f) {
        this.g = f;
    }

    public ObservableFloat(Observable[] arr_observable) {
        super(arr_observable);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float get() {
        return this.g;
    }

    public void set(float f) {
        if(f != this.g) {
            this.g = f;
            this.notifyChange();
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeFloat(this.g);
    }
}

