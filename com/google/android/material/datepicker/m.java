package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView.State;

public final class m extends g0 {
    public final int a;
    public final MaterialCalendar b;

    public m(MaterialCalendar materialCalendar0, Context context0, int v, int v1) {
        this.b = materialCalendar0;
        this.a = v1;
        super(context0, v, false);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(State recyclerView$State0, int[] arr_v) {
        MaterialCalendar materialCalendar0 = this.b;
        if(this.a == 0) {
            arr_v[0] = materialCalendar0.H.getWidth();
            arr_v[1] = materialCalendar0.H.getWidth();
            return;
        }
        arr_v[0] = materialCalendar0.H.getHeight();
        arr_v[1] = materialCalendar0.H.getHeight();
    }
}

