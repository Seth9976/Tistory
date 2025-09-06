package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class v1 extends x1 {
    public static final Class c;

    static {
        v1.c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }

    @Override  // androidx.datastore.preferences.protobuf.x1
    public final void a(Object object0, long v) {
        List list1;
        List list0 = (List)d4.c.m(object0, v);
        if(list0 instanceof LazyStringList) {
            list1 = ((LazyStringList)list0).getUnmodifiableView();
        }
        else {
            Class class0 = list0.getClass();
            if(v1.c.isAssignableFrom(class0)) {
                return;
            }
            if(list0 instanceof PrimitiveNonBoxingCollection && list0 instanceof ProtobufList) {
                if(((ProtobufList)list0).isModifiable()) {
                    ((ProtobufList)list0).makeImmutable();
                }
                return;
            }
            list1 = Collections.unmodifiableList(list0);
        }
        d4.y(v, object0, list1);
    }

    @Override  // androidx.datastore.preferences.protobuf.x1
    public final void b(long v, Object object0, Object object1) {
        List list0 = (List)d4.c.m(object1, v);
        List list1 = v1.d(list0.size(), v, object0);
        int v1 = list1.size();
        if(v1 > 0 && list0.size() > 0) {
            list1.addAll(list0);
        }
        if(v1 > 0) {
            list0 = list1;
        }
        d4.y(v, object0, list0);
    }

    @Override  // androidx.datastore.preferences.protobuf.x1
    public final List c(Object object0, long v) {
        return v1.d(10, v, object0);
    }

    public static List d(int v, long v1, Object object0) {
        ArrayList arrayList0;
        List list0 = (List)d4.c.m(object0, v1);
        if(list0.isEmpty()) {
            if(list0 instanceof LazyStringList) {
                list0 = new LazyStringArrayList(v);
            }
            else if(!(list0 instanceof PrimitiveNonBoxingCollection) || !(list0 instanceof ProtobufList)) {
                list0 = new ArrayList(v);
            }
            else {
                list0 = ((ProtobufList)list0).mutableCopyWithCapacity(v);
            }
            d4.y(v1, object0, list0);
            return list0;
        }
        Class class0 = list0.getClass();
        if(v1.c.isAssignableFrom(class0)) {
            arrayList0 = new ArrayList(list0.size() + v);
            arrayList0.addAll(list0);
            d4.y(v1, object0, arrayList0);
            return arrayList0;
        }
        if(list0 instanceof UnmodifiableLazyStringList) {
            arrayList0 = new LazyStringArrayList(list0.size() + v);
            ((LazyStringArrayList)arrayList0).addAll(((UnmodifiableLazyStringList)list0));
            d4.y(v1, object0, arrayList0);
            return arrayList0;
        }
        if(list0 instanceof PrimitiveNonBoxingCollection && list0 instanceof ProtobufList && !((ProtobufList)list0).isModifiable()) {
            list0 = ((ProtobufList)list0).mutableCopyWithCapacity(list0.size() + v);
            d4.y(v1, object0, list0);
        }
        return list0;
    }
}

