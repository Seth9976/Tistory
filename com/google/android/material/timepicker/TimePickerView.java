package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout implements TimePickerControls {
    interface OnDoubleTapListener {
        void onDoubleTap();
    }

    interface OnPeriodChangeListener {
        void onPeriodChange(int arg1);
    }

    interface OnSelectionChange {
        void onSelectionChanged(int arg1);
    }

    public final Chip a;
    public final Chip b;
    public final ClockHandView c;
    public final ClockFaceView d;
    public final MaterialButtonToggleGroup e;
    public n f;
    public n g;
    public MaterialTimePicker h;
    public static final int i;

    public TimePickerView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public TimePickerView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        u u0 = new u(this);
        LayoutInflater.from(context0).inflate(layout.material_timepicker, this);
        this.d = (ClockFaceView)this.findViewById(id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup0 = (MaterialButtonToggleGroup)this.findViewById(id.material_clock_period_toggle);
        this.e = materialButtonToggleGroup0;
        materialButtonToggleGroup0.addOnButtonCheckedListener(new t(this, 0));
        Chip chip0 = (Chip)this.findViewById(id.material_minute_tv);
        this.a = chip0;
        Chip chip1 = (Chip)this.findViewById(id.material_hour_tv);
        this.b = chip1;
        this.c = (ClockHandView)this.findViewById(id.material_clock_hand);
        w w0 = new w(new GestureDetector(this.getContext(), new v(this)));
        chip0.setOnTouchListener(w0);
        chip1.setOnTouchListener(w0);
        chip0.setTag(id.selection_type, 12);
        chip1.setTag(id.selection_type, 10);
        chip0.setOnClickListener(u0);
        chip1.setOnClickListener(u0);
        chip0.setAccessibilityClassName("android.view.View");
        chip1.setAccessibilityClassName("android.view.View");
    }

    @Override  // android.view.View
    public final void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        if(view0 == this && v == 0) {
            this.b.sendAccessibilityEvent(8);
        }
    }

    @Override  // com.google.android.material.timepicker.TimePickerControls
    public final void setActiveSelection(int v) {
        int v1 = 0;
        boolean z = true;
        this.a.setChecked(v == 12);
        ViewCompat.setAccessibilityLiveRegion(this.a, (v == 12 ? 0 : 2));
        if(v != 10) {
            z = false;
        }
        Chip chip0 = this.b;
        chip0.setChecked(z);
        if(z) {
            v1 = 2;
        }
        ViewCompat.setAccessibilityLiveRegion(chip0, v1);
    }

    @Override  // com.google.android.material.timepicker.TimePickerControls
    public final void setHandRotation(float f) {
        this.c.c(f, false);
    }

    @Override  // com.google.android.material.timepicker.TimePickerControls
    public final void setValues(String[] arr_s, int v) {
        this.d.setValues(arr_s, v);
    }

    @Override  // com.google.android.material.timepicker.TimePickerControls
    public final void updateTime(int v, int v1, int v2) {
        this.e.check((v == 1 ? id.material_clock_period_pm_button : id.material_clock_period_am_button));
        Configuration configuration0 = this.getResources().getConfiguration();
        String s = String.format(configuration0.locale, "%02d", v2);
        String s1 = String.format(configuration0.locale, "%02d", v1);
        Chip chip0 = this.a;
        if(!TextUtils.equals(chip0.getText(), s)) {
            chip0.setText(s);
        }
        Chip chip1 = this.b;
        if(!TextUtils.equals(chip1.getText(), s1)) {
            chip1.setText(s1);
        }
    }
}

