package androidx.databinding.adapters;

import android.widget.AutoCompleteTextView.Validator;

public final class b implements AutoCompleteTextView.Validator {
    public final IsValid a;
    public final FixText b;

    public b(IsValid autoCompleteTextViewBindingAdapter$IsValid0, FixText autoCompleteTextViewBindingAdapter$FixText0) {
        this.a = autoCompleteTextViewBindingAdapter$IsValid0;
        this.b = autoCompleteTextViewBindingAdapter$FixText0;
    }

    @Override  // android.widget.AutoCompleteTextView$Validator
    public final CharSequence fixText(CharSequence charSequence0) {
        return this.b == null ? charSequence0 : this.b.fixText(charSequence0);
    }

    @Override  // android.widget.AutoCompleteTextView$Validator
    public final boolean isValid(CharSequence charSequence0) {
        return this.a == null ? true : this.a.isValid(charSequence0);
    }
}

