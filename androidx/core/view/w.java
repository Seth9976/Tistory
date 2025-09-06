package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuAdapter;
import kotlin.jvm.internal.Intrinsics;

public final class w implements Runnable {
    public final int a;
    public final View b;

    public w(int v, View view0) {
        this.a = v;
        this.b = view0;
        super();
    }

    @Override
    public final void run() {
        View view0 = this.b;
        switch(this.a) {
            case 0: {
                ((InputMethodManager)view0.getContext().getSystemService("input_method")).showSoftInput(view0, 0);
                return;
            }
            case 1: {
                view0.requestLayout();
                return;
            }
            case 2: {
                com.kakao.keditor.toolbar.KeditorToolbar.windowInsetsAnimationCallback.1.onStart$lambda$2$lambda$1$lambda$0(view0);
                return;
            }
            case 3: {
                ToolbarOverlayMenuAdapter.onViewAttachedToWindow$lambda$1$lambda$0(view0);
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(view0, "$this_run");
                view0.performAccessibilityAction(0x40, null);
                view0.sendAccessibilityEvent(8);
            }
        }
    }
}

