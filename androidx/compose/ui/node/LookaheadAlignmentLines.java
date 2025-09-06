package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001E\u0010\f\u001A\u00020\r*\u00020\t2\u0006\u0010\u000E\u001A\u00020\rH\u0014ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u0014\u0010\u0011\u001A\u00020\b*\u00020\t2\u0006\u0010\u0012\u001A\u00020\u0007H\u0014R$\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006*\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LookaheadAlignmentLines;", "Landroidx/compose/ui/node/AlignmentLines;", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "alignmentLinesMap", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "Landroidx/compose/ui/node/NodeCoordinator;", "getAlignmentLinesMap", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "calculatePositionInParent", "Landroidx/compose/ui/geometry/Offset;", "position", "calculatePositionInParent-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "getPositionFor", "alignmentLine", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,247:1\n175#2:248\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n*L\n245#1:248\n*E\n"})
public final class LookaheadAlignmentLines extends AlignmentLines {
    public static final int $stable;

    public LookaheadAlignmentLines(@NotNull AlignmentLinesOwner alignmentLinesOwner0) {
        super(alignmentLinesOwner0, null);
    }

    @Override  // androidx.compose.ui.node.AlignmentLines
    public long calculatePositionInParent-R5De75A(@NotNull NodeCoordinator nodeCoordinator0, long v) {
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        long v1 = lookaheadDelegate0.getPosition-nOcc-ac();
        return Offset.plus-MK-Hz9U(OffsetKt.Offset(IntOffset.getX-impl(v1), IntOffset.getY-impl(v1)), v);
    }

    @Override  // androidx.compose.ui.node.AlignmentLines
    @NotNull
    public Map getAlignmentLinesMap(@NotNull NodeCoordinator nodeCoordinator0) {
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        return lookaheadDelegate0.getMeasureResult$ui_release().getAlignmentLines();
    }

    @Override  // androidx.compose.ui.node.AlignmentLines
    public int getPositionFor(@NotNull NodeCoordinator nodeCoordinator0, @NotNull AlignmentLine alignmentLine0) {
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        return lookaheadDelegate0.get(alignmentLine0);
    }
}

