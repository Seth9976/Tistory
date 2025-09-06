package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n1271#2,2:266\n1285#2,4:268\n1271#2,2:272\n1285#2,4:274\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n*L\n80#1:266,2\n80#1:268,4\n84#1:272,2\n84#1:274,4\n*E\n"})
public final class StandardClassIds {
    @NotNull
    public static final StandardClassIds INSTANCE;
    public static final FqName a;
    public static final FqName b;
    public static final FqName c;
    public static final FqName d;
    public static final FqName e;
    public static final FqName f;
    public static final FqName g;
    public static final Set h;
    public static final ClassId i;
    public static final ClassId j;
    public static final ClassId k;
    public static final ClassId l;
    public static final ClassId m;
    public static final ClassId n;
    public static final ClassId o;
    public static final ClassId p;
    public static final Set q;
    public static final Map r;
    public static final Set s;
    public static final Map t;
    public static final Set u;
    public static final ClassId v;
    public static final ClassId w;
    public static final ClassId x;
    public static final ClassId y;

    static {
        StandardClassIds.INSTANCE = new StandardClassIds();  // 初始化器: Ljava/lang/Object;-><init>()V
        FqName fqName0 = new FqName("kotlin");
        StandardClassIds.a = fqName0;
        FqName fqName1 = fqName0.child(Name.identifier("reflect"));
        Intrinsics.checkNotNullExpressionValue(fqName1, "BASE_KOTLIN_PACKAGE.chil…me.identifier(\"reflect\"))");
        StandardClassIds.b = fqName1;
        FqName fqName2 = fqName0.child(Name.identifier("collections"));
        Intrinsics.checkNotNullExpressionValue(fqName2, "BASE_KOTLIN_PACKAGE.chil…dentifier(\"collections\"))");
        StandardClassIds.c = fqName2;
        FqName fqName3 = fqName0.child(Name.identifier("ranges"));
        Intrinsics.checkNotNullExpressionValue(fqName3, "BASE_KOTLIN_PACKAGE.chil…ame.identifier(\"ranges\"))");
        StandardClassIds.d = fqName3;
        FqName fqName4 = fqName0.child(Name.identifier("jvm"));
        Intrinsics.checkNotNullExpressionValue(fqName4, "BASE_KOTLIN_PACKAGE.child(Name.identifier(\"jvm\"))");
        Intrinsics.checkNotNullExpressionValue(fqName4.child(Name.identifier("internal")), "BASE_JVM_PACKAGE.child(N…e.identifier(\"internal\"))");
        FqName fqName5 = fqName0.child(Name.identifier("annotation"));
        Intrinsics.checkNotNullExpressionValue(fqName5, "BASE_KOTLIN_PACKAGE.chil…identifier(\"annotation\"))");
        StandardClassIds.e = fqName5;
        FqName fqName6 = fqName0.child(Name.identifier("internal"));
        Intrinsics.checkNotNullExpressionValue(fqName6, "BASE_KOTLIN_PACKAGE.chil…e.identifier(\"internal\"))");
        Intrinsics.checkNotNullExpressionValue(fqName6.child(Name.identifier("ir")), "BASE_INTERNAL_PACKAGE.child(Name.identifier(\"ir\"))");
        FqName fqName7 = fqName0.child(Name.identifier("coroutines"));
        Intrinsics.checkNotNullExpressionValue(fqName7, "BASE_KOTLIN_PACKAGE.chil…identifier(\"coroutines\"))");
        StandardClassIds.f = fqName7;
        FqName fqName8 = fqName0.child(Name.identifier("enums"));
        Intrinsics.checkNotNullExpressionValue(fqName8, "BASE_KOTLIN_PACKAGE.chil…Name.identifier(\"enums\"))");
        StandardClassIds.g = fqName8;
        StandardClassIds.h = f0.setOf(new FqName[]{fqName0, fqName2, fqName3, fqName5, fqName1, fqName6, fqName7});
        StandardClassIdsKt.access$baseId("Nothing");
        StandardClassIdsKt.access$baseId("Unit");
        StandardClassIdsKt.access$baseId("Any");
        StandardClassIdsKt.access$baseId("Enum");
        StandardClassIdsKt.access$baseId("Annotation");
        StandardClassIds.i = StandardClassIdsKt.access$baseId("Array");
        ClassId classId0 = StandardClassIdsKt.access$baseId("Boolean");
        ClassId classId1 = StandardClassIdsKt.access$baseId("Char");
        ClassId classId2 = StandardClassIdsKt.access$baseId("Byte");
        ClassId classId3 = StandardClassIdsKt.access$baseId("Short");
        ClassId classId4 = StandardClassIdsKt.access$baseId("Int");
        ClassId classId5 = StandardClassIdsKt.access$baseId("Long");
        ClassId classId6 = StandardClassIdsKt.access$baseId("Float");
        ClassId classId7 = StandardClassIdsKt.access$baseId("Double");
        StandardClassIds.j = StandardClassIdsKt.access$unsignedId(classId2);
        StandardClassIds.k = StandardClassIdsKt.access$unsignedId(classId3);
        StandardClassIds.l = StandardClassIdsKt.access$unsignedId(classId4);
        StandardClassIds.m = StandardClassIdsKt.access$unsignedId(classId5);
        StandardClassIdsKt.access$baseId("CharSequence");
        StandardClassIds.n = StandardClassIdsKt.access$baseId("String");
        StandardClassIdsKt.access$baseId("Throwable");
        StandardClassIdsKt.access$baseId("Cloneable");
        StandardClassIdsKt.access$reflectId("KProperty");
        StandardClassIdsKt.access$reflectId("KMutableProperty");
        StandardClassIdsKt.access$reflectId("KProperty0");
        StandardClassIdsKt.access$reflectId("KMutableProperty0");
        StandardClassIdsKt.access$reflectId("KProperty1");
        StandardClassIdsKt.access$reflectId("KMutableProperty1");
        StandardClassIdsKt.access$reflectId("KProperty2");
        StandardClassIdsKt.access$reflectId("KMutableProperty2");
        StandardClassIds.o = StandardClassIdsKt.access$reflectId("KFunction");
        StandardClassIds.p = StandardClassIdsKt.access$reflectId("KClass");
        StandardClassIdsKt.access$reflectId("KCallable");
        StandardClassIdsKt.access$baseId("Comparable");
        StandardClassIdsKt.access$baseId("Number");
        StandardClassIdsKt.access$baseId("Function");
        Set set0 = f0.setOf(new ClassId[]{classId0, classId1, classId2, classId3, classId4, classId5, classId6, classId7});
        StandardClassIds.q = set0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(set0, 10)), 16));
        for(Object object0: set0) {
            Name name0 = ((ClassId)object0).getShortClassName();
            Intrinsics.checkNotNullExpressionValue(name0, "id.shortClassName");
            linkedHashMap0.put(object0, StandardClassIdsKt.access$primitiveArrayId(name0));
        }
        StandardClassIds.r = StandardClassIdsKt.access$inverseMap(linkedHashMap0);
        Set set1 = f0.setOf(new ClassId[]{StandardClassIds.j, StandardClassIds.k, StandardClassIds.l, StandardClassIds.m});
        StandardClassIds.s = set1;
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(set1, 10)), 16));
        for(Object object1: set1) {
            Name name1 = ((ClassId)object1).getShortClassName();
            Intrinsics.checkNotNullExpressionValue(name1, "id.shortClassName");
            linkedHashMap1.put(object1, StandardClassIdsKt.access$primitiveArrayId(name1));
        }
        StandardClassIds.t = StandardClassIdsKt.access$inverseMap(linkedHashMap1);
        StandardClassIds.u = g0.plus(g0.plus(StandardClassIds.q, StandardClassIds.s), StandardClassIds.n);
        StandardClassIdsKt.access$coroutinesId("Continuation");
        StandardClassIdsKt.access$collectionsId("Iterator");
        StandardClassIdsKt.access$collectionsId("Iterable");
        StandardClassIdsKt.access$collectionsId("Collection");
        StandardClassIdsKt.access$collectionsId("List");
        StandardClassIdsKt.access$collectionsId("ListIterator");
        StandardClassIdsKt.access$collectionsId("Set");
        ClassId classId8 = StandardClassIdsKt.access$collectionsId("Map");
        StandardClassIdsKt.access$collectionsId("MutableIterator");
        StandardClassIdsKt.access$collectionsId("CharIterator");
        StandardClassIdsKt.access$collectionsId("MutableIterable");
        StandardClassIdsKt.access$collectionsId("MutableCollection");
        StandardClassIds.v = StandardClassIdsKt.access$collectionsId("MutableList");
        StandardClassIdsKt.access$collectionsId("MutableListIterator");
        StandardClassIds.w = StandardClassIdsKt.access$collectionsId("MutableSet");
        ClassId classId9 = StandardClassIdsKt.access$collectionsId("MutableMap");
        StandardClassIds.x = classId9;
        Intrinsics.checkNotNullExpressionValue(classId8.createNestedClassId(Name.identifier("Entry")), "Map.createNestedClassId(Name.identifier(\"Entry\"))");
        Intrinsics.checkNotNullExpressionValue(classId9.createNestedClassId(Name.identifier("MutableEntry")), "MutableMap.createNestedC…entifier(\"MutableEntry\"))");
        StandardClassIdsKt.access$baseId("Result");
        StandardClassIdsKt.access$rangesId("IntRange");
        StandardClassIdsKt.access$rangesId("LongRange");
        StandardClassIdsKt.access$rangesId("CharRange");
        StandardClassIdsKt.access$annotationId("AnnotationRetention");
        StandardClassIdsKt.access$annotationId("AnnotationTarget");
        StandardClassIds.y = StandardClassIdsKt.access$enumsId("EnumEntries");
    }

    @NotNull
    public final ClassId getArray() {
        return StandardClassIds.i;
    }

    @NotNull
    public final FqName getBASE_ANNOTATION_PACKAGE() {
        return StandardClassIds.e;
    }

    @NotNull
    public final FqName getBASE_COLLECTIONS_PACKAGE() {
        return StandardClassIds.c;
    }

    @NotNull
    public final FqName getBASE_COROUTINES_PACKAGE() {
        return StandardClassIds.f;
    }

    @NotNull
    public final FqName getBASE_ENUMS_PACKAGE() {
        return StandardClassIds.g;
    }

    @NotNull
    public final FqName getBASE_KOTLIN_PACKAGE() {
        return StandardClassIds.a;
    }

    @NotNull
    public final FqName getBASE_RANGES_PACKAGE() {
        return StandardClassIds.d;
    }

    @NotNull
    public final FqName getBASE_REFLECT_PACKAGE() {
        return StandardClassIds.b;
    }

    @NotNull
    public final ClassId getEnumEntries() {
        return StandardClassIds.y;
    }

    @NotNull
    public final ClassId getKClass() {
        return StandardClassIds.p;
    }

    @NotNull
    public final ClassId getKFunction() {
        return StandardClassIds.o;
    }

    @NotNull
    public final ClassId getMutableList() {
        return StandardClassIds.v;
    }

    @NotNull
    public final ClassId getMutableMap() {
        return StandardClassIds.x;
    }

    @NotNull
    public final ClassId getMutableSet() {
        return StandardClassIds.w;
    }
}

