package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

public abstract class g0 extends f0 {
    @NotNull
    public static Set minus(@NotNull Set set0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(set0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        Collection collection0 = o.convertToListIfNotCollection(iterable0);
        if(collection0.isEmpty()) {
            return CollectionsKt___CollectionsKt.toSet(set0);
        }
        if(collection0 instanceof Set) {
            Set set1 = new LinkedHashSet();
            for(Object object0: set0) {
                if(!collection0.contains(object0)) {
                    set1.add(object0);
                }
            }
            return set1;
        }
        Set set2 = new LinkedHashSet(set0);
        ((AbstractCollection)set2).removeAll(collection0);
        return set2;
    }

    @NotNull
    public static Set minus(@NotNull Set set0, Object object0) {
        Intrinsics.checkNotNullParameter(set0, "<this>");
        Set set1 = new LinkedHashSet(w.mapCapacity(set0.size()));
        boolean z = false;
        for(Object object1: set0) {
            boolean z1 = true;
            if(!z && Intrinsics.areEqual(object1, object0)) {
                z = true;
                z1 = false;
            }
            if(z1) {
                set1.add(object1);
            }
        }
        return set1;
    }

    @NotNull
    public static final Set minus(@NotNull Set set0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(set0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        Set set1 = new LinkedHashSet(set0);
        o.removeAll(set1, sequence0);
        return set1;
    }

    @NotNull
    public static final Set minus(@NotNull Set set0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(set0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        Set set1 = new LinkedHashSet(set0);
        o.removeAll(set1, arr_object);
        return set1;
    }

    @NotNull
    public static Set plus(@NotNull Set set0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(set0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        Integer integer0 = l.collectionSizeOrNull(iterable0);
        Set set1 = new LinkedHashSet(w.mapCapacity((integer0 == null ? set0.size() * 2 : set0.size() + integer0.intValue())));
        ((AbstractCollection)set1).addAll(set0);
        o.addAll(set1, iterable0);
        return set1;
    }

    @NotNull
    public static Set plus(@NotNull Set set0, Object object0) {
        Intrinsics.checkNotNullParameter(set0, "<this>");
        Set set1 = new LinkedHashSet(w.mapCapacity(set0.size() + 1));
        ((AbstractCollection)set1).addAll(set0);
        ((AbstractCollection)set1).add(object0);
        return set1;
    }

    @NotNull
    public static final Set plus(@NotNull Set set0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(set0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        Set set1 = new LinkedHashSet(w.mapCapacity(set0.size() * 2));
        ((AbstractCollection)set1).addAll(set0);
        o.addAll(set1, sequence0);
        return set1;
    }

    @NotNull
    public static final Set plus(@NotNull Set set0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(set0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        Set set1 = new LinkedHashSet(w.mapCapacity(set0.size() + arr_object.length));
        ((AbstractCollection)set1).addAll(set0);
        o.addAll(set1, arr_object);
        return set1;
    }
}

