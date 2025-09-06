package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.flow.internal.s;
import qd.a;
import xf.c0;
import xf.w;

public final class n implements FlowCollector {
    public final int a;
    public final ProducerScope b;

    public n(ProducerScope producerScope0, int v) {
        this.a = v;
        this.b = producerScope0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        c0 c00;
        w w0;
        s s0;
        switch(this.a) {
            case 0: {
                Unit unit1 = this.b.send(object0, continuation0);
                return unit1 == a.getCOROUTINE_SUSPENDED() ? unit1 : Unit.INSTANCE;
            }
            case 1: {
                if(continuation0 instanceof s) {
                    s0 = (s)continuation0;
                    int v1 = s0.q;
                    if((v1 & 0x80000000) == 0) {
                        s0 = new s(this, continuation0);
                    }
                    else {
                        s0.q = v1 ^ 0x80000000;
                    }
                }
                else {
                    s0 = new s(this, continuation0);
                }
                Object object2 = s0.o;
                Unit unit2 = a.getCOROUTINE_SUSPENDED();
                switch(s0.q) {
                    case 0: {
                        ResultKt.throwOnFailure(object2);
                        SendChannel sendChannel0 = this.b.getChannel();
                        if(object0 == null) {
                            object0 = NullSurrogateKt.NULL;
                        }
                        s0.q = 1;
                        return sendChannel0.send(object0, s0) == unit2 ? unit2 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object2);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                Unit unit3 = this.b.send(object0, continuation0);
                return unit3 == a.getCOROUTINE_SUSPENDED() ? unit3 : Unit.INSTANCE;
            }
            case 3: {
                if(continuation0 instanceof w) {
                    w0 = (w)continuation0;
                    int v2 = w0.q;
                    if((v2 & 0x80000000) == 0) {
                        w0 = new w(this, continuation0);
                    }
                    else {
                        w0.q = v2 ^ 0x80000000;
                    }
                }
                else {
                    w0 = new w(this, continuation0);
                }
                Object object3 = w0.o;
                Unit unit4 = a.getCOROUTINE_SUSPENDED();
                switch(w0.q) {
                    case 0: {
                        ResultKt.throwOnFailure(object3);
                        if(object0 == null) {
                            object0 = NullSurrogateKt.NULL;
                        }
                        w0.q = 1;
                        return this.b.send(object0, w0) == unit4 ? unit4 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object3);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                if(continuation0 instanceof c0) {
                    c00 = (c0)continuation0;
                    int v = c00.q;
                    if((v & 0x80000000) == 0) {
                        c00 = new c0(this, continuation0);
                    }
                    else {
                        c00.q = v ^ 0x80000000;
                    }
                }
                else {
                    c00 = new c0(this, continuation0);
                }
                Object object1 = c00.o;
                Unit unit0 = a.getCOROUTINE_SUSPENDED();
                switch(c00.q) {
                    case 0: {
                        ResultKt.throwOnFailure(object1);
                        if(object0 == null) {
                            object0 = NullSurrogateKt.NULL;
                        }
                        c00.q = 1;
                        return this.b.send(object0, c00) == unit0 ? unit0 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object1);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}

