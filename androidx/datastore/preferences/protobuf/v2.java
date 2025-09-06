package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

public final class v2 {
    public final b2 a;
    public final ConcurrentHashMap b;
    public static final v2 c;

    static {
        v2.c = new v2();
    }

    public v2() {
        this.b = new ConcurrentHashMap();
        this.a = new b2(0);
    }

    public final Schema a(Class class0) {
        Internal.a(class0, "messageType");
        ConcurrentHashMap concurrentHashMap0 = this.b;
        Schema schema0 = (Schema)concurrentHashMap0.get(class0);
        if(schema0 == null) {
            schema0 = this.a.createSchema(class0);
            Schema schema1 = (Schema)concurrentHashMap0.putIfAbsent(class0, schema0);
            return schema1 == null ? schema0 : schema1;
        }
        return schema0;
    }

    public final Schema b(Object object0) {
        return this.a(object0.getClass());
    }
}

