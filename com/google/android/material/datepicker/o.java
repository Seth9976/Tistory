package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

public final class o extends ItemDecoration {
    public final Calendar m;
    public final Calendar n;
    public final MaterialCalendar o;

    public o(MaterialCalendar materialCalendar0) {
        this.o = materialCalendar0;
        super();
        this.m = i0.g(null);
        this.n = i0.g(null);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public final void onDraw(Canvas canvas0, RecyclerView recyclerView0, State recyclerView$State0) {
        int v10;
        int v8;
        if(recyclerView0.getAdapter() instanceof k0 && recyclerView0.getLayoutManager() instanceof GridLayoutManager) {
            k0 k00 = (k0)recyclerView0.getAdapter();
            GridLayoutManager gridLayoutManager0 = (GridLayoutManager)recyclerView0.getLayoutManager();
            MaterialCalendar materialCalendar0 = this.o;
            for(Object object0: materialCalendar0.A.getSelectedRanges()) {
                Pair pair0 = (Pair)object0;
                Object object1 = pair0.first;
                if(object1 != null && pair0.second != null) {
                    this.m.setTimeInMillis(((long)(((Long)object1))));
                    this.n.setTimeInMillis(((long)(((Long)pair0.second))));
                    int v = this.m.get(1) - k00.g.B.a.c;
                    int v1 = this.n.get(1) - k00.g.B.a.c;
                    View view0 = gridLayoutManager0.findViewByPosition(v);
                    View view1 = gridLayoutManager0.findViewByPosition(v1);
                    int v2 = v / gridLayoutManager0.getSpanCount();
                    int v3 = v1 / gridLayoutManager0.getSpanCount();
                    for(int v4 = v2; v4 <= v3; ++v4) {
                        View view2 = gridLayoutManager0.findViewByPosition(gridLayoutManager0.getSpanCount() * v4);
                        if(view2 != null) {
                            int v5 = view2.getTop() + materialCalendar0.F.d.a.top;
                            int v6 = view2.getBottom() - materialCalendar0.F.d.a.bottom;
                            if(v4 != v2 || view0 == null) {
                                v8 = 0;
                            }
                            else {
                                int v7 = view0.getLeft();
                                v8 = view0.getWidth() / 2 + v7;
                            }
                            if(v4 != v3 || view1 == null) {
                                v10 = recyclerView0.getWidth();
                            }
                            else {
                                int v9 = view1.getLeft();
                                v10 = view1.getWidth() / 2 + v9;
                            }
                            canvas0.drawRect(((float)v8), ((float)v5), ((float)v10), ((float)v6), materialCalendar0.F.h);
                        }
                    }
                }
            }
        }
    }
}

