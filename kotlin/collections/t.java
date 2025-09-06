package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class t extends s {
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map aggregate(@NotNull Grouping grouping0, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(grouping0, "<this>");
        Intrinsics.checkNotNullParameter(function40, "operation");
        Map map0 = new LinkedHashMap();
        Iterator iterator0 = grouping0.sourceIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = grouping0.keyOf(object0);
            Object object2 = map0.get(object1);
            map0.put(object1, function40.invoke(object1, object2, object0, Boolean.valueOf(object2 == null && !map0.containsKey(object1))));
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map aggregateTo(@NotNull Grouping grouping0, @NotNull Map map0, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(grouping0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function40, "operation");
        Iterator iterator0 = grouping0.sourceIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = grouping0.keyOf(object0);
            Object object2 = map0.get(object1);
            map0.put(object1, function40.invoke(object1, object2, object0, Boolean.valueOf(object2 == null && !map0.containsKey(object1))));
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map eachCountTo(@NotNull Grouping grouping0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(grouping0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Iterator iterator0 = grouping0.sourceIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = grouping0.keyOf(object0);
            Integer integer0 = map0.get(object1);
            if(integer0 == null && !map0.containsKey(object1)) {
                integer0 = 0;
            }
            map0.put(object1, ((int)(integer0.intValue() + 1)));
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map fold(@NotNull Grouping grouping0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(grouping0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        Map map0 = new LinkedHashMap();
        Iterator iterator0 = grouping0.sourceIterator();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Object object2 = grouping0.keyOf(object1);
            Object object3 = map0.get(object2);
            if(object3 == null && !map0.containsKey(object2)) {
                object3 = object0;
            }
            map0.put(object2, function20.invoke(object3, object1));
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map fold(@NotNull Grouping grouping0, @NotNull Function2 function20, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(grouping0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "initialValueSelector");
        Intrinsics.checkNotNullParameter(function30, "operation");
        Map map0 = new LinkedHashMap();
        Iterator iterator0 = grouping0.sourceIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = grouping0.keyOf(object0);
            Object object2 = map0.get(object1);
            if(object2 == null && !map0.containsKey(object1)) {
                object2 = function20.invoke(object1, object0);
            }
            map0.put(object1, function30.invoke(object1, object2, object0));
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map foldTo(@NotNull Grouping grouping0, @NotNull Map map0, Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(grouping0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function20, "operation");
        Iterator iterator0 = grouping0.sourceIterator();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Object object2 = grouping0.keyOf(object1);
            Object object3 = map0.get(object2);
            if(object3 == null && !map0.containsKey(object2)) {
                object3 = object0;
            }
            map0.put(object2, function20.invoke(object3, object1));
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map foldTo(@NotNull Grouping grouping0, @NotNull Map map0, @NotNull Function2 function20, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(grouping0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function20, "initialValueSelector");
        Intrinsics.checkNotNullParameter(function30, "operation");
        Iterator iterator0 = grouping0.sourceIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = grouping0.keyOf(object0);
            Object object2 = map0.get(object1);
            if(object2 == null && !map0.containsKey(object1)) {
                object2 = function20.invoke(object1, object0);
            }
            map0.put(object1, function30.invoke(object1, object2, object0));
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map reduce(@NotNull Grouping grouping0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(grouping0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        Map map0 = new LinkedHashMap();
        Iterator iterator0 = grouping0.sourceIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = grouping0.keyOf(object0);
            Object object2 = map0.get(object1);
            if(object2 != null || map0.containsKey(object1)) {
                object0 = function30.invoke(object1, object2, object0);
            }
            map0.put(object1, object0);
        }
        return map0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Map reduceTo(@NotNull Grouping grouping0, @NotNull Map map0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(grouping0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "destination");
        Intrinsics.checkNotNullParameter(function30, "operation");
        Iterator iterator0 = grouping0.sourceIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = grouping0.keyOf(object0);
            Object object2 = map0.get(object1);
            if(object2 != null || map0.containsKey(object1)) {
                object0 = function30.invoke(object1, object2, object0);
            }
            map0.put(object1, object0);
        }
        return map0;
    }
}

