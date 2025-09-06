package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nJavaToKotlinClassMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n49#1,2:221\n49#1,2:223\n49#1,2:225\n49#1,2:227\n49#1,2:229\n49#1,2:231\n49#1,2:233\n49#1,2:235\n1#2:220\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n*L\n54#1:221,2\n55#1:223,2\n56#1:225,2\n57#1:227,2\n58#1:229,2\n59#1:231,2\n60#1:233,2\n61#1:235,2\n*E\n"})
public final class JavaToKotlinClassMap {
    public static final class PlatformMutabilityMapping {
        public final ClassId a;
        public final ClassId b;
        public final ClassId c;

        public PlatformMutabilityMapping(@NotNull ClassId classId0, @NotNull ClassId classId1, @NotNull ClassId classId2) {
            Intrinsics.checkNotNullParameter(classId0, "javaClass");
            Intrinsics.checkNotNullParameter(classId1, "kotlinReadOnly");
            Intrinsics.checkNotNullParameter(classId2, "kotlinMutable");
            super();
            this.a = classId0;
            this.b = classId1;
            this.c = classId2;
        }

        @NotNull
        public final ClassId component1() {
            return this.a;
        }

        @NotNull
        public final ClassId component2() {
            return this.b;
        }

        @NotNull
        public final ClassId component3() {
            return this.c;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof PlatformMutabilityMapping)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((PlatformMutabilityMapping)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((PlatformMutabilityMapping)object0).b) ? Intrinsics.areEqual(this.c, ((PlatformMutabilityMapping)object0).c) : false;
        }

