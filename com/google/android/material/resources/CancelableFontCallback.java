package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class CancelableFontCallback extends TextAppearanceFontCallback {
    public interface ApplyFont {
        void apply(Typeface arg1);
    }

    public final Typeface a;
    public final ApplyFont b;
    public boolean c;

    public CancelableFontCallback(ApplyFont cancelableFontCallback$ApplyFont0, Typeface typeface0) {
        this.a = typeface0;
        this.b = cancelableFontCallback$ApplyFont0;
    }

    public void cancel() {
        this.c = true;
    }

    @Override  // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrievalFailed(int v) {
        if(!this.c) {
            this.b.apply(this.a);
        }
    }

    @Override  // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrieved(Typeface typeface0, boolean z) {
        if(!this.c) {
            this.b.apply(typeface0);
        }
    }
}

