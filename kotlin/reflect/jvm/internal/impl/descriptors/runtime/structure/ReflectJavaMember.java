package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Public;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.PackageVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedAndPackage;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedStaticVisibility;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import ne.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMember\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ReflectJavaMember && Intrinsics.areEqual(this.getMember(), ((ReflectJavaMember)object0).getMember());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @Nullable
    public ReflectJavaAnnotation findAnnotation(FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        AnnotatedElement annotatedElement0 = this.getElement();
        if(annotatedElement0 != null) {
            Annotation[] arr_annotation = annotatedElement0.getDeclaredAnnotations();
            return arr_annotation == null ? null : ReflectJavaAnnotationOwnerKt.findAnnotation(arr_annotation, fqName0);
        }
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation findAnnotation(FqName fqName0) {
        return this.findAnnotation(fqName0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection getAnnotations() {
        return this.getAnnotations();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @NotNull
    public List getAnnotations() {
        AnnotatedElement annotatedElement0 = this.getElement();
        if(annotatedElement0 != null) {
            Annotation[] arr_annotation = annotatedElement0.getDeclaredAnnotations();
            if(arr_annotation != null) {
                List list0 = ReflectJavaAnnotationOwnerKt.getAnnotations(arr_annotation);
                return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public ReflectJavaClass getContainingClass() {
        Class class0 = this.getMember().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(class0, "member.declaringClass");
        return new ReflectJavaClass(class0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    public JavaClass getContainingClass() {
        return this.getContainingClass();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @NotNull
    public AnnotatedElement getElement() {
        Member member0 = this.getMember();
        Intrinsics.checkNotNull(member0, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement)member0;
    }

    @NotNull
    public abstract Member getMember();

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.getMember().getModifiers();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        String s = this.getMember().getName();
        Name name0 = s == null ? null : Name.identifier(s);
        return name0 == null ? SpecialNames.NO_NAME_PROVIDED : name0;
    }

    @NotNull
    public final List getValueParameters(@NotNull Type[] arr_type, @NotNull Annotation[][] arr2_annotation, boolean z) {
        String s;
        ArrayList arrayList0;
        Java8ParameterNamesLoader.Cache java8ParameterNamesLoader$Cache1;
        Method method0;
        Intrinsics.checkNotNullParameter(arr_type, "parameterTypes");
        Intrinsics.checkNotNullParameter(arr2_annotation, "parameterAnnotations");
        List list0 = new ArrayList(arr_type.length);
        a a0 = a.a;
        Member member0 = this.getMember();
        Intrinsics.checkNotNullParameter(member0, "member");
        Java8ParameterNamesLoader.Cache java8ParameterNamesLoader$Cache0 = a.b;
        if(java8ParameterNamesLoader$Cache0 == null) {
            synchronized(a0) {
                java8ParameterNamesLoader$Cache0 = a.b;
                if(java8ParameterNamesLoader$Cache0 == null) {
                    Intrinsics.checkNotNullParameter(member0, "member");
                    Class class0 = member0.getClass();
                    try {
                        method0 = class0.getMethod("getParameters", null);
                    }
                    catch(NoSuchMethodException unused_ex) {
                        java8ParameterNamesLoader$Cache1 = new Java8ParameterNamesLoader.Cache(null, null);
                        goto label_19;
                    }
                    java8ParameterNamesLoader$Cache1 = new Java8ParameterNamesLoader.Cache(method0, ReflectClassUtilKt.getSafeClassLoader(class0).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                label_19:
                    a.b = java8ParameterNamesLoader$Cache1;
                    java8ParameterNamesLoader$Cache0 = java8ParameterNamesLoader$Cache1;
                }
            }
        }
        Method method1 = java8ParameterNamesLoader$Cache0.getGetParameters();
        if(method1 == null) {
            arrayList0 = null;
        }
        else {
            Method method2 = java8ParameterNamesLoader$Cache0.getGetName();
            if(method2 == null) {
                arrayList0 = null;
            }
            else {
                Object object0 = method1.invoke(member0, null);
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<*>");
                arrayList0 = new ArrayList(((Object[])object0).length);
                for(int v1 = 0; v1 < ((Object[])object0).length; ++v1) {
                    Object object1 = method2.invoke(((Object[])object0)[v1], null);
                    Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.String");
                    arrayList0.add(((String)object1));
                }
            }
        }
        int v2 = arrayList0 == null ? 0 : arrayList0.size() - arr_type.length;
        for(int v3 = 0; v3 < arr_type.length; ++v3) {
            ReflectJavaType reflectJavaType0 = ReflectJavaType.Factory.create(arr_type[v3]);
            if(arrayList0 == null) {
                s = null;
            }
            else {
                s = (String)CollectionsKt___CollectionsKt.getOrNull(arrayList0, v3 + v2);
                if(s == null) {
                    throw new IllegalStateException(("No parameter with index " + v3 + '+' + v2 + " (name=" + this.getName() + " type=" + reflectJavaType0 + ") in " + this).toString());
                }
            }
            boolean z1 = z && v3 == ArraysKt___ArraysKt.getLastIndex(arr_type);
            ((ArrayList)list0).add(new ReflectJavaValueParameter(reflectJavaType0, arr2_annotation[v3], s, z1));
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    @NotNull
    public Visibility getVisibility() {
        int v = this.getModifiers();
        if(Modifier.isPublic(v)) {
            return Public.INSTANCE;
        }
        if(Modifier.isPrivate(v)) {
            return Private.INSTANCE;
        }
        if(Modifier.isProtected(v)) {
            return Modifier.isStatic(v) ? ProtectedStaticVisibility.INSTANCE : ProtectedAndPackage.INSTANCE;
        }
        return PackageVisibility.INSTANCE;
    }

    @Override
    public int hashCode() {
        return this.getMember().hashCode();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(this.getModifiers());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(this.getModifiers());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(this.getModifiers());
    }

    @Override
    @NotNull
    public String toString() {
        return this.getClass().getName() + ": " + this.getMember();
    }
}

