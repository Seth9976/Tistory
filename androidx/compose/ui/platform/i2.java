package androidx.compose.ui.platform;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionServiceKey;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.ui.R.id;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function2;

public final class i2 implements Composition, CompositionServices, LifecycleEventObserver {
    public final AndroidComposeView a;
    public final Composition b;
    public boolean c;
    public Lifecycle d;
    public Function2 e;

    public i2(AndroidComposeView androidComposeView0, Composition composition0) {
        this.a = androidComposeView0;
        this.b = composition0;
        this.e = ComposableSingletons.Wrapper_androidKt.INSTANCE.getLambda-1$ui_release();
    }

    @Override  // androidx.compose.runtime.Composition
    public final void dispose() {
        if(!this.c) {
            this.c = true;
            this.a.setTag(id.wrapped_composition_tag, null);
            Lifecycle lifecycle0 = this.d;
            if(lifecycle0 != null) {
                lifecycle0.removeObserver(this);
            }
        }
        this.b.dispose();
    }

    @Override  // androidx.compose.runtime.CompositionServices
    public final Object getCompositionService(CompositionServiceKey compositionServiceKey0) {
        CompositionServices compositionServices0 = this.b instanceof CompositionServices ? ((CompositionServices)this.b) : null;
        return compositionServices0 == null ? null : compositionServices0.getCompositionService(compositionServiceKey0);
    }

    @Override  // androidx.compose.runtime.Composition
    public final boolean getHasInvalidations() {
        return this.b.getHasInvalidations();
    }

    @Override  // androidx.compose.runtime.Composition
    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.dispose();
            return;
        }
        if(lifecycle$Event0 == Event.ON_CREATE && !this.c) {
            this.setContent(this.e);
        }
    }

    @Override  // androidx.compose.runtime.Composition
    public final void setContent(Function2 function20) {
        h2 h20 = new h2(this, function20);
        this.a.setOnViewTreeOwnersAvailable(h20);
    }
}

