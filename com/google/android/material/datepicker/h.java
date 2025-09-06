package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import androidx.activity.m;
import com.google.android.material.R.string;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class h extends TextWatcherAdapter {
    public final TextInputLayout a;
    public final String b;
    public final SimpleDateFormat c;
    public final CalendarConstraints d;
    public final String e;
    public final m f;
    public g g;
    public int h;

    public h(String s, SimpleDateFormat simpleDateFormat0, TextInputLayout textInputLayout0, CalendarConstraints calendarConstraints0) {
        this.h = 0;
        this.b = s;
        this.c = simpleDateFormat0;
        this.a = textInputLayout0;
        this.d = calendarConstraints0;
        this.e = textInputLayout0.getContext().getString(string.mtrl_picker_out_of_range);
        this.f = new m(12, this, s);
    }

    public abstract void a();

    @Override  // com.google.android.material.internal.TextWatcherAdapter
    public final void afterTextChanged(Editable editable0) {
        if(Locale.getDefault().getLanguage().equals("ko")) {
            return;
        }
        if(editable0.length() != 0) {
            int v = editable0.length();
            String s = this.b;
            if(v < s.length() && editable0.length() >= this.h) {
                int v1 = s.charAt(editable0.length());
                if(!Character.isDigit(((char)v1))) {
                    editable0.append(((char)v1));
                }
            }
        }
    }

    public abstract void b(Long arg1);

    @Override  // com.google.android.material.internal.TextWatcherAdapter
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        this.h = charSequence0.length();
    }

    @Override  // com.google.android.material.internal.TextWatcherAdapter
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        CalendarConstraints calendarConstraints0 = this.d;
        TextInputLayout textInputLayout0 = this.a;
        m m0 = this.f;
        textInputLayout0.removeCallbacks(m0);
        textInputLayout0.removeCallbacks(this.g);
        textInputLayout0.setError(null);
        this.b(null);
        if(!TextUtils.isEmpty(charSequence0) && charSequence0.length() >= this.b.length()) {
            try {
                Date date0 = this.c.parse(charSequence0.toString());
                textInputLayout0.setError(null);
                long v3 = date0.getTime();
                if(calendarConstraints0.getDateValidator().isValid(v3)) {
                    Calendar calendar0 = i0.c(calendarConstraints0.a.a);
                    calendar0.set(5, 1);
                    if(calendar0.getTimeInMillis() <= v3) {
                        Calendar calendar1 = i0.c(calendarConstraints0.b.a);
                        calendar1.set(5, calendarConstraints0.b.e);
                        if(v3 <= calendar1.getTimeInMillis()) {
                            this.b(date0.getTime());
                            return;
                        }
                    }
                }
                g g0 = new g(this, v3);
                this.g = g0;
                textInputLayout0.post(g0);
            }
            catch(ParseException unused_ex) {
                textInputLayout0.post(m0);
            }
        }
    }
}

