package pd;

import java.util.Comparator;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class e extends d {
    @SinceKotlin(version = "1.1")
    public static final Object maxOf(Object object0, Object object1, Object object2, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return e.maxOf(object0, e.maxOf(object1, object2, comparator0), comparator0);
    }

    @SinceKotlin(version = "1.1")
    public static final Object maxOf(Object object0, Object object1, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return comparator0.compare(object0, object1) >= 0 ? object0 : object1;
    }

    @SinceKotlin(version = "1.4")
    public static final Object maxOf(Object object0, @NotNull Object[] arr_object, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object1 = arr_object[v];
            if(comparator0.compare(object0, object1) < 0) {
                object0 = object1;
            }
        }
        return object0;
    }

    @SinceKotlin(version = "1.1")
    public static final Object minOf(Object object0, Object object1, Object object2, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return e.minOf(object0, e.minOf(object1, object2, comparator0), comparator0);
    }

    @SinceKotlin(version = "1.1")
    public static final Object minOf(Object object0, Object object1, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return comparator0.compare(object0, object1) <= 0 ? object0 : object1;
    }

    @SinceKotlin(version = "1.4")
    public static final Object minOf(Object object0, @NotNull Object[] arr_object, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "other");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object1 = arr_object[v];
            if(comparator0.compare(object0, object1) > 0) {
                object0 = object1;
            }
        }
        return object0;
    }
}

