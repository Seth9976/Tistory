package i1;

import androidx.compose.runtime.snapshots.SnapshotIdSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class c extends RestrictedSuspendLambda implements Function2 {
    public int[] p;
    public int q;
    public int r;
    public int s;
    public Object t;
    public final SnapshotIdSet u;

    public c(SnapshotIdSet snapshotIdSet0, Continuation continuation0) {
        this.u = snapshotIdSet0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c(this.u, continuation0);
        continuation1.t = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v3;
        SequenceScope sequenceScope3;
        int v2;
        SequenceScope sequenceScope2;
        int v1;
        int v;
        SequenceScope sequenceScope1;
        int[] arr_v1;
        SequenceScope sequenceScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        SnapshotIdSet snapshotIdSet0 = this.u;
    alab2:
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope0 = (SequenceScope)this.t;
                int[] arr_v = snapshotIdSet0.d;
                if(arr_v != null) {
                    arr_v1 = arr_v;
                    sequenceScope1 = sequenceScope0;
                    v = arr_v.length;
                    v1 = 0;
                    goto label_19;
                }
                goto label_28;
            }
            case 1: {
                v = this.r;
                v1 = this.q;
                arr_v1 = this.p;
                sequenceScope1 = (SequenceScope)this.t;
                ResultKt.throwOnFailure(object0);
                while(true) {
                    ++v1;
                label_19:
                    if(v1 >= v) {
                        break;
                    }
                    this.t = sequenceScope1;
                    this.p = arr_v1;
                    this.q = v1;
                    this.r = v;
                    this.s = 1;
                    if(sequenceScope1.yield(Boxing.boxInt(arr_v1[v1]), this) != object1) {
                        continue;
                    }
                    return object1;
                }
                sequenceScope0 = sequenceScope1;
            label_28:
                if(snapshotIdSet0.b != 0L) {
                    sequenceScope2 = sequenceScope0;
                    v2 = 0;
                    goto label_36;
                }
                goto label_45;
            }
            case 2: {
                v2 = this.q;
                sequenceScope2 = (SequenceScope)this.t;
                ResultKt.throwOnFailure(object0);
            alab1:
                while(true) {
                    while(true) {
                        ++v2;
                    label_36:
                        if(v2 >= 0x40) {
                            break alab1;
                        }
                        if((snapshotIdSet0.b & 1L << v2) == 0L) {
                            break;
                        }
                        this.t = sequenceScope2;
                        this.p = null;
                        this.q = v2;
                        this.s = 2;
                        if(sequenceScope2.yield(Boxing.boxInt(snapshotIdSet0.c + v2), this) != object1) {
                            break;
                        }
                        return object1;
                    }
                }
                sequenceScope0 = sequenceScope2;
            label_45:
                if(snapshotIdSet0.a != 0L) {
                    sequenceScope3 = sequenceScope0;
                    v3 = 0;
                    goto label_54;
                }
                break;
            }
            case 3: {
                int v4 = this.q;
                sequenceScope3 = (SequenceScope)this.t;
                ResultKt.throwOnFailure(object0);
                while(true) {
                    v3 = v4;
                    while(true) {
                        ++v3;
                    label_54:
                        if(v3 >= 0x40) {
                            break alab2;
                        }
                        if((snapshotIdSet0.a & 1L << v3) != 0L) {
                            this.t = sequenceScope3;
                            this.p = null;
                            this.q = v3;
                            this.s = 3;
                            if(sequenceScope3.yield(Boxing.boxInt(snapshotIdSet0.c + (v3 + 0x40)), this) == object1) {
                                return object1;
                            }
                            v4 = v3;
                            break;
                        }
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

