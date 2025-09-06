package h8;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.material.expandable.ExpandableWidget;
import com.google.android.material.transformation.ExpandableBehavior;

public final class a implements ViewTreeObserver.OnPreDrawListener {
    public final View a;
    public final int b;
    public final ExpandableWidget c;
    public final ExpandableBehavior d;

    public a(ExpandableBehavior expandableBehavior0, View view0, int v, ExpandableWidget expandableWidget0) {
        this.d = expandableBehavior0;
        this.a = view0;
        this.b = v;
        this.c = expandableWidget0;
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        View view0 = this.a;
        view0.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior0 = this.d;
        if(expandableBehavior0.o == this.b) {
            boolean z = this.c.isExpanded();
            expandableBehavior0.onExpandedStateChange(((View)this.c), view0, z, false);
        }
        return false;
    }
}

