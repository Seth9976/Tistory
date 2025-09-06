package com.google.android.material.datepicker;

import android.view.View.OnClickListener;
import android.view.View;

public final class j0 implements View.OnClickListener {
    public final int a;
    public final k0 b;

    public j0(k0 k00, int v) {
        this.b = k00;
        this.a = v;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        y y0 = y.b(this.a, this.b.g.D.b);
        MaterialCalendar materialCalendar0 = this.b.g;
        CalendarConstraints calendarConstraints0 = materialCalendar0.B;
        y y1 = calendarConstraints0.a;
        if(y0.a(y1) < 0) {
            y0 = y1;
        }
        else {
            y y2 = calendarConstraints0.b;
            if(y0.a(y2) > 0) {
                y0 = y2;
            }
        }
        materialCalendar0.h(y0);
        materialCalendar0.i(1);
    }
}

