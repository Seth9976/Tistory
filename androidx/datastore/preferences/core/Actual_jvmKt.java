package androidx.datastore.preferences.core;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001A\"\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001A4\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005H\u0000\u001A\b\u0010\t\u001A\u00020\nH\u0000¨\u0006\u000B"}, d2 = {"immutableCopyOfSet", "", "T", "set", "immutableMap", "", "K", "V", "map", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "datastore-preferences-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class Actual_jvmKt {
    @NotNull
    public static final Set immutableCopyOfSet(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "set");
        Set set1 = Collections.unmodifiableSet(CollectionsKt___CollectionsKt.toSet(set0));
        Intrinsics.checkNotNullExpressionValue(set1, "unmodifiableSet(set.toSet())");
        return set1;
    }

    @NotNull
    public static final Map immutableMap(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "map");
        Map map1 = Collections.unmodifiableMap(map0);
        Intrinsics.checkNotNullExpressionValue(map1, "unmodifiableMap(map)");
        return map1;
    }

    @NotNull
    public static final CoroutineDispatcher ioDispatcher() {
        return Dispatchers.getIO();
    }
}

