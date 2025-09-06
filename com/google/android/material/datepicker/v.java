package com.google.android.material.datepicker;

import android.view.View.OnClickListener;
import android.view.View;

public final class v implements View.OnClickListener {
    public final MaterialDatePicker a;

    public v(MaterialDatePicker materialDatePicker0) {
        this.a = materialDatePicker0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        MaterialDatePicker materialDatePicker0 = this.a;
        for(Object object0: materialDatePicker0.A) {
            ((View.OnClickListener)object0).onClick(view0);
        }
        materialDatePicker0.dismiss();
    }
}

