package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0007\u001A\u00020\u0002H\u0016J\u001B\u0010\b\u001A\u0004\u0018\u00010\u00022\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0004H\u0096\u0002J\u0010\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0004H\u0016J\u001C\u0010\f\u001A\u0004\u0018\u00010\u00022\u0006\u0010\r\u001A\u00020\u00042\b\u0010\u000E\u001A\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000F\u001A\u00020\u00102\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u00042\b\u0010\r\u001A\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00040\u00122\b\u0010\r\u001A\u0004\u0018\u00010\u0002H\u0016J\u001C\u0010\u0013\u001A\u00020\u00142\b\u0010\r\u001A\u0004\u0018\u00010\u00022\b\u0010\u0015\u001A\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"androidx/navigation/NavType$Companion$BoolArrayType$1", "Landroidx/navigation/CollectionNavType;", "", "name", "", "getName", "()Ljava/lang/String;", "emptyCollection", "get", "bundle", "Landroid/os/Bundle;", "key", "parseValue", "value", "previousValue", "put", "", "serializeAsValues", "", "valueEquals", "", "other", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$BoolArrayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1214:1\n1549#2:1215\n1620#2,3:1216\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$BoolArrayType$1\n*L\n761#1:1215\n761#1:1216,3\n*E\n"})
public final class NavType.Companion.BoolArrayType.1 extends CollectionNavType {
    @Override  // androidx.navigation.CollectionNavType
    public Object emptyCollection() {
        return this.emptyCollection();
    }

    @NotNull
    public boolean[] emptyCollection() {
        return new boolean[0];
    }

    @Override  // androidx.navigation.NavType
    public Object get(Bundle bundle0, String s) {
        return this.get(bundle0, s);
    }

    @Nullable
    public boolean[] get(@NotNull Bundle bundle0, @NotNull String s) {
        return (boolean[])q.i(bundle0, "bundle", s, "key", s);
    }

    @Override  // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return "boolean[]";
    }

    @Override  // androidx.navigation.NavType
    public Object parseValue(String s) {
        return this.parseValue(s);
    }

    @Override  // androidx.navigation.NavType
    public Object parseValue(String s, Object object0) {
        return this.parseValue(s, ((boolean[])object0));
    }

    @NotNull
    public boolean[] parseValue(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        return new boolean[]{((Boolean)NavType.BoolType.parseValue(s)).booleanValue()};
    }

    @Nullable
    public boolean[] parseValue(@NotNull String s, @Nullable boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(s, "value");
        if(arr_z != null) {
            boolean[] arr_z1 = ArraysKt___ArraysJvmKt.plus(arr_z, this.parseValue(s));
            return arr_z1 == null ? this.parseValue(s) : arr_z1;
        }
        return this.parseValue(s);
    }

    @Override  // androidx.navigation.NavType
    public void put(Bundle bundle0, String s, Object object0) {
        this.put(bundle0, s, ((boolean[])object0));
    }

    public void put(@NotNull Bundle bundle0, @NotNull String s, @Nullable boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(s, "key");
        bundle0.putBooleanArray(s, arr_z);
    }

    @Override  // androidx.navigation.CollectionNavType
    public List serializeAsValues(Object object0) {
        return this.serializeAsValues(((boolean[])object0));
    }

    @NotNull
    public List serializeAsValues(@Nullable boolean[] arr_z) {
        if(arr_z != null) {
            List list0 = ArraysKt___ArraysKt.toList(arr_z);
            if(list0 != null) {
                List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object0: list0) {
                    list1.add(String.valueOf(((Boolean)object0).booleanValue()));
                }
                return list1;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // androidx.navigation.NavType
    public boolean valueEquals(Object object0, Object object1) {
        return this.valueEquals(((boolean[])object0), ((boolean[])object1));
    }

    public boolean valueEquals(@Nullable boolean[] arr_z, @Nullable boolean[] arr_z1) {
        Boolean[] arr_boolean = null;
        Boolean[] arr_boolean1 = arr_z == null ? null : ArraysKt___ArraysJvmKt.toTypedArray(arr_z);
        if(arr_z1 != null) {
            arr_boolean = ArraysKt___ArraysJvmKt.toTypedArray(arr_z1);
        }
        return f.contentDeepEquals(arr_boolean1, arr_boolean);
    }
}

