package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u008C\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0000\u0018\u0000 J2\u00020\u0001:\u0002JKB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0012J*\u0010\u001F\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001BH\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ=\u0010\u001F\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00192\u0019\u0010#\u001A\u0015\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0006\u0018\u00010 \u00A2\u0006\u0002\b\"H\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010$J\u0017\u0010\'\u001A\u00020\u000F2\u0006\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b\'\u0010(J!\u0010,\u001A\u00020\u00062\u0006\u0010*\u001A\u00020)2\b\u0010+\u001A\u0004\u0018\u00010\u001BH\u0016\u00A2\u0006\u0004\b,\u0010-J:\u00109\u001A\u00020\u00062\u0006\u0010/\u001A\u00020.2\u0006\u00101\u001A\u0002002\u0006\u00103\u001A\u0002022\u0006\u00105\u001A\u0002042\u0006\u00106\u001A\u000204H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00108R \u0010@\u001A\u00020:8\u0016X\u0096\u0004\u00A2\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010\b\u001A\u0004\b=\u0010>R.\u0010I\u001A\u0004\u0018\u00010A2\b\u0010B\u001A\u0004\u0018\u00010A8\u0016@TX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010D\u001A\u0004\bE\u0010F\"\u0004\bG\u0010H\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006L"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "ensureLookaheadDelegateCreated", "()V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "placeAt-f8xVGno", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeAt", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "performDraw", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "", "isTouchEvent", "isInLayer", "hitTestChild-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestChild", "Landroidx/compose/ui/node/TailModifierNode;", "Q", "Landroidx/compose/ui/node/TailModifierNode;", "getTail", "()Landroidx/compose/ui/node/TailModifierNode;", "getTail$annotations", "tail", "Landroidx/compose/ui/node/LookaheadDelegate;", "<set-?>", "R", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "Companion", "androidx/compose/ui/node/i", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,266:1\n306#2,2:267\n203#3:269\n460#4,11:270\n460#4,11:281\n222#4,11:294\n184#5,2:292\n186#5,2:305\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n128#1:267,2\n130#1:269\n130#1:270,11\n194#1:281,11\n230#1:294,11\n227#1:292,2\n227#1:305,2\n*E\n"})
public final class InnerNodeCoordinator extends NodeCoordinator {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "Landroidx/compose/ui/graphics/Paint;", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.S;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final TailModifierNode Q;
    public LookaheadDelegate R;
    public static final Paint S;

    static {
        InnerNodeCoordinator.Companion = new Companion(null);
        Paint paint0 = AndroidPaint_androidKt.Paint();
        paint0.setColor-8_81llA(0xFFFF000000000000L);
        paint0.setStrokeWidth(1.0f);
        paint0.setStyle-k9PVt8s(1);
        InnerNodeCoordinator.S = paint0;
    }

