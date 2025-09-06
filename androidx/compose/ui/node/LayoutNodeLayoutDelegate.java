package androidx.compose.ui.node;

import a2.b;
import androidx.compose.material3.p6;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001B\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002noB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\u000B\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\n\u0010\bJ\u000F\u0010\r\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\f\u0010\bJ\u000F\u0010\u000F\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u000E\u0010\bJ\r\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0010\u0010\bJ\u000F\u0010\u0012\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0016\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\bR$\u0010\u001D\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00178\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR$\u0010#\u001A\u00020\u001E2\u0006\u0010\u0018\u001A\u00020\u001E8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R$\u0010&\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00178\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b$\u0010\u001A\u001A\u0004\b%\u0010\u001CR$\u0010)\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00178\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b\'\u0010\u001A\u001A\u0004\b(\u0010\u001CR$\u0010,\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00178\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b*\u0010\u001A\u001A\u0004\b+\u0010\u001CR$\u0010/\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00178\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b-\u0010\u001A\u001A\u0004\b.\u0010\u001CR*\u00105\u001A\u00020\u00172\u0006\u00100\u001A\u00020\u00178\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b1\u0010\u001A\u001A\u0004\b2\u0010\u001C\"\u0004\b3\u00104R*\u00109\u001A\u00020\u00172\u0006\u00100\u001A\u00020\u00178\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b6\u0010\u001A\u001A\u0004\b7\u0010\u001C\"\u0004\b8\u00104R*\u0010A\u001A\u00020:2\u0006\u00100\u001A\u00020:8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010E\u001A\u00020\u00172\u0006\u00100\u001A\u00020\u00178\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010\u001A\u001A\u0004\bC\u0010\u001C\"\u0004\bD\u00104R*\u0010I\u001A\u00020\u00172\u0006\u00100\u001A\u00020\u00178\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bF\u0010\u001A\u001A\u0004\bG\u0010\u001C\"\u0004\bH\u00104R*\u0010M\u001A\u00020:2\u0006\u00100\u001A\u00020:8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bJ\u0010<\u001A\u0004\bK\u0010>\"\u0004\bL\u0010@R\u001E\u0010S\u001A\u00060NR\u00020\u00008\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010RR0\u0010Y\u001A\b\u0018\u00010TR\u00020\u00002\f\u0010\u0018\u001A\b\u0018\u00010TR\u00020\u00008\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u0010XR\u0011\u0010]\u001A\u00020Z8F\u00A2\u0006\u0006\u001A\u0004\b[\u0010\\R\u0019\u0010a\u001A\u0004\u0018\u00010^8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b_\u0010`R\u0019\u0010c\u001A\u0004\u0018\u00010^8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bb\u0010`R\u0014\u0010e\u001A\u00020:8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bd\u0010>R\u0014\u0010g\u001A\u00020:8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bf\u0010>R\u0014\u0010k\u001A\u00020h8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bi\u0010jR\u0016\u0010m\u001A\u0004\u0018\u00010h8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bl\u0010j\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006p"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "markLayoutPending$ui_release", "()V", "markLayoutPending", "markMeasurePending$ui_release", "markMeasurePending", "markLookaheadLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadMeasurePending$ui_release", "markLookaheadMeasurePending", "onCoordinatesUsed", "ensureLookaheadDelegateCreated$ui_release", "ensureLookaheadDelegateCreated", "updateParentData", "invalidateParentData", "resetAlignmentLines", "markChildrenDirty", "", "<set-?>", "b", "Z", "getDetachedFromParentLookaheadPass$ui_release", "()Z", "detachedFromParentLookaheadPass", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "c", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "d", "getMeasurePending$ui_release", "measurePending", "e", "getLayoutPending$ui_release", "layoutPending", "g", "getLookaheadMeasurePending$ui_release", "lookaheadMeasurePending", "h", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPending", "value", "l", "getCoordinatesAccessedDuringPlacement", "setCoordinatesAccessedDuringPlacement", "(Z)V", "coordinatesAccessedDuringPlacement", "m", "getCoordinatesAccessedDuringModifierPlacement", "setCoordinatesAccessedDuringModifierPlacement", "coordinatesAccessedDuringModifierPlacement", "", "n", "I", "getChildrenAccessingCoordinatesDuringPlacement", "()I", "setChildrenAccessingCoordinatesDuringPlacement", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "o", "getLookaheadCoordinatesAccessedDuringPlacement", "setLookaheadCoordinatesAccessedDuringPlacement", "lookaheadCoordinatesAccessedDuringPlacement", "p", "getLookaheadCoordinatesAccessedDuringModifierPlacement", "setLookaheadCoordinatesAccessedDuringModifierPlacement", "lookaheadCoordinatesAccessedDuringModifierPlacement", "q", "getChildrenAccessingLookaheadCoordinatesDuringPlacement", "setChildrenAccessingLookaheadCoordinatesDuringPlacement", "childrenAccessingLookaheadCoordinatesDuringPlacement", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "r", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "s", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "getLastLookaheadConstraints-DWUhwKw", "lastLookaheadConstraints", "getHeight$ui_release", "height", "getWidth$ui_release", "width", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner$ui_release", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getLookaheadAlignmentLinesOwner$ui_release", "lookaheadAlignmentLinesOwner", "LookaheadPassDelegate", "MeasurePassDelegate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1962:1\n42#2,7:1963\n1#3:1970\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n*L\n1769#1:1963,7\n*E\n"})
public final class LayoutNodeLayoutDelegate {
    @Metadata(d1 = {"\u0000\u009C\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000B\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\b\u0010\tJ\u001B\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\nH\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ#\u0010\u0011\u001A\u00020\u00072\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000FH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u0013\u0010\tJ\u000F\u0010\u0014\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u0014\u0010\tJ\r\u0010\u0015\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0015\u0010\tJ\u001A\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u0017\u001A\u00020\u0016H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\u0017\u001A\u00020\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ=\u0010(\u001A\u00020\u00072\u0006\u0010 \u001A\u00020\u001F2\u0006\u0010\"\u001A\u00020!2\u0019\u0010%\u001A\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000F\u00A2\u0006\u0002\b$H\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\'J*\u0010(\u001A\u00020\u00072\u0006\u0010 \u001A\u00020\u001F2\u0006\u0010\"\u001A\u00020!2\u0006\u0010*\u001A\u00020)H\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010+J\u0018\u0010-\u001A\u00020\f2\u0006\u0010,\u001A\u00020\u000BH\u0096\u0002\u00A2\u0006\u0004\b-\u0010.J\u0017\u00100\u001A\u00020\f2\u0006\u0010/\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b0\u00101J\u0017\u00102\u001A\u00020\f2\u0006\u0010/\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b2\u00101J\u0017\u00104\u001A\u00020\f2\u0006\u00103\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b4\u00101J\u0017\u00105\u001A\u00020\f2\u0006\u00103\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b5\u00101J\u0015\u00107\u001A\u00020\u00072\u0006\u00106\u001A\u00020\u001B\u00A2\u0006\u0004\b7\u00108J\r\u00109\u001A\u00020\u0007\u00A2\u0006\u0004\b9\u0010\tJ\r\u0010:\u001A\u00020\u001B\u00A2\u0006\u0004\b:\u0010;J\u000F\u0010=\u001A\u00020\u0007H\u0000\u00A2\u0006\u0004\b<\u0010\tJ\r\u0010>\u001A\u00020\u0007\u00A2\u0006\u0004\b>\u0010\tJ\r\u0010?\u001A\u00020\u0007\u00A2\u0006\u0004\b?\u0010\tR\"\u0010F\u001A\u00020\f8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b@\u0010A\u001A\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001A\u00020G8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010S\u001A\u00020\u001B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010;\"\u0004\bR\u00108R\"\u0010W\u001A\u00020\u001B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bT\u0010P\u001A\u0004\bU\u0010;\"\u0004\bV\u00108R*\u0010]\u001A\u00020\u001F2\u0006\u0010X\u001A\u00020\u001F8\u0000@BX\u0080\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010\\R$\u0010b\u001A\u00020!2\u0006\u0010X\u001A\u00020!8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010aRJ\u0010g\u001A\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000F\u00A2\u0006\u0002\b$2\u0019\u0010X\u001A\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000F\u00A2\u0006\u0002\b$8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bc\u0010d\u001A\u0004\be\u0010fR(\u0010l\u001A\u0004\u0018\u00010)2\b\u0010X\u001A\u0004\u0018\u00010)8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bh\u0010i\u001A\u0004\bj\u0010kR\"\u0010n\u001A\u00020\u001B8\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\bm\u0010P\u001A\u0004\bn\u0010;\"\u0004\bo\u00108R\u001A\u0010u\u001A\u00020p8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bq\u0010r\u001A\u0004\bs\u0010tR\"\u0010y\u001A\u00020\u001B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bv\u0010P\u001A\u0004\bw\u0010;\"\u0004\bx\u00108R$\u0010|\u001A\u00020\u001B2\u0006\u0010X\u001A\u00020\u001B8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bz\u0010P\u001A\u0004\b{\u0010;R+\u0010\u0082\u0001\u001A\u0004\u0018\u00010}2\b\u0010X\u001A\u0004\u0018\u00010}8\u0016@RX\u0096\u000E\u00A2\u0006\u000E\n\u0004\b~\u0010\u007F\u001A\u0006\b\u0080\u0001\u0010\u0081\u0001R/\u0010\u0085\u0001\u001A\u00020\u001B2\u0007\u0010\u0083\u0001\u001A\u00020\u001B8\u0016@VX\u0096\u000E\u00A2\u0006\u0015\n\u0005\b\u0084\u0001\u0010P\u001A\u0005\b\u0085\u0001\u0010;\"\u0005\b\u0086\u0001\u00108R\u001D\u0010\u008B\u0001\u001A\b0\u0087\u0001R\u00030\u0088\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u0089\u0001\u0010\u008A\u0001R\u001C\u0010\u008E\u0001\u001A\u0004\u0018\u00010\u00168F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\b\u001A\u0006\b\u008C\u0001\u0010\u008D\u0001R\u0018\u0010\u0092\u0001\u001A\u00030\u008F\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u0090\u0001\u0010\u0091\u0001R#\u0010\u0096\u0001\u001A\u000E\u0012\t\u0012\u00070\u0000R\u00030\u0088\u00010\u0093\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0099\u0001\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u009B\u0001\u001A\u00020\f8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u009A\u0001\u0010CR\u0016\u0010\u009D\u0001\u001A\u00020\f8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u009C\u0001\u0010C\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u009E\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "", "layoutChildren", "()V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "calculateAlignmentLines", "()Ljava/util/Map;", "Lkotlin/Function1;", "block", "forEachChildAlignmentLinesOwner", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "requestMeasure", "notifyChildrenUsingLookaheadCoordinatesWhilePlacing", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "alignmentLine", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "forceRequest", "invalidateIntrinsicsParent", "(Z)V", "invalidateParentData", "updateParentData", "()Z", "onNodePlaced$ui_release", "onNodePlaced", "replace", "onNodeDetached", "h", "I", "getPlaceOrder$ui_release", "()I", "setPlaceOrder$ui_release", "(I)V", "placeOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "i", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "j", "Z", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", "k", "getPlacedOnce$ui_release", "setPlacedOnce$ui_release", "placedOnce", "<set-?>", "n", "J", "getLastPosition-nOcc-ac$ui_release", "()J", "lastPosition", "o", "F", "getLastZIndex$ui_release", "()F", "lastZIndex", "p", "Lkotlin/jvm/functions/Function1;", "getLastLayerBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "q", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getLastExplicitLayer$ui_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastExplicitLayer", "r", "isPlaced", "setPlaced", "Landroidx/compose/ui/node/AlignmentLines;", "s", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "u", "getChildDelegatesDirty$ui_release", "setChildDelegatesDirty$ui_release", "childDelegatesDirty", "v", "getLayingOutChildren", "layingOutChildren", "", "x", "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "parentData", "new", "y", "isPlacedUnderMotionFrameOfReference", "setPlacedUnderMotionFrameOfReference", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegates", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1962:1\n1207#1:2001\n1208#1,2:2010\n1207#1:2016\n1208#1,2:2025\n1207#1:2090\n1208#1,2:2099\n1187#2,2:1963\n1857#3:1965\n1858#3,6:1974\n1864#3,5:1984\n205#4:1966\n203#4:1989\n203#4:2002\n203#4:2017\n203#4:2031\n203#4:2043\n203#4:2091\n203#4:2105\n203#4:2117\n476#5,7:1967\n483#5,4:1980\n460#5,11:1990\n460#5,7:2003\n467#5,4:2012\n460#5,7:2018\n467#5,4:2027\n460#5,11:2032\n460#5,11:2044\n460#5,7:2092\n467#5,4:2101\n460#5,11:2106\n460#5,11:2118\n42#6,7:2055\n96#6,7:2062\n42#6,7:2069\n96#6,7:2076\n42#6,7:2083\n42#6,7:2129\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n1270#1:2001\n1270#1:2010,2\n1285#1:2016\n1285#1:2025,2\n1670#1:2090\n1670#1:2099,2\n1183#1:1963,2\n1196#1:1965\n1196#1:1974,6\n1196#1:1984,5\n1196#1:1966\n1207#1:1989\n1270#1:2002\n1285#1:2017\n1312#1:2031\n1338#1:2043\n1670#1:2091\n1692#1:2105\n1725#1:2117\n1196#1:1967,7\n1196#1:1980,4\n1207#1:1990,11\n1270#1:2003,7\n1270#1:2012,4\n1285#1:2018,7\n1285#1:2027,4\n1312#1:2032,11\n1338#1:2044,11\n1670#1:2092,7\n1670#1:2101,4\n1692#1:2106,11\n1725#1:2118,11\n1377#1:2055,7\n1404#1:2062,7\n1427#1:2069,7\n1481#1:2076,7\n1651#1:2083,7\n1742#1:2129,7\n*E\n"})
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public final class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;
            public static final int[] $EnumSwitchMapping$1;

            static {
                int[] arr_v = new int[LayoutState.values().length];
                try {
                    arr_v[LayoutState.LookaheadMeasuring.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LayoutState.Measuring.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LayoutState.LayingOut.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LayoutState.LookaheadLayingOut.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                WhenMappings.$EnumSwitchMapping$0 = arr_v;
                int[] arr_v1 = new int[UsageByParent.values().length];
                try {
                    arr_v1[UsageByParent.InMeasureBlock.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v1[UsageByParent.InLayoutBlock.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                WhenMappings.$EnumSwitchMapping$1 = arr_v1;
            }
        }

        public final LayoutNodeLayoutDelegate A;
        public boolean f;
        public int g;
        public int h;
        public UsageByParent i;
        public boolean j;
        public boolean k;
        public boolean l;
        public Constraints m;
        public long n;
        public float o;
        public Function1 p;
        public GraphicsLayer q;
        public boolean r;
        public final LookaheadAlignmentLines s;
        public final MutableVector t;
        public boolean u;
        public boolean v;
        public boolean w;
        public Object x;
        public boolean y;
        public boolean z;

        public LookaheadPassDelegate() {
            this.g = 0x7FFFFFFF;
            this.h = 0x7FFFFFFF;
            this.i = UsageByParent.NotUsed;
            this.n = 0L;
            this.s = new LookaheadAlignmentLines(this);
            this.t = new MutableVector(new LookaheadPassDelegate[16], 0);
            this.u = true;
            this.w = true;
            this.x = this.getMeasurePassDelegate$ui_release().getParentData();
        }

        public static final void access$checkChildrenPlaceOrderForUpdates(LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0) {
            MutableVector mutableVector0 = LayoutNodeLayoutDelegate.this.a.get_children$ui_release();
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate1 = ((LayoutNode)arr_object[v1]).getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate1);
                    if(layoutNodeLayoutDelegate$LookaheadPassDelegate1.g != layoutNodeLayoutDelegate$LookaheadPassDelegate1.h && layoutNodeLayoutDelegate$LookaheadPassDelegate1.h == 0x7FFFFFFF) {
                        layoutNodeLayoutDelegate$LookaheadPassDelegate1.d();
                    }
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        public static final void access$clearPlaceOrder(LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0) {
            int v = 0;
            LayoutNodeLayoutDelegate.this.j = 0;
            MutableVector mutableVector0 = LayoutNodeLayoutDelegate.this.a.get_children$ui_release();
            int v1 = mutableVector0.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector0.getContent();
                while(true) {
                    LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate1 = ((LayoutNode)arr_object[v]).getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate1);
                    layoutNodeLayoutDelegate$LookaheadPassDelegate1.g = layoutNodeLayoutDelegate$LookaheadPassDelegate1.h;
                    layoutNodeLayoutDelegate$LookaheadPassDelegate1.h = 0x7FFFFFFF;
                    if(layoutNodeLayoutDelegate$LookaheadPassDelegate1.i == UsageByParent.InLayoutBlock) {
                        layoutNodeLayoutDelegate$LookaheadPassDelegate1.i = UsageByParent.NotUsed;
                    }
                    ++v;
                    if(v >= v1) {
                        break;
                    }
                }
            }
        }

        public final void c() {
            this.setPlaced(true);
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(!this.isPlaced() && layoutNodeLayoutDelegate0.getLookaheadMeasurePending$ui_release()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate0.a, true, false, false, 6, null);
            }
            MutableVector mutableVector0 = layoutNodeLayoutDelegate0.a.get_children$ui_release();
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                    if(layoutNode0.getPlaceOrder$ui_release() != 0x7FFFFFFF) {
                        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNode0.getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                        layoutNodeLayoutDelegate$LookaheadPassDelegate0.c();
                        layoutNode0.rescheduleRemeasureOrRelayout$ui_release(layoutNode0);
                    }
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public Map calculateAlignmentLines() {
            if(!this.j) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
                if(layoutNodeLayoutDelegate0.getLayoutState$ui_release() == LayoutState.LookaheadMeasuring) {
                    this.getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if(this.getAlignmentLines().getDirty$ui_release()) {
                        layoutNodeLayoutDelegate0.markLookaheadLayoutPending$ui_release();
                    }
                }
                else {
                    this.getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            LookaheadDelegate lookaheadDelegate0 = this.getInnerCoordinator().getLookaheadDelegate();
            if(lookaheadDelegate0 != null) {
                lookaheadDelegate0.setPlacingForAlignment$ui_release(true);
            }
            this.layoutChildren();
            LookaheadDelegate lookaheadDelegate1 = this.getInnerCoordinator().getLookaheadDelegate();
            if(lookaheadDelegate1 != null) {
                lookaheadDelegate1.setPlacingForAlignment$ui_release(false);
            }
            return this.getAlignmentLines().getLastCalculation();
        }

        public final void d() {
            if(this.isPlaced()) {
                int v = 0;
                this.setPlaced(false);
                MutableVector mutableVector0 = LayoutNodeLayoutDelegate.this.a.get_children$ui_release();
                int v1 = mutableVector0.getSize();
                if(v1 > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    while(true) {
                        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = ((LayoutNode)arr_object[v]).getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                        layoutNodeLayoutDelegate$LookaheadPassDelegate0.d();
                        ++v;
                        if(v >= v1) {
                            break;
                        }
                    }
                }
            }
        }

        public final void e() {
            UsageByParent layoutNode$UsageByParent0;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate0.a, false, false, false, 7, null);
            LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
            if(layoutNode0 != null && layoutNodeLayoutDelegate0.a.getIntrinsicsUsageByParent$ui_release() == UsageByParent.NotUsed) {
                LayoutNode layoutNode1 = layoutNodeLayoutDelegate0.a;
                switch(WhenMappings.$EnumSwitchMapping$0[layoutNode0.getLayoutState$ui_release().ordinal()]) {
                    case 2: {
                        layoutNode$UsageByParent0 = UsageByParent.InMeasureBlock;
                        break;
                    }
                    case 3: {
                        layoutNode$UsageByParent0 = UsageByParent.InLayoutBlock;
                        break;
                    }
                    default: {
                        layoutNode$UsageByParent0 = layoutNode0.getIntrinsicsUsageByParent$ui_release();
                    }
                }
                layoutNode1.setIntrinsicsUsageByParent$ui_release(layoutNode$UsageByParent0);
            }
        }

        public final void f(long v, float f, Function1 function10, GraphicsLayer graphicsLayer0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(layoutNodeLayoutDelegate0.a.isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
            }
            layoutNodeLayoutDelegate0.c = LayoutState.LookaheadLayingOut;
            this.k = true;
            this.z = false;
            if(!IntOffset.equals-impl0(v, this.n)) {
                if(layoutNodeLayoutDelegate0.getLookaheadCoordinatesAccessedDuringModifierPlacement() || layoutNodeLayoutDelegate0.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    layoutNodeLayoutDelegate0.h = true;
                }
                this.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            Owner owner0 = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate0.a);
            if(layoutNodeLayoutDelegate0.getLookaheadLayoutPending$ui_release() || !this.isPlaced()) {
                layoutNodeLayoutDelegate0.setLookaheadCoordinatesAccessedDuringModifierPlacement(false);
                this.getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(owner0.getSnapshotObserver(), layoutNodeLayoutDelegate0.a, false, new q(layoutNodeLayoutDelegate0, owner0, v), 2, null);
            }
            else {
                LookaheadDelegate lookaheadDelegate0 = layoutNodeLayoutDelegate0.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate0);
                lookaheadDelegate0.placeSelfApparentToRealOffset--gyyYBs$ui_release(v);
                this.onNodePlaced$ui_release();
            }
            this.n = v;
            this.o = f;
            this.p = function10;
            this.q = graphicsLayer0;
            layoutNodeLayoutDelegate0.c = LayoutState.Idle;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(@NotNull Function1 function10) {
            MutableVector mutableVector0 = LayoutNodeLayoutDelegate.this.a.get_children$ui_release();
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    AlignmentLinesOwner alignmentLinesOwner0 = ((LayoutNode)arr_object[v1]).getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
                    Intrinsics.checkNotNull(alignmentLinesOwner0);
                    function10.invoke(alignmentLinesOwner0);
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        @Override  // androidx.compose.ui.layout.Measured
        public int get(@NotNull AlignmentLine alignmentLine0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
            LayoutState layoutNode$LayoutState0 = null;
            if((layoutNode0 == null ? null : layoutNode0.getLayoutState$ui_release()) == LayoutState.LookaheadMeasuring) {
                this.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            else {
                LayoutNode layoutNode1 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
                if(layoutNode1 != null) {
                    layoutNode$LayoutState0 = layoutNode1.getLayoutState$ui_release();
                }
                if(layoutNode$LayoutState0 == LayoutState.LookaheadLayingOut) {
                    this.getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.j = true;
            LookaheadDelegate lookaheadDelegate0 = layoutNodeLayoutDelegate0.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            int v = lookaheadDelegate0.get(alignmentLine0);
            this.j = false;
            return v;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public AlignmentLines getAlignmentLines() {
            return this.s;
        }

        @NotNull
        public final List getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            layoutNodeLayoutDelegate0.a.getChildren$ui_release();
            MutableVector mutableVector0 = this.t;
            if(!this.u) {
                return mutableVector0.asMutableList();
            }
            LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a;
            MutableVector mutableVector1 = layoutNode0.get_children$ui_release();
            int v = mutableVector1.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector1.getContent();
                int v1 = 0;
                while(true) {
                    LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                    if(mutableVector0.getSize() <= v1) {
                        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNode1.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                        mutableVector0.add(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                    }
                    else {
                        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate1 = layoutNode1.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate1);
                        mutableVector0.set(v1, layoutNodeLayoutDelegate$LookaheadPassDelegate1);
                    }
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
            mutableVector0.removeRange(layoutNode0.getChildren$ui_release().size(), mutableVector0.getSize());
            this.u = false;
            return mutableVector0.asMutableList();
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.u;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.j;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.a.getInnerCoordinator$ui_release();
        }

        @Nullable
        public final Constraints getLastConstraints-DWUhwKw() {
            return this.m;
        }

        @Nullable
        public final GraphicsLayer getLastExplicitLayer$ui_release() {
            return this.q;
        }

        @Nullable
        public final Function1 getLastLayerBlock$ui_release() {
            return this.p;
        }

        public final long getLastPosition-nOcc-ac$ui_release() {
            return this.n;
        }

        public final float getLastZIndex$ui_release() {
            return this.o;
        }

        public final boolean getLayingOutChildren() {
            return this.v;
        }

        @NotNull
        public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
            return LayoutNodeLayoutDelegate.this.getMeasurePassDelegate$ui_release();
        }

        @NotNull
        public final UsageByParent getMeasuredByParent$ui_release() {
            return this.i;
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate0 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            return lookaheadDelegate0.getMeasuredHeight();
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate0 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            return lookaheadDelegate0.getMeasuredWidth();
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @Nullable
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.getParent$ui_release();
            if(layoutNode0 != null) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0.getLayoutDelegate$ui_release();
                return layoutNodeLayoutDelegate0 == null ? null : layoutNodeLayoutDelegate0.getLookaheadAlignmentLinesOwner$ui_release();
            }
            return null;
        }

        @Override  // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        @Nullable
        public Object getParentData() {
            return this.x;
        }

        public final int getPlaceOrder$ui_release() {
            return this.h;
        }

        public final boolean getPlacedOnce$ui_release() {
            return this.k;
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            LayoutNode layoutNode1;
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.getParent$ui_release();
            UsageByParent layoutNode$UsageByParent0 = LayoutNodeLayoutDelegate.this.a.getIntrinsicsUsageByParent$ui_release();
            if(layoutNode0 != null && layoutNode$UsageByParent0 != UsageByParent.NotUsed) {
                do {
                    layoutNode1 = layoutNode0;
                    if(layoutNode1.getIntrinsicsUsageByParent$ui_release() != layoutNode$UsageByParent0) {
                        break;
                    }
                    layoutNode0 = layoutNode1.getParent$ui_release();
                }
                while(layoutNode0 != null);
                switch(WhenMappings.$EnumSwitchMapping$1[layoutNode$UsageByParent0.ordinal()]) {
                    case 1: {
                        if(layoutNode1.getLookaheadRoot$ui_release() != null) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode1, z, false, false, 6, null);
                            return;
                        }
                        LayoutNode.requestRemeasure$ui_release$default(layoutNode1, z, false, false, 6, null);
                        break;
                    }
                    case 2: {
                        if(layoutNode1.getLookaheadRoot$ui_release() != null) {
                            layoutNode1.requestLookaheadRelayout$ui_release(z);
                            return;
                        }
                        layoutNode1.requestRelayout$ui_release(z);
                        return;
                    }
                    default: {
                        throw new IllegalStateException("Intrinsics isn\'t used by the parent");
                    }
                }
            }
        }

        public final void invalidateParentData() {
            this.w = true;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.r;
        }

        @Override  // androidx.compose.ui.node.MotionReferencePlacementDelegate
        public boolean isPlacedUnderMotionFrameOfReference() {
            return this.y;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.v = true;
            this.getAlignmentLines().recalculateQueryOwner();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(layoutNodeLayoutDelegate0.getLookaheadLayoutPending$ui_release()) {
                MutableVector mutableVector0 = layoutNodeLayoutDelegate0.a.get_children$ui_release();
                int v = mutableVector0.getSize();
                if(v > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    int v1 = 0;
                    while(true) {
                        LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                        if(layoutNode0.getLookaheadMeasurePending$ui_release() && layoutNode0.getMeasuredByParentInLookahead$ui_release() == UsageByParent.InMeasureBlock) {
                            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNode0.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                            Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                            Constraints constraints0 = layoutNode0.getLayoutDelegate$ui_release().getLastLookaheadConstraints-DWUhwKw();
                            Intrinsics.checkNotNull(constraints0);
                            if(layoutNodeLayoutDelegate$LookaheadPassDelegate0.remeasure-BRTryo0(constraints0.unbox-impl())) {
                                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate0.a, false, false, false, 7, null);
                            }
                        }
                        ++v1;
                        if(v1 >= v) {
                            break;
                        }
                    }
                }
            }
            LookaheadDelegate lookaheadDelegate0 = this.getInnerCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            if(layoutNodeLayoutDelegate0.i || !this.j && !lookaheadDelegate0.isPlacingForAlignment$ui_release() && layoutNodeLayoutDelegate0.getLookaheadLayoutPending$ui_release()) {
                layoutNodeLayoutDelegate0.h = false;
                layoutNodeLayoutDelegate0.c = LayoutState.LookaheadLayingOut;
                Owner owner0 = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate0.a);
                layoutNodeLayoutDelegate0.setLookaheadCoordinatesAccessedDuringPlacement(false);
                OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(owner0.getSnapshotObserver(), layoutNodeLayoutDelegate0.a, false, new p(this, lookaheadDelegate0, layoutNodeLayoutDelegate0), 2, null);
                layoutNodeLayoutDelegate0.c = layoutNodeLayoutDelegate0.getLayoutState$ui_release();
                if(layoutNodeLayoutDelegate0.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate0.isPlacingForAlignment$ui_release()) {
                    this.requestLayout();
                }
                layoutNodeLayoutDelegate0.i = false;
            }
            if(this.getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                this.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if(this.getAlignmentLines().getDirty$ui_release() && this.getAlignmentLines().getRequired$ui_release()) {
                this.getAlignmentLines().recalculate();
            }
            this.v = false;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int v) {
            this.e();
            LookaheadDelegate lookaheadDelegate0 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            return lookaheadDelegate0.maxIntrinsicHeight(v);
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int v) {
            this.e();
            LookaheadDelegate lookaheadDelegate0 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            return lookaheadDelegate0.maxIntrinsicWidth(v);
        }

        @Override  // androidx.compose.ui.layout.Measurable
        @NotNull
        public Placeable measure-BRTryo0(long v) {
            UsageByParent layoutNode$UsageByParent0;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
            LayoutState layoutNode$LayoutState0 = null;
            if((layoutNode0 == null ? null : layoutNode0.getLayoutState$ui_release()) == LayoutState.LookaheadMeasuring) {
                layoutNodeLayoutDelegate0.b = false;
            }
            else {
                LayoutNode layoutNode1 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
                if(layoutNode1 != null) {
                    layoutNode$LayoutState0 = layoutNode1.getLayoutState$ui_release();
                }
                if(layoutNode$LayoutState0 == LayoutState.LookaheadLayingOut) {
                    layoutNodeLayoutDelegate0.b = false;
                }
            }
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate0.a;
            LayoutNode layoutNode3 = layoutNode2.getParent$ui_release();
            if(layoutNode3 == null) {
                this.i = UsageByParent.NotUsed;
            }
            else {
                if(this.i != UsageByParent.NotUsed && !layoutNode2.getCanMultiMeasure$ui_release()) {
                    InlineClassHelperKt.throwIllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
                switch(WhenMappings.$EnumSwitchMapping$0[layoutNode3.getLayoutState$ui_release().ordinal()]) {
                    case 1: 
                    case 2: {
                        layoutNode$UsageByParent0 = UsageByParent.InMeasureBlock;
                        break;
                    }
                    case 3: 
                    case 4: {
                        layoutNode$UsageByParent0 = UsageByParent.InLayoutBlock;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Measurable could be only measured from the parent\'s measure or layout block. Parents state is " + layoutNode3.getLayoutState$ui_release());
                    }
                }
                this.i = layoutNode$UsageByParent0;
            }
            if(layoutNodeLayoutDelegate0.a.getIntrinsicsUsageByParent$ui_release() == UsageByParent.NotUsed) {
                layoutNodeLayoutDelegate0.a.clearSubtreeIntrinsicsUsage$ui_release();
            }
            this.remeasure-BRTryo0(v);
            return this;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int v) {
            this.e();
            LookaheadDelegate lookaheadDelegate0 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            return lookaheadDelegate0.minIntrinsicHeight(v);
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int v) {
            this.e();
            LookaheadDelegate lookaheadDelegate0 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            return lookaheadDelegate0.minIntrinsicWidth(v);
        }

        public final void notifyChildrenUsingLookaheadCoordinatesWhilePlacing() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(layoutNodeLayoutDelegate0.getChildrenAccessingLookaheadCoordinatesDuringPlacement() > 0) {
                MutableVector mutableVector0 = layoutNodeLayoutDelegate0.a.get_children$ui_release();
                int v = mutableVector0.getSize();
                if(v > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    int v1 = 0;
                    while(true) {
                        LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate1 = layoutNode0.getLayoutDelegate$ui_release();
                        if((layoutNodeLayoutDelegate1.getLookaheadCoordinatesAccessedDuringPlacement() || layoutNodeLayoutDelegate1.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutNodeLayoutDelegate1.getLookaheadLayoutPending$ui_release()) {
                            LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode0, false, 1, null);
                        }
                        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNodeLayoutDelegate1.getLookaheadPassDelegate$ui_release();
                        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
                            layoutNodeLayoutDelegate$LookaheadPassDelegate0.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
                        }
                        ++v1;
                        if(v1 >= v) {
                            break;
                        }
                    }
                }
            }
        }

        public final void onNodeDetached() {
            this.h = 0x7FFFFFFF;
            this.g = 0x7FFFFFFF;
            this.setPlaced(false);
        }

        public final void onNodePlaced$ui_release() {
            this.z = true;
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.getParent$ui_release();
            if(!this.isPlaced()) {
                this.c();
                if(this.f && layoutNode0 != null) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode0, false, 1, null);
                }
            }
            if(layoutNode0 == null) {
                this.h = 0;
            }
            else if(!this.f && (layoutNode0.getLayoutState$ui_release() == LayoutState.LayingOut || layoutNode0.getLayoutState$ui_release() == LayoutState.LookaheadLayingOut)) {
                if(this.h != 0x7FFFFFFF) {
                    InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
                }
                this.h = layoutNode0.getLayoutDelegate$ui_release().j;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0.getLayoutDelegate$ui_release();
                ++layoutNodeLayoutDelegate0.j;
            }
            this.layoutChildren();
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public void placeAt-f8xVGno(long v, float f, @NotNull GraphicsLayer graphicsLayer0) {
            this.f(v, f, null, graphicsLayer0);
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public void placeAt-f8xVGno(long v, float f, @Nullable Function1 function10) {
            this.f(v, f, function10, null);
        }

        public final boolean remeasure-BRTryo0(long v) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(layoutNodeLayoutDelegate0.a.isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
            layoutNodeLayoutDelegate0.a.setCanMultiMeasure$ui_release(layoutNodeLayoutDelegate0.a.getCanMultiMeasure$ui_release() || layoutNode0 != null && layoutNode0.getCanMultiMeasure$ui_release());
            if(!layoutNodeLayoutDelegate0.a.getLookaheadMeasurePending$ui_release() && (this.m == null ? false : Constraints.equals-impl0(this.m.unbox-impl(), v))) {
                Owner owner0 = layoutNodeLayoutDelegate0.a.getOwner$ui_release();
                if(owner0 != null) {
                    owner0.forceMeasureTheSubtree(layoutNodeLayoutDelegate0.a, true);
                }
                layoutNodeLayoutDelegate0.a.resetSubtreeIntrinsicsUsage$ui_release();
                return false;
            }
            this.m = Constraints.box-impl(v);
            this.setMeasurementConstraints-BRTryo0(v);
            this.getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            this.forEachChildAlignmentLinesOwner(r.w);
            long v1 = this.l ? this.getMeasuredSize-YbymL2g() : 0x8000000080000000L;
            this.l = true;
            LookaheadDelegate lookaheadDelegate0 = layoutNodeLayoutDelegate0.getOuterCoordinator().getLookaheadDelegate();
            if(lookaheadDelegate0 == null) {
                InlineClassHelperKt.throwIllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
            }
            LayoutNodeLayoutDelegate.access$performLookaheadMeasure-BRTryo0(layoutNodeLayoutDelegate0, v);
            this.setMeasuredSize-ozmzZPI(IntSizeKt.IntSize(lookaheadDelegate0.getWidth(), lookaheadDelegate0.getHeight()));
            return IntSize.getWidth-impl(v1) != lookaheadDelegate0.getWidth() || IntSize.getHeight-impl(v1) != lookaheadDelegate0.getHeight();
        }

        public final void replace() {
            try {
                this.f = true;
                if(!this.k) {
                    InlineClassHelperKt.throwIllegalStateException("replace() called on item that was not placed");
                }
                this.z = false;
                this.f(this.n, 0.0f, this.p, this.q);
                if(this.isPlaced() && !this.z) {
                    LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.getParent$ui_release();
                    if(layoutNode0 != null) {
                        LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode0, false, 1, null);
                    }
                }
            }
            finally {
                this.f = false;
            }
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestLookaheadRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.a, false, 1, null);
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.a, false, false, false, 7, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.u = z;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.j = z;
        }

        public final void setMeasuredByParent$ui_release(@NotNull UsageByParent layoutNode$UsageByParent0) {
            this.i = layoutNode$UsageByParent0;
        }

        public final void setPlaceOrder$ui_release(int v) {
            this.h = v;
        }

        public void setPlaced(boolean z) {
            this.r = z;
        }

        public final void setPlacedOnce$ui_release(boolean z) {
            this.k = z;
        }

        @Override  // androidx.compose.ui.node.MotionReferencePlacementDelegate
        public void setPlacedUnderMotionFrameOfReference(boolean z) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            LookaheadDelegate lookaheadDelegate0 = layoutNodeLayoutDelegate0.getOuterCoordinator().getLookaheadDelegate();
            if(!Intrinsics.areEqual(Boolean.valueOf(z), (lookaheadDelegate0 == null ? null : Boolean.valueOf(lookaheadDelegate0.isPlacedUnderMotionFrameOfReference())))) {
                LookaheadDelegate lookaheadDelegate1 = layoutNodeLayoutDelegate0.getOuterCoordinator().getLookaheadDelegate();
                if(lookaheadDelegate1 != null) {
                    lookaheadDelegate1.setPlacedUnderMotionFrameOfReference(z);
                }
            }
            this.y = z;
        }

