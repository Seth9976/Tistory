package com.kakao.keditor.plugin.attrs.text.spans;

import a5.b;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.ContextCompat;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH\u0016R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/spans/KeForegroundColorSpan;", "Landroid/text/style/ForegroundColorSpan;", "Lcom/kakao/keditor/plugin/attrs/text/spans/KeAttributeSpan;", "context", "Landroid/content/Context;", "color", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeForegroundColorSpan extends ForegroundColorSpan implements KeAttributeSpan {
    @NotNull
    private final Context context;

    public KeForegroundColorSpan(@NotNull Context context0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(v);
        this.context = context0;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override  // android.text.style.ForegroundColorSpan
    public void updateDrawState(@NotNull TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(textPaint0, "textPaint");
        String s = b.f(1, "#%06X", "format(...)", new Object[]{((int)(0xFFFFFF & this.getForegroundColor()))});
        ColorType colorType0 = ColorType.Companion.getTypeByString(s);
        if(colorType0 != null) {
            textPaint0.setColor(ContextCompat.getColor(this.context, colorType0.getColorRes()));
            return;
        }
        textPaint0.setColor(this.getForegroundColor());
    }
}

