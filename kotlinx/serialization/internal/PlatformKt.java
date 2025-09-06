package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001A(\u0010\u0004\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b\u0004\u0010\u0005\u001A\u001C\u0010\u0004\u001A\u00020\u0007*\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002H\u0080\b\u00A2\u0006\u0004\b\u0004\u0010\b\u001A+\u0010\f\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000B\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\nH\u0000\u00A2\u0006\u0004\b\f\u0010\r\u001AM\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\t\"\n\b\u0001\u0010\u000E*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010\u000Fj\b\u0012\u0004\u0012\u00028\u0001`\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A\u0017\u0010\u0015\u001A\u00020\u0014*\u0006\u0012\u0002\b\u00030\nH\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A\u0017\u0010\u0018\u001A\u00020\u0014*\u0006\u0012\u0002\b\u00030\u0017H\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001AO\u0010\u001B\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000B\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\n2\"\u0010\u001A\u001A\u0012\u0012\u000E\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000B0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000BH\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001AO\u0010\u001B\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000B\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u00172\"\u0010\u001A\u001A\u0012\u0012\u000E\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000B0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000BH\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001D\u001A\u001D\u0010\u001F\u001A\u00020\u00072\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\t0\nH\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u00A8\u0006!"}, d2 = {"T", "", "", "index", "getChecked", "([Ljava/lang/Object;I)Ljava/lang/Object;", "", "", "([ZI)Z", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "compiledSerializerImpl", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "toNativeArrayImpl", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "", "platformSpecificSerializerNotRegistered", "(Lkotlin/reflect/KClass;)Ljava/lang/Void;", "Ljava/lang/Class;", "serializerNotRegistered", "(Ljava/lang/Class;)Ljava/lang/Void;", "args", "constructSerializerForGivenTypeArgs", "(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "rootClass", "isReferenceArray", "(Lkotlin/reflect/KClass;)Z", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,174:1\n1#2:175\n3133#3,11:176\n1282#3,2:187\n3133#3,11:190\n3133#3,11:201\n26#4:189\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n*L\n70#1:176,11\n78#1:187,2\n161#1:190,11\n166#1:201,11\n129#1:189\n*E\n"})
public final class PlatformKt {
    public static final KSerializer a(Object object0, KSerializer[] arr_kSerializer) {
        Throwable throwable0;
        Class[] arr_class1;
        try {
            if(arr_kSerializer.length == 0) {
                arr_class1 = new Class[0];
            }
            else {
                Class[] arr_class = new Class[arr_kSerializer.length];
                for(int v = 0; v < arr_kSerializer.length; ++v) {
                    arr_class[v] = KSerializer.class;
                }
                arr_class1 = arr_class;
            }
            Object object1 = object0.getClass().getDeclaredMethod("serializer", ((Class[])Arrays.copyOf(arr_class1, arr_class1.length))).invoke(object0, Arrays.copyOf(arr_kSerializer, arr_kSerializer.length));
            return object1 instanceof KSerializer ? ((KSerializer)object1) : null;
        label_13:
            throwable0 = invocationTargetException0.getCause();
            if(throwable0 == null) {
                throw invocationTargetException0;
            }
        }
        catch(NoSuchMethodException unused_ex) {
            return null;
        }
        catch(InvocationTargetException invocationTargetException0) {
            goto label_13;
        }
        String s = throwable0.getMessage();
        if(s == null) {
            s = invocationTargetException0.getMessage();
        }
        throw new InvocationTargetException(throwable0, s);
    }

    @Nullable
    public static final KSerializer compiledSerializerImpl(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        return PlatformKt.constructSerializerForGivenTypeArgs(kClass0, new KSerializer[0]);
    }

