package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class m extends CollectionsKt__IteratorsJVMKt {
    public static final void forEach(@NotNull Iterator iterator0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(iterator0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "operation");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            function10.invoke(object0);
        }
    }

    @NotNull
    public static final Iterator withIndex(@NotNull Iterator iterator0) {
        Intrinsics.checkNotNullParameter(iterator0, "<this>");
        return new IndexingIterator(iterator0);
    }
}

