package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

public final class d0 extends h {
    public final int i;
    public final TextInputLayout j;
    public final TextInputLayout k;
    public final OnSelectionChangedListener l;
    public final RangeDateSelector m;

    public d0(RangeDateSelector rangeDateSelector0, String s, SimpleDateFormat simpleDateFormat0, TextInputLayout textInputLayout0, CalendarConstraints calendarConstraints0, TextInputLayout textInputLayout1, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener0, int v) {
        this.i = v;
        this.m = rangeDateSelector0;
        this.j = textInputLayout1;
        this.k = textInputLayout2;
        this.l = onSelectionChangedListener0;
        super(s, simpleDateFormat0, textInputLayout0, calendarConstraints0);
    }

    @Override  // com.google.android.material.datepicker.h
    public final void a() {
        if(this.i != 0) {
            this.m.f = null;
            RangeDateSelector.a(this.m, this.j, this.k, this.l);
            return;
        }
        this.m.e = null;
        RangeDateSelector.a(this.m, this.j, this.k, this.l);
    }

    @Override  // com.google.android.material.datepicker.h
    public final void b(Long long0) {
        if(this.i != 0) {
            this.m.f = long0;
            RangeDateSelector.a(this.m, this.j, this.k, this.l);
            return;
        }
        this.m.e = long0;
        RangeDateSelector.a(this.m, this.j, this.k, this.l);
    }
}

