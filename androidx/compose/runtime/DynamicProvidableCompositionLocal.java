package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001A\u00028\u0000H\u0010¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/runtime/DynamicProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime_release", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DynamicProvidableCompositionLocal extends ProvidableCompositionLocal {
    public static final int $stable;
    public final SnapshotMutationPolicy b;

    public DynamicProvidableCompositionLocal(@NotNull SnapshotMutationPolicy snapshotMutationPolicy0, @NotNull Function0 function00) {
        super(function00);
        this.b = snapshotMutationPolicy0;
    }

    @Override  // androidx.compose.runtime.ProvidableCompositionLocal
    @NotNull
    public ProvidedValue defaultProvidedValue$runtime_release(Object object0) {
        return object0 == null ? new ProvidedValue(this, null, true, this.b, null, null, true) : new ProvidedValue(this, object0, false, this.b, null, null, true);
    }
}

