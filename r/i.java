package r;

import androidx.collection.MutableScatterMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class i extends RestrictedSuspendLambda implements Function2 {
    public long[] p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public int v;
    public Object w;
    public final MutableScatterMap x;

    public i(MutableScatterMap mutableScatterMap0, Continuation continuation0) {
        this.x = mutableScatterMap0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new i(this.x, continuation0);
        continuation1.w = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v1;
        int v;
        long[] arr_v;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.w;
                arr_v = this.x.metadata;
                v = arr_v.length - 2;
                if(v >= 0) {
                    v1 = 0;
                    goto label_39;
                }
                break;
            }
            case 1: {
                int v2 = this.t;
                int v3 = this.s;
                long v4 = this.u;
                int v5 = this.r;
                int v6 = this.q;
                long[] arr_v1 = this.p;
                SequenceScope sequenceScope1 = (SequenceScope)this.w;
                ResultKt.throwOnFailure(object0);
            alab1:
                while(true) {
                    while(true) {
                        v4 >>= 8;
                        ++v2;
                    label_20:
                        if(v2 >= v3) {
                            break alab1;
                        }
                        if((0xFFL & v4) >= 0x80L) {
                            break;
                        }
                        this.w = sequenceScope1;
                        this.p = arr_v1;
                        this.q = v6;
                        this.r = v5;
                        this.u = v4;
                        this.s = v3;
                        this.t = v2;
                        this.v = 1;
                        if(sequenceScope1.yield(Boxing.boxInt((v5 << 3) + v2), this) != object1) {
                            break;
                        }
                        return object1;
                    }
                }
                if(v3 == 8) {
                    v1 = v5;
                    v = v6;
                    arr_v = arr_v1;
                    sequenceScope0 = sequenceScope1;
                    while(true) {
                        if(v1 == v) {
                            break;
                        }
                        ++v1;
                    label_39:
                        long v7 = arr_v[v1];
                        if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                            continue;
                        }
                        sequenceScope1 = sequenceScope0;
                        v2 = 0;
                        arr_v1 = arr_v;
                        v3 = 8 - (~(v1 - v) >>> 0x1F);
                        v6 = v;
                        v5 = v1;
                        v4 = v7;
                        goto label_20;
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

