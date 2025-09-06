package androidx.datastore.preferences.core;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u000F\u0010\r\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000F\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b\u000E\u0010\fJ$\u0010\u0012\u001A\u00020\u0006\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002\u00A2\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0017\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0016H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001A\u001A\u00020\n\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0019\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u001A\u0010\u001BJ%\u0010\u001D\u001A\u00020\n2\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0019\u001A\u0004\u0018\u00010\u0004H\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001BJ\u0018\u0010\u001F\u001A\u00020\n2\u0006\u0010\u001E\u001A\u00020\u0001H\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010 J\u001C\u0010\u001F\u001A\u00020\n2\n\u0010\"\u001A\u0006\u0012\u0002\b\u00030!H\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010#J\u001C\u0010$\u001A\u00020\n2\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u0003H\u0086\u0002\u00A2\u0006\u0004\b$\u0010%J)\u0010(\u001A\u00020\n2\u001A\u0010\'\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030!0&\"\u0006\u0012\u0002\b\u00030!\u00A2\u0006\u0004\b(\u0010)J!\u0010*\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u00A2\u0006\u0004\b*\u0010\u0015J\r\u0010+\u001A\u00020\n\u00A2\u0006\u0004\b+\u0010\fJ\u001A\u0010-\u001A\u00020\u00062\b\u0010,\u001A\u0004\u0018\u00010\u0004H\u0096\u0002\u00A2\u0006\u0004\b-\u0010.J\u000F\u00100\u001A\u00020/H\u0016\u00A2\u0006\u0004\b0\u00101J\u000F\u00103\u001A\u000202H\u0016\u00A2\u0006\u0004\b3\u00104R*\u0010\u0005\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u0018\u00A8\u00068"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Landroidx/datastore/preferences/core/Preferences;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "preferencesMap", "", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "", "checkNotFrozen$datastore_preferences_core", "()V", "checkNotFrozen", "freeze$datastore_preferences_core", "freeze", "T", "key", "contains", "(Landroidx/datastore/preferences/core/Preferences$Key;)Z", "get", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "", "asMap", "()Ljava/util/Map;", "value", "set", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "setUnchecked$datastore_preferences_core", "setUnchecked", "prefs", "plusAssign", "(Landroidx/datastore/preferences/core/Preferences;)V", "Landroidx/datastore/preferences/core/Preferences$Pair;", "pair", "(Landroidx/datastore/preferences/core/Preferences$Pair;)V", "minusAssign", "(Landroidx/datastore/preferences/core/Preferences$Key;)V", "", "pairs", "putAll", "([Landroidx/datastore/preferences/core/Preferences$Pair;)V", "remove", "clear", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/MutablePreferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,361:1\n1#2:362\n1179#3,2:363\n1253#3,4:365\n13579#4,2:369\n167#5,3:371\n*S KotlinDebug\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/MutablePreferences\n*L\n158#1:363,2\n158#1:365,4\n250#1:369,2\n283#1:371,3\n*E\n"})
public final class MutablePreferences extends Preferences {
    public final Map a;
    public final AtomicBoolean b;

    public MutablePreferences() {
        this(null, false, 3, null);
    }

    public MutablePreferences(@NotNull Map map0, boolean z) {
        Intrinsics.checkNotNullParameter(map0, "preferencesMap");
        super();
        this.a = map0;
        this.b = new AtomicBoolean(z);
    }

