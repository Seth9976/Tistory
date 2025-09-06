package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0003\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0005\u001A\u00020\u0002*\u00020\u0002\u001A\u000F\u0010\u0006\u001A\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001A\u000F\u0010\t\u001A\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001A\u000F\u0010\n\u001A\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001A\u000F\u0010\u000B\u001A\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\f"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "positionOnScreen", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,293:1\n71#2,16:294\n71#2,16:310\n71#2,16:326\n71#2,16:342\n49#2:358\n60#2:359\n49#2:360\n60#2:361\n*S KotlinDebug\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n*L\n223#1:294,16\n224#1:310,16\n225#1:326,16\n226#1:342,16\n242#1:358\n243#1:359\n250#1:360\n251#1:361\n*E\n"})
public final class LayoutCoordinatesKt {
    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates0) {
        LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.getParentLayoutCoordinates();
        if(layoutCoordinates1 != null) {
            Rect rect0 = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates1, layoutCoordinates0, false, 2, null);
            return rect0 == null ? new Rect(0.0f, 0.0f, ((float)IntSize.getWidth-impl(layoutCoordinates0.getSize-YbymL2g())), ((float)IntSize.getHeight-impl(layoutCoordinates0.getSize-YbymL2g()))) : rect0;
        }
        return new Rect(0.0f, 0.0f, ((float)IntSize.getWidth-impl(layoutCoordinates0.getSize-YbymL2g())), ((float)IntSize.getHeight-impl(layoutCoordinates0.getSize-YbymL2g())));
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates0) {
        return LayoutCoordinates.localBoundingBoxOf$default(LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates0), layoutCoordinates0, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates0) {
        LayoutCoordinates layoutCoordinates1 = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates0);
        float f = (float)IntSize.getWidth-impl(layoutCoordinates1.getSize-YbymL2g());
        float f1 = (float)IntSize.getHeight-impl(layoutCoordinates1.getSize-YbymL2g());
        Rect rect0 = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates0);
        float f2 = rect0.getLeft();
        float f3 = 0.0f;
        if(f2 < 0.0f) {
            f2 = 0.0f;
        }
        if(f2 > f) {
            f2 = f;
        }
        float f4 = rect0.getTop() < 0.0f ? 0.0f : rect0.getTop();
        if(f4 > f1) {
            f4 = f1;
        }
        float f5 = rect0.getRight() < 0.0f ? 0.0f : rect0.getRight();
        if(f5 <= f) {
            f = f5;
        }
        float f6 = rect0.getBottom();
        if(f6 >= 0.0f) {
            f3 = f6;
        }
        if(f3 <= f1) {
            f1 = f3;
        }
        if(f2 == f || f4 == f1) {
            return Rect.Companion.getZero();
        }
        long v = layoutCoordinates1.localToWindow-MK-Hz9U(OffsetKt.Offset(f2, f4));
        long v1 = layoutCoordinates1.localToWindow-MK-Hz9U(OffsetKt.Offset(f, f4));
        long v2 = layoutCoordinates1.localToWindow-MK-Hz9U(OffsetKt.Offset(f, f1));
        long v3 = layoutCoordinates1.localToWindow-MK-Hz9U(OffsetKt.Offset(f2, f1));
        float f7 = Offset.getX-impl(v);
        float f8 = Offset.getX-impl(v1);
        float f9 = Offset.getX-impl(v3);
        float f10 = Offset.getX-impl(v2);
        float f11 = Offset.getY-impl(v);
        float f12 = Offset.getY-impl(v1);
        float f13 = Offset.getY-impl(v3);
        float f14 = Offset.getY-impl(v2);
        return new Rect(Math.min(f7, Math.min(f8, Math.min(f9, f10))), Math.min(f11, Math.min(f12, Math.min(f13, f14))), Math.max(f7, Math.max(f8, Math.max(f9, f10))), Math.max(f11, Math.max(f12, Math.max(f13, f14))));
    }

    @NotNull
    public static final LayoutCoordinates findRootCoordinates(@NotNull LayoutCoordinates layoutCoordinates0) {
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates2;
        for(LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.getParentLayoutCoordinates(); true; layoutCoordinates1 = layoutCoordinates0.getParentLayoutCoordinates()) {
            layoutCoordinates2 = layoutCoordinates0;
            layoutCoordinates0 = layoutCoordinates1;
            if(layoutCoordinates0 == null) {
                break;
            }
        }
        NodeCoordinator nodeCoordinator0 = layoutCoordinates2 instanceof NodeCoordinator ? ((NodeCoordinator)layoutCoordinates2) : null;
        if(nodeCoordinator0 == null) {
            return layoutCoordinates2;
        }
        for(NodeCoordinator nodeCoordinator1 = nodeCoordinator0.getWrappedBy$ui_release(); true; nodeCoordinator1 = nodeCoordinator0.getWrappedBy$ui_release()) {
            layoutCoordinates3 = nodeCoordinator0;
            nodeCoordinator0 = nodeCoordinator1;
            if(nodeCoordinator0 == null) {
                break;
            }
        }
        return layoutCoordinates3;
    }

    // 去混淆评级： 低(20)
    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates0) {
        LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.getParentLayoutCoordinates();
        return layoutCoordinates1 == null ? 0L : layoutCoordinates1.localPositionOf-R5De75A(layoutCoordinates0, 0L);
    }

    // 去混淆评级： 低(20)
    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates0) {
        return layoutCoordinates0.localToRoot-MK-Hz9U(0L);
    }

    // 去混淆评级： 低(20)
    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates0) {
        return layoutCoordinates0.localToWindow-MK-Hz9U(0L);
    }

    // 去混淆评级： 低(20)
    public static final long positionOnScreen(@NotNull LayoutCoordinates layoutCoordinates0) {
        return layoutCoordinates0.localToScreen-MK-Hz9U(0L);
    }
}

