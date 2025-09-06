package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.core.graphics.PaintCompat;

public final class d implements GlyphChecker {
    public final TextPaint a;
    public static final ThreadLocal b;

    static {
        d.b = new ThreadLocal();
    }

    public d() {
        TextPaint textPaint0 = new TextPaint();
        this.a = textPaint0;
        textPaint0.setTextSize(10.0f);
    }

    @Override  // androidx.emoji2.text.EmojiCompat$GlyphChecker
    public final boolean hasGlyph(CharSequence charSequence0, int v, int v1, int v2) {
        ThreadLocal threadLocal0 = d.b;
        if(threadLocal0.get() == null) {
            threadLocal0.set(new StringBuilder());
        }
        StringBuilder stringBuilder0 = (StringBuilder)threadLocal0.get();
        stringBuilder0.setLength(0);
        while(v < v1) {
            stringBuilder0.append(charSequence0.charAt(v));
            ++v;
        }
        return PaintCompat.hasGlyph(this.a, stringBuilder0.toString());
    }
}

