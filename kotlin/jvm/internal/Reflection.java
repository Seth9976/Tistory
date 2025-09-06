package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

public class Reflection {
    public static final ReflectionFactory a;
    public static final KClass[] b;

    static {
        ReflectionFactory reflectionFactory0 = null;
        try {
            reflectionFactory0 = (ReflectionFactory)ReflectionFactoryImpl.class.newInstance();
        }
        catch(ClassCastException | ClassNotFoundException | InstantiationException | IllegalAccessException unused_ex) {
        }
        if(reflectionFactory0 == null) {
            reflectionFactory0 = new ReflectionFactory();
        }
        Reflection.a = reflectionFactory0;
        Reflection.b = new KClass[0];
    }

    public static KClass createKotlinClass(Class class0) {
        return Reflection.a.createKotlinClass(class0);
    }

    public static KClass createKotlinClass(Class class0, String s) {
        return Reflection.a.createKotlinClass(class0, s);
    }

    public static KFunction function(FunctionReference functionReference0) {
        return Reflection.a.function(functionReference0);
    }

    public static KClass getOrCreateKotlinClass(Class class0) {
        return Reflection.a.getOrCreateKotlinClass(class0);
    }

    public static KClass getOrCreateKotlinClass(Class class0, String s) {
        return Reflection.a.getOrCreateKotlinClass(class0, s);
    }

    public static KClass[] getOrCreateKotlinClasses(Class[] arr_class) {
        if(arr_class.length == 0) {
            return Reflection.b;
        }
        KClass[] arr_kClass = new KClass[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_kClass[v] = Reflection.getOrCreateKotlinClass(arr_class[v]);
        }
        return arr_kClass;
    }

    @SinceKotlin(version = "1.4")
    public static KDeclarationContainer getOrCreateKotlinPackage(Class class0) {
        return Reflection.a.getOrCreateKotlinPackage(class0, "");
    }

    public static KDeclarationContainer getOrCreateKotlinPackage(Class class0, String s) {
        return Reflection.a.getOrCreateKotlinPackage(class0, s);
    }

    @SinceKotlin(version = "1.6")
    public static KType mutableCollectionType(KType kType0) {
        return Reflection.a.mutableCollectionType(kType0);
    }

    public static KMutableProperty0 mutableProperty0(MutablePropertyReference0 mutablePropertyReference00) {
        return Reflection.a.mutableProperty0(mutablePropertyReference00);
    }

    public static KMutableProperty1 mutableProperty1(MutablePropertyReference1 mutablePropertyReference10) {
        return Reflection.a.mutableProperty1(mutablePropertyReference10);
    }

    public static KMutableProperty2 mutableProperty2(MutablePropertyReference2 mutablePropertyReference20) {
        return Reflection.a.mutableProperty2(mutablePropertyReference20);
    }

    @SinceKotlin(version = "1.6")
    public static KType nothingType(KType kType0) {
        return Reflection.a.nothingType(kType0);
    }

    @SinceKotlin(version = "1.4")
    public static KType nullableTypeOf(Class class0) {
        KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
        List list0 = Collections.emptyList();
        return Reflection.a.typeOf(kClass0, list0, true);
    }

    @SinceKotlin(version = "1.4")
    public static KType nullableTypeOf(Class class0, KTypeProjection kTypeProjection0) {
        KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
        List list0 = Collections.singletonList(kTypeProjection0);
        return Reflection.a.typeOf(kClass0, list0, true);
    }

    @SinceKotlin(version = "1.4")
    public static KType nullableTypeOf(Class class0, KTypeProjection kTypeProjection0, KTypeProjection kTypeProjection1) {
        KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
        List list0 = Arrays.asList(new KTypeProjection[]{kTypeProjection0, kTypeProjection1});
        return Reflection.a.typeOf(kClass0, list0, true);
    }

    @SinceKotlin(version = "1.4")
    public static KType nullableTypeOf(Class class0, KTypeProjection[] arr_kTypeProjection) {
        KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
        List list0 = ArraysKt___ArraysKt.toList(arr_kTypeProjection);
        return Reflection.a.typeOf(kClass0, list0, true);
    }

    @SinceKotlin(version = "1.4")
    public static KType nullableTypeOf(KClassifier kClassifier0) {
        List list0 = Collections.emptyList();
        return Reflection.a.typeOf(kClassifier0, list0, true);
    }

    @SinceKotlin(version = "1.6")
    public static KType platformType(KType kType0, KType kType1) {
        return Reflection.a.platformType(kType0, kType1);
    }

    public static KProperty0 property0(PropertyReference0 propertyReference00) {
        return Reflection.a.property0(propertyReference00);
    }

    public static KProperty1 property1(PropertyReference1 propertyReference10) {
        return Reflection.a.property1(propertyReference10);
    }

    public static KProperty2 property2(PropertyReference2 propertyReference20) {
        return Reflection.a.property2(propertyReference20);
    }

    @SinceKotlin(version = "1.3")
    public static String renderLambdaToString(FunctionBase functionBase0) {
        return Reflection.a.renderLambdaToString(functionBase0);
    }

    @SinceKotlin(version = "1.1")
    public static String renderLambdaToString(Lambda lambda0) {
        return Reflection.a.renderLambdaToString(lambda0);
    }

    @SinceKotlin(version = "1.4")
    public static void setUpperBounds(KTypeParameter kTypeParameter0, KType kType0) {
        List list0 = Collections.singletonList(kType0);
        Reflection.a.setUpperBounds(kTypeParameter0, list0);
    }

    @SinceKotlin(version = "1.4")
    public static void setUpperBounds(KTypeParameter kTypeParameter0, KType[] arr_kType) {
        List list0 = ArraysKt___ArraysKt.toList(arr_kType);
        Reflection.a.setUpperBounds(kTypeParameter0, list0);
    }

    @SinceKotlin(version = "1.4")
    public static KType typeOf(Class class0) {
        KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
        List list0 = Collections.emptyList();
        return Reflection.a.typeOf(kClass0, list0, false);
    }

    @SinceKotlin(version = "1.4")
    public static KType typeOf(Class class0, KTypeProjection kTypeProjection0) {
        KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
        List list0 = Collections.singletonList(kTypeProjection0);
        return Reflection.a.typeOf(kClass0, list0, false);
    }

    @SinceKotlin(version = "1.4")
    public static KType typeOf(Class class0, KTypeProjection kTypeProjection0, KTypeProjection kTypeProjection1) {
        KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
        List list0 = Arrays.asList(new KTypeProjection[]{kTypeProjection0, kTypeProjection1});
        return Reflection.a.typeOf(kClass0, list0, false);
    }

    @SinceKotlin(version = "1.4")
    public static KType typeOf(Class class0, KTypeProjection[] arr_kTypeProjection) {
        KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
        List list0 = ArraysKt___ArraysKt.toList(arr_kTypeProjection);
        return Reflection.a.typeOf(kClass0, list0, false);
    }

    @SinceKotlin(version = "1.4")
    public static KType typeOf(KClassifier kClassifier0) {
        List list0 = Collections.emptyList();
        return Reflection.a.typeOf(kClassifier0, list0, false);
    }

    @SinceKotlin(version = "1.4")
    public static KTypeParameter typeParameter(Object object0, String s, KVariance kVariance0, boolean z) {
        return Reflection.a.typeParameter(object0, s, kVariance0, z);
    }
}

