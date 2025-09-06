package com.google.android.material.textfield;

import android.widget.EditText;
import f8.j;

public final class a implements OnEditTextAttachedListener {
    public final b a;

    public a(b b0) {
        this.a = b0;
    }

    @Override  // com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener
    public final void onEditTextAttached(TextInputLayout textInputLayout0) {
        b b0 = this.a;
        if(b0.s == textInputLayout0.getEditText()) {
            return;
        }
        EditText editText0 = b0.s;
        j j0 = b0.v;
        if(editText0 != null) {
            editText0.removeTextChangedListener(j0);
            if(b0.s.getOnFocusChangeListener() == b0.b().e()) {
                b0.s.setOnFocusChangeListener(null);
            }
        }
        EditText editText1 = textInputLayout0.getEditText();
        b0.s = editText1;
        if(editText1 != null) {
            editText1.addTextChangedListener(j0);
        }
        b0.b().m(b0.s);
        b0.j(b0.b());
    }
}

