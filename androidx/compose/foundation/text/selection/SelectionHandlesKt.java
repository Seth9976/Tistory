package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u001A\u0010\u0004\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\'\u0010\n\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A\u001F\u0010\r\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000E\"\u001A\u0010\u0014\u001A\u00020\u000F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u001A\u0010\u0017\u001A\u00020\u000F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001A\u0004\b\u0016\u0010\u0013\" \u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00190\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "position", "getAdjustedCoordinates-k-4lQ0M", "(J)J", "getAdjustedCoordinates", "", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "isLeftSelectionHandle", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Z)Z", "areHandlesCrossed", "isHandleLtrDirection", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;Z)Z", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getHandleWidth", "()F", "HandleWidth", "b", "getHandleHeight", "HandleHeight", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "c", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getSelectionHandleInfoKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "SelectionHandleInfoKey", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,169:1\n148#2:170\n148#2:171\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n36#1:170\n37#1:171\n*E\n"})
public final class SelectionHandlesKt {
    public static final float a;
    public static final float b;
    public static final SemanticsPropertyKey c;

    static {
        SelectionHandlesKt.a = 25.0f;
        SelectionHandlesKt.b = 25.0f;
        SelectionHandlesKt.c = new SemanticsPropertyKey("SelectionHandleInfo", null, 2, null);
    }

    public static final long getAdjustedCoordinates-k-4lQ0M(long v) {
        return OffsetKt.Offset(Offset.getX-impl(v), Offset.getY-impl(v) - 1.0f);
    }

    public static final float getHandleHeight() [...] // 潜在的解密器

    public static final float getHandleWidth() [...] // 潜在的解密器

    @NotNull
    public static final SemanticsPropertyKey getSelectionHandleInfoKey() {
        return SelectionHandlesKt.c;
    }

    // 去混淆评级： 低(30)
    public static final boolean isHandleLtrDirection(@NotNull ResolvedTextDirection resolvedTextDirection0, boolean z) {
        return resolvedTextDirection0 == ResolvedTextDirection.Ltr && !z || resolvedTextDirection0 == ResolvedTextDirection.Rtl && z;
    }

    // 去混淆评级： 低(30)
    public static final boolean isLeftSelectionHandle(boolean z, @NotNull ResolvedTextDirection resolvedTextDirection0, boolean z1) {
        return z ? SelectionHandlesKt.isHandleLtrDirection(resolvedTextDirection0, z1) : !SelectionHandlesKt.isHandleLtrDirection(resolvedTextDirection0, z1);
    }
}

