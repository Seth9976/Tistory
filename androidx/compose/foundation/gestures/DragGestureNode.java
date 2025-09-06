package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction.Cancel;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.DragInteraction.Stop;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import y0.y0;
import z.f1;
import z.g1;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJO\u0010\u0018\u001A\u00020\u00142=\u0010\u0017\u001A9\b\u0001\u0012\u001F\u0012\u001D\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000FH\u00A6@\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001E\u001A\u00020\u00142\u0006\u0010\u001B\u001A\u00020\u001AH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010\"\u001A\u00020\u00142\u0006\u0010 \u001A\u00020\u001FH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\u001DJ\u000F\u0010#\u001A\u00020\u0006H&\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010%\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b%\u0010&J*\u0010/\u001A\u00020\u00142\u0006\u0010(\u001A\u00020\'2\u0006\u0010*\u001A\u00020)2\u0006\u0010,\u001A\u00020+H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b-\u0010.J\u000F\u00100\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b0\u0010&J\r\u00101\u001A\u00020\u0014\u00A2\u0006\u0004\b1\u0010&JO\u00103\u001A\u00020\u00142\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\b\u001A\u00020\u00062\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u00102\u001A\u00020\u0006\u00A2\u0006\u0004\b3\u00104R<\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u00105\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0004@BX\u0084\u000E\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R$\u0010\b\u001A\u00020\u00062\u0006\u00105\u001A\u00020\u00068\u0004@BX\u0084\u000E\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010$R(\u0010\n\u001A\u0004\u0018\u00010\t2\b\u00105\u001A\u0004\u0018\u00010\t8\u0004@BX\u0084\u000E\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006A"}, d2 = {"Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "<init>", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "name", "dragDelta", "", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "drag", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "startedPosition", "onDragStarted-k-4lQ0M", "(J)V", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped-TH1AsA0", "onDragStopped", "startDragImmediately", "()Z", "onDetach", "()V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "disposeInteractionSource", "shouldResetPointerInputHandling", "update", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;Z)V", "<set-?>", "q", "Lkotlin/jvm/functions/Function1;", "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "r", "Z", "getEnabled", "s", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DragGestureNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,649:1\n1#2:650\n*E\n"})
public abstract class DragGestureNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, PointerInputModifierNode {
    public static final int $stable = 8;
    public Orientation p;
    public Function1 q;
    public boolean r;
    public MutableInteractionSource s;
    public Channel t;
    public Start u;
    public boolean v;
    public SuspendingPointerInputModifierNode w;

    public DragGestureNode(@NotNull Function1 function10, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Orientation orientation0) {
        this.p = orientation0;
        this.q = function10;
        this.r = z;
        this.s = mutableInteractionSource0;
        new y0(this, 2);
    }

