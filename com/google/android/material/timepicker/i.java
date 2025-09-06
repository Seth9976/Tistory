package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

public final class i implements InputFilter {
    public final int a;

    public i(int v) {
        this.a = v;
    }

    @Override  // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) {
        try {
            StringBuilder stringBuilder0 = new StringBuilder(spanned0);
            stringBuilder0.replace(v2, v3, charSequence0.subSequence(v, v1).toString());
            if(Integer.parseInt(stringBuilder0.toString()) <= this.a) {
                return null;
            }
        }
        catch(NumberFormatException unused_ex) {
        }
        return "";
    }
}

