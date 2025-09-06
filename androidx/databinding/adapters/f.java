package androidx.databinding.adapters;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.databinding.InverseBindingListener;

public final class f implements TextWatcher {
    public final BeforeTextChanged a;
    public final OnTextChanged b;
    public final InverseBindingListener c;
    public final AfterTextChanged d;

    public f(BeforeTextChanged textViewBindingAdapter$BeforeTextChanged0, OnTextChanged textViewBindingAdapter$OnTextChanged0, InverseBindingListener inverseBindingListener0, AfterTextChanged textViewBindingAdapter$AfterTextChanged0) {
        this.a = textViewBindingAdapter$BeforeTextChanged0;
        this.b = textViewBindingAdapter$OnTextChanged0;
        this.c = inverseBindingListener0;
        this.d = textViewBindingAdapter$AfterTextChanged0;
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        AfterTextChanged textViewBindingAdapter$AfterTextChanged0 = this.d;
        if(textViewBindingAdapter$AfterTextChanged0 != null) {
            textViewBindingAdapter$AfterTextChanged0.afterTextChanged(editable0);
        }
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        BeforeTextChanged textViewBindingAdapter$BeforeTextChanged0 = this.a;
        if(textViewBindingAdapter$BeforeTextChanged0 != null) {
            textViewBindingAdapter$BeforeTextChanged0.beforeTextChanged(charSequence0, v, v1, v2);
        }
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        OnTextChanged textViewBindingAdapter$OnTextChanged0 = this.b;
        if(textViewBindingAdapter$OnTextChanged0 != null) {
            textViewBindingAdapter$OnTextChanged0.onTextChanged(charSequence0, v, v1, v2);
        }
        InverseBindingListener inverseBindingListener0 = this.c;
        if(inverseBindingListener0 != null) {
            inverseBindingListener0.onChange();
        }
    }
}

