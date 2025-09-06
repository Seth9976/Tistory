package androidx.compose.ui.focus;

import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final FocusRestorerNode w;

    public e(FocusRestorerNode focusRestorerNode0) {
        this.w = focusRestorerNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        FocusRequester focusRequester0;
        FocusRestorerNode focusRestorerNode0 = this.w;
        if(FocusRequesterModifierNodeKt.restoreFocusedChild(focusRestorerNode0)) {
            focusRequester0 = FocusRequester.Companion.getCancel();
        }
        else {
            Function0 function00 = focusRestorerNode0.getOnRestoreFailed();
            focusRequester0 = function00 == null ? null : ((FocusRequester)function00.invoke());
        }
        PinnedHandle pinnableContainer$PinnedHandle0 = focusRestorerNode0.o;
        if(pinnableContainer$PinnedHandle0 != null) {
            pinnableContainer$PinnedHandle0.release();
        }
        focusRestorerNode0.o = null;
        return focusRequester0 == null ? FocusRequester.Companion.getDefault() : focusRequester0;
    }
}

