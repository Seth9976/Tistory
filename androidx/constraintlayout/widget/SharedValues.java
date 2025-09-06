package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SharedValues {
    public interface SharedValuesListener {
        void onNewValue(int arg1, int arg2, int arg3);
    }

    public static final int UNSET = -1;
    public final SparseIntArray a;
    public final HashMap b;

    public SharedValues() {
        this.a = new SparseIntArray();
        this.b = new HashMap();
    }

    public void addListener(int v, SharedValuesListener sharedValues$SharedValuesListener0) {
        HashMap hashMap0 = this.b;
        HashSet hashSet0 = (HashSet)hashMap0.get(v);
        if(hashSet0 == null) {
            hashSet0 = new HashSet();
            hashMap0.put(v, hashSet0);
        }
        hashSet0.add(new WeakReference(sharedValues$SharedValuesListener0));
    }

    public void clearListeners() {
        this.b.clear();
    }

    public void fireNewValue(int v, int v1) {
        SparseIntArray sparseIntArray0 = this.a;
        int v2 = sparseIntArray0.get(v, -1);
        if(v2 == v1) {
            return;
        }
        sparseIntArray0.put(v, v1);
        HashSet hashSet0 = (HashSet)this.b.get(v);
        if(hashSet0 == null) {
            return;
        }
        boolean z = false;
        for(Object object0: hashSet0) {
            SharedValuesListener sharedValues$SharedValuesListener0 = (SharedValuesListener)((WeakReference)object0).get();
            if(sharedValues$SharedValuesListener0 == null) {
                z = true;
            }
            else {
                sharedValues$SharedValuesListener0.onNewValue(v, v1, v2);
            }
        }
        if(z) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: hashSet0) {
                WeakReference weakReference0 = (WeakReference)object1;
                if(((SharedValuesListener)weakReference0.get()) == null) {
                    arrayList0.add(weakReference0);
                }
            }
            hashSet0.removeAll(arrayList0);
        }
    }

    public int getValue(int v) {
        return this.a.get(v, -1);
    }

    public void removeListener(int v, SharedValuesListener sharedValues$SharedValuesListener0) {
        HashSet hashSet0 = (HashSet)this.b.get(v);
        if(hashSet0 == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: hashSet0) {
            WeakReference weakReference0 = (WeakReference)object0;
            SharedValuesListener sharedValues$SharedValuesListener1 = (SharedValuesListener)weakReference0.get();
            if(sharedValues$SharedValuesListener1 == null || sharedValues$SharedValuesListener1 == sharedValues$SharedValuesListener0) {
                arrayList0.add(weakReference0);
            }
        }
        hashSet0.removeAll(arrayList0);
    }

    public void removeListener(SharedValuesListener sharedValues$SharedValuesListener0) {
        for(Object object0: this.b.keySet()) {
            this.removeListener(((int)(((Integer)object0))), sharedValues$SharedValuesListener0);
        }
    }
}

