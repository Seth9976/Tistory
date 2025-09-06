package androidx.compose.material3;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class zf extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final DrawerPredictiveBackState q;
    public final CoroutineScope r;
    public final DrawerState s;
    public final boolean t;
    public final FloatRef u;
    public final FloatRef v;
    public final FloatRef w;

    public zf(DrawerPredictiveBackState drawerPredictiveBackState0, CoroutineScope coroutineScope0, DrawerState drawerState0, boolean z, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1, FloatRef ref$FloatRef2, Continuation continuation0) {
        this.q = drawerPredictiveBackState0;
        this.r = coroutineScope0;
        this.s = drawerState0;
        this.t = z;
        this.u = ref$FloatRef0;
        this.v = ref$FloatRef1;
        this.w = ref$FloatRef2;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new zf(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((zf)this.create(((Flow)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Throwable throwable0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        DrawerState drawerState0 = this.s;
        DrawerPredictiveBackState drawerPredictiveBackState0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = (Flow)this.p;
                try {
                    xf xf0 = new xf(this.q, this.t, this.u, this.v, this.w);
                    this.o = 1;
                    if(flow0.collect(xf0, this) != object1) {
                        goto label_35;
                    }
                    return object1;
                }
                catch(CancellationException unused_ex) {
                    try {
                    label_18:
                        drawerPredictiveBackState0.clear();
                    }
                    catch(Throwable throwable0) {
                        goto label_26;
                    }
                    if(drawerPredictiveBackState0.getSwipeEdgeMatchesDrawer()) {
                        yf yf0 = new yf(drawerPredictiveBackState0, null);
                        BuildersKt.launch$default(this.r, null, null, yf0, 3, null);
                    }
                    this.o = 3;
                    if(drawerState0.close(this) == object1) {
                        return object1;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                label_26:
                    if(drawerPredictiveBackState0.getSwipeEdgeMatchesDrawer()) {
                        yf yf1 = new yf(drawerPredictiveBackState0, null);
                        BuildersKt.launch$default(this.r, null, null, yf1, 3, null);
                    }
                    this.p = throwable0;
                    this.o = 4;
                    if(drawerState0.close(this) == object1) {
                        return object1;
                    }
                }
                throw throwable0;
            label_35:
                if(drawerPredictiveBackState0.getSwipeEdgeMatchesDrawer()) {
                    yf yf2 = new yf(drawerPredictiveBackState0, null);
                    BuildersKt.launch$default(this.r, null, null, yf2, 3, null);
                }
                this.o = 2;
                if(drawerState0.close(this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_35;
                }
                catch(CancellationException unused_ex) {
                    goto label_18;
                }
                catch(Throwable throwable0) {
                    goto label_26;
                }
            }
            case 2: 
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 4: {
                throwable0 = (Throwable)this.p;
                ResultKt.throwOnFailure(object0);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

