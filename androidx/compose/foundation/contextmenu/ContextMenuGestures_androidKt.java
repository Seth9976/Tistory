package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import x.b;
import x.c;
import x.d;
import x.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A\u001B\u0010\u0003\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A(\u0010\n\u001A\u00020\b*\u00020\u00052\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0081@¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "state", "contextMenuGestures", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/contextmenu/ContextMenuState;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDown", "onRightClickDown", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextMenuGestures.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuGestures.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuGestures_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,72:1\n86#2,2:73\n33#2,6:75\n88#2:81\n*S KotlinDebug\n*F\n+ 1 ContextMenuGestures.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuGestures_androidKt\n*L\n67#1:73,2\n67#1:75,6\n67#1:81\n*E\n"})
public final class ContextMenuGestures_androidKt {
    public static final Object access$awaitFirstRightClickDown(AwaitPointerEventScope awaitPointerEventScope0, Continuation continuation0) {
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.q;
            if((v & 0x80000000) == 0) {
                b0 = new b(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                b0.q = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = b0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                goto label_26;
            }
            case 1: {
                awaitPointerEventScope0 = b0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(PointerEvent_androidKt.isSecondaryPressed-aHzCx-E(((PointerEvent)object0).getButtons-ry648PA())) {
                List list0 = ((PointerEvent)object0).getChanges();
                int v1 = list0.size();
                int v2 = 0;
                while(v2 < v1) {
                    if(!PointerEventKt.changedToDown(((PointerInputChange)list0.get(v2)))) {
                        goto label_26;
                    }
                    ++v2;
                }
                return ((PointerEvent)object0).getChanges().get(0);
            }
        label_26:
            b0.o = awaitPointerEventScope0;
            b0.q = 1;
            object0 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope0, null, b0, 1, null);
        }
        while(object0 != object1);
        return object1;
    }

    @NotNull
    public static final Modifier contextMenuGestures(@NotNull Modifier modifier0, @NotNull ContextMenuState contextMenuState0) {
        c c0 = new c(contextMenuState0, null);
        return SuspendingPointerInputFilterKt.pointerInput(modifier0, e.a, c0);
    }

    @VisibleForTesting
    @Nullable
    public static final Object onRightClickDown(@NotNull PointerInputScope pointerInputScope0, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        Object object0 = ForEachGestureKt.awaitEachGesture(pointerInputScope0, new d(function10, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

