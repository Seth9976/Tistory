package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class v {
    @PublishedApi
    @JvmName(name = "getOrImplicitDefaultNullable")
    public static final Object getOrImplicitDefaultNullable(@NotNull Map map0, Object object0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        if(map0 instanceof MapWithDefault) {
            return ((MapWithDefault)map0).getOrImplicitDefault(object0);
        }
        Object object1 = map0.get(object0);
        if(object1 == null && !map0.containsKey(object0)) {
            throw new NoSuchElementException("Key " + object0 + " is missing in the map.");
        }
        return object1;
    }

    @NotNull
    public static final Map withDefault(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "defaultValue");
        return map0 instanceof MapWithDefault ? v.withDefault(((MapWithDefault)map0).getMap(), function10) : new u(map0, function10);
    }

    @JvmName(name = "withDefaultMutable")
    @NotNull
    public static final Map withDefaultMutable(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "defaultValue");
        return map0 instanceof MutableMapWithDefault ? v.withDefaultMutable(((MutableMapWithDefault)map0).getMap(), function10) : new a0(map0, function10);
    }
}

