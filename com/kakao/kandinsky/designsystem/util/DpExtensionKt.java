package com.kakao.kandinsky.designsystem.util;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0011\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001A\u0016\u0010\u0004\u001A\u00020\u0005*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A\u0016\u0010\t\u001A\u00020\n*\u00020\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\b\u001A\u0016\u0010\r\u001A\u00020\u0006*\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"toDp", "Landroidx/compose/ui/unit/Dp;", "", "(FLandroidx/compose/runtime/Composer;I)F", "toDpOffset", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/geometry/Offset;", "toDpOffset-9KIMszo", "(JLandroidx/compose/runtime/Composer;I)J", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-Pq9zytI", "toOffset", "toOffset-rOJDEFc", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDpExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DpExtension.kt\ncom/kakao/kandinsky/designsystem/util/DpExtensionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n77#2:22\n77#2:24\n77#2:25\n77#2:26\n1#3:23\n*S KotlinDebug\n*F\n+ 1 DpExtension.kt\ncom/kakao/kandinsky/designsystem/util/DpExtensionKt\n*L\n11#1:22\n14#1:24\n17#1:25\n20#1:26\n*E\n"})
public final class DpExtensionKt {
    @Composable
    public static final float toDp(float f, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(2088757079);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2088757079, v, -1, "com.kakao.kandinsky.designsystem.util.toDp (DpExtension.kt:10)");
        }
        float f1 = ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).toDp-u2uoSUM(f);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return f1;
    }

    @Composable
    public static final long toDpOffset-9KIMszo(long v, @Nullable Composer composer0, int v1) {
        composer0.startReplaceGroup(0x5005CF0A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5005CF0A, v1, -1, "com.kakao.kandinsky.designsystem.util.toDpOffset (DpExtension.kt:13)");
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        long v2 = DpKt.DpOffset-YgX7TsA(density0.toDp-u2uoSUM(Offset.getX-impl(v)), density0.toDp-u2uoSUM(Offset.getY-impl(v)));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return v2;
    }

    @Composable
    public static final long toDpSize-Pq9zytI(long v, @Nullable Composer composer0, int v1) {
        composer0.startReplaceGroup(2049341496);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2049341496, v1, -1, "com.kakao.kandinsky.designsystem.util.toDpSize (DpExtension.kt:19)");
        }
        long v2 = ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).toDpSize-k-rfVVM(v);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return v2;
    }

    @Composable
    public static final long toOffset-rOJDEFc(long v, @Nullable Composer composer0, int v1) {
        composer0.startReplaceGroup(540203014);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540203014, v1, -1, "com.kakao.kandinsky.designsystem.util.toOffset (DpExtension.kt:16)");
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        long v2 = OffsetKt.Offset(density0.toPx-0680j_4(DpOffset.getX-D9Ej5fM(v)), density0.toPx-0680j_4(DpOffset.getY-D9Ej5fM(v)));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return v2;
    }
}

