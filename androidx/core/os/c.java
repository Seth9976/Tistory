package androidx.core.os;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class c {
    @DoNotInline
    public static Object a(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        return bundle0.getParcelable(s, class0);
    }

    @DoNotInline
    public static Object[] b(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        return bundle0.getParcelableArray(s, class0);
    }

    @DoNotInline
    public static ArrayList c(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        return bundle0.getParcelableArrayList(s, class0);
    }

    @DoNotInline
    public static Serializable d(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        return bundle0.getSerializable(s, class0);
    }

    @DoNotInline
    public static SparseArray e(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        return bundle0.getSparseParcelableArray(s, class0);
    }
}