    @Nullable
    public static final KSerializer constructSerializerForGivenTypeArgs(@NotNull Class class0, @NotNull KSerializer[] arr_kSerializer) {
        KSerializer kSerializer3;
        Object object4;
        Object object3;
        Class class4;
        KSerializer kSerializer2;
        Object object0;
        Intrinsics.checkNotNullParameter(class0, "<this>");
        Intrinsics.checkNotNullParameter(arr_kSerializer, "args");
        Class class1 = Polymorphic.class;
        Class class2 = Serializable.class;
        if(class0.isEnum() && class0.getAnnotation(class2) == null && class0.getAnnotation(class1) == null) {
            Object[] arr_object = class0.getEnumConstants();
            String s = class0.getCanonicalName();
            Intrinsics.checkNotNullExpressionValue(s, "getCanonicalName(...)");
            Intrinsics.checkNotNull(arr_object, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new EnumSerializer(s, ((Enum[])arr_object));
        }
        Class class3 = PolymorphicSerializer.class;
        if(class0.isInterface()) {
            Serializable serializable0 = (Serializable)class0.getAnnotation(class2);
            KSerializer kSerializer0 = serializable0 == null || Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable0.with()), Reflection.getOrCreateKotlinClass(class3)) ? new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(class0)) : null;
            if(kSerializer0 != null) {
                return kSerializer0;
            }
        }
        KSerializer[] arr_kSerializer1 = (KSerializer[])Arrays.copyOf(arr_kSerializer, arr_kSerializer.length);
        try {
            Field field0 = class0.getDeclaredField("Companion");
            field0.setAccessible(true);
            object0 = null;
            object0 = field0.get(null);
        }
        catch(Throwable unused_ex) {
        }
        KSerializer kSerializer1 = object0 == null ? null : PlatformKt.a(object0, ((KSerializer[])Arrays.copyOf(arr_kSerializer1, arr_kSerializer1.length)));
        if(kSerializer1 != null) {
            return kSerializer1;
        }
        String s1 = class0.getCanonicalName();
        if(s1 == null || p.startsWith$default(s1, "java.", false, 2, null) || p.startsWith$default(s1, "kotlin.", false, 2, null)) {
            kSerializer2 = null;
        }
        else {
            Field[] arr_field = class0.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(arr_field, "getDeclaredFields(...)");
            Field field1 = null;
            int v = 0;
            boolean z = false;
            while(v < arr_field.length) {
                Field field2 = arr_field[v];
                if(Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), class0) && Modifier.isStatic(field2.getModifiers())) {
                    if(!z) {
                        z = true;
                        field1 = field2;
                        goto label_43;
                    }
                    field1 = null;
                    goto label_47;
                }
            label_43:
                ++v;
            }
            if(!z) {
                field1 = null;
            }
        label_47:
            if(field1 == null) {
                kSerializer2 = null;
            }
            else {
                Object object1 = field1.get(null);
                Method[] arr_method = class0.getMethods();
                Intrinsics.checkNotNullExpressionValue(arr_method, "getMethods(...)");
                Method method0 = null;
                int v1 = 0;
                boolean z1 = false;
                while(v1 < arr_method.length) {
                    Method method1 = arr_method[v1];
                    if(Intrinsics.areEqual(method1.getName(), "serializer")) {
                        Class[] arr_class = method1.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(arr_class, "getParameterTypes(...)");
                        if(arr_class.length == 0 && Intrinsics.areEqual(method1.getReturnType(), KSerializer.class)) {
                            if(!z1) {
                                method0 = method1;
                                z1 = true;
                                goto label_66;
                            }
                            method0 = null;
                            goto label_70;
                        }
                    }
                label_66:
                    ++v1;
                }
                if(!z1) {
                    method0 = null;
                }
            label_70:
                if(method0 == null) {
                    kSerializer2 = null;
                }
                else {
                    Object object2 = method0.invoke(object1, null);
                    kSerializer2 = object2 instanceof KSerializer ? ((KSerializer)object2) : null;
                }
            }
        }
        if(kSerializer2 != null) {
            return kSerializer2;
        }
        KSerializer[] arr_kSerializer2 = (KSerializer[])Arrays.copyOf(arr_kSerializer, arr_kSerializer.length);
        Class[] arr_class1 = class0.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(arr_class1, "getDeclaredClasses(...)");
        for(int v2 = 0; true; ++v2) {
            class4 = null;
            if(v2 >= arr_class1.length) {
                break;
            }
            Class class5 = arr_class1[v2];
            if(class5.getAnnotation(NamedCompanion.class) != null) {
                class4 = class5;
                break;
            }
        }
        if(class4 == null) {
            object3 = null;
        }
        else {
            String s2 = class4.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(s2, "getSimpleName(...)");
            try {
                Field field3 = class0.getDeclaredField(s2);
                field3.setAccessible(true);
                object3 = null;
                object3 = field3.get(null);
            }
            catch(Throwable unused_ex) {
            }
        }
        if(object3 == null) {
            try {
            label_109:
                Class[] arr_class2 = class0.getDeclaredClasses();
                Intrinsics.checkNotNullExpressionValue(arr_class2, "getDeclaredClasses(...)");
                Class class6 = null;
                int v3 = 0;
                boolean z2 = false;
                while(v3 < arr_class2.length) {
                    Class class7 = arr_class2[v3];
                    if(Intrinsics.areEqual(class7.getSimpleName(), "$serializer")) {
                        if(z2) {
                            class6 = null;
                            goto label_126;
                        }
                        z2 = true;
                        class6 = class7;
                    }
                    ++v3;
                }
                if(!z2) {
                    class6 = null;
                }
            label_126:
                if(class6 == null) {
                    object4 = null;
                }
                else {
                    Field field4 = class6.getField("INSTANCE");
                    object4 = field4 == null ? null : field4.get(null);
                }
                kSerializer3 = object4 instanceof KSerializer ? ((KSerializer)object4) : null;
            }
            catch(NoSuchFieldException unused_ex) {
                kSerializer3 = null;
            }
        }
        else {
            kSerializer3 = PlatformKt.a(object3, ((KSerializer[])Arrays.copyOf(arr_kSerializer2, arr_kSerializer2.length)));
            if(kSerializer3 == null) {
                goto label_109;
            }
        }
        if(kSerializer3 != null) {
            return kSerializer3;
        }
        if(class0.getAnnotation(class1) == null) {
            Serializable serializable1 = (Serializable)class0.getAnnotation(class2);
            if(serializable1 == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable1.with()), Reflection.getOrCreateKotlinClass(class3))) {
                return null;
            }
        }
        return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(class0));
    }

    @Nullable
    public static final KSerializer constructSerializerForGivenTypeArgs(@NotNull KClass kClass0, @NotNull KSerializer[] arr_kSerializer) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Intrinsics.checkNotNullParameter(arr_kSerializer, "args");
        return PlatformKt.constructSerializerForGivenTypeArgs(JvmClassMappingKt.getJavaClass(kClass0), ((KSerializer[])Arrays.copyOf(arr_kSerializer, arr_kSerializer.length)));
    }

    public static final Object getChecked(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return arr_object[v];
    }

    public static final boolean getChecked(@NotNull boolean[] arr_z, int v) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z[v];
    }

    public static final boolean isReferenceArray(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "rootClass");
        return JvmClassMappingKt.getJavaClass(kClass0).isArray();
    }

    @NotNull
    public static final Void platformSpecificSerializerNotRegistered(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Platform_commonKt.serializerNotRegistered(kClass0);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Void serializerNotRegistered(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(JvmClassMappingKt.getKotlinClass(class0)));
    }

    @NotNull
    public static final Object[] toNativeArrayImpl(@NotNull ArrayList arrayList0, @NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(arrayList0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "eClass");
        Object object0 = Array.newInstance(JvmClassMappingKt.getJavaClass(kClass0), arrayList0.size());
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] arr_object = arrayList0.toArray(((Object[])object0));
        Intrinsics.checkNotNullExpressionValue(arr_object, "toArray(...)");
        return arr_object;
    }
}

