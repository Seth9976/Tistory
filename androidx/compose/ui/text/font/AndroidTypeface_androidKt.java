package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.platform.AndroidDefaultTypeface;
import androidx.compose.ui.text.platform.AndroidFontListTypeface;
import androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface;
import androidx.compose.ui.text.platform.AndroidTypefaceWrapper;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003\u001A6\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00012\u001C\b\u0002\u0010\t\u001A\u0016\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B\u0018\u00010\nH\u0007\u001A\u000E\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0002\u001A\u00020\u0003¨\u0006\u000E"}, d2 = {"FontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "typeface", "Landroid/graphics/Typeface;", "Typeface", "Landroidx/compose/ui/text/font/Typeface;", "context", "Landroid/content/Context;", "fontFamily", "styles", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidTypeface_androidKt {
    @NotNull
    public static final FontFamily FontFamily(@NotNull Typeface typeface0) {
        return FontFamilyKt.FontFamily(AndroidTypeface_androidKt.Typeface(typeface0));
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @NotNull
    public static final androidx.compose.ui.text.font.Typeface Typeface(@NotNull Context context0, @NotNull FontFamily fontFamily0, @Nullable List list0) {
        if(fontFamily0 instanceof FontListFontFamily) {
            return new AndroidFontListTypeface(((FontListFontFamily)fontFamily0), context0, list0, null, 8, null);
        }
        if(fontFamily0 instanceof GenericFontFamily) {
            return new AndroidGenericFontFamilyTypeface(((GenericFontFamily)fontFamily0));
        }
        if(fontFamily0 instanceof DefaultFontFamily) {
            return new AndroidDefaultTypeface();
        }
        if(!(fontFamily0 instanceof LoadedFontFamily)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((LoadedFontFamily)fontFamily0).getTypeface();
    }

    @NotNull
    public static final androidx.compose.ui.text.font.Typeface Typeface(@NotNull Typeface typeface0) {
        return new AndroidTypefaceWrapper(typeface0);
    }

    public static androidx.compose.ui.text.font.Typeface Typeface$default(Context context0, FontFamily fontFamily0, List list0, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = null;
        }
        return AndroidTypeface_androidKt.Typeface(context0, fontFamily0, list0);
    }
}

