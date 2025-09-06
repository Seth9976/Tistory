package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import n0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A,\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0010\b\u0002\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0080@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"detectPressDownGesture", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDown", "Landroidx/compose/foundation/text/input/internal/selection/TapOnPosition;", "onUp", "Lkotlin/Function0;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/input/internal/selection/TapOnPosition;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PressDownGestureKt {
    @Nullable
    public static final Object detectPressDownGesture(@NotNull PointerInputScope pointerInputScope0, @NotNull TapOnPosition tapOnPosition0, @Nullable Function0 function00, @NotNull Continuation continuation0) {
        Object object0 = ForEachGestureKt.awaitEachGesture(pointerInputScope0, new a(tapOnPosition0, function00, null), continuation0);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object detectPressDownGesture$default(PointerInputScope pointerInputScope0, TapOnPosition tapOnPosition0, Function0 function00, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            function00 = null;
        }
        return PressDownGestureKt.detectPressDownGesture(pointerInputScope0, tapOnPosition0, function00, continuation0);
    }
}

