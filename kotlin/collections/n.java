package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class n extends m {
    public static void sort(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        if(list0.size() > 1) {
            Collections.sort(list0);
        }
    }

    public static void sortWith(@NotNull List list0, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(list0.size() > 1) {
            Collections.sort(list0, comparator0);
        }
    }
}

