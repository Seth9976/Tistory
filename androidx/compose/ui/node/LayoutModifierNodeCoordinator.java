package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import b2.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 O2\u00020\u0001:\u0002OPB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u0010\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0013\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0014J*\u0010!\u001A\u00020\b2\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001DH\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 J=\u0010!\u001A\u00020\b2\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001B2\u0019\u0010%\u001A\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b\u0018\u00010\"\u00A2\u0006\u0002\b$H\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010&J\u0017\u0010)\u001A\u00020\u00112\u0006\u0010(\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b)\u0010*J!\u0010.\u001A\u00020\b2\u0006\u0010,\u001A\u00020+2\b\u0010-\u001A\u0004\u0018\u00010\u001DH\u0016\u00A2\u0006\u0004\b.\u0010/R*\u00107\u001A\u00020\u00042\u0006\u00100\u001A\u00020\u00048\u0006@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b1\u00102\u001A\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010>\u001A\u0004\u0018\u00010\u000B8\u0000@\u0000X\u0080\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b8\u00109\u001A\u0004\b:\u0010;\"\u0004\b<\u0010=R.\u0010G\u001A\u0004\u0018\u00010?2\b\u0010@\u001A\u0004\u0018\u00010?8\u0016@TX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010K\u001A\u00020H8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bI\u0010JR\u0011\u0010N\u001A\u00020\u00018F\u00A2\u0006\u0006\u001A\u0004\bL\u0010M\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006Q"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V", "", "ensureLookaheadDelegateCreated", "()V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "placeAt-f8xVGno", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeAt", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "performDraw", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "value", "Q", "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayoutModifierNode", "()Landroidx/compose/ui/node/LayoutModifierNode;", "setLayoutModifierNode$ui_release", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "layoutModifierNode", "R", "Landroidx/compose/ui/unit/Constraints;", "getLookaheadConstraints-DWUhwKw$ui_release", "()Landroidx/compose/ui/unit/Constraints;", "setLookaheadConstraints-_Sx5XlM$ui_release", "(Landroidx/compose/ui/unit/Constraints;)V", "lookaheadConstraints", "Landroidx/compose/ui/node/LookaheadDelegate;", "<set-?>", "S", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getWrappedNonNull", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "Companion", "b2/k", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,321:1\n92#2:322\n92#2:324\n264#3:323\n264#3:325\n306#4,2:326\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n78#1:322\n49#1:324\n78#1:323\n49#1:325\n157#1:326,2\n*E\n"})
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$Companion;", "", "Landroidx/compose/ui/graphics/Paint;", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.U;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public LayoutModifierNode Q;
    public Constraints R;
    public LookaheadDelegate S;
    public ApproachMeasureScopeImpl T;
    public static final Paint U;

    static {
        LayoutModifierNodeCoordinator.Companion = new Companion(null);
        Paint paint0 = AndroidPaint_androidKt.Paint();
        paint0.setColor-8_81llA(0xFF0000FF00000000L);
        paint0.setStrokeWidth(1.0f);
        paint0.setStyle-k9PVt8s(1);
        LayoutModifierNodeCoordinator.U = paint0;
    }

    public LayoutModifierNodeCoordinator(@NotNull LayoutNode layoutNode0, @NotNull LayoutModifierNode layoutModifierNode0) {
        super(layoutNode0);
        this.Q = layoutModifierNode0;
        ApproachMeasureScopeImpl approachMeasureScopeImpl0 = null;
        this.S = layoutNode0.getLookaheadRoot$ui_release() == null ? null : new k(this);
        if((layoutModifierNode0.getNode().getKindSet$ui_release() & 0x200) != 0) {
            Intrinsics.checkNotNull(layoutModifierNode0, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            approachMeasureScopeImpl0 = new ApproachMeasureScopeImpl(this, ((ApproachLayoutModifierNode)layoutModifierNode0));
        }
        this.T = approachMeasureScopeImpl0;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine0) {
        LookaheadDelegate lookaheadDelegate0 = this.getLookaheadDelegate();
        return lookaheadDelegate0 == null ? LayoutModifierNodeCoordinatorKt.access$calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine0) : lookaheadDelegate0.getCachedAlignmentLine$ui_release(alignmentLine0);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if(this.getLookaheadDelegate() == null) {
            this.setLookaheadDelegate(new k(this));
        }
    }

    @NotNull
    public final LayoutModifierNode getLayoutModifierNode() {
        return this.Q;
    }

    @Nullable
    public final Constraints getLookaheadConstraints-DWUhwKw$ui_release() {
        return this.R;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    @Nullable
    public LookaheadDelegate getLookaheadDelegate() {
        return this.S;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    @NotNull
    public Node getTail() {
        return this.Q.getNode();
    }

    @NotNull
    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator nodeCoordinator0 = this.getWrapped$ui_release();
        Intrinsics.checkNotNull(nodeCoordinator0);
        return nodeCoordinator0;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int v) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl0 = this.T;
        return approachMeasureScopeImpl0 == null ? this.Q.maxIntrinsicHeight(this, this.getWrappedNonNull(), v) : approachMeasureScopeImpl0.getApproachNode().maxApproachIntrinsicHeight(approachMeasureScopeImpl0, this.getWrappedNonNull(), v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int v) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl0 = this.T;
        return approachMeasureScopeImpl0 == null ? this.Q.maxIntrinsicWidth(this, this.getWrappedNonNull(), v) : approachMeasureScopeImpl0.getApproachNode().maxApproachIntrinsicWidth(approachMeasureScopeImpl0, this.getWrappedNonNull(), v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    @NotNull
    public Placeable measure-BRTryo0(long v) {
        MeasureResult measureResult0;
        if(this.getForceMeasureWithLookaheadConstraints$ui_release()) {
            Constraints constraints0 = this.R;
            if(constraints0 == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            v = constraints0.unbox-impl();
        }
        this.setMeasurementConstraints-BRTryo0(v);
        ApproachMeasureScopeImpl approachMeasureScopeImpl0 = this.T;
        if(approachMeasureScopeImpl0 == null) {
            measureResult0 = this.getLayoutModifierNode().measure-3p2s80s(this, this.getWrappedNonNull(), v);
        }
        else {
            ApproachLayoutModifierNode approachLayoutModifierNode0 = approachMeasureScopeImpl0.getApproachNode();
            boolean z = true;
            approachMeasureScopeImpl0.setApproachMeasureRequired$ui_release(approachLayoutModifierNode0.isMeasurementApproachInProgress-ozmzZPI(approachMeasureScopeImpl0.getLookaheadSize-YbymL2g()) || !Constraints.equals-impl(v, this.getLookaheadConstraints-DWUhwKw$ui_release()));
            if(!approachMeasureScopeImpl0.getApproachMeasureRequired$ui_release()) {
                this.getWrappedNonNull().setForceMeasureWithLookaheadConstraints$ui_release(true);
            }
            measureResult0 = approachLayoutModifierNode0.approachMeasure-3p2s80s(approachMeasureScopeImpl0, this.getWrappedNonNull(), v);
            this.getWrappedNonNull().setForceMeasureWithLookaheadConstraints$ui_release(false);
            int v1 = measureResult0.getWidth();
            LookaheadDelegate lookaheadDelegate0 = this.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            if(v1 == lookaheadDelegate0.getWidth()) {
                int v2 = measureResult0.getHeight();
                LookaheadDelegate lookaheadDelegate1 = this.getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate1);
                if(v2 != lookaheadDelegate1.getHeight()) {
                    z = false;
                }
            }
            else {
                z = false;
            }
            if(!approachMeasureScopeImpl0.getApproachMeasureRequired$ui_release()) {
                long v3 = this.getWrappedNonNull().getSize-YbymL2g();
                LookaheadDelegate lookaheadDelegate2 = this.getWrappedNonNull().getLookaheadDelegate();
                if(IntSize.equals-impl(v3, (lookaheadDelegate2 == null ? null : IntSize.box-impl(lookaheadDelegate2.getSize-YbymL2g$ui_release()))) && !z) {
                    measureResult0 = new MeasureResult() {
                        public final MeasureResult a;
                        public final int b;
                        public final int c;

                        {
                            MeasureResult measureResult0 = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                            this.a = measureResult0;
                            LookaheadDelegate lookaheadDelegate0 = layoutModifierNodeCoordinator0.getLookaheadDelegate();
                            Intrinsics.checkNotNull(lookaheadDelegate0);
                            this.b = lookaheadDelegate0.getWidth();
                            LookaheadDelegate lookaheadDelegate1 = layoutModifierNodeCoordinator0.getLookaheadDelegate();
                            Intrinsics.checkNotNull(lookaheadDelegate1);
                            this.c = lookaheadDelegate1.getHeight();
                        }

                        @Override  // androidx.compose.ui.layout.MeasureResult
                        @NotNull
                        public Map getAlignmentLines() {
                            return this.a.getAlignmentLines();
                        }

                        @Override  // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return this.c;
                        }

                        @Override  // androidx.compose.ui.layout.MeasureResult
                        @Nullable
                        public Function1 getRulers() {
                            return this.a.getRulers();
                        }

                        @Override  // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return this.b;
                        }

                        @Override  // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            this.a.placeChildren();
                        }
                    };
                }
            }
        }
        this.setMeasureResult$ui_release(measureResult0);
        this.onMeasured();
        return this;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int v) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl0 = this.T;
        return approachMeasureScopeImpl0 == null ? this.Q.minIntrinsicHeight(this, this.getWrappedNonNull(), v) : approachMeasureScopeImpl0.getApproachNode().minApproachIntrinsicHeight(approachMeasureScopeImpl0, this.getWrappedNonNull(), v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int v) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl0 = this.T;
        return approachMeasureScopeImpl0 == null ? this.Q.minIntrinsicWidth(this, this.getWrappedNonNull(), v) : approachMeasureScopeImpl0.getApproachNode().minApproachIntrinsicWidth(approachMeasureScopeImpl0, this.getWrappedNonNull(), v);
    }

    public final void o() {
        boolean z;
        if(this.isShallowPlacing$ui_release()) {
            return;
        }
        this.onPlaced();
        ApproachMeasureScopeImpl approachMeasureScopeImpl0 = this.T;
        if(approachMeasureScopeImpl0 != null) {
            LookaheadDelegate lookaheadDelegate0 = this.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            if(approachMeasureScopeImpl0.getApproachNode().isPlacementApproachInProgress(this.getPlacementScope(), lookaheadDelegate0.getLookaheadLayoutCoordinates()) || approachMeasureScopeImpl0.getApproachMeasureRequired$ui_release()) {
                z = false;
            }
            else {
                LookaheadDelegate lookaheadDelegate1 = this.getLookaheadDelegate();
                IntSize intSize0 = null;
                if(IntSize.equals-impl(this.getSize-YbymL2g(), (lookaheadDelegate1 == null ? null : IntSize.box-impl(lookaheadDelegate1.getSize-YbymL2g$ui_release())))) {
                    long v = this.getWrappedNonNull().getSize-YbymL2g();
                    LookaheadDelegate lookaheadDelegate2 = this.getWrappedNonNull().getLookaheadDelegate();
                    if(lookaheadDelegate2 != null) {
                        intSize0 = IntSize.box-impl(lookaheadDelegate2.getSize-YbymL2g$ui_release());
                    }
                    z = IntSize.equals-impl(v, intSize0);
                }
                else {
                    z = false;
                }
            }
            this.getWrappedNonNull().setForcePlaceWithLookaheadOffset$ui_release(z);
        }
        this.getMeasureResult$ui_release().placeChildren();
        this.getWrappedNonNull().setForcePlaceWithLookaheadOffset$ui_release(false);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(@NotNull Canvas canvas0, @Nullable GraphicsLayer graphicsLayer0) {
        this.getWrappedNonNull().draw(canvas0, graphicsLayer0);
        if(LayoutNodeKt.requireOwner(this.getLayoutNode()).getShowLayoutBounds()) {
            this.drawBorder(canvas0, LayoutModifierNodeCoordinator.U);
        }
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void placeAt-f8xVGno(long v, float f, @NotNull GraphicsLayer graphicsLayer0) {
        super.placeAt-f8xVGno(v, f, graphicsLayer0);
        this.o();
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void placeAt-f8xVGno(long v, float f, @Nullable Function1 function10) {
        super.placeAt-f8xVGno(v, f, function10);
        this.o();
    }

    public final void setLayoutModifierNode$ui_release(@NotNull LayoutModifierNode layoutModifierNode0) {
        if(!Intrinsics.areEqual(layoutModifierNode0, this.Q)) {
            if((layoutModifierNode0.getNode().getKindSet$ui_release() & 0x200) == 0) {
                this.T = null;
            }
            else {
                Intrinsics.checkNotNull(layoutModifierNode0, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                ApproachMeasureScopeImpl approachMeasureScopeImpl0 = this.T;
                if(approachMeasureScopeImpl0 == null) {
                    approachMeasureScopeImpl0 = new ApproachMeasureScopeImpl(this, ((ApproachLayoutModifierNode)layoutModifierNode0));
                }
                else {
                    approachMeasureScopeImpl0.setApproachNode(((ApproachLayoutModifierNode)layoutModifierNode0));
                }
                this.T = approachMeasureScopeImpl0;
            }
        }
        this.Q = layoutModifierNode0;
    }

    public final void setLookaheadConstraints-_Sx5XlM$ui_release(@Nullable Constraints constraints0) {
        this.R = constraints0;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void setLookaheadDelegate(@Nullable LookaheadDelegate lookaheadDelegate0) {
        this.S = lookaheadDelegate0;
    }
}

