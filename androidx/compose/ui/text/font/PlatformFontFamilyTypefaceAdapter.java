package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.AndroidTypeface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "<init>", "()V", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/TypefaceResult;", "resolve", "(Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/font/TypefaceResult;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 8;
    public final PlatformTypefaces a;

    public PlatformFontFamilyTypefaceAdapter() {
        this.a = PlatformTypefaces_androidKt.PlatformTypefaces();
    }

    @Override  // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    @Nullable
    public TypefaceResult resolve(@NotNull TypefaceRequest typefaceRequest0, @NotNull PlatformFontLoader platformFontLoader0, @NotNull Function1 function10, @NotNull Function1 function11) {
        FontFamily fontFamily0 = typefaceRequest0.getFontFamily();
        PlatformTypefaces platformTypefaces0 = this.a;
        if((fontFamily0 == null ? true : fontFamily0 instanceof DefaultFontFamily)) {
            return new Immutable(platformTypefaces0.createDefault-FO1MlWM(typefaceRequest0.getFontWeight(), typefaceRequest0.getFontStyle-_-LCdwA()), false, 2, null);
        }
        if(fontFamily0 instanceof GenericFontFamily) {
            return new Immutable(platformTypefaces0.createNamed-RetOiIg(((GenericFontFamily)typefaceRequest0.getFontFamily()), typefaceRequest0.getFontWeight(), typefaceRequest0.getFontStyle-_-LCdwA()), false, 2, null);
        }
        if(fontFamily0 instanceof LoadedFontFamily) {
            Typeface typeface0 = ((LoadedFontFamily)typefaceRequest0.getFontFamily()).getTypeface();
            Intrinsics.checkNotNull(typeface0, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            return new Immutable(((AndroidTypeface)typeface0).getNativeTypeface-PYhJU0U(typefaceRequest0.getFontWeight(), typefaceRequest0.getFontStyle-_-LCdwA(), typefaceRequest0.getFontSynthesis-GVVA2EU()), false, 2, null);
        }
        return null;
    }
}

