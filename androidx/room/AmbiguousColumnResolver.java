package androidx.room;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\t\n\u000BJ7\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "", "", "resultColumns", "mappings", "", "resolve", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "androidx/room/b", "androidx/room/c", "androidx/room/d", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,253:1\n1#2:254\n13579#3,2:255\n13644#3,3:257\n13644#3,2:260\n11335#3:262\n11670#3,2:263\n11672#3:267\n13646#3:268\n1855#4,2:265\n1726#4,3:269\n1549#4:272\n1620#4,3:273\n1855#4,2:278\n37#5,2:276\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n*L\n85#1:255,2\n87#1:257,3\n96#1:260,2\n118#1:262\n118#1:263,2\n118#1:267\n96#1:268\n120#1:265,2\n141#1:269,3\n151#1:272\n151#1:273,3\n188#1:278,2\n151#1:276,2\n*E\n"})
public final class AmbiguousColumnResolver {
    @NotNull
    public static final AmbiguousColumnResolver INSTANCE;

    static {
        AmbiguousColumnResolver.INSTANCE = new AmbiguousColumnResolver();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void a(ArrayList arrayList0, List list0, int v, Function1 function10) {
        if(v == arrayList0.size()) {
            function10.invoke(CollectionsKt___CollectionsKt.toList(list0));
            return;
        }
        for(Object object0: ((Iterable)arrayList0.get(v))) {
            list0.add(object0);
            AmbiguousColumnResolver.INSTANCE.getClass();
            AmbiguousColumnResolver.a(arrayList0, list0, v + 1, function10);
            o.removeLast(list0);
        }
    }

    @JvmStatic
    @NotNull
    public static final int[][] resolve(@NotNull String[] arr_s, @NotNull String[][] arr2_s) {
        Intrinsics.checkNotNullParameter(arr_s, "resultColumns");
        Intrinsics.checkNotNullParameter(arr2_s, "mappings");
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(s.charAt(0) == 0x60 && s.charAt(s.length() - 1) == 0x60) {
                s = s.substring(1, s.length() - 1);
                Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            arr_s[v] = a.k(Locale.US, "US", s, Locale.US, "this as java.lang.String).toLowerCase(locale)");
        }
        for(int v1 = 0; v1 < arr2_s.length; ++v1) {
            int v2 = arr2_s[v1].length;
            for(int v3 = 0; v3 < v2; ++v3) {
                String[] arr_s1 = arr2_s[v1];
                arr_s1[v3] = a.k(Locale.US, "US", arr_s1[v3], Locale.US, "this as java.lang.String).toLowerCase(locale)");
            }
        }
        Set set0 = e0.createSetBuilder();
        for(int v4 = 0; v4 < arr2_s.length; ++v4) {
            o.addAll(set0, arr2_s[v4]);
        }
        Set set1 = e0.build(set0);
        List list0 = k.createListBuilder();
        int v5 = 0;
        for(int v6 = 0; v5 < arr_s.length; ++v6) {
            String s1 = arr_s[v5];
            if(set1.contains(s1)) {
                list0.add(new c(s1, v6));
            }
            ++v5;
        }
        List list1 = k.build(list0);
        ArrayList arrayList0 = new ArrayList(arr2_s.length);
        for(int v7 = 0; v7 < arr2_s.length; ++v7) {
            arrayList0.add(new ArrayList());
        }
        int v8 = 0;
        for(int v9 = 0; v8 < arr2_s.length; ++v9) {
            String[] arr_s2 = arr2_s[v8];
            e e0 = new e(arr_s2, arrayList0, v9);
            AmbiguousColumnResolver.INSTANCE.getClass();
            int v11 = 0;
            for(int v10 = 0; v10 < arr_s2.length; ++v10) {
                v11 += arr_s2[v10].hashCode();
            }
            int v12 = arr_s2.length;
            int v13 = 0;
            for(Object object0: list1.subList(0, v12)) {
                v13 += ((c)object0).a.hashCode();
            }
            int v14 = 0;
            while(true) {
                if(v11 == v13) {
                    e0.invoke(v14, v12, list1.subList(v14, v12));
                }
                if(v12 + 1 > list1.size()) {
                    break;
                }
                v13 = v13 - ((c)list1.get(v14)).a.hashCode() + ((c)list1.get(v12)).a.hashCode();
                ++v14;
                ++v12;
            }
            if(((List)arrayList0.get(v9)).isEmpty()) {
                ArrayList arrayList1 = new ArrayList(arr_s2.length);
                int v15 = arr_s2.length;
                for(int v16 = 0; v16 < v15; ++v16) {
                    String s2 = arr_s2[v16];
                    List list2 = k.createListBuilder();
                    for(Object object1: list1) {
                        c c0 = (c)object1;
                        if(Intrinsics.areEqual(s2, c0.a)) {
                            list2.add(c0.b);
                        }
                    }
                    List list3 = k.build(list2);
                    if(list3.isEmpty()) {
                        throw new IllegalStateException(("Column " + s2 + " not found in result").toString());
                    }
                    arrayList1.add(list3);
                }
                f f0 = new f(arrayList0, v9, 0);
                ArrayList arrayList2 = new ArrayList();
                AmbiguousColumnResolver.INSTANCE.getClass();
                AmbiguousColumnResolver.a(arrayList1, arrayList2, 0, f0);
            }
            ++v8;
        }
        if(!arrayList0.isEmpty()) {
            for(Object object2: arrayList0) {
                if(((List)object2).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings");
                }
                if(false) {
                    break;
                }
            }
        }
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        ref$ObjectRef0.element = d.d.getNO_SOLUTION();
        g g0 = new g(ref$ObjectRef0);
        ArrayList arrayList3 = new ArrayList();
        AmbiguousColumnResolver.INSTANCE.getClass();
        AmbiguousColumnResolver.a(arrayList0, arrayList3, 0, g0);
        Iterable iterable0 = ((d)ref$ObjectRef0.element).a;
        ArrayList arrayList4 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object3: iterable0) {
            arrayList4.add(CollectionsKt___CollectionsKt.toIntArray(((b)object3).b));
        }
        return (int[][])arrayList4.toArray(new int[0][]);
    }
}

