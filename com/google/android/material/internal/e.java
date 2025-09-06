package com.google.android.material.internal;

import android.graphics.Typeface;
import com.google.android.material.resources.CancelableFontCallback.ApplyFont;

public final class e implements ApplyFont {
    public final CollapsingTextHelper a;

    public e(CollapsingTextHelper collapsingTextHelper0) {
        this.a = collapsingTextHelper0;
    }

    @Override  // com.google.android.material.resources.CancelableFontCallback$ApplyFont
    public final void apply(Typeface typeface0) {
        this.a.setExpandedTypeface(typeface0);
    }
}

