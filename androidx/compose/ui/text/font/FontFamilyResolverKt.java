package androidx.compose.ui.text.font;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001A\u0010\u0005\u001A\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004\"\u001A\u0010\u000B\u001A\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "a", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "getGlobalTypefaceRequestCache", "()Landroidx/compose/ui/text/font/TypefaceRequestCache;", "GlobalTypefaceRequestCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "b", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "getGlobalAsyncTypefaceCache", "()Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "GlobalAsyncTypefaceCache", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FontFamilyResolverKt {
    public static final TypefaceRequestCache a;
    public static final AsyncTypefaceCache b;

    static {
        FontFamilyResolverKt.a = new TypefaceRequestCache();
        FontFamilyResolverKt.b = new AsyncTypefaceCache();
    }

    @NotNull
    public static final AsyncTypefaceCache getGlobalAsyncTypefaceCache() {
        return FontFamilyResolverKt.b;
    }

    @NotNull
    public static final TypefaceRequestCache getGlobalTypefaceRequestCache() {
        return FontFamilyResolverKt.a;
    }
}

