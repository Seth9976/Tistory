package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.annotation.DoNotInline;

public abstract class t2 {
    @DoNotInline
    public static void a(AutoCompleteTextView autoCompleteTextView0) {
        autoCompleteTextView0.refreshAutoCompleteResults();
    }

    @DoNotInline
    public static void b(SearchAutoComplete searchView$SearchAutoComplete0, int v) {
        searchView$SearchAutoComplete0.setInputMethodMode(v);
    }
}

