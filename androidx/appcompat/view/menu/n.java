package androidx.appcompat.view.menu;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.CollapsibleActionView;

public final class n extends FrameLayout implements CollapsibleActionView {
    public final android.view.CollapsibleActionView a;

    public n(View view0) {
        super(view0.getContext());
        this.a = (android.view.CollapsibleActionView)view0;
        this.addView(view0);
    }

    @Override  // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override  // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}

