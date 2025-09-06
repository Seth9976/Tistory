package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A3\u0010\u0000\u001A\u00020\u00012\u0012\u0010\u0002\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00012\b\b\u0002\u0010\u0006\u001A\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0007\u001A \u0010\b\u001A\u00020\t\"\u0004\b\u0000\u0010\n*\u00020\u00012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\fH\u0000\u001A=\u0010\r\u001A\u00020\u0001*\u00020\u00012.\u0010\u000E\u001A*\u0012 \u0012\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u0010\u0012\u0004\u0012\u00020\u00130\u000FH\u0080\b\u001A%\u0010\u0014\u001A\u0002H\n\"\u0004\b\u0000\u0010\n*\u00020\u00012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\fH\u0000¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"updateCompositionMap", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "parentScope", "previous", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "contains", "", "T", "key", "Landroidx/compose/runtime/CompositionLocal;", "mutate", "mutator", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/ValueHolder;", "", "read", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class CompositionLocalMapKt {
    public static final boolean contains(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap0, @NotNull CompositionLocal compositionLocal0) {
        Intrinsics.checkNotNull(compositionLocal0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return persistentCompositionLocalMap0.containsKey(compositionLocal0);
    }

    @NotNull
    public static final PersistentCompositionLocalMap mutate(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap0, @NotNull Function1 function10) {
        Builder persistentCompositionLocalMap$Builder0 = persistentCompositionLocalMap0.builder();
        function10.invoke(persistentCompositionLocalMap$Builder0);
        return persistentCompositionLocalMap$Builder0.build();
    }

    public static final Object read(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap0, @NotNull CompositionLocal compositionLocal0) {
        Intrinsics.checkNotNull(compositionLocal0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        ValueHolder valueHolder0 = persistentCompositionLocalMap0.get(compositionLocal0);
        if(valueHolder0 == null) {
            valueHolder0 = compositionLocal0.getDefaultValueHolder$runtime_release();
        }
        return valueHolder0.readValue(persistentCompositionLocalMap0);
    }

    @NotNull
    public static final PersistentCompositionLocalMap updateCompositionMap(@NotNull ProvidedValue[] arr_providedValue, @NotNull PersistentCompositionLocalMap persistentCompositionLocalMap0, @NotNull PersistentCompositionLocalMap persistentCompositionLocalMap1) {
        androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Builder persistentCompositionLocalHashMap$Builder0 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder();
        for(int v = 0; v < arr_providedValue.length; ++v) {
            ProvidedValue providedValue0 = arr_providedValue[v];
            CompositionLocal compositionLocal0 = providedValue0.getCompositionLocal();
            Intrinsics.checkNotNull(compositionLocal0, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            ProvidableCompositionLocal providableCompositionLocal0 = (ProvidableCompositionLocal)compositionLocal0;
            if(providedValue0.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMap0, providableCompositionLocal0)) {
                ValueHolder valueHolder0 = (ValueHolder)persistentCompositionLocalMap1.get(providableCompositionLocal0);
                Intrinsics.checkNotNull(providedValue0, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                persistentCompositionLocalHashMap$Builder0.put(providableCompositionLocal0, providableCompositionLocal0.updatedStateOf$runtime_release(providedValue0, valueHolder0));
            }
        }
        return persistentCompositionLocalHashMap$Builder0.build();
    }

    public static PersistentCompositionLocalMap updateCompositionMap$default(ProvidedValue[] arr_providedValue, PersistentCompositionLocalMap persistentCompositionLocalMap0, PersistentCompositionLocalMap persistentCompositionLocalMap1, int v, Object object0) {
        if((v & 4) != 0) {
            persistentCompositionLocalMap1 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        }
        return CompositionLocalMapKt.updateCompositionMap(arr_providedValue, persistentCompositionLocalMap0, persistentCompositionLocalMap1);
    }
}

