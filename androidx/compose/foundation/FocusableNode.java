package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.FocusInteraction.Unfocus;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.BuildersKt;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.s1;
import u.t1;
import u.u1;
import u.v1;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0011\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\n2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000B\u0010\tJ\u0017\u0010\u000E\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0013\u0010\u0011\u001A\u00020\n*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0018\u001A\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "", "update", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FocusableNode extends DelegatingNode implements FocusEventModifierNode, FocusRequesterModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    public FocusState p;
    public final s1 q;
    public final v1 r;
    public final FocusedBoundsNode s;

    public FocusableNode(@Nullable MutableInteractionSource mutableInteractionSource0) {
        s1 s10 = new s1();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        s10.n = mutableInteractionSource0;
        this.q = (s1)this.delegate(s10);
        this.r = (v1)this.delegate(new v1());  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        this.s = (FocusedBoundsNode)this.delegate(new FocusedBoundsNode());
        this.delegate(FocusTargetModifierNodeKt.FocusTargetModifierNode());
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver0, this.p != null && this.p.isFocused());
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver0, null, new e(this, 25), 1, null);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@NotNull FocusState focusState0) {
        if(!Intrinsics.areEqual(this.p, focusState0)) {
            boolean z = focusState0.isFocused();
            PinnedHandle pinnableContainer$PinnedHandle0 = null;
            if(z) {
                BuildersKt.launch$default(this.getCoroutineScope(), null, null, new t1(this, null), 3, null);
            }
            if(this.isAttached()) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            s1 s10 = this.q;
            MutableInteractionSource mutableInteractionSource0 = s10.n;
            if(mutableInteractionSource0 != null) {
                if(z) {
                    Focus focusInteraction$Focus0 = s10.o;
                    if(focusInteraction$Focus0 != null) {
                        s10.b(mutableInteractionSource0, new Unfocus(focusInteraction$Focus0));
                        s10.o = null;
                    }
                    Focus focusInteraction$Focus1 = new Focus();
                    s10.b(mutableInteractionSource0, focusInteraction$Focus1);
                    s10.o = focusInteraction$Focus1;
                }
                else {
                    Focus focusInteraction$Focus2 = s10.o;
                    if(focusInteraction$Focus2 != null) {
                        s10.b(mutableInteractionSource0, new Unfocus(focusInteraction$Focus2));
                        s10.o = null;
                    }
                }
            }
            this.s.setFocus(z);
            v1 v10 = this.r;
            if(z) {
                v10.getClass();
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ObserverModifierNodeKt.observeReads(v10, new u1(ref$ObjectRef0, v10));
                PinnableContainer pinnableContainer0 = (PinnableContainer)ref$ObjectRef0.element;
                if(pinnableContainer0 != null) {
                    pinnableContainer$PinnedHandle0 = pinnableContainer0.pin();
                }
                v10.n = pinnableContainer$PinnedHandle0;
            }
            else {
                PinnedHandle pinnableContainer$PinnedHandle1 = v10.n;
                if(pinnableContainer$PinnedHandle1 != null) {
                    pinnableContainer$PinnedHandle1.release();
                }
                v10.n = null;
            }
            v10.o = z;
            this.p = focusState0;
        }
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.s.onGloballyPositioned(layoutCoordinates0);
    }

    public final void update(@Nullable MutableInteractionSource mutableInteractionSource0) {
        s1 s10 = this.q;
        if(!Intrinsics.areEqual(s10.n, mutableInteractionSource0)) {
            MutableInteractionSource mutableInteractionSource1 = s10.n;
            if(mutableInteractionSource1 != null) {
                Focus focusInteraction$Focus0 = s10.o;
                if(focusInteraction$Focus0 != null) {
                    mutableInteractionSource1.tryEmit(new Unfocus(focusInteraction$Focus0));
                }
            }
            s10.o = null;
            s10.n = mutableInteractionSource0;
        }
    }
}

