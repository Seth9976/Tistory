package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@RequiresApi(30)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000B\bc\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&J\u001A\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\"\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u000FH\u0016J\u0018\u0010\u0015\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u000FH&J\u0018\u0010\u0016\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u000FH\u0016J\u0010\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u0003H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u001AÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator;", "", "adjustInsets", "Landroid/graphics/Insets;", "oldInsets", "newValue", "", "consumedOffsets", "Landroidx/compose/ui/geometry/Offset;", "available", "consumedOffsets-MK-Hz9U", "(J)J", "consumedVelocity", "Landroidx/compose/ui/unit/Velocity;", "remaining", "", "consumedVelocity-QWom1Mo", "(JF)J", "hideMotion", "x", "y", "motionOf", "showMotion", "valueOf", "insets", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
interface SideCalculator {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\t\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "side", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/layout/SideCalculator;", "chooseCalculator-ni1skBw", "(ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/layout/SideCalculator;", "chooseCalculator", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final SideCalculator.Companion.LeftSideCalculator.1 b;
        public static final SideCalculator.Companion.TopSideCalculator.1 c;
        public static final SideCalculator.Companion.RightSideCalculator.1 d;
        public static final SideCalculator.Companion.BottomSideCalculator.1 e;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new SideCalculator.Companion.LeftSideCalculator.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.c = new SideCalculator.Companion.TopSideCalculator.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.d = new SideCalculator.Companion.RightSideCalculator.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.e = new SideCalculator.Companion.BottomSideCalculator.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final SideCalculator chooseCalculator-ni1skBw(int v, @NotNull LayoutDirection layoutDirection0) {
            SideCalculator sideCalculator0 = Companion.b;
            if(!WindowInsetsSides.equals-impl0(v, 10)) {
                if(WindowInsetsSides.equals-impl0(v, 16)) {
                    return Companion.c;
                }
                SideCalculator.Companion.RightSideCalculator.1 sideCalculator$Companion$RightSideCalculator$10 = Companion.d;
                if(WindowInsetsSides.equals-impl0(v, 5)) {
                    return sideCalculator$Companion$RightSideCalculator$10;
                }
                if(WindowInsetsSides.equals-impl0(v, 0x20)) {
                    return Companion.e;
                }
                if(WindowInsetsSides.equals-impl0(v, 9)) {
                    return layoutDirection0 != LayoutDirection.Ltr ? sideCalculator$Companion$RightSideCalculator$10 : sideCalculator0;
                }
                if(!WindowInsetsSides.equals-impl0(v, 6)) {
                    throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
                }
                if(layoutDirection0 == LayoutDirection.Ltr) {
                    return sideCalculator$Companion$RightSideCalculator$10;
                }
            }
            return sideCalculator0;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        SideCalculator.Companion = Companion.a;
    }

    @NotNull
    Insets adjustInsets(@NotNull Insets arg1, int arg2);

    long consumedOffsets-MK-Hz9U(long arg1);

    long consumedVelocity-QWom1Mo(long arg1, float arg2);

    default float hideMotion(float f, float f1) {
        return c.coerceAtMost(this.motionOf(f, f1), 0.0f);
    }

    float motionOf(float arg1, float arg2);

    default float showMotion(float f, float f1) {
        return c.coerceAtLeast(this.motionOf(f, f1), 0.0f);
    }

    int valueOf(@NotNull Insets arg1);
}