    public static final Object access$processDragCancel(DragGestureNode dragGestureNode0, Continuation continuation0) {
        g1 g10;
        dragGestureNode0.getClass();
        if(continuation0 instanceof g1) {
            g10 = (g1)continuation0;
            int v = g10.r;
            if((v & 0x80000000) == 0) {
                g10 = new g1(dragGestureNode0, continuation0);
            }
            else {
                g10.r = v ^ 0x80000000;
            }
        }
        else {
            g10 = new g1(dragGestureNode0, continuation0);
        }
        Object object0 = g10.p;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(g10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Start dragInteraction$Start0 = dragGestureNode0.u;
                if(dragInteraction$Start0 != null) {
                    MutableInteractionSource mutableInteractionSource0 = dragGestureNode0.s;
                    if(mutableInteractionSource0 != null) {
                        Cancel dragInteraction$Cancel0 = new Cancel(dragInteraction$Start0);
                        g10.o = dragGestureNode0;
                        g10.r = 1;
                        if(mutableInteractionSource0.emit(dragInteraction$Cancel0, g10) == unit0) {
                            return unit0;
                        }
                    }
                    dragGestureNode0.u = null;
                }
                break;
            }
            case 1: {
                dragGestureNode0 = g10.o;
                ResultKt.throwOnFailure(object0);
                dragGestureNode0.u = null;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dragGestureNode0.onDragStopped-TH1AsA0(0L);
        return Unit.INSTANCE;
    }

    public static final Object access$processDragStart(DragGestureNode dragGestureNode0, DragStarted dragEvent$DragStarted0, Continuation continuation0) {
        Start dragInteraction$Start1;
        o o0;
        dragGestureNode0.getClass();
        if(continuation0 instanceof o) {
            o0 = (o)continuation0;
            int v = o0.t;
            if((v & 0x80000000) == 0) {
                o0 = new o(dragGestureNode0, continuation0);
            }
            else {
                o0.t = v ^ 0x80000000;
            }
        }
        else {
            o0 = new o(dragGestureNode0, continuation0);
        }
        Object object0 = o0.r;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(o0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Start dragInteraction$Start0 = dragGestureNode0.u;
                if(dragInteraction$Start0 != null) {
                    MutableInteractionSource mutableInteractionSource0 = dragGestureNode0.s;
                    if(mutableInteractionSource0 != null) {
                        Cancel dragInteraction$Cancel0 = new Cancel(dragInteraction$Start0);
                        o0.o = dragGestureNode0;
                        o0.p = dragEvent$DragStarted0;
                        o0.t = 1;
                        if(mutableInteractionSource0.emit(dragInteraction$Cancel0, o0) == unit0) {
                            return unit0;
                        }
                    }
                }
                goto label_28;
            }
            case 1: {
                dragEvent$DragStarted0 = o0.p;
                dragGestureNode0 = o0.o;
                ResultKt.throwOnFailure(object0);
            label_28:
                dragInteraction$Start1 = new Start();
                MutableInteractionSource mutableInteractionSource1 = dragGestureNode0.s;
                if(mutableInteractionSource1 != null) {
                    o0.o = dragGestureNode0;
                    o0.p = dragEvent$DragStarted0;
                    o0.q = dragInteraction$Start1;
                    o0.t = 2;
                    if(mutableInteractionSource1.emit(dragInteraction$Start1, o0) == unit0) {
                        return unit0;
                    }
                }
                break;
            }
            case 2: {
                Start dragInteraction$Start2 = o0.q;
                dragEvent$DragStarted0 = o0.p;
                DragGestureNode dragGestureNode1 = o0.o;
                ResultKt.throwOnFailure(object0);
                dragInteraction$Start1 = dragInteraction$Start2;
                dragGestureNode0 = dragGestureNode1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dragGestureNode0.u = dragInteraction$Start1;
        dragGestureNode0.onDragStarted-k-4lQ0M(dragEvent$DragStarted0.getStartPoint-F1C5BW0());
        return Unit.INSTANCE;
    }

    public static final Object access$processDragStop(DragGestureNode dragGestureNode0, DragStopped dragEvent$DragStopped0, Continuation continuation0) {
        p p0;
        dragGestureNode0.getClass();
        if(continuation0 instanceof p) {
            p0 = (p)continuation0;
            int v = p0.s;
            if((v & 0x80000000) == 0) {
                p0 = new p(dragGestureNode0, continuation0);
            }
            else {
                p0.s = v ^ 0x80000000;
            }
        }
        else {
            p0 = new p(dragGestureNode0, continuation0);
        }
        Object object0 = p0.q;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(p0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Start dragInteraction$Start0 = dragGestureNode0.u;
                if(dragInteraction$Start0 != null) {
                    MutableInteractionSource mutableInteractionSource0 = dragGestureNode0.s;
                    if(mutableInteractionSource0 != null) {
                        Stop dragInteraction$Stop0 = new Stop(dragInteraction$Start0);
                        p0.o = dragGestureNode0;
                        p0.p = dragEvent$DragStopped0;
                        p0.s = 1;
                        if(mutableInteractionSource0.emit(dragInteraction$Stop0, p0) == unit0) {
                            return unit0;
                        }
                    }
                    dragGestureNode0.u = null;
                }
                break;
            }
            case 1: {
                dragEvent$DragStopped0 = p0.p;
                dragGestureNode0 = p0.o;
                ResultKt.throwOnFailure(object0);
                dragGestureNode0.u = null;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dragGestureNode0.onDragStopped-TH1AsA0(dragEvent$DragStopped0.getVelocity-9UxMQ8M());
        return Unit.INSTANCE;
    }

    public static final void access$startListeningForEvents(DragGestureNode dragGestureNode0) {
        dragGestureNode0.v = true;
        BuildersKt.launch$default(dragGestureNode0.getCoroutineScope(), null, null, new r(dragGestureNode0, null), 3, null);
    }

    public final void disposeInteractionSource() {
        Start dragInteraction$Start0 = this.u;
        if(dragInteraction$Start0 != null) {
            MutableInteractionSource mutableInteractionSource0 = this.s;
            if(mutableInteractionSource0 != null) {
                mutableInteractionSource0.tryEmit(new Cancel(dragInteraction$Start0));
            }
            this.u = null;
        }
    }

    @Nullable
    public abstract Object drag(@NotNull Function2 arg1, @NotNull Continuation arg2);

    @NotNull
    public final Function1 getCanDrag() {
        return this.q;
    }

    public final boolean getEnabled() {
        return this.r;
    }

    @Nullable
    public final MutableInteractionSource getInteractionSource() {
        return this.s;
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode0 = this.w;
        if(suspendingPointerInputModifierNode0 != null) {
            suspendingPointerInputModifierNode0.onCancelPointerInput();
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        this.v = false;
        this.disposeInteractionSource();
    }

    public abstract void onDragStarted-k-4lQ0M(long arg1);

    public abstract void onDragStopped-TH1AsA0(long arg1);

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onPointerEvent-H0pRuoY(@NotNull PointerEvent pointerEvent0, @NotNull PointerEventPass pointerEventPass0, long v) {
        if(this.r && this.w == null) {
            this.w = (SuspendingPointerInputModifierNode)this.delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new f1(this, null)));
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode0 = this.w;
        if(suspendingPointerInputModifierNode0 != null) {
            suspendingPointerInputModifierNode0.onPointerEvent-H0pRuoY(pointerEvent0, pointerEventPass0, v);
        }
    }

    public abstract boolean startDragImmediately();

    public final void update(@NotNull Function1 function10, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Orientation orientation0, boolean z1) {
        this.q = function10;
        boolean z2 = true;
        if(this.r != z) {
            this.r = z;
            if(!z) {
                this.disposeInteractionSource();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode0 = this.w;
                if(suspendingPointerInputModifierNode0 != null) {
                    this.undelegate(suspendingPointerInputModifierNode0);
                }
                this.w = null;
            }
            z1 = true;
        }
        if(!Intrinsics.areEqual(this.s, mutableInteractionSource0)) {
            this.disposeInteractionSource();
            this.s = mutableInteractionSource0;
        }
        if(this.p == orientation0) {
            z2 = z1;
        }
        else {
            this.p = orientation0;
        }
        if(z2) {
            SuspendingPointerInputModifierNode suspendingPointerInputModifierNode1 = this.w;
            if(suspendingPointerInputModifierNode1 != null) {
                suspendingPointerInputModifierNode1.resetPointerInputHandler();
            }
        }
    }

    public static void update$default(DragGestureNode dragGestureNode0, Function1 function10, boolean z, MutableInteractionSource mutableInteractionSource0, Orientation orientation0, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if((v & 1) != 0) {
            function10 = dragGestureNode0.q;
        }
        if((v & 2) != 0) {
            z = dragGestureNode0.r;
        }
        if((v & 4) != 0) {
            mutableInteractionSource0 = dragGestureNode0.s;
        }
        if((v & 8) != 0) {
            orientation0 = dragGestureNode0.p;
        }
        if((v & 16) != 0) {
            z1 = false;
        }
        dragGestureNode0.update(function10, z, mutableInteractionSource0, orientation0, z1);
    }
}

