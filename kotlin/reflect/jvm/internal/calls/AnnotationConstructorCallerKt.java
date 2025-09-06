package kotlin.reflect.jvm.internal.calls;

import aa.m;
import d0.s;
import ge.a;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import md.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001AK\u0010\n\u001A\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000\u00042\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000B¨\u0006\u000F²\u0006\u0016\u0010\r\u001A\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008A\u0084\u0002²\u0006\u0016\u0010\u000E\u001A\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008A\u0084\u0002"}, d2 = {"", "T", "Ljava/lang/Class;", "annotationClass", "", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "createAnnotationInstance", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "", "hashCode", "toString", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,181:1\n11335#2:182\n11670#2,3:183\n37#3,2:186\n18#3:195\n1549#4:188\n1620#4,3:189\n1726#4,3:192\n26#5:196\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n*L\n75#1:182\n75#1:183,3\n75#1:186,2\n173#1:195\n102#1:188\n102#1:189,3\n106#1:192,3\n173#1:196\n*E\n"})
public final class AnnotationConstructorCallerKt {
    public static final Void access$throwIllegalArgumentType(int v, String s, Class class0) {
        String s1;
        KClass kClass0;
        Class class1 = Class.class;
        if(Intrinsics.areEqual(class0, class1)) {
            kClass0 = Reflection.getOrCreateKotlinClass(KClass.class);
        }
        else {
            kClass0 = !class0.isArray() || !Intrinsics.areEqual(class0.getComponentType(), class1) ? JvmClassMappingKt.getKotlinClass(class0) : Reflection.getOrCreateKotlinClass(KClass[].class);
        }
        if(Intrinsics.areEqual(kClass0.getQualifiedName(), Reflection.getOrCreateKotlinClass(Object[].class).getQualifiedName())) {
            Class class2 = JvmClassMappingKt.getJavaClass(kClass0).getComponentType();
            Intrinsics.checkNotNullExpressionValue(class2, "kotlinClass.java.componentType");
            s1 = kClass0.getQualifiedName() + '<' + JvmClassMappingKt.getKotlinClass(class2).getQualifiedName() + '>';
        }
        else {
            s1 = kClass0.getQualifiedName();
        }
        throw new IllegalArgumentException("Argument #" + v + ' ' + s + " is not of the required type " + s1);
    }

    public static final Object access$transformKotlinToJvm(Object object0, Class class0) {
        if(!(object0 instanceof Class)) {
            if(object0 instanceof KClass) {
                object0 = JvmClassMappingKt.getJavaClass(((KClass)object0));
                return class0.isInstance(object0) ? object0 : null;
            }
            boolean z = false;
            if(!(object0 instanceof Object[])) {
                z = true;
            }
            else if(!(((Object[])object0) instanceof Class[])) {
                z = true;
                if(((Object[])object0) instanceof KClass[]) {
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                    KClass[] arr_kClass = (KClass[])object0;
                    ArrayList arrayList0 = new ArrayList(arr_kClass.length);
                    for(int v = 0; v < arr_kClass.length; ++v) {
                        arrayList0.add(JvmClassMappingKt.getJavaClass(arr_kClass[v]));
                    }
                    object0 = arrayList0.toArray(new Class[0]);
                    return class0.isInstance(object0) ? object0 : null;
                }
                object0 = (Object[])object0;
            }
            if(z) {
                return class0.isInstance(object0) ? object0 : null;
            }
        }
        return null;
    }

    @NotNull
    public static final Object createAnnotationInstance(@NotNull Class class0, @NotNull Map map0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(class0, "annotationClass");
        Intrinsics.checkNotNullParameter(map0, "values");
        Intrinsics.checkNotNullParameter(list0, "methods");
        Lazy lazy0 = c.lazy(new s(map0, 15));
        a a0 = new a(class0, map0, c.lazy(new m(24, class0, map0)), lazy0, list0);
        Object object0 = Proxy.newProxyInstance(class0.getClassLoader(), new Class[]{class0}, a0);
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return object0;
    }

    public static Object createAnnotationInstance$default(Class class0, Map map0, List list0, int v, Object object0) {
        if((v & 4) != 0) {
            Iterable iterable0 = map0.keySet();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object1: iterable0) {
                arrayList0.add(class0.getDeclaredMethod(((String)object1), null));
            }
            list0 = arrayList0;
        }
        return AnnotationConstructorCallerKt.createAnnotationInstance(class0, map0, list0);
    }
}

