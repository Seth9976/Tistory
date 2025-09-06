package com.google.android.material.timepicker;

import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.material.R.id;

public final class q implements View.OnClickListener {
    public final s a;

    public q(s s0) {
        this.a = s0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        int v = (int)(((Integer)view0.getTag(id.selection_type)));
        this.a.onSelectionChanged(v);
    }
}

