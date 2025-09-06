package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001J\u001B\u0010\u0007\u001A\u0004\u0018\u00010\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002H ¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006R\u0017\u0010\u000F\u001A\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u001D\u0010\u0015\u001A\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R$\u0010\u001C\u001A\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\u0016\u0010 \u001A\u0004\u0018\u00010\u001D8&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001F\u0082\u0001\u0003!\"#\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "doLoad$ui_text_release", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "doLoad", "loadCached$ui_text_release", "loadCached", "Landroidx/compose/ui/text/font/FontWeight;", "d", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "e", "I", "getStyle-_-LCdwA", "()I", "style", "g", "Landroid/graphics/Typeface;", "getTypeface$ui_text_release", "()Landroid/graphics/Typeface;", "setTypeface$ui_text_release", "(Landroid/graphics/Typeface;)V", "typeface", "", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;", "Landroidx/compose/ui/text/font/AndroidFileFont;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class AndroidPreloadedFont extends AndroidFont {
    public static final int $stable;
    public final FontWeight d;
    public final int e;
    public boolean f;
    public Typeface g;

    public AndroidPreloadedFont(FontWeight fontWeight0, int v, Settings fontVariation$Settings0, DefaultConstructorMarker defaultConstructorMarker0) {
        super(0, a.a, fontVariation$Settings0, null);
        this.d = fontWeight0;
        this.e = v;
    }

    @Nullable
    public abstract Typeface doLoad$ui_text_release(@Nullable Context arg1);

    @Nullable
    public abstract String getCacheKey();

    @Override  // androidx.compose.ui.text.font.Font
    public final int getStyle-_-LCdwA() {
        return this.e;
    }

    @Nullable
    public final Typeface getTypeface$ui_text_release() {
        return this.g;
    }

    @Override  // androidx.compose.ui.text.font.Font
    @NotNull
    public final FontWeight getWeight() {
        return this.d;
    }

    @Nullable
    public final Typeface loadCached$ui_text_release(@NotNull Context context0) {
        if(!this.f && this.g == null) {
            this.g = this.doLoad$ui_text_release(context0);
        }
        this.f = true;
        return this.g;
    }

    public final void setTypeface$ui_text_release(@Nullable Typeface typeface0) {
        this.g = typeface0;
    }
}

