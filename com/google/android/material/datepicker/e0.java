package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

public final class e0 extends h {
    public final OnSelectionChangedListener i;
    public final TextInputLayout j;
    public final SingleDateSelector k;

    public e0(SingleDateSelector singleDateSelector0, String s, SimpleDateFormat simpleDateFormat0, TextInputLayout textInputLayout0, CalendarConstraints calendarConstraints0, OnSelectionChangedListener onSelectionChangedListener0, TextInputLayout textInputLayout1) {
        this.k = singleDateSelector0;
        this.i = onSelectionChangedListener0;
        this.j = textInputLayout1;
        super(s, simpleDateFormat0, textInputLayout0, calendarConstraints0);
    }

    @Override  // com.google.android.material.datepicker.h
    public final void a() {
        this.k.a = this.j.getError();
        this.i.onIncompleteSelectionChanged();
    }

    @Override  // com.google.android.material.datepicker.h
    public final void b(Long long0) {
        SingleDateSelector singleDateSelector0 = this.k;
        if(long0 == null) {
            singleDateSelector0.b = null;
        }
        else {
            singleDateSelector0.select(((long)long0));
        }
        singleDateSelector0.a = null;
        this.i.onSelectionChanged(singleDateSelector0.getSelection());
    }
}

