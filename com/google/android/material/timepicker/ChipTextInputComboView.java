package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip a;
    public final TextInputLayout b;
    public final EditText c;
    public final p d;
    public static final int e;

    public ChipTextInputComboView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ChipTextInputComboView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        Chip chip0 = (Chip)layoutInflater0.inflate(layout.material_time_chip, this, false);
        this.a = chip0;
        chip0.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout0 = (TextInputLayout)layoutInflater0.inflate(layout.material_time_input, this, false);
        this.b = textInputLayout0;
        EditText editText0 = textInputLayout0.getEditText();
        this.c = editText0;
        editText0.setVisibility(4);
        p p0 = new p(this, 2);
        this.d = p0;
        editText0.addTextChangedListener(p0);
        editText0.setImeHintLocales(this.getContext().getResources().getConfiguration().getLocales());
        this.addView(chip0);
        this.addView(textInputLayout0);
        TextView textView0 = (TextView)this.findViewById(id.material_label);
        editText0.setId(ViewCompat.generateViewId());
        ViewCompat.setLabelFor(textView0, editText0.getId());
        editText0.setSaveEnabled(false);
        editText0.setLongClickable(false);
    }

    @Override  // android.widget.Checkable
    public final boolean isChecked() {
        return this.a.isChecked();
    }

    @Override  // android.view.View
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        LocaleList localeList0 = this.getContext().getResources().getConfiguration().getLocales();
        this.c.setImeHintLocales(localeList0);
    }

    @Override  // android.widget.Checkable
    public final void setChecked(boolean z) {
        this.a.setChecked(z);
        EditText editText0 = this.c;
        editText0.setVisibility((z ? 0 : 4));
        this.a.setVisibility((z ? 8 : 0));
        if(this.a.isChecked()) {
            ViewUtils.requestFocusAndShowKeyboard(editText0, false);
        }
    }

    @Override  // android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.a.setOnClickListener(view$OnClickListener0);
    }

    @Override  // android.view.View
    public final void setTag(int v, Object object0) {
        this.a.setTag(v, object0);
    }

    @Override  // android.widget.Checkable
    public final void toggle() {
        this.a.toggle();
    }
}

