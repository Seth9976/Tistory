package r;

import androidx.collection.MutableScatterMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class g extends RestrictedSuspendLambda implements Function2 {
    public final androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1 A;
    public androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1 p;
    public MutableScatterMap q;
    public long[] r;
    public int s;
    public int t;
    public int u;
    public int v;
    public long w;
    public int x;
    public Object y;
    public final MutableScatterMap z;

    public g(MutableScatterMap mutableScatterMap0, androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$10, Continuation continuation0) {
        this.z = mutableScatterMap0;
        this.A = mutableScatterMap$MutableMapWrapper$entries$1$iterator$10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new g(this.z, this.A, continuation0);
        continuation1.y = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v1;
        androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$10;
        int v;
        long[] arr_v;
        MutableScatterMap mutableScatterMap0;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.x) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.y;
                mutableScatterMap0 = this.z;
                arr_v = mutableScatterMap0.metadata;
                v = arr_v.length - 2;
                if(v >= 0) {
                    mutableScatterMap$MutableMapWrapper$entries$1$iterator$10 = this.A;
                    v1 = 0;
                    goto label_49;
                }
                break;
            }
            case 1: {
                int v2 = this.v;
                int v3 = this.u;
                long v4 = this.w;
                int v5 = this.t;
                int v6 = this.s;
                long[] arr_v1 = this.r;
                MutableScatterMap mutableScatterMap1 = this.q;
                androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$11 = this.p;
                SequenceScope sequenceScope1 = (SequenceScope)this.y;
                ResultKt.throwOnFailure(object0);
            alab1:
                while(true) {
                    while(true) {
                        v4 >>= 8;
                        ++v2;
                    label_24:
                        if(v2 >= v3) {
                            break alab1;
                        }
                        if((0xFFL & v4) >= 0x80L) {
                            break;
                        }
                        mutableScatterMap$MutableMapWrapper$entries$1$iterator$11.setCurrent((v5 << 3) + v2);
                        f f0 = new f(mutableScatterMap$MutableMapWrapper$entries$1$iterator$11.getCurrent(), mutableScatterMap1.keys, mutableScatterMap1.values);
                        this.y = sequenceScope1;
                        this.p = mutableScatterMap$MutableMapWrapper$entries$1$iterator$11;
                        this.q = mutableScatterMap1;
                        this.r = arr_v1;
                        this.s = v6;
                        this.t = v5;
                        this.w = v4;
                        this.u = v3;
                        this.v = v2;
                        this.x = 1;
                        if(sequenceScope1.yield(f0, this) != object1) {
                            break;
                        }
                        return object1;
                    }
                }
                if(v3 == 8) {
                    v = v6;
                    arr_v = arr_v1;
                    mutableScatterMap0 = mutableScatterMap1;
                    sequenceScope0 = sequenceScope1;
                    v1 = v5;
                    mutableScatterMap$MutableMapWrapper$entries$1$iterator$10 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$11;
                    while(true) {
                        if(v1 == v) {
                            break;
                        }
                        ++v1;
                    label_49:
                        long v7 = arr_v[v1];
                        if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                            continue;
                        }
                        sequenceScope1 = sequenceScope0;
                        v2 = 0;
                        mutableScatterMap1 = mutableScatterMap0;
                        arr_v1 = arr_v;
                        v3 = 8 - (~(v1 - v) >>> 0x1F);
                        mutableScatterMap$MutableMapWrapper$entries$1$iterator$11 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$10;
                        v5 = v1;
                        v6 = v;
                        v4 = v7;
                        goto label_24;
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

