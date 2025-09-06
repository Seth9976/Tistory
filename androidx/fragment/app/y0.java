package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class y0 implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;

    static {
        y0.CREATOR = new b(2);
    }

    public y0(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeInt(this.b);
    }
}

