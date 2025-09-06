package b8;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;

public final class b extends TextAppearanceFontCallback {
    public final Context a;
    public final TextPaint b;
    public final TextAppearanceFontCallback c;
    public final TextAppearance d;

    public b(TextAppearance textAppearance0, Context context0, TextPaint textPaint0, TextAppearanceFontCallback textAppearanceFontCallback0) {
        this.d = textAppearance0;
        this.a = context0;
        this.b = textPaint0;
        this.c = textAppearanceFontCallback0;
        super();
    }

    @Override  // com.google.android.material.resources.TextAppearanceFontCallback
    public final void onFontRetrievalFailed(int v) {
        this.c.onFontRetrievalFailed(v);
    }

    @Override  // com.google.android.material.resources.TextAppearanceFontCallback
    public final void onFontRetrieved(Typeface typeface0, boolean z) {
        this.d.updateTextPaintMeasureState(this.a, this.b, typeface0);
        this.c.onFontRetrieved(typeface0, z);
    }
}

