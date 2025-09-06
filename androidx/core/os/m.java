package androidx.core.os;

import android.os.Parcel;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public abstract class m {
    @DoNotInline
    public static List a(@NonNull Parcel parcel0, @NonNull List list0, @Nullable ClassLoader classLoader0) {
        return parcel0.readParcelableList(list0, classLoader0);
    }
}

