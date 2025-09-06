package com.google.android.material.timepicker;

import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.material.R.id;

public final class u implements View.OnClickListener {
    public final TimePickerView a;

    public u(TimePickerView timePickerView0) {
        this.a = timePickerView0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        n n0 = this.a.g;
        if(n0 != null) {
            n0.a(((int)(((Integer)view0.getTag(id.selection_type)))), true);
        }
    }
}

