package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import y0.a;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B \u0012\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001A\u00028\u0000H\u0010¢\u0006\u0004\b\u000B\u0010\fR \u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/ComputedProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "defaultComputation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime_release", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue", "Landroidx/compose/runtime/ComputedValueHolder;", "b", "Landroidx/compose/runtime/ComputedValueHolder;", "getDefaultValueHolder$runtime_release", "()Landroidx/compose/runtime/ComputedValueHolder;", "defaultValueHolder", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ComputedProvidableCompositionLocal extends ProvidableCompositionLocal {
    public static final int $stable;
    public final ComputedValueHolder b;

    public ComputedProvidableCompositionLocal(@NotNull Function1 function10) {
        super(a.y);
        this.b = new ComputedValueHolder(function10);
    }

    @Override  // androidx.compose.runtime.ProvidableCompositionLocal
    @NotNull
    public ProvidedValue defaultProvidedValue$runtime_release(Object object0) {
        return object0 == null ? new ProvidedValue(this, null, true, null, null, null, true) : new ProvidedValue(this, object0, false, null, null, null, true);
    }

    @NotNull
    public ComputedValueHolder getDefaultValueHolder$runtime_release() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.CompositionLocal
    public ValueHolder getDefaultValueHolder$runtime_release() {
        return this.getDefaultValueHolder$runtime_release();
    }
}

