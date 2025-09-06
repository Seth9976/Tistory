package com.google.android.material.timepicker;

import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.string;

public final class n implements OnActionUpListener, OnRotateListener, TimePickerPresenter, OnPeriodChangeListener, OnSelectionChange {
    public final TimePickerView a;
    public final k b;
    public float c;
    public float d;
    public boolean e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;

    static {
        n.f = new String[]{"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        n.g = new String[]{"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
        n.h = new String[]{"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    }

    public n(TimePickerView timePickerView0, k k0) {
        this.e = false;
        this.a = timePickerView0;
        this.b = k0;
        this.initialize();
    }

    public final void a(int v, boolean z) {
        int v3;
        String[] arr_s;
        int v1 = 1;
        TimePickerView timePickerView0 = this.a;
        timePickerView0.c.d = v == 12;
        k k0 = this.b;
        k0.f = v;
        int v2 = k0.c;
        if(v == 12) {
            arr_s = n.h;
        }
        else {
            arr_s = v2 == 1 ? n.g : n.f;
        }
        if(v == 12) {
            v3 = string.material_minute_suffix;
        }
        else {
            v3 = v2 == 1 ? string.material_hour_24h_suffix : string.material_hour_suffix;
        }
        timePickerView0.setValues(arr_s, v3);
        if(k0.f == 10 && v2 == 1 && k0.d >= 12) {
            v1 = 2;
        }
        timePickerView0.d.d.u = v1;
        timePickerView0.d.d.invalidate();
        timePickerView0.c.c((v == 12 ? this.d : this.c), z);
        timePickerView0.setActiveSelection(v);
        l l0 = new l(this, timePickerView0.getContext(), string.material_hour_selection);
        ViewCompat.setAccessibilityDelegate(timePickerView0.b, l0);
        m m0 = new m(this, timePickerView0.getContext(), string.material_minute_selection);
        ViewCompat.setAccessibilityDelegate(timePickerView0.a, m0);
    }

    @Override  // com.google.android.material.timepicker.TimePickerPresenter
    public final void hide() {
        this.a.setVisibility(8);
    }

    @Override  // com.google.android.material.timepicker.TimePickerPresenter
    public final void initialize() {
        TimePickerView timePickerView0 = this.a;
        if(this.b.c == 0) {
            timePickerView0.e.setVisibility(0);
        }
        timePickerView0.c.j.add(this);
        timePickerView0.g = this;
        timePickerView0.f = this;
        timePickerView0.c.r = this;
        String[] arr_s = n.f;
        for(int v1 = 0; v1 < 12; ++v1) {
            arr_s[v1] = k.a(timePickerView0.getResources(), arr_s[v1], "%d");
        }
        String[] arr_s1 = n.h;
        for(int v = 0; v < 12; ++v) {
            arr_s1[v] = k.a(timePickerView0.getResources(), arr_s1[v], "%02d");
        }
        this.invalidate();
    }

    @Override  // com.google.android.material.timepicker.TimePickerPresenter
    public final void invalidate() {
        this.d = (float)(this.b.b() * 30 % 360);
        this.c = (float)(this.b.e * 6);
        this.a(this.b.f, false);
        int v = this.b.g;
        int v1 = this.b.b();
        this.a.updateTime(v, v1, this.b.e);
    }

    @Override  // com.google.android.material.timepicker.ClockHandView$OnActionUpListener
    public final void onActionUp(float f, boolean z) {
        this.e = true;
        k k0 = this.b;
        int v = k0.e;
        int v1 = k0.d;
        TimePickerView timePickerView0 = this.a;
        if(k0.f == 10) {
            timePickerView0.c.c(this.d, false);
            AccessibilityManager accessibilityManager0 = (AccessibilityManager)ContextCompat.getSystemService(timePickerView0.getContext(), AccessibilityManager.class);
            if(accessibilityManager0 == null || !accessibilityManager0.isTouchExplorationEnabled()) {
                this.a(12, true);
            }
        }
        else {
            int v2 = Math.round(f);
            if(!z) {
                k0.d((v2 + 15) / 30 * 5);
                this.c = (float)(k0.e * 6);
            }
            timePickerView0.c.c(this.c, z);
        }
        this.e = false;
        timePickerView0.updateTime(k0.g, k0.b(), k0.e);
        if(k0.e != v || k0.d != v1) {
            timePickerView0.performHapticFeedback(4);
        }
    }

    @Override  // com.google.android.material.timepicker.TimePickerView$OnPeriodChangeListener
    public final void onPeriodChange(int v) {
        this.b.e(v);
    }

    @Override  // com.google.android.material.timepicker.ClockHandView$OnRotateListener
    public final void onRotate(float f, boolean z) {
        if(this.e) {
            return;
        }
        k k0 = this.b;
        int v = k0.d;
        int v1 = k0.e;
        int v2 = Math.round(f);
        TimePickerView timePickerView0 = this.a;
        if(k0.f == 12) {
            k0.d((v2 + 3) / 6);
            this.c = (float)Math.floor(k0.e * 6);
        }
        else {
            int v3 = (v2 + 15) / 30;
            if(k0.c == 1) {
                v3 %= 12;
                if(timePickerView0.d.d.u == 2) {
                    v3 += 12;
                }
            }
            k0.c(v3);
            this.d = (float)(k0.b() * 30 % 360);
        }
        if(!z) {
            timePickerView0.updateTime(k0.g, k0.b(), k0.e);
            if(k0.e != v1 || k0.d != v) {
                timePickerView0.performHapticFeedback(4);
            }
        }
    }

    @Override  // com.google.android.material.timepicker.TimePickerView$OnSelectionChange
    public final void onSelectionChanged(int v) {
        this.a(v, true);
    }

    @Override  // com.google.android.material.timepicker.TimePickerPresenter
    public final void show() {
        this.a.setVisibility(0);
    }
}

