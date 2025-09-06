package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.string;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import java.util.Locale;

public final class s implements TimePickerPresenter, OnSelectionChange {
    public final LinearLayout a;
    public final k b;
    public final p c;
    public final p d;
    public final ChipTextInputComboView e;
    public final ChipTextInputComboView f;
    public final o g;
    public final EditText h;
    public final EditText i;
    public final MaterialButtonToggleGroup j;

    public s(LinearLayout linearLayout0, k k0) {
        this.c = new p(this, 0);
        this.d = new p(this, 1);
        this.a = linearLayout0;
        this.b = k0;
        Resources resources0 = linearLayout0.getResources();
        ChipTextInputComboView chipTextInputComboView0 = (ChipTextInputComboView)linearLayout0.findViewById(id.material_minute_text_input);
        this.e = chipTextInputComboView0;
        ChipTextInputComboView chipTextInputComboView1 = (ChipTextInputComboView)linearLayout0.findViewById(id.material_hour_text_input);
        this.f = chipTextInputComboView1;
        TextView textView0 = (TextView)chipTextInputComboView0.findViewById(id.material_label);
        TextView textView1 = (TextView)chipTextInputComboView1.findViewById(id.material_label);
        textView0.setText(resources0.getString(string.material_timepicker_minute));
        textView1.setText(resources0.getString(string.material_timepicker_hour));
        chipTextInputComboView0.setTag(id.selection_type, 12);
        chipTextInputComboView1.setTag(id.selection_type, 10);
        if(k0.c == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup0 = (MaterialButtonToggleGroup)linearLayout0.findViewById(id.material_clock_period_toggle);
            this.j = materialButtonToggleGroup0;
            materialButtonToggleGroup0.addOnButtonCheckedListener(new t(this, 1));
            this.j.setVisibility(0);
            this.c();
        }
        q q0 = new q(this);
        chipTextInputComboView1.setOnClickListener(q0);
        chipTextInputComboView0.setOnClickListener(q0);
        InputFilter[] arr_inputFilter = chipTextInputComboView1.c.getFilters();
        InputFilter[] arr_inputFilter1 = (InputFilter[])Arrays.copyOf(arr_inputFilter, arr_inputFilter.length + 1);
        arr_inputFilter1[arr_inputFilter.length] = k0.b;
        chipTextInputComboView1.c.setFilters(arr_inputFilter1);
        InputFilter[] arr_inputFilter2 = chipTextInputComboView0.c.getFilters();
        InputFilter[] arr_inputFilter3 = (InputFilter[])Arrays.copyOf(arr_inputFilter2, arr_inputFilter2.length + 1);
        arr_inputFilter3[arr_inputFilter2.length] = k0.a;
        chipTextInputComboView0.c.setFilters(arr_inputFilter3);
        this.h = chipTextInputComboView1.b.getEditText();
        this.i = chipTextInputComboView0.b.getEditText();
        this.g = new o(chipTextInputComboView1, chipTextInputComboView0, k0);
        l l0 = new l(linearLayout0.getContext(), string.material_hour_selection, k0);
        ViewCompat.setAccessibilityDelegate(chipTextInputComboView1.a, l0);
        r r0 = new r(linearLayout0.getContext(), string.material_minute_selection, k0);
        ViewCompat.setAccessibilityDelegate(chipTextInputComboView0.a, r0);
        this.initialize();
    }

    public final void a() {
        boolean z = false;
        this.e.setChecked(this.b.f == 12);
        if(this.b.f == 10) {
            z = true;
        }
        this.f.setChecked(z);
    }

    public final void b(k k0) {
        EditText editText0 = this.h;
        p p0 = this.d;
        editText0.removeTextChangedListener(p0);
        EditText editText1 = this.i;
        p p1 = this.c;
        editText1.removeTextChangedListener(p1);
        Locale locale0 = this.a.getResources().getConfiguration().locale;
        String s = String.format(locale0, "%02d", k0.e);
        String s1 = String.format(locale0, "%02d", k0.b());
        ChipTextInputComboView chipTextInputComboView0 = this.e;
        String s2 = k.a(chipTextInputComboView0.getResources(), s, "%02d");
        chipTextInputComboView0.a.setText(s2);
        if(!TextUtils.isEmpty(s2)) {
            chipTextInputComboView0.c.removeTextChangedListener(chipTextInputComboView0.d);
            chipTextInputComboView0.c.setText(s2);
            chipTextInputComboView0.c.addTextChangedListener(chipTextInputComboView0.d);
        }
        ChipTextInputComboView chipTextInputComboView1 = this.f;
        String s3 = k.a(chipTextInputComboView1.getResources(), s1, "%02d");
        chipTextInputComboView1.a.setText(s3);
        if(!TextUtils.isEmpty(s3)) {
            chipTextInputComboView1.c.removeTextChangedListener(chipTextInputComboView1.d);
            chipTextInputComboView1.c.setText(s3);
            chipTextInputComboView1.c.addTextChangedListener(chipTextInputComboView1.d);
        }
        editText0.addTextChangedListener(p0);
        editText1.addTextChangedListener(p1);
        this.c();
    }

    public final void c() {
        MaterialButtonToggleGroup materialButtonToggleGroup0 = this.j;
        if(materialButtonToggleGroup0 == null) {
            return;
        }
        materialButtonToggleGroup0.check((this.b.g == 0 ? id.material_clock_period_am_button : id.material_clock_period_pm_button));
    }

    @Override  // com.google.android.material.timepicker.TimePickerPresenter
    public final void hide() {
        LinearLayout linearLayout0 = this.a;
        View view0 = linearLayout0.getFocusedChild();
        if(view0 != null) {
            ViewUtils.hideKeyboard(view0, false);
        }
        linearLayout0.setVisibility(8);
    }

    @Override  // com.google.android.material.timepicker.TimePickerPresenter
    public final void initialize() {
        this.h.addTextChangedListener(this.d);
        this.i.addTextChangedListener(this.c);
        this.b(this.b);
        EditText editText0 = this.g.a.b.getEditText();
        EditText editText1 = this.g.b.b.getEditText();
        editText0.setImeOptions(0x10000005);
        editText1.setImeOptions(0x10000006);
        editText0.setOnEditorActionListener(this.g);
        editText0.setOnKeyListener(this.g);
        editText1.setOnKeyListener(this.g);
    }

    @Override  // com.google.android.material.timepicker.TimePickerPresenter
    public final void invalidate() {
        this.b(this.b);
    }

    @Override  // com.google.android.material.timepicker.TimePickerView$OnSelectionChange
    public final void onSelectionChanged(int v) {
        this.b.f = v;
        boolean z = false;
        this.e.setChecked(v == 12);
        if(v == 10) {
            z = true;
        }
        this.f.setChecked(z);
        this.c();
    }

    @Override  // com.google.android.material.timepicker.TimePickerPresenter
    public final void show() {
        this.a.setVisibility(0);
        this.onSelectionChanged(this.b.f);
    }
}

