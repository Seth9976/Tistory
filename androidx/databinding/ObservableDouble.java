package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableDouble extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR;
    public double g;

    static {
        ObservableDouble.CREATOR = new f(4);
    }

    public ObservableDouble() {
    }

    public ObservableDouble(double f) {
        this.g = f;
    }

    public ObservableDouble(Observable[] arr_observable) {
        super(arr_observable);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double get() {
        return this.g;
    }

    public void set(double f) {
        if(f != this.g) {
            this.g = f;
            this.notifyChange();
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeDouble(this.g);
    }
}

