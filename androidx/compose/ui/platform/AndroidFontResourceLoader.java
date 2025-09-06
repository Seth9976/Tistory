package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @ReplaceWith(expression = "PlatformFontLoader", imports = {}))
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/platform/AndroidFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "load", "(Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidFontResourceLoader implements ResourceLoader {
    public static final int $stable = 8;
    public final Context a;

    public AndroidFontResourceLoader(@NotNull Context context0) {
        this.a = context0;
    }

    @Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @NotNull
    public Typeface load(@NotNull Font font0) {
        if(!(font0 instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font0);
        }
        int v = ((ResourceFont)font0).getResId();
        return h0.a.a(this.a, v);
    }

    @Override  // androidx.compose.ui.text.font.Font$ResourceLoader
    public Object load(Font font0) {
        return this.load(font0);
    }
}

