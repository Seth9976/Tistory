package androidx.core.os;

import android.os.Parcelable.Creator;

@Deprecated
public final class ParcelableCompat {
    @Deprecated
    public static Parcelable.Creator newCreator(ParcelableCompatCreatorCallbacks parcelableCompatCreatorCallbacks0) {
        return new p(parcelableCompatCreatorCallbacks0);
    }
}

