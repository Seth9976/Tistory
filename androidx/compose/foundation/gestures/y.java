package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import qd.a;
import y0.y0;
import z.f2;
import z.g2;
import z.i2;
import z.k2;
import z.m2;

public final class y extends DragGestureNode implements FocusPropertiesModifierNode, KeyInputModifierNode, ObserverModifierNode, SemanticsModifierNode {
    public final ScrollableContainerNode A;
    public final DefaultFlingBehavior B;
    public final ScrollingLogic C;
    public final f2 D;
    public final ContentInViewNode E;
    public ScrollConfig F;
    public b1 G;
    public m2 H;
    public OverscrollEffect x;
    public FlingBehavior y;
    public final NestedScrollDispatcher z;

    public y(OverscrollEffect overscrollEffect0, BringIntoViewSpec bringIntoViewSpec0, FlingBehavior flingBehavior0, Orientation orientation0, ScrollableState scrollableState0, MutableInteractionSource mutableInteractionSource0, boolean z, boolean z1) {
        super(ScrollableKt.a, z, mutableInteractionSource0, orientation0);
        this.x = overscrollEffect0;
        this.y = flingBehavior0;
        NestedScrollDispatcher nestedScrollDispatcher0 = new NestedScrollDispatcher();
        this.z = nestedScrollDispatcher0;
        this.A = (ScrollableContainerNode)this.delegate(new ScrollableContainerNode(z));
        DefaultFlingBehavior defaultFlingBehavior0 = new DefaultFlingBehavior(SplineBasedDecayKt.splineBasedDecay(ScrollableKt.d), null, 2, null);
        this.B = defaultFlingBehavior0;
        OverscrollEffect overscrollEffect1 = this.x;
        FlingBehavior flingBehavior1 = this.y;
        FlingBehavior flingBehavior2 = flingBehavior1 == null ? defaultFlingBehavior0 : flingBehavior1;
        ScrollingLogic scrollingLogic0 = new ScrollingLogic(scrollableState0, overscrollEffect1, flingBehavior2, orientation0, z1, nestedScrollDispatcher0);
        this.C = scrollingLogic0;
        f2 f20 = new f2(scrollingLogic0, z);
        this.D = f20;
        ContentInViewNode contentInViewNode0 = (ContentInViewNode)this.delegate(new ContentInViewNode(orientation0, scrollingLogic0, z1, bringIntoViewSpec0));
        this.E = contentInViewNode0;
        this.delegate(NestedScrollNodeKt.nestedScrollModifierNode(f20, nestedScrollDispatcher0));
        this.delegate(FocusTargetModifierNodeKt.FocusTargetModifierNode());
        this.delegate(new BringIntoViewResponderNode(contentInViewNode0));
        this.delegate(new FocusedBoundsObserverNode(new y0(this, 3)));
    }

    @Override  // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(FocusProperties focusProperties0) {
        focusProperties0.setCanFocus(false);
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        if(this.getEnabled() && (this.G == null || this.H == null)) {
            this.G = new b1(this, 23);
            this.H = new m2(this, null);
        }
        b1 b10 = this.G;
        if(b10 != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver0, null, b10, 1, null);
        }
        m2 m20 = this.H;
        if(m20 != null) {
            SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver0, m20);
        }
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public final Object drag(Function2 function20, Continuation continuation0) {
        x x0 = new x(this.C, null, function20);
        Object object0 = this.C.scroll(MutatePriority.UserInput, x0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        ObserverModifierNodeKt.observeReads(this, new w1.a(this, 8));
        this.F = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStarted-k-4lQ0M(long v) {
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped-TH1AsA0(long v) {
        BuildersKt.launch$default(this.z.getCoroutineScope(), null, null, new g2(this, v, null), 3, null);
    }

    @Override  // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean onKeyEvent-ZmokQxo(KeyEvent keyEvent0) {
        long v1;
        if(this.getEnabled() && ((Key.equals-impl0(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0), 0x5D00000000L) || Key.equals-impl0(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0), 0x5C00000000L)) && KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 2) && !KeyEvent_androidKt.isCtrlPressed-ZmokQxo(keyEvent0))) {
            ContentInViewNode contentInViewNode0 = this.E;
            if(this.C.isVertical()) {
                int v = IntSize.getHeight-impl(contentInViewNode0.getViewportSize-YbymL2g$foundation_release());
                v1 = OffsetKt.Offset(0.0f, (Key.equals-impl0(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0), 0x5C00000000L) ? ((float)v) : -((float)v)));
            }
            else {
                int v2 = IntSize.getWidth-impl(contentInViewNode0.getViewportSize-YbymL2g$foundation_release());
                v1 = OffsetKt.Offset((Key.equals-impl0(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0), 0x5C00000000L) ? ((float)v2) : -((float)v2)), 0.0f);
            }
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new i2(this, v1, null), 3, null);
            return true;
        }
        return false;
    }

    @Override  // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new w1.a(this, 8));
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public final void onPointerEvent-H0pRuoY(PointerEvent pointerEvent0, PointerEventPass pointerEventPass0, long v) {
        List list0 = pointerEvent0.getChanges();
        int v1 = list0.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            if(((Boolean)this.getCanDrag().invoke(((PointerInputChange)list0.get(v3)))).booleanValue()) {
                super.onPointerEvent-H0pRuoY(pointerEvent0, pointerEventPass0, v);
                break;
            }
        }
        if(pointerEventPass0 == PointerEventPass.Main && PointerEventType.equals-impl0(pointerEvent0.getType-7fucELk(), 6)) {
            List list1 = pointerEvent0.getChanges();
            int v4 = list1.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                if(((PointerInputChange)list1.get(v5)).isConsumed()) {
                    return;
                }
            }
            ScrollConfig scrollConfig0 = this.F;
            Intrinsics.checkNotNull(scrollConfig0);
            long v6 = scrollConfig0.calculateMouseWheelScroll-8xgXZGE(DelegatableNodeKt.requireDensity(this), pointerEvent0, v);
            BuildersKt.launch$default(this.getCoroutineScope(), null, null, new k2(this, v6, null), 3, null);
            List list2 = pointerEvent0.getChanges();
            int v7 = list2.size();
            for(int v2 = 0; v2 < v7; ++v2) {
                ((PointerInputChange)list2.get(v2)).consume();
            }
        }
    }

    @Override  // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean onPreKeyEvent-ZmokQxo(KeyEvent keyEvent0) {
        return false;
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean startDragImmediately() {
        return this.C.shouldScrollImmediately();
    }
}

