package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

@RequiresApi(19)
public abstract class EmojiSpan extends ReplacementSpan {
    public final Paint.FontMetricsInt a;
    public final TypefaceEmojiRasterizer b;
    public short c;
    public short d;
    public float e;

    public EmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
        this.a = new Paint.FontMetricsInt();
        this.c = -1;
        this.d = -1;
        this.e = 1.0f;
        Preconditions.checkNotNull(typefaceEmojiRasterizer0, "rasterizer cannot be null");
        this.b = typefaceEmojiRasterizer0;
    }

    @RestrictTo({Scope.TESTS})
    public final int getHeight() {
        return this.d;
    }

    @RestrictTo({Scope.TESTS})
    public final int getId() {
        return this.getTypefaceRasterizer().getId();
    }

    @Override  // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint0, @SuppressLint({"UnknownNullness"}) CharSequence charSequence0, int v, int v1, @Nullable Paint.FontMetricsInt paint$FontMetricsInt0) {
        Paint.FontMetricsInt paint$FontMetricsInt1 = this.a;
        paint0.getFontMetricsInt(paint$FontMetricsInt1);
        this.e = ((float)Math.abs(paint$FontMetricsInt1.descent - paint$FontMetricsInt1.ascent)) * 1.0f / ((float)this.b.getHeight());
        this.d = (short)(((int)(((float)this.b.getHeight()) * this.e)));
        short v2 = (short)(((int)(((float)this.b.getWidth()) * this.e)));
        this.c = v2;
        if(paint$FontMetricsInt0 != null) {
            paint$FontMetricsInt0.ascent = paint$FontMetricsInt1.ascent;
            paint$FontMetricsInt0.descent = paint$FontMetricsInt1.descent;
            paint$FontMetricsInt0.top = paint$FontMetricsInt1.top;
            paint$FontMetricsInt0.bottom = paint$FontMetricsInt1.bottom;
        }
        return v2;
    }

    @NonNull
    public final TypefaceEmojiRasterizer getTypefaceRasterizer() {
        return this.b;
    }
}

