package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001A\u00028\u0000H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/runtime/StaticProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "defaultFactory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "defaultProvidedValue", "Landroidx/compose/runtime/ProvidedValue;", "value", "defaultProvidedValue$runtime_release", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class StaticProvidableCompositionLocal extends ProvidableCompositionLocal {
    public static final int $stable;

    public StaticProvidableCompositionLocal(@NotNull Function0 function00) {
        super(function00);
    }

    @Override  // androidx.compose.runtime.ProvidableCompositionLocal
    @NotNull
    public ProvidedValue defaultProvidedValue$runtime_release(Object object0) {
        return object0 == null ? new ProvidedValue(this, null, true, null, null, null, false) : new ProvidedValue(this, object0, false, null, null, null, false);
    }
}

