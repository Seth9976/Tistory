package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.text.p;
import me.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectKotlinClass implements KotlinJvmBinaryClass {
    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final ReflectKotlinClass create(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "klass");
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor0 = new ReadKotlinClassHeaderAnnotationVisitor();
            Intrinsics.checkNotNullParameter(class0, "klass");
            Intrinsics.checkNotNullParameter(readKotlinClassHeaderAnnotationVisitor0, "visitor");
            Annotation[] arr_annotation = class0.getDeclaredAnnotations();
            Intrinsics.checkNotNullExpressionValue(arr_annotation, "klass.declaredAnnotations");
            for(int v = 0; v < arr_annotation.length; ++v) {
                Annotation annotation0 = arr_annotation[v];
                Intrinsics.checkNotNullExpressionValue(annotation0, "annotation");
                Class class1 = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation0));
                AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor0 = readKotlinClassHeaderAnnotationVisitor0.visitAnnotation(ReflectClassUtilKt.getClassId(class1), new ReflectAnnotationSource(annotation0));
                if(kotlinJvmBinaryClass$AnnotationArgumentVisitor0 != null) {
                    a.c(kotlinJvmBinaryClass$AnnotationArgumentVisitor0, annotation0, class1);
                }
            }
            readKotlinClassHeaderAnnotationVisitor0.visitEnd();
            KotlinClassHeader kotlinClassHeader0 = readKotlinClassHeaderAnnotationVisitor0.createHeaderWithDefaultMetadataVersion();
            return kotlinClassHeader0 == null ? null : new ReflectKotlinClass(class0, kotlinClassHeader0, null);
        }
    }

    @NotNull
    public static final Factory Factory;
    public final Class a;
    public final KotlinClassHeader b;

    static {
        ReflectKotlinClass.Factory = new Factory(null);
    }

    public ReflectKotlinClass(Class class0, KotlinClassHeader kotlinClassHeader0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = class0;
        this.b = kotlinClassHeader0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ReflectKotlinClass && Intrinsics.areEqual(this.a, ((ReflectKotlinClass)object0).a);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public KotlinClassHeader getClassHeader() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(this.a);
    }

    @NotNull
    public final Class getKlass() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public String getLocation() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = this.a.getName();
        Intrinsics.checkNotNullExpressionValue(s, "klass.name");
        return r0.a.o(stringBuilder0, p.replace$default(s, '.', '/', false, 4, null), ".class");
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void loadClassAnnotations(@NotNull AnnotationVisitor kotlinJvmBinaryClass$AnnotationVisitor0, @Nullable byte[] arr_b) {
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass$AnnotationVisitor0, "visitor");
        Intrinsics.checkNotNullParameter(this.a, "klass");
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass$AnnotationVisitor0, "visitor");
        Annotation[] arr_annotation = this.a.getDeclaredAnnotations();
        Intrinsics.checkNotNullExpressionValue(arr_annotation, "klass.declaredAnnotations");
        for(int v = 0; v < arr_annotation.length; ++v) {
            Annotation annotation0 = arr_annotation[v];
            Intrinsics.checkNotNullExpressionValue(annotation0, "annotation");
            Class class0 = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation0));
            AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor0 = kotlinJvmBinaryClass$AnnotationVisitor0.visitAnnotation(ReflectClassUtilKt.getClassId(class0), new ReflectAnnotationSource(annotation0));
            if(kotlinJvmBinaryClass$AnnotationArgumentVisitor0 != null) {
                a.c(kotlinJvmBinaryClass$AnnotationArgumentVisitor0, annotation0, class0);
            }
        }
        kotlinJvmBinaryClass$AnnotationVisitor0.visitEnd();
    }

    // 去混淆评级： 低(40)
    @Override
    @NotNull
    public String toString() {
        return "kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass: " + this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void visitMembers(@NotNull MemberVisitor kotlinJvmBinaryClass$MemberVisitor0, @Nullable byte[] arr_b) {
        int v8;
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass$MemberVisitor0, "visitor");
        Class class0 = this.a;
        Intrinsics.checkNotNullParameter(class0, "klass");
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass$MemberVisitor0, "memberVisitor");
        Method[] arr_method = class0.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(arr_method, "klass.declaredMethods");
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            Name name0 = Name.identifier(method0.getName());
            Intrinsics.checkNotNullExpressionValue(name0, "identifier(method.name)");
            Intrinsics.checkNotNullExpressionValue(method0, "method");
            Intrinsics.checkNotNullParameter(method0, "method");
            StringBuilder stringBuilder0 = new StringBuilder("(");
            Class[] arr_class = method0.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(arr_class, "method.parameterTypes");
            for(int v1 = 0; v1 < arr_class.length; ++v1) {
                Class class1 = arr_class[v1];
                Intrinsics.checkNotNullExpressionValue(class1, "parameterType");
                stringBuilder0.append(ReflectClassUtilKt.getDesc(class1));
            }
            stringBuilder0.append(")");
            Class class2 = method0.getReturnType();
            Intrinsics.checkNotNullExpressionValue(class2, "method.returnType");
            stringBuilder0.append(ReflectClassUtilKt.getDesc(class2));
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "sb.toString()");
            MethodAnnotationVisitor kotlinJvmBinaryClass$MethodAnnotationVisitor0 = kotlinJvmBinaryClass$MemberVisitor0.visitMethod(name0, s);
            if(kotlinJvmBinaryClass$MethodAnnotationVisitor0 != null) {
                Annotation[] arr_annotation = method0.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(arr_annotation, "method.declaredAnnotations");
                for(int v2 = 0; v2 < arr_annotation.length; ++v2) {
                    Annotation annotation0 = arr_annotation[v2];
                    Intrinsics.checkNotNullExpressionValue(annotation0, "annotation");
                    a.b(kotlinJvmBinaryClass$MethodAnnotationVisitor0, annotation0);
                }
                Annotation[][] arr2_annotation = method0.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(arr2_annotation, "method.parameterAnnotations");
                Annotation[][] arr2_annotation1 = arr2_annotation;
                for(int v3 = 0; v3 < arr2_annotation1.length; ++v3) {
                    Annotation[] arr_annotation1 = arr2_annotation1[v3];
                    Intrinsics.checkNotNullExpressionValue(arr_annotation1, "annotations");
                    for(int v4 = 0; v4 < arr_annotation1.length; ++v4) {
                        Annotation annotation1 = arr_annotation1[v4];
                        Class class3 = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation1));
                        ClassId classId0 = ReflectClassUtilKt.getClassId(class3);
                        Intrinsics.checkNotNullExpressionValue(annotation1, "annotation");
                        AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor0 = kotlinJvmBinaryClass$MethodAnnotationVisitor0.visitParameterAnnotation(v3, classId0, new ReflectAnnotationSource(annotation1));
                        if(kotlinJvmBinaryClass$AnnotationArgumentVisitor0 != null) {
                            a.c(kotlinJvmBinaryClass$AnnotationArgumentVisitor0, annotation1, class3);
                        }
                    }
                }
                kotlinJvmBinaryClass$MethodAnnotationVisitor0.visitEnd();
            }
        }
        Constructor[] arr_constructor = class0.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(arr_constructor, "klass.declaredConstructors");
        int v5 = arr_constructor.length;
        int v6 = 0;
        while(v6 < v5) {
            Constructor constructor0 = arr_constructor[v6];
            Name name1 = SpecialNames.INIT;
            Intrinsics.checkNotNullExpressionValue(constructor0, "constructor");
            Intrinsics.checkNotNullParameter(constructor0, "constructor");
            StringBuilder stringBuilder1 = new StringBuilder("(");
            Class[] arr_class1 = constructor0.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(arr_class1, "constructor.parameterTypes");
            for(int v7 = 0; v7 < arr_class1.length; ++v7) {
                Class class4 = arr_class1[v7];
                Intrinsics.checkNotNullExpressionValue(class4, "parameterType");
                stringBuilder1.append(ReflectClassUtilKt.getDesc(class4));
            }
            stringBuilder1.append(")V");
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "sb.toString()");
            MethodAnnotationVisitor kotlinJvmBinaryClass$MethodAnnotationVisitor1 = kotlinJvmBinaryClass$MemberVisitor0.visitMethod(name1, s1);
            if(kotlinJvmBinaryClass$MethodAnnotationVisitor1 == null) {
                v8 = v5;
            }
            else {
                Annotation[] arr_annotation2 = constructor0.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(arr_annotation2, "constructor.declaredAnnotations");
                for(int v9 = 0; v9 < arr_annotation2.length; ++v9) {
                    Annotation annotation2 = arr_annotation2[v9];
                    Intrinsics.checkNotNullExpressionValue(annotation2, "annotation");
                    a.b(kotlinJvmBinaryClass$MethodAnnotationVisitor1, annotation2);
                }
                Annotation[][] arr2_annotation2 = constructor0.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(arr2_annotation2, "parameterAnnotations");
                if(arr2_annotation2.length != 0) {
                    int v10 = constructor0.getParameterTypes().length - arr2_annotation2.length;
                    int v11 = arr2_annotation2.length;
                    for(int v12 = 0; v12 < v11; ++v12) {
                        Annotation[] arr_annotation3 = arr2_annotation2[v12];
                        Intrinsics.checkNotNullExpressionValue(arr_annotation3, "annotations");
                        for(int v13 = 0; v13 < arr_annotation3.length; ++v13) {
                            Annotation annotation3 = arr_annotation3[v13];
                            Class class5 = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation3));
                            ClassId classId1 = ReflectClassUtilKt.getClassId(class5);
                            Intrinsics.checkNotNullExpressionValue(annotation3, "annotation");
                            AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor1 = kotlinJvmBinaryClass$MethodAnnotationVisitor1.visitParameterAnnotation(v12 + v10, classId1, new ReflectAnnotationSource(annotation3));
                            if(kotlinJvmBinaryClass$AnnotationArgumentVisitor1 != null) {
                                a.c(kotlinJvmBinaryClass$AnnotationArgumentVisitor1, annotation3, class5);
                            }
                        }
                    }
                }
                v8 = v5;
                kotlinJvmBinaryClass$MethodAnnotationVisitor1.visitEnd();
            }
            ++v6;
            v5 = v8;
        }
        Field[] arr_field = class0.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(arr_field, "klass.declaredFields");
        for(int v14 = 0; v14 < arr_field.length; ++v14) {
            Field field0 = arr_field[v14];
            Name name2 = Name.identifier(field0.getName());
            Intrinsics.checkNotNullExpressionValue(name2, "identifier(field.name)");
            Intrinsics.checkNotNullExpressionValue(field0, "field");
            Intrinsics.checkNotNullParameter(field0, "field");
            Class class6 = field0.getType();
            Intrinsics.checkNotNullExpressionValue(class6, "field.type");
            AnnotationVisitor kotlinJvmBinaryClass$AnnotationVisitor0 = kotlinJvmBinaryClass$MemberVisitor0.visitField(name2, ReflectClassUtilKt.getDesc(class6), null);
            if(kotlinJvmBinaryClass$AnnotationVisitor0 != null) {
                Annotation[] arr_annotation4 = field0.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(arr_annotation4, "field.declaredAnnotations");
                for(int v15 = 0; v15 < arr_annotation4.length; ++v15) {
                    Annotation annotation4 = arr_annotation4[v15];
                    Intrinsics.checkNotNullExpressionValue(annotation4, "annotation");
                    a.b(kotlinJvmBinaryClass$AnnotationVisitor0, annotation4);
                }
                kotlinJvmBinaryClass$AnnotationVisitor0.visitEnd();
            }
        }
    }
}

