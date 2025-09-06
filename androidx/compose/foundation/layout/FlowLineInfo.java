package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ2\u0010\r\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fR\"\u0010\u0003\u001A\u00020\u00028\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001A\u00020\u00028\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u000F\u001A\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R(\u0010\u0006\u001A\u00020\u00058\u0000@\u0000X\u0080\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR(\u0010\u0007\u001A\u00020\u00058\u0000@\u0000X\u0080\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001D\u0010\u0018\u001A\u0004\b\u001E\u0010\u001A\"\u0004\b\u001F\u0010\u001C\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/FlowLineInfo;", "", "", "lineIndex", "positionInLine", "Landroidx/compose/ui/unit/Dp;", "maxMainAxisSize", "maxCrossAxisSize", "<init>", "(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "update-4j6BHR0$foundation_layout_release", "(IIFF)V", "update", "a", "I", "getLineIndex$foundation_layout_release", "()I", "setLineIndex$foundation_layout_release", "(I)V", "b", "getPositionInLine$foundation_layout_release", "setPositionInLine$foundation_layout_release", "c", "F", "getMaxMainAxisSize-D9Ej5fM$foundation_layout_release", "()F", "setMaxMainAxisSize-0680j_4$foundation_layout_release", "(F)V", "d", "getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release", "setMaxCrossAxisSize-0680j_4$foundation_layout_release", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,564:1\n148#2:565\n148#2:566\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n*L\n544#1:565\n545#1:566\n*E\n"})
public final class FlowLineInfo {
    public static final int $stable = 8;
    public int a;
    public int b;
    public float c;
    public float d;

    public FlowLineInfo(int v, int v1, float f, float f1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            f = 0.0f;
        }
        if((v2 & 8) != 0) {
            f1 = 0.0f;
        }
        this(((v2 & 1) == 0 ? v : 0), ((v2 & 2) == 0 ? v1 : 0), f, f1, null);
    }

    public FlowLineInfo(int v, int v1, float f, float f1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = f;
        this.d = f1;
    }

    public final int getLineIndex$foundation_layout_release() {
        return this.a;
    }

    public final float getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release() {
        return this.d;
    }

    public final float getMaxMainAxisSize-D9Ej5fM$foundation_layout_release() {
        return this.c;
    }

    public final int getPositionInLine$foundation_layout_release() {
        return this.b;
    }

    public final void setLineIndex$foundation_layout_release(int v) {
        this.a = v;
    }

    public final void setMaxCrossAxisSize-0680j_4$foundation_layout_release(float f) {
        this.d = f;
    }

    public final void setMaxMainAxisSize-0680j_4$foundation_layout_release(float f) {
        this.c = f;
    }

    public final void setPositionInLine$foundation_layout_release(int v) {
        this.b = v;
    }

    public final void update-4j6BHR0$foundation_layout_release(int v, int v1, float f, float f1) {
        this.a = v;
        this.b = v1;
        this.c = f;
        this.d = f1;
    }
}

