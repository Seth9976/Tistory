package w0;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import qd.a;

public final class k0 extends RestrictedSuspendLambda implements Function2 {
    public MutableStateFlow p;
    public PointerEventPass q;
    public long r;
    public int s;
    public Object t;
    public final CoroutineScope u;
    public final TooltipState v;

    public k0(CoroutineScope coroutineScope0, TooltipState tooltipState0, Continuation continuation0) {
        this.u = coroutineScope0;
        this.v = tooltipState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new k0(this.u, this.v, continuation0);
        continuation1.t = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k0)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object3;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow2;
        PointerEventPass pointerEventPass1;
        MutableStateFlow mutableStateFlow1;
        AwaitPointerEventScope awaitPointerEventScope1;
        Object object2;
        long v;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.t;
                MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(Boxing.boxBoolean(false));
                v = awaitPointerEventScope0.getViewConfiguration().getLongPressTimeoutMillis();
                this.t = awaitPointerEventScope0;
                this.p = mutableStateFlow0;
                this.q = PointerEventPass.Initial;
                this.r = v;
                this.s = 1;
                PointerEventPass pointerEventPass0 = PointerEventPass.Initial;
                object2 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, PointerEventPass.Initial, this, 1, null);
                if(object2 == object1) {
                    return object1;
                }
                awaitPointerEventScope1 = awaitPointerEventScope0;
                mutableStateFlow1 = mutableStateFlow0;
                pointerEventPass1 = pointerEventPass0;
                goto label_27;
            }
            case 1: {
                long v1 = this.r;
                pointerEventPass1 = this.q;
                mutableStateFlow1 = this.p;
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.t;
                ResultKt.throwOnFailure(object0);
                v = v1;
                object2 = object0;
            label_27:
                int v2 = ((PointerInputChange)object2).getType-T8wyACA();
                if(PointerType.equals-impl0(v2, 1) || PointerType.equals-impl0(v2, 3)) {
                    try {
                        h0 h00 = new h0(pointerEventPass1, null);
                        this.t = awaitPointerEventScope1;
                        this.p = mutableStateFlow1;
                        this.q = pointerEventPass1;
                        this.s = 2;
                        if(awaitPointerEventScope1.withTimeout(v, h00, this) == object1) {
                            return object1;
                        }
                        mutableStateFlow3 = mutableStateFlow1;
                        goto label_64;
                    }
                    catch(PointerEventTimeoutCancellationException unused_ex) {
                        mutableStateFlow2 = mutableStateFlow1;
                        goto label_52;
                    }
                    catch(Throwable throwable0) {
                        mutableStateFlow2 = mutableStateFlow1;
                        mutableStateFlow2.tryEmit(Boxing.boxBoolean(false));
                        throw throwable0;
                    }
                    return object1;
                }
                break;
            }
            case 2: {
                PointerEventPass pointerEventPass2 = this.q;
                mutableStateFlow3 = this.p;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)this.t;
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                    awaitPointerEventScope1 = awaitPointerEventScope2;
                    pointerEventPass1 = pointerEventPass2;
                    mutableStateFlow2 = mutableStateFlow3;
                    try {
                    label_52:
                        j0 j00 = new j0(mutableStateFlow2, this.v, null);
                        BuildersKt.launch$default(this.u, null, CoroutineStart.UNDISPATCHED, j00, 1, null);
                        this.t = mutableStateFlow2;
                        this.p = null;
                        this.q = null;
                        this.s = 3;
                        object3 = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope1, pointerEventPass1, this);
                        if(object3 == object1) {
                            return object1;
                        }
                        goto label_69;
                    }
                    catch(Throwable throwable0) {
                        mutableStateFlow2.tryEmit(Boxing.boxBoolean(false));
                        throw throwable0;
                    }
                }
                catch(Throwable throwable0) {
                    mutableStateFlow2 = mutableStateFlow3;
                    mutableStateFlow2.tryEmit(Boxing.boxBoolean(false));
                    throw throwable0;
                }
            label_64:
                mutableStateFlow3.tryEmit(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            case 3: {
                mutableStateFlow2 = (MutableStateFlow)this.t;
                try {
                    ResultKt.throwOnFailure(object0);
                    object3 = object0;
                label_69:
                    if(((PointerInputChange)object3) != null) {
                        ((PointerInputChange)object3).consume();
                    }
                }
                catch(Throwable throwable0) {
                    mutableStateFlow2.tryEmit(Boxing.boxBoolean(false));
                    throw throwable0;
                }
                mutableStateFlow2.tryEmit(Boxing.boxBoolean(false));
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

