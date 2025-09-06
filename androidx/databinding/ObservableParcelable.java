package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableParcelable extends ObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR;

    static {
        ObservableParcelable.CREATOR = new f(0);
    }

    public ObservableParcelable() {
    }

    public ObservableParcelable(Parcelable parcelable0) {
        super(parcelable0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(((Parcelable)this.get()), 0);
    }
}

