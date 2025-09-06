package com.google.android.material.timepicker;

import com.google.android.material.R.id;
import com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener;
import com.google.android.material.button.MaterialButtonToggleGroup;

public final class t implements OnButtonCheckedListener {
    public final int a;
    public final Object b;

    public t(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.google.android.material.button.MaterialButtonToggleGroup$OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup0, int v, boolean z) {
        int v1 = 0;
        Object object0 = this.b;
        if(this.a != 0) {
            ((s)object0).getClass();
            if(z) {
                if(v == id.material_clock_period_pm_button) {
                    v1 = 1;
                }
                ((s)object0).b.e(v1);
            }
            return;
        }
        if(!z) {
            ((TimePickerView)object0).getClass();
            return;
        }
        n n0 = ((TimePickerView)object0).f;
        if(n0 != null) {
            if(v == id.material_clock_period_pm_button) {
                v1 = 1;
            }
            n0.onPeriodChange(v1);
        }
    }
}

