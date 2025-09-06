package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class h0 extends RestrictedSuspendLambda implements Function2 {
    public Object p;
    public Iterator q;
    public int r;
    public int s;
    public Object t;
    public final int u;
    public final int v;
    public final Iterator w;
    public final boolean x;
    public final boolean y;

    public h0(int v, int v1, Iterator iterator0, boolean z, boolean z1, Continuation continuation0) {
        this.u = v;
        this.v = v1;
        this.w = iterator0;
        this.x = z;
        this.y = z1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new h0(this.u, this.v, this.w, this.x, this.y, continuation0);
        continuation1.t = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h0)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        SequenceScope sequenceScope0;
        d0 d00;
        SequenceScope sequenceScope1;
        d0 d01;
        Iterator iterator0;
        SequenceScope sequenceScope3;
        ArrayList arrayList0;
        Iterator iterator1;
        int v2;
        Object[] arr_object1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = this.y;
        boolean z1 = this.x;
        int v = this.v;
        int v1 = this.u;
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SequenceScope sequenceScope4 = (SequenceScope)this.t;
                int v3 = c.coerceAtMost(v1, 0x400);
                int v4 = v - v1;
                Iterator iterator2 = this.w;
                if(v4 >= 0) {
                    sequenceScope3 = sequenceScope4;
                    ArrayList arrayList1 = new ArrayList(v3);
                    v2 = v4;
                    int v5 = 0;
                    iterator1 = iterator2;
                    while(iterator1.hasNext()) {
                        Object object2 = iterator1.next();
                        if(v5 > 0) {
                            --v5;
                        }
                        else {
                            arrayList1.add(object2);
                            if(arrayList1.size() == v1) {
                                this.t = sequenceScope3;
                                this.p = arrayList1;
                                this.q = iterator1;
                                this.r = v2;
                                this.s = 1;
                                if(sequenceScope3.yield(arrayList1, this) == object1) {
                                    return object1;
                                }
                                arrayList0 = arrayList1;
                            label_53:
                                if(z1) {
                                    arrayList0.clear();
                                }
                                else {
                                    arrayList0 = new ArrayList(v1);
                                }
                                arrayList1 = arrayList0;
                                v5 = v2;
                            }
                        }
                    }
                    if(!arrayList1.isEmpty() && (z || arrayList1.size() == v1)) {
                        this.t = null;
                        this.p = null;
                        this.q = null;
                        this.s = 2;
                        if(sequenceScope3.yield(arrayList1, this) == object1) {
                            return object1;
                        }
                    }
                }
                else {
                    d01 = new d0(new Object[v3], 0);
                    sequenceScope1 = sequenceScope4;
                    iterator0 = iterator2;
                label_70:
                    while(iterator0.hasNext()) {
                        Object object3 = iterator0.next();
                        int v6 = d01.b;
                        if(d01.size() == v6) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        Object[] arr_object = d01.a;
                        arr_object[(d01.size() + d01.c) % v6] = object3;
                        d01.d = d01.size() + 1;
                        if(d01.size() != v6) {
                        }
                        else if(d01.size() < v1) {
                            int v7 = c.coerceAtMost(v6 + (v6 >> 1) + 1, v1);
                            if(d01.c == 0) {
                                arr_object1 = Arrays.copyOf(arr_object, v7);
                                Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
                            }
                            else {
                                arr_object1 = d01.toArray(new Object[v7]);
                            }
                            d01 = new d0(arr_object1, d01.size());
                        }
                        else {
                            d0 d02 = z1 ? d01 : new ArrayList(d01);
                            this.t = sequenceScope1;
                            this.p = d01;
                            this.q = iterator0;
                            this.s = 3;
                            if(sequenceScope1.yield(d02, this) == object1) {
                                return object1;
                            }
                            d01.a(v);
                        }
                    }
                    if(z) {
                        d00 = d01;
                        sequenceScope0 = sequenceScope1;
                    label_103:
                        while(d00.size() > v) {
                            d0 d03 = z1 ? d00 : new ArrayList(d00);
                            this.t = sequenceScope0;
                            this.p = d00;
                            this.q = null;
                            this.s = 4;
                            if(sequenceScope0.yield(d03, this) == object1) {
                                return object1;
                            }
                            d00.a(v);
                        }
                        if(!d00.isEmpty()) {
                            this.t = null;
                            this.p = null;
                            this.q = null;
                            this.s = 5;
                            if(sequenceScope0.yield(d00, this) == object1) {
                                return object1;
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                v2 = this.r;
                iterator1 = this.q;
                arrayList0 = (ArrayList)this.p;
                SequenceScope sequenceScope2 = (SequenceScope)this.t;
                ResultKt.throwOnFailure(object0);
                sequenceScope3 = sequenceScope2;
                goto label_53;
            }
            case 3: {
                iterator0 = this.q;
                d01 = (d0)this.p;
                sequenceScope1 = (SequenceScope)this.t;
                ResultKt.throwOnFailure(object0);
                d01.a(v);
                goto label_70;
            }
            case 4: {
                d00 = (d0)this.p;
                sequenceScope0 = (SequenceScope)this.t;
                ResultKt.throwOnFailure(object0);
                d00.a(v);
                goto label_103;
            }
            case 2: 
            case 5: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

