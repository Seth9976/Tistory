package androidx.collection;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class d extends RestrictedSuspendLambda implements Function2 {
    public Object[] p;
    public long[] q;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public int w;
    public Object x;
    public final ScatterMap y;

    public d(ScatterMap scatterMap0, Continuation continuation0) {
        this.y = scatterMap0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.y, continuation0);
        continuation1.x = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v1;
        int v;
        long[] arr_v;
        Object[] arr_object;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.w) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.x;
                arr_object = this.y.keys;
                arr_v = this.y.metadata;
                v = arr_v.length - 2;
                if(v >= 0) {
                    v1 = 0;
                    goto label_42;
                }
                break;
            }
            case 1: {
                int v2 = this.u;
                int v3 = this.t;
                long v4 = this.v;
                v1 = this.s;
                int v5 = this.r;
                long[] arr_v1 = this.q;
                Object[] arr_object1 = this.p;
                SequenceScope sequenceScope1 = (SequenceScope)this.x;
                ResultKt.throwOnFailure(object0);
            alab1:
                while(true) {
                    while(true) {
                        v4 >>= 8;
                        ++v2;
                    label_22:
                        if(v2 >= v3) {
                            break alab1;
                        }
                        if((0xFFL & v4) >= 0x80L) {
                            break;
                        }
                        this.x = sequenceScope1;
                        this.p = arr_object1;
                        this.q = arr_v1;
                        this.r = v5;
                        this.s = v1;
                        this.v = v4;
                        this.t = v3;
                        this.u = v2;
                        this.w = 1;
                        if(sequenceScope1.yield(arr_object1[(v1 << 3) + v2], this) != object1) {
                            break;
                        }
                        return object1;
                    }
                }
                if(v3 == 8) {
                    v = v5;
                    arr_v = arr_v1;
                    arr_object = arr_object1;
                    sequenceScope0 = sequenceScope1;
                    while(true) {
                        if(v1 == v) {
                            break;
                        }
                        ++v1;
                    label_42:
                        long v6 = arr_v[v1];
                        if((~v6 << 7 & v6 & 0x8080808080808080L) == 0x8080808080808080L) {
                            continue;
                        }
                        sequenceScope1 = sequenceScope0;
                        v2 = 0;
                        arr_v1 = arr_v;
                        v5 = v;
                        v3 = 8 - (~(v1 - v) >>> 0x1F);
                        arr_object1 = arr_object;
                        v4 = v6;
                        goto label_22;
                    }
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

