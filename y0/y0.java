package y0;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.y;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.concurrent.CompletableFuture;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import z.x3;

public final class y0 extends Lambda implements Function1 {
    public final int w;
    public final Object x;

    public y0(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(1);
    }

    public y0(Function1 function10) {
        this.w = 7;
        this.x = (Lambda)function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Object object1 = this.x;
        switch(this.w) {
            case 0: {
                ((SnapshotMutableStateImpl)object1).setValue(object0);
                return Unit.INSTANCE;
            }
            case 1: {
                if(((Throwable)object0) == null) {
                    ((CompletableFuture)object1).complete(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                ((CompletableFuture)object1).completeExceptionally(((Throwable)object0));
                return Unit.INSTANCE;
            }
            case 2: {
                return (Boolean)((DragGestureNode)object1).getCanDrag().invoke(((PointerInputChange)object0));
            }
            case 3: {
                ((y)object1).E.onFocusBoundsChanged(((LayoutCoordinates)object0));
                return Unit.INSTANCE;
            }
            case 4: {
                return Offset.box-impl(ScrollingLogic.access$performScroll-3eAAhYA(((ScrollingLogic)object1), ((ScrollingLogic)object1).h, ((Offset)object0).unbox-impl(), ((ScrollingLogic)object1).g));
            }
            case 5: {
                return (Boolean)((x3)object1).q.invoke(Offset.box-impl(((Offset)object0).unbox-impl()));
            }
            case 6: {
                Intrinsics.checkNotNullExpressionValue(object0, "it");
                ((SmartSet)object1).add(object0);
                return Unit.INSTANCE;
            }
            default: {
                Throwable throwable0 = (Throwable)object0;
                Lambda lambda0 = (Lambda)object1;
                try {
                    Throwable throwable2 = (Throwable)((Function1)lambda0).invoke(throwable0);
                    if(!Intrinsics.areEqual(throwable0.getMessage(), throwable2.getMessage()) && !Intrinsics.areEqual(throwable2.getMessage(), throwable0.toString())) {
                        return null;
                    }
                    return Result.isFailure-impl(throwable2) ? null : throwable2;
                }
                catch(Throwable throwable1) {
                }
                Throwable throwable3 = Result.constructor-impl(ResultKt.createFailure(throwable1));
                return Result.isFailure-impl(throwable3) ? null : throwable3;
            }
        }
    }
}

