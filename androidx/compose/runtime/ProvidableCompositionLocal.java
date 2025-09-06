package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001A\u00028\u0000H ¢\u0006\u0004\b\t\u0010\nJ\u001E\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001A\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\f\u0010\nJ\u001E\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001A\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\r\u0010\nJ/\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\b2\u0017\u0010\u0011\u001A\u0013\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00028\u00000\u000E¢\u0006\u0002\b\u0010H\u0086\u0004¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\b2\u000E\u0010\u0015\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/CompositionLocal;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime_release", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue", "provides", "providesDefault", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "compute", "providesComputed", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ValueHolder;", "previous", "updatedStateOf$runtime_release", "(Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/ValueHolder;", "updatedStateOf", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ProvidableCompositionLocal extends CompositionLocal {
    public static final int $stable;

    public ProvidableCompositionLocal(@NotNull Function0 function00) {
        super(function00, null);
    }

    @NotNull
    public abstract ProvidedValue defaultProvidedValue$runtime_release(Object arg1);

    @NotNull
    public final ProvidedValue provides(Object object0) {
        return this.defaultProvidedValue$runtime_release(object0);
    }

    @NotNull
    public final ProvidedValue providesComputed(@NotNull Function1 function10) {
        return new ProvidedValue(this, null, false, null, null, function10, false);
    }

    @NotNull
    public final ProvidedValue providesDefault(Object object0) {
        return this.defaultProvidedValue$runtime_release(object0).ifNotAlreadyProvided$runtime_release();
    }

    @Override  // androidx.compose.runtime.CompositionLocal
    @NotNull
    public ValueHolder updatedStateOf$runtime_release(@NotNull ProvidedValue providedValue0, @Nullable ValueHolder valueHolder0) {
        ValueHolder valueHolder1 = null;
        if(!(valueHolder0 instanceof DynamicValueHolder)) {
            if(!(valueHolder0 instanceof StaticValueHolder)) {
                if(valueHolder0 instanceof ComputedValueHolder && providedValue0.getCompute$runtime_release() == ((ComputedValueHolder)valueHolder0).getCompute()) {
                    valueHolder1 = (ComputedValueHolder)valueHolder0;
                }
            }
            else if(providedValue0.isStatic$runtime_release() && Intrinsics.areEqual(providedValue0.getEffectiveValue$runtime_release(), ((StaticValueHolder)valueHolder0).getValue())) {
                valueHolder1 = (StaticValueHolder)valueHolder0;
            }
        }
        else if(providedValue0.isDynamic$runtime_release()) {
            valueHolder1 = (DynamicValueHolder)valueHolder0;
            ((DynamicValueHolder)valueHolder1).getState().setValue(providedValue0.getEffectiveValue$runtime_release());
        }
        if(valueHolder1 == null) {
            if(providedValue0.isDynamic$runtime_release()) {
                return new DynamicValueHolder((providedValue0.getState$runtime_release() == null ? SnapshotStateKt.mutableStateOf(providedValue0.getValue(), (providedValue0.getMutationPolicy$runtime_release() == null ? SnapshotStateKt.structuralEqualityPolicy() : providedValue0.getMutationPolicy$runtime_release())) : providedValue0.getState$runtime_release()));
            }
            if(providedValue0.getCompute$runtime_release() != null) {
                return new ComputedValueHolder(providedValue0.getCompute$runtime_release());
            }
            return providedValue0.getState$runtime_release() != null ? new DynamicValueHolder(providedValue0.getState$runtime_release()) : new StaticValueHolder(providedValue0.getEffectiveValue$runtime_release());
        }
        return valueHolder1;
    }
}

