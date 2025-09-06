package androidx.compose.ui.platform;

import aa.m;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ViewCompositionStrategy_androidKt {
    public static final Function0 access$installForLifecycle(AbstractComposeView abstractComposeView0, Lifecycle lifecycle0) {
        if(lifecycle0.getCurrentState().compareTo(State.DESTROYED) <= 0) {
            throw new IllegalStateException(("Cannot configure " + abstractComposeView0 + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle0 + "is already destroyed").toString());
        }
        t1 t10 = new t1(abstractComposeView0, 0);
        lifecycle0.addObserver(t10);
        return new m(9, lifecycle0, t10);
    }
}

