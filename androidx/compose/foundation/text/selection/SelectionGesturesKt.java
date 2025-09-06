package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\'\u0010\u0005\u001A\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A#\u0010\u000B\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A$\u0010\u000E\u001A\u00020\u0003*\u00020\r2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0080@¢\u0006\u0004\b\u000E\u0010\u000F\"\u0018\u0010\u0011\u001A\u00020\u0002*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "", "", "updateTouchMode", "updateSelectionTouchMode", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "textDragObserver", "selectionGestureInput", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "selectionGesturePointerInputBtf2", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPrecisePointer", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n33#2,6:445\n33#2,6:451\n33#2,6:457\n33#2,6:463\n33#2,6:469\n33#2,6:475\n33#2,6:481\n86#2,2:487\n33#2,6:489\n88#2:495\n86#2,2:496\n33#2,6:498\n88#2:504\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n134#1:445,6\n165#1:451,6\n188#1:457,6\n247#1:463,6\n322#1:469,6\n358#1:475,6\n384#1:481,6\n426#1:487,2\n426#1:489,6\n426#1:495\n443#1:496,2\n443#1:498,6\n443#1:504\n*E\n"})
public final class SelectionGesturesKt {
    public static final boolean a(ViewConfiguration viewConfiguration0, PointerInputChange pointerInputChange0, PointerInputChange pointerInputChange1) {
        return Offset.getDistance-impl(Offset.minus-MK-Hz9U(pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange1.getPosition-F1C5BW0())) < DragGestureDetectorKt.pointerSlop-E8SPZFQ(viewConfiguration0, pointerInputChange0.getType-T8wyACA());
    }

    public static final Object access$awaitDown(AwaitPointerEventScope awaitPointerEventScope0, Continuation continuation0) {
        e0 e00;
        if(continuation0 instanceof e0) {
            e00 = (e0)continuation0;
            int v = e00.q;
            if((v & 0x80000000) == 0) {
                e00 = new e0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                e00.q = v ^ 0x80000000;
            }
        }
        else {
            e00 = new e0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = e00.p;
        PointerEvent pointerEvent0 = a.getCOROUTINE_SUSPENDED();
        switch(e00.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                goto label_24;
            }
            case 1: {
                awaitPointerEventScope0 = e00.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            List list0 = ((PointerEvent)object0).getChanges();
            int v1 = list0.size();
            int v2 = 0;
            while(true) {
                if(v2 >= v1) {
                    break alab1;
                }
                if(PointerEventKt.changedToDownIgnoreConsumed(((PointerInputChange)list0.get(v2)))) {
                    ++v2;
                    continue;
                }
            label_24:
                e00.o = awaitPointerEventScope0;
                e00.q = 1;
                object0 = awaitPointerEventScope0.awaitPointerEvent(PointerEventPass.Main, e00);
                if(object0 != pointerEvent0) {
                    break;
                }
                return pointerEvent0;
            }
        }
        return (PointerEvent)object0;
    }

    public static final Object access$mouseSelection(AwaitPointerEventScope awaitPointerEventScope0, MouseSelectionObserver mouseSelectionObserver0, k k0, PointerEvent pointerEvent0, Continuation continuation0) {
        SelectionAdjustment selectionAdjustment0;
        f0 f00;
        if(continuation0 instanceof f0) {
            f00 = (f0)continuation0;
            int v = f00.r;
            if((v & 0x80000000) == 0) {
                f00 = new f0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                f00.r = v ^ 0x80000000;
            }
        }
        else {
            f00 = new f0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = f00.q;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        int v1 = 0;
        switch(f00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                k0.a(pointerEvent0);
                PointerInputChange pointerInputChange1 = (PointerInputChange)pointerEvent0.getChanges().get(0);
                switch(k0.b) {
                    case 1: {
                        selectionAdjustment0 = SelectionAdjustment.Companion.getNone();
                        break;
                    }
                    case 2: {
                        selectionAdjustment0 = SelectionAdjustment.Companion.getWord();
                        break;
                    }
                    default: {
                        selectionAdjustment0 = SelectionAdjustment.Companion.getParagraph();
                    }
                }
                if(mouseSelectionObserver0.onStart-3MmeM6k(pointerInputChange1.getPosition-F1C5BW0(), selectionAdjustment0)) {
                    h0 h00 = new h0(mouseSelectionObserver0, selectionAdjustment0, 0);
                    f00.o = awaitPointerEventScope0;
                    f00.p = mouseSelectionObserver0;
                    f00.r = 2;
                    object0 = DragGestureDetectorKt.drag-jO51t88(awaitPointerEventScope0, pointerInputChange1.getId-J3iCeTQ(), h00, f00);
                    if(object0 == unit0) {
                        return unit0;
                    }
                    goto label_48;
                }
                break;
            }
            case 1: {
                mouseSelectionObserver0 = f00.p;
                awaitPointerEventScope0 = f00.o;
                ResultKt.throwOnFailure(object0);
                if(((Boolean)object0).booleanValue()) {
                    List list0 = awaitPointerEventScope0.getCurrentEvent().getChanges();
                    int v2 = list0.size();
                    while(v1 < v2) {
                        PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v1);
                        if(PointerEventKt.changedToUp(pointerInputChange0)) {
                            pointerInputChange0.consume();
                        }
                        ++v1;
                    }
                }
                mouseSelectionObserver0.onDragDone();
                return Unit.INSTANCE;
            }
            case 2: {
                mouseSelectionObserver0 = f00.p;
                awaitPointerEventScope0 = f00.o;
                ResultKt.throwOnFailure(object0);
            label_48:
                if(((Boolean)object0).booleanValue()) {
                    List list1 = awaitPointerEventScope0.getCurrentEvent().getChanges();
                    int v3 = list1.size();
                    while(v1 < v3) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange)list1.get(v1);
                        if(PointerEventKt.changedToUp(pointerInputChange2)) {
                            pointerInputChange2.consume();
                        }
                        ++v1;
                    }
                }
                mouseSelectionObserver0.onDragDone();
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }

