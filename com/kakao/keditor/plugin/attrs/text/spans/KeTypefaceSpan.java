package com.kakao.keditor.plugin.attrs.text.spans;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u0006H\u0002J\u0010\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u0011H\u0016J\u0010\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0011H\u0016R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/spans/KeTypefaceSpan;", "Landroid/text/style/TypefaceSpan;", "Lcom/kakao/keditor/plugin/attrs/text/spans/KeAttributeSpan;", "family", "", "type", "Landroid/graphics/Typeface;", "(Ljava/lang/String;Landroid/graphics/Typeface;)V", "getType", "()Landroid/graphics/Typeface;", "applyCustomTypeFace", "", "paint", "Landroid/graphics/Paint;", "tf", "updateDrawState", "ds", "Landroid/text/TextPaint;", "updateMeasureState", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeTypefaceSpan extends TypefaceSpan implements KeAttributeSpan {
    @NotNull
    private final Typeface type;

    public KeTypefaceSpan(@Nullable String s, @NotNull Typeface typeface0) {
        Intrinsics.checkNotNullParameter(typeface0, "type");
        super(s);
        this.type = typeface0;
    }

    private final void applyCustomTypeFace(Paint paint0, Typeface typeface0) {
        Typeface typeface1 = paint0.getTypeface();
        int v = (typeface1 == null ? 0 : typeface1.getStyle()) & ~typeface0.getStyle();
        if((v & 1) != 0) {
            paint0.setFakeBoldText(true);
        }
        if((v & 2) != 0) {
            paint0.setTextSkewX(-0.25f);
        }
        paint0.setTypeface(typeface0);
    }

    @NotNull
    public final Typeface getType() {
        return this.type;
    }

    @Override  // android.text.style.TypefaceSpan
    public void updateDrawState(@NotNull TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(textPaint0, "ds");
        this.applyCustomTypeFace(textPaint0, this.type);
    }

    @Override  // android.text.style.TypefaceSpan
    public void updateMeasureState(@NotNull TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(textPaint0, "paint");
        this.applyCustomTypeFace(textPaint0, this.type);
    }
}

