package androidx.paging;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.l;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import qd.a;
import s4.s;
import s4.t;

public final class m {
    public final FlattenedPageEventStorage a;
    public final Mutex b;
    public int c;

    public m() {
        this.a = new FlattenedPageEventStorage();
        this.b = MutexKt.Mutex$default(false, 1, null);
        this.c = -1;
    }

    public final Object a(ContinuationImpl continuationImpl0) {
        Mutex mutex1;
        m m0;
        s s0;
        if(continuationImpl0 instanceof s) {
            s0 = (s)continuationImpl0;
            int v = s0.s;
            if((v & 0x80000000) == 0) {
                s0 = new s(this, continuationImpl0);
            }
            else {
                s0.s = v ^ 0x80000000;
            }
        }
        else {
            s0 = new s(this, continuationImpl0);
        }
        Object object0 = s0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                s0.o = this;
                Mutex mutex0 = this.b;
                s0.p = mutex0;
                s0.s = 1;
                if(mutex0.lock(null, s0) == object1) {
                    return object1;
                }
                m0 = this;
                mutex1 = mutex0;
                break;
            }
            case 1: {
                mutex1 = s0.p;
                m0 = s0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            List list0 = m0.a.getAsEvents();
            int v2 = m0.c;
            int v3 = list0.size();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            int v4 = 0;
            for(Object object2: list0) {
                if(v4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList0.add(new IndexedValue(v4 + (v2 - v3 + 1), ((PageEvent)object2)));
                ++v4;
            }
            return arrayList0;
        }
        finally {
            mutex1.unlock(null);
        }
    }

    public final Object b(IndexedValue indexedValue0, ContinuationImpl continuationImpl0) {
        m m0;
        Mutex mutex0;
        t t0;
        if(continuationImpl0 instanceof t) {
            t0 = (t)continuationImpl0;
            int v = t0.t;
            if((v & 0x80000000) == 0) {
                t0 = new t(this, continuationImpl0);
            }
            else {
                t0.t = v ^ 0x80000000;
            }
        }
        else {
            t0 = new t(this, continuationImpl0);
        }
        Object object0 = t0.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(t0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                t0.o = this;
                t0.p = indexedValue0;
                mutex0 = this.b;
                t0.q = mutex0;
                t0.t = 1;
                if(mutex0.lock(null, t0) == object1) {
                    return object1;
                }
                m0 = this;
                break;
            }
            case 1: {
                Mutex mutex1 = t0.q;
                IndexedValue indexedValue1 = t0.p;
                m0 = t0.o;
                ResultKt.throwOnFailure(object0);
                mutex0 = mutex1;
                indexedValue0 = indexedValue1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            m0.c = indexedValue0.getIndex();
            m0.a.add(((PageEvent)indexedValue0.getValue()));
            return Unit.INSTANCE;
        }
        finally {
            mutex0.unlock(null);
        }
    }
}

