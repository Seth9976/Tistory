package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.p;
import ne.b;
import ne.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@SourceDebugExtension({"SMAP\nreflectClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1549#2:100\n1620#2,3:101\n1549#2:104\n1620#2,3:105\n1559#2:108\n1590#2,4:109\n*S KotlinDebug\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n*L\n34#1:100\n34#1:101,3\n35#1:104\n35#1:105,3\n50#1:108\n50#1:109,4\n*E\n"})
public final class ReflectClassUtilKt {
    public static final List a;
    public static final Map b;
    public static final Map c;
    public static final Map d;

    static {
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        KClass kClass1 = Reflection.getOrCreateKotlinClass(Byte.TYPE);
        KClass kClass2 = Reflection.getOrCreateKotlinClass(Character.TYPE);
        KClass kClass3 = Reflection.getOrCreateKotlinClass(Double.TYPE);
        KClass kClass4 = Reflection.getOrCreateKotlinClass(Float.TYPE);
        KClass kClass5 = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        KClass kClass6 = Reflection.getOrCreateKotlinClass(Long.TYPE);
        KClass kClass7 = Reflection.getOrCreateKotlinClass(Short.TYPE);
        KClass[] arr_kClass = new KClass[8];
        int v = 0;
        arr_kClass[0] = kClass0;
        arr_kClass[1] = kClass1;
        arr_kClass[2] = kClass2;
        arr_kClass[3] = kClass3;
        arr_kClass[4] = kClass4;
        arr_kClass[5] = kClass5;
        arr_kClass[6] = kClass6;
        arr_kClass[7] = kClass7;
        List list0 = CollectionsKt__CollectionsKt.listOf(arr_kClass);
        ReflectClassUtilKt.a = list0;
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(TuplesKt.to(JvmClassMappingKt.getJavaObjectType(((KClass)object0)), JvmClassMappingKt.getJavaPrimitiveType(((KClass)object0))));
        }
        ReflectClassUtilKt.b = x.toMap(arrayList0);
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(ReflectClassUtilKt.a, 10));
        for(Object object1: ReflectClassUtilKt.a) {
            arrayList1.add(TuplesKt.to(JvmClassMappingKt.getJavaPrimitiveType(((KClass)object1)), JvmClassMappingKt.getJavaObjectType(((KClass)object1))));
        }
        ReflectClassUtilKt.c = x.toMap(arrayList1);
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOf(new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object2: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList2.add(TuplesKt.to(((Class)object2), v));
            ++v;
        }
        ReflectClassUtilKt.d = x.toMap(arrayList2);
    }

    @NotNull
    public static final ClassId getClassId(@NotNull Class class0) {
        ClassId classId1;
        Intrinsics.checkNotNullParameter(class0, "<this>");
        if(class0.isPrimitive()) {
            throw new IllegalArgumentException("Can\'t compute ClassId for primitive type: " + class0);
        }
        if(class0.isArray()) {
            throw new IllegalArgumentException("Can\'t compute ClassId for array type: " + class0);
        }
        if(class0.getEnclosingMethod() == null && class0.getEnclosingConstructor() == null) {
            String s = class0.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(s, "simpleName");
            if(s.length() != 0) {
                Class class1 = class0.getDeclaringClass();
                if(class1 == null) {
                    classId1 = ClassId.topLevel(new FqName(class0.getName()));
                }
                else {
                    ClassId classId0 = ReflectClassUtilKt.getClassId(class1);
                    if(classId0 == null) {
                        classId1 = ClassId.topLevel(new FqName(class0.getName()));
                    }
                    else {
                        classId1 = classId0.createNestedClassId(Name.identifier(class0.getSimpleName()));
                        if(classId1 == null) {
                            classId1 = ClassId.topLevel(new FqName(class0.getName()));
                        }
                    }
                }
                Intrinsics.checkNotNullExpressionValue(classId1, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                return classId1;
            }
        }
        FqName fqName0 = new FqName(class0.getName());
        return new ClassId(fqName0.parent(), FqName.topLevel(fqName0.shortName()), true);
    }

    @NotNull
    public static final String getDesc(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        if(class0.isPrimitive()) {
            switch(class0.getName()) {
                case "boolean": {
                    return "Z";
                }
                case "byte": {
                    return "B";
                }
                case "char": {
                    return "C";
                }
                case "double": {
                    return "D";
                }
                case "float": {
                    return "F";
                }
                case "int": {
                    return "I";
                }
                case "long": {
                    return "J";
                }
                case "short": {
                    return "S";
                }
                case "void": {
                    return "V";
                }
                default: {
                    throw new IllegalArgumentException("Unsupported primitive type: " + class0);
                }
            }
        }
        if(class0.isArray()) {
            String s = class0.getName();
            Intrinsics.checkNotNullExpressionValue(s, "name");
            return p.replace$default(s, '.', '/', false, 4, null);
        }
        StringBuilder stringBuilder0 = new StringBuilder("L");
        String s1 = class0.getName();
        Intrinsics.checkNotNullExpressionValue(s1, "name");
        return a.b(';', p.replace$default(s1, '.', '/', false, 4, null), stringBuilder0);
    }

    @Nullable
    public static final Integer getFunctionClassArity(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        return (Integer)ReflectClassUtilKt.d.get(class0);
    }

    @NotNull
    public static final List getParameterizedTypeArguments(@NotNull Type type0) {
        Intrinsics.checkNotNullParameter(type0, "<this>");
        if(!(type0 instanceof ParameterizedType)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(((ParameterizedType)type0).getOwnerType() == null) {
            Type[] arr_type = ((ParameterizedType)type0).getActualTypeArguments();
            Intrinsics.checkNotNullExpressionValue(arr_type, "actualTypeArguments");
            return ArraysKt___ArraysKt.toList(arr_type);
        }
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.flatMap(SequencesKt__SequencesKt.generateSequence(type0, b.w), c.w));
    }

    @Nullable
    public static final Class getPrimitiveByWrapper(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        return (Class)ReflectClassUtilKt.b.get(class0);
    }

    @NotNull
    public static final ClassLoader getSafeClassLoader(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        ClassLoader classLoader0 = class0.getClassLoader();
        if(classLoader0 == null) {
            classLoader0 = ClassLoader.getSystemClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader0, "getSystemClassLoader()");
        }
        return classLoader0;
    }

    @Nullable
    public static final Class getWrapperByPrimitive(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        return (Class)ReflectClassUtilKt.c.get(class0);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        return Enum.class.isAssignableFrom(class0);
    }
}

