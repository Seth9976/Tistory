package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\n\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u0006H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\tJ\u001A\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u0006H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\tJ\u001A\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u0006H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\tJ\u001A\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u0006H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\tJ\"\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\u00012\u0006\u0010\u0016\u001A\u00020\u0006H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\u00012\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u001B\u001A\u00020\u001AH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010 \u001A\u00020\u001F2\u0006\u0010\u0015\u001A\u00020\u00012\u0006\u0010\u001E\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b \u0010!J\"\u0010\'\u001A\u00020$2\u0006\u0010\u0015\u001A\u00020\u00012\u0006\u0010#\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u001A\u0010*\u001A\u00020$2\u0006\u0010#\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)J\u0018\u0010.\u001A\u00020-2\u0006\u0010,\u001A\u00020+H\u0096\u0002\u00A2\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0011\u00107\u001A\u0002048F\u00A2\u0006\u0006\u001A\u0004\b5\u00106R\u001A\u0010;\u001A\u0002088VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b9\u0010:R\u001A\u0010?\u001A\b\u0012\u0004\u0012\u00020+0<8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b=\u0010>R\u0016\u0010B\u001A\u0004\u0018\u00010\u00018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b@\u0010AR\u0016\u0010D\u001A\u0004\u0018\u00010\u00018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bC\u0010AR\u0014\u0010E\u001A\u00020\u001A8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bE\u0010FR\u0014\u0010H\u001A\u00020\u001A8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bG\u0010F\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006I"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "<init>", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Landroidx/compose/ui/geometry/Offset;", "relativeToScreen", "screenToLocal-MK-Hz9U", "(J)J", "screenToLocal", "relativeToLocal", "localToScreen-MK-Hz9U", "localToScreen", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "localToWindow-MK-Hz9U", "localToWindow", "localToRoot-MK-Hz9U", "localToRoot", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "", "includeMotionFrameOfReference", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "transformToScreen-58bKbWc", "([F)V", "transformToScreen", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "a", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "isAttached", "()Z", "getIntroducesMotionFrameOfReference", "introducesMotionFrameOfReference", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,187:1\n1#2:188\n42#3,7:189\n42#3,7:196\n175#4:203\n175#4:204\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n*L\n44#1:189,7\n51#1:196,7\n113#1:203\n129#1:204\n*E\n"})
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable;
    public final LookaheadDelegate a;

    public LookaheadLayoutCoordinates(@NotNull LookaheadDelegate lookaheadDelegate0) {
        this.a = lookaheadDelegate0;
    }

    // 去混淆评级： 低(20)
    public final long a() {
        LookaheadDelegate lookaheadDelegate0 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.a);
        return Offset.minus-MK-Hz9U(this.localPositionOf-R5De75A(lookaheadDelegate0.getCoordinates(), 0L), this.getCoordinator().localPositionOf-R5De75A(lookaheadDelegate0.getCoordinator(), 0L));
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public int get(@NotNull AlignmentLine alignmentLine0) {
        return this.a.get(alignmentLine0);
    }

    @NotNull
    public final NodeCoordinator getCoordinator() {
        return this.a.getCoordinator();
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return this.a.isPlacedUnderMotionFrameOfReference();
    }

    @NotNull
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public LayoutCoordinates getParentCoordinates() {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator nodeCoordinator0 = this.getCoordinator().getWrappedBy$ui_release();
        if(nodeCoordinator0 != null) {
            LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.getLookaheadDelegate();
            return lookaheadDelegate0 == null ? null : lookaheadDelegate0.getCoordinates();
        }
        return null;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public LayoutCoordinates getParentLayoutCoordinates() {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator nodeCoordinator0 = this.getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy$ui_release();
        if(nodeCoordinator0 != null) {
            LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.getLookaheadDelegate();
            return lookaheadDelegate0 == null ? null : lookaheadDelegate0.getCoordinates();
        }
        return null;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set getProvidedAlignmentLines() {
        return this.getCoordinator().getProvidedAlignmentLines();
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long getSize-YbymL2g() {
        return IntSizeKt.IntSize(this.a.getWidth(), this.a.getHeight());
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return this.getCoordinator().isAttached();
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates layoutCoordinates0, boolean z) {
        return this.getCoordinator().localBoundingBoxOf(layoutCoordinates0, z);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localPositionOf-R5De75A(@NotNull LayoutCoordinates layoutCoordinates0, long v) {
        return this.localPositionOf-S_NoaFU(layoutCoordinates0, v, true);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localPositionOf-S_NoaFU(@NotNull LayoutCoordinates layoutCoordinates0, long v, boolean z) {
        LookaheadDelegate lookaheadDelegate0 = this.a;
        if(layoutCoordinates0 instanceof LookaheadLayoutCoordinates) {
            LookaheadDelegate lookaheadDelegate1 = ((LookaheadLayoutCoordinates)layoutCoordinates0).a;
            lookaheadDelegate1.getCoordinator().onCoordinatesUsed$ui_release();
            LookaheadDelegate lookaheadDelegate2 = this.getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate1.getCoordinator()).getLookaheadDelegate();
            if(lookaheadDelegate2 != null) {
                long v1 = IntOffset.minus-qkQi6aY(IntOffset.plus-qkQi6aY(lookaheadDelegate1.positionIn-iSbpLlY$ui_release(lookaheadDelegate2, !z), IntOffsetKt.round-k-4lQ0M(v)), lookaheadDelegate0.positionIn-iSbpLlY$ui_release(lookaheadDelegate2, !z));
                return OffsetKt.Offset(IntOffset.getX-impl(v1), IntOffset.getY-impl(v1));
            }
            LookaheadDelegate lookaheadDelegate3 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate1);
            long v2 = IntOffset.plus-qkQi6aY(IntOffset.plus-qkQi6aY(lookaheadDelegate1.positionIn-iSbpLlY$ui_release(lookaheadDelegate3, !z), lookaheadDelegate3.getPosition-nOcc-ac()), IntOffsetKt.round-k-4lQ0M(v));
            LookaheadDelegate lookaheadDelegate4 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate0);
            long v3 = IntOffset.minus-qkQi6aY(v2, IntOffset.plus-qkQi6aY(lookaheadDelegate0.positionIn-iSbpLlY$ui_release(lookaheadDelegate4, !z), lookaheadDelegate4.getPosition-nOcc-ac()));
            NodeCoordinator nodeCoordinator0 = lookaheadDelegate4.getCoordinator().getWrappedBy$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator0);
            NodeCoordinator nodeCoordinator1 = lookaheadDelegate3.getCoordinator().getWrappedBy$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator1);
            return nodeCoordinator0.localPositionOf-S_NoaFU(nodeCoordinator1, OffsetKt.Offset(IntOffset.getX-impl(v3), IntOffset.getY-impl(v3)), z);
        }
        LookaheadDelegate lookaheadDelegate5 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate0);
        return Offset.plus-MK-Hz9U(this.localPositionOf-S_NoaFU(lookaheadDelegate5.getLookaheadLayoutCoordinates(), v, z), lookaheadDelegate5.getCoordinator().getCoordinates().localPositionOf-S_NoaFU(layoutCoordinates0, 0L, z));
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localToRoot-MK-Hz9U(long v) {
        return this.getCoordinator().localToRoot-MK-Hz9U(Offset.plus-MK-Hz9U(v, this.a()));
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localToScreen-MK-Hz9U(long v) {
        return this.getCoordinator().localToScreen-MK-Hz9U(Offset.plus-MK-Hz9U(v, this.a()));
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localToWindow-MK-Hz9U(long v) {
        return this.getCoordinator().localToWindow-MK-Hz9U(Offset.plus-MK-Hz9U(v, this.a()));
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long screenToLocal-MK-Hz9U(long v) {
        return Offset.plus-MK-Hz9U(this.getCoordinator().screenToLocal-MK-Hz9U(v), this.a());
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public void transformFrom-EL8BTi8(@NotNull LayoutCoordinates layoutCoordinates0, @NotNull float[] arr_f) {
        this.getCoordinator().transformFrom-EL8BTi8(layoutCoordinates0, arr_f);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public void transformToScreen-58bKbWc(@NotNull float[] arr_f) {
        this.getCoordinator().transformToScreen-58bKbWc(arr_f);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long windowToLocal-MK-Hz9U(long v) {
        return Offset.plus-MK-Hz9U(this.getCoordinator().windowToLocal-MK-Hz9U(v), this.a());
    }
}

