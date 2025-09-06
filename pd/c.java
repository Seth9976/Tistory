package pd;

import androidx.compose.foundation.text.selection.n1;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class c {
    @NotNull
    public static Comparator compareBy(@NotNull Function1[] arr_function1) {
        Intrinsics.checkNotNullParameter(arr_function1, "selectors");
        if(arr_function1.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new n1(((Serializable)arr_function1), 2);
    }

    public static int compareValues(@Nullable Comparable comparable0, @Nullable Comparable comparable1) {
        if(comparable0 == comparable1) {
            return 0;
        }
        if(comparable0 == null) {
            return -1;
        }
        return comparable1 == null ? 1 : comparable0.compareTo(comparable1);
    }

    public static final int compareValuesBy(Object object0, Object object1, @NotNull Function1[] arr_function1) {
        Intrinsics.checkNotNullParameter(arr_function1, "selectors");
        if(arr_function1.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for(int v = 0; v < arr_function1.length; ++v) {
            Function1 function10 = arr_function1[v];
            int v1 = c.compareValues(((Comparable)function10.invoke(object0)), ((Comparable)function10.invoke(object1)));
            if(v1 != 0) {
                return v1;
            }
        }
        return 0;
    }

    @NotNull
    public static Comparator naturalOrder() {
        Intrinsics.checkNotNull(f.b, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return f.b;
    }

    @NotNull
    public static final Comparator nullsFirst(@NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return new a(comparator0, 1);
    }

    @NotNull
    public static final Comparator nullsLast(@NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return new a(comparator0, 0);
    }

    @NotNull
    public static Comparator reverseOrder() {
        Intrinsics.checkNotNull(f.c, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return f.c;
    }

    @NotNull
    public static final Comparator reversed(@NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(comparator0, "<this>");
        if(comparator0 instanceof g) {
            return ((g)comparator0).a;
        }
        f f0 = f.b;
        boolean z = Intrinsics.areEqual(comparator0, f0);
        f f1 = f.c;
        if(z) {
            Intrinsics.checkNotNull(f1, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return f1;
        }
        if(Intrinsics.areEqual(comparator0, f1)) {
            Intrinsics.checkNotNull(f0, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return f0;
        }
        return new g(comparator0);
    }

    @NotNull
    public static final Comparator then(@NotNull Comparator comparator0, @NotNull Comparator comparator1) {
        Intrinsics.checkNotNullParameter(comparator0, "<this>");
        Intrinsics.checkNotNullParameter(comparator1, "comparator");
        return new b(comparator0, comparator1, 1);
    }

    @NotNull
    public static final Comparator thenDescending(@NotNull Comparator comparator0, @NotNull Comparator comparator1) {
        Intrinsics.checkNotNullParameter(comparator0, "<this>");
        Intrinsics.checkNotNullParameter(comparator1, "comparator");
        return new b(comparator0, comparator1, 0);
    }
}

