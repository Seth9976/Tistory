package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap.Entry;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001F\n\u0002\b\u0003\n\u0002\u0010\'\n\u0002\b\u000B\b\u0000\u0018\u0000 _*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006_`abcdB\t\b\u0016\u00A2\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u0006\u0010\nJ\u0019\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000B\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0013J\u001A\u0010\u0016\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001C\u001A\u00020\u001B2\u0014\u0010\u001A\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000BH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0019\u0010\u001E\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u0017J\u000F\u0010\u001F\u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b\u001F\u0010\u0007J\u001A\u0010\"\u001A\u00020\u000E2\b\u0010!\u001A\u0004\u0018\u00010 H\u0096\u0002\u00A2\u0006\u0004\b\"\u0010\u0013J\u000F\u0010#\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b&\u0010\'J\u000F\u0010)\u001A\u00020\u001BH\u0000\u00A2\u0006\u0004\b(\u0010\u0007J\u0017\u0010,\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00028\u0000H\u0000\u00A2\u0006\u0004\b*\u0010+J\u0017\u0010.\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00028\u0000H\u0000\u00A2\u0006\u0004\b-\u0010+J#\u00103\u001A\u00020\u000E2\u0012\u00100\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/H\u0000\u00A2\u0006\u0004\b1\u00102J\u001B\u00108\u001A\u00020\u000E2\n\u00105\u001A\u0006\u0012\u0002\b\u000304H\u0000\u00A2\u0006\u0004\b6\u00107J#\u0010:\u001A\u00020\u000E2\u0012\u00100\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/H\u0000\u00A2\u0006\u0004\b9\u00102J\u0017\u0010=\u001A\u00020\u000E2\u0006\u0010;\u001A\u00028\u0001H\u0000\u00A2\u0006\u0004\b<\u0010\u0013J\u001B\u0010A\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>H\u0000\u00A2\u0006\u0004\b?\u0010@J\u001B\u0010E\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010BH\u0000\u00A2\u0006\u0004\bC\u0010DJ\u001B\u0010I\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010FH\u0000\u00A2\u0006\u0004\bG\u0010HR$\u0010N\u001A\u00020\b2\u0006\u0010J\u001A\u00020\b8\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010$R$\u0010Q\u001A\u00020\u000E2\u0006\u0010J\u001A\u00020\u000E8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b5\u0010O\u001A\u0004\bP\u0010\u0010R\u001A\u0010U\u001A\b\u0012\u0004\u0012\u00028\u00000R8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bS\u0010TR\u001A\u0010Y\u001A\b\u0012\u0004\u0012\u00028\u00010V8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bW\u0010XR&\u0010\\\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Z0R8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b[\u0010TR\u0014\u0010^\u001A\u00020\b8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b]\u0010$\u00A8\u0006e"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "build", "()Ljava/util/Map;", "", "isEmpty", "()Z", "key", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "from", "", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "checkIsMutable$kotlin_stdlib", "checkIsMutable", "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "addKey", "removeKey$kotlin_stdlib", "removeKey", "", "entry", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "", "m", "containsAllEntries$kotlin_stdlib", "(Ljava/util/Collection;)Z", "containsAllEntries", "removeEntry$kotlin_stdlib", "removeEntry", "element", "removeValue$kotlin_stdlib", "removeValue", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator", "<set-?>", "i", "I", "getSize", "size", "Z", "isReadOnly$kotlin_stdlib", "isReadOnly", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "", "getEntries", "entries", "getCapacity$kotlin_stdlib", "capacity", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
public final class MapBuilder implements Serializable, Map, KMutableMap {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R&\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001A\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000B\u001A\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\nR\u0014\u0010\f\u001A\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001A\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000E"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "Lkotlin/collections/builders/MapBuilder;", "", "Empty", "Lkotlin/collections/builders/MapBuilder;", "getEmpty$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final int access$computeHashSize(Companion mapBuilder$Companion0, int v) {
            mapBuilder$Companion0.getClass();
            return Integer.highestOneBit(c.coerceAtLeast(v, 1) * 3);
        }

