package androidx.appcompat.widget;

import android.view.View.OnClickListener;
import android.view.View;

public final class k2 implements View.OnClickListener {
    public final ScrollingTabContainerView a;

    public k2(ScrollingTabContainerView scrollingTabContainerView0) {
        this.a = scrollingTabContainerView0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ((l2)view0).a.select();
        ScrollingTabContainerView scrollingTabContainerView0 = this.a;
        int v = scrollingTabContainerView0.c.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = scrollingTabContainerView0.c.getChildAt(v1);
            view1.setSelected(view1 == view0);
        }
    }
}

