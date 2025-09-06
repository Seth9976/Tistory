package me;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

public abstract class a {
    public static ClassLiteralValue a(Class class0) {
        int v = 0;
        while(class0.isArray()) {
            ++v;
            class0 = class0.getComponentType();
            Intrinsics.checkNotNullExpressionValue(class0, "currentClass.componentType");
        }
        if(class0.isPrimitive()) {
            if(Intrinsics.areEqual(class0, Void.TYPE)) {
                ClassId classId0 = ClassId.topLevel(FqNames.unit.toSafe());
                Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(StandardNames.FqNames.unit.toSafe())");
                return new ClassLiteralValue(classId0, v);
            }
            PrimitiveType primitiveType0 = JvmPrimitiveType.get(class0.getName()).getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType0, "get(currentClass.name).primitiveType");
            if(v > 0) {
                ClassId classId1 = ClassId.topLevel(primitiveType0.getArrayTypeFqName());
                Intrinsics.checkNotNullExpressionValue(classId1, "topLevel(primitiveType.arrayTypeFqName)");
                return new ClassLiteralValue(classId1, v - 1);
            }
            ClassId classId2 = ClassId.topLevel(primitiveType0.getTypeFqName());
            Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(primitiveType.typeFqName)");
            return new ClassLiteralValue(classId2, v);
        }
        ClassId classId3 = ReflectClassUtilKt.getClassId(class0);
        FqName fqName0 = classId3.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqName0, "javaClassId.asSingleFqName()");
        ClassId classId4 = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(fqName0);
        if(classId4 != null) {
            classId3 = classId4;
        }
        return new ClassLiteralValue(classId3, v);
    }

    public static void b(AnnotationVisitor kotlinJvmBinaryClass$AnnotationVisitor0, Annotation annotation0) {
        Class class0 = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation0));
        AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor0 = kotlinJvmBinaryClass$AnnotationVisitor0.visitAnnotation(ReflectClassUtilKt.getClassId(class0), new ReflectAnnotationSource(annotation0));
        if(kotlinJvmBinaryClass$AnnotationArgumentVisitor0 != null) {
            a.c(kotlinJvmBinaryClass$AnnotationArgumentVisitor0, annotation0, class0);
        }
    }

    public static void c(AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor0, Annotation annotation0, Class class0) {
        Object object0;
        Method[] arr_method = class0.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(arr_method, "annotationType.declaredMethods");
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            try {
                object0 = method0.invoke(annotation0, null);
                Intrinsics.checkNotNull(object0);
            }
            catch(IllegalAccessException unused_ex) {
                continue;
            }
            Name name0 = Name.identifier(method0.getName());
            Intrinsics.checkNotNullExpressionValue(name0, "identifier(method.name)");
            Class class1 = object0.getClass();
            Class class2 = Class.class;
            if(Intrinsics.areEqual(class1, class2)) {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type java.lang.Class<*>");
                kotlinJvmBinaryClass$AnnotationArgumentVisitor0.visitClassLiteral(name0, a.a(((Class)object0)));
            }
            else if(ReflectKotlinClassKt.a.contains(class1)) {
                kotlinJvmBinaryClass$AnnotationArgumentVisitor0.visit(name0, object0);
            }
            else if(ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(class1)) {
                if(!class1.isEnum()) {
                    class1 = class1.getEnclosingClass();
                }
                Intrinsics.checkNotNullExpressionValue(class1, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                ClassId classId0 = ReflectClassUtilKt.getClassId(class1);
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Enum<*>");
                Name name1 = Name.identifier(((Enum)object0).name());
                Intrinsics.checkNotNullExpressionValue(name1, "identifier((value as Enum<*>).name)");
                kotlinJvmBinaryClass$AnnotationArgumentVisitor0.visitEnum(name0, classId0, name1);
            }
            else {
                Class class3 = Annotation.class;
                if(class3.isAssignableFrom(class1)) {
                    Class[] arr_class = class1.getInterfaces();
                    Intrinsics.checkNotNullExpressionValue(arr_class, "clazz.interfaces");
                    Class class4 = (Class)ArraysKt___ArraysKt.single(arr_class);
                    Intrinsics.checkNotNullExpressionValue(class4, "annotationClass");
                    AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor1 = kotlinJvmBinaryClass$AnnotationArgumentVisitor0.visitAnnotation(name0, ReflectClassUtilKt.getClassId(class4));
                    if(kotlinJvmBinaryClass$AnnotationArgumentVisitor1 != null) {
                        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Annotation");
                        a.c(kotlinJvmBinaryClass$AnnotationArgumentVisitor1, ((Annotation)object0), class4);
                    }
                }
                else {
                    if(!class1.isArray()) {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + class1 + "): " + object0);
                    }
                    AnnotationArrayArgumentVisitor kotlinJvmBinaryClass$AnnotationArrayArgumentVisitor0 = kotlinJvmBinaryClass$AnnotationArgumentVisitor0.visitArray(name0);
                    if(kotlinJvmBinaryClass$AnnotationArrayArgumentVisitor0 != null) {
                        Class class5 = class1.getComponentType();
                        if(class5.isEnum()) {
                            Intrinsics.checkNotNullExpressionValue(class5, "componentType");
                            ClassId classId1 = ReflectClassUtilKt.getClassId(class5);
                            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<*>");
                            Object[] arr_object = (Object[])object0;
                            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                                Object object1 = arr_object[v1];
                                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Enum<*>");
                                Name name2 = Name.identifier(((Enum)object1).name());
                                Intrinsics.checkNotNullExpressionValue(name2, "identifier((element as Enum<*>).name)");
                                kotlinJvmBinaryClass$AnnotationArrayArgumentVisitor0.visitEnum(classId1, name2);
                            }
                        }
                        else if(Intrinsics.areEqual(class5, class2)) {
                            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<*>");
                            Object[] arr_object1 = (Object[])object0;
                            for(int v2 = 0; v2 < arr_object1.length; ++v2) {
                                Object object2 = arr_object1[v2];
                                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.lang.Class<*>");
                                kotlinJvmBinaryClass$AnnotationArrayArgumentVisitor0.visitClassLiteral(a.a(((Class)object2)));
                            }
                        }
                        else if(class3.isAssignableFrom(class5)) {
                            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<*>");
                            Object[] arr_object2 = (Object[])object0;
                            for(int v3 = 0; v3 < arr_object2.length; ++v3) {
                                Object object3 = arr_object2[v3];
                                Intrinsics.checkNotNullExpressionValue(class5, "componentType");
                                AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor2 = kotlinJvmBinaryClass$AnnotationArrayArgumentVisitor0.visitAnnotation(ReflectClassUtilKt.getClassId(class5));
                                if(kotlinJvmBinaryClass$AnnotationArgumentVisitor2 != null) {
                                    Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Annotation");
                                    a.c(kotlinJvmBinaryClass$AnnotationArgumentVisitor2, ((Annotation)object3), class5);
                                }
                            }
                        }
                        else {
                            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<*>");
                            Object[] arr_object3 = (Object[])object0;
                            for(int v4 = 0; v4 < arr_object3.length; ++v4) {
                                kotlinJvmBinaryClass$AnnotationArrayArgumentVisitor0.visit(arr_object3[v4]);
                            }
                        }
                        kotlinJvmBinaryClass$AnnotationArrayArgumentVisitor0.visitEnd();
                    }
                }
            }
        }
        kotlinJvmBinaryClass$AnnotationArgumentVisitor0.visitEnd();
    }
}

