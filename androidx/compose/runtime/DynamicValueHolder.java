package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00028\u00002\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0016\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AHÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Landroidx/compose/runtime/DynamicValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/MutableState;", "state", "<init>", "(Landroidx/compose/runtime/MutableState;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", "local", "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "(Landroidx/compose/runtime/CompositionLocal;)Landroidx/compose/runtime/ProvidedValue;", "component1", "()Landroidx/compose/runtime/MutableState;", "copy", "(Landroidx/compose/runtime/MutableState;)Landroidx/compose/runtime/DynamicValueHolder;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/runtime/MutableState;", "getState", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DynamicValueHolder implements ValueHolder {
    public static final int $stable;
    public final MutableState a;

    public DynamicValueHolder(@NotNull MutableState mutableState0) {
        this.a = mutableState0;
    }

    @NotNull
    public final MutableState component1() {
        return this.a;
    }

    @NotNull
    public final DynamicValueHolder copy(@NotNull MutableState mutableState0) {
        return new DynamicValueHolder(mutableState0);
    }

    public static DynamicValueHolder copy$default(DynamicValueHolder dynamicValueHolder0, MutableState mutableState0, int v, Object object0) {
        if((v & 1) != 0) {
            mutableState0 = dynamicValueHolder0.a;
        }
        return dynamicValueHolder0.copy(mutableState0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DynamicValueHolder ? Intrinsics.areEqual(this.a, ((DynamicValueHolder)object0).a) : false;
    }

    @NotNull
    public final MutableState getState() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.compose.runtime.ValueHolder
    public Object readValue(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap0) {
        return this.a.getValue();
    }

    @Override  // androidx.compose.runtime.ValueHolder
    @NotNull
    public ProvidedValue toProvided(@NotNull CompositionLocal compositionLocal0) {
        return new ProvidedValue(compositionLocal0, null, false, null, this.a, null, true);
    }

    @Override
    @NotNull
    public String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}

