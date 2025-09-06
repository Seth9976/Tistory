package coil.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A<\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0005H\u0080\b\u00A2\u0006\u0002\u0010\u0006\u001AF\u0010\u0007\u001A\u0002H\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\b\u001A\u0002H\u00022\u0018\u0010\t\u001A\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\nH\u0080\b\u00A2\u0006\u0002\u0010\u000B\u001A3\u0010\f\u001A\u00020\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0018\u0010\u000E\u001A\u0014\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\r0\nH\u0080\b\u001A-\u0010\u0010\u001A\u00020\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\r0\u0005H\u0080\b\u001A]\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00020\u0012\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010\u0002*\u00020\u0015*\u000E\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u00122 \u0010\u0004\u001A\u001C\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0005H\u0080\b\u001A-\u0010\u0017\u001A\u00020\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00182\u0012\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u001A0\u0005H\u0080\b\u001A\u001E\u0010\u001B\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0000\u001A0\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u0012\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0014*\u000E\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u0012H\u0000\u00A8\u0006\u001D"}, d2 = {"firstNotNullOfOrNullIndices", "T", "R", "", "transform", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "foldIndices", "initial", "operation", "Lkotlin/Function2;", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "forEachIndexedIndices", "", "action", "", "forEachIndices", "mapNotNullValues", "", "K", "V", "", "", "removeIfIndices", "", "predicate", "", "toImmutableList", "toImmutableMap", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-Collections")
@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\ncoil/util/-Collections\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public final class -Collections {
    @Nullable
    public static final Object firstNotNullOfOrNullIndices(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = function10.invoke(list0.get(v1));
            if(object0 != null) {
                return object0;
            }
        }
        return null;
    }

    public static final Object foldIndices(@NotNull List list0, Object object0, @NotNull Function2 function20) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = function20.invoke(object0, list0.get(v1));
        }
        return object0;
    }

    public static final void forEachIndexedIndices(@NotNull List list0, @NotNull Function2 function20) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(v1, list0.get(v1));
        }
    }

    public static final void forEachIndices(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(list0.get(v1));
        }
    }

    @NotNull
    public static final Map mapNotNullValues(@NotNull Map map0, @NotNull Function1 function10) {
        Map map1 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = function10.invoke(map$Entry0);
            if(object1 != null) {
                map1.put(map$Entry0.getKey(), object1);
            }
        }
        return map1;
    }

    public static final void removeIfIndices(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = v1 - v2;
            if(((Boolean)function10.invoke(list0.get(v3))).booleanValue()) {
                list0.remove(v3);
                ++v2;
            }
        }
    }

    @NotNull
    public static final List toImmutableList(@NotNull List list0) {
        switch(list0.size()) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return Collections.singletonList(CollectionsKt___CollectionsKt.first(list0));
            }
            default: {
                return Collections.unmodifiableList(new ArrayList(list0));
            }
        }
    }

    @NotNull
    public static final Map toImmutableMap(@NotNull Map map0) {
        switch(map0.size()) {
            case 0: {
                return x.emptyMap();
            }
            case 1: {
                Map.Entry map$Entry0 = (Map.Entry)CollectionsKt___CollectionsKt.first(map0.entrySet());
                return Collections.singletonMap(map$Entry0.getKey(), map$Entry0.getValue());
            }
            default: {
                return Collections.unmodifiableMap(new LinkedHashMap(map0));
            }
        }
    }
}

