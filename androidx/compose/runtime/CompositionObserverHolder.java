package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@ExperimentalComposeRuntimeApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u001D\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/CompositionObserverHolder;", "", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "", "root", "<init>", "(Landroidx/compose/runtime/tooling/CompositionObserver;Z)V", "a", "Landroidx/compose/runtime/tooling/CompositionObserver;", "getObserver", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "setObserver", "(Landroidx/compose/runtime/tooling/CompositionObserver;)V", "b", "Z", "getRoot", "()Z", "setRoot", "(Z)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CompositionObserverHolder {
    public static final int $stable = 8;
    public CompositionObserver a;
    public boolean b;

    public CompositionObserverHolder() {
        this(null, false, 3, null);
    }

    public CompositionObserverHolder(@Nullable CompositionObserver compositionObserver0, boolean z) {
        this.a = compositionObserver0;
        this.b = z;
    }

    public CompositionObserverHolder(CompositionObserver compositionObserver0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            compositionObserver0 = null;
        }
        if((v & 2) != 0) {
            z = false;
        }
        this(compositionObserver0, z);
    }

    @Nullable
    public final CompositionObserver getObserver() {
        return this.a;
    }

    public final boolean getRoot() {
        return this.b;
    }

    public final void setObserver(@Nullable CompositionObserver compositionObserver0) {
        this.a = compositionObserver0;
    }

    public final void setRoot(boolean z) {
        this.b = z;
    }
}

