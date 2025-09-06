package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class l extends CollectionsKt__CollectionsKt {
    @PublishedApi
    public static int collectionSizeOrDefault(@NotNull Iterable iterable0, int v) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return iterable0 instanceof Collection ? ((Collection)iterable0).size() : v;
    }

    @PublishedApi
    @Nullable
    public static final Integer collectionSizeOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        return iterable0 instanceof Collection ? ((Collection)iterable0).size() : null;
    }

    @NotNull
    public static List flatten(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            o.addAll(list0, ((Iterable)object0));
        }
        return list0;
    }

    @NotNull
    public static final Pair unzip(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        int v = l.collectionSizeOrDefault(iterable0, 10);
        ArrayList arrayList0 = new ArrayList(v);
        ArrayList arrayList1 = new ArrayList(v);
        for(Object object0: iterable0) {
            arrayList0.add(((Pair)object0).getFirst());
            arrayList1.add(((Pair)object0).getSecond());
        }
        return TuplesKt.to(arrayList0, arrayList1);
    }
}