        public static final int access$computeShift(Companion mapBuilder$Companion0, int v) {
            mapBuilder$Companion0.getClass();
            return Integer.numberOfLeadingZeros(v) + 1;
        }

        @NotNull
        public final MapBuilder getEmpty$kotlin_stdlib() {
            return MapBuilder.n;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010\'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0019\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002J\u0012\u0010\u000B\u001A\u00020\f2\n\u0010\r\u001A\u00060\u000Ej\u0002`\u000FJ\r\u0010\u0010\u001A\u00020\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextAppendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nextHashCode", "", "nextHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class EntriesItr extends Itr implements Iterator, KMutableIterator {
        public EntriesItr(@NotNull MapBuilder mapBuilder0) {
            Intrinsics.checkNotNullParameter(mapBuilder0, "map");
            super(mapBuilder0);
        }

        @Override
        public Object next() {
            return this.next();
        }

        @NotNull
        public EntryRef next() {
            this.checkForComodification$kotlin_stdlib();
            if(this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().f) {
                throw new NoSuchElementException();
            }
            int v = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(v + 1);
            this.setLastIndex$kotlin_stdlib(v);
            EntryRef mapBuilder$EntryRef0 = new EntryRef(this.getMap$kotlin_stdlib(), this.getLastIndex$kotlin_stdlib());
            this.initNext$kotlin_stdlib();
            return mapBuilder$EntryRef0;
        }

        public final void nextAppendString(@NotNull StringBuilder stringBuilder0) {
            Intrinsics.checkNotNullParameter(stringBuilder0, "sb");
            if(this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().f) {
                throw new NoSuchElementException();
            }
            int v = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(v + 1);
            this.setLastIndex$kotlin_stdlib(v);
            Object object0 = this.getMap$kotlin_stdlib().a[this.getLastIndex$kotlin_stdlib()];
            if(object0 == this.getMap$kotlin_stdlib()) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object[] arr_object = this.getMap$kotlin_stdlib().b;
            Intrinsics.checkNotNull(arr_object);
            Object object1 = arr_object[this.getLastIndex$kotlin_stdlib()];
            if(object1 == this.getMap$kotlin_stdlib()) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
            this.initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if(this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().f) {
                throw new NoSuchElementException();
            }
            int v = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(v + 1);
            this.setLastIndex$kotlin_stdlib(v);
            Object object0 = this.getMap$kotlin_stdlib().a[this.getLastIndex$kotlin_stdlib()];
            int v1 = 0;
            int v2 = object0 == null ? 0 : object0.hashCode();
            Object[] arr_object = this.getMap$kotlin_stdlib().b;
            Intrinsics.checkNotNull(arr_object);
            Object object1 = arr_object[this.getLastIndex$kotlin_stdlib()];
            if(object1 != null) {
                v1 = object1.hashCode();
            }
            this.initNext$kotlin_stdlib();
            return v2 ^ v1;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00028\u00032\u0006\u0010\n\u001A\u00028\u0003H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0010\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001A\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001B\u001A\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0018¨\u0006\u001C"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "Lkotlin/collections/builders/MapBuilder;", "map", "", "index", "<init>", "(Lkotlin/collections/builders/MapBuilder;I)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class EntryRef implements Map.Entry, Entry {
        public final MapBuilder a;
        public final int b;

        public EntryRef(@NotNull MapBuilder mapBuilder0, int v) {
            Intrinsics.checkNotNullParameter(mapBuilder0, "map");
            super();
            this.a = mapBuilder0;
            this.b = v;
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Map.Entry && Intrinsics.areEqual(((Map.Entry)object0).getKey(), this.getKey()) && Intrinsics.areEqual(((Map.Entry)object0).getValue(), this.getValue());
        }

        @Override
        public Object getKey() {
            return this.a.a[this.b];
        }

        @Override
        public Object getValue() {
            Object[] arr_object = this.a.b;
            Intrinsics.checkNotNull(arr_object);
            return arr_object[this.b];
        }

        @Override
        public int hashCode() {
            Object object0 = this.getKey();
            int v = 0;
            int v1 = object0 == null ? 0 : object0.hashCode();
            Object object1 = this.getValue();
            if(object1 != null) {
                v = object1.hashCode();
            }
            return v1 ^ v;
        }

        @Override
        public Object setValue(Object object0) {
            this.a.checkIsMutable$kotlin_stdlib();
            Object[] arr_object = MapBuilder.access$allocateValuesArray(this.a);
            Object object1 = arr_object[this.b];
            arr_object[this.b] = object0;
            return object1;
        }

        @Override
        @NotNull
        public String toString() {
            return this.getKey() + '=' + this.getValue();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\u000B\u001A\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\b¢\u0006\u0004\b\u000F\u0010\nJ\u000F\u0010\u0011\u001A\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\nR&\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\"\u0010\u001D\u001A\u00020\u00168\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\"\u0010!\u001A\u00020\u00168\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u0018\u001A\u0004\b\u001F\u0010\u001A\"\u0004\b \u0010\u001C¨\u0006\""}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "initNext$kotlin_stdlib", "()V", "initNext", "", "hasNext", "()Z", "remove", "checkForComodification$kotlin_stdlib", "checkForComodification", "a", "Lkotlin/collections/builders/MapBuilder;", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "", "b", "I", "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "index", "c", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "lastIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
    public static class Itr {
        public final MapBuilder a;
        public int b;
        public int c;
        public int d;

        public Itr(@NotNull MapBuilder mapBuilder0) {
            Intrinsics.checkNotNullParameter(mapBuilder0, "map");
            super();
            this.a = mapBuilder0;
            this.c = -1;
            this.d = mapBuilder0.h;
            this.initNext$kotlin_stdlib();
        }

        public final void checkForComodification$kotlin_stdlib() {
            if(this.a.h != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int getIndex$kotlin_stdlib() {
            return this.b;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.c;
        }

        @NotNull
        public final MapBuilder getMap$kotlin_stdlib() {
            return this.a;
        }

        public final boolean hasNext() {
            return this.b < this.a.f;
        }

        public final void initNext$kotlin_stdlib() {
            while(true) {
                MapBuilder mapBuilder0 = this.a;
                if(this.b >= mapBuilder0.f) {
                    break;
                }
                int v = this.b;
                if(mapBuilder0.c[v] >= 0) {
                    break;
                }
                this.b = v + 1;
            }
        }

        public final void remove() {
            this.checkForComodification$kotlin_stdlib();
            if(this.c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.a.checkIsMutable$kotlin_stdlib();
            this.a.f(this.c);
            this.c = -1;
            this.d = this.a.h;
        }

        public final void setIndex$kotlin_stdlib(int v) {
            this.b = v;
        }

        public final void setLastIndex$kotlin_stdlib(int v) {
            this.c = v;
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0019\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000E\u0010\b\u001A\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class KeysItr extends Itr implements Iterator, KMutableIterator {
        public KeysItr(@NotNull MapBuilder mapBuilder0) {
            Intrinsics.checkNotNullParameter(mapBuilder0, "map");
            super(mapBuilder0);
        }

        @Override
        public Object next() {
            this.checkForComodification$kotlin_stdlib();
            if(this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().f) {
                throw new NoSuchElementException();
            }
            int v = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(v + 1);
            this.setLastIndex$kotlin_stdlib(v);
            Object object0 = this.getMap$kotlin_stdlib().a[this.getLastIndex$kotlin_stdlib()];
            this.initNext$kotlin_stdlib();
            return object0;
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000E\u0010\b\u001A\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ValuesItr extends Itr implements Iterator, KMutableIterator {
        public ValuesItr(@NotNull MapBuilder mapBuilder0) {
            Intrinsics.checkNotNullParameter(mapBuilder0, "map");
            super(mapBuilder0);
        }

        @Override
        public Object next() {
            this.checkForComodification$kotlin_stdlib();
            if(this.getIndex$kotlin_stdlib() >= this.getMap$kotlin_stdlib().f) {
                throw new NoSuchElementException();
            }
            int v = this.getIndex$kotlin_stdlib();
            this.setIndex$kotlin_stdlib(v + 1);
            this.setLastIndex$kotlin_stdlib(v);
            Object[] arr_object = this.getMap$kotlin_stdlib().b;
            Intrinsics.checkNotNull(arr_object);
            Object object0 = arr_object[this.getLastIndex$kotlin_stdlib()];
            this.initNext$kotlin_stdlib();
            return object0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public MapBuilderKeys j;
    public MapBuilderValues k;
    public MapBuilderEntries l;
    public boolean m;
    public static final MapBuilder n;

    static {
        MapBuilder.Companion = new Companion(null);
        MapBuilder mapBuilder0 = new MapBuilder(0);
        mapBuilder0.m = true;
        MapBuilder.n = mapBuilder0;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int v) {
        Object[] arr_object = ListBuilderKt.arrayOfUninitializedElements(v);
        int v1 = Companion.access$computeHashSize(MapBuilder.Companion, v);
        super();
        this.a = arr_object;
        this.b = null;
        this.c = new int[v];
        this.d = new int[v1];
        this.e = 2;
        this.f = 0;
        this.g = Companion.access$computeShift(MapBuilder.Companion, v1);
    }

    public final void a(int v) {
        int v1 = this.getCapacity$kotlin_stdlib() - this.f;
        int v2 = this.f - this.size();
        if(v1 < v && v1 + v2 >= v && v2 >= this.getCapacity$kotlin_stdlib() / 4) {
            this.e(this.d.length);
            return;
        }
        int v3 = this.f + v;
        if(v3 < 0) {
            throw new OutOfMemoryError();
        }
        if(v3 > this.getCapacity$kotlin_stdlib()) {
            int v4 = AbstractList.Companion.newCapacity$kotlin_stdlib(this.getCapacity$kotlin_stdlib(), v3);
            this.a = ListBuilderKt.copyOfUninitializedElements(this.a, v4);
            this.b = this.b == null ? null : ListBuilderKt.copyOfUninitializedElements(this.b, v4);
            int[] arr_v = Arrays.copyOf(this.c, v4);
            Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(...)");
            this.c = arr_v;
            int v5 = Companion.access$computeHashSize(MapBuilder.Companion, v4);
            if(v5 > this.d.length) {
                this.e(v5);
            }
        }
    }

    public static final Object[] access$allocateValuesArray(MapBuilder mapBuilder0) {
        Object[] arr_object = mapBuilder0.b;
        if(arr_object == null) {
            arr_object = ListBuilderKt.arrayOfUninitializedElements(mapBuilder0.getCapacity$kotlin_stdlib());
            mapBuilder0.b = arr_object;
        }
        return arr_object;
    }

    public final int addKey$kotlin_stdlib(Object object0) {
        int v;
        this.checkIsMutable$kotlin_stdlib();
        while(true) {
            v = this.d(object0);
            int v1 = c.coerceAtMost(this.e * 2, this.d.length / 2);
            int v2 = 0;
        label_4:
            int v3 = this.d[v];
            if(v3 <= 0) {
                if(this.f >= this.getCapacity$kotlin_stdlib()) {
                    this.a(1);
                    continue;
                }
                int v4 = this.f;
                this.f = v4 + 1;
                this.a[v4] = object0;
                this.c[v4] = v;
                this.d[v] = v4 + 1;
                this.i = this.size() + 1;
                ++this.h;
                if(v2 > this.e) {
                    this.e = v2;
                }
                return v4;
            }
            if(Intrinsics.areEqual(this.a[v3 - 1], object0)) {
                return -v3;
            }
            ++v2;
            if(v2 <= v1) {
                break;
            }
            this.e(this.d.length * 2);
        }
        if(v != 0) {
            --v;
            goto label_4;
        }
        v = this.d.length - 1;
        goto label_4;
    }

    public final int b(Object object0) {
        int v = this.d(object0);
        int v1 = this.e;
        while(true) {
            int v2 = this.d[v];
            if(v2 == 0) {
                return -1;
            }
            if(v2 > 0 && Intrinsics.areEqual(this.a[v2 - 1], object0)) {
                return v2 - 1;
            }
            --v1;
            if(v1 < 0) {
                return -1;
            }
            if(v == 0) {
                v = this.d.length - 1;
            }
            else {
                --v;
            }
        }
    }

    @NotNull
    public final Map build() {
        this.checkIsMutable$kotlin_stdlib();
        this.m = true;
        if(this.size() > 0) {
            return this;
        }
        Intrinsics.checkNotNull(MapBuilder.n, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return MapBuilder.n;
    }

    public final int c(Object object0) {
        int v = this.f;
    alab1:
        while(true) {
            do {
                --v;
                if(v < 0) {
                    break alab1;
                }
                if(this.c[v] < 0) {
                    continue alab1;
                }
                Object[] arr_object = this.b;
                Intrinsics.checkNotNull(arr_object);
            }
            while(!Intrinsics.areEqual(arr_object[v], object0));
            return v;
        }
        return -1;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if(this.m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void clear() {
        this.checkIsMutable$kotlin_stdlib();
        IntIterator intIterator0 = new IntRange(0, this.f - 1).iterator();
        while(intIterator0.hasNext()) {
            int v = intIterator0.nextInt();
            int[] arr_v = this.c;
            int v1 = arr_v[v];
            if(v1 >= 0) {
                this.d[v1] = 0;
                arr_v[v] = -1;
            }
        }
        ListBuilderKt.resetRange(this.a, 0, this.f);
        Object[] arr_object = this.b;
        if(arr_object != null) {
            ListBuilderKt.resetRange(arr_object, 0, this.f);
        }
        this.i = 0;
        this.f = 0;
        ++this.h;
    }

    public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "m");
        for(Object object0: collection0) {
            if(object0 != null) {
                try {
                    if(!this.containsEntry$kotlin_stdlib(((Map.Entry)object0))) {
                        return false;
                    }
                    continue;
                }
                catch(ClassCastException unused_ex) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@NotNull Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "entry");
        int v = this.b(map$Entry0.getKey());
        if(v < 0) {
            return false;
        }
        Object[] arr_object = this.b;
        Intrinsics.checkNotNull(arr_object);
        return Intrinsics.areEqual(arr_object[v], map$Entry0.getValue());
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.b(object0) >= 0;
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.c(object0) >= 0;
    }

    public final int d(Object object0) {
        return object0 == null ? 0 : object0.hashCode() * -1640531527 >>> this.g;
    }

    public final void e(int v) {
        int v4;
        ++this.h;
        int v1 = 0;
        if(this.f > this.size()) {
            Object[] arr_object = this.b;
            int v3 = 0;
            for(int v2 = 0; true; ++v2) {
                v4 = this.f;
                if(v2 >= v4) {
                    break;
                }
                if(this.c[v2] >= 0) {
                    this.a[v3] = this.a[v2];
                    if(arr_object != null) {
                        arr_object[v3] = arr_object[v2];
                    }
                    ++v3;
                }
            }
            ListBuilderKt.resetRange(this.a, v3, v4);
            if(arr_object != null) {
                ListBuilderKt.resetRange(arr_object, v3, this.f);
            }
            this.f = v3;
        }
        int[] arr_v = this.d;
        if(v == arr_v.length) {
            ArraysKt___ArraysJvmKt.fill(arr_v, 0, 0, arr_v.length);
        }
        else {
            this.d = new int[v];
            this.g = Companion.access$computeShift(MapBuilder.Companion, v);
        }
        while(v1 < this.f) {
            int v5 = this.d(this.a[v1]);
            int v6 = this.e;
        label_28:
            int[] arr_v1 = this.d;
            if(arr_v1[v5] == 0) {
                arr_v1[v5] = v1 + 1;
                this.c[v1] = v5;
                ++v1;
                continue;
            }
            --v6;
            if(v6 < 0) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            if(v5 == 0) {
                v5 = arr_v1.length - 1;
            }
            else {
                --v5;
            }
            goto label_28;
        }
    }

    @NotNull
    public final EntriesItr entriesIterator$kotlin_stdlib() {
        return new EntriesItr(this);
    }

    @Override
    public final Set entrySet() {
        return this.getEntries();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 == this || object0 instanceof Map && this.size() == ((Map)object0).size() && this.containsAllEntries$kotlin_stdlib(((Map)object0).entrySet());
    }

    public final void f(int v) {
        ListBuilderKt.resetAt(this.a, v);
        int v1 = this.c[v];
        int v2 = c.coerceAtMost(this.e * 2, this.d.length / 2);
        int v3 = 0;
        int v4 = v1;
        while(true) {
            v1 = v1 == 0 ? this.d.length - 1 : v1 - 1;
            ++v3;
            if(v3 > this.e) {
                this.d[v4] = 0;
                break;
            }
            int[] arr_v = this.d;
            int v5 = arr_v[v1];
            if(v5 == 0) {
                arr_v[v4] = 0;
                break;
            }
            if(v5 < 0) {
                arr_v[v4] = -1;
                v4 = v1;
                v3 = 0;
            }
            else {
                int[] arr_v1 = this.d;
                if((this.d(this.a[v5 - 1]) - v1 & arr_v1.length - 1) >= v3) {
                    arr_v1[v4] = v5;
                    this.c[v5 - 1] = v4;
                    v4 = v1;
                    v3 = 0;
                }
            }
            --v2;
            if(v2 < 0) {
                this.d[v4] = -1;
                break;
            }
        }
        this.c[v] = -1;
        this.i = this.size() - 1;
        ++this.h;
    }

    @Override
    @Nullable
    public Object get(Object object0) {
        int v = this.b(object0);
        if(v < 0) {
            return null;
        }
        Object[] arr_object = this.b;
        Intrinsics.checkNotNull(arr_object);
        return arr_object[v];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.a.length;
    }

    @NotNull
    public Set getEntries() {
        MapBuilderEntries mapBuilderEntries0 = this.l;
        if(mapBuilderEntries0 == null) {
            mapBuilderEntries0 = new MapBuilderEntries(this);
            this.l = mapBuilderEntries0;
        }
        return mapBuilderEntries0;
    }

    @NotNull
    public Set getKeys() {
        MapBuilderKeys mapBuilderKeys0 = this.j;
        if(mapBuilderKeys0 == null) {
            mapBuilderKeys0 = new MapBuilderKeys(this);
            this.j = mapBuilderKeys0;
        }
        return mapBuilderKeys0;
    }

    public int getSize() {
        return this.i;
    }

    @NotNull
    public Collection getValues() {
        MapBuilderValues mapBuilderValues0 = this.k;
        if(mapBuilderValues0 == null) {
            mapBuilderValues0 = new MapBuilderValues(this);
            this.k = mapBuilderValues0;
        }
        return mapBuilderValues0;
    }

    @Override
    public int hashCode() {
        int v = 0;
        EntriesItr mapBuilder$EntriesItr0 = this.entriesIterator$kotlin_stdlib();
        while(mapBuilder$EntriesItr0.hasNext()) {
            v += mapBuilder$EntriesItr0.nextHashCode$kotlin_stdlib();
        }
        return v;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.m;
    }

    @Override
    public final Set keySet() {
        return this.getKeys();
    }

    @NotNull
    public final KeysItr keysIterator$kotlin_stdlib() {
        return new KeysItr(this);
    }

    @Override
    @Nullable
    public Object put(Object object0, Object object1) {
        this.checkIsMutable$kotlin_stdlib();
        int v = this.addKey$kotlin_stdlib(object0);
        Object[] arr_object = this.b;
        if(arr_object == null) {
            arr_object = ListBuilderKt.arrayOfUninitializedElements(this.getCapacity$kotlin_stdlib());
            this.b = arr_object;
        }
        if(v < 0) {
            Object object2 = arr_object[-v - 1];
            arr_object[-v - 1] = object1;
            return object2;
        }
        arr_object[v] = object1;
        return null;
    }

    @Override
    public void putAll(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "from");
        this.checkIsMutable$kotlin_stdlib();
        Collection collection0 = map0.entrySet();
        if(!collection0.isEmpty()) {
            this.a(collection0.size());
            for(Object object0: collection0) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                int v = this.addKey$kotlin_stdlib(map$Entry0.getKey());
                Object[] arr_object = this.b;
                if(arr_object == null) {
                    arr_object = ListBuilderKt.arrayOfUninitializedElements(this.getCapacity$kotlin_stdlib());
                    this.b = arr_object;
                }
                if(v >= 0) {
                    arr_object[v] = map$Entry0.getValue();
                }
                else {
                    Object object1 = arr_object[-v - 1];
                    if(!Intrinsics.areEqual(map$Entry0.getValue(), object1)) {
                        arr_object[-v - 1] = map$Entry0.getValue();
                    }
                }
            }
        }
    }

    @Override
    @Nullable
    public Object remove(Object object0) {
        int v = this.removeKey$kotlin_stdlib(object0);
        if(v < 0) {
            return null;
        }
        Object[] arr_object = this.b;
        Intrinsics.checkNotNull(arr_object);
        Object object1 = arr_object[v];
        ListBuilderKt.resetAt(arr_object, v);
        return object1;
    }

    public final boolean removeEntry$kotlin_stdlib(@NotNull Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "entry");
        this.checkIsMutable$kotlin_stdlib();
        int v = this.b(map$Entry0.getKey());
        if(v < 0) {
            return false;
        }
        Object[] arr_object = this.b;
        Intrinsics.checkNotNull(arr_object);
        if(!Intrinsics.areEqual(arr_object[v], map$Entry0.getValue())) {
            return false;
        }
        this.f(v);
        return true;
    }

    public final int removeKey$kotlin_stdlib(Object object0) {
        this.checkIsMutable$kotlin_stdlib();
        int v = this.b(object0);
        if(v < 0) {
            return -1;
        }
        this.f(v);
        return v;
    }

    public final boolean removeValue$kotlin_stdlib(Object object0) {
        this.checkIsMutable$kotlin_stdlib();
        int v = this.c(object0);
        if(v < 0) {
            return false;
        }
        this.f(v);
        return true;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.size() * 3 + 2);
        stringBuilder0.append("{");
        EntriesItr mapBuilder$EntriesItr0 = this.entriesIterator$kotlin_stdlib();
        for(int v = 0; mapBuilder$EntriesItr0.hasNext(); ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            mapBuilder$EntriesItr0.nextAppendString(stringBuilder0);
        }
        stringBuilder0.append("}");
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @Override
    public final Collection values() {
        return this.getValues();
    }

    @NotNull
    public final ValuesItr valuesIterator$kotlin_stdlib() {
        return new ValuesItr(this);
    }
}

