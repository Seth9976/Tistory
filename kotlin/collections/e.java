package kotlin.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class e {
    @NotNull
    public static final Object[] arrayOfNulls(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "reference");
        Object object0 = Array.newInstance(arr_object.getClass().getComponentType(), v);
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[])object0;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepHashCode")
    public static final int contentDeepHashCode(@Nullable Object[] arr_object) {
        return Arrays.deepHashCode(arr_object);
    }

    @SinceKotlin(version = "1.3")
    public static final void copyOfRangeToIndexCheck(int v, int v1) {
        if(v > v1) {
            throw new IndexOutOfBoundsException("toIndex (" + v + ") is greater than size (" + v1 + ").");
        }
    }

    public static final Object[] orEmpty(Object[] arr_object) {
        if(arr_object == null) {
            Intrinsics.reifiedOperationMarker(0, "T?");
            return new Object[0];
        }
        return arr_object;
    }

    public static final Object[] toTypedArray(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.reifiedOperationMarker(0, "T?");
        return collection0.toArray(new Object[0]);
    }
}

