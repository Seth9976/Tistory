package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.internal.TextWatcherAdapter;

public final class p extends TextWatcherAdapter {
    public final int a;
    public final Object b;

    public p(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.google.android.material.internal.TextWatcherAdapter
    public final void afterTextChanged(Editable editable0) {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                try {
                    boolean z = TextUtils.isEmpty(editable0);
                }
                catch(NumberFormatException unused_ex) {
                    return;
                }
                s s2 = (s)object0;
                try {
                    if(z) {
                        s2.b.d(0);
                        return;
                    }
                    int v = Integer.parseInt(editable0.toString());
                    s2.b.d(v);
                }
                catch(NumberFormatException unused_ex) {
                }
                return;
            }
            case 1: {
                try {
                    boolean z1 = TextUtils.isEmpty(editable0);
                }
                catch(NumberFormatException unused_ex) {
                    return;
                }
                s s3 = (s)object0;
                try {
                    if(z1) {
                        s3.b.c(0);
                        return;
                    }
                    int v1 = Integer.parseInt(editable0.toString());
                    s3.b.c(v1);
                }
                catch(NumberFormatException unused_ex) {
                }
                return;
            }
            default: {
                if(TextUtils.isEmpty(editable0)) {
                    String s = k.a(((ChipTextInputComboView)object0).getResources(), "00", "%02d");
                    ((ChipTextInputComboView)object0).a.setText(s);
                    return;
                }
                String s1 = k.a(((ChipTextInputComboView)object0).getResources(), editable0, "%02d");
                if(TextUtils.isEmpty(s1)) {
                    s1 = k.a(((ChipTextInputComboView)object0).getResources(), "00", "%02d");
                }
                ((ChipTextInputComboView)object0).a.setText(s1);
            }
        }
    }
}

