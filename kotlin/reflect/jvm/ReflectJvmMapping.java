package kotlin.reflect.jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\"\u001B\u0010\u0004\u001A\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003\"\u001B\u0010\b\u001A\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007\"\u001B\u0010\f\u001A\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B\"\u001B\u0010\u0010\u001A\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F\"/\u0010\u0017\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001C\u001A\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001B\"\u001B\u0010\u001F\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0000*\u00020\u00018F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001E\"\u001B\u0010\"\u001A\b\u0012\u0002\b\u0003\u0018\u00010\r*\u00020\u00058F¢\u0006\u0006\u001A\u0004\b \u0010!\"-\u0010\"\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0011*\u00020#*\b\u0012\u0004\u0012\u00028\u00000\u00128F¢\u0006\u0006\u001A\u0004\b \u0010$¨\u0006%"}, d2 = {"Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Field;", "getJavaField", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "getJavaGetter", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaGetter", "Lkotlin/reflect/KMutableProperty;", "getJavaSetter", "(Lkotlin/reflect/KMutableProperty;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KFunction;", "getJavaMethod", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "getJavaConstructor", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "javaConstructor", "Lkotlin/reflect/KType;", "Ljava/lang/reflect/Type;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "javaType", "getKotlinProperty", "(Ljava/lang/reflect/Field;)Lkotlin/reflect/KProperty;", "kotlinProperty", "getKotlinFunction", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/KFunction;", "kotlinFunction", "", "(Ljava/lang/reflect/Constructor;)Lkotlin/reflect/KFunction;", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "ReflectJvmMapping")
@SourceDebugExtension({"SMAP\nReflectJvmMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJvmMapping.kt\nkotlin/reflect/jvm/ReflectJvmMapping\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n800#2,11:149\n288#2,2:160\n288#2,2:162\n800#2,11:164\n288#2,2:175\n288#2,2:177\n288#2,2:180\n288#2,2:182\n1#3:179\n*S KotlinDebug\n*F\n+ 1 ReflectJvmMapping.kt\nkotlin/reflect/jvm/ReflectJvmMapping\n*L\n99#1:149,11\n99#1:160,2\n102#1:162,2\n122#1:164,11\n122#1:175,2\n128#1:177,2\n136#1:180,2\n146#1:182,2\n*E\n"})
public final class ReflectJvmMapping {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Kind.values().length];
            try {
                arr_v[Kind.FILE_FACADE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.MULTIFILE_CLASS.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final KPackageImpl a(Member member0) {
        Kind kotlinClassHeader$Kind0;
        Class class0 = member0.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(class0, "declaringClass");
        ReflectKotlinClass reflectKotlinClass0 = ReflectKotlinClass.Factory.create(class0);
        if(reflectKotlinClass0 == null) {
            kotlinClassHeader$Kind0 = null;
        }
        else {
            KotlinClassHeader kotlinClassHeader0 = reflectKotlinClass0.getClassHeader();
            kotlinClassHeader$Kind0 = kotlinClassHeader0 == null ? null : kotlinClassHeader0.getKind();
        }
        int v = kotlinClassHeader$Kind0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kotlinClassHeader$Kind0.ordinal()];
        if(v == 1 || v == 2 || v == 3) {
            Class class1 = member0.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(class1, "declaringClass");
            return new KPackageImpl(class1);
        }
        return null;
    }

    @Nullable
    public static final Constructor getJavaConstructor(@NotNull KFunction kFunction0) {
        Intrinsics.checkNotNullParameter(kFunction0, "<this>");
        KCallableImpl kCallableImpl0 = UtilKt.asKCallableImpl(kFunction0);
        if(kCallableImpl0 != null) {
            Caller caller0 = kCallableImpl0.getCaller();
            if(caller0 != null) {
                Member member0 = caller0.getMember();
                return member0 instanceof Constructor ? ((Constructor)member0) : null;
            }
        }
        return null;
    }

    public static void getJavaConstructor$annotations(KFunction kFunction0) {
    }

    @Nullable
    public static final Field getJavaField(@NotNull KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(kProperty0, "<this>");
        KPropertyImpl kPropertyImpl0 = UtilKt.asKPropertyImpl(kProperty0);
        return kPropertyImpl0 == null ? null : kPropertyImpl0.getJavaField();
    }

    @Nullable
    public static final Method getJavaGetter(@NotNull KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(kProperty0, "<this>");
        return ReflectJvmMapping.getJavaMethod(kProperty0.getGetter());
    }

    @Nullable
    public static final Method getJavaMethod(@NotNull KFunction kFunction0) {
        Intrinsics.checkNotNullParameter(kFunction0, "<this>");
        KCallableImpl kCallableImpl0 = UtilKt.asKCallableImpl(kFunction0);
        if(kCallableImpl0 != null) {
            Caller caller0 = kCallableImpl0.getCaller();
            if(caller0 != null) {
                Member member0 = caller0.getMember();
                return member0 instanceof Method ? ((Method)member0) : null;
            }
        }
        return null;
    }

    @Nullable
    public static final Method getJavaSetter(@NotNull KMutableProperty kMutableProperty0) {
        Intrinsics.checkNotNullParameter(kMutableProperty0, "<this>");
        return ReflectJvmMapping.getJavaMethod(kMutableProperty0.getSetter());
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "<this>");
        Type type0 = ((KTypeImpl)kType0).getJavaType();
        return type0 == null ? TypesJVMKt.getJavaType(kType0) : type0;
    }

    @Nullable
    public static final KFunction getKotlinFunction(@NotNull Constructor constructor0) {
        Intrinsics.checkNotNullParameter(constructor0, "<this>");
        Class class0 = constructor0.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(class0, "declaringClass");
        for(Object object0: JvmClassMappingKt.getKotlinClass(class0).getConstructors()) {
            if(Intrinsics.areEqual(ReflectJvmMapping.getJavaConstructor(((KFunction)object0)), constructor0)) {
                return (KFunction)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Nullable
    public static final KFunction getKotlinFunction(@NotNull Method method0) {
        Intrinsics.checkNotNullParameter(method0, "<this>");
        if(Modifier.isStatic(method0.getModifiers())) {
            KPackageImpl kPackageImpl0 = ReflectJvmMapping.a(method0);
            if(kPackageImpl0 != null) {
                Iterable iterable0 = kPackageImpl0.getMembers();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    if(object0 instanceof KFunction) {
                        arrayList0.add(object0);
                    }
                }
                for(Object object1: arrayList0) {
                    if(Intrinsics.areEqual(ReflectJvmMapping.getJavaMethod(((KFunction)object1)), method0)) {
                        return (KFunction)object1;
                    }
                    if(false) {
                        break;
                    }
                }
                return null;
            }
            Class class0 = method0.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(class0, "declaringClass");
            KClass kClass0 = KClasses.getCompanionObject(JvmClassMappingKt.getKotlinClass(class0));
            if(kClass0 != null) {
                for(Object object2: KClasses.getFunctions(kClass0)) {
                    Method method1 = ReflectJvmMapping.getJavaMethod(((KFunction)object2));
                    if(method1 == null || !Intrinsics.areEqual(method1.getName(), method0.getName()) || !Arrays.equals(method1.getParameterTypes(), method0.getParameterTypes()) || !Intrinsics.areEqual(method1.getReturnType(), method0.getReturnType())) {
                        continue;
                    }
                    goto label_30;
                }
                object2 = null;
            label_30:
                if(((KFunction)object2) != null) {
                    return (KFunction)object2;
                }
            }
        }
        Class class1 = method0.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(class1, "declaringClass");
        for(Object object3: KClasses.getFunctions(JvmClassMappingKt.getKotlinClass(class1))) {
            if(Intrinsics.areEqual(ReflectJvmMapping.getJavaMethod(((KFunction)object3)), method0)) {
                return (KFunction)object3;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Nullable
    public static final KProperty getKotlinProperty(@NotNull Field field0) {
        Intrinsics.checkNotNullParameter(field0, "<this>");
        if(field0.isSynthetic()) {
            return null;
        }
        KPackageImpl kPackageImpl0 = ReflectJvmMapping.a(field0);
        if(kPackageImpl0 != null) {
            Iterable iterable0 = kPackageImpl0.getMembers();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                if(object0 instanceof KProperty) {
                    arrayList0.add(object0);
                }
            }
            for(Object object1: arrayList0) {
                if(Intrinsics.areEqual(ReflectJvmMapping.getJavaField(((KProperty)object1)), field0)) {
                    return (KProperty)object1;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
        Class class0 = field0.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(class0, "declaringClass");
        for(Object object2: KClasses.getMemberProperties(JvmClassMappingKt.getKotlinClass(class0))) {
            if(Intrinsics.areEqual(ReflectJvmMapping.getJavaField(((KProperty1)object2)), field0)) {
                return (KProperty)object2;
            }
            if(false) {
                break;
            }
        }
        return null;
    }
}

