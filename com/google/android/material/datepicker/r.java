package com.google.android.material.datepicker;

import android.view.View.OnClickListener;
import android.view.View;

public final class r implements View.OnClickListener {
    public final MaterialCalendar a;

    public r(MaterialCalendar materialCalendar0) {
        this.a = materialCalendar0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        MaterialCalendar materialCalendar0 = this.a;
        int v = materialCalendar0.E;
        if(v == 2) {
            materialCalendar0.i(1);
            return;
        }
        if(v == 1) {
            materialCalendar0.i(2);
        }
    }
}

