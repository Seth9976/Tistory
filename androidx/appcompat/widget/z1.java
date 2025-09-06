package androidx.appcompat.widget;

import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;

public final class z1 implements AbsListView.OnScrollListener {
    public final ListPopupWindow a;

    public z1(ListPopupWindow listPopupWindow0) {
        this.a = listPopupWindow0;
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScroll(AbsListView absListView0, int v, int v1, int v2) {
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView0, int v) {
        if(v == 1) {
            ListPopupWindow listPopupWindow0 = this.a;
            if(!listPopupWindow0.isInputMethodNotNeeded() && listPopupWindow0.F.getContentView() != null) {
                listPopupWindow0.B.removeCallbacks(listPopupWindow0.w);
                listPopupWindow0.w.run();
            }
        }
    }
}

