package com.google.android.material.datepicker;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

public final class s implements View.OnClickListener {
    public final b0 a;
    public final MaterialCalendar b;

    public s(MaterialCalendar materialCalendar0, b0 b00) {
        this.b = materialCalendar0;
        this.a = b00;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        MaterialCalendar materialCalendar0 = this.b;
        int v = ((LinearLayoutManager)materialCalendar0.H.getLayoutManager()).findFirstVisibleItemPosition();
        if(v + 1 < materialCalendar0.H.getAdapter().getItemCount()) {
            Calendar calendar0 = i0.c(this.a.g.a.a);
            calendar0.add(2, v + 1);
            materialCalendar0.h(new y(calendar0));
        }
    }
}

