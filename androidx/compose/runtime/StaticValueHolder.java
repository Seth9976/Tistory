package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000F\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J \u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001A\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0003\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Landroidx/compose/runtime/StaticValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "value", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", "local", "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "(Landroidx/compose/runtime/CompositionLocal;)Landroidx/compose/runtime/ProvidedValue;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Landroidx/compose/runtime/StaticValueHolder;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class StaticValueHolder implements ValueHolder {
    public static final int $stable;
    public final Object a;

    public StaticValueHolder(Object object0) {
        this.a = object0;
    }

    public final Object component1() {
        return this.a;
    }

    @NotNull
    public final StaticValueHolder copy(Object object0) {
        return new StaticValueHolder(object0);
    }

    public static StaticValueHolder copy$default(StaticValueHolder staticValueHolder0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = staticValueHolder0.a;
        }
        return staticValueHolder0.copy(object0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof StaticValueHolder ? Intrinsics.areEqual(this.a, ((StaticValueHolder)object0).a) : false;
    }

    public final Object getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override  // androidx.compose.runtime.ValueHolder
    public Object readValue(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap0) {
        return this.a;
    }

    @Override  // androidx.compose.runtime.ValueHolder
    @NotNull
    public ProvidedValue toProvided(@NotNull CompositionLocal compositionLocal0) {
        return this.a == null ? new ProvidedValue(compositionLocal0, null, true, null, null, null, false) : new ProvidedValue(compositionLocal0, this.a, false, null, null, null, false);
    }

    @Override
    @NotNull
    public String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}

