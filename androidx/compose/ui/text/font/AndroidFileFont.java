package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\u0011\u001A\u0004\u0018\u00010\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0010¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u001C\u0010\u0019\u001A\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u0014¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Ljava/io/File;", "file", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "doLoad$ui_text_release", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "doLoad", "", "toString", "()Ljava/lang/String;", "h", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "cacheKey", "Ljava/lang/String;", "getCacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidFileFont extends AndroidPreloadedFont {
    public static final int $stable;
    public final File h;

    public AndroidFileFont(File file0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(file0, fontWeight0, v, fontVariation$Settings0, null);
    }

    public AndroidFileFont(File file0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, DefaultConstructorMarker defaultConstructorMarker0) {
        super(fontWeight0, v, fontVariation$Settings0, null);
        this.h = file0;
        this.setTypeface$ui_text_release(this.doLoad$ui_text_release(null));
    }

    @Override  // androidx.compose.ui.text.font.AndroidPreloadedFont
    @Nullable
    public Typeface doLoad$ui_text_release(@Nullable Context context0) {
        return k.a.b(this.h, context0, this.getVariationSettings());
    }

    @Override  // androidx.compose.ui.text.font.AndroidPreloadedFont
    @Nullable
    public String getCacheKey() {
        return null;
    }

    @NotNull
    public final File getFile() {
        return this.h;
    }

    @Override
    @NotNull
    public String toString() {
        return "Font(file=" + this.h + ", weight=" + this.getWeight() + ", style=" + FontStyle.toString-impl(this.getStyle-_-LCdwA()) + ')';
    }
}

