package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001A\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\n2\'\u0010\u000B\u001A#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000E\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f¢\u0006\u0002\b\u000FH¦@¢\u0006\u0002\u0010\u0010ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DState;", "", "dispatchRawDelta", "", "delta", "Landroidx/compose/ui/geometry/Offset;", "dispatchRawDelta-k-4lQ0M", "(J)V", "drag", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/Drag2DScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Draggable2DState {
    void dispatchRawDelta-k-4lQ0M(long arg1);

    @Nullable
    Object drag(@NotNull MutatePriority arg1, @NotNull Function2 arg2, @NotNull Continuation arg3);

    static Object drag$default(Draggable2DState draggable2DState0, MutatePriority mutatePriority0, Function2 function20, Continuation continuation0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return draggable2DState0.drag(mutatePriority0, function20, continuation0);
    }
}

