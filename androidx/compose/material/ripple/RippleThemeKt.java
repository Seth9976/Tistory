package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u0.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"&\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001A\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/ripple/RippleTheme;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalRippleTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalRippleTheme$annotations", "()V", "LocalRippleTheme", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class RippleThemeKt {
    public static final ProvidableCompositionLocal a;
    public static final RippleAlpha b;
    public static final RippleAlpha c;
    public static final RippleAlpha d;

    static {
        RippleThemeKt.a = CompositionLocalKt.staticCompositionLocalOf(o.w);
        RippleThemeKt.b = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
        RippleThemeKt.c = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
        RippleThemeKt.d = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static final RippleAlpha access$getLightThemeLowContrastRippleAlpha$p() {
        return RippleThemeKt.c;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalRippleTheme() {
        return RippleThemeKt.a;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
    public static void getLocalRippleTheme$annotations() {
    }
}