        public final boolean updateParentData() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(this.getParentData() == null) {
                LookaheadDelegate lookaheadDelegate0 = layoutNodeLayoutDelegate0.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate0);
                if(lookaheadDelegate0.getParentData() == null) {
                    return false;
                }
            }
            if(!this.w) {
                return false;
            }
            this.w = false;
            LookaheadDelegate lookaheadDelegate1 = layoutNodeLayoutDelegate0.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate1);
            this.x = lookaheadDelegate1.getParentData();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\n\u001A\u00020\u0007H\u0000\u00A2\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u000B\u0010\tJ\u000F\u0010\r\u001A\u00020\u0007H\u0000\u00A2\u0006\u0004\b\f\u0010\tJ\u001A\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u000EH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u000F\u001A\u00020\u000E\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0018\u001A\u00020\u0017H\u0096\u0002\u00A2\u0006\u0004\b\u001A\u0010\u001BJ=\u0010&\u001A\u00020\u00072\u0006\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001F\u001A\u00020\u001E2\u0019\u0010#\u001A\u0015\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0007\u0018\u00010 \u00A2\u0006\u0002\b\"H\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%J*\u0010&\u001A\u00020\u00072\u0006\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010(\u001A\u00020\'H\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010)J\r\u0010*\u001A\u00020\u0007\u00A2\u0006\u0004\b*\u0010\tJ\u0017\u0010,\u001A\u00020\u00192\u0006\u0010+\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b,\u0010-J\u0017\u0010.\u001A\u00020\u00192\u0006\u0010+\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b.\u0010-J\u0017\u00100\u001A\u00020\u00192\u0006\u0010/\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b0\u0010-J\u0017\u00101\u001A\u00020\u00192\u0006\u0010/\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b1\u0010-J\r\u00102\u001A\u00020\u0007\u00A2\u0006\u0004\b2\u0010\tJ\r\u00103\u001A\u00020\u0013\u00A2\u0006\u0004\b3\u00104J\u001B\u00106\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001905H\u0016\u00A2\u0006\u0004\b6\u00107J#\u00109\u001A\u00020\u00072\u0012\u00108\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070 H\u0016\u00A2\u0006\u0004\b9\u0010:J\u000F\u0010;\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b;\u0010\tJ\u000F\u0010<\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b<\u0010\tJ\r\u0010=\u001A\u00020\u0007\u00A2\u0006\u0004\b=\u0010\tJ\u0015\u0010?\u001A\u00020\u00072\u0006\u0010>\u001A\u00020\u0013\u00A2\u0006\u0004\b?\u0010@J\r\u0010A\u001A\u00020\u0007\u00A2\u0006\u0004\bA\u0010\tJ\r\u0010B\u001A\u00020\u0007\u00A2\u0006\u0004\bB\u0010\tJ\r\u0010C\u001A\u00020\u0007\u00A2\u0006\u0004\bC\u0010\tR$\u0010I\u001A\u00020\u00192\u0006\u0010D\u001A\u00020\u00198\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010HR$\u0010L\u001A\u00020\u00192\u0006\u0010D\u001A\u00020\u00198\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bJ\u0010F\u001A\u0004\bK\u0010HR\"\u0010T\u001A\u00020M8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bN\u0010O\u001A\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010Y\u001A\u00020\u00138\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bU\u0010V\u001A\u0004\bW\u00104\"\u0004\bX\u0010@R(\u0010_\u001A\u0004\u0018\u00010Z2\b\u0010D\u001A\u0004\u0018\u00010Z8\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^R*\u0010a\u001A\u00020\u00132\u0006\u0010D\u001A\u00020\u00138\u0016@PX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b`\u0010V\u001A\u0004\ba\u00104\"\u0004\bb\u0010@R*\u0010d\u001A\u00020\u00132\u0006\u0010D\u001A\u00020\u00138\u0006@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bc\u0010V\u001A\u0004\bd\u00104\"\u0004\be\u0010@R\u001A\u0010k\u001A\u00020f8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bg\u0010h\u001A\u0004\bi\u0010jR\"\u0010o\u001A\u00020\u00138\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bl\u0010V\u001A\u0004\bm\u00104\"\u0004\bn\u0010@R$\u0010r\u001A\u00020\u00132\u0006\u0010D\u001A\u00020\u00138\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bp\u0010V\u001A\u0004\bq\u00104R$\u0010\u001F\u001A\u00020\u001E2\u0006\u0010D\u001A\u00020\u001E8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bs\u0010t\u001A\u0004\bu\u0010vR*\u0010y\u001A\u00020\u00132\u0006\u0010w\u001A\u00020\u00138\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bx\u0010V\u001A\u0004\by\u00104\"\u0004\bz\u0010@R\u0019\u0010}\u001A\u0004\u0018\u00010\u000E8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001A\u00020~8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u007F\u0010\u0080\u0001R#\u0010\u0086\u0001\u001A\u000E\u0012\t\u0012\u00070\u0000R\u00030\u0083\u00010\u0082\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0088\u0001\u001A\u00020\u00198VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0087\u0001\u0010HR\u0016\u0010\u008A\u0001\u001A\u00020\u00198VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0089\u0001\u0010HR\u0019\u0010\u008D\u0001\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u008B\u0001\u0010\u008C\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u008E\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "", "markDetachedFromParentLookaheadPass$ui_release", "()V", "markDetachedFromParentLookaheadPass", "layoutChildren", "onNodePlaced$ui_release", "onNodePlaced", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "replace", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "invalidateParentData", "updateParentData", "()Z", "", "calculateAlignmentLines", "()Ljava/util/Map;", "block", "forEachChildAlignmentLinesOwner", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "requestMeasure", "notifyChildrenUsingCoordinatesWhilePlacing", "forceRequest", "invalidateIntrinsicsParent", "(Z)V", "onNodeDetached", "measureBasedOnLookahead", "placeBasedOnLookahead", "<set-?>", "g", "I", "getPreviousPlaceOrder$ui_release", "()I", "previousPlaceOrder", "h", "getPlaceOrder$ui_release", "placeOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "k", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "l", "Z", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", "", "r", "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "parentData", "s", "isPlaced", "setPlaced$ui_release", "t", "isPlacedByParent", "setPlacedByParent$ui_release", "Landroidx/compose/ui/node/AlignmentLines;", "u", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "w", "getChildDelegatesDirty$ui_release", "setChildDelegatesDirty$ui_release", "childDelegatesDirty", "x", "getLayingOutChildren", "layingOutChildren", "z", "F", "getZIndex$ui_release", "()F", "new", "H", "isPlacedUnderMotionFrameOfReference", "setPlacedUnderMotionFrameOfReference", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegates", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1962:1\n647#1:2008\n648#1,2:2017\n650#1:2023\n647#1:2057\n648#1,2:2066\n650#1:2072\n1187#2,2:1963\n1857#3:1965\n1858#3,6:1974\n1864#3,5:1984\n205#4:1966\n203#4:1989\n1323#4,7:2001\n203#4:2009\n1323#4,7:2024\n203#4:2031\n1311#4,7:2043\n203#4:2058\n203#4:2073\n203#4:2120\n203#4:2132\n203#4:2144\n476#5,7:1967\n483#5,4:1980\n460#5,11:1990\n460#5,7:2010\n467#5,4:2019\n460#5,11:2032\n460#5,7:2059\n467#5,4:2068\n460#5,11:2074\n460#5,11:2121\n460#5,11:2133\n460#5,11:2145\n42#6,7:2050\n96#6,7:2085\n42#6,7:2092\n42#6,7:2099\n96#6,7:2106\n42#6,7:2113\n66#6,9:2156\n66#6,9:2165\n66#6,9:2174\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n505#1:2008\n505#1:2017,2\n505#1:2023\n633#1:2057\n633#1:2066,2\n633#1:2072\n400#1:1963,2\n410#1:1965\n410#1:1974,6\n410#1:1984,5\n410#1:1966\n483#1:1989\n501#1:2001,7\n505#1:2009\n524#1:2024,7\n529#1:2031\n587#1:2043,7\n633#1:2058\n647#1:2073\n980#1:2120\n1006#1:2132\n1042#1:2144\n410#1:1967,7\n410#1:1980,4\n483#1:1990,11\n505#1:2010,7\n505#1:2019,4\n529#1:2032,11\n633#1:2059,7\n633#1:2068,4\n647#1:2074,11\n980#1:2121,11\n1006#1:2133,11\n1042#1:2145,11\n613#1:2050,7\n680#1:2085,7\n719#1:2092,7\n834#1:2099,7\n848#1:2106,7\n887#1:2113,7\n1093#1:2156,9\n1096#1:2165,9\n1114#1:2174,9\n*E\n"})
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings {
            public static final int[] $EnumSwitchMapping$0;
            public static final int[] $EnumSwitchMapping$1;

            static {
                int[] arr_v = new int[LayoutState.values().length];
                try {
                    arr_v[LayoutState.Measuring.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LayoutState.LayingOut.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$0 = arr_v;
                int[] arr_v1 = new int[UsageByParent.values().length];
                try {
                    arr_v1[UsageByParent.InMeasureBlock.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v1[UsageByParent.InLayoutBlock.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$1 = arr_v1;
            }
        }

        public boolean A;
        public Function1 B;
        public GraphicsLayer C;
        public long D;
        public float E;
        public final v F;
        public boolean G;
        public boolean H;
        public final LayoutNodeLayoutDelegate I;
        public boolean f;
        public int g;
        public int h;
        public boolean i;
        public boolean j;
        public UsageByParent k;
        public boolean l;
        public long m;
        public Function1 n;
        public GraphicsLayer o;
        public float p;
        public boolean q;
        public Object r;
        public boolean s;
        public boolean t;
        public final LayoutNodeAlignmentLines u;
        public final MutableVector v;
        public boolean w;
        public boolean x;
        public final u y;
        public float z;

        public MeasurePassDelegate() {
            this.g = 0x7FFFFFFF;
            this.h = 0x7FFFFFFF;
            this.k = UsageByParent.NotUsed;
            this.m = 0L;
            this.q = true;
            this.u = new LayoutNodeAlignmentLines(this);
            this.v = new MutableVector(new MeasurePassDelegate[16], 0);
            this.w = true;
            this.y = new u(this);
            this.D = 0L;
            this.F = new v(layoutNodeLayoutDelegate0, this);
        }

        public static final void access$checkChildrenPlaceOrderForUpdates(MeasurePassDelegate layoutNodeLayoutDelegate$MeasurePassDelegate0) {
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a;
            MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                    if(layoutNode1.getMeasurePassDelegate$ui_release().g != layoutNode1.getPlaceOrder$ui_release()) {
                        layoutNode0.onZSortedChildrenInvalidated$ui_release();
                        layoutNode0.invalidateLayer$ui_release();
                        if(layoutNode1.getPlaceOrder$ui_release() == 0x7FFFFFFF) {
                            layoutNode1.getMeasurePassDelegate$ui_release().d();
                        }
                    }
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        public static final void access$clearPlaceOrder(MeasurePassDelegate layoutNodeLayoutDelegate$MeasurePassDelegate0) {
            LayoutNodeLayoutDelegate.this.k = 0;
            MutableVector mutableVector0 = LayoutNodeLayoutDelegate.this.a.get_children$ui_release();
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    MeasurePassDelegate layoutNodeLayoutDelegate$MeasurePassDelegate1 = ((LayoutNode)arr_object[v1]).getMeasurePassDelegate$ui_release();
                    layoutNodeLayoutDelegate$MeasurePassDelegate1.g = layoutNodeLayoutDelegate$MeasurePassDelegate1.h;
                    layoutNodeLayoutDelegate$MeasurePassDelegate1.h = 0x7FFFFFFF;
                    layoutNodeLayoutDelegate$MeasurePassDelegate1.t = false;
                    if(layoutNodeLayoutDelegate$MeasurePassDelegate1.k == UsageByParent.InLayoutBlock) {
                        layoutNodeLayoutDelegate$MeasurePassDelegate1.k = UsageByParent.NotUsed;
                    }
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        public final void c() {
            this.setPlaced$ui_release(true);
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a;
            if(!this.isPlaced()) {
                if(layoutNode0.getMeasurePending$ui_release()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode0, true, false, false, 6, null);
                }
                else if(layoutNode0.getLookaheadMeasurePending$ui_release()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode0, true, false, false, 6, null);
                }
            }
            NodeCoordinator nodeCoordinator0 = layoutNode0.getOuterCoordinator$ui_release();
            NodeCoordinator nodeCoordinator1 = layoutNode0.getInnerCoordinator$ui_release().getWrapped$ui_release();
            while(!Intrinsics.areEqual(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
                if(nodeCoordinator0.getLastLayerDrawingWasSkipped$ui_release()) {
                    nodeCoordinator0.invalidateLayer();
                }
                nodeCoordinator0 = nodeCoordinator0.getWrapped$ui_release();
            }
            MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                    if(layoutNode1.getPlaceOrder$ui_release() != 0x7FFFFFFF) {
                        layoutNode1.getMeasurePassDelegate$ui_release().c();
                        layoutNode0.rescheduleRemeasureOrRelayout$ui_release(layoutNode1);
                    }
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public Map calculateAlignmentLines() {
            if(!this.l) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
                if(layoutNodeLayoutDelegate0.getLayoutState$ui_release() == LayoutState.Measuring) {
                    this.getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if(this.getAlignmentLines().getDirty$ui_release()) {
                        layoutNodeLayoutDelegate0.markLayoutPending$ui_release();
                    }
                }
                else {
                    this.getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            this.getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            this.layoutChildren();
            this.getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return this.getAlignmentLines().getLastCalculation();
        }

        public final void d() {
            if(this.isPlaced()) {
                int v = 0;
                this.setPlaced$ui_release(false);
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
                LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a;
                NodeCoordinator nodeCoordinator0 = layoutNode0.getOuterCoordinator$ui_release();
                NodeCoordinator nodeCoordinator1 = layoutNode0.getInnerCoordinator$ui_release().getWrapped$ui_release();
                while(!Intrinsics.areEqual(nodeCoordinator0, nodeCoordinator1) && nodeCoordinator0 != null) {
                    nodeCoordinator0.releaseLayer();
                    nodeCoordinator0 = nodeCoordinator0.getWrapped$ui_release();
                }
                MutableVector mutableVector0 = layoutNodeLayoutDelegate0.a.get_children$ui_release();
                int v1 = mutableVector0.getSize();
                if(v1 > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    while(true) {
                        ((LayoutNode)arr_object[v]).getMeasurePassDelegate$ui_release().d();
                        ++v;
                        if(v >= v1) {
                            break;
                        }
                    }
                }
            }
        }

        public final void e() {
            UsageByParent layoutNode$UsageByParent0;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate0.a, false, false, false, 7, null);
            LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
            if(layoutNode0 != null && layoutNodeLayoutDelegate0.a.getIntrinsicsUsageByParent$ui_release() == UsageByParent.NotUsed) {
                LayoutNode layoutNode1 = layoutNodeLayoutDelegate0.a;
                switch(androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$0[layoutNode0.getLayoutState$ui_release().ordinal()]) {
                    case 1: {
                        layoutNode$UsageByParent0 = UsageByParent.InMeasureBlock;
                        break;
                    }
                    case 2: {
                        layoutNode$UsageByParent0 = UsageByParent.InLayoutBlock;
                        break;
                    }
                    default: {
                        layoutNode$UsageByParent0 = layoutNode0.getIntrinsicsUsageByParent$ui_release();
                    }
                }
                layoutNode1.setIntrinsicsUsageByParent$ui_release(layoutNode$UsageByParent0);
            }
        }

        public final void f(long v, float f, Function1 function10, GraphicsLayer graphicsLayer0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(layoutNodeLayoutDelegate0.a.isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
            }
            layoutNodeLayoutDelegate0.c = LayoutState.LayingOut;
            this.m = v;
            this.p = f;
            this.n = function10;
            this.o = graphicsLayer0;
            this.j = true;
            this.A = false;
            Owner owner0 = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate0.a);
            if(layoutNodeLayoutDelegate0.getLayoutPending$ui_release() || !this.isPlaced()) {
                this.getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                layoutNodeLayoutDelegate0.setCoordinatesAccessedDuringModifierPlacement(false);
                this.B = function10;
                this.D = v;
                this.E = f;
                this.C = graphicsLayer0;
                owner0.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(layoutNodeLayoutDelegate0.a, false, this.F);
            }
            else {
                layoutNodeLayoutDelegate0.getOuterCoordinator().placeSelfApparentToRealOffset-MLgxB_4(v, f, function10, graphicsLayer0);
                this.onNodePlaced$ui_release();
            }
            layoutNodeLayoutDelegate0.c = LayoutState.Idle;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(@NotNull Function1 function10) {
            MutableVector mutableVector0 = LayoutNodeLayoutDelegate.this.a.get_children$ui_release();
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    function10.invoke(((LayoutNode)arr_object[v1]).getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        public final void g(long v, float f, Function1 function10, GraphicsLayer graphicsLayer0) {
            PlacementScope placeable$PlacementScope0;
            this.t = true;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(!IntOffset.equals-impl0(v, this.m) || this.G) {
                if(layoutNodeLayoutDelegate0.getCoordinatesAccessedDuringModifierPlacement() || layoutNodeLayoutDelegate0.getCoordinatesAccessedDuringPlacement() || this.G) {
                    layoutNodeLayoutDelegate0.e = true;
                    this.G = false;
                }
                this.notifyChildrenUsingCoordinatesWhilePlacing();
            }
            if(LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate0.a)) {
                NodeCoordinator nodeCoordinator0 = layoutNodeLayoutDelegate0.getOuterCoordinator().getWrappedBy$ui_release();
                if(nodeCoordinator0 == null) {
                    placeable$PlacementScope0 = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate0.a).getPlacementScope();
                }
                else {
                    placeable$PlacementScope0 = nodeCoordinator0.getPlacementScope();
                    if(placeable$PlacementScope0 == null) {
                        placeable$PlacementScope0 = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate0.a).getPlacementScope();
                    }
                }
                LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNodeLayoutDelegate0.getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
                if(layoutNode0 != null) {
                    layoutNode0.getLayoutDelegate$ui_release().j = 0;
                }
                layoutNodeLayoutDelegate$LookaheadPassDelegate0.setPlaceOrder$ui_release(0x7FFFFFFF);
                PlacementScope.place$default(placeable$PlacementScope0, layoutNodeLayoutDelegate$LookaheadPassDelegate0, IntOffset.getX-impl(v), IntOffset.getY-impl(v), 0.0f, 4, null);
            }
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate1 = layoutNodeLayoutDelegate0.getLookaheadPassDelegate$ui_release();
            if(layoutNodeLayoutDelegate$LookaheadPassDelegate1 != null && !layoutNodeLayoutDelegate$LookaheadPassDelegate1.getPlacedOnce$ui_release()) {
                InlineClassHelperKt.throwIllegalStateException("Error: Placement happened before lookahead.");
            }
            this.f(v, f, function10, graphicsLayer0);
        }

        @Override  // androidx.compose.ui.layout.Measured
        public int get(@NotNull AlignmentLine alignmentLine0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
            LayoutState layoutNode$LayoutState0 = null;
            if((layoutNode0 == null ? null : layoutNode0.getLayoutState$ui_release()) == LayoutState.Measuring) {
                this.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            else {
                LayoutNode layoutNode1 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
                if(layoutNode1 != null) {
                    layoutNode$LayoutState0 = layoutNode1.getLayoutState$ui_release();
                }
                if(layoutNode$LayoutState0 == LayoutState.LayingOut) {
                    this.getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.l = true;
            int v = layoutNodeLayoutDelegate0.getOuterCoordinator().get(alignmentLine0);
            this.l = false;
            return v;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public AlignmentLines getAlignmentLines() {
            return this.u;
        }

        @NotNull
        public final List getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            layoutNodeLayoutDelegate0.a.updateChildrenIfDirty$ui_release();
            MutableVector mutableVector0 = this.v;
            if(!this.w) {
                return mutableVector0.asMutableList();
            }
            LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a;
            MutableVector mutableVector1 = layoutNode0.get_children$ui_release();
            int v = mutableVector1.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector1.getContent();
                int v1 = 0;
                while(true) {
                    LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                    if(mutableVector0.getSize() <= v1) {
                        mutableVector0.add(layoutNode1.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                    }
                    else {
                        mutableVector0.set(v1, layoutNode1.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                    }
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
            mutableVector0.removeRange(layoutNode0.getChildren$ui_release().size(), mutableVector0.getSize());
            this.w = false;
            return mutableVector0.asMutableList();
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.w;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.l;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.a.getInnerCoordinator$ui_release();
        }

        // 去混淆评级： 低(20)
        @Nullable
        public final Constraints getLastConstraints-DWUhwKw() {
            return this.i ? Constraints.box-impl(this.getMeasurementConstraints-msEJaDk()) : null;
        }

        public final boolean getLayingOutChildren() {
            return this.x;
        }

        @NotNull
        public final UsageByParent getMeasuredByParent$ui_release() {
            return this.k;
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @Nullable
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.getParent$ui_release();
            if(layoutNode0 != null) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0.getLayoutDelegate$ui_release();
                return layoutNodeLayoutDelegate0 == null ? null : layoutNodeLayoutDelegate0.getAlignmentLinesOwner$ui_release();
            }
            return null;
        }

        @Override  // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        @Nullable
        public Object getParentData() {
            return this.r;
        }

        public final int getPlaceOrder$ui_release() {
            return this.h;
        }

        public final int getPreviousPlaceOrder$ui_release() {
            return this.g;
        }

        public final float getZIndex$ui_release() {
            return this.z;
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            LayoutNode layoutNode1;
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.getParent$ui_release();
            UsageByParent layoutNode$UsageByParent0 = LayoutNodeLayoutDelegate.this.a.getIntrinsicsUsageByParent$ui_release();
            if(layoutNode0 != null && layoutNode$UsageByParent0 != UsageByParent.NotUsed) {
                do {
                    layoutNode1 = layoutNode0;
                    if(layoutNode1.getIntrinsicsUsageByParent$ui_release() != layoutNode$UsageByParent0) {
                        break;
                    }
                    layoutNode0 = layoutNode1.getParent$ui_release();
                }
                while(layoutNode0 != null);
                switch(androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$1[layoutNode$UsageByParent0.ordinal()]) {
                    case 1: {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNode1, z, false, false, 6, null);
                        break;
                    }
                    case 2: {
                        layoutNode1.requestRelayout$ui_release(z);
                        return;
                    }
                    default: {
                        throw new IllegalStateException("Intrinsics isn\'t used by the parent");
                    }
                }
            }
        }

        public final void invalidateParentData() {
            this.q = true;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.s;
        }

        public final boolean isPlacedByParent() {
            return this.t;
        }

        @Override  // androidx.compose.ui.node.MotionReferencePlacementDelegate
        public boolean isPlacedUnderMotionFrameOfReference() {
            return this.H;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.x = true;
            this.getAlignmentLines().recalculateQueryOwner();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(layoutNodeLayoutDelegate0.getLayoutPending$ui_release()) {
                MutableVector mutableVector0 = layoutNodeLayoutDelegate0.a.get_children$ui_release();
                int v = mutableVector0.getSize();
                if(v > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    int v1 = 0;
                    while(true) {
                        LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                        if(layoutNode0.getMeasurePending$ui_release() && layoutNode0.getMeasuredByParent$ui_release() == UsageByParent.InMeasureBlock && LayoutNode.remeasure-_Sx5XlM$ui_release$default(layoutNode0, null, 1, null)) {
                            LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate0.a, false, false, false, 7, null);
                        }
                        ++v1;
                        if(v1 >= v) {
                            break;
                        }
                    }
                }
            }
            if(layoutNodeLayoutDelegate0.f || !this.l && !this.getInnerCoordinator().isPlacingForAlignment$ui_release() && layoutNodeLayoutDelegate0.getLayoutPending$ui_release()) {
                layoutNodeLayoutDelegate0.e = false;
                layoutNodeLayoutDelegate0.c = LayoutState.LayingOut;
                layoutNodeLayoutDelegate0.setCoordinatesAccessedDuringPlacement(false);
                LayoutNode layoutNode1 = layoutNodeLayoutDelegate0.a;
                LayoutNodeKt.requireOwner(layoutNode1).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode1, false, this.y);
                layoutNodeLayoutDelegate0.c = layoutNodeLayoutDelegate0.getLayoutState$ui_release();
                if(this.getInnerCoordinator().isPlacingForAlignment$ui_release() && layoutNodeLayoutDelegate0.getCoordinatesAccessedDuringPlacement()) {
                    this.requestLayout();
                }
                layoutNodeLayoutDelegate0.f = false;
            }
            if(this.getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                this.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if(this.getAlignmentLines().getDirty$ui_release() && this.getAlignmentLines().getRequired$ui_release()) {
                this.getAlignmentLines().recalculate();
            }
            this.x = false;
        }

        public final void markDetachedFromParentLookaheadPass$ui_release() {
            LayoutNodeLayoutDelegate.this.b = true;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int v) {
            this.e();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(v);
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int v) {
            this.e();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(v);
        }

        @Override  // androidx.compose.ui.layout.Measurable
        @NotNull
        public Placeable measure-BRTryo0(long v) {
            UsageByParent layoutNode$UsageByParent1;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            UsageByParent layoutNode$UsageByParent0 = UsageByParent.NotUsed;
            if(layoutNodeLayoutDelegate0.a.getIntrinsicsUsageByParent$ui_release() == layoutNode$UsageByParent0) {
                layoutNodeLayoutDelegate0.a.clearSubtreeIntrinsicsUsage$ui_release();
            }
            if(LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate0.a)) {
                LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNodeLayoutDelegate0.getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                layoutNodeLayoutDelegate$LookaheadPassDelegate0.setMeasuredByParent$ui_release(layoutNode$UsageByParent0);
                layoutNodeLayoutDelegate$LookaheadPassDelegate0.measure-BRTryo0(v);
            }
            LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a;
            LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
            if(layoutNode1 == null) {
                this.k = layoutNode$UsageByParent0;
            }
            else {
                if(this.k != layoutNode$UsageByParent0 && !layoutNode0.getCanMultiMeasure$ui_release()) {
                    InlineClassHelperKt.throwIllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
                switch(androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$0[layoutNode1.getLayoutState$ui_release().ordinal()]) {
                    case 1: {
                        layoutNode$UsageByParent1 = UsageByParent.InMeasureBlock;
                        break;
                    }
                    case 2: {
                        layoutNode$UsageByParent1 = UsageByParent.InLayoutBlock;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Measurable could be only measured from the parent\'s measure or layout block. Parents state is " + layoutNode1.getLayoutState$ui_release());
                    }
                }
                this.k = layoutNode$UsageByParent1;
            }
            this.remeasure-BRTryo0(v);
            return this;
        }

        public final void measureBasedOnLookahead() {
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.getParent$ui_release();
            if(layoutNode0 == null) {
                throw a.b("layoutNode parent is not set");
            }
            if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 == null) {
                throw a.b("invalid lookaheadDelegate");
            }
            if(layoutNodeLayoutDelegate$LookaheadPassDelegate0.getMeasuredByParent$ui_release() == UsageByParent.InMeasureBlock && layoutNode0.getLayoutState$ui_release() == LayoutState.Measuring) {
                Constraints constraints0 = layoutNodeLayoutDelegate$LookaheadPassDelegate0.getLastConstraints-DWUhwKw();
                Intrinsics.checkNotNull(constraints0);
                this.measure-BRTryo0(constraints0.unbox-impl());
                return;
            }
            if(layoutNodeLayoutDelegate$LookaheadPassDelegate0.getMeasuredByParent$ui_release() == UsageByParent.InLayoutBlock && layoutNode0.getLayoutState$ui_release() == LayoutState.LayingOut) {
                Constraints constraints1 = layoutNodeLayoutDelegate$LookaheadPassDelegate0.getLastConstraints-DWUhwKw();
                Intrinsics.checkNotNull(constraints1);
                this.measure-BRTryo0(constraints1.unbox-impl());
            }
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int v) {
            this.e();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(v);
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int v) {
            this.e();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(v);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(layoutNodeLayoutDelegate0.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                MutableVector mutableVector0 = layoutNodeLayoutDelegate0.a.get_children$ui_release();
                int v = mutableVector0.getSize();
                if(v > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    int v1 = 0;
                    while(true) {
                        LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate1 = layoutNode0.getLayoutDelegate$ui_release();
                        if((layoutNodeLayoutDelegate1.getCoordinatesAccessedDuringPlacement() || layoutNodeLayoutDelegate1.getCoordinatesAccessedDuringModifierPlacement()) && !layoutNodeLayoutDelegate1.getLayoutPending$ui_release()) {
                            LayoutNode.requestRelayout$ui_release$default(layoutNode0, false, 1, null);
                        }
                        layoutNodeLayoutDelegate1.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                        ++v1;
                        if(v1 >= v) {
                            break;
                        }
                    }
                }
            }
        }

        public final void onNodeDetached() {
            this.h = 0x7FFFFFFF;
            this.g = 0x7FFFFFFF;
            this.setPlaced$ui_release(false);
        }

        public final void onNodePlaced$ui_release() {
            this.A = true;
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.getParent$ui_release();
            float f = this.getInnerCoordinator().getZIndex();
            LayoutNode layoutNode1 = LayoutNodeLayoutDelegate.this.a;
            NodeCoordinator nodeCoordinator0 = layoutNode1.getOuterCoordinator$ui_release();
            NodeCoordinator nodeCoordinator1 = layoutNode1.getInnerCoordinator$ui_release();
            while(nodeCoordinator0 != nodeCoordinator1) {
                Intrinsics.checkNotNull(nodeCoordinator0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                f += ((LayoutModifierNodeCoordinator)nodeCoordinator0).getZIndex();
                nodeCoordinator0 = ((LayoutModifierNodeCoordinator)nodeCoordinator0).getWrapped$ui_release();
            }
            if(f != this.z) {
                this.z = f;
                if(layoutNode0 != null) {
                    layoutNode0.onZSortedChildrenInvalidated$ui_release();
                }
                if(layoutNode0 != null) {
                    layoutNode0.invalidateLayer$ui_release();
                }
            }
            if(!this.isPlaced()) {
                if(layoutNode0 != null) {
                    layoutNode0.invalidateLayer$ui_release();
                }
                this.c();
                if(this.f && layoutNode0 != null) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode0, false, 1, null);
                }
            }
            if(layoutNode0 == null) {
                this.h = 0;
            }
            else if(!this.f && layoutNode0.getLayoutState$ui_release() == LayoutState.LayingOut) {
                if(this.h != 0x7FFFFFFF) {
                    InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
                }
                this.h = layoutNode0.getLayoutDelegate$ui_release().k;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0.getLayoutDelegate$ui_release();
                ++layoutNodeLayoutDelegate0.k;
            }
            this.layoutChildren();
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public void placeAt-f8xVGno(long v, float f, @NotNull GraphicsLayer graphicsLayer0) {
            this.g(v, f, null, graphicsLayer0);
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public void placeAt-f8xVGno(long v, float f, @Nullable Function1 function10) {
            this.g(v, f, function10, null);
        }

        public final void placeBasedOnLookahead() {
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 == null) {
                throw a.b("invalid lookaheadDelegate");
            }
            this.g(layoutNodeLayoutDelegate$LookaheadPassDelegate0.getLastPosition-nOcc-ac$ui_release(), layoutNodeLayoutDelegate$LookaheadPassDelegate0.getLastZIndex$ui_release(), layoutNodeLayoutDelegate$LookaheadPassDelegate0.getLastLayerBlock$ui_release(), layoutNodeLayoutDelegate$LookaheadPassDelegate0.getLastExplicitLayer$ui_release());
        }

        public final boolean remeasure-BRTryo0(long v) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(layoutNodeLayoutDelegate0.a.isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            Owner owner0 = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate0.a);
            LayoutNode layoutNode0 = layoutNodeLayoutDelegate0.a.getParent$ui_release();
            boolean z = true;
            layoutNodeLayoutDelegate0.a.setCanMultiMeasure$ui_release(layoutNodeLayoutDelegate0.a.getCanMultiMeasure$ui_release() || layoutNode0 != null && layoutNode0.getCanMultiMeasure$ui_release());
            if(!layoutNodeLayoutDelegate0.a.getMeasurePending$ui_release() && Constraints.equals-impl0(this.getMeasurementConstraints-msEJaDk(), v)) {
                Owner.forceMeasureTheSubtree$default(owner0, layoutNodeLayoutDelegate0.a, false, 2, null);
                layoutNodeLayoutDelegate0.a.resetSubtreeIntrinsicsUsage$ui_release();
                return false;
            }
            this.getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            this.forEachChildAlignmentLinesOwner(w.w);
            this.i = true;
            long v1 = layoutNodeLayoutDelegate0.getOuterCoordinator().getSize-YbymL2g();
            this.setMeasurementConstraints-BRTryo0(v);
            LayoutNodeLayoutDelegate.access$performMeasure-BRTryo0(layoutNodeLayoutDelegate0, v);
            if(IntSize.equals-impl0(layoutNodeLayoutDelegate0.getOuterCoordinator().getSize-YbymL2g(), v1) && layoutNodeLayoutDelegate0.getOuterCoordinator().getWidth() == this.getWidth() && layoutNodeLayoutDelegate0.getOuterCoordinator().getHeight() == this.getHeight()) {
                z = false;
            }
            this.setMeasuredSize-ozmzZPI(IntSizeKt.IntSize(layoutNodeLayoutDelegate0.getOuterCoordinator().getWidth(), layoutNodeLayoutDelegate0.getOuterCoordinator().getHeight()));
            return z;
        }

        public final void replace() {
            try {
                this.f = true;
                if(!this.j) {
                    InlineClassHelperKt.throwIllegalStateException("replace called on unplaced item");
                }
                this.f(this.m, this.p, this.n, this.o);
                if(this.isPlaced() && !this.A) {
                    LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.getParent$ui_release();
                    if(layoutNode0 != null) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode0, false, 1, null);
                    }
                }
            }
            finally {
                this.f = false;
            }
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.a, false, 1, null);
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.a, false, false, false, 7, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.w = z;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.l = z;
        }

        public final void setMeasuredByParent$ui_release(@NotNull UsageByParent layoutNode$UsageByParent0) {
            this.k = layoutNode$UsageByParent0;
        }

        public void setPlaced$ui_release(boolean z) {
            this.s = z;
        }

        public final void setPlacedByParent$ui_release(boolean z) {
            this.t = z;
        }

        @Override  // androidx.compose.ui.node.MotionReferencePlacementDelegate
        public void setPlacedUnderMotionFrameOfReference(boolean z) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            boolean z1 = layoutNodeLayoutDelegate0.getOuterCoordinator().isPlacedUnderMotionFrameOfReference();
            if(z != z1) {
                layoutNodeLayoutDelegate0.getOuterCoordinator().setPlacedUnderMotionFrameOfReference(z1);
                this.G = true;
            }
            this.H = z;
        }

        public final boolean updateParentData() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            if(this.getParentData() == null && layoutNodeLayoutDelegate0.getOuterCoordinator().getParentData() == null) {
                return false;
            }
            if(!this.q) {
                return false;
            }
            this.q = false;
            this.r = layoutNodeLayoutDelegate0.getOuterCoordinator().getParentData();
            return true;
        }
    }

    public static final int $stable = 8;
    public final LayoutNode a;
    public boolean b;
    public LayoutState c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public final MeasurePassDelegate r;
    public LookaheadPassDelegate s;
    public long t;
    public final b u;

    public LayoutNodeLayoutDelegate(@NotNull LayoutNode layoutNode0) {
        this.a = layoutNode0;
        this.c = LayoutState.Idle;
        this.r = new MeasurePassDelegate(this);
        this.t = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.u = new b(this, 23);
    }

    public static final void access$performLookaheadMeasure-BRTryo0(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0, long v) {
        layoutNodeLayoutDelegate0.c = LayoutState.LookaheadMeasuring;
        layoutNodeLayoutDelegate0.g = false;
        OwnerSnapshotObserver ownerSnapshotObserver0 = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate0.a).getSnapshotObserver();
        p6 p60 = new p6(1, v, layoutNodeLayoutDelegate0);
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(ownerSnapshotObserver0, layoutNodeLayoutDelegate0.a, false, p60, 2, null);
        layoutNodeLayoutDelegate0.markLookaheadLayoutPending$ui_release();
        if(LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate0.a)) {
            layoutNodeLayoutDelegate0.markLayoutPending$ui_release();
        }
        else {
            layoutNodeLayoutDelegate0.markMeasurePending$ui_release();
        }
        layoutNodeLayoutDelegate0.c = LayoutState.Idle;
    }

    public static final void access$performMeasure-BRTryo0(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0, long v) {
        LayoutState layoutNode$LayoutState0 = LayoutState.Idle;
        if(layoutNodeLayoutDelegate0.c != layoutNode$LayoutState0) {
            InlineClassHelperKt.throwIllegalStateException("layout state is not idle before measure starts");
        }
        layoutNodeLayoutDelegate0.c = LayoutState.Measuring;
        layoutNodeLayoutDelegate0.d = false;
        layoutNodeLayoutDelegate0.t = v;
        LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate0.a).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(layoutNodeLayoutDelegate0.a, false, layoutNodeLayoutDelegate0.u);
        if(layoutNodeLayoutDelegate0.c == LayoutState.Measuring) {
            layoutNodeLayoutDelegate0.markLayoutPending$ui_release();
            layoutNodeLayoutDelegate0.c = layoutNode$LayoutState0;
        }
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if(this.s == null) {
            this.s = new LookaheadPassDelegate(this);
        }
    }

    @NotNull
    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.r;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.n;
    }

    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.q;
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.m;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.l;
    }

    public final boolean getDetachedFromParentLookaheadPass$ui_release() {
        return this.b;
    }

    public final int getHeight$ui_release() {
        return this.r.getHeight();
    }

    @Nullable
    public final Constraints getLastConstraints-DWUhwKw() {
        return this.r.getLastConstraints-DWUhwKw();
    }

    @Nullable
    public final Constraints getLastLookaheadConstraints-DWUhwKw() {
        return this.s == null ? null : this.s.getLastConstraints-DWUhwKw();
    }

    public final boolean getLayoutPending$ui_release() {
        return this.e;
    }

    @NotNull
    public final LayoutState getLayoutState$ui_release() {
        return this.c;
    }

    @Nullable
    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.s;
    }

    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.p;
    }

    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.o;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.h;
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.g;
    }

    @Nullable
    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.s;
    }

    @NotNull
    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.r;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.d;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator() {
        return this.a.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    public final int getWidth$ui_release() {
        return this.r.getWidth();
    }

    public final void invalidateParentData() {
        this.r.invalidateParentData();
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.s;
        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
            layoutNodeLayoutDelegate$LookaheadPassDelegate0.invalidateParentData();
        }
    }

    public final void markChildrenDirty() {
        this.r.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.s;
        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
            layoutNodeLayoutDelegate$LookaheadPassDelegate0.setChildDelegatesDirty$ui_release(true);
        }
    }

    public final void markLayoutPending$ui_release() {
        this.e = true;
        this.f = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.h = true;
        this.i = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.g = true;
    }

    public final void markMeasurePending$ui_release() {
        this.d = true;
    }

    public final void onCoordinatesUsed() {
        LayoutState layoutNode$LayoutState0 = this.a.getLayoutState$ui_release();
        if(layoutNode$LayoutState0 == LayoutState.LayingOut || layoutNode$LayoutState0 == LayoutState.LookaheadLayingOut) {
            if(this.r.getLayingOutChildren()) {
                this.setCoordinatesAccessedDuringPlacement(true);
            }
            else {
                this.setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if(layoutNode$LayoutState0 == LayoutState.LookaheadLayingOut) {
            if(this.s != null && this.s.getLayingOutChildren()) {
                this.setLookaheadCoordinatesAccessedDuringPlacement(true);
                return;
            }
            this.setLookaheadCoordinatesAccessedDuringModifierPlacement(true);
        }
    }

    public final void resetAlignmentLines() {
        this.r.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.s;
        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
            AlignmentLines alignmentLines0 = layoutNodeLayoutDelegate$LookaheadPassDelegate0.getAlignmentLines();
            if(alignmentLines0 != null) {
                alignmentLines0.reset$ui_release();
            }
        }
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int v) {
        int v1 = this.n;
        this.n = v;
        if((v1 == 0 ? 1 : 0) != (v == 0 ? 1 : 0)) {
            LayoutNode layoutNode0 = this.a.getParent$ui_release();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0 == null ? null : layoutNode0.getLayoutDelegate$ui_release();
            if(layoutNodeLayoutDelegate0 != null) {
                if(v == 0) {
                    layoutNodeLayoutDelegate0.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate0.n - 1);
                    return;
                }
                layoutNodeLayoutDelegate0.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate0.n + 1);
            }
        }
    }

    public final void setChildrenAccessingLookaheadCoordinatesDuringPlacement(int v) {
        int v1 = this.q;
        this.q = v;
        if((v1 == 0 ? 1 : 0) != (v == 0 ? 1 : 0)) {
            LayoutNode layoutNode0 = this.a.getParent$ui_release();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0 == null ? null : layoutNode0.getLayoutDelegate$ui_release();
            if(layoutNodeLayoutDelegate0 != null) {
                if(v == 0) {
                    layoutNodeLayoutDelegate0.setChildrenAccessingLookaheadCoordinatesDuringPlacement(layoutNodeLayoutDelegate0.q - 1);
                    return;
                }
                layoutNodeLayoutDelegate0.setChildrenAccessingLookaheadCoordinatesDuringPlacement(layoutNodeLayoutDelegate0.q + 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if(this.m != z) {
            this.m = z;
            if(z && !this.l) {
                this.setChildrenAccessingCoordinatesDuringPlacement(this.n + 1);
                return;
            }
            if(!z && !this.l) {
                this.setChildrenAccessingCoordinatesDuringPlacement(this.n - 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z) {
        if(this.l != z) {
            this.l = z;
            if(z && !this.m) {
                this.setChildrenAccessingCoordinatesDuringPlacement(this.n + 1);
                return;
            }
            if(!z && !this.m) {
                this.setChildrenAccessingCoordinatesDuringPlacement(this.n - 1);
            }
        }
    }

    public final void setLookaheadCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if(this.p != z) {
            this.p = z;
            if(z && !this.o) {
                this.setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.q + 1);
                return;
            }
            if(!z && !this.o) {
                this.setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.q - 1);
            }
        }
    }

    public final void setLookaheadCoordinatesAccessedDuringPlacement(boolean z) {
        if(this.o != z) {
            this.o = z;
            if(z && !this.p) {
                this.setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.q + 1);
                return;
            }
            if(!z && !this.p) {
                this.setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.q - 1);
            }
        }
    }

    public final void updateParentData() {
        boolean z = this.r.updateParentData();
        LayoutNode layoutNode0 = this.a;
        if(z) {
            LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
            if(layoutNode1 != null) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode1, false, false, false, 7, null);
            }
        }
        if(this.s != null && this.s.updateParentData()) {
            if(LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode0)) {
                LayoutNode layoutNode2 = layoutNode0.getParent$ui_release();
                if(layoutNode2 != null) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode2, false, false, false, 7, null);
                }
            }
            else {
                LayoutNode layoutNode3 = layoutNode0.getParent$ui_release();
                if(layoutNode3 != null) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode3, false, false, false, 7, null);
                }
            }
        }
    }
}

