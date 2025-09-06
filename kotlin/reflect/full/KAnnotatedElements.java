package kotlin.reflect.full;

import de.a;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0010\u001B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u001A \u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0004\u001A\u001F\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b\u001A*\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00010\bH\u0007\u001A\u0019\u0010\t\u001A\u00020\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¨\u0006\u000B"}, d2 = {"findAnnotation", "T", "", "Lkotlin/reflect/KAnnotatedElement;", "(Lkotlin/reflect/KAnnotatedElement;)Ljava/lang/annotation/Annotation;", "findAnnotations", "", "klass", "Lkotlin/reflect/KClass;", "hasAnnotation", "", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "KAnnotatedElements")
@SourceDebugExtension({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n20#1:105\n288#2,2:103\n288#2,2:106\n288#2,2:108\n*S KotlinDebug\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n*L\n29#1:105\n20#1:103,2\n29#1:106,2\n62#1:108,2\n*E\n"})
public final class KAnnotatedElements {
    @SinceKotlin(version = "1.1")
    public static final Annotation findAnnotation(KAnnotatedElement kAnnotatedElement0) {
        Intrinsics.checkNotNullParameter(kAnnotatedElement0, "<this>");
        for(Object object0: kAnnotatedElement0.getAnnotations()) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if(((Annotation)object0) == null) {
                continue;
            }
            Intrinsics.reifiedOperationMarker(1, "T?");
            return (Annotation)object0;
        }
        Intrinsics.reifiedOperationMarker(1, "T?");
        return null;
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final List findAnnotations(KAnnotatedElement kAnnotatedElement0) {
        Intrinsics.checkNotNullParameter(kAnnotatedElement0, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        return KAnnotatedElements.findAnnotations(kAnnotatedElement0, Reflection.getOrCreateKotlinClass(Annotation.class));
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final List findAnnotations(@NotNull KAnnotatedElement kAnnotatedElement0, @NotNull KClass kClass0) {
        Class class2;
        Java8RepeatableContainerLoader.Cache java8RepeatableContainerLoader$Cache1;
        Intrinsics.checkNotNullParameter(kAnnotatedElement0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "klass");
        List list0 = q.filterIsInstance(kAnnotatedElement0.getAnnotations(), JvmClassMappingKt.getJavaClass(kClass0));
        if(!list0.isEmpty()) {
            return list0;
        }
        a a0 = a.a;
        Class class0 = JvmClassMappingKt.getJavaClass(kClass0);
        Intrinsics.checkNotNullParameter(class0, "klass");
        Java8RepeatableContainerLoader.Cache java8RepeatableContainerLoader$Cache0 = a.b;
        if(java8RepeatableContainerLoader$Cache0 == null) {
            synchronized(a0) {
                java8RepeatableContainerLoader$Cache0 = a.b;
                if(java8RepeatableContainerLoader$Cache0 == null) {
                    try {
                        Intrinsics.checkNotNull(Repeatable.class, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
                    }
                    catch(ClassNotFoundException unused_ex) {
                        java8RepeatableContainerLoader$Cache1 = new Java8RepeatableContainerLoader.Cache(null, null);
                        goto label_20;
                    }
                    Method method0 = Repeatable.class.getMethod("value", null);
                    java8RepeatableContainerLoader$Cache1 = new Java8RepeatableContainerLoader.Cache(Repeatable.class, method0);
                label_20:
                    a.b = java8RepeatableContainerLoader$Cache1;
                    java8RepeatableContainerLoader$Cache0 = java8RepeatableContainerLoader$Cache1;
                }
            }
        }
        Class class1 = java8RepeatableContainerLoader$Cache0.getRepeatableClass();
        if(class1 == null) {
            class2 = null;
        }
        else {
            Annotation annotation0 = class0.getAnnotation(class1);
            if(annotation0 == null) {
                class2 = null;
            }
            else {
                Method method1 = java8RepeatableContainerLoader$Cache0.getValueMethod();
                if(method1 == null) {
                    class2 = null;
                }
                else {
                    Object object0 = method1.invoke(annotation0, null);
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
                    class2 = (Class)object0;
                }
            }
        }
        if(class2 != null) {
            Object object1 = null;
            for(Object object2: kAnnotatedElement0.getAnnotations()) {
                if(Intrinsics.areEqual(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(((Annotation)object2))), class2)) {
                    object1 = object2;
                    break;
                }
            }
            if(((Annotation)object1) != null) {
                Object object3 = ((Annotation)object1).getClass().getMethod("value", null).invoke(((Annotation)object1), null);
                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.full.KAnnotatedElements.findAnnotations>");
                return ArraysKt___ArraysJvmKt.asList(((Annotation[])object3));
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final boolean hasAnnotation(KAnnotatedElement kAnnotatedElement0) {
        Intrinsics.checkNotNullParameter(kAnnotatedElement0, "<this>");
        for(Object object0: kAnnotatedElement0.getAnnotations()) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if(((Annotation)object0) == null) {
                continue;
            }
            Intrinsics.reifiedOperationMarker(1, "T?");
            return ((Annotation)object0) != null;
        }
        object0 = null;
        Intrinsics.reifiedOperationMarker(1, "T?");
        return ((Annotation)object0) != null;
    }
}

