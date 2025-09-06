package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class p implements Parcelable.ClassLoaderCreator {
    public final ParcelableCompatCreatorCallbacks a;

    public p(ParcelableCompatCreatorCallbacks parcelableCompatCreatorCallbacks0) {
        this.a = parcelableCompatCreatorCallbacks0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        return this.a.createFromParcel(parcel0, null);
    }

    @Override  // android.os.Parcelable$ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
        return this.a.createFromParcel(parcel0, classLoader0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return this.a.newArray(v);
    }
}

