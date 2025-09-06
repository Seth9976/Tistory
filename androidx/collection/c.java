package androidx.collection;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import qd.a;
import r.e;

public final class c extends RestrictedSuspendLambda implements Function2 {
    public ScatterMap p;
    public long[] q;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public int w;
    public Object x;
    public final ScatterMap y;

    public c(ScatterMap scatterMap0, Continuation continuation0) {
        this.y = scatterMap0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c(this.y, continuation0);
        continuation1.x = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v1;
        int v;
        long[] arr_v;
        ScatterMap scatterMap0;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.w) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.x;
                scatterMap0 = this.y;
                arr_v = scatterMap0.metadata;
                v = arr_v.length - 2;
                if(v >= 0) {
                    v1 = 0;
                    goto label_44;
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
                ScatterMap scatterMap1 = this.p;
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
                        int v6 = (v1 << 3) + v2;
                        e e0 = new e(scatterMap1.keys[v6], scatterMap1.values[v6]);
                        this.x = sequenceScope1;
                        this.p = scatterMap1;
                        this.q = arr_v1;
                        this.r = v5;
                        this.s = v1;
                        this.v = v4;
                        this.t = v3;
                        this.u = v2;
                        this.w = 1;
                        if(sequenceScope1.yield(e0, this) != object1) {
                            break;
                        }
                        return object1;
                    }
                }
                if(v3 == 8) {
                    v = v5;
                    arr_v = arr_v1;
                    scatterMap0 = scatterMap1;
                    sequenceScope0 = sequenceScope1;
                    while(true) {
                        if(v1 == v) {
                            break;
                        }
                        ++v1;
                    label_44:
                        long v7 = arr_v[v1];
                        if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                            continue;
                        }
                        sequenceScope1 = sequenceScope0;
                        v2 = 0;
                        scatterMap1 = scatterMap0;
                        v3 = 8 - (~(v1 - v) >>> 0x1F);
                        arr_v1 = arr_v;
                        v5 = v;
                        v4 = v7;
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

