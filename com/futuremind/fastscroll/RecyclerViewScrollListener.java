package com.futuremind.fastscroll;

import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerViewScrollListener extends OnScrollListener {
    public interface ScrollerListener {
        void onScroll(float arg1);
    }

    public final FastScroller a;
    public final ArrayList b;
    public int c;

    public RecyclerViewScrollListener(FastScroller fastScroller0) {
        this.b = new ArrayList();
        this.c = 0;
        this.a = fastScroller0;
    }

    public final void a(RecyclerView recyclerView0) {
        int v2;
        int v1;
        int v;
        FastScroller fastScroller0 = this.a;
        if(fastScroller0.isVertical()) {
            v = recyclerView0.computeVerticalScrollOffset();
            v1 = recyclerView0.computeVerticalScrollExtent();
            v2 = recyclerView0.computeVerticalScrollRange();
        }
        else {
            v = recyclerView0.computeHorizontalScrollOffset();
            v1 = recyclerView0.computeHorizontalScrollExtent();
            v2 = recyclerView0.computeHorizontalScrollRange();
        }
        float f = ((float)v) / ((float)(v2 - v1));
        fastScroller0.setScrollerPosition(f);
        this.notifyListeners(f);
    }

    public void addScrollerListener(ScrollerListener recyclerViewScrollListener$ScrollerListener0) {
        this.b.add(recyclerViewScrollListener$ScrollerListener0);
    }

    public void notifyListeners(float f) {
        for(Object object0: this.b) {
            ((ScrollerListener)object0).onScroll(f);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView0, int v) {
        super.onScrollStateChanged(recyclerView0, v);
        FastScroller fastScroller0 = this.a;
        if(v == 0 && this.c != 0) {
            fastScroller0.getViewProvider().onScrollFinished();
        }
        else if(v != 0 && this.c == 0) {
            fastScroller0.getViewProvider().onScrollStarted();
        }
        this.c = v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrolled(RecyclerView recyclerView0, int v, int v1) {
        if(this.a.d != null && !this.a.l && this.a.b.getChildCount() > 0) {
            this.a(recyclerView0);
        }
    }
}

