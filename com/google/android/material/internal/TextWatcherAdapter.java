package com.google.android.material.internal;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class TextWatcherAdapter implements TextWatcher {
    @Override  // android.text.TextWatcher
    public void afterTextChanged(@NonNull Editable editable0) {
    }

    @Override  // android.text.TextWatcher
    public void beforeTextChanged(@NonNull CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public void onTextChanged(@NonNull CharSequence charSequence0, int v, int v1, int v2) {
    }
}

