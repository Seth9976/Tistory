package j0;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.JobKt;
import qd.a;

public final class q2 extends RestrictedSuspendLambda implements Function2 {
    public ObjectRef p;
    public int q;
    public Object r;
    public final CoroutineContext s;
    public final PointerEventPass t;
    public final Function1 u;

    public q2(CoroutineContext coroutineContext0, PointerEventPass pointerEventPass0, Function1 function10, Continuation continuation0) {
        this.s = coroutineContext0;
        this.t = pointerEventPass0;
        this.u = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new q2(this.s, this.t, this.u, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((q2)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope1;
        ObjectRef ref$ObjectRef0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.r;
                ref$ObjectRef0 = new ObjectRef();
                awaitPointerEventScope1 = awaitPointerEventScope0;
                goto label_21;
            }
            case 1: {
                ref$ObjectRef0 = this.p;
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            int v = ((PointerEvent)object0).getType-7fucELk();
            if(((PointerEventType.equals-impl0(v, 3) ? true : PointerEventType.equals-impl0(v, 4)) ? true : PointerEventType.equals-impl0(v, 5))) {
                Offset offset0 = Offset.box-impl(((PointerInputChange)CollectionsKt___CollectionsKt.first(((PointerEvent)object0).getChanges())).getPosition-F1C5BW0());
                if(Offset.equals-impl(offset0.unbox-impl(), ref$ObjectRef0.element)) {
                    offset0 = null;
                }
                if(offset0 != null) {
                    long v1 = offset0.unbox-impl();
                    ref$ObjectRef0.element = Offset.box-impl(v1);
                    Offset offset1 = Offset.box-impl(v1);
                    this.u.invoke(offset1);
                }
            }
        label_21:
            if(!JobKt.isActive(this.s)) {
                break;
            }
            this.r = awaitPointerEventScope1;
            this.p = ref$ObjectRef0;
            this.q = 1;
            object0 = awaitPointerEventScope1.awaitPointerEvent(this.t, this);
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

