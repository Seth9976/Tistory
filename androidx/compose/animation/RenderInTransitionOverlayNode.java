package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.b1;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:BA\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u001A\u0010\u000F\u001A\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\u000B¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001A\u00020\u0013*\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER(\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R6\u0010\u000F\u001A\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\u000B8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R+\u0010\n\u001A\u00020\t2\u0006\u0010+\u001A\u00020\t8F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R\u0013\u00105\u001A\u0004\u0018\u0001028F¢\u0006\u0006\u001A\u0004\b3\u00104R\u0013\u00109\u001A\u0004\u0018\u0001068F¢\u0006\u0006\u001A\u0004\b7\u00108¨\u0006;"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "sharedScope", "Lkotlin/Function0;", "", "renderInOverlay", "", "zIndexInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "clipInOverlay", "<init>", "(Landroidx/compose/animation/SharedTransitionScopeImpl;Lkotlin/jvm/functions/Function0;FLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "onAttach", "()V", "onDetach", "n", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "getSharedScope", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "setSharedScope", "(Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "o", "Lkotlin/jvm/functions/Function0;", "getRenderInOverlay", "()Lkotlin/jvm/functions/Function0;", "setRenderInOverlay", "(Lkotlin/jvm/functions/Function0;)V", "p", "Lkotlin/jvm/functions/Function2;", "getClipInOverlay", "()Lkotlin/jvm/functions/Function2;", "setClipInOverlay", "(Lkotlin/jvm/functions/Function2;)V", "<set-?>", "q", "Landroidx/compose/runtime/MutableFloatState;", "getZIndexInOverlay", "()F", "setZIndexInOverlay", "(F)V", "Landroidx/compose/animation/SharedElementInternalState;", "getParentState", "()Landroidx/compose/animation/SharedElementInternalState;", "parentState", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "s/b1", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,157:1\n76#2:158\n109#2,2:159\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n*L\n91#1:158\n91#1:159,2\n*E\n"})
public final class RenderInTransitionOverlayNode extends Node implements ModifierLocalModifierNode, DrawModifierNode {
    public static final int $stable = 8;
    public SharedTransitionScopeImpl n;
    public Function0 o;
    public Function2 p;
    public final MutableFloatState q;
    public b1 r;

    public RenderInTransitionOverlayNode(@NotNull SharedTransitionScopeImpl sharedTransitionScopeImpl0, @NotNull Function0 function00, float f, @NotNull Function2 function20) {
        this.n = sharedTransitionScopeImpl0;
        this.o = function00;
        this.p = function20;
        this.q = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        GraphicsLayer graphicsLayer0 = this.getLayer();
        if(graphicsLayer0 == null) {
            throw new IllegalArgumentException("Error: layer never initialized");
        }
        DrawScope.record-JVtK1S4$default(contentDrawScope0, graphicsLayer0, 0L, new b0(contentDrawScope0, 29), 1, null);
        if(!((Boolean)this.o.invoke()).booleanValue()) {
            GraphicsLayerKt.drawLayer(contentDrawScope0, graphicsLayer0);
        }
    }

    @NotNull
    public final Function2 getClipInOverlay() {
        return this.p;
    }

    @Nullable
    public final GraphicsLayer getLayer() {
        return this.r == null ? null : this.r.a;
    }

    @Nullable
    public final SharedElementInternalState getParentState() {
        return (SharedElementInternalState)this.getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState());
    }

    @NotNull
    public final Function0 getRenderInOverlay() {
        return this.o;
    }

    @NotNull
    public final SharedTransitionScopeImpl getSharedScope() {
        return this.n;
    }

    public final float getZIndexInOverlay() {
        return this.q.getFloatValue();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        b1 b10 = new b1(this, DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.n.onLayerRendererCreated$animation_release(b10);
        this.r = b10;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        b1 b10 = this.r;
        if(b10 != null) {
            this.n.onLayerRendererRemoved$animation_release(b10);
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(b10.a);
        }
    }

    public final void setClipInOverlay(@NotNull Function2 function20) {
        this.p = function20;
    }

    public final void setRenderInOverlay(@NotNull Function0 function00) {
        this.o = function00;
    }

    public final void setSharedScope(@NotNull SharedTransitionScopeImpl sharedTransitionScopeImpl0) {
        this.n = sharedTransitionScopeImpl0;
    }

    public final void setZIndexInOverlay(float f) {
        this.q.setFloatValue(f);
    }
}

