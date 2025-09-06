package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.State;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000BR\u001D\u0010\t\u001A\u00020\u00028G¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\f\r\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "", "", "a", "Z", "getCanLoadSynchronously", "()Z", "getCanLoadSynchronously$annotations", "()V", "canLoadSynchronously", "Companion", "Resolver", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class FontFamily {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\f\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001A\u0004\b\r\u0010\u000BR\u0017\u0010\u000E\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u000BR\u0017\u0010\u0010\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001A\u0004\b\u0011\u0010\u000B¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Companion;", "", "Landroidx/compose/ui/text/font/SystemFontFamily;", "Default", "Landroidx/compose/ui/text/font/SystemFontFamily;", "getDefault", "()Landroidx/compose/ui/text/font/SystemFontFamily;", "Landroidx/compose/ui/text/font/GenericFontFamily;", "SansSerif", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getSansSerif", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Serif", "getSerif", "Monospace", "getMonospace", "Cursive", "getCursive", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final GenericFontFamily getCursive() {
            return FontFamily.f;
        }

        @NotNull
        public final SystemFontFamily getDefault() {
            return FontFamily.b;
        }

        @NotNull
        public final GenericFontFamily getMonospace() {
            return FontFamily.e;
        }

        @NotNull
        public final GenericFontFamily getSansSerif() {
            return FontFamily.c;
        }

        @NotNull
        public final GenericFontFamily getSerif() {
            return FontFamily.d;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006JB\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u000EH&ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0001\u0001\u0011ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Resolver;", "", "preload", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/runtime/State;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Resolver {
        @Nullable
        Object preload(@NotNull FontFamily arg1, @NotNull Continuation arg2);

        @NotNull
        State resolve-DPcqOEQ(@Nullable FontFamily arg1, @NotNull FontWeight arg2, int arg3, int arg4);

        static State resolve-DPcqOEQ$default(Resolver fontFamily$Resolver0, FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
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
            return fontFamily$Resolver0.resolve-DPcqOEQ(fontFamily0, fontWeight0, v, v1);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final boolean a;
    public static final DefaultFontFamily b;
    public static final GenericFontFamily c;
    public static final GenericFontFamily d;
    public static final GenericFontFamily e;
    public static final GenericFontFamily f;

    static {
        FontFamily.Companion = new Companion(null);
        FontFamily.b = new DefaultFontFamily();
        FontFamily.c = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
        FontFamily.d = new GenericFontFamily("serif", "FontFamily.Serif");
        FontFamily.e = new GenericFontFamily("monospace", "FontFamily.Monospace");
        FontFamily.f = new GenericFontFamily("cursive", "FontFamily.Cursive");
    }

    public FontFamily(boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = z;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Unused property that has no meaning. Do not use.")
    public final boolean getCanLoadSynchronously() {
        return this.a;
    }

    public static void getCanLoadSynchronously$annotations() {
    }
}

