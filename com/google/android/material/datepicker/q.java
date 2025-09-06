package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class q extends OnScrollListener {
    public final b0 a;
    public final MaterialButton b;
    public final MaterialCalendar c;

    public q(MaterialCalendar materialCalendar0, b0 b00, MaterialButton materialButton0) {
        this.c = materialCalendar0;
        this.a = b00;
        this.b = materialButton0;
        super();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView0, int v) {
        if(v == 0) {
            recyclerView0.announceForAccessibility(this.b.getText());
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void onScrolled(RecyclerView recyclerView0, int v, int v1) {
        int v2 = v >= 0 ? ((LinearLayoutManager)this.c.H.getLayoutManager()).findLastVisibleItemPosition() : ((LinearLayoutManager)this.c.H.getLayoutManager()).findFirstVisibleItemPosition();
        Calendar calendar0 = i0.c(this.a.g.a.a);
        calendar0.add(2, v2);
        this.c.D = new y(calendar0);
        Calendar calendar1 = i0.c(this.a.g.a.a);
        calendar1.add(2, v2);
        calendar1.set(5, 1);
        Calendar calendar2 = i0.c(calendar1);
        calendar2.get(2);
        calendar2.get(1);
        calendar2.getMaximum(7);
        calendar2.getActualMaximum(5);
        calendar2.getTimeInMillis();
        long v3 = calendar2.getTimeInMillis();
        String s = i0.b("yMMMM", Locale.getDefault()).format(new Date(v3));
        this.b.setText(s);
    }
}

