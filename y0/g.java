package y0;

import androidx.collection.MutableIntList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class g implements RememberManager {
    public final Set a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public MutableScatterSet e;
    public final ArrayList f;
    public final MutableIntList g;
    public final MutableIntList h;

    public g(Set set0) {
        this.a = set0;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new ArrayList();
        this.g = new MutableIntList(0, 1, null);
        this.h = new MutableIntList(0, 1, null);
    }

    public final void a() {
        Set set0 = this.a;
        if(!set0.isEmpty()) {
            Object object0 = Trace.INSTANCE.beginSection("Compose:abandons");
            try {
                Iterator iterator0 = set0.iterator();
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    iterator0.remove();
                    ((RememberObserver)object1).onAbandoned();
                }
            }
            finally {
                Trace.INSTANCE.endSection(object0);
            }
        }
    }

    public final void b() {
        this.d(0x80000000);
        ArrayList arrayList0 = this.c;
        Set set0 = this.a;
        if(!arrayList0.isEmpty()) {
            Object object0 = Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                MutableScatterSet mutableScatterSet0 = this.e;
                for(int v1 = arrayList0.size() - 1; -1 < v1; --v1) {
                    Object object1 = arrayList0.get(v1);
                    if(object1 instanceof RememberObserver) {
                        set0.remove(object1);
                        ((RememberObserver)object1).onForgotten();
                    }
                    if(object1 instanceof ComposeNodeLifecycleCallback) {
                        if(mutableScatterSet0 == null || !mutableScatterSet0.contains(object1)) {
                            ((ComposeNodeLifecycleCallback)object1).onDeactivate();
                        }
                        else {
                            ((ComposeNodeLifecycleCallback)object1).onRelease();
                        }
                    }
                }
            }
            finally {
                Trace.INSTANCE.endSection(object0);
            }
        }
        ArrayList arrayList1 = this.b;
        if(!arrayList1.isEmpty()) {
            Object object2 = Trace.INSTANCE.beginSection("Compose:onRemembered");
            try {
                int v3 = arrayList1.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    RememberObserver rememberObserver0 = (RememberObserver)arrayList1.get(v4);
                    set0.remove(rememberObserver0);
                    rememberObserver0.onRemembered();
                }
            }
            finally {
                Trace.INSTANCE.endSection(object2);
            }
        }
    }

    public final void c() {
        ArrayList arrayList0 = this.d;
        if(!arrayList0.isEmpty()) {
            Object object0 = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((Function0)arrayList0.get(v2)).invoke();
                }
                arrayList0.clear();
            }
            finally {
                Trace.INSTANCE.endSection(object0);
            }
        }
    }

    public final void d(int v) {
        ArrayList arrayList0 = this.f;
        if(!arrayList0.isEmpty()) {
            int v2 = 0;
            List list0 = null;
            MutableIntList mutableIntList0 = null;
            MutableIntList mutableIntList1 = null;
            while(true) {
                MutableIntList mutableIntList2 = this.h;
                if(v2 >= mutableIntList2.getSize()) {
                    break;
                }
                if(v <= mutableIntList2.get(v2)) {
                    Object object0 = arrayList0.remove(v2);
                    int v3 = mutableIntList2.removeAt(v2);
                    int v4 = this.g.removeAt(v2);
                    if(list0 == null) {
                        list0 = CollectionsKt__CollectionsKt.mutableListOf(new Object[]{object0});
                        mutableIntList1 = new MutableIntList(0, 1, null);
                        mutableIntList1.add(v3);
                        mutableIntList0 = new MutableIntList(0, 1, null);
                    }
                    else {
                        Intrinsics.checkNotNull(mutableIntList0, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        Intrinsics.checkNotNull(mutableIntList1, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        list0.add(object0);
                        mutableIntList1.add(v3);
                    }
                    mutableIntList0.add(v4);
                }
                else {
                    ++v2;
                }
            }
            if(list0 != null) {
                Intrinsics.checkNotNull(mutableIntList0, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                Intrinsics.checkNotNull(mutableIntList1, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int v5 = list0.size();
                for(int v1 = 0; v1 < v5 - 1; ++v1) {
                    int v6 = list0.size();
                    for(int v7 = v1 + 1; v7 < v6; ++v7) {
                        int v8 = mutableIntList1.get(v1);
                        int v9 = mutableIntList1.get(v7);
                        if(v8 < v9 || v9 == v8 && mutableIntList0.get(v1) < mutableIntList0.get(v7)) {
                            CompositionKt.access$swap(list0, v1, v7);
                            CompositionKt.access$swap(mutableIntList0, v1, v7);
                            CompositionKt.access$swap(mutableIntList1, v1, v7);
                        }
                    }
                }
                this.c.addAll(list0);
            }
        }
    }

    @Override  // androidx.compose.runtime.RememberManager
    public final void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback0, int v, int v1, int v2) {
        this.e(v, v1, v2, composeNodeLifecycleCallback0);
    }

    public final void e(int v, int v1, int v2, Object object0) {
        this.d(v);
        if(v2 >= 0 && v2 < v) {
            this.f.add(object0);
            this.g.add(v1);
            this.h.add(v2);
            return;
        }
        this.c.add(object0);
    }

    @Override  // androidx.compose.runtime.RememberManager
    public final void forgetting(RememberObserver rememberObserver0, int v, int v1, int v2) {
        this.e(v, v1, v2, rememberObserver0);
    }

    @Override  // androidx.compose.runtime.RememberManager
    public final void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback0, int v, int v1, int v2) {
        MutableScatterSet mutableScatterSet0 = this.e;
        if(mutableScatterSet0 == null) {
            mutableScatterSet0 = ScatterSetKt.mutableScatterSetOf();
            this.e = mutableScatterSet0;
        }
        mutableScatterSet0.plusAssign(composeNodeLifecycleCallback0);
        this.e(v, v1, v2, composeNodeLifecycleCallback0);
    }

    @Override  // androidx.compose.runtime.RememberManager
    public final void remembering(RememberObserver rememberObserver0) {
        this.b.add(rememberObserver0);
    }

    @Override  // androidx.compose.runtime.RememberManager
    public final void sideEffect(Function0 function00) {
        this.d.add(function00);
    }
}

