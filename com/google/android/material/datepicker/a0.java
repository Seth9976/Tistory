package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

public final class a0 implements AdapterView.OnItemClickListener {
    public final MaterialCalendarGridView a;
    public final b0 b;

    public a0(b0 b00, MaterialCalendarGridView materialCalendarGridView0) {
        this.b = b00;
        this.a = materialCalendarGridView0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        MaterialCalendarGridView materialCalendarGridView0 = this.a;
        z z0 = materialCalendarGridView0.a();
        if(v >= z0.a() && v <= z0.c()) {
            long v2 = (long)materialCalendarGridView0.a().b(v);
            this.b.j.onDayClick(v2);
        }
    }
}

