package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u0013\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u001A\u0010\u000E\u001A\u0016\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001C\u001A\u00020\u00062\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u0096\u0002\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0013\u0010\u001F\u001A\u00020\u0014*\u00020\u001EH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J$\u0010\'\u001A\u0016\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(JR\u0010)\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001A\u00020\b2\u001C\b\u0002\u0010\u000E\u001A\u0016\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u00C6\u0001\u00A2\u0006\u0004\b)\u0010*J\u0010\u0010,\u001A\u00020+H\u00D6\u0001\u00A2\u0006\u0004\b,\u0010-R\"\u0010\u0004\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\"\"\u0004\b1\u00102R(\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u0010$\"\u0004\b6\u00107R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010&R+\u0010\u000E\u001A\u0016\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n8\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010(\u00A8\u0006>"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/RenderInTransitionOverlayNode;", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "sharedTransitionScope", "Lkotlin/Function0;", "", "renderInOverlay", "", "zIndexInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "clipInOverlay", "<init>", "(Landroidx/compose/animation/SharedTransitionScopeImpl;Lkotlin/jvm/functions/Function0;FLkotlin/jvm/functions/Function2;)V", "create", "()Landroidx/compose/animation/RenderInTransitionOverlayNode;", "node", "", "update", "(Landroidx/compose/animation/RenderInTransitionOverlayNode;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "component2", "()Lkotlin/jvm/functions/Function0;", "component3", "()F", "component4", "()Lkotlin/jvm/functions/Function2;", "copy", "(Landroidx/compose/animation/SharedTransitionScopeImpl;Lkotlin/jvm/functions/Function0;FLkotlin/jvm/functions/Function2;)Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;", "", "toString", "()Ljava/lang/String;", "b", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "getSharedTransitionScope", "setSharedTransitionScope", "(Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "c", "Lkotlin/jvm/functions/Function0;", "getRenderInOverlay", "setRenderInOverlay", "(Lkotlin/jvm/functions/Function0;)V", "d", "F", "getZIndexInOverlay", "e", "Lkotlin/jvm/functions/Function2;", "getClipInOverlay", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RenderInTransitionOverlayNodeElement extends ModifierNodeElement {
    public static final int $stable;
    public SharedTransitionScopeImpl b;
    public Function0 c;
    public final float d;
    public final Function2 e;

    public RenderInTransitionOverlayNodeElement(@NotNull SharedTransitionScopeImpl sharedTransitionScopeImpl0, @NotNull Function0 function00, float f, @NotNull Function2 function20) {
        this.b = sharedTransitionScopeImpl0;
        this.c = function00;
        this.d = f;
        this.e = function20;
    }

    @NotNull
    public final SharedTransitionScopeImpl component1() {
        return this.b;
    }

    @NotNull
    public final Function0 component2() {
        return this.c;
    }

    public final float component3() {
        return this.d;
    }

    @NotNull
    public final Function2 component4() {
        return this.e;
    }

    @NotNull
    public final RenderInTransitionOverlayNodeElement copy(@NotNull SharedTransitionScopeImpl sharedTransitionScopeImpl0, @NotNull Function0 function00, float f, @NotNull Function2 function20) {
        return new RenderInTransitionOverlayNodeElement(sharedTransitionScopeImpl0, function00, f, function20);
    }

    public static RenderInTransitionOverlayNodeElement copy$default(RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement0, SharedTransitionScopeImpl sharedTransitionScopeImpl0, Function0 function00, float f, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            sharedTransitionScopeImpl0 = renderInTransitionOverlayNodeElement0.b;
        }
        if((v & 2) != 0) {
            function00 = renderInTransitionOverlayNodeElement0.c;
        }
        if((v & 4) != 0) {
            f = renderInTransitionOverlayNodeElement0.d;
        }
        if((v & 8) != 0) {
            function20 = renderInTransitionOverlayNodeElement0.e;
        }
        return renderInTransitionOverlayNodeElement0.copy(sharedTransitionScopeImpl0, function00, f, function20);
    }

    @NotNull
    public RenderInTransitionOverlayNode create() {
        return new RenderInTransitionOverlayNode(this.b, this.c, this.d, this.e);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof RenderInTransitionOverlayNodeElement && Intrinsics.areEqual(this.b, ((RenderInTransitionOverlayNodeElement)object0).b) && this.c == ((RenderInTransitionOverlayNodeElement)object0).c && this.d == ((RenderInTransitionOverlayNodeElement)object0).d && this.e == ((RenderInTransitionOverlayNodeElement)object0).e;
    }

    @NotNull
    public final Function2 getClipInOverlay() {
        return this.e;
    }

    @NotNull
    public final Function0 getRenderInOverlay() {
        return this.c;
    }

    @NotNull
    public final SharedTransitionScopeImpl getSharedTransitionScope() {
        return this.b;
    }

    public final float getZIndexInOverlay() {
        return this.d;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.e.hashCode() + a.b(this.d, a.g(this.c, this.b.hashCode() * 0x1F, 0x1F), 0x1F);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("renderInSharedTransitionOverlay");
        inspectorInfo0.getProperties().set("sharedTransitionScope", this.b);
        inspectorInfo0.getProperties().set("renderInOverlay", this.c);
        inspectorInfo0.getProperties().set("zIndexInOverlay", this.d);
        inspectorInfo0.getProperties().set("clipInOverlayDuringTransition", this.e);
    }

    public final void setRenderInOverlay(@NotNull Function0 function00) {
        this.c = function00;
    }

    public final void setSharedTransitionScope(@NotNull SharedTransitionScopeImpl sharedTransitionScopeImpl0) {
        this.b = sharedTransitionScopeImpl0;
    }

    @Override
    @NotNull
    public String toString() {
        return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=" + this.b + ", renderInOverlay=" + this.c + ", zIndexInOverlay=" + this.d + ", clipInOverlay=" + this.e + ')';
    }

    public void update(@NotNull RenderInTransitionOverlayNode renderInTransitionOverlayNode0) {
        renderInTransitionOverlayNode0.setSharedScope(this.b);
        renderInTransitionOverlayNode0.setRenderInOverlay(this.c);
        renderInTransitionOverlayNode0.setZIndexInOverlay(this.d);
        renderInTransitionOverlayNode0.setClipInOverlay(this.e);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((RenderInTransitionOverlayNode)modifier$Node0));
    }
}

