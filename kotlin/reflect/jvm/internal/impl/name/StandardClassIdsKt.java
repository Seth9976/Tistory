package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;

@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n1179#2,2:266\n1253#2,4:268\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n*L\n264#1:266,2\n264#1:268,4\n*E\n"})
public final class StandardClassIdsKt {
    static {
        Intrinsics.checkNotNullExpressionValue(new FqName("java.lang").child(Name.identifier("annotation")), "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
    }

    public static final ClassId access$annotationId(String s) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_ANNOTATION_PACKAGE(), Name.identifier(s));
    }

    public static final ClassId access$baseId(String s) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE(), Name.identifier(s));
    }

    public static final ClassId access$collectionsId(String s) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_COLLECTIONS_PACKAGE(), Name.identifier(s));
    }

    public static final ClassId access$coroutinesId(String s) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_COROUTINES_PACKAGE(), Name.identifier(s));
    }

    public static final ClassId access$enumsId(String s) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_ENUMS_PACKAGE(), Name.identifier(s));
    }

    public static final Map access$inverseMap(Map map0) {
        Iterable iterable0 = map0.entrySet();
        Map map1 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
        for(Object object0: iterable0) {
            Object object1 = ((Map.Entry)object0).getKey();
            Pair pair0 = TuplesKt.to(((Map.Entry)object0).getValue(), object1);
            map1.put(pair0.getFirst(), pair0.getSecond());
        }
        return map1;
    }

    public static final ClassId access$primitiveArrayId(Name name0) {
        return new ClassId(StandardClassIds.INSTANCE.getArray().getPackageFqName(), Name.identifier((name0.getIdentifier() + StandardClassIds.INSTANCE.getArray().getShortClassName().getIdentifier())));
    }

    public static final ClassId access$rangesId(String s) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_RANGES_PACKAGE(), Name.identifier(s));
    }

    public static final ClassId access$reflectId(String s) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_REFLECT_PACKAGE(), Name.identifier(s));
    }

    public static final ClassId access$unsignedId(ClassId classId0) {
        Name name0 = Name.identifier(("U" + classId0.getShortClassName().getIdentifier()));
        return new ClassId(StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE(), name0);
    }
}

