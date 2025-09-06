package y7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.appcompat.widget.m;
import com.google.android.material.internal.ParcelableSparseArray;

public final class d implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public ParcelableSparseArray b;

    static {
        d.CREATOR = new m(20);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeParcelable(this.b, 0);
    }
}

