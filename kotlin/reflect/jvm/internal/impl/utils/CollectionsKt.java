package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\ncollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1208#2,2:96\n1238#2,4:98\n1#3:102\n*S KotlinDebug\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n22#1:96,2\n22#1:98,4\n*E\n"})
public final class CollectionsKt {
    public static final void addIfNotNull(@NotNull Collection collection0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        if(object0 != null) {
            collection0.add(object0);
        }
    }

    @NotNull
    public static final List compact(@NotNull ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "<this>");
        switch(arrayList0.size()) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return k.listOf(CollectionsKt___CollectionsKt.first(arrayList0));
            }
            default: {
                arrayList0.trimToSize();
                return arrayList0;
            }
        }
    }

    @NotNull
    public static final Map mapToIndex(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Map map0 = new LinkedHashMap();
        int v = 0;
        for(Object object0: iterable0) {
            map0.put(object0, v);
            ++v;
        }
        return map0;
    }

    @NotNull
    public static final HashMap newHashMapWithExpectedSize(int v) {
        return new HashMap((v < 3 ? 3 : v / 3 + v + 1));
    }

    @NotNull
    public static final HashSet newHashSetWithExpectedSize(int v) {
        return new HashSet((v < 3 ? 3 : v / 3 + v + 1));
    }

    @NotNull
    public static final LinkedHashSet newLinkedHashSetWithExpectedSize(int v) {
        return new LinkedHashSet((v < 3 ? 3 : v / 3 + v + 1));
    }
}

