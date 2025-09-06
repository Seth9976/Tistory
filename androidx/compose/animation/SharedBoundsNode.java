package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import s.c1;
import s.d1;
import s.e1;
import s.f1;
import s.g1;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000F\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000BJ\u000F\u0010\r\u001A\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000BJ&\u0010\u0016\u001A\u00020\u0013*\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u001C\u001A\u00020\u00192\u0006\u0010\u0018\u001A\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001BJ&\u0010 \u001A\u00020\u0013*\u00020\u001D2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001FJ\u0013\u0010\"\u001A\u00020\t*\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R*\u0010\u0006\u001A\u00020\u00052\u0006\u0010$\u001A\u00020\u00058\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010\bR\u001A\u0010/\u001A\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00060"}, d2 = {"Landroidx/compose/animation/SharedBoundsNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/animation/SharedElementInternalState;", "state", "<init>", "(Landroidx/compose/animation/SharedElementInternalState;)V", "", "onAttach", "()V", "onDetach", "onReset", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "isMeasurementApproachInProgress", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "value", "n", "Landroidx/compose/animation/SharedElementInternalState;", "getState", "()Landroidx/compose/animation/SharedElementInternalState;", "setState$animation_release", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "p", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSharedContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,276:1\n1#2:277\n56#3,4:278\n56#3,4:282\n*S KotlinDebug\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n*L\n168#1:278,4\n224#1:282,4\n*E\n"})
public final class SharedBoundsNode extends Node implements ApproachLayoutModifierNode, ModifierLocalModifierNode, DrawModifierNode {
    public static final int $stable = 8;
    public SharedElementInternalState n;
    public GraphicsLayer o;
    public final ModifierLocalMap p;

    public SharedBoundsNode(@NotNull SharedElementInternalState sharedElementInternalState0) {
        this.n = sharedElementInternalState0;
        this.o = sharedElementInternalState0.getLayer();
        this.p = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState0));
    }

    public static final BoundsAnimation access$getBoundsAnimation(SharedBoundsNode sharedBoundsNode0) {
        return sharedBoundsNode0.n.getBoundsAnimation();
    }

    public static final LayoutCoordinates access$getRootCoords(SharedBoundsNode sharedBoundsNode0) {
        return sharedBoundsNode0.n.getSharedElement().getScope().getRoot$animation_release();
    }

    public static final LayoutCoordinates access$getRootLookaheadCoords(SharedBoundsNode sharedBoundsNode0) {
        return sharedBoundsNode0.n.getSharedElement().getScope().getLookaheadRoot$animation_release();
    }

    public static final SharedElement access$getSharedElement(SharedBoundsNode sharedBoundsNode0) {
        return sharedBoundsNode0.n.getSharedElement();
    }

    public static final LayoutCoordinates access$requireLookaheadLayoutCoordinates(SharedBoundsNode sharedBoundsNode0) {
        return sharedBoundsNode0.n.getSharedElement().getScope().toLookaheadCoordinates(DelegatableNodeKt.requireLayoutCoordinates(sharedBoundsNode0));
    }

    public static final void access$updateCurrentBounds(SharedBoundsNode sharedBoundsNode0, LayoutCoordinates layoutCoordinates0) {
        sharedBoundsNode0.n.getSharedElement().setCurrentBounds(RectKt.Rect-tz77jQw(sharedBoundsNode0.n.getSharedElement().getScope().getRoot$animation_release().localPositionOf-R5De75A(layoutCoordinates0, 0L), SizeKt.Size(IntSize.getWidth-impl(layoutCoordinates0.getSize-YbymL2g()), IntSize.getHeight-impl(layoutCoordinates0.getSize-YbymL2g()))));
    }

    @Override  // androidx.compose.ui.layout.ApproachLayoutModifierNode
    @NotNull
    public MeasureResult approachMeasure-3p2s80s(@NotNull ApproachMeasureScope approachMeasureScope0, @NotNull Measurable measurable0, long v) {
        if(this.n.getSharedElement().getFoundMatch()) {
            Rect rect0 = this.n.getBoundsAnimation().getValue();
            if(rect0 == null) {
                rect0 = this.n.getSharedElement().getCurrentBounds();
            }
            if(rect0 != null) {
                long v1 = IntSizeKt.roundToIntSize-uvyYCjk(rect0.getSize-NH-jbRc());
                int v2 = IntSize.getWidth-impl(v1);
                int v3 = IntSize.getHeight-impl(v1);
                if(v2 == 0x7FFFFFFF || v3 == 0x7FFFFFFF) {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + this.n.getBoundsAnimation().getValue() + ", current bounds: " + this.n.getSharedElement().getCurrentBounds()).toString());
                }
                v = Constraints.Companion.fixed-JhjzzOo(c.coerceAtLeast(v2, 0), c.coerceAtLeast(v3, 0));
            }
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        long v4 = this.n.getPlaceHolderSize().calculateSize-JyjRU_E(this.n.getSharedElement().getScope().toLookaheadCoordinates(DelegatableNodeKt.requireLayoutCoordinates(this)).getSize-YbymL2g(), IntSizeKt.IntSize(placeable0.getWidth(), placeable0.getHeight()));
        return MeasureScope.layout$default(approachMeasureScope0, IntSize.getWidth-impl(v4), IntSize.getHeight-impl(v4), null, new g1(this, placeable0), 4, null);
    }

    public final void b(GraphicsLayer graphicsLayer0) {
        if(graphicsLayer0 == null) {
            GraphicsLayer graphicsLayer1 = this.o;
            if(graphicsLayer1 != null) {
                DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer1);
            }
        }
        else {
            this.n.setLayer(graphicsLayer0);
        }
        this.o = graphicsLayer0;
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        SharedElementInternalState sharedElementInternalState0 = this.n;
        OverlayClip sharedTransitionScope$OverlayClip0 = sharedElementInternalState0.getOverlayClip();
        SharedContentState sharedTransitionScope$SharedContentState0 = this.n.getUserState();
        Rect rect0 = this.n.getSharedElement().getCurrentBounds();
        Intrinsics.checkNotNull(rect0);
        sharedElementInternalState0.setClipPathInOverlay$animation_release(sharedTransitionScope$OverlayClip0.getClipPath(sharedTransitionScope$SharedContentState0, rect0, contentDrawScope0.getLayoutDirection(), DelegatableNodeKt.requireDensity(this)));
        GraphicsLayer graphicsLayer0 = this.n.getLayer();
        if(graphicsLayer0 == null) {
            throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + this.n.getSharedElement().getKey() + ",target: " + this.n.getBoundsAnimation().getTarget() + ", is attached: " + this.isAttached()).toString());
        }
        DrawScope.record-JVtK1S4$default(contentDrawScope0, graphicsLayer0, 0L, new c1(contentDrawScope0), 1, null);
        if(this.n.getShouldRenderInPlace()) {
            GraphicsLayerKt.drawLayer(contentDrawScope0, graphicsLayer0);
        }
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @NotNull
    public ModifierLocalMap getProvidedValues() {
        return this.p;
    }

    @NotNull
    public final SharedElementInternalState getState() {
        return this.n;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean isMeasurementApproachInProgress-ozmzZPI(long v) {
        return this.n.getSharedElement().getFoundMatch() && this.n.getSharedElement().getScope().isTransitionActive();
    }

    @Override  // androidx.compose.ui.layout.ApproachLayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new d1(placeable0, this, SizeKt.Size(placeable0.getWidth(), placeable0.getHeight())), 4, null);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        super.onAttach();
        this.provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), this.n);
        this.n.setParentState(((SharedElementInternalState)this.getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState())));
        this.b(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.n.setLookaheadCoords(new e1(this, 0));
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        super.onDetach();
        this.b(null);
        this.n.setParentState(null);
        this.n.setLookaheadCoords(f1.x);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onReset() {
        super.onReset();
        GraphicsLayer graphicsLayer0 = this.o;
        if(graphicsLayer0 != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer0);
        }
        this.b(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
    }

    public final void setState$animation_release(@NotNull SharedElementInternalState sharedElementInternalState0) {
        if(!Intrinsics.areEqual(sharedElementInternalState0, this.n)) {
            this.n = sharedElementInternalState0;
            if(this.isAttached()) {
                this.provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState0);
                this.n.setParentState(((SharedElementInternalState)this.getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState())));
                this.n.setLayer(this.o);
                this.n.setLookaheadCoords(new e1(this, 1));
            }
        }
    }
}

