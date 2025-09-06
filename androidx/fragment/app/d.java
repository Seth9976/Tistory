package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.ArrayList;

public final class d implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final ArrayList a;
    public final ArrayList b;

    static {
        d.CREATOR = new b(1);
    }

    public d(Parcel parcel0) {
        this.a = parcel0.createStringArrayList();
        this.b = parcel0.createTypedArrayList(c.CREATOR);
    }

    public d(ArrayList arrayList0, ArrayList arrayList1) {
        this.a = arrayList0;
        this.b = arrayList1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeStringList(this.a);
        parcel0.writeTypedList(this.b);
    }
}

