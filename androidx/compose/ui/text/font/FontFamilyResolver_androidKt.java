package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.InternalTextApi;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003\u001A\u0016\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005\u001A\u0010\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001AD\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"createFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "context", "Landroid/content/Context;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "emptyCacheFontFamilyResolver", "resolveAsTypeface", "Landroidx/compose/runtime/State;", "Landroid/graphics/Typeface;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolveAsTypeface-Wqqsr6A", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FontFamilyResolver_androidKt {
    @NotNull
    public static final Resolver createFontFamilyResolver(@NotNull Context context0) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context0), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context0), null, null, null, 28, null);
    }

    @NotNull
    public static final Resolver createFontFamilyResolver(@NotNull Context context0, @NotNull CoroutineContext coroutineContext0) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context0), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context0), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), coroutineContext0), null, 16, null);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @InternalTextApi
    @NotNull
    public static final Resolver emptyCacheFontFamilyResolver(@NotNull Context context0) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context0), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, null), null, 18, null);
    }

    @NotNull
    public static final State resolveAsTypeface-Wqqsr6A(@NotNull Resolver fontFamily$Resolver0, @Nullable FontFamily fontFamily0, @NotNull FontWeight fontWeight0, int v, int v1) {
        State state0 = fontFamily$Resolver0.resolve-DPcqOEQ(fontFamily0, fontWeight0, v, v1);
        Intrinsics.checkNotNull(state0, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return state0;
    }

    public static State resolveAsTypeface-Wqqsr6A$default(Resolver fontFamily$Resolver0, FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            fontFamily0 = null;
        }
        if((v2 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 1;
        }
        return FontFamilyResolver_androidKt.resolveAsTypeface-Wqqsr6A(fontFamily$Resolver0, fontFamily0, fontWeight0, v, v1);
    }
}

