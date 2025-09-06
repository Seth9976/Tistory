package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.selection.n0;
import androidx.compose.ui.input.pointer.PointerInputScope;
import j0.m2;
import j0.n2;
import j0.o2;
import j0.p2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A\u001C\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u001C\u0010\u0006\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0080@¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text/TextDragObserver;", "observer", "", "detectDragGesturesAfterLongPressWithObserver", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDownAndDragGesturesWithObserver", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LongPressTextDragObserverKt {
    public static final Object access$detectDragGesturesWithObserver(PointerInputScope pointerInputScope0, TextDragObserver textDragObserver0, Continuation continuation0) {
        Unit unit0 = DragGestureDetectorKt.detectDragGestures(pointerInputScope0, new n0(textDragObserver0, 4), new n2(textDragObserver0, 2), new n2(textDragObserver0, 3), new o2(textDragObserver0, 1), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final Object access$detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope0, TextDragObserver textDragObserver0, Continuation continuation0) {
        Unit unit0 = ForEachGestureKt.awaitEachGesture(pointerInputScope0, new p2(textDragObserver0, null), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object detectDownAndDragGesturesWithObserver(@NotNull PointerInputScope pointerInputScope0, @NotNull TextDragObserver textDragObserver0, @NotNull Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new m2(pointerInputScope0, textDragObserver0, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object detectDragGesturesAfterLongPressWithObserver(@NotNull PointerInputScope pointerInputScope0, @NotNull TextDragObserver textDragObserver0, @NotNull Continuation continuation0) {
        Object object0 = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope0, new n0(textDragObserver0, 3), new n2(textDragObserver0, 0), new n2(textDragObserver0, 1), new o2(textDragObserver0, 0), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

