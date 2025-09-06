package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

public class ObjectsCompat {
    public static boolean equals(@Nullable Object object0, @Nullable Object object1) {
        return Objects.equals(object0, object1);
    }

    public static int hash(@Nullable Object[] arr_object) {
        return Objects.hash(arr_object);
    }

    public static int hashCode(@Nullable Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    @NonNull
    public static Object requireNonNull(@Nullable Object object0) {
        object0.getClass();
        return object0;
    }

    @NonNull
    public static Object requireNonNull(@Nullable Object object0, @NonNull String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    @Nullable
    public static String toString(@Nullable Object object0, @Nullable String s) {
        return object0 == null ? s : object0.toString();
    }
}

