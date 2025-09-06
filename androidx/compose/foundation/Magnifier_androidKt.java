package androidx.compose.foundation;

import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u0094\u0001\u0010\u0014\u001A\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00A2\u0006\u0002\b\u00042\u001B\b\u0002\u0010\u0006\u001A\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001\u00A2\u0006\u0002\b\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\u00072\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A\u00AC\u0001\u0010\u0014\u001A\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00A2\u0006\u0002\b\u00042\u001B\b\u0002\u0010\u0006\u001A\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001\u00A2\u0006\u0002\b\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\u0015\u001A\u00020\u00102\b\b\u0002\u0010\f\u001A\u00020\u00072\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\b\b\u0002\u0010\u0016\u001A\u00020\u00102\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001A\u0019\u0010\u001D\u001A\u00020\u00102\b\b\u0002\u0010\u001C\u001A\u00020\u001BH\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A\u001B\u0010 \u001A\u00020\u0010*\u00020\n2\u0006\u0010\u001F\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b \u0010!\"&\u0010(\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030#0\"8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006)"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "", "zoom", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "", "clip", "magnifier-UpNRX3w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FJFFZ)Landroidx/compose/ui/Modifier;", "magnifier", "useTextDefault", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "magnifier-jPUL71Q", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;)Landroidx/compose/ui/Modifier;", "", "sdkVersion", "isPlatformMagnifierSupported", "(I)Z", "other", "equalsIncludingNaN", "(FF)Z", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "a", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "MagnifierPositionInRoot", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class Magnifier_androidKt {
    public static final SemanticsPropertyKey a;

    static {
        Magnifier_androidKt.a = new SemanticsPropertyKey("MagnifierPositionInRoot", null, 2, null);
    }

    // 去混淆评级： 低(20)
    public static final boolean equalsIncludingNaN(float f, float f1) {
        return !Float.isNaN(f) || !Float.isNaN(f1) ? f == f1 : true;
    }

    @NotNull
    public static final SemanticsPropertyKey getMagnifierPositionInRoot() {
        return Magnifier_androidKt.a;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int v) {
        return v >= 28;
    }

    public static boolean isPlatformMagnifierSupported$default(int v, int v1, Object object0) [...] // 潜在的解密器

    @NotNull
    public static final Modifier magnifier-UpNRX3w(@NotNull Modifier modifier0, @NotNull Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, float f, long v, float f1, float f2, boolean z) {
        return Magnifier_androidKt.magnifier-jPUL71Q$default(modifier0, function10, function11, function12, f, false, v, f1, f2, z, null, 0x200, null);
    }

    public static Modifier magnifier-UpNRX3w$default(Modifier modifier0, Function1 function10, Function1 function11, Function1 function12, float f, long v, float f1, float f2, boolean z, int v1, Object object0) {
        Function1 function13 = null;
        Function1 function14 = (v1 & 2) == 0 ? function11 : null;
        if((v1 & 4) == 0) {
            function13 = function12;
        }
        float f3 = (v1 & 8) == 0 ? f : NaNf;
        long v2 = (v1 & 16) == 0 ? v : 0x7FC000007FC00000L;
        float f4 = (v1 & 0x20) == 0 ? f1 : NaNf;
        float f5 = (v1 & 0x40) == 0 ? f2 : NaNf;
        return (v1 & 0x80) == 0 ? Magnifier_androidKt.magnifier-UpNRX3w(modifier0, function10, function14, function13, f3, v2, f4, f5, z) : Magnifier_androidKt.magnifier-UpNRX3w(modifier0, function10, function14, function13, f3, v2, f4, f5, true);
    }

    // 去混淆评级： 低(40)
    @NotNull
    public static final Modifier magnifier-jPUL71Q(@NotNull Modifier modifier0, @NotNull Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, float f, boolean z, long v, float f1, float f2, boolean z1, @Nullable PlatformMagnifierFactory platformMagnifierFactory0) {
        return platformMagnifierFactory0 == null ? modifier0.then(new MagnifierElement(function10, function11, function12, f, z, v, f1, f2, z1, PlatformMagnifierFactory.Companion.getForCurrentPlatform(), null)) : modifier0.then(new MagnifierElement(function10, function11, function12, f, z, v, f1, f2, z1, platformMagnifierFactory0, null));
    }

    // 去混淆评级： 中等(70)
    public static Modifier magnifier-jPUL71Q$default(Modifier modifier0, Function1 function10, Function1 function11, Function1 function12, float f, boolean z, long v, float f1, float f2, boolean z1, PlatformMagnifierFactory platformMagnifierFactory0, int v1, Object object0) {
        return Magnifier_androidKt.magnifier-jPUL71Q(modifier0, function10, ((v1 & 2) == 0 ? function11 : null), ((v1 & 4) == 0 ? function12 : null), ((v1 & 8) == 0 ? f : NaNf), ((v1 & 16) == 0 ? z : false), ((v1 & 0x20) == 0 ? v : 0x7FC000007FC00000L), ((v1 & 0x40) == 0 ? f1 : NaNf), ((v1 & 0x80) == 0 ? f2 : NaNf), ((v1 & 0x100) == 0 ? z1 : true), ((v1 & 0x200) == 0 ? platformMagnifierFactory0 : null));
    }
}