        @NotNull
        public final ClassId getJavaClass() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
        }
    }

    @NotNull
    public static final JavaToKotlinClassMap INSTANCE;
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final ClassId e;
    public static final FqName f;
    public static final ClassId g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final List n;

    static {
        JavaToKotlinClassMap.INSTANCE = new JavaToKotlinClassMap();  // 初始化器: Ljava/lang/Object;-><init>()V
        JavaToKotlinClassMap.a = "kotlin" + '.' + "Function";
        JavaToKotlinClassMap.b = "kotlin.reflect" + '.' + "KFunction";
        JavaToKotlinClassMap.c = "kotlin.coroutines" + '.' + "SuspendFunction";
        JavaToKotlinClassMap.d = "kotlin.reflect" + '.' + "KSuspendFunction";
        ClassId classId0 = ClassId.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        JavaToKotlinClassMap.e = classId0;
        FqName fqName0 = classId0.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqName0, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        JavaToKotlinClassMap.f = fqName0;
        JavaToKotlinClassMap.g = StandardClassIds.INSTANCE.getKFunction();
        JavaToKotlinClassMap.e(Class.class);
        JavaToKotlinClassMap.h = new HashMap();
        JavaToKotlinClassMap.i = new HashMap();
        JavaToKotlinClassMap.j = new HashMap();
        JavaToKotlinClassMap.k = new HashMap();
        JavaToKotlinClassMap.l = new HashMap();
        JavaToKotlinClassMap.m = new HashMap();
        ClassId classId1 = ClassId.topLevel(FqNames.iterable);
        Intrinsics.checkNotNullExpressionValue(classId1, "topLevel(FqNames.iterable)");
        FqName fqName1 = classId1.getPackageFqName();
        FqName fqName2 = classId1.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName2, "kotlinReadOnly.packageFqName");
        ClassId classId2 = new ClassId(fqName1, FqNamesUtilKt.tail(FqNames.mutableIterable, fqName2), false);
        PlatformMutabilityMapping javaToKotlinClassMap$PlatformMutabilityMapping0 = new PlatformMutabilityMapping(JavaToKotlinClassMap.e(Iterable.class), classId1, classId2);
        ClassId classId3 = ClassId.topLevel(FqNames.iterator);
        Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(FqNames.iterator)");
        FqName fqName3 = classId3.getPackageFqName();
        FqName fqName4 = classId3.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName4, "kotlinReadOnly.packageFqName");
        ClassId classId4 = new ClassId(fqName3, FqNamesUtilKt.tail(FqNames.mutableIterator, fqName4), false);
        PlatformMutabilityMapping javaToKotlinClassMap$PlatformMutabilityMapping1 = new PlatformMutabilityMapping(JavaToKotlinClassMap.e(Iterator.class), classId3, classId4);
        ClassId classId5 = ClassId.topLevel(FqNames.collection);
        Intrinsics.checkNotNullExpressionValue(classId5, "topLevel(FqNames.collection)");
        FqName fqName5 = classId5.getPackageFqName();
        FqName fqName6 = classId5.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName6, "kotlinReadOnly.packageFqName");
        ClassId classId6 = new ClassId(fqName5, FqNamesUtilKt.tail(FqNames.mutableCollection, fqName6), false);
        PlatformMutabilityMapping javaToKotlinClassMap$PlatformMutabilityMapping2 = new PlatformMutabilityMapping(JavaToKotlinClassMap.e(Collection.class), classId5, classId6);
        ClassId classId7 = ClassId.topLevel(FqNames.list);
        Intrinsics.checkNotNullExpressionValue(classId7, "topLevel(FqNames.list)");
        FqName fqName7 = classId7.getPackageFqName();
        FqName fqName8 = classId7.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName8, "kotlinReadOnly.packageFqName");
        ClassId classId8 = new ClassId(fqName7, FqNamesUtilKt.tail(FqNames.mutableList, fqName8), false);
        PlatformMutabilityMapping javaToKotlinClassMap$PlatformMutabilityMapping3 = new PlatformMutabilityMapping(JavaToKotlinClassMap.e(List.class), classId7, classId8);
        ClassId classId9 = ClassId.topLevel(FqNames.set);
        Intrinsics.checkNotNullExpressionValue(classId9, "topLevel(FqNames.set)");
        FqName fqName9 = classId9.getPackageFqName();
        FqName fqName10 = classId9.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName10, "kotlinReadOnly.packageFqName");
        ClassId classId10 = new ClassId(fqName9, FqNamesUtilKt.tail(FqNames.mutableSet, fqName10), false);
        PlatformMutabilityMapping javaToKotlinClassMap$PlatformMutabilityMapping4 = new PlatformMutabilityMapping(JavaToKotlinClassMap.e(Set.class), classId9, classId10);
        ClassId classId11 = ClassId.topLevel(FqNames.listIterator);
        Intrinsics.checkNotNullExpressionValue(classId11, "topLevel(FqNames.listIterator)");
        FqName fqName11 = classId11.getPackageFqName();
        FqName fqName12 = classId11.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName12, "kotlinReadOnly.packageFqName");
        ClassId classId12 = new ClassId(fqName11, FqNamesUtilKt.tail(FqNames.mutableListIterator, fqName12), false);
        PlatformMutabilityMapping javaToKotlinClassMap$PlatformMutabilityMapping5 = new PlatformMutabilityMapping(JavaToKotlinClassMap.e(ListIterator.class), classId11, classId12);
        ClassId classId13 = ClassId.topLevel(FqNames.map);
        Intrinsics.checkNotNullExpressionValue(classId13, "topLevel(FqNames.map)");
        FqName fqName13 = classId13.getPackageFqName();
        FqName fqName14 = classId13.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName14, "kotlinReadOnly.packageFqName");
        ClassId classId14 = new ClassId(fqName13, FqNamesUtilKt.tail(FqNames.mutableMap, fqName14), false);
        PlatformMutabilityMapping javaToKotlinClassMap$PlatformMutabilityMapping6 = new PlatformMutabilityMapping(JavaToKotlinClassMap.e(Map.class), classId13, classId14);
        ClassId classId15 = ClassId.topLevel(FqNames.map).createNestedClassId(FqNames.mapEntry.shortName());
        Intrinsics.checkNotNullExpressionValue(classId15, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        FqName fqName15 = classId15.getPackageFqName();
        FqName fqName16 = classId15.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName16, "kotlinReadOnly.packageFqName");
        ClassId classId16 = new ClassId(fqName15, FqNamesUtilKt.tail(FqNames.mutableMapEntry, fqName16), false);
        List list0 = CollectionsKt__CollectionsKt.listOf(new PlatformMutabilityMapping[]{javaToKotlinClassMap$PlatformMutabilityMapping0, javaToKotlinClassMap$PlatformMutabilityMapping1, javaToKotlinClassMap$PlatformMutabilityMapping2, javaToKotlinClassMap$PlatformMutabilityMapping3, javaToKotlinClassMap$PlatformMutabilityMapping4, javaToKotlinClassMap$PlatformMutabilityMapping5, javaToKotlinClassMap$PlatformMutabilityMapping6, new PlatformMutabilityMapping(JavaToKotlinClassMap.e(Map.Entry.class), classId15, classId16)});
        JavaToKotlinClassMap.n = list0;
        JavaToKotlinClassMap.d(Object.class, FqNames.any);
        JavaToKotlinClassMap.d(String.class, FqNames.string);
        JavaToKotlinClassMap.d(CharSequence.class, FqNames.charSequence);
        JavaToKotlinClassMap.c(Throwable.class, FqNames.throwable);
        JavaToKotlinClassMap.d(Cloneable.class, FqNames.cloneable);
        JavaToKotlinClassMap.d(Number.class, FqNames.number);
        JavaToKotlinClassMap.c(Comparable.class, FqNames.comparable);
        JavaToKotlinClassMap.d(Enum.class, FqNames._enum);
        JavaToKotlinClassMap.c(Annotation.class, FqNames.annotation);
        for(Object object0: list0) {
            JavaToKotlinClassMap.INSTANCE.getClass();
            ClassId classId17 = ((PlatformMutabilityMapping)object0).component1();
            ClassId classId18 = ((PlatformMutabilityMapping)object0).component2();
            ClassId classId19 = ((PlatformMutabilityMapping)object0).component3();
            JavaToKotlinClassMap.a(classId17, classId18);
            FqName fqName17 = classId19.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(fqName17, "mutableClassId.asSingleFqName()");
            JavaToKotlinClassMap.b(fqName17, classId17);
            JavaToKotlinClassMap.l.put(classId19, classId18);
            JavaToKotlinClassMap.m.put(classId18, classId19);
            FqName fqName18 = classId18.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(fqName18, "readOnlyClassId.asSingleFqName()");
            FqName fqName19 = classId19.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(fqName19, "mutableClassId.asSingleFqName()");
            FqNameUnsafe fqNameUnsafe0 = classId19.asSingleFqName().toUnsafe();
            Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "mutableClassId.asSingleFqName().toUnsafe()");
            JavaToKotlinClassMap.j.put(fqNameUnsafe0, fqName18);
            FqNameUnsafe fqNameUnsafe1 = fqName18.toUnsafe();
            Intrinsics.checkNotNullExpressionValue(fqNameUnsafe1, "readOnlyFqName.toUnsafe()");
            JavaToKotlinClassMap.k.put(fqNameUnsafe1, fqName19);
        }
        JvmPrimitiveType[] arr_jvmPrimitiveType = JvmPrimitiveType.values();
        for(int v1 = 0; v1 < arr_jvmPrimitiveType.length; ++v1) {
            JvmPrimitiveType jvmPrimitiveType0 = arr_jvmPrimitiveType[v1];
            ClassId classId20 = ClassId.topLevel(jvmPrimitiveType0.getWrapperFqName());
            Intrinsics.checkNotNullExpressionValue(classId20, "topLevel(jvmType.wrapperFqName)");
            PrimitiveType primitiveType0 = jvmPrimitiveType0.getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType0, "jvmType.primitiveType");
            ClassId classId21 = ClassId.topLevel(StandardNames.getPrimitiveFqName(primitiveType0));
            Intrinsics.checkNotNullExpressionValue(classId21, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            JavaToKotlinClassMap.INSTANCE.getClass();
            JavaToKotlinClassMap.a(classId20, classId21);
        }
        for(Object object1: CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            ClassId classId22 = ClassId.topLevel(new FqName("kotlin.jvm.internal." + ((ClassId)object1).getShortClassName().asString() + "CompanionObject"));
            Intrinsics.checkNotNullExpressionValue(classId22, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            ClassId classId23 = ((ClassId)object1).createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            Intrinsics.checkNotNullExpressionValue(classId23, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            JavaToKotlinClassMap.INSTANCE.getClass();
            JavaToKotlinClassMap.a(classId22, classId23);
        }
        for(int v2 = 0; v2 < 23; ++v2) {
            ClassId classId24 = ClassId.topLevel(new FqName("kotlin.jvm.functions.Function" + v2));
            Intrinsics.checkNotNullExpressionValue(classId24, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            ClassId classId25 = StandardNames.getFunctionClassId(v2);
            JavaToKotlinClassMap.INSTANCE.getClass();
            JavaToKotlinClassMap.a(classId24, classId25);
            JavaToKotlinClassMap.b(new FqName("kotlin.reflect.KFunction" + v2), JavaToKotlinClassMap.g);
        }
        for(int v = 0; v < 22; ++v) {
            FqName fqName20 = new FqName("kotlin.reflect" + '.' + "KSuspendFunction" + v);
            JavaToKotlinClassMap.INSTANCE.getClass();
            JavaToKotlinClassMap.b(fqName20, JavaToKotlinClassMap.g);
        }
        FqName fqName21 = FqNames.nothing.toSafe();
        Intrinsics.checkNotNullExpressionValue(fqName21, "nothing.toSafe()");
        JavaToKotlinClassMap.INSTANCE.getClass();
        JavaToKotlinClassMap.b(fqName21, JavaToKotlinClassMap.e(Void.class));
    }

    public static void a(ClassId classId0, ClassId classId1) {
        FqNameUnsafe fqNameUnsafe0 = classId0.asSingleFqName().toUnsafe();
        Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "javaClassId.asSingleFqName().toUnsafe()");
        JavaToKotlinClassMap.h.put(fqNameUnsafe0, classId1);
        FqName fqName0 = classId1.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqName0, "kotlinClassId.asSingleFqName()");
        JavaToKotlinClassMap.b(fqName0, classId0);
    }

    public static void b(FqName fqName0, ClassId classId0) {
        FqNameUnsafe fqNameUnsafe0 = fqName0.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "kotlinFqNameUnsafe.toUnsafe()");
        JavaToKotlinClassMap.i.put(fqNameUnsafe0, classId0);
    }

    public static void c(Class class0, FqName fqName0) {
        ClassId classId0 = JavaToKotlinClassMap.e(class0);
        ClassId classId1 = ClassId.topLevel(fqName0);
        Intrinsics.checkNotNullExpressionValue(classId1, "topLevel(kotlinFqName)");
        JavaToKotlinClassMap.a(classId0, classId1);
    }

    public static void d(Class class0, FqNameUnsafe fqNameUnsafe0) {
        FqName fqName0 = fqNameUnsafe0.toSafe();
        Intrinsics.checkNotNullExpressionValue(fqName0, "kotlinFqName.toSafe()");
        JavaToKotlinClassMap.c(class0, fqName0);
    }

    public static ClassId e(Class class0) {
        ClassId classId0;
        class0.isPrimitive();
        Class class1 = class0.getDeclaringClass();
        if(class1 == null) {
            classId0 = ClassId.topLevel(new FqName(class0.getCanonicalName()));
            Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(FqName(clazz.canonicalName))");
            return classId0;
        }
        classId0 = JavaToKotlinClassMap.e(class1).createNestedClassId(Name.identifier(class0.getSimpleName()));
        Intrinsics.checkNotNullExpressionValue(classId0, "classId(outer).createNes…tifier(clazz.simpleName))");
        return classId0;
    }

    public static boolean f(FqNameUnsafe fqNameUnsafe0, String s) {
        String s1 = fqNameUnsafe0.asString();
        Intrinsics.checkNotNullExpressionValue(s1, "kotlinFqName.asString()");
        String s2 = StringsKt__StringsKt.substringAfter(s1, s, "");
        if(s2.length() > 0 && !StringsKt__StringsKt.startsWith$default(s2, '0', false, 2, null)) {
            Integer integer0 = o.toIntOrNull(s2);
            return integer0 != null && ((int)integer0) >= 23;
        }
        return false;
    }

    @NotNull
    public final FqName getFUNCTION_N_FQ_NAME() {
        return JavaToKotlinClassMap.f;
    }

    @NotNull
    public final List getMutabilityMappings() {
        return JavaToKotlinClassMap.n;
    }

    public final boolean isMutable(@Nullable FqNameUnsafe fqNameUnsafe0) {
        return JavaToKotlinClassMap.j.containsKey(fqNameUnsafe0);
    }

    public final boolean isReadOnly(@Nullable FqNameUnsafe fqNameUnsafe0) {
        return JavaToKotlinClassMap.k.containsKey(fqNameUnsafe0);
    }

    @Nullable
    public final ClassId mapJavaToKotlin(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        FqNameUnsafe fqNameUnsafe0 = fqName0.toUnsafe();
        return (ClassId)JavaToKotlinClassMap.h.get(fqNameUnsafe0);
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final ClassId mapKotlinToJava(@NotNull FqNameUnsafe fqNameUnsafe0) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe0, "kotlinFqName");
        boolean z = JavaToKotlinClassMap.f(fqNameUnsafe0, "kotlin.Function");
        ClassId classId0 = JavaToKotlinClassMap.e;
        if(!z && !JavaToKotlinClassMap.f(fqNameUnsafe0, "kotlin.coroutines.SuspendFunction")) {
            return JavaToKotlinClassMap.f(fqNameUnsafe0, "kotlin.reflect.KFunction") || JavaToKotlinClassMap.f(fqNameUnsafe0, "kotlin.reflect.KSuspendFunction") ? JavaToKotlinClassMap.g : ((ClassId)JavaToKotlinClassMap.i.get(fqNameUnsafe0));
        }
        return classId0;
    }

    @Nullable
    public final FqName mutableToReadOnly(@Nullable FqNameUnsafe fqNameUnsafe0) {
        return (FqName)JavaToKotlinClassMap.j.get(fqNameUnsafe0);
    }

    @Nullable
    public final FqName readOnlyToMutable(@Nullable FqNameUnsafe fqNameUnsafe0) {
        return (FqName)JavaToKotlinClassMap.k.get(fqNameUnsafe0);
    }
}

