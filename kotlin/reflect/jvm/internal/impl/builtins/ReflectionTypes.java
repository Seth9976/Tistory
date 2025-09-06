package kotlin.reflect.jvm.internal.impl.builtins;

import a7.c;
import d0.s;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1549#2:226\n1620#2,3:227\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n*L\n94#1:226\n94#1:227,3\n*E\n"})
public final class ReflectionTypes {
    @SourceDebugExtension({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1747#2,3:226\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n*L\n122#1:226,3\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final KotlinType createKPropertyStarType(@NotNull ModuleDescriptor moduleDescriptor0) {
            Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
            ClassDescriptor classDescriptor0 = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor0, FqNames.kProperty);
            if(classDescriptor0 == null) {
                return null;
            }
            TypeAttributes typeAttributes0 = TypeAttributes.Companion.getEmpty();
            List list0 = classDescriptor0.getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(list0, "kPropertyClass.typeConstructor.parameters");
            Object object0 = CollectionsKt___CollectionsKt.single(list0);
            Intrinsics.checkNotNullExpressionValue(object0, "kPropertyClass.typeConstructor.parameters.single()");
            return KotlinTypeFactory.simpleNotNullType(typeAttributes0, classDescriptor0, k.listOf(new StarProjectionImpl(((TypeParameterDescriptor)object0))));
        }
    }

    @NotNull
    public static final Companion Companion;
    public final NotFoundClasses a;
    public final Lazy b;
    public final c c;
    public static final KProperty[] d;

    static {
        ReflectionTypes.d = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
        ReflectionTypes.Companion = new Companion(null);
    }

    public ReflectionTypes(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull NotFoundClasses notFoundClasses0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses0, "notFoundClasses");
        super();
        this.a = notFoundClasses0;
        s s0 = new s(moduleDescriptor0, 21);
        this.b = md.c.lazy(LazyThreadSafetyMode.PUBLICATION, s0);
        this.c = new c(28);
    }

    public static final ClassDescriptor access$find(ReflectionTypes reflectionTypes0, String s, int v) {
        reflectionTypes0.getClass();
        Name name0 = Name.identifier(s);
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(className)");
        ClassifierDescriptor classifierDescriptor0 = ((MemberScope)reflectionTypes0.b.getValue()).getContributedClassifier(name0, NoLookupLocation.FROM_REFLECTION);
        ClassDescriptor classDescriptor0 = classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
        if(classDescriptor0 == null) {
            ClassId classId0 = new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, name0);
            List list0 = k.listOf(v);
            return reflectionTypes0.a.getClass(classId0, list0);
        }
        return classDescriptor0;
    }

    @NotNull
    public final ClassDescriptor getKClass() {
        KProperty kProperty0 = ReflectionTypes.d[0];
        this.c.getClass();
        Intrinsics.checkNotNullParameter(this, "types");
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        return ReflectionTypes.access$find(this, CapitalizeDecapitalizeKt.capitalizeAsciiOnly(kProperty0.getName()), 1);
    }
}

