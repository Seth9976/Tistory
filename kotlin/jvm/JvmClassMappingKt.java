package kotlin.jvm;

import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u001B\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0002\b\u0007\u001A!\u0010\u0004\u001A\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"-\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00068G¢\u0006\f\u0012\u0004\b\n\u0010\u000B\u001A\u0004\b\b\u0010\t\"-\u0010\u000E\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001A\u0004\b\r\u0010\t\"+\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001A\u0004\b\u000F\u0010\t\"+\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00078G¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012\"&\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00008Æ\u0002¢\u0006\u0006\u001A\u0004\b\b\u0010\u0014\";\u0010\u0015\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000B\u001A\u0004\b\u0016\u0010\t\"\'\u0010\u001B\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0018*\u00028\u00008F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A\";\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u000E\b\u0000\u0010\u001D*\b\u0012\u0004\u0012\u00028\u00000\u001C*\b\u0012\u0004\u0012\u00028\u00000\u001C8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001A\u0004\b\u001E\u0010\u001F¨\u0006#"}, d2 = {"", "T", "", "", "isArrayOf", "([Ljava/lang/Object;)Z", "Lkotlin/reflect/KClass;", "Ljava/lang/Class;", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "java", "getJavaPrimitiveType", "javaPrimitiveType", "getJavaObjectType", "javaObjectType", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "kotlin", "(Ljava/lang/Object;)Ljava/lang/Class;", "javaClass", "getRuntimeClassOfKClassInstance", "getRuntimeClassOfKClassInstance$annotations", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "annotationClass", "", "E", "getDeclaringJavaClass", "(Ljava/lang/Enum;)Ljava/lang/Class;", "getDeclaringJavaClass$annotations", "(Ljava/lang/Enum;)V", "declaringJavaClass", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "JvmClassMappingKt")
public final class JvmClassMappingKt {
    @NotNull
    public static final KClass getAnnotationClass(@NotNull Annotation annotation0) {
        Intrinsics.checkNotNullParameter(annotation0, "<this>");
        Class class0 = annotation0.annotationType();
        Intrinsics.checkNotNullExpressionValue(class0, "annotationType(...)");
        KClass kClass0 = JvmClassMappingKt.getKotlinClass(class0);
        Intrinsics.checkNotNull(kClass0, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return kClass0;
    }

    @SinceKotlin(version = "1.7")
    @InlineOnly
    public static void getDeclaringJavaClass$annotations(Enum enum0) {
    }

    @NotNull
    public static final Class getJavaClass(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "<this>");
        Class class0 = object0.getClass();
        Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return class0;
    }

    @JvmName(name = "getJavaClass")
    @NotNull
    public static final Class getJavaClass(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Class class0 = ((ClassBasedDeclarationContainer)kClass0).getJClass();
        Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return class0;
    }

    public static void getJavaClass$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Class getJavaObjectType(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Class class0 = ((ClassBasedDeclarationContainer)kClass0).getJClass();
        if(!class0.isPrimitive()) {
            Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return class0;
        }
        switch(class0.getName()) {
            case "boolean": {
                class0 = Boolean.class;
                break;
            }
            case "byte": {
                class0 = Byte.class;
                break;
            }
            case "char": {
                class0 = Character.class;
                break;
            }
            case "double": {
                class0 = Double.class;
                break;
            }
            case "float": {
                class0 = Float.class;
                break;
            }
            case "int": {
                class0 = Integer.class;
                break;
            }
            case "long": {
                class0 = Long.class;
                break;
            }
            case "short": {
                class0 = Short.class;
                break;
            }
            case "void": {
                class0 = Void.class;
            }
        }
        Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return class0;
    }

    @Nullable
    public static final Class getJavaPrimitiveType(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Class class0 = ((ClassBasedDeclarationContainer)kClass0).getJClass();
        if(class0.isPrimitive()) {
            Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return class0;
        }
        switch(class0.getName()) {
            case "java.lang.Boolean": {
                return Boolean.TYPE;
            }
            case "java.lang.Byte": {
                return Byte.TYPE;
            }
            case "java.lang.Character": {
                return Character.TYPE;
            }
            case "java.lang.Double": {
                return Double.TYPE;
            }
            case "java.lang.Float": {
                return Float.TYPE;
            }
            case "java.lang.Integer": {
                return Integer.TYPE;
            }
            case "java.lang.Long": {
                return Long.TYPE;
            }
            case "java.lang.Short": {
                return Short.TYPE;
            }
            case "java.lang.Void": {
                return Void.TYPE;
            }
            default: {
                return null;
            }
        }
    }

    @JvmName(name = "getKotlinClass")
    @NotNull
    public static final KClass getKotlinClass(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        return Reflection.getOrCreateKotlinClass(class0);
    }

    @JvmName(name = "getRuntimeClassOfKClassInstance")
    @NotNull
    public static final Class getRuntimeClassOfKClassInstance(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Class class0 = kClass0.getClass();
        Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return class0;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use \'java\' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @ReplaceWith(expression = "(this as Any).javaClass", imports = {}))
    public static void getRuntimeClassOfKClassInstance$annotations(KClass kClass0) {
    }

    public static final boolean isArrayOf(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        Class class0 = arr_object.getClass().getComponentType();
        return Object.class.isAssignableFrom(class0);
    }
}

