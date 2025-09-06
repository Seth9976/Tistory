package androidx.datastore.preferences.protobuf;

import java.util.Map.Entry;
import java.util.Map;

public final class e2 implements MapFieldSchema {
    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Map forMapData(Object object0) {
        return (MapFieldLite)object0;
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final d2 forMapMetadata(Object object0) {
        return ((MapEntryLite)object0).a;
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Map forMutableMapData(Object object0) {
        return (MapFieldLite)object0;
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final int getSerializedSize(int v, Object object0, Object object1) {
        int v1 = 0;
        if(!((MapFieldLite)object0).isEmpty()) {
            for(Object object2: ((MapFieldLite)object0).entrySet()) {
                v1 += ((MapEntryLite)object1).computeMessageSize(v, ((Map.Entry)object2).getKey(), ((Map.Entry)object2).getValue());
            }
        }
        return v1;
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final boolean isImmutable(Object object0) {
        return !((MapFieldLite)object0).isMutable();
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object mergeFrom(Object object0, Object object1) {
        MapFieldLite mapFieldLite0 = (MapFieldLite)object0;
        if(!((MapFieldLite)object1).isEmpty()) {
            if(!mapFieldLite0.isMutable()) {
                mapFieldLite0 = mapFieldLite0.mutableCopy();
            }
            mapFieldLite0.mergeFrom(((MapFieldLite)object1));
        }
        return mapFieldLite0;
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object newMapField(Object object0) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object toImmutable(Object object0) {
        ((MapFieldLite)object0).makeImmutable();
        return object0;
    }
}

