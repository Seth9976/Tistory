package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RequiresApi(19)
@RestrictTo({Scope.LIBRARY_GROUP})
public final class TypefaceEmojiSpan extends EmojiSpan {
    public TextPaint f;
    public static TextPaint g;

    public TypefaceEmojiSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
        super(typefaceEmojiRasterizer0);
    }

    @Override  // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas0, @SuppressLint({"UnknownNullness"}) CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, float f, int v2, int v3, int v4, @NonNull Paint paint0) {
        TextPaint textPaint0 = null;
        if(charSequence0 instanceof Spanned) {
            CharacterStyle[] arr_characterStyle = (CharacterStyle[])((Spanned)charSequence0).getSpans(v, v1, CharacterStyle.class);
            if(arr_characterStyle.length != 0 && (arr_characterStyle.length != 1 || arr_characterStyle[0] != this)) {
                TextPaint textPaint1 = this.f;
                if(textPaint1 == null) {
                    textPaint1 = new TextPaint();
                    this.f = textPaint1;
                }
                textPaint0 = textPaint1;
                textPaint0.set(paint0);
                for(int v5 = 0; v5 < arr_characterStyle.length; ++v5) {
                    arr_characterStyle[v5].updateDrawState(textPaint0);
                }
            }
            else if(paint0 instanceof TextPaint) {
                textPaint0 = (TextPaint)paint0;
            }
        }
        else if(paint0 instanceof TextPaint) {
            textPaint0 = (TextPaint)paint0;
        }
        if(textPaint0 != null && textPaint0.bgColor != 0) {
            float f1 = f + ((float)this.c);
            int v6 = textPaint0.getColor();
            Paint.Style paint$Style0 = textPaint0.getStyle();
            textPaint0.setColor(textPaint0.bgColor);
            textPaint0.setStyle(Paint.Style.FILL);
            canvas0.drawRect(f, ((float)v2), f1, ((float)v4), textPaint0);
            textPaint0.setStyle(paint$Style0);
            textPaint0.setColor(v6);
        }
        if(EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            float f2 = f + ((float)this.c);
            if(TypefaceEmojiSpan.g == null) {
                TextPaint textPaint2 = new TextPaint();
                TypefaceEmojiSpan.g = textPaint2;
                textPaint2.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
                TypefaceEmojiSpan.g.setStyle(Paint.Style.FILL);
            }
            canvas0.drawRect(f, ((float)v2), f2, ((float)v4), TypefaceEmojiSpan.g);
        }
        TypefaceEmojiRasterizer typefaceEmojiRasterizer0 = this.getTypefaceRasterizer();
        if(textPaint0 != null) {
            paint0 = textPaint0;
        }
        typefaceEmojiRasterizer0.draw(canvas0, f, ((float)v3), paint0);
    }
}

