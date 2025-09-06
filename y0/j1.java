package y0;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import jeb.synthetic.FIN;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class j1 extends SuspendLambda implements Function2 {
    public MutableScatterSet o;
    public Function1 p;
    public Channel q;
    public ObserverHandle r;
    public Object s;
    public int t;
    public Object u;
    public final Function0 v;

    public j1(Function0 function00, Continuation continuation0) {
        this.v = function00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j1(this.v, continuation0);
        continuation1.u = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j1)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object5;
        Snapshot snapshot3;
        Snapshot snapshot2;
        long[] arr_v1;
        ObserverHandle observerHandle1;
        boolean z;
        Set set0;
        Object object4;
        Object object3;
        Object object2;
        Snapshot snapshot1;
        int v;
        Snapshot snapshot0;
        ObserverHandle observerHandle0;
        Channel channel0;
        Function1 function10;
        MutableScatterSet mutableScatterSet0;
        FlowCollector flowCollector0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Function0 function00 = this.v;
    alab1:
        switch(this.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = (FlowCollector)this.u;
                mutableScatterSet0 = new MutableScatterSet(0, 1, null);
                function10 = new h1(mutableScatterSet0);
                channel0 = ChannelKt.Channel$default(0x7FFFFFFF, null, null, 6, null);
                i1 i10 = new i1(channel0);
                observerHandle0 = Snapshot.Companion.registerApplyObserver(i10);
                try {
                    snapshot0 = Snapshot.Companion.takeSnapshot(function10);
                    v = FIN.finallyOpen$NT();
                    snapshot1 = snapshot0.makeCurrent();
                }
                catch(Throwable throwable0) {
                    goto label_139;
                }
                try {
                    object2 = function00.invoke();
                    goto label_20;
                }
                catch(Throwable throwable1) {
                    try {
                        snapshot0.restoreCurrent(snapshot1);
                        FIN.finallyExec$NT(v);
                        throw throwable1;
                    label_20:
                        snapshot0.restoreCurrent(snapshot1);
                        FIN.finallyCodeBegin$NT(v);
                        snapshot0.dispose();
                        FIN.finallyCodeEnd$NT(v);
                        this.u = flowCollector0;
                        this.o = mutableScatterSet0;
                        this.p = function10;
                        this.q = channel0;
                        this.r = observerHandle0;
                        this.s = object2;
                        this.t = 1;
                        if(flowCollector0.emit(object2, this) == object1) {
                            return object1;
                        }
                        object3 = object2;
                        goto label_58;
                    }
                    catch(Throwable throwable0) {
                        goto label_139;
                    }
                }
            }
            case 1: {
                object3 = this.s;
                observerHandle0 = this.r;
                channel0 = this.q;
                function10 = this.p;
                mutableScatterSet0 = this.o;
                flowCollector0 = (FlowCollector)this.u;
                goto label_57;
            }
            case 2: {
                object3 = this.s;
                observerHandle0 = this.r;
                channel0 = this.q;
                function10 = this.p;
                mutableScatterSet0 = this.o;
                flowCollector0 = (FlowCollector)this.u;
                try {
                    ResultKt.throwOnFailure(object0);
                    object4 = object0;
                    goto label_68;
                }
                catch(Throwable throwable0) {
                    goto label_139;
                }
            }
            case 3: {
                object3 = this.s;
                observerHandle0 = this.r;
                channel0 = this.q;
                function10 = this.p;
                mutableScatterSet0 = this.o;
                flowCollector0 = (FlowCollector)this.u;
                try {
                label_57:
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                    label_58:
                        this.u = flowCollector0;
                        this.o = mutableScatterSet0;
                        this.p = function10;
                        this.q = channel0;
                        this.r = observerHandle0;
                        this.s = object3;
                        this.t = 2;
                        object4 = channel0.receive(this);
                        if(object4 == object1) {
                            return object1;
                        }
                    label_68:
                        set0 = (Set)object4;
                        z = false;
                        break alab1;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_139;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    label_70:
        if(z) {
            goto label_104;
        }
        else {
            Object[] arr_object = mutableScatterSet0.elements;
            long[] arr_v = mutableScatterSet0.metadata;
            int v1 = arr_v.length - 2;
            observerHandle1 = observerHandle0;
            if(v1 >= 0) {
                int v2 = 0;
                try {
                    while(true) {
                        long v3 = arr_v[v2];
                        int v4 = v2;
                        if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_95;
                        }
                        int v5 = 8 - (~(v4 - v1) >>> 0x1F);
                        int v6 = 0;
                        while(v6 < v5) {
                            if((v3 & 0xFFL) >= 0x80L) {
                                arr_v1 = arr_v;
                            }
                            else {
                                arr_v1 = arr_v;
                                if(!set0.contains(arr_object[(v4 << 3) + v6])) {
                                    goto label_88;
                                }
                                goto label_105;
                            }
                        label_88:
                            v3 >>= 8;
                            ++v6;
                            arr_v = arr_v1;
                        }
                        long[] arr_v2 = arr_v;
                        if(v5 == 8) {
                            goto label_96;
                        label_95:
                            arr_v2 = arr_v;
                        label_96:
                            if(v4 != v1) {
                                v2 = v4 + 1;
                                arr_v = arr_v2;
                                continue;
                            }
                            break;
                        }
                        goto label_102;
                    }
                    z = false;
                    goto label_106;
                label_102:
                    z = false;
                    goto label_106;
                label_104:
                    observerHandle1 = observerHandle0;
                label_105:
                    z = true;
                label_106:
                    set0 = (Set)ChannelResult.getOrNull-impl(channel0.tryReceive-PtdJZtk());
                    if(set0 != null) {
                        goto label_145;
                    }
                    if(z) {
                        mutableScatterSet0.clear();
                        snapshot2 = Snapshot.Companion.takeSnapshot(function10);
                        goto label_111;
                    }
                    goto label_143;
                }
                catch(Throwable throwable0) {
                    goto label_148;
                }
            }
            goto label_102;
        }
        goto label_105;
        try {
        label_111:
            snapshot3 = snapshot2.makeCurrent();
        }
        catch(Throwable throwable2) {
            goto label_123;
        }
        try {
            object5 = function00.invoke();
        }
        catch(Throwable throwable3) {
            try {
                observerHandle0 = observerHandle1;
                snapshot2.restoreCurrent(snapshot3);
                throw throwable3;
            }
            catch(Throwable throwable2) {
                goto label_124;
            }
        }
        try {
            snapshot2.restoreCurrent(snapshot3);
            goto label_126;
        }
        catch(Throwable throwable2) {
        label_123:
            observerHandle0 = observerHandle1;
        }
        try {
        label_124:
            snapshot2.dispose();
            throw throwable2;
        }
        catch(Throwable throwable0) {
            goto label_139;
        }
        try {
        label_126:
            snapshot2.dispose();
            if(!Intrinsics.areEqual(object5, object3)) {
                this.u = flowCollector0;
                this.o = mutableScatterSet0;
                this.p = function10;
                this.q = channel0;
                observerHandle0 = observerHandle1;
                goto label_133;
            }
            goto label_143;
        }
        catch(Throwable throwable0) {
            goto label_148;
        }
        try {
        label_133:
            this.r = observerHandle0;
            this.s = object5;
            this.t = 3;
            if(flowCollector0.emit(object5, this) == object1) {
                return object1;
            }
        }
        catch(Throwable throwable0) {
        label_139:
            goto label_149;
        }
        object3 = object5;
        goto label_58;
        try {
        label_143:
            observerHandle0 = observerHandle1;
            goto label_58;
        label_145:
            observerHandle0 = observerHandle1;
            goto label_70;
        label_148:
            observerHandle0 = observerHandle1;
        }
        catch(Throwable throwable0) {
            goto label_148;
        }
    label_149:
        observerHandle0.dispose();
        throw throwable0;
    }
}

