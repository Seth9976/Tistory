package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite extends LinkedHashMap {
    public boolean a;
    public static final MapFieldLite b;

    static {
        MapFieldLite mapFieldLite0 = new MapFieldLite();
        MapFieldLite.b = mapFieldLite0;
        mapFieldLite0.makeImmutable();
    }

    public MapFieldLite() {
        this.a = true;
    }

    public final void a() {
        if(!this.isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void clear() {
        this.a();
        super.clear();
    }

    public static MapFieldLite emptyMapField() {
        return MapFieldLite.b;
    }

    // 去混淆评级： 低(20)
    @Override
    public Set entrySet() {
        return this.isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 instanceof Map) {
            if(this != ((Map)object0)) {
                if(this.size() == ((Map)object0).size()) {
                    Iterator iterator0 = this.entrySet().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            return true;
                        }
                        Object object1 = iterator0.next();
                        if(!((Map)object0).containsKey(((Map.Entry)object1).getKey())) {
                            break;
                        }
                        Object object2 = ((Map.Entry)object1).getValue();
                        Object object3 = ((Map)object0).get(((Map.Entry)object1).getKey());
                        if((!(object2 instanceof byte[]) || !(object3 instanceof byte[]) ? object2.equals(object3) : Arrays.equals(((byte[])object2), ((byte[])object3)))) {
                            continue;
                        }
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v2;
        int v1;
        int v = 0;
        for(Object object0: this.entrySet()) {
            Object object1 = ((Map.Entry)object0).getKey();
            if(object1 instanceof byte[]) {
                v1 = Internal.hashCode(((byte[])object1));
            }
            else {
                if(object1 instanceof EnumLite) {
                    throw new UnsupportedOperationException();
                }
                v1 = object1.hashCode();
            }
            Object object2 = ((Map.Entry)object0).getValue();
            if(object2 instanceof byte[]) {
                v2 = Internal.hashCode(((byte[])object2));
            }
            else {
                if(object2 instanceof EnumLite) {
                    throw new UnsupportedOperationException();
                }
                v2 = object2.hashCode();
            }
            v += v2 ^ v1;
        }
        return v;
    }

    public boolean isMutable() {
        return this.a;
    }

    public void makeImmutable() {
        this.a = false;
    }

    public void mergeFrom(MapFieldLite mapFieldLite0) {
        this.a();
        if(!mapFieldLite0.isEmpty()) {
            this.putAll(mapFieldLite0);
        }
    }

    public MapFieldLite mutableCopy() {
        if(this.isEmpty()) {
            return new MapFieldLite();
        }
        MapFieldLite mapFieldLite0 = new MapFieldLite(this);  // 初始化器: Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
        mapFieldLite0.a = true;
        return mapFieldLite0;
    }

    @Override
    public Object put(Object object0, Object object1) {
        this.a();
        object0.getClass();
        object1.getClass();
        return super.put(object0, object1);
    }

    public Object put(Map.Entry map$Entry0) {
        return this.put(map$Entry0.getKey(), map$Entry0.getValue());
    }

    @Override
    public void putAll(Map map0) {
        this.a();
        for(Object object0: map0.keySet()) {
            object0.getClass();
            map0.get(object0).getClass();
        }
        super.putAll(map0);
    }

    @Override
    public Object remove(Object object0) {
        this.a();
        return super.remove(object0);
    }
}

