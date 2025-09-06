package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFakePureImplementationsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FakePureImplementationsProvider.kt\norg/jetbrains/kotlin/load/java/FakePureImplementationsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,38:1\n1285#2,4:39\n11335#3:43\n11670#3,3:44\n125#4:47\n152#4,3:48\n*S KotlinDebug\n*F\n+ 1 FakePureImplementationsProvider.kt\norg/jetbrains/kotlin/load/java/FakePureImplementationsProvider\n*L\n18#1:39,4\n36#1:43\n36#1:44,3\n32#1:47\n32#1:48,3\n*E\n"})
public final class FakePureImplementationsProvider {
    @NotNull
    public static final FakePureImplementationsProvider INSTANCE;
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        FakePureImplementationsProvider.INSTANCE = new FakePureImplementationsProvider();  // 初始化器: Ljava/lang/Object;-><init>()V
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        FakePureImplementationsProvider.a = linkedHashMap0;
        FakePureImplementationsProvider.b(StandardClassIds.INSTANCE.getMutableList(), FakePureImplementationsProvider.a(new String[]{"java.util.ArrayList", "java.util.LinkedList"}));
        FakePureImplementationsProvider.b(StandardClassIds.INSTANCE.getMutableSet(), FakePureImplementationsProvider.a(new String[]{"java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"}));
        FakePureImplementationsProvider.b(StandardClassIds.INSTANCE.getMutableMap(), FakePureImplementationsProvider.a(new String[]{"java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"}));
        ClassId classId0 = ClassId.topLevel(new FqName("java.util.function.Function"));
        Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(FqName(\"java.util.function.Function\"))");
        FakePureImplementationsProvider.b(classId0, FakePureImplementationsProvider.a(new String[]{"java.util.function.UnaryOperator"}));
        ClassId classId1 = ClassId.topLevel(new FqName("java.util.function.BiFunction"));
        Intrinsics.checkNotNullExpressionValue(classId1, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        FakePureImplementationsProvider.b(classId1, FakePureImplementationsProvider.a(new String[]{"java.util.function.BinaryOperator"}));
        ArrayList arrayList0 = new ArrayList(linkedHashMap0.size());
        for(Object object0: linkedHashMap0.entrySet()) {
            ClassId classId2 = (ClassId)((Map.Entry)object0).getKey();
            ClassId classId3 = (ClassId)((Map.Entry)object0).getValue();
            arrayList0.add(TuplesKt.to(classId2.asSingleFqName(), classId3.asSingleFqName()));
        }
        FakePureImplementationsProvider.b = x.toMap(arrayList0);
    }

    public static ArrayList a(String[] arr_s) {
        ArrayList arrayList0 = new ArrayList(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            arrayList0.add(ClassId.topLevel(new FqName(arr_s[v])));
        }
        return arrayList0;
    }

    public static void b(ClassId classId0, ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            ClassId classId1 = (ClassId)object0;
            FakePureImplementationsProvider.a.put(object0, classId0);
        }
    }

    @Nullable
    public final FqName getPurelyImplementedInterface(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "classFqName");
        return (FqName)FakePureImplementationsProvider.b.get(fqName0);
    }
}