    public MutablePreferences(Map map0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            map0 = new LinkedHashMap();
        }
        if((v & 2) != 0) {
            z = true;
        }
        this(map0, z);
    }

    @Override  // androidx.datastore.preferences.core.Preferences
    @NotNull
    public Map asMap() {
        Pair pair0;
        Iterable iterable0 = this.a.entrySet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
        for(Object object0: iterable0) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof byte[]) {
                Object object2 = map$Entry0.getKey();
                byte[] arr_b = Arrays.copyOf(((byte[])object1), ((byte[])object1).length);
                Intrinsics.checkNotNullExpressionValue(arr_b, "copyOf(this, size)");
                pair0 = new Pair(object2, arr_b);
            }
            else {
                pair0 = new Pair(map$Entry0.getKey(), map$Entry0.getValue());
            }
            linkedHashMap0.put(pair0.getFirst(), pair0.getSecond());
        }
        return Actual_jvmKt.immutableMap(linkedHashMap0);
    }

    public final void checkNotFrozen$datastore_preferences_core() {
        if(this.b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void clear() {
        this.checkNotFrozen$datastore_preferences_core();
        this.a.clear();
    }

    @Override  // androidx.datastore.preferences.core.Preferences
    public boolean contains(@NotNull Key preferences$Key0) {
        Intrinsics.checkNotNullParameter(preferences$Key0, "key");
        return this.a.containsKey(preferences$Key0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        boolean z;
        if(!(object0 instanceof MutablePreferences)) {
            return false;
        }
        Map map0 = ((MutablePreferences)object0).a;
        Map map1 = this.a;
        if(map0 == map1) {
            return true;
        }
        if(map0.size() != map1.size()) {
            return false;
        }
        Map map2 = ((MutablePreferences)object0).a;
        if(!map2.isEmpty()) {
            for(Object object1: map2.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                Object object2 = map1.get(map$Entry0.getKey());
                if(object2 == null) {
                    z = false;
                }
                else {
                    Object object3 = map$Entry0.getValue();
                    if(!(object3 instanceof byte[])) {
                        z = Intrinsics.areEqual(object3, object2);
                    }
                    else if(object2 instanceof byte[] && Arrays.equals(((byte[])object3), ((byte[])object2))) {
                        z = true;
                    }
                }
                if(!z) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public final void freeze$datastore_preferences_core() {
        this.b.set(true);
    }

    @Override  // androidx.datastore.preferences.core.Preferences
    @Nullable
    public Object get(@NotNull Key preferences$Key0) {
        Intrinsics.checkNotNullParameter(preferences$Key0, "key");
        byte[] arr_b = this.a.get(preferences$Key0);
        if(arr_b instanceof byte[]) {
            arr_b = Arrays.copyOf(arr_b, arr_b.length);
            Intrinsics.checkNotNullExpressionValue(arr_b, "copyOf(this, size)");
        }
        return arr_b;
    }

    @NotNull
    public final Map getPreferencesMap$datastore_preferences_core() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: this.a.entrySet()) {
            Object object1 = ((Map.Entry)object0).getValue();
            v += (object1 instanceof byte[] ? Arrays.hashCode(((byte[])object1)) : object1.hashCode());
        }
        return v;
    }

    public final void minusAssign(@NotNull Key preferences$Key0) {
        Intrinsics.checkNotNullParameter(preferences$Key0, "key");
        this.checkNotFrozen$datastore_preferences_core();
        this.remove(preferences$Key0);
    }

    public final void plusAssign(@NotNull androidx.datastore.preferences.core.Preferences.Pair preferences$Pair0) {
        Intrinsics.checkNotNullParameter(preferences$Pair0, "pair");
        this.checkNotFrozen$datastore_preferences_core();
        this.putAll(new androidx.datastore.preferences.core.Preferences.Pair[]{preferences$Pair0});
    }

    public final void plusAssign(@NotNull Preferences preferences0) {
        Intrinsics.checkNotNullParameter(preferences0, "prefs");
        this.checkNotFrozen$datastore_preferences_core();
        Map map0 = preferences0.asMap();
        this.a.putAll(map0);
    }

    public final void putAll(@NotNull androidx.datastore.preferences.core.Preferences.Pair[] arr_preferences$Pair) {
        Intrinsics.checkNotNullParameter(arr_preferences$Pair, "pairs");
        this.checkNotFrozen$datastore_preferences_core();
        for(int v = 0; v < arr_preferences$Pair.length; ++v) {
            androidx.datastore.preferences.core.Preferences.Pair preferences$Pair0 = arr_preferences$Pair[v];
            this.setUnchecked$datastore_preferences_core(preferences$Pair0.getKey$datastore_preferences_core(), preferences$Pair0.getValue$datastore_preferences_core());
        }
    }

    public final Object remove(@NotNull Key preferences$Key0) {
        Intrinsics.checkNotNullParameter(preferences$Key0, "key");
        this.checkNotFrozen$datastore_preferences_core();
        return this.a.remove(preferences$Key0);
    }

    public final void set(@NotNull Key preferences$Key0, Object object0) {
        Intrinsics.checkNotNullParameter(preferences$Key0, "key");
        this.setUnchecked$datastore_preferences_core(preferences$Key0, object0);
    }

    public final void setUnchecked$datastore_preferences_core(@NotNull Key preferences$Key0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(preferences$Key0, "key");
        this.checkNotFrozen$datastore_preferences_core();
        if(object0 == null) {
            this.remove(preferences$Key0);
            return;
        }
        Map map0 = this.a;
        if(object0 instanceof Set) {
            map0.put(preferences$Key0, Actual_jvmKt.immutableCopyOfSet(((Set)object0)));
            return;
        }
        if(object0 instanceof byte[]) {
            byte[] arr_b = Arrays.copyOf(((byte[])object0), ((byte[])object0).length);
            Intrinsics.checkNotNullExpressionValue(arr_b, "copyOf(this, size)");
            map0.put(preferences$Key0, arr_b);
            return;
        }
        map0.put(preferences$Key0, object0);
    }

    @Override
    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.w, 24, null);
    }
}

