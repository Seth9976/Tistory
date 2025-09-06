package kotlin.collections;

import fg.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\b\u0005\b\'\u0018\u0000 (*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001(B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\u00072\u0006\u0010\n\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\u000B\u0010\tJ!\u0010\u0010\u001A\u00020\u00072\u0010\u0010\r\u001A\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00072\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\tJ\u001A\u0010\u0014\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u0014\u0010\u001F\u001A\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u0018R\u001A\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000 8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\"R\u001A\u0010\'\u001A\b\u0012\u0004\u0012\u00028\u00010$8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "<init>", "()V", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "", "entry", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "getSize", "size", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.1")
@SourceDebugExtension({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
public abstract class AbstractMap implements Map, KMappedMarker {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00042\u000E\u0010\u0003\u001A\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\u000B\u001A\u00020\b2\u000E\u0010\u0003\u001A\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001A\u00020\r2\u000E\u0010\u0003\u001A\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "", "e", "", "entryHashCode$kotlin_stdlib", "(Ljava/util/Map$Entry;)I", "entryHashCode", "", "entryToString$kotlin_stdlib", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "entryToString", "other", "", "entryEquals$kotlin_stdlib", "(Ljava/util/Map$Entry;Ljava/lang/Object;)Z", "entryEquals", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean entryEquals$kotlin_stdlib(@NotNull Map.Entry map$Entry0, @Nullable Object object0) {
            Intrinsics.checkNotNullParameter(map$Entry0, "e");
            return object0 instanceof Map.Entry ? Intrinsics.areEqual(map$Entry0.getKey(), ((Map.Entry)object0).getKey()) && Intrinsics.areEqual(map$Entry0.getValue(), ((Map.Entry)object0).getValue()) : false;
        }

        public final int entryHashCode$kotlin_stdlib(@NotNull Map.Entry map$Entry0) {
            Intrinsics.checkNotNullParameter(map$Entry0, "e");
            Object object0 = map$Entry0.getKey();
            int v = 0;
            int v1 = object0 == null ? 0 : object0.hashCode();
            Object object1 = map$Entry0.getValue();
            if(object1 != null) {
                v = object1.hashCode();
            }
            return v1 ^ v;
        }

        @NotNull
        public final String entryToString$kotlin_stdlib(@NotNull Map.Entry map$Entry0) {
            Intrinsics.checkNotNullParameter(map$Entry0, "e");
            return map$Entry0.getKey() + '=' + map$Entry0.getValue();
        }
    }

    @NotNull
    public static final Companion Companion;
    public volatile kotlin.collections.AbstractMap.keys.1 a;
    public volatile kotlin.collections.AbstractMap.values.1 b;

    static {
        AbstractMap.Companion = new Companion(null);
    }

    public final Map.Entry a(Object object0) {
        for(Object object1: this.entrySet()) {
            if(Intrinsics.areEqual(((Map.Entry)object1).getKey(), object0)) {
                return (Map.Entry)object1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static final String access$toString(AbstractMap abstractMap0, Map.Entry map$Entry0) {
        abstractMap0.getClass();
        StringBuilder stringBuilder0 = new StringBuilder();
        Object object0 = map$Entry0.getKey();
        String s = "(this Map)";
        stringBuilder0.append((object0 == abstractMap0 ? "(this Map)" : String.valueOf(object0)));
        stringBuilder0.append('=');
        Object object1 = map$Entry0.getValue();
        if(object1 != abstractMap0) {
            s = String.valueOf(object1);
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(@Nullable Map.Entry map$Entry0) {
        if(map$Entry0 == null) {
            return false;
        }
        Object object0 = map$Entry0.getKey();
        Object object1 = map$Entry0.getValue();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object object2 = this.get(object0);
        if(!Intrinsics.areEqual(object1, object2)) {
            return false;
        }
        if(object2 == null) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
            return this.containsKey(object0);
        }
        return true;
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.a(object0) != null;
    }

    @Override
    public boolean containsValue(Object object0) {
        Iterable iterable0 = this.entrySet();
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object1: iterable0) {
                if(Intrinsics.areEqual(((Map.Entry)object1).getValue(), object0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override
    public final Set entrySet() {
        return this.getEntries();
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Map)) {
            return false;
        }
        if(this.size() != ((Map)object0).size()) {
            return false;
        }
        Iterable iterable0 = ((Map)object0).entrySet();
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object1: iterable0) {
                if(!this.containsEntry$kotlin_stdlib(((Map.Entry)object1))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    @Nullable
    public Object get(Object object0) {
        Map.Entry map$Entry0 = this.a(object0);
        return map$Entry0 == null ? null : map$Entry0.getValue();
    }

    public abstract Set getEntries();

    @NotNull
    public Set getKeys() {
        if(this.a == null) {
            this.a = new AbstractSet() {
                @Override  // kotlin.collections.AbstractCollection
                public boolean contains(Object object0) {
                    return this.a.containsKey(object0);
                }

                @Override  // kotlin.collections.AbstractCollection
                public int getSize() {
                    return this.a.size();
                }

                @Override  // kotlin.collections.AbstractSet
                @NotNull
                public Iterator iterator() {
                    return new Object() {
                        public final Iterator a;

                        {
                            this.a = iterator0;
                        }

                        @Override
                        public boolean hasNext() {
                            return this.a.hasNext();
                        }

                        @Override
                        public Object next() {
                            Object object0 = this.a.next();
                            return ((Map.Entry)object0).getKey();
                        }

                        @Override
                        public void remove() {
                            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        }
                    };
                }
            };
        }
        Set set0 = this.a;
        Intrinsics.checkNotNull(set0);
        return set0;
    }

    public int getSize() {
        return this.entrySet().size();
    }

    @NotNull
    public Collection getValues() {
        if(this.b == null) {
            this.b = new AbstractCollection() {
                @Override  // kotlin.collections.AbstractCollection
                public boolean contains(Object object0) {
                    return this.a.containsValue(object0);
                }

                @Override  // kotlin.collections.AbstractCollection
                public int getSize() {
                    return this.a.size();
                }

                @Override  // kotlin.collections.AbstractCollection
                @NotNull
                public Iterator iterator() {
                    return new Object() {
                        public final Iterator a;

                        {
                            this.a = iterator0;
                        }

                        @Override
                        public boolean hasNext() {
                            return this.a.hasNext();
                        }

                        @Override
                        public Object next() {
                            Object object0 = this.a.next();
                            return ((Map.Entry)object0).getValue();
                        }

                        @Override
                        public void remove() {
                            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        }
                    };
                }
            };
        }
        Collection collection0 = this.b;
        Intrinsics.checkNotNull(collection0);
        return collection0;
    }

    @Override
    public int hashCode() {
        return this.entrySet().hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Set keySet() {
        return this.getKeys();
    }

    @Override
    public Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map map0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.entrySet(), ", ", "{", "}", 0, null, new c(this, 23), 24, null);
    }

    @Override
    public final Collection values() {
        return this.getValues();
    }
}

