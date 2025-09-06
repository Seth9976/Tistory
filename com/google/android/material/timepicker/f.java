package com.google.android.material.timepicker;

import android.view.View.OnClickListener;
import android.view.View;

public final class f implements View.OnClickListener {
    public final MaterialTimePicker a;

    public f(MaterialTimePicker materialTimePicker0) {
        this.a = materialTimePicker0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        MaterialTimePicker materialTimePicker0 = this.a;
        for(Object object0: materialTimePicker0.z) {
            ((View.OnClickListener)object0).onClick(view0);
        }
        materialTimePicker0.dismiss();
    }
}

