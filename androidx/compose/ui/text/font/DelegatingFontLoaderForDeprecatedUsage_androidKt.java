package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0001\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"createFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontResourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "context", "Landroid/content/Context;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DelegatingFontLoaderForDeprecatedUsage_androidKt {
    @Deprecated(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @ReplaceWith(expression = "createFontFamilyResolver()", imports = {}))
    @NotNull
    public static final Resolver createFontFamilyResolver(@NotNull ResourceLoader font$ResourceLoader0) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForDeprecatedUsage(font$ResourceLoader0), null, null, null, null, 30, null);
    }

    @Deprecated(message = "This exists to bridge existing Font.ResourceLoader subclasses to be used as aFontFamily.ResourceLoader during upgrade.", replaceWith = @ReplaceWith(expression = "createFontFamilyResolver()", imports = {}))
    @NotNull
    public static final Resolver createFontFamilyResolver(@NotNull ResourceLoader font$ResourceLoader0, @NotNull Context context0) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForBridgeUsage(font$ResourceLoader0, context0.getApplicationContext()), null, null, null, null, 30, null);
    }
}

