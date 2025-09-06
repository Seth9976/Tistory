package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B \u0012\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00028\u00002\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ#\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0019\b\u0002\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001F\u001A\u00020\u001E2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CHÖ\u0003¢\u0006\u0004\b\u001F\u0010 R(\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Landroidx/compose/runtime/ComputedValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", "local", "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "(Landroidx/compose/runtime/CompositionLocal;)Landroidx/compose/runtime/ProvidedValue;", "component1", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/ComputedValueHolder;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function1;", "getCompute", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ComputedValueHolder implements ValueHolder {
    public static final int $stable;
    public final Function1 a;

    public ComputedValueHolder(@NotNull Function1 function10) {
        this.a = function10;
    }

    @NotNull
    public final Function1 component1() {
        return this.a;
    }

    @NotNull
    public final ComputedValueHolder copy(@NotNull Function1 function10) {
        return new ComputedValueHolder(function10);
    }

    public static ComputedValueHolder copy$default(ComputedValueHolder computedValueHolder0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = computedValueHolder0.a;
        }
        return computedValueHolder0.copy(function10);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ComputedValueHolder ? Intrinsics.areEqual(this.a, ((ComputedValueHolder)object0).a) : false;
    }

    @NotNull
    public final Function1 getCompute() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.compose.runtime.ValueHolder
    public Object readValue(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap0) {
        return this.a.invoke(persistentCompositionLocalMap0);
    }

    @Override  // androidx.compose.runtime.ValueHolder
    @NotNull
    public ProvidedValue toProvided(@NotNull CompositionLocal compositionLocal0) {
        return new ProvidedValue(compositionLocal0, null, false, null, null, this.a, false);
    }

    @Override
    @NotNull
    public String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}

