package ha;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.kakao.kandinsky.gesture.GestureInteraction;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

public final class a extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final GestureInteraction r;

    public a(GestureInteraction gestureInteraction0, Continuation continuation0) {
        this.r = gestureInteraction0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a(this.r, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                goto label_17;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            List list0 = ((PointerEvent)object0).getChanges();
            int v = list0.size();
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(((PointerInputChange)list0.get(v1)).getPressed()) {
                        break;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                this.r.onFinish();
                break;
            }
        label_17:
            this.q = awaitPointerEventScope0;
            this.p = 1;
            object0 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope0, null, this, 1, null);
        }
        while(object0 != object1);
        return object1;
    }
}

