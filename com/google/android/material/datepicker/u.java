package com.google.android.material.datepicker;

import android.view.View.OnClickListener;
import android.view.View;

public final class u implements View.OnClickListener {
    public final MaterialDatePicker a;

    public u(MaterialDatePicker materialDatePicker0) {
        this.a = materialDatePicker0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        MaterialDatePicker materialDatePicker0 = this.a;
        for(Object object0: materialDatePicker0.z) {
            ((MaterialPickerOnPositiveButtonClickListener)object0).onPositiveButtonClick(materialDatePicker0.getSelection());
        }
        materialDatePicker0.dismiss();
    }
}

