package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.internal.HidesMembers;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

public abstract class z extends y {
    public static final boolean all(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        if(map0.isEmpty()) {
            return true;
        }
        for(Object object0: map0.entrySet()) {
            if(!((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        return !map0.isEmpty();
    }

    public static final boolean any(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        if(map0.isEmpty()) {
            return false;
        }
        for(Object object0: map0.entrySet()) {
            if(((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @NotNull
    public static Sequence asSequence(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        return CollectionsKt___CollectionsKt.asSequence(map0.entrySet());
    }

    public static final int count(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = 0;
        if(map0.isEmpty()) {
            return 0;
        }
        for(Object object0: map0.entrySet()) {
            if(((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                ++v;
            }
        }
        return v;
    }

    @NotNull
    public static final List flatMap(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            o.addAll(list0, ((Iterable)function10.invoke(((Map.Entry)object0))));
        }
        return list0;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequence")
    @NotNull
    public static final List flatMapSequence(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            o.addAll(list0, ((Sequence)function10.invoke(((Map.Entry)object0))));
        }
        return list0;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequenceTo")
    @NotNull
    public static final Collection flatMapSequenceTo(@NotNull Map map0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: map0.entrySet()) {
            o.addAll(collection0, ((Sequence)function10.invoke(((Map.Entry)object0))));
        }
        return collection0;
    }

    @NotNull
    public static final Collection flatMapTo(@NotNull Map map0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: map0.entrySet()) {
            o.addAll(collection0, ((Iterable)function10.invoke(((Map.Entry)object0))));
        }
        return collection0;
    }

    @HidesMembers
    public static final void forEach(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(Object object0: map0.entrySet()) {
            function10.invoke(((Map.Entry)object0));
        }
    }

    @NotNull
    public static final List map(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList(map0.size());
        for(Object object0: map0.entrySet()) {
            list0.add(function10.invoke(((Map.Entry)object0)));
        }
        return list0;
    }

    @NotNull
    public static final List mapNotNull(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        List list0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            Object object1 = function10.invoke(((Map.Entry)object0));
            if(object1 != null) {
                list0.add(object1);
            }
        }
        return list0;
    }

    @NotNull
    public static final Collection mapNotNullTo(@NotNull Map map0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: map0.entrySet()) {
            Object object1 = function10.invoke(((Map.Entry)object0));
            if(object1 != null) {
                collection0.add(object1);
            }
        }
        return collection0;
    }

    @NotNull
    public static final Collection mapTo(@NotNull Map map0, @NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        for(Object object0: map0.entrySet()) {
            collection0.add(function10.invoke(((Map.Entry)object0)));
        }
        return collection0;
    }

    public static final boolean none(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        return map0.isEmpty();
    }

    public static final boolean none(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        if(map0.isEmpty()) {
            return true;
        }
        for(Object object0: map0.entrySet()) {
            if(((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map onEach(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        for(Object object0: map0.entrySet()) {
            function10.invoke(((Map.Entry)object0));
        }
        return map0;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Map onEachIndexed(@NotNull Map map0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = 0;
        for(Object object0: map0.entrySet()) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            function20.invoke(v, object0);
            ++v;
        }
        return map0;
    }

    @NotNull
    public static List toList(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        if(map0.size() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return k.listOf(new Pair(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue()));
        }
        List list0 = new ArrayList(map0.size());
        ((ArrayList)list0).add(new Pair(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue()));
        do {
            Object object1 = iterator0.next();
            ((ArrayList)list0).add(new Pair(((Map.Entry)object1).getKey(), ((Map.Entry)object1).getValue()));
        }
        while(iterator0.hasNext());
        return list0;
    }
}

