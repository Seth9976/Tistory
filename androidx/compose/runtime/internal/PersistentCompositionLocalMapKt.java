package androidx.compose.runtime.internal;

import androidx.compose.runtime.PersistentCompositionLocalMap.Builder;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\b\u0010\u0000\u001A\u00020\u0001H\u0000\u001AY\u0010\u0000\u001A\u00020\u00022J\u0010\u0003\u001A&\u0012\"\b\u0001\u0012\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\b0\u00050\u0004\"\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\b0\u0005H\u0000¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"persistentCompositionLocalHashMapOf", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "pairs", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "([Lkotlin/Pair;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPersistentCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n+ 2 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n*L\n1#1,85:1\n82#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n*L\n84#1:86\n*E\n"})
public final class PersistentCompositionLocalMapKt {
    @NotNull
    public static final PersistentCompositionLocalMap persistentCompositionLocalHashMapOf(@NotNull Pair[] arr_pair) {
        Builder persistentCompositionLocalMap$Builder0 = PersistentCompositionLocalHashMap.Companion.getEmpty().builder();
        x.putAll(persistentCompositionLocalMap$Builder0, arr_pair);
        return persistentCompositionLocalMap$Builder0.build();
    }

    @NotNull
    public static final PersistentCompositionLocalHashMap persistentCompositionLocalHashMapOf() {
        return PersistentCompositionLocalHashMap.Companion.getEmpty();
    }
}

