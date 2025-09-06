package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0013\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0002\u0010\bJ&\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0003H\u0096\u0002¢\u0006\u0002\u0010\rJ\u001B\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000F\u001A\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0010J-\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000F\u001A\u00020\u00032\u000E\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0012J-\u0010\u0013\u001A\u00020\u00142\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u00032\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0015J#\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00030\u00172\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001A\u00020\u001A2\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000E\u0010\u001B\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u001CR\u0014\u0010\u0004\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u001D"}, d2 = {"androidx/navigation/NavType$Companion$StringArrayType$1", "Landroidx/navigation/CollectionNavType;", "", "", "name", "getName", "()Ljava/lang/String;", "emptyCollection", "()[Ljava/lang/String;", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "parseValue", "value", "(Ljava/lang/String;)[Ljava/lang/String;", "previousValue", "(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;", "put", "", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "serializeAsValues", "", "([Ljava/lang/String;)Ljava/util/List;", "valueEquals", "", "other", "([Ljava/lang/String;[Ljava/lang/String;)Z", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringArrayType$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1214:1\n11065#2:1215\n11400#2,3:1216\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringArrayType$1\n*L\n887#1:1215\n887#1:1216,3\n*E\n"})
public final class NavType.Companion.StringArrayType.1 extends CollectionNavType {
    @Override  // androidx.navigation.CollectionNavType
    public Object emptyCollection() {
        return this.emptyCollection();
    }

    @NotNull
    public String[] emptyCollection() {
        return new String[0];
    }

    @Override  // androidx.navigation.NavType
    public Object get(Bundle bundle0, String s) {
        return this.get(bundle0, s);
    }

    @Nullable
    public String[] get(@NotNull Bundle bundle0, @NotNull String s) {
        return (String[])q.i(bundle0, "bundle", s, "key", s);
    }

    @Override  // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return "string[]";
    }

    @Override  // androidx.navigation.NavType
    public Object parseValue(String s) {
        return this.parseValue(s);
    }

    @Override  // androidx.navigation.NavType
    public Object parseValue(String s, Object object0) {
        return this.parseValue(s, ((String[])object0));
    }

    @NotNull
    public String[] parseValue(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        return new String[]{s};
    }

    @Nullable
    public String[] parseValue(@NotNull String s, @Nullable String[] arr_s) {
        Intrinsics.checkNotNullParameter(s, "value");
        if(arr_s != null) {
            String[] arr_s1 = (String[])ArraysKt___ArraysJvmKt.plus(arr_s, this.parseValue(s));
            return arr_s1 == null ? this.parseValue(s) : arr_s1;
        }
        return this.parseValue(s);
    }

    @Override  // androidx.navigation.NavType
    public void put(Bundle bundle0, String s, Object object0) {
        this.put(bundle0, s, ((String[])object0));
    }

    public void put(@NotNull Bundle bundle0, @NotNull String s, @Nullable String[] arr_s) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(s, "key");
        bundle0.putStringArray(s, arr_s);
    }

    @Override  // androidx.navigation.CollectionNavType
    public List serializeAsValues(Object object0) {
        return this.serializeAsValues(((String[])object0));
    }

    @NotNull
    public List serializeAsValues(@Nullable String[] arr_s) {
        if(arr_s != null) {
            List list0 = new ArrayList(arr_s.length);
            for(int v = 0; v < arr_s.length; ++v) {
                list0.add(Uri.encode(arr_s[v]));
            }
            return list0;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // androidx.navigation.NavType
    public boolean valueEquals(Object object0, Object object1) {
        return this.valueEquals(((String[])object0), ((String[])object1));
    }

    public boolean valueEquals(@Nullable String[] arr_s, @Nullable String[] arr_s1) {
        return f.contentDeepEquals(arr_s, arr_s1);
    }
}

