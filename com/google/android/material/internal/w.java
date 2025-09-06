package com.google.android.material.internal;

import android.graphics.Typeface;
import com.google.android.material.resources.TextAppearanceFontCallback;

public final class w extends TextAppearanceFontCallback {
    public final TextDrawableHelper a;

    public w(TextDrawableHelper textDrawableHelper0) {
        this.a = textDrawableHelper0;
        super();
    }

    @Override  // com.google.android.material.resources.TextAppearanceFontCallback
    public final void onFontRetrievalFailed(int v) {
        this.a.e = true;
        TextDrawableDelegate textDrawableHelper$TextDrawableDelegate0 = (TextDrawableDelegate)this.a.f.get();
        if(textDrawableHelper$TextDrawableDelegate0 != null) {
            textDrawableHelper$TextDrawableDelegate0.onTextSizeChange();
        }
    }

    @Override  // com.google.android.material.resources.TextAppearanceFontCallback
    public final void onFontRetrieved(Typeface typeface0, boolean z) {
        if(z) {
            return;
        }
        this.a.e = true;
        TextDrawableDelegate textDrawableHelper$TextDrawableDelegate0 = (TextDrawableDelegate)this.a.f.get();
        if(textDrawableHelper$TextDrawableDelegate0 != null) {
            textDrawableHelper$TextDrawableDelegate0.onTextSizeChange();
        }
    }
}

