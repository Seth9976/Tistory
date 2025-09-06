package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001A)\u0010\u0005\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001A\u0010\f\u001A\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u001A\u0010\u000F\u001A\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001A\u0004\b\u000E\u0010\u000B¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "Lkotlin/Function0;", "onHandwritingSlopExceeded", "stylusHandwriting", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getHandwritingBoundsVerticalOffset", "()F", "HandwritingBoundsVerticalOffset", "b", "getHandwritingBoundsHorizontalOffset", "HandwritingBoundsHorizontalOffset", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStylusHandwriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,223:1\n148#2:224\n148#2:225\n*S KotlinDebug\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n*L\n221#1:224\n222#1:225\n*E\n"})
public final class StylusHandwritingKt {
    public static final float a;
    public static final float b;

    static {
        StylusHandwritingKt.a = 40.0f;
        StylusHandwritingKt.b = 10.0f;
    }

    public static final float getHandwritingBoundsHorizontalOffset() [...] // 潜在的解密器

    public static final float getHandwritingBoundsVerticalOffset() [...] // 潜在的解密器

    // 去混淆评级： 低(40)
    @NotNull
    public static final Modifier stylusHandwriting(@NotNull Modifier modifier0, boolean z, @NotNull Function0 function00) {
        return modifier0;
    }
}