    public static final Object access$mouseSelectionBtf2(AwaitPointerEventScope awaitPointerEventScope0, MouseSelectionObserver mouseSelectionObserver0, k k0, PointerEvent pointerEvent0, Continuation continuation0) {
        SelectionAdjustment selectionAdjustment0;
        i0 i00;
        if(continuation0 instanceof i0) {
            i00 = (i0)continuation0;
            int v = i00.r;
            if((v & 0x80000000) == 0) {
                i00 = new i0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                i00.r = v ^ 0x80000000;
            }
        }
        else {
            i00 = new i0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = i00.q;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        int v1 = 0;
        switch(i00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputChange pointerInputChange1 = (PointerInputChange)pointerEvent0.getChanges().get(0);
                switch(k0.b) {
                    case 1: {
                        selectionAdjustment0 = SelectionAdjustment.Companion.getNone();
                        break;
                    }
                    case 2: {
                        selectionAdjustment0 = SelectionAdjustment.Companion.getWord();
                        break;
                    }
                    default: {
                        selectionAdjustment0 = SelectionAdjustment.Companion.getParagraph();
                    }
                }
                if(mouseSelectionObserver0.onStart-3MmeM6k(pointerInputChange1.getPosition-F1C5BW0(), selectionAdjustment0)) {
                    try {
                        pointerInputChange1.consume();
                        h0 h00 = new h0(mouseSelectionObserver0, selectionAdjustment0, 1);
                        i00.o = awaitPointerEventScope0;
                        i00.p = mouseSelectionObserver0;
                        i00.r = 2;
                        object0 = DragGestureDetectorKt.drag-jO51t88(awaitPointerEventScope0, pointerInputChange1.getId-J3iCeTQ(), h00, i00);
                        if(object0 == unit0) {
                            return unit0;
                        label_48:
                            mouseSelectionObserver0 = i00.p;
                            awaitPointerEventScope0 = i00.o;
                            ResultKt.throwOnFailure(object0);
                        }
                        if(((Boolean)object0).booleanValue()) {
                            List list1 = awaitPointerEventScope0.getCurrentEvent().getChanges();
                            int v3 = list1.size();
                            while(true) {
                                if(v1 >= v3) {
                                    break;
                                }
                                PointerInputChange pointerInputChange2 = (PointerInputChange)list1.get(v1);
                                if(PointerEventKt.changedToUp(pointerInputChange2)) {
                                    pointerInputChange2.consume();
                                }
                                ++v1;
                            }
                        }
                        goto label_63;
                    }
                    catch(Throwable throwable1) {
                        mouseSelectionObserver0.onDragDone();
                        throw throwable1;
                    }
                }
                break;
            }
            case 1: {
                try {
                    mouseSelectionObserver0 = i00.p;
                    awaitPointerEventScope0 = i00.o;
                    ResultKt.throwOnFailure(object0);
                    if(((Boolean)object0).booleanValue()) {
                        List list0 = awaitPointerEventScope0.getCurrentEvent().getChanges();
                        int v2 = list0.size();
                        while(v1 < v2) {
                            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v1);
                            if(PointerEventKt.changedToUp(pointerInputChange0)) {
                                pointerInputChange0.consume();
                            }
                            ++v1;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    mouseSelectionObserver0.onDragDone();
                    throw throwable0;
                }
                mouseSelectionObserver0.onDragDone();
                return Unit.INSTANCE;
            }
            case 2: {
                goto label_48;
            label_63:
                mouseSelectionObserver0.onDragDone();
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }

    public static final Object access$touchSelection(AwaitPointerEventScope awaitPointerEventScope0, TextDragObserver textDragObserver0, PointerEvent pointerEvent0, Continuation continuation0) {
        Unit unit0;
        Object object0;
        m0 m00;
        if(continuation0 instanceof m0) {
            m00 = (m0)continuation0;
            int v = m00.s;
            if((v & 0x80000000) == 0) {
                m00 = new m0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                m00.s = v ^ 0x80000000;
            }
        }
        else {
            m00 = new m0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        try {
            object0 = m00.r;
            unit0 = a.getCOROUTINE_SUSPENDED();
            switch(m00.s) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_22;
                }
                case 2: {
                    goto label_38;
                }
            }
        }
        catch(CancellationException cancellationException0) {
            textDragObserver0.onCancel();
            throw cancellationException0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        try {
            PointerInputChange pointerInputChange0 = (PointerInputChange)CollectionsKt___CollectionsKt.first(pointerEvent0.getChanges());
            m00.o = awaitPointerEventScope0;
            m00.p = textDragObserver0;
            m00.q = pointerInputChange0;
            m00.s = 1;
            object0 = DragGestureDetectorKt.awaitLongPressOrCancellation-rnUCldI(awaitPointerEventScope0, pointerInputChange0.getId-J3iCeTQ(), m00);
            if(object0 == unit0) {
                return unit0;
            }
            goto label_28;
        label_22:
            PointerInputChange pointerInputChange1 = m00.q;
            textDragObserver0 = m00.p;
            AwaitPointerEventScope awaitPointerEventScope1 = m00.o;
            ResultKt.throwOnFailure(object0);
            pointerInputChange0 = pointerInputChange1;
            awaitPointerEventScope0 = awaitPointerEventScope1;
        label_28:
            if(((PointerInputChange)object0) != null && SelectionGesturesKt.a(awaitPointerEventScope0.getViewConfiguration(), pointerInputChange0, ((PointerInputChange)object0))) {
                textDragObserver0.onStart-k-4lQ0M(((PointerInputChange)object0).getPosition-F1C5BW0());
                n0 n00 = new n0(textDragObserver0, 0);
                m00.o = awaitPointerEventScope0;
                m00.p = textDragObserver0;
                m00.q = null;
                m00.s = 2;
                object0 = DragGestureDetectorKt.drag-jO51t88(awaitPointerEventScope0, ((PointerInputChange)object0).getId-J3iCeTQ(), n00, m00);
                if(object0 == unit0) {
                    return unit0;
                label_38:
                    textDragObserver0 = m00.p;
                    awaitPointerEventScope0 = m00.o;
                    ResultKt.throwOnFailure(object0);
                }
                if(((Boolean)object0).booleanValue()) {
                    List list0 = awaitPointerEventScope0.getCurrentEvent().getChanges();
                    int v1 = list0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange)list0.get(v2);
                        if(PointerEventKt.changedToUp(pointerInputChange2)) {
                            pointerInputChange2.consume();
                        }
                    }
                    textDragObserver0.onStop();
                    return Unit.INSTANCE;
                }
                textDragObserver0.onCancel();
            }
            return Unit.INSTANCE;
        }
        catch(CancellationException cancellationException0) {
            textDragObserver0.onCancel();
            throw cancellationException0;
        }
    }

    public static final Object access$touchSelectionFirstPress(AwaitPointerEventScope awaitPointerEventScope0, TextDragObserver textDragObserver0, PointerEvent pointerEvent0, Continuation continuation0) {
        Unit unit0;
        Object object0;
        o0 o00;
        if(continuation0 instanceof o0) {
            o00 = (o0)continuation0;
            int v = o00.s;
            if((v & 0x80000000) == 0) {
                o00 = new o0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                o00.s = v ^ 0x80000000;
            }
        }
        else {
            o00 = new o0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        try {
            object0 = o00.r;
            unit0 = a.getCOROUTINE_SUSPENDED();
            switch(o00.s) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_22;
                }
                case 2: {
                    goto label_38;
                }
            }
        }
        catch(CancellationException cancellationException0) {
            textDragObserver0.onCancel();
            throw cancellationException0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        try {
            PointerInputChange pointerInputChange0 = (PointerInputChange)CollectionsKt___CollectionsKt.first(pointerEvent0.getChanges());
            o00.o = awaitPointerEventScope0;
            o00.p = textDragObserver0;
            o00.q = pointerInputChange0;
            o00.s = 1;
            object0 = DragGestureDetectorKt.awaitLongPressOrCancellation-rnUCldI(awaitPointerEventScope0, pointerInputChange0.getId-J3iCeTQ(), o00);
            if(object0 == unit0) {
                return unit0;
            }
            goto label_28;
        label_22:
            PointerInputChange pointerInputChange1 = o00.q;
            textDragObserver0 = o00.p;
            AwaitPointerEventScope awaitPointerEventScope1 = o00.o;
            ResultKt.throwOnFailure(object0);
            pointerInputChange0 = pointerInputChange1;
            awaitPointerEventScope0 = awaitPointerEventScope1;
        label_28:
            if(((PointerInputChange)object0) != null && SelectionGesturesKt.a(awaitPointerEventScope0.getViewConfiguration(), pointerInputChange0, ((PointerInputChange)object0))) {
                textDragObserver0.onStart-k-4lQ0M(((PointerInputChange)object0).getPosition-F1C5BW0());
                n0 n00 = new n0(textDragObserver0, 1);
                o00.o = awaitPointerEventScope0;
                o00.p = textDragObserver0;
                o00.q = null;
                o00.s = 2;
                object0 = DragGestureDetectorKt.drag-jO51t88(awaitPointerEventScope0, ((PointerInputChange)object0).getId-J3iCeTQ(), n00, o00);
                if(object0 == unit0) {
                    return unit0;
                label_38:
                    textDragObserver0 = o00.p;
                    awaitPointerEventScope0 = o00.o;
                    ResultKt.throwOnFailure(object0);
                }
                if(((Boolean)object0).booleanValue()) {
                    List list0 = awaitPointerEventScope0.getCurrentEvent().getChanges();
                    int v1 = list0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange)list0.get(v2);
                        if(PointerEventKt.changedToUp(pointerInputChange2)) {
                            pointerInputChange2.consume();
                        }
                    }
                    textDragObserver0.onStop();
                    return Unit.INSTANCE;
                }
                textDragObserver0.onCancel();
            }
            return Unit.INSTANCE;
        }
        catch(CancellationException cancellationException0) {
            textDragObserver0.onCancel();
            throw cancellationException0;
        }
    }

    public static final Object access$touchSelectionSubsequentPress(AwaitPointerEventScope awaitPointerEventScope0, TextDragObserver textDragObserver0, PointerEvent pointerEvent0, Continuation continuation0) {
        Unit unit0;
        Object object0;
        p0 p00;
        if(continuation0 instanceof p0) {
            p00 = (p0)continuation0;
            int v = p00.u;
            if((v & 0x80000000) == 0) {
                p00 = new p0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                p00.u = v ^ 0x80000000;
            }
        }
        else {
            p00 = new p0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        try {
            object0 = p00.t;
            unit0 = a.getCOROUTINE_SUSPENDED();
            switch(p00.u) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_29;
                }
                case 2: {
                    goto label_61;
                }
            }
        }
        catch(CancellationException cancellationException0) {
            textDragObserver0.onCancel();
            throw cancellationException0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        try {
            PointerInputChange pointerInputChange0 = (PointerInputChange)CollectionsKt___CollectionsKt.first(pointerEvent0.getChanges());
            long v1 = pointerInputChange0.getId-J3iCeTQ();
            LongRef ref$LongRef0 = new LongRef();
            ref$LongRef0.element = 0x7FC000007FC00000L;
            long v2 = awaitPointerEventScope0.getViewConfiguration().getLongPressTimeoutMillis();
            r0 r00 = new r0(v1, ref$LongRef0, null);
            p00.o = awaitPointerEventScope0;
            p00.p = textDragObserver0;
            p00.q = pointerInputChange0;
            p00.r = ref$LongRef0;
            p00.s = v1;
            p00.u = 1;
            Object object1 = awaitPointerEventScope0.withTimeoutOrNull(v2, r00, p00);
            if(object1 == unit0) {
                return unit0;
            }
            goto label_41;
        label_29:
            long v3 = p00.s;
            LongRef ref$LongRef1 = p00.r;
            pointerInputChange0 = p00.q;
            TextDragObserver textDragObserver1 = p00.p;
            AwaitPointerEventScope awaitPointerEventScope1 = p00.o;
            textDragObserver0 = textDragObserver1;
            ResultKt.throwOnFailure(object0);
            ref$LongRef0 = ref$LongRef1;
            object1 = object0;
            v1 = v3;
            textDragObserver0 = textDragObserver1;
            awaitPointerEventScope0 = awaitPointerEventScope1;
        label_41:
            l l0 = (l)object1;
            if(l0 == null) {
                l0 = l.c;
            }
            if(l0 == l.d) {
                return Unit.INSTANCE;
            }
            textDragObserver0.onStart-k-4lQ0M(pointerInputChange0.getPosition-F1C5BW0());
            if(l0 == l.a) {
                textDragObserver0.onStop();
                return Unit.INSTANCE;
            }
            if(l0 == l.b) {
                textDragObserver0.onDrag-k-4lQ0M(ref$LongRef0.element);
            }
            n0 n00 = new n0(textDragObserver0, 2);
            p00.o = awaitPointerEventScope0;
            p00.p = textDragObserver0;
            p00.q = null;
            p00.r = null;
            p00.u = 2;
            object0 = DragGestureDetectorKt.drag-jO51t88(awaitPointerEventScope0, v1, n00, p00);
            if(object0 == unit0) {
                return unit0;
            label_61:
                textDragObserver0 = p00.p;
                awaitPointerEventScope0 = p00.o;
                ResultKt.throwOnFailure(object0);
            }
            if(((Boolean)object0).booleanValue()) {
                List list0 = awaitPointerEventScope0.getCurrentEvent().getChanges();
                int v4 = list0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    PointerInputChange pointerInputChange1 = (PointerInputChange)list0.get(v5);
                    if(PointerEventKt.changedToUp(pointerInputChange1)) {
                        pointerInputChange1.consume();
                    }
                }
                textDragObserver0.onStop();
                return Unit.INSTANCE;
            }
            textDragObserver0.onCancel();
            return Unit.INSTANCE;
        }
        catch(CancellationException cancellationException0) {
            textDragObserver0.onCancel();
            throw cancellationException0;
        }
    }

    public static final boolean isPrecisePointer(@NotNull PointerEvent pointerEvent0) {
        List list0 = pointerEvent0.getChanges();
        int v = list0.size();
        int v1 = 0;
        while(v1 < v) {
            if(PointerType.equals-impl0(((PointerInputChange)list0.get(v1)).getType-T8wyACA(), 2)) {
                ++v1;
                continue;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public static final Modifier selectionGestureInput(@NotNull Modifier modifier0, @NotNull MouseSelectionObserver mouseSelectionObserver0, @NotNull TextDragObserver textDragObserver0) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier0, mouseSelectionObserver0, textDragObserver0, new k0(mouseSelectionObserver0, textDragObserver0, null));
    }

    @Nullable
    public static final Object selectionGesturePointerInputBtf2(@NotNull PointerInputScope pointerInputScope0, @NotNull MouseSelectionObserver mouseSelectionObserver0, @NotNull TextDragObserver textDragObserver0, @NotNull Continuation continuation0) {
        Object object0 = ForEachGestureKt.awaitEachGesture(pointerInputScope0, new l0(textDragObserver0, new k(pointerInputScope0.getViewConfiguration()), mouseSelectionObserver0, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public static final Modifier updateSelectionTouchMode(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier0, 0x845FED, new t0(function10, null));
    }
}

