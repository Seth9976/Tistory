package u;

import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.HoverInteraction.Exit;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import qd.a;

public final class b2 extends Node implements PointerInputModifierNode {
    public MutableInteractionSource n;
    public Enter o;

    public static final Object b(b2 b20, ContinuationImpl continuationImpl0) {
        x1 x10;
        b20.getClass();
        if(continuationImpl0 instanceof x1) {
            x10 = (x1)continuationImpl0;
            int v = x10.s;
            if((v & 0x80000000) == 0) {
                x10 = new x1(b20, continuationImpl0);
            }
            else {
                x10.s = v ^ 0x80000000;
            }
        }
        else {
            x10 = new x1(b20, continuationImpl0);
        }
        Object object0 = x10.q;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(x10.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(b20.o == null) {
                    Enter hoverInteraction$Enter0 = new Enter();
                    x10.o = b20;
                    x10.p = hoverInteraction$Enter0;
                    x10.s = 1;
                    if(b20.n.emit(hoverInteraction$Enter0, x10) == unit0) {
                        return unit0;
                    }
                    b20.o = hoverInteraction$Enter0;
                    return Unit.INSTANCE;
                }
                break;
            }
            case 1: {
                Enter hoverInteraction$Enter1 = x10.p;
                b2 b21 = x10.o;
                ResultKt.throwOnFailure(object0);
                b21.o = hoverInteraction$Enter1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }

    public static final Object c(b2 b20, ContinuationImpl continuationImpl0) {
        y1 y10;
        b20.getClass();
        if(continuationImpl0 instanceof y1) {
            y10 = (y1)continuationImpl0;
            int v = y10.r;
            if((v & 0x80000000) == 0) {
                y10 = new y1(b20, continuationImpl0);
            }
            else {
                y10.r = v ^ 0x80000000;
            }
        }
        else {
            y10 = new y1(b20, continuationImpl0);
        }
        Object object0 = y10.p;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(y10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Enter hoverInteraction$Enter0 = b20.o;
                if(hoverInteraction$Enter0 != null) {
                    Exit hoverInteraction$Exit0 = new Exit(hoverInteraction$Enter0);
                    y10.o = b20;
                    y10.r = 1;
                    if(b20.n.emit(hoverInteraction$Exit0, y10) == unit0) {
                        return unit0;
                    }
                    b20.o = null;
                    return Unit.INSTANCE;
                }
                break;
            }
            case 1: {
                b20 = y10.o;
                ResultKt.throwOnFailure(object0);
                b20.o = null;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }

    public final void d() {
        Enter hoverInteraction$Enter0 = this.o;
        if(hoverInteraction$Enter0 != null) {
            Exit hoverInteraction$Exit0 = new Exit(hoverInteraction$Enter0);
            this.n.tryEmit(hoverInteraction$Exit0);
            this.o = null;
        }
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        this.d();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onDetach() {
        this.d();
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public final void onPointerEvent-H0pRuoY(PointerEvent pointerEvent0, PointerEventPass pointerEventPass0, long v) {
        if(pointerEventPass0 == PointerEventPass.Main) {
            int v1 = pointerEvent0.getType-7fucELk();
            if(PointerEventType.equals-impl0(v1, 4)) {
                BuildersKt.launch$default(this.getCoroutineScope(), null, null, new z1(this, null), 3, null);
                return;
            }
            if(PointerEventType.equals-impl0(v1, 5)) {
                BuildersKt.launch$default(this.getCoroutineScope(), null, null, new a2(this, null), 3, null);
            }
        }
    }
}

