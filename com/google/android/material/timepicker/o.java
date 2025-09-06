package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class o implements View.OnKeyListener, TextView.OnEditorActionListener {
    public final ChipTextInputComboView a;
    public final ChipTextInputComboView b;
    public final k c;
    public boolean d;

    public o(ChipTextInputComboView chipTextInputComboView0, ChipTextInputComboView chipTextInputComboView1, k k0) {
        this.d = false;
        this.a = chipTextInputComboView0;
        this.b = chipTextInputComboView1;
        this.c = k0;
    }

    public final void a(int v) {
        boolean z = false;
        this.b.setChecked(v == 12);
        if(v == 10) {
            z = true;
        }
        this.a.setChecked(z);
        this.c.f = v;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        if(v == 5) {
            this.a(12);
        }
        return v == 5;
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(this.d) {
            return false;
        }
        boolean z = true;
        this.d = true;
        if(this.c.f != 12) {
            Editable editable0 = ((EditText)view0).getText();
            if(editable0 == null) {
                z = false;
            }
            else if(v >= 7 && v <= 16 && keyEvent0.getAction() == 1 && ((EditText)view0).getSelectionStart() == 2 && editable0.length() == 2) {
                this.a(12);
            }
            else {
                if(((EditText)view0).getSelectionStart() == 0 && ((EditText)view0).length() == 2) {
                    ((EditText)view0).getText().clear();
                }
                z = false;
            }
        }
        else if(v == 67 && keyEvent0.getAction() == 0 && TextUtils.isEmpty(((EditText)view0).getText())) {
            this.a(10);
        }
        else {
            if(((EditText)view0).getSelectionStart() == 0 && ((EditText)view0).length() == 2) {
                ((EditText)view0).getText().clear();
            }
            z = false;
        }
        this.d = false;
        return z;
    }
}

