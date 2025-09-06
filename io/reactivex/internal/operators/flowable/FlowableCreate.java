package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.exceptions.Exceptions;
import org.reactivestreams.Subscriber;

public final class FlowableCreate extends Flowable {
    public final FlowableOnSubscribe b;
    public final BackpressureStrategy c;

    public FlowableCreate(FlowableOnSubscribe flowableOnSubscribe0, BackpressureStrategy backpressureStrategy0) {
        this.b = flowableOnSubscribe0;
        this.c = backpressureStrategy0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        u0 u00;
        switch(q0.a[this.c.ordinal()]) {
            case 1: {
                u00 = new u0(subscriber0);  // 初始化器: Lio/reactivex/internal/operators/flowable/r0;-><init>(Lorg/reactivestreams/Subscriber;)V
                break;
            }
            case 2: {
                u00 = new t0(subscriber0, 1);
                break;
            }
            case 3: {
                u00 = new t0(subscriber0, 0);
                break;
            }
            case 4: {
                u00 = new s0(subscriber0);
                break;
            }
            default: {
                u00 = new s0(subscriber0, 0x80);
            }
        }
        subscriber0.onSubscribe(u00);
        try {
            this.b.subscribe(u00);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            u00.onError(throwable0);
        }
    }
}

