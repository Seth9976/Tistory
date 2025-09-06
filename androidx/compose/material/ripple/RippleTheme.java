package androidx.compose.material.ripple;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(level = DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0015\u0010\u0002\u001A\u00020\u0003H\'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001A\u00020\u0007H\'¢\u0006\u0002\u0010\bø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material/ripple/RippleTheme;", "", "defaultColor", "Landroidx/compose/ui/graphics/Color;", "defaultColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleAlpha;", "Companion", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface RippleTheme {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\"\u0010\b\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material/ripple/RippleTheme$Companion;", "", "Landroidx/compose/ui/graphics/Color;", "contentColor", "", "lightTheme", "defaultRippleColor-5vOe2sY", "(JZ)J", "defaultRippleColor", "Landroidx/compose/material/ripple/RippleAlpha;", "defaultRippleAlpha-DxMtmZc", "(JZ)Landroidx/compose/material/ripple/RippleAlpha;", "defaultRippleAlpha", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "The default ripple alpha varies between design system versions: this function technically implements the default used by the material library, but is not used by the material3 library. To remove confusion and link the defaults more strongly to the design system library, these default values have been moved to the material and material3 libraries. For material, use MaterialRippleThemeDefaults#rippleAlpha. For material3, use MaterialRippleThemeDefaults#RippleAlpha.")
        @NotNull
        public final RippleAlpha defaultRippleAlpha-DxMtmZc(long v, boolean z) {
            if(z) {
                return ((double)ColorKt.luminance-8_81llA(v)) > 0.5 ? RippleThemeKt.b : RippleThemeKt.access$getLightThemeLowContrastRippleAlpha$p();
            }
            return RippleThemeKt.d;
        }

        // 去混淆评级： 低(30)
        @Deprecated(level = DeprecationLevel.WARNING, message = "The default ripple color varies between design system versions: this function technically implements the default used by the material library, but is not used by the material3 library. To remove confusion and link the defaults more strongly to the design system library, these default values have been moved to the material and material3 libraries. For material, use MaterialRippleThemeDefaults#rippleColor. For material3, use content color directly.")
        public final long defaultRippleColor-5vOe2sY(long v, boolean z) {
            return z || ((double)ColorKt.luminance-8_81llA(v)) >= 0.5 ? v : 0xFFFFFFFF00000000L;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        RippleTheme.Companion = Companion.a;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
    long defaultColor-WaAFU9c(@Nullable Composer arg1, int arg2);

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
    @NotNull
    RippleAlpha rippleAlpha(@Nullable Composer arg1, int arg2);
}

