package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class s {
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map eachCount(@NotNull Grouping grouping0) {
        Intrinsics.checkNotNullParameter(grouping0, "<this>");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Iterator iterator0 = grouping0.sourceIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = grouping0.keyOf(object0);
            IntRef ref$IntRef0 = linkedHashMap0.get(object1);
            if(ref$IntRef0 == null && !linkedHashMap0.containsKey(object1)) {
                ref$IntRef0 = new IntRef();
            }
            ++ref$IntRef0.element;
            linkedHashMap0.put(object1, ref$IntRef0);
        }
        for(Object object2: linkedHashMap0.entrySet()) {
            Intrinsics.checkNotNull(((Map.Entry)object2), "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            TypeIntrinsics.asMutableMapEntry(((Map.Entry)object2)).setValue(((IntRef)((Map.Entry)object2).getValue()).element);
        }
        return TypeIntrinsics.asMutableMap(linkedHashMap0);
    }
}

