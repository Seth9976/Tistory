package na;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.material3.ti;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.kakao.kandinsky.preview.PreviewGestureController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.b0;
import qd.a;

public final class e extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final PreviewGestureController q;
    public final Function1 r;

    public e(PreviewGestureController previewGestureController0, Function1 function10, Continuation continuation0) {
        this.q = previewGestureController0;
        this.r = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new e(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.p;
                b0 b00 = new b0(this.q, 5);
                ti ti0 = new ti(this.r, 12);
                this.o = 1;
                return TapGestureDetectorKt.detectTapGestures$default(pointerInputScope0, b00, null, null, ti0, this, 6, null) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