    public InnerNodeCoordinator(@NotNull LayoutNode layoutNode0) {
        super(layoutNode0);
        this.Q = new TailModifierNode();
        this.getTail().updateCoordinator$ui_release(this);
        this.R = layoutNode0.getLookaheadRoot$ui_release() == null ? null : new i(this);  // 初始化器: Landroidx/compose/ui/node/LookaheadDelegate;-><init>(Landroidx/compose/ui/node/NodeCoordinator;)V
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine0) {
        LookaheadDelegate lookaheadDelegate0 = this.getLookaheadDelegate();
        if(lookaheadDelegate0 != null) {
            return lookaheadDelegate0.calculateAlignmentLine(alignmentLine0);
        }
        Integer integer0 = (Integer)this.getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine0);
        return integer0 == null ? 0x80000000 : ((int)integer0);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if(this.getLookaheadDelegate() == null) {
            this.setLookaheadDelegate(new i(this));  // 初始化器: Landroidx/compose/ui/node/LookaheadDelegate;-><init>(Landroidx/compose/ui/node/NodeCoordinator;)V
        }
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    @Nullable
    public LookaheadDelegate getLookaheadDelegate() {
        return this.R;
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public Node getTail() {
        return this.getTail();
    }

    @NotNull
    public TailModifierNode getTail() {
        return this.Q;
    }

    public static void getTail$annotations() {
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void hitTestChild-YqVAtuI(@NotNull HitTestSource nodeCoordinator$HitTestSource0, long v, @NotNull HitTestResult hitTestResult0, boolean z, boolean z1) {
        boolean z3;
        boolean z2 = false;
        if(!nodeCoordinator$HitTestSource0.shouldHitTestChildren(this.getLayoutNode())) {
            z3 = z1;
        }
        else if(this.withinLayerBounds-k-4lQ0M(v)) {
            z3 = z1;
            z2 = true;
        }
        else if(z) {
            float f = this.distanceInMinimumTouchTarget-tz77jQw(v, this.getMinimumTouchTargetSize-NH-jbRc());
            if(Float.isInfinite(f) || Float.isNaN(f)) {
                z3 = z1;
            }
            else {
                z3 = false;
                z2 = true;
            }
        }
        else {
            z3 = z1;
        }
        if(z2) {
            int v1 = hitTestResult0.c;
            MutableVector mutableVector0 = this.getLayoutNode().getZSortedChildren();
            int v2 = mutableVector0.getSize();
            if(v2 > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v3 = v2 - 1;
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v3];
                    if(layoutNode0.isPlaced()) {
                        nodeCoordinator$HitTestSource0.childHitTest-YqVAtuI(layoutNode0, v, hitTestResult0, z, z3);
                        if(hitTestResult0.hasHit()) {
                            if(!hitTestResult0.getShouldSharePointerInputWithSibling()) {
                                break;
                            }
                            hitTestResult0.acceptHits();
                        }
                    }
                    --v3;
                    if(v3 < 0) {
                        break;
                    }
                }
            }
            hitTestResult0.c = v1;
        }
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int v) {
        return this.getLayoutNode().maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int v) {
        return this.getLayoutNode().maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    @NotNull
    public Placeable measure-BRTryo0(long v) {
        if(this.getForceMeasureWithLookaheadConstraints$ui_release()) {
            LookaheadDelegate lookaheadDelegate0 = this.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate0);
            v = lookaheadDelegate0.getConstraints-msEJaDk$ui_release();
        }
        this.setMeasurementConstraints-BRTryo0(v);
        MutableVector mutableVector0 = this.getLayoutNode().get_children$ui_release();
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v2 = 0;
            while(true) {
                ((LayoutNode)arr_object[v2]).getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(UsageByParent.NotUsed);
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        this.setMeasureResult$ui_release(this.getLayoutNode().getMeasurePolicy().measure-3p2s80s(this, this.getLayoutNode().getChildMeasurables$ui_release(), v));
        this.onMeasured();
        return this;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int v) {
        return this.getLayoutNode().minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int v) {
        return this.getLayoutNode().minIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(@NotNull Canvas canvas0, @Nullable GraphicsLayer graphicsLayer0) {
        Owner owner0 = LayoutNodeKt.requireOwner(this.getLayoutNode());
        MutableVector mutableVector0 = this.getLayoutNode().getZSortedChildren();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.isPlaced()) {
                    layoutNode0.draw$ui_release(canvas0, graphicsLayer0);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        if(owner0.getShowLayoutBounds()) {
            this.drawBorder(canvas0, InnerNodeCoordinator.S);
        }
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void placeAt-f8xVGno(long v, float f, @NotNull GraphicsLayer graphicsLayer0) {
        super.placeAt-f8xVGno(v, f, graphicsLayer0);
        if(!this.isShallowPlacing$ui_release()) {
            this.onPlaced();
            this.getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
        }
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void placeAt-f8xVGno(long v, float f, @Nullable Function1 function10) {
        super.placeAt-f8xVGno(v, f, function10);
        if(!this.isShallowPlacing$ui_release()) {
            this.onPlaced();
            this.getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
        }
    }

    @Override  // androidx.compose.ui.node.NodeCoordinator
    public void setLookaheadDelegate(@Nullable LookaheadDelegate lookaheadDelegate0) {
        this.R = lookaheadDelegate0;
    }
}

