package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u000E\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000E\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\n¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0011\u001A\u00020\u00102\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0014\u001A\u00020\u00132\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001D\u0010\u0017\u001A\u00020\u00162\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001A\u0004\u0018\u00010\u00052\u0006\u0010\t\u001A\u00020\u00052\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001AJ/\u0010\u001C\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\t\u001A\u00020\u00052\u0010\b\u0002\u0010\u001B\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u001C\u0010\u001DJ\u001B\u0010\u001F\u001A\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001E¢\u0006\u0004\b\u001F\u0010 ¨\u0006!"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesView;", "", "Landroid/content/SharedPreferences;", "prefs", "", "", "keySet", "<init>", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "key", "", "contains", "(Ljava/lang/String;)Z", "defValue", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getFloat", "(Ljava/lang/String;F)F", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "defValues", "getStringSet", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "", "getAll", "()Ljava/util/Map;", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesView\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n515#2:324\n500#2,6:325\n442#2:331\n392#2:332\n1238#3,4:333\n1#4:337\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesView\n*L\n303#1:324\n303#1:325,6\n305#1:331\n305#1:332\n305#1:333,4\n*E\n"})
public final class SharedPreferencesView {
    public final SharedPreferences a;
    public final Set b;

    public SharedPreferencesView(@NotNull SharedPreferences sharedPreferences0, @Nullable Set set0) {
        Intrinsics.checkNotNullParameter(sharedPreferences0, "prefs");
        super();
        this.a = sharedPreferences0;
        this.b = set0;
    }

    public final void a(String s) {
        if(this.b != null && !this.b.contains(s)) {
            throw new IllegalStateException(("Can\'t access key outside migration: " + s).toString());
        }
    }

    public final boolean contains(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a(s);
        return this.a.contains(s);
    }

    @NotNull
    public final Map getAll() {
        Map map0 = this.a.getAll();
        Intrinsics.checkNotNullExpressionValue(map0, "prefs.all");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = (String)map$Entry0.getKey();
            if((this.b == null ? true : this.b.contains(s))) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        Map map1 = new LinkedHashMap(w.mapCapacity(linkedHashMap0.size()));
        for(Object object1: linkedHashMap0.entrySet()) {
            Object object2 = ((Map.Entry)object1).getKey();
            Set set0 = ((Map.Entry)object1).getValue();
            if(set0 instanceof Set) {
                set0 = CollectionsKt___CollectionsKt.toSet(set0);
            }
            map1.put(object2, set0);
        }
        return map1;
    }

    public final boolean getBoolean(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a(s);
        return this.a.getBoolean(s, z);
    }

    public final float getFloat(@NotNull String s, float f) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a(s);
        return this.a.getFloat(s, f);
    }

    public final int getInt(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a(s);
        return this.a.getInt(s, v);
    }

    public final long getLong(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a(s);
        return this.a.getLong(s, v);
    }

    @Nullable
    public final String getString(@NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a(s);
        return this.a.getString(s, s1);
    }

    public static String getString$default(SharedPreferencesView sharedPreferencesView0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        return sharedPreferencesView0.getString(s, s1);
    }

    @Nullable
    public final Set getStringSet(@NotNull String s, @Nullable Set set0) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a(s);
        Set set1 = this.a.getStringSet(s, set0);
        return set1 == null ? null : CollectionsKt___CollectionsKt.toMutableSet(set1);
    }

    public static Set getStringSet$default(SharedPreferencesView sharedPreferencesView0, String s, Set set0, int v, Object object0) {
        if((v & 2) != 0) {
            set0 = null;
        }
        return sharedPreferencesView0.getStringSet(s, set0);
    }
}

