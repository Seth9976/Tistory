package y0;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import java.util.List;
import java.util.Set;
import jeb.synthetic.FIN;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job.Key;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import qd.a;

public final class n0 extends SuspendLambda implements Function3 {
    public Job o;
    public int p;
    public Object q;
    public Object r;
    public final CoroutineContext s;
    public final Recomposer t;

    public n0(CoroutineContext coroutineContext0, Recomposer recomposer0, Continuation continuation0) {
        this.s = coroutineContext0;
        this.t = recomposer0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        n0 n00 = new n0(this.s, this.t, ((Continuation)object2));
        n00.q = (CoroutineScope)object0;
        n00.r = (MonotonicFrameClock)object1;
        return n00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Continuation continuation0;
        MutableScatterSet mutableScatterSet0;
        Job job2;
        int v6;
        Recomposer recomposer1;
        b0 b01;
        CoroutineScope coroutineScope2;
        Job job0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.q;
                MonotonicFrameClock monotonicFrameClock0 = (MonotonicFrameClock)this.r;
                Key job$Key0 = Job.Key;
                boolean z = this.s.get(job$Key0) == null;
                CoroutineContext coroutineContext0 = this.s;
                if(!z) {
                    PreconditionsKt.throwIllegalArgumentException(("recomposeCoroutineContext may not contain a Job; found " + coroutineContext0.get(job$Key0)));
                }
                CoroutineScope coroutineScope1 = CoroutineScopeKt.CoroutineScope(coroutineScope0.getCoroutineContext().plus(this.s).plus(JobKt.Job(JobKt.getJob(coroutineScope0.getCoroutineContext()))));
                b0 b00 = new b0();  // 初始化器: Ljava/lang/Object;-><init>()V
                job0 = BuildersKt.launch$default(coroutineScope0, null, null, new m0(this.t, monotonicFrameClock0, b00, null), 3, null);
                coroutineScope2 = coroutineScope1;
                b01 = b00;
                goto label_79;
            }
            case 1: {
                job0 = this.o;
                b01 = (b0)this.r;
                coroutineScope2 = (CoroutineScope)this.q;
                ResultKt.throwOnFailure(object0);
                while(true) {
                    Recomposer recomposer0 = this.t;
                    synchronized(recomposer0.c) {
                        mutableScatterSet0 = recomposer0.h;
                        if(mutableScatterSet0.isNotEmpty()) {
                            recomposer0.h = new MutableScatterSet(0, 1, null);
                        }
                    }
                    Set set0 = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet0);
                    if(!set0.isEmpty()) {
                        List list0 = recomposer0.e();
                        int v1 = list0.size();
                        for(int v2 = 0; v2 < v1; ++v2) {
                            ((ControlledComposition)list0.get(v2)).recordModificationsOf(set0);
                        }
                    }
                    MutableVector mutableVector0 = recomposer0.i;
                    int v3 = mutableVector0.getSize();
                    if(v3 > 0) {
                        Object[] arr_object = mutableVector0.getContent();
                        int v4 = 0;
                        while(true) {
                            ControlledComposition controlledComposition0 = (ControlledComposition)arr_object[v4];
                            synchronized(recomposer0.c) {
                                ++recomposer0.q;
                            }
                            recomposer1 = recomposer0;
                            BuildersKt.launch$default(coroutineScope2, CompositionKt.getRecomposeCoroutineContext(controlledComposition0), null, new l0(recomposer0, controlledComposition0, null), 2, null);
                            if(v4 + 1 >= v3) {
                                break;
                            }
                            ++v4;
                            recomposer0 = recomposer1;
                        }
                    }
                    else {
                        recomposer1 = recomposer0;
                    }
                    recomposer1.i.clear();
                    Object object4 = recomposer1.c;
                    __monitor_enter(object4);
                    v6 = FIN.finallyOpen$NT();
                    if(recomposer1.b() == null) {
                        FIN.finallyCodeBegin$NT(v6);
                        __monitor_exit(object4);
                        FIN.finallyCodeEnd$NT(v6);
                        synchronized(this.t.c) {
                            continuation0 = Recomposer.access$getHasConcurrentFrameWorkLocked(this.t) ? b01.a() : null;
                        }
                        if(continuation0 != null) {
                            continuation0.resumeWith(Unit.INSTANCE);
                        }
                    label_79:
                        if(Recomposer.access$getShouldKeepRecomposing(this.t)) {
                            this.q = coroutineScope2;
                            this.r = b01;
                            this.o = job0;
                            this.p = 1;
                            if(Recomposer.access$awaitWorkAvailable(this.t, this) != object1) {
                                continue;
                            }
                            break;
                        }
                        goto label_86;
                    }
                    goto label_95;
                }
                return object1;
            label_86:
                Job job1 = JobKt.getJob(coroutineScope2.getCoroutineContext());
                this.q = job0;
                this.r = null;
                this.o = null;
                this.p = 2;
                if(JobKt.cancelAndJoin(job1, this) == object1) {
                    return object1;
                }
                job2 = job0;
                break;
            label_95:
                FIN.finallyExec$NT(v6);
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
            }
            case 2: {
                job2 = (Job)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.q = null;
        this.p = 3;
        return JobKt.cancelAndJoin(job2, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

