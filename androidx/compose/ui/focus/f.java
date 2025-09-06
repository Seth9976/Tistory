package androidx.compose.ui.focus;

import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final FocusRestorerNode w;

    public f(FocusRestorerNode focusRestorerNode0) {
        this.w = focusRestorerNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        FocusRestorerNode focusRestorerNode0 = this.w;
        FocusRequesterModifierNodeKt.saveFocusedChild(focusRestorerNode0);
        PinnedHandle pinnableContainer$PinnedHandle0 = focusRestorerNode0.o;
        if(pinnableContainer$PinnedHandle0 != null) {
            pinnableContainer$PinnedHandle0.release();
        }
        focusRestorerNode0.o = FocusRequesterModifierNodeKt.pinFocusedChild(focusRestorerNode0);
        return FocusRequester.Companion.getDefault();
    }
}

