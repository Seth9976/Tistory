package com.google.android.material.timepicker;

import android.view.View.OnClickListener;
import android.view.View;

public final class h implements View.OnClickListener {
    public final MaterialTimePicker a;

    public h(MaterialTimePicker materialTimePicker0) {
        this.a = materialTimePicker0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.S = this.a.S == 0 ? 1 : 0;
        this.a.i(this.a.Q);
    }
}

