package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableBoolean extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR;
    public boolean g;

    static {
        ObservableBoolean.CREATOR = new f(1);
    }

    public ObservableBoolean() {
    }

    public ObservableBoolean(boolean z) {
        this.g = z;
    }

    public ObservableBoolean(Observable[] arr_observable) {
        super(arr_observable);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean get() {
        return this.g;
    }

    public void set(boolean z) {
        if(z != this.g) {
            this.g = z;
            this.notifyChange();
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(((int)this.g));
    }
}

