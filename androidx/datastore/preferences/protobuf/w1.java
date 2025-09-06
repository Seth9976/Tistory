package androidx.datastore.preferences.protobuf;

import java.util.List;

public final class w1 extends x1 {
    @Override  // androidx.datastore.preferences.protobuf.x1
    public final void a(Object object0, long v) {
        ((ProtobufList)d4.c.m(object0, v)).makeImmutable();
    }

    @Override  // androidx.datastore.preferences.protobuf.x1
    public final void b(long v, Object object0, Object object1) {
        ProtobufList internal$ProtobufList0 = (ProtobufList)d4.c.m(object0, v);
        ProtobufList internal$ProtobufList1 = (ProtobufList)d4.c.m(object1, v);
        int v1 = internal$ProtobufList0.size();
        int v2 = internal$ProtobufList1.size();
        if(v1 > 0 && v2 > 0) {
            if(!internal$ProtobufList0.isModifiable()) {
                internal$ProtobufList0 = internal$ProtobufList0.mutableCopyWithCapacity(v2 + v1);
            }
            internal$ProtobufList0.addAll(internal$ProtobufList1);
        }
        if(v1 > 0) {
            internal$ProtobufList1 = internal$ProtobufList0;
        }
        d4.y(v, object0, internal$ProtobufList1);
    }

    @Override  // androidx.datastore.preferences.protobuf.x1
    public final List c(Object object0, long v) {
        List list0 = (ProtobufList)d4.c.m(object0, v);
        if(!((ProtobufList)list0).isModifiable()) {
            int v1 = list0.size();
            list0 = ((ProtobufList)list0).mutableCopyWithCapacity((v1 == 0 ? 10 : v1 * 2));
            d4.y(v, object0, list0);
        }
        return list0;
    }
}

