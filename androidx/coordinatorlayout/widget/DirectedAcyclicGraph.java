package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools.SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({Scope.LIBRARY})
public final class DirectedAcyclicGraph {
    public final SimplePool a;
    public final SimpleArrayMap b;
    public final ArrayList c;
    public final HashSet d;

    public DirectedAcyclicGraph() {
        this.a = new SimplePool(10);
        this.b = new SimpleArrayMap();
        this.c = new ArrayList();
        this.d = new HashSet();
    }

    public final void a(Object object0, ArrayList arrayList0, HashSet hashSet0) {
        if(arrayList0.contains(object0)) {
            return;
        }
        if(hashSet0.contains(object0)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet0.add(object0);
        ArrayList arrayList1 = (ArrayList)this.b.get(object0);
        if(arrayList1 != null) {
            int v = arrayList1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                this.a(arrayList1.get(v1), arrayList0, hashSet0);
            }
        }
        hashSet0.remove(object0);
        arrayList0.add(object0);
    }

    public void addEdge(@NonNull Object object0, @NonNull Object object1) {
        SimpleArrayMap simpleArrayMap0 = this.b;
        if(!simpleArrayMap0.containsKey(object0) || !simpleArrayMap0.containsKey(object1)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList0 = (ArrayList)simpleArrayMap0.get(object0);
        if(arrayList0 == null) {
            arrayList0 = (ArrayList)this.a.acquire();
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
            }
            simpleArrayMap0.put(object0, arrayList0);
        }
        arrayList0.add(object1);
    }

    public void addNode(@NonNull Object object0) {
        SimpleArrayMap simpleArrayMap0 = this.b;
        if(!simpleArrayMap0.containsKey(object0)) {
            simpleArrayMap0.put(object0, null);
        }
    }

    public void clear() {
        SimpleArrayMap simpleArrayMap0 = this.b;
        int v = simpleArrayMap0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ArrayList arrayList0 = (ArrayList)simpleArrayMap0.valueAt(v1);
            if(arrayList0 != null) {
                arrayList0.clear();
                this.a.release(arrayList0);
            }
        }
        simpleArrayMap0.clear();
    }

    public boolean contains(@NonNull Object object0) {
        return this.b.containsKey(object0);
    }

    @Nullable
    public List getIncomingEdges(@NonNull Object object0) {
        return (List)this.b.get(object0);
    }

    @Nullable
    public List getOutgoingEdges(@NonNull Object object0) {
        SimpleArrayMap simpleArrayMap0 = this.b;
        int v = simpleArrayMap0.size();
        List list0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            ArrayList arrayList0 = (ArrayList)simpleArrayMap0.valueAt(v1);
            if(arrayList0 != null && arrayList0.contains(object0)) {
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                ((ArrayList)list0).add(simpleArrayMap0.keyAt(v1));
            }
        }
        return list0;
    }

    @NonNull
    public ArrayList getSortedList() {
        ArrayList arrayList0 = this.c;
        arrayList0.clear();
        HashSet hashSet0 = this.d;
        hashSet0.clear();
        SimpleArrayMap simpleArrayMap0 = this.b;
        int v = simpleArrayMap0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.a(simpleArrayMap0.keyAt(v1), arrayList0, hashSet0);
        }
        return arrayList0;
    }

    public boolean hasOutgoingEdges(@NonNull Object object0) {
        SimpleArrayMap simpleArrayMap0 = this.b;
        int v = simpleArrayMap0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ArrayList arrayList0 = (ArrayList)simpleArrayMap0.valueAt(v1);
            if(arrayList0 != null && arrayList0.contains(object0)) {
                return true;
            }
        }
        return false;
    }
}

