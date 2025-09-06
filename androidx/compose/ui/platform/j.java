package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

public final class j extends MutablePropertyReference0Impl {
    public final int b;

    public j(int v, Object object0, Class class0, String s, String s1, int v1) {
        this.b = v1;
        super(object0, class0, s, s1, v);
    }

    public j(Object object0) {
        this.b = 2;
        super(object0, MutableState.class, "value", "getValue()Ljava/lang/Object;", 0);
    }

    @Override  // kotlin.jvm.internal.MutablePropertyReference0Impl
    public final Object get() {
        switch(this.b) {
            case 0: {
                return ((AndroidComposeView)this.receiver).getLayoutDirection();
            }
            case 1: {
                return ((ComposeViewAdapter)this.receiver).getClock$ui_tooling_release();
            }
            default: {
                return ((MutableState)this.receiver).getValue();
            }
        }
    }

    @Override  // kotlin.jvm.internal.MutablePropertyReference0Impl
    public final void set(Object object0) {
        switch(this.b) {
            case 0: {
                ((AndroidComposeView)this.receiver).setLayoutDirection(((LayoutDirection)object0));
                return;
            }
            case 1: {
                ((ComposeViewAdapter)this.receiver).setClock$ui_tooling_release(((PreviewAnimationClock)object0));
                return;
            }
            default: {
                ((MutableState)this.receiver).setValue(object0);
            }
        }
    }
}

