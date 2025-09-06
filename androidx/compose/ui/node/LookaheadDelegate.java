package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u00A6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0000\u00A2\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\u0010\u001A\u00020\rH\u0010\u00A2\u0006\u0004\b\u000E\u0010\u000FJ=\u0010\u001B\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00132\u0019\u0010\u0018\u001A\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0015\u00A2\u0006\u0002\b\u0017H\u0004\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001E\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u0011H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001F\u001A\u00020\rH\u0014\u00A2\u0006\u0004\b\u001F\u0010\u000FJ)\u0010(\u001A\u00020%2\u0006\u0010!\u001A\u00020 2\f\u0010$\u001A\b\u0012\u0004\u0012\u00020#0\"H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\'J\u0017\u0010*\u001A\u00020\t2\u0006\u0010)\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b*\u0010+J\u0017\u0010,\u001A\u00020\t2\u0006\u0010)\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b,\u0010+J\u0017\u0010.\u001A\u00020\t2\u0006\u0010-\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b.\u0010+J\u0017\u0010/\u001A\u00020\t2\u0006\u0010-\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b/\u0010+J%\u00105\u001A\u00020\u00112\u0006\u00100\u001A\u00020\u00002\u0006\u00102\u001A\u000201H\u0000\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104R\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R(\u0010\u0012\u001A\u00020\u00118\u0016@\u0016X\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0004\b>\u0010\u001DR\u0017\u0010D\u001A\u00020?8\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010CR&\u0010J\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0E8\u0004X\u0084\u0004\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR\u0016\u0010M\u001A\u0004\u0018\u00010\u00028VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bK\u0010LR\u0014\u0010P\u001A\u0002018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bN\u0010OR\u0014\u0010S\u001A\u00020#8PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\bQ\u0010RR\u0014\u0010T\u001A\u0002018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bT\u0010OR\u0014\u0010X\u001A\u00020U8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bV\u0010WR\u0014\u0010[\u001A\u00020\u00138VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bY\u0010ZR\u0014\u0010]\u001A\u00020\u00138VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\\\u0010ZR\u0016\u0010_\u001A\u0004\u0018\u00010\u00028VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b^\u0010LR\u0014\u0010c\u001A\u00020`8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\ba\u0010bR\u0014\u0010g\u001A\u00020d8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\be\u0010fR\u001A\u0010j\u001A\u00020h8@X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bi\u0010=R\u001A\u0010!\u001A\u00020 8@X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bk\u0010=R\u0014\u0010o\u001A\u00020l8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bm\u0010nR\u0016\u0010s\u001A\u0004\u0018\u00010p8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bq\u0010r\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006t"}, d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getCachedAlignmentLine$ui_release", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "getCachedAlignmentLine", "", "replace$ui_release", "()V", "replace", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "placeSelfApparentToRealOffset--gyyYBs$ui_release", "(J)V", "placeSelfApparentToRealOffset", "placeChildren", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/MeasureResult;", "block", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "ancestor", "", "excludingAgnosticOffset", "positionIn-iSbpLlY$ui_release", "(Landroidx/compose/ui/node/LookaheadDelegate;Z)J", "positionIn", "n", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "o", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "q", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "getLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "lookaheadLayoutCoordinates", "", "s", "Ljava/util/Map;", "getCachedAlignmentLinesMap", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "getHasMeasureResult", "()Z", "hasMeasureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "isLookingAhead", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "getFontScale", "fontScale", "getParent", "parent", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g$ui_release", "size", "getConstraints-msEJaDk$ui_release", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "", "getParentData", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,491:1\n1#2:492\n*E\n"})
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable;
    public final NodeCoordinator n;
    public long o;
    public LinkedHashMap p;
    public final LookaheadLayoutCoordinates q;
    public MeasureResult r;
    public final LinkedHashMap s;

    public LookaheadDelegate(@NotNull NodeCoordinator nodeCoordinator0) {
        this.n = nodeCoordinator0;
        this.o = 0L;
        this.q = new LookaheadLayoutCoordinates(this);
        this.s = new LinkedHashMap();
    }

    public static final void access$set_measureResult(LookaheadDelegate lookaheadDelegate0, MeasureResult measureResult0) {
        Unit unit0;
        lookaheadDelegate0.getClass();
        if(measureResult0 == null) {
            unit0 = null;
        }
        else {
            lookaheadDelegate0.setMeasuredSize-ozmzZPI(IntSizeKt.IntSize(measureResult0.getWidth(), measureResult0.getHeight()));
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            lookaheadDelegate0.setMeasuredSize-ozmzZPI(0L);
        }
        if(!Intrinsics.areEqual(lookaheadDelegate0.r, measureResult0) && measureResult0 != null && ((lookaheadDelegate0.p != null && !lookaheadDelegate0.p.isEmpty() || !measureResult0.getAlignmentLines().isEmpty()) && !Intrinsics.areEqual(measureResult0.getAlignmentLines(), lookaheadDelegate0.p))) {
            lookaheadDelegate0.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            LinkedHashMap linkedHashMap0 = lookaheadDelegate0.p;
            if(linkedHashMap0 == null) {
                linkedHashMap0 = new LinkedHashMap();
                lookaheadDelegate0.p = linkedHashMap0;
            }
            linkedHashMap0.clear();
            linkedHashMap0.putAll(measureResult0.getAlignmentLines());
        }
        lookaheadDelegate0.r = measureResult0;
    }

    public final void f(long v) {
        if(!IntOffset.equals-impl0(this.getPosition-nOcc-ac(), v)) {
            this.setPosition--gyyYBs(v);
            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
                layoutNodeLayoutDelegate$LookaheadPassDelegate0.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            this.invalidateAlignmentLinesFromPositionChange(this.n);
        }
        if(!this.isPlacingForAlignment$ui_release()) {
            this.captureRulers$ui_release(this.getMeasureResult$ui_release());
        }
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner alignmentLinesOwner0 = this.n.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        Intrinsics.checkNotNull(alignmentLinesOwner0);
        return alignmentLinesOwner0;
    }

    public final int getCachedAlignmentLine$ui_release(@NotNull AlignmentLine alignmentLine0) {
        Integer integer0 = (Integer)this.s.get(alignmentLine0);
        return integer0 == null ? 0x80000000 : ((int)integer0);
    }

    @NotNull
    public final Map getCachedAlignmentLinesMap() {
        return this.s;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator nodeCoordinator0 = this.n.getWrapped$ui_release();
        return nodeCoordinator0 != null ? nodeCoordinator0.getLookaheadDelegate() : null;
    }

    public final long getConstraints-msEJaDk$ui_release() {
        return this.getMeasurementConstraints-msEJaDk();
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this.q;
    }

    @NotNull
    public final NodeCoordinator getCoordinator() {
        return this.n;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.n.getDensity();
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.n.getFontScale();
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this.r != null;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.n.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.n.getLayoutNode();
    }

    @NotNull
    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.q;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult0 = this.r;
        if(measureResult0 == null) {
            throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
        }
        return measureResult0;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator nodeCoordinator0 = this.n.getWrappedBy$ui_release();
        return nodeCoordinator0 != null ? nodeCoordinator0.getLookaheadDelegate() : null;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable, androidx.compose.ui.layout.Measured
    @Nullable
    public Object getParentData() {
        return this.n.getParentData();
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public long getPosition-nOcc-ac() {
        return this.o;
    }

    public final long getSize-YbymL2g$ui_release() {
        return IntSizeKt.IntSize(this.getWidth(), this.getHeight());
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean isLookingAhead() {
        return true;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int v) {
        NodeCoordinator nodeCoordinator0 = this.n.getWrapped$ui_release();
        Intrinsics.checkNotNull(nodeCoordinator0);
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        return lookaheadDelegate0.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int v) {
        NodeCoordinator nodeCoordinator0 = this.n.getWrapped$ui_release();
        Intrinsics.checkNotNull(nodeCoordinator0);
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        return lookaheadDelegate0.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int v) {
        NodeCoordinator nodeCoordinator0 = this.n.getWrapped$ui_release();
        Intrinsics.checkNotNull(nodeCoordinator0);
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        return lookaheadDelegate0.minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int v) {
        NodeCoordinator nodeCoordinator0 = this.n.getWrapped$ui_release();
        Intrinsics.checkNotNull(nodeCoordinator0);
        LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        return lookaheadDelegate0.minIntrinsicWidth(v);
    }

    @NotNull
    public final Placeable performingMeasure-K40F9xA(long v, @NotNull Function0 function00) {
        this.setMeasurementConstraints-BRTryo0(v);
        LookaheadDelegate.access$set_measureResult(this, ((MeasureResult)function00.invoke()));
        return this;
    }

    @Override  // androidx.compose.ui.layout.Placeable
    public final void placeAt-f8xVGno(long v, float f, @Nullable Function1 function10) {
        this.f(v);
        if(this.isShallowPlacing$ui_release()) {
            return;
        }
        this.placeChildren();
    }

    public void placeChildren() {
        this.getMeasureResult$ui_release().placeChildren();
    }

    public final void placeSelfApparentToRealOffset--gyyYBs$ui_release(long v) {
        this.f(IntOffset.plus-qkQi6aY(v, this.getApparentToRealOffset-nOcc-ac()));
    }

    public final long positionIn-iSbpLlY$ui_release(@NotNull LookaheadDelegate lookaheadDelegate0, boolean z) {
        long v = 0L;
        LookaheadDelegate lookaheadDelegate1 = this;
        while(!Intrinsics.areEqual(lookaheadDelegate1, lookaheadDelegate0)) {
            if(!lookaheadDelegate1.isPlacedUnderMotionFrameOfReference() || !z) {
                v = IntOffset.plus-qkQi6aY(v, lookaheadDelegate1.getPosition-nOcc-ac());
            }
            NodeCoordinator nodeCoordinator0 = lookaheadDelegate1.n.getWrappedBy$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator0);
            lookaheadDelegate1 = nodeCoordinator0.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate1);
        }
        return v;
    }

    @Override  // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        this.placeAt-f8xVGno(this.getPosition-nOcc-ac(), 0.0f, null);
    }

    public void setPosition--gyyYBs(long v) {
        this.o = v;
    }
}

