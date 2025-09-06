package b8;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;

public final class a extends FontCallback {
    public final TextAppearanceFontCallback a;
    public final TextAppearance b;

    public a(TextAppearance textAppearance0, TextAppearanceFontCallback textAppearanceFontCallback0) {
        this.b = textAppearance0;
        this.a = textAppearanceFontCallback0;
        super();
    }

    @Override  // androidx.core.content.res.ResourcesCompat$FontCallback
    public final void onFontRetrievalFailed(int v) {
        this.b.d = true;
        this.a.onFontRetrievalFailed(v);
    }

    @Override  // androidx.core.content.res.ResourcesCompat$FontCallback
    public final void onFontRetrieved(Typeface typeface0) {
        this.b.e = Typeface.create(typeface0, this.b.textStyle);
        this.b.d = true;
        this.a.onFontRetrieved(this.b.e, false);
    }
}

