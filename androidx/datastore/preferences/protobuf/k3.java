package androidx.datastore.preferences.protobuf;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.t1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.l;
import r.c;

public class k3 extends AbstractSet {
    public final int a;
    public final Map b;

    public k3(Map map0, int v) {
        this.a = v;
        this.b = map0;
        super();
    }

    @Override
    public boolean add(Object object0) {
        switch(this.a) {
            case 0: {
                if(!this.contains(((Map.Entry)object0))) {
                    Comparable comparable0 = (Comparable)((Map.Entry)object0).getKey();
                    Object object1 = ((Map.Entry)object0).getValue();
                    ((d3)this.b).f(comparable0, object1);
                    return true;
                }
                return false;
            }
            case 1: {
                if(!this.contains(((Map.Entry)object0))) {
                    Comparable comparable1 = (Comparable)((Map.Entry)object0).getKey();
                    Object object2 = ((Map.Entry)object0).getValue();
                    ((t1)this.b).a(comparable1, object2);
                    return true;
                }
                return false;
            }
            case 2: {
                if(!this.contains(((Map.Entry)object0))) {
                    Comparable comparable2 = (Comparable)((Map.Entry)object0).getKey();
                    Object object3 = ((Map.Entry)object0).getValue();
                    ((l)this.b).e(comparable2, object3);
                    return true;
                }
                return false;
            }
            default: {
                return super.add(object0);
            }
        }
    }

    @Override
    public void clear() {
        switch(this.a) {
            case 0: {
                ((d3)this.b).clear();
                return;
            }
            case 1: {
                ((t1)this.b).clear();
                return;
            }
            case 2: {
                ((l)this.b).clear();
                return;
            }
            default: {
                super.clear();
            }
        }
    }

    @Override
    public boolean contains(Object object0) {
        switch(this.a) {
            case 0: {
                Object object1 = ((Map.Entry)object0).getKey();
                Object object2 = ((d3)this.b).get(object1);
                Object object3 = ((Map.Entry)object0).getValue();
                return object2 == object3 || object2 != null && object2.equals(object3);
            }
            case 1: {
                Object object4 = ((Map.Entry)object0).getKey();
                Object object5 = ((t1)this.b).get(object4);
                Object object6 = ((Map.Entry)object0).getValue();
                return object5 == object6 || object5 != null && object5.equals(object6);
            }
            case 2: {
                Object object7 = ((Map.Entry)object0).getKey();
                Object object8 = ((l)this.b).get(object7);
                Object object9 = ((Map.Entry)object0).getValue();
                return object8 == object9 || object8 != null && object8.equals(object9);
            }
            default: {
                return super.contains(object0);
            }
        }
    }

    @Override
    public Iterator iterator() {
        switch(this.a) {
            case 0: {
                return new j3(((d3)this.b), 0);
            }
            case 1: {
                return new j3(((t1)this.b), 1);
            }
            case 2: {
                return new j3(((l)this.b), 2);
            }
            default: {
                return new c(((ArrayMap)this.b));
            }
        }
    }

    @Override
    public boolean remove(Object object0) {
        switch(this.a) {
            case 0: {
                if(this.contains(((Map.Entry)object0))) {
                    Object object1 = ((Map.Entry)object0).getKey();
                    ((d3)this.b).remove(object1);
                    return true;
                }
                return false;
            }
            case 1: {
                if(this.contains(((Map.Entry)object0))) {
                    Object object2 = ((Map.Entry)object0).getKey();
                    ((t1)this.b).remove(object2);
                    return true;
                }
                return false;
            }
            case 2: {
                if(this.contains(((Map.Entry)object0))) {
                    Object object3 = ((Map.Entry)object0).getKey();
                    ((l)this.b).remove(object3);
                    return true;
                }
                return false;
            }
            default: {
                return super.remove(object0);
            }
        }
    }

    @Override
    public final int size() {
        switch(this.a) {
            case 0: {
                return ((d3)this.b).size();
            }
            case 1: {
                return ((t1)this.b).size();
            }
            case 2: {
                return ((l)this.b).size();
            }
            default: {
                return ((ArrayMap)this.b).size();
            }
        }
    }
}

