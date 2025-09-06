package y0;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k0 extends SuspendLambda implements Function3 {
    public List o;
    public List p;
    public List q;
    public MutableScatterSet r;
    public MutableScatterSet s;
    public MutableScatterSet t;
    public Set u;
    public MutableScatterSet v;
    public int w;
    public MonotonicFrameClock x;
    public final Recomposer y;

    public k0(Recomposer recomposer0, Continuation continuation0) {
        this.y = recomposer0;
        super(3, continuation0);
    }

    public static final void a(Recomposer recomposer0, List list0, List list1, List list2, MutableScatterSet mutableScatterSet0, MutableScatterSet mutableScatterSet1, MutableScatterSet mutableScatterSet2, MutableScatterSet mutableScatterSet3) {
        synchronized(recomposer0.c) {
            list0.clear();
            list1.clear();
            int v1 = list2.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ControlledComposition controlledComposition0 = (ControlledComposition)list2.get(v2);
                controlledComposition0.abandonChanges();
                recomposer0.l(controlledComposition0);
            }
            list2.clear();
            Object[] arr_object = mutableScatterSet0.elements;
            long[] arr_v = mutableScatterSet0.metadata;
            int v3 = arr_v.length - 2;
            if(v3 >= 0) {
                int v4 = 0;
                while(true) {
                    long v5 = arr_v[v4];
                    if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_32;
                    }
                    int v6 = 8 - (~(v4 - v3) >>> 0x1F);
                    for(int v7 = 0; v7 < v6; ++v7) {
                        if((v5 & 0xFFL) < 0x80L) {
                            ControlledComposition controlledComposition1 = (ControlledComposition)arr_object[(v4 << 3) + v7];
                            controlledComposition1.abandonChanges();
                            recomposer0.l(controlledComposition1);
                        }
                        v5 >>= 8;
                    }
                    if(v6 == 8) {
                    label_32:
                        if(v4 != v3) {
                            ++v4;
                            continue;
                        }
                    }
                    goto label_35;
                }
            }
            else {
            label_35:
                mutableScatterSet0.clear();
                Object[] arr_object1 = mutableScatterSet1.elements;
                long[] arr_v1 = mutableScatterSet1.metadata;
                int v8 = arr_v1.length - 2;
                if(v8 >= 0) {
                    int v9 = 0;
                    while(true) {
                        long v10 = arr_v1[v9];
                        if((~v10 << 7 & v10 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_52;
                        }
                        int v11 = 8 - (~(v9 - v8) >>> 0x1F);
                        for(int v12 = 0; v12 < v11; ++v12) {
                            if((v10 & 0xFFL) < 0x80L) {
                                ((ControlledComposition)arr_object1[(v9 << 3) + v12]).changesApplied();
                            }
                            v10 >>= 8;
                        }
                        if(v11 == 8) {
                        label_52:
                            if(v9 != v8) {
                                ++v9;
                                continue;
                            }
                        }
                        goto label_55;
                    }
                }
                else {
                label_55:
                    mutableScatterSet1.clear();
                    mutableScatterSet2.clear();
                    Object[] arr_object2 = mutableScatterSet3.elements;
                    long[] arr_v2 = mutableScatterSet3.metadata;
                    int v13 = arr_v2.length - 2;
                    if(v13 >= 0) {
                        int v14 = 0;
                        while(true) {
                            long v15 = arr_v2[v14];
                            if((~v15 << 7 & v15 & 0x8080808080808080L) != 0x8080808080808080L) {
                                int v16 = 8 - (~(v14 - v13) >>> 0x1F);
                                for(int v17 = 0; v17 < v16; ++v17) {
                                    if((v15 & 0xFFL) < 0x80L) {
                                        ControlledComposition controlledComposition2 = (ControlledComposition)arr_object2[(v14 << 3) + v17];
                                        controlledComposition2.abandonChanges();
                                        recomposer0.l(controlledComposition2);
                                    }
                                    v15 >>= 8;
                                }
                                if(v16 == 8) {
                                    goto label_75;
                                }
                                break;
                            }
                        label_75:
                            if(v14 == v13) {
                                break;
                            }
                            ++v14;
                        }
                    }
                }
            }
            mutableScatterSet3.clear();
        }
    }

    public static final void b(List list0, Recomposer recomposer0) {
        list0.clear();
        synchronized(recomposer0.c) {
            List list1 = recomposer0.k;
            int v1 = list1.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                list0.add(((MovableContentStateReference)list1.get(v2)));
            }
            recomposer0.k.clear();
        }
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        k0 k00 = new k0(this.y, ((Continuation)object2));
        k00.x = (MonotonicFrameClock)object1;
        return k00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        MutableScatterSet mutableScatterSet11;
        MutableScatterSet mutableScatterSet10;
        List list8;
        List list7;
        List list6;
        MutableScatterSet mutableScatterSet9;
        MutableScatterSet mutableScatterSet8;
        Set set2;
        MutableScatterSet mutableScatterSet3;
        Set set0;
        MutableScatterSet mutableScatterSet2;
        MutableScatterSet mutableScatterSet1;
        MutableScatterSet mutableScatterSet0;
        List list2;
        List list1;
        List list0;
        MonotonicFrameClock monotonicFrameClock0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Recomposer recomposer0 = this.y;
        switch(this.w) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                monotonicFrameClock0 = this.x;
                list0 = new ArrayList();
                list1 = new ArrayList();
                list2 = new ArrayList();
                mutableScatterSet0 = ScatterSetKt.mutableScatterSetOf();
                mutableScatterSet1 = ScatterSetKt.mutableScatterSetOf();
                mutableScatterSet2 = new MutableScatterSet(0, 1, null);
                set0 = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet2);
                mutableScatterSet3 = ScatterSetKt.mutableScatterSetOf();
                goto label_56;
            }
            case 1: {
                MutableScatterSet mutableScatterSet4 = this.v;
                Set set1 = this.u;
                MutableScatterSet mutableScatterSet5 = this.t;
                MutableScatterSet mutableScatterSet6 = this.s;
                MutableScatterSet mutableScatterSet7 = this.r;
                List list3 = this.q;
                List list4 = this.p;
                List list5 = this.o;
                MonotonicFrameClock monotonicFrameClock1 = this.x;
                ResultKt.throwOnFailure(object0);
                set2 = set1;
                mutableScatterSet8 = mutableScatterSet5;
                mutableScatterSet9 = mutableScatterSet7;
                list6 = list3;
                list7 = list4;
                list8 = list5;
                mutableScatterSet10 = mutableScatterSet4;
                monotonicFrameClock0 = monotonicFrameClock1;
                mutableScatterSet11 = mutableScatterSet6;
                goto label_77;
            }
            case 2: {
                MutableScatterSet mutableScatterSet12 = this.v;
                Set set3 = this.u;
                MutableScatterSet mutableScatterSet13 = this.t;
                MutableScatterSet mutableScatterSet14 = this.s;
                mutableScatterSet0 = this.r;
                List list9 = this.q;
                List list10 = this.p;
                List list11 = this.o;
                MonotonicFrameClock monotonicFrameClock2 = this.x;
                ResultKt.throwOnFailure(object0);
                list7 = list10;
                list8 = list11;
                set0 = set3;
                mutableScatterSet2 = mutableScatterSet13;
                mutableScatterSet3 = mutableScatterSet12;
                monotonicFrameClock0 = monotonicFrameClock2;
                mutableScatterSet1 = mutableScatterSet14;
                list2 = list9;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            Recomposer.access$discardUnusedValues(recomposer0);
            list0 = list8;
            list1 = list7;
            while(true) {
            label_56:
                if(!Recomposer.access$getShouldKeepRecomposing(recomposer0)) {
                    break alab1;
                }
                this.x = monotonicFrameClock0;
                this.o = list0;
                this.p = list1;
                this.q = list2;
                this.r = mutableScatterSet0;
                this.s = mutableScatterSet1;
                this.t = mutableScatterSet2;
                this.u = set0;
                this.v = mutableScatterSet3;
                this.w = 1;
                if(Recomposer.access$awaitWorkAvailable(recomposer0, this) == object1) {
                    return object1;
                }
                list8 = list0;
                list7 = list1;
                list6 = list2;
                mutableScatterSet9 = mutableScatterSet0;
                mutableScatterSet8 = mutableScatterSet2;
                set2 = set0;
                mutableScatterSet10 = mutableScatterSet3;
                mutableScatterSet11 = mutableScatterSet1;
            label_77:
                if(Recomposer.access$recordComposerModifications(recomposer0)) {
                    j0 j00 = new j0(this.y, mutableScatterSet8, mutableScatterSet10, list8, list7, mutableScatterSet9, list6, mutableScatterSet11, set2);
                    this.x = monotonicFrameClock0;
                    this.o = list8;
                    this.p = list7;
                    this.q = list6;
                    this.r = mutableScatterSet9;
                    this.s = mutableScatterSet11;
                    this.t = mutableScatterSet8;
                    this.u = set2;
                    this.v = mutableScatterSet10;
                    this.w = 2;
                    if(monotonicFrameClock0.withFrameNanos(j00, this) == object1) {
                        return object1;
                    }
                    mutableScatterSet0 = mutableScatterSet9;
                    mutableScatterSet3 = mutableScatterSet10;
                    mutableScatterSet2 = mutableScatterSet8;
                    mutableScatterSet1 = mutableScatterSet11;
                    list2 = list6;
                    set0 = set2;
                    break;
                }
                mutableScatterSet0 = mutableScatterSet9;
                mutableScatterSet3 = mutableScatterSet10;
                mutableScatterSet2 = mutableScatterSet8;
                mutableScatterSet1 = mutableScatterSet11;
                list0 = list8;
                list1 = list7;
                list2 = list6;
                set0 = set2;
            }
        }
        return Unit.INSTANCE;
    }
}

