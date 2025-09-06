package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\t\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001C\u001A\u00020\u0019\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001D\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\u001F\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u001F\u0010\u001EJ\u000F\u0010 \u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b \u0010\u001ER+\u0010\u0011\u001A\u00020\u00102\u0006\u0010!\u001A\u00020\u00108V@VX\u0096\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R+\u0010\r\u001A\u00020\t2\u0006\u0010!\u001A\u00020\t8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R+\u0010\u0004\u001A\u00020\u00032\u0006\u0010!\u001A\u00020\u00038F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b.\u0010)\u001A\u0004\b/\u00100\"\u0004\b1\u00102R+\u0010\u0006\u001A\u00020\u00052\u0006\u0010!\u001A\u00020\u00058F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b3\u0010)\u001A\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010\b\u001A\u00020\u00072\u0006\u0010!\u001A\u00020\u00078F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b8\u0010)\u001A\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010\n\u001A\u00020\t2\u0006\u0010!\u001A\u00020\t8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b=\u0010)\u001A\u0004\b>\u0010+\"\u0004\b?\u0010-R+\u0010\f\u001A\u00020\u000B2\u0006\u0010!\u001A\u00020\u000B8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b@\u0010)\u001A\u0004\bA\u0010B\"\u0004\bC\u0010DR+\u0010\u000F\u001A\u00020\u000E2\u0006\u0010!\u001A\u00020\u000E8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bE\u0010)\u001A\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010Q\u001A\u0004\u0018\u00010J8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bK\u0010L\u001A\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010Z\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010S0R8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bT\u0010U\u001A\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010a\u001A\u0004\u0018\u00010\u00008\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^\"\u0004\b_\u0010`R/\u0010h\u001A\u0004\u0018\u00010b2\b\u0010!\u001A\u0004\u0018\u00010b8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bc\u0010)\u001A\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0017\u0010k\u001A\u00020i8F\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\bj\u0010\u001BR\u0011\u0010m\u001A\u00020\t8F\u00A2\u0006\u0006\u001A\u0004\bl\u0010+R\u0014\u0010o\u001A\u00020\t8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bn\u0010+R\u0011\u0010q\u001A\u00020\t8F\u00A2\u0006\u0006\u001A\u0004\bp\u0010+\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006r"}, d2 = {"Landroidx/compose/animation/SharedElementInternalState;", "Landroidx/compose/animation/LayerRenderer;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/animation/SharedElement;", "sharedElement", "Landroidx/compose/animation/BoundsAnimation;", "boundsAnimation", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "placeHolderSize", "", "renderOnlyWhenVisible", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "overlayClip", "renderInOverlayDuringTransition", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "userState", "", "zIndex", "<init>", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;F)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "", "drawInOverlay", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/ui/geometry/Offset;", "calculateLookaheadOffset-F1C5BW0", "()J", "calculateLookaheadOffset", "onRemembered", "()V", "onForgotten", "onAbandoned", "<set-?>", "a", "Landroidx/compose/runtime/MutableFloatState;", "getZIndex", "()F", "setZIndex", "(F)V", "b", "Landroidx/compose/runtime/MutableState;", "getRenderInOverlayDuringTransition", "()Z", "setRenderInOverlayDuringTransition", "(Z)V", "c", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "setSharedElement", "(Landroidx/compose/animation/SharedElement;)V", "d", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "setBoundsAnimation", "(Landroidx/compose/animation/BoundsAnimation;)V", "e", "getPlaceHolderSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "setPlaceHolderSize", "(Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;)V", "f", "getRenderOnlyWhenVisible", "setRenderOnlyWhenVisible", "g", "getOverlayClip", "()Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "setOverlayClip", "(Landroidx/compose/animation/SharedTransitionScope$OverlayClip;)V", "h", "getUserState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "setUserState", "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;)V", "Landroidx/compose/ui/graphics/Path;", "i", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay$animation_release", "()Landroidx/compose/ui/graphics/Path;", "setClipPathInOverlay$animation_release", "(Landroidx/compose/ui/graphics/Path;)V", "clipPathInOverlay", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "j", "Lkotlin/jvm/functions/Function0;", "getLookaheadCoords", "()Lkotlin/jvm/functions/Function0;", "setLookaheadCoords", "(Lkotlin/jvm/functions/Function0;)V", "lookaheadCoords", "k", "Landroidx/compose/animation/SharedElementInternalState;", "getParentState", "()Landroidx/compose/animation/SharedElementInternalState;", "setParentState", "(Landroidx/compose/animation/SharedElementInternalState;)V", "parentState", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "l", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "layer", "Landroidx/compose/ui/geometry/Size;", "getNonNullLookaheadSize-NH-jbRc", "nonNullLookaheadSize", "getTarget", "target", "getShouldRenderInOverlay$animation_release", "shouldRenderInOverlay", "getShouldRenderInPlace", "shouldRenderInPlace", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,254:1\n76#2:255\n109#2,2:256\n81#3:258\n107#3,2:259\n81#3:261\n107#3,2:262\n81#3:264\n107#3,2:265\n81#3:267\n107#3,2:268\n81#3:270\n107#3,2:271\n81#3:273\n107#3,2:274\n81#3:276\n107#3,2:277\n81#3:315\n107#3,2:316\n70#4,4:279\n244#5,5:283\n272#5,9:288\n128#5,7:297\n282#5,4:304\n128#5,7:308\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n*L\n180#1:255\n180#1:256,2\n182#1:258\n182#1:259,2\n183#1:261\n183#1:262,2\n184#1:264\n184#1:265,2\n185#1:267\n185#1:268,2\n186#1:270\n186#1:271,2\n187#1:273\n187#1:274,2\n188#1:276\n188#1:277,2\n230#1:315\n230#1:316,2\n199#1:279,4\n201#1:283,5\n201#1:288,9\n202#1:297,7\n201#1:304,4\n206#1:308,7\n*E\n"})
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {
    public static final int $stable = 8;
    public final MutableFloatState a;
    public final MutableState b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public final MutableState h;
    public Path i;
    public Function0 j;
    public SharedElementInternalState k;
    public final MutableState l;

    public SharedElementInternalState(@NotNull SharedElement sharedElement0, @NotNull BoundsAnimation boundsAnimation0, @NotNull PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z, @NotNull OverlayClip sharedTransitionScope$OverlayClip0, boolean z1, @NotNull SharedContentState sharedTransitionScope$SharedContentState0, float f) {
        this.a = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.b = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z1), null, 2, null);
        this.c = SnapshotStateKt.mutableStateOf$default(sharedElement0, null, 2, null);
        this.d = SnapshotStateKt.mutableStateOf$default(boundsAnimation0, null, 2, null);
        this.e = SnapshotStateKt.mutableStateOf$default(sharedTransitionScope$PlaceHolderSize0, null, 2, null);
        this.f = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.g = SnapshotStateKt.mutableStateOf$default(sharedTransitionScope$OverlayClip0, null, 2, null);
        this.h = SnapshotStateKt.mutableStateOf$default(sharedTransitionScope$SharedContentState0, null, 2, null);
        this.j = o.w;
        this.l = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final long calculateLookaheadOffset-F1C5BW0() {
        Object object0 = this.j.invoke();
        if(object0 == null) {
            throw new IllegalArgumentException("Error: lookahead coordinates is null.");
        }
        return this.getSharedElement().getScope().getLookaheadRoot$animation_release().localPositionOf-R5De75A(((LayoutCoordinates)object0), 0L);
    }

    @Override  // androidx.compose.animation.LayerRenderer
    public void drawInOverlay(@NotNull DrawScope drawScope0) {
        GraphicsLayer graphicsLayer0 = this.getLayer();
        if(graphicsLayer0 == null) {
            return;
        }
        if(this.getShouldRenderInOverlay$animation_release()) {
            if(this.getSharedElement().getCurrentBounds() == null) {
                throw new IllegalArgumentException("Error: current bounds not set yet.");
            }
            Rect rect0 = this.getSharedElement().getCurrentBounds();
            Unit unit0 = null;
            Offset offset0 = rect0 == null ? null : Offset.box-impl(rect0.getTopLeft-F1C5BW0());
            Intrinsics.checkNotNull(offset0);
            long v = offset0.unbox-impl();
            float f = Offset.getX-impl(v);
            float f1 = Offset.getY-impl(v);
            Path path0 = this.i;
            if(path0 != null) {
                DrawContext drawContext0 = drawScope0.getDrawContext();
                long v1 = drawContext0.getSize-NH-jbRc();
                drawContext0.getCanvas().save();
                try {
                    drawContext0.getTransform().clipPath-mtrdD-E(path0, 1);
                    drawScope0.getDrawContext().getTransform().translate(f, f1);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope0, graphicsLayer0);
                    }
                    catch(Throwable throwable0) {
                        drawScope0.getDrawContext().getTransform().translate(-f, -f1);
                        throw throwable0;
                    }
                    drawScope0.getDrawContext().getTransform().translate(-f, -f1);
                }
                finally {
                    a.y(drawContext0, v1);
                }
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                drawScope0.getDrawContext().getTransform().translate(f, f1);
                try {
                    GraphicsLayerKt.drawLayer(drawScope0, graphicsLayer0);
                }
                finally {
                    drawScope0.getDrawContext().getTransform().translate(-f, -f1);
                }
            }
        }
    }

    @NotNull
    public final BoundsAnimation getBoundsAnimation() {
        return (BoundsAnimation)this.d.getValue();
    }

    @Nullable
    public final Path getClipPathInOverlay$animation_release() {
        return this.i;
    }

    @Nullable
    public final GraphicsLayer getLayer() {
        return (GraphicsLayer)this.l.getValue();
    }

    @NotNull
    public final Function0 getLookaheadCoords() {
        return this.j;
    }

    public final long getNonNullLookaheadSize-NH-jbRc() {
        Object object0 = this.j.invoke();
        if(object0 == null) {
            throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + this.getSharedElement().getKey() + '.').toString());
        }
        return IntSizeKt.toSize-ozmzZPI(((LayoutCoordinates)object0).getSize-YbymL2g());
    }

    @NotNull
    public final OverlayClip getOverlayClip() {
        return (OverlayClip)this.g.getValue();
    }

    @Override  // androidx.compose.animation.LayerRenderer
    @Nullable
    public SharedElementInternalState getParentState() {
        return this.k;
    }

    @NotNull
    public final PlaceHolderSize getPlaceHolderSize() {
        return (PlaceHolderSize)this.e.getValue();
    }

    public final boolean getRenderInOverlayDuringTransition() {
        return ((Boolean)this.b.getValue()).booleanValue();
    }

    public final boolean getRenderOnlyWhenVisible() {
        return ((Boolean)this.f.getValue()).booleanValue();
    }

    @NotNull
    public final SharedElement getSharedElement() {
        return (SharedElement)this.c.getValue();
    }

    // 去混淆评级： 低(40)
    public final boolean getShouldRenderInOverlay$animation_release() {
        return (Intrinsics.areEqual(this.getSharedElement().getTargetBoundsProvider$animation_release(), this) || !this.getRenderOnlyWhenVisible()) && this.getSharedElement().getFoundMatch() && this.getRenderInOverlayDuringTransition();
    }

    // 去混淆评级： 低(40)
    public final boolean getShouldRenderInPlace() {
        return !this.getSharedElement().getFoundMatch() || !this.getShouldRenderInOverlay$animation_release() && (Intrinsics.areEqual(this.getSharedElement().getTargetBoundsProvider$animation_release(), this) || !this.getRenderOnlyWhenVisible());
    }

    public final boolean getTarget() {
        return this.getBoundsAnimation().getTarget();
    }

    @NotNull
    public final SharedContentState getUserState() {
        return (SharedContentState)this.h.getValue();
    }

    @Override  // androidx.compose.animation.LayerRenderer
    public float getZIndex() {
        return this.a.getFloatValue();
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.getSharedElement().getScope().onStateRemoved$animation_release(this);
        this.getSharedElement().updateTargetBoundsProvider();
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.getSharedElement().getScope().onStateAdded$animation_release(this);
        this.getSharedElement().updateTargetBoundsProvider();
    }

    public final void setBoundsAnimation(@NotNull BoundsAnimation boundsAnimation0) {
        this.d.setValue(boundsAnimation0);
    }

    public final void setClipPathInOverlay$animation_release(@Nullable Path path0) {
        this.i = path0;
    }

    public final void setLayer(@Nullable GraphicsLayer graphicsLayer0) {
        this.l.setValue(graphicsLayer0);
    }

    public final void setLookaheadCoords(@NotNull Function0 function00) {
        this.j = function00;
    }

    public final void setOverlayClip(@NotNull OverlayClip sharedTransitionScope$OverlayClip0) {
        this.g.setValue(sharedTransitionScope$OverlayClip0);
    }

    public void setParentState(@Nullable SharedElementInternalState sharedElementInternalState0) {
        this.k = sharedElementInternalState0;
    }

    public final void setPlaceHolderSize(@NotNull PlaceHolderSize sharedTransitionScope$PlaceHolderSize0) {
        this.e.setValue(sharedTransitionScope$PlaceHolderSize0);
    }

    public final void setRenderInOverlayDuringTransition(boolean z) {
        this.b.setValue(Boolean.valueOf(z));
    }

    public final void setRenderOnlyWhenVisible(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void setSharedElement(@NotNull SharedElement sharedElement0) {
        this.c.setValue(sharedElement0);
    }

    public final void setUserState(@NotNull SharedContentState sharedTransitionScope$SharedContentState0) {
        this.h.setValue(sharedTransitionScope$SharedContentState0);
    }

    public void setZIndex(float f) {
        this.a.setFloatValue(f);
    }
}

