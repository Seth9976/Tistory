package androidx.compose.material3.internal;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w0.g;
import w0.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0007\u001A\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u001A\u0010\r\u001A\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "a", "F", "getHorizontalSemanticsBoundsPadding", "()F", "getHorizontalSemanticsBoundsPadding$annotations", "()V", "HorizontalSemanticsBoundsPadding", "Landroidx/compose/ui/Modifier;", "b", "Landroidx/compose/ui/Modifier;", "getIncreaseHorizontalSemanticsBounds", "()Landroidx/compose/ui/Modifier;", "IncreaseHorizontalSemanticsBounds", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAccessibilityUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityUtil.kt\nandroidx/compose/material3/internal/AccessibilityUtilKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,49:1\n148#2:50\n*S KotlinDebug\n*F\n+ 1 AccessibilityUtil.kt\nandroidx/compose/material3/internal/AccessibilityUtilKt\n*L\n28#1:50\n*E\n"})
public final class AccessibilityUtilKt {
    public static final float a;
    public static final Modifier b;

    static {
        AccessibilityUtilKt.a = 10.0f;
        AccessibilityUtilKt.b = PaddingKt.padding-VpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.Companion, g.w), true, h.x), 10.0f, 0.0f, 2, null);
    }

    public static final float getHorizontalSemanticsBoundsPadding() {
        return AccessibilityUtilKt.a;
    }

    @VisibleForTesting
    public static void getHorizontalSemanticsBoundsPadding$annotations() {
    }

    @NotNull
    public static final Modifier getIncreaseHorizontalSemanticsBounds() {
        return AccessibilityUtilKt.b;
    }
}

