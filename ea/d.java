package ea;

import androidx.compose.runtime.State;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.filter.FilterScreenKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharingCommand;
import qd.a;
import xf.t2;

public final class d extends SuspendLambda implements Function3 {
    public final int o;
    public int p;
    public int q;
    public Object r;
    public final Object s;

    public d(int v, Object object0, Continuation continuation0) {
        this.o = v;
        this.s = object0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.o != 0) {
            d d0 = new d(1, ((t2)this.s), ((Continuation)object2));
            d0.r = (FlowCollector)object0;
            d0.q = ((Number)object1).intValue();
            return d0.invokeSuspend(Unit.INSTANCE);
        }
        d d1 = new d(0, ((State)this.s), ((Continuation)object2));
        d1.r = (Filter)object0;
        d1.q = ((Number)object1).intValue();
        return d1.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FlowCollector flowCollector0;
        if(this.o != 0) {
            Unit unit0 = a.getCOROUTINE_SUSPENDED();
            int v = this.p;
            t2 t20 = (t2)this.s;
            switch(v) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    flowCollector0 = (FlowCollector)this.r;
                    if(this.q > 0) {
                        this.p = 1;
                        return flowCollector0.emit(SharingCommand.START, this) == unit0 ? unit0 : Unit.INSTANCE;
                    }
                    this.r = flowCollector0;
                    this.p = 2;
                    if(DelayKt.delay(t20.a, this) != unit0) {
                    label_25:
                        if(t20.b <= 0L) {
                            this.r = null;
                            this.p = 5;
                            return flowCollector0.emit(SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == unit0 ? unit0 : Unit.INSTANCE;
                        }
                        this.r = flowCollector0;
                        this.p = 3;
                        if(flowCollector0.emit(SharingCommand.STOP, this) != unit0) {
                        label_29:
                            this.r = flowCollector0;
                            this.p = 4;
                            if(DelayKt.delay(t20.b, this) != unit0) {
                                this.r = null;
                                this.p = 5;
                                return flowCollector0.emit(SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == unit0 ? unit0 : Unit.INSTANCE;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    flowCollector0 = (FlowCollector)this.r;
                    ResultKt.throwOnFailure(object0);
                    goto label_25;
                }
                case 3: {
                    flowCollector0 = (FlowCollector)this.r;
                    ResultKt.throwOnFailure(object0);
                    goto label_29;
                }
                case 4: {
                    flowCollector0 = (FlowCollector)this.r;
                    ResultKt.throwOnFailure(object0);
                    this.r = null;
                    this.p = 5;
                    return flowCollector0.emit(SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == unit0 ? unit0 : Unit.INSTANCE;
                }
                case 1: 
                case 5: {
                    ResultKt.throwOnFailure(object0);
                    return Unit.INSTANCE;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            return unit0;
        }
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Filter filter0 = (Filter)this.r;
                int v1 = this.q;
                Function4 function40 = FilterScreenKt.access$FilterScreen$lambda$0(((State)this.s)).getGetThumbnail();
                String s = FilterScreenKt.access$FilterScreen$lambda$0(((State)this.s)).getPhoto().getOriginalUri();
                this.p = 1;
                object0 = function40.invoke(s, filter0, Boxing.boxInt(v1), this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

