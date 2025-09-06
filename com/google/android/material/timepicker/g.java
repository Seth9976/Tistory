package com.google.android.material.timepicker;

import android.view.View.OnClickListener;
import android.view.View;

public final class g implements View.OnClickListener {
    public final MaterialTimePicker a;

    public g(MaterialTimePicker materialTimePicker0) {
        this.a = materialTimePicker0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        MaterialTimePicker materialTimePicker0 = this.a;
        for(Object object0: materialTimePicker0.A) {
            ((View.OnClickListener)object0).onClick(view0);
        }
        materialTimePicker0.dismiss();
    }
}

