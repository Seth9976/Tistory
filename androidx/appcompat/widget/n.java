package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class n implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;

    static {
        n.CREATOR = new m(0);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
    }
}

