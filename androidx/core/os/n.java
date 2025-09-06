package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class n {
    @DoNotInline
    public static Parcelable.Creator a(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0) {
        return parcel0.readParcelableCreator(classLoader0);
    }
}

