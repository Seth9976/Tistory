package androidx.core.content;

import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class j {
    @DoNotInline
    public static Object[] a(@NonNull Intent intent0, @Nullable String s, @NonNull Class class0) {
        return intent0.getParcelableArrayExtra(s, class0);
    }

    @DoNotInline
    public static ArrayList b(@NonNull Intent intent0, @Nullable String s, @NonNull Class class0) {
        return intent0.getParcelableArrayListExtra(s, class0);
    }

    @DoNotInline
    public static Object c(@NonNull Intent intent0, @Nullable String s, @NonNull Class class0) {
        return intent0.getParcelableExtra(s, class0);
    }

    @DoNotInline
    public static Serializable d(@NonNull Intent intent0, @Nullable String s, @NonNull Class class0) {
        return intent0.getSerializableExtra(s, class0);
    }
}

