package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SpreadBuilder {
    public final ArrayList a;

    public SpreadBuilder(int v) {
        this.a = new ArrayList(v);
    }

    public void add(Object object0) {
        this.a.add(object0);
    }

    public void addSpread(Object object0) {
        if(object0 == null) {
            return;
        }
        ArrayList arrayList0 = this.a;
        if(object0 instanceof Object[]) {
            if(((Object[])object0).length <= 0) {
                return;
            }
            arrayList0.ensureCapacity(arrayList0.size() + ((Object[])object0).length);
            Collections.addAll(arrayList0, ((Object[])object0));
            return;
        }
        if(object0 instanceof Collection) {
            arrayList0.addAll(((Collection)object0));
            return;
        }
        if(object0 instanceof Iterable) {
            for(Object object1: ((Iterable)object0)) {
                arrayList0.add(object1);
            }
            return;
        }
        if(!(object0 instanceof Iterator)) {
            throw new UnsupportedOperationException("Don\'t know how to spread " + object0.getClass());
        }
        while(((Iterator)object0).hasNext()) {
            Object object2 = ((Iterator)object0).next();
            arrayList0.add(object2);
        }
    }

    public int size() {
        return this.a.size();
    }

    public Object[] toArray(Object[] arr_object) {
        return this.a.toArray(arr_object);
    }
}

