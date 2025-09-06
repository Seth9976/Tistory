package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u000E\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J!\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0005H\u0096\u0002J\u0016\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000E\u001A\u00020\u0005H\u0016J(\u0010\r\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000E\u001A\u00020\u00052\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J(\u0010\u0010\u001A\u00020\u00112\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u00052\u000E\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u001E\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00050\u00022\u000E\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J(\u0010\u0013\u001A\u00020\u00142\u000E\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000E\u0010\u0015\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016R\u0014\u0010\u0004\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"androidx/navigation/NavType$Companion$FloatListType$1", "Landroidx/navigation/CollectionNavType;", "", "", "name", "", "getName", "()Ljava/lang/String;", "emptyCollection", "get", "bundle", "Landroid/os/Bundle;", "key", "parseValue", "value", "previousValue", "put", "", "serializeAsValues", "valueEquals", "", "other", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$FloatListType$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1214:1\n37#2,2:1215\n37#2,2:1217\n1549#3:1219\n1620#3,3:1220\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$FloatListType$1\n*L\n677#1:1215,2\n678#1:1217,2\n683#1:1219\n683#1:1220,3\n*E\n"})
public final class NavType.Companion.FloatListType.1 extends CollectionNavType {
    @Override  // androidx.navigation.CollectionNavType
    public Object emptyCollection() {
        return this.emptyCollection();
    }

    @NotNull
    public List emptyCollection() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // androidx.navigation.NavType
    public Object get(Bundle bundle0, String s) {
        return this.get(bundle0, s);
    }

    @Nullable
    public List get(@NotNull Bundle bundle0, @NotNull String s) {
        float[] arr_f = (float[])q.i(bundle0, "bundle", s, "key", s);
        return arr_f == null ? null : ArraysKt___ArraysKt.toList(arr_f);
    }

    @Override  // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return "List<Float>";
    }

    @Override  // androidx.navigation.NavType
    public Object parseValue(String s) {
        return this.parseValue(s);
    }

    @Override  // androidx.navigation.NavType
    public Object parseValue(String s, Object object0) {
        return this.parseValue(s, ((List)object0));
    }

    @NotNull
    public List parseValue(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        return k.listOf(NavType.FloatType.parseValue(s));
    }

    @Nullable
    public List parseValue(@NotNull String s, @Nullable List list0) {
        Intrinsics.checkNotNullParameter(s, "value");
        if(list0 != null) {
            List list1 = CollectionsKt___CollectionsKt.plus(list0, this.parseValue(s));
            return list1 == null ? this.parseValue(s) : list1;
        }
        return this.parseValue(s);
    }

    @Override  // androidx.navigation.NavType
    public void put(Bundle bundle0, String s, Object object0) {
        this.put(bundle0, s, ((List)object0));
    }

    public void put(@NotNull Bundle bundle0, @NotNull String s, @Nullable List list0) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(s, "key");
        bundle0.putFloatArray(s, (list0 == null ? null : CollectionsKt___CollectionsKt.toFloatArray(list0)));
    }

    @Override  // androidx.navigation.CollectionNavType
    public List serializeAsValues(Object object0) {
        return this.serializeAsValues(((List)object0));
    }

    @NotNull
    public List serializeAsValues(@Nullable List list0) {
        if(list0 != null) {
            List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                list1.add(String.valueOf(((Number)object0).floatValue()));
            }
            return list1;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // androidx.navigation.NavType
    public boolean valueEquals(Object object0, Object object1) {
        return this.valueEquals(((List)object0), ((List)object1));
    }

    public boolean valueEquals(@Nullable List list0, @Nullable List list1) {
        Float[] arr_float = null;
        Float[] arr_float1 = list0 == null ? null : ((Float[])list0.toArray(new Float[0]));
        if(list1 != null) {
            arr_float = (Float[])list1.toArray(new Float[0]);
        }
        return f.contentDeepEquals(arr_float1, arr_float);
    }
}

