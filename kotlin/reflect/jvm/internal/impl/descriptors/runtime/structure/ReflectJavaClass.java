package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import g.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Public;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.PackageVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedAndPackage;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedStaticVisibility;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.b0;
import ne.d;
import ne.e;
import ne.f;
import ne.g;
import ne.h;
import ne.i;
import ne.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectJavaClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaClass.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClass\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,201:1\n179#2,2:202\n1#3:204\n1549#4:205\n1620#4,3:206\n11335#5:209\n11670#5,3:210\n11335#5:214\n11670#5,3:215\n11335#5:218\n11670#5,3:219\n26#6:213\n*S KotlinDebug\n*F\n+ 1 ReflectJavaClass.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClass\n*L\n51#1:202,2\n64#1:205\n64#1:206,3\n111#1:209\n111#1:210,3\n124#1:214\n124#1:215,3\n131#1:218\n131#1:219,3\n124#1:213\n*E\n"})
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {
    public final Class a;

    public ReflectJavaClass(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "klass");
        super();
        this.a = class0;
    }

    public static final boolean access$isEnumValuesOrValueOf(ReflectJavaClass reflectJavaClass0, Method method0) {
        reflectJavaClass0.getClass();
        String s = method0.getName();
        if(Intrinsics.areEqual(s, "values")) {
            Class[] arr_class = method0.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(arr_class, "method.parameterTypes");
            return arr_class.length == 0;
        }
        return Intrinsics.areEqual(s, "valueOf") ? Arrays.equals(method0.getParameterTypes(), new Class[]{String.class}) : false;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ReflectJavaClass && Intrinsics.areEqual(this.a, ((ReflectJavaClass)object0).a);
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

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection getConstructors() {
        return this.getConstructors();
    }

    @NotNull
    public List getConstructors() {
        Constructor[] arr_constructor = this.a.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(arr_constructor, "klass.declaredConstructors");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filterNot(ArraysKt___ArraysKt.asSequence(arr_constructor), d.a), e.a));
    }

    @NotNull
    public Class getElement() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public AnnotatedElement getElement() {
        return this.getElement();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection getFields() {
        return this.getFields();
    }

    @NotNull
    public List getFields() {
        Field[] arr_field = this.a.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(arr_field, "klass.declaredFields");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filterNot(ArraysKt___ArraysKt.asSequence(arr_field), f.a), g.a));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public FqName getFqName() {
        FqName fqName0 = ReflectClassUtilKt.getClassId(this.a).asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqName0, "klass.classId.asSingleFqName()");
        return fqName0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection getInnerClassNames() {
        return this.getInnerClassNames();
    }

    @NotNull
    public List getInnerClassNames() {
        Class[] arr_class = this.a.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(arr_class, "klass.declaredClasses");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.filterNot(ArraysKt___ArraysKt.asSequence(arr_class), h.w), i.w));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @Nullable
    public LightClassOriginKind getLightClassOriginKind() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection getMethods() {
        return this.getMethods();
    }

    @NotNull
    public List getMethods() {
        Method[] arr_method = this.a.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(arr_method, "klass.declaredMethods");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(ArraysKt___ArraysKt.asSequence(arr_method), new b0(this, 7)), j.a));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.a.getModifiers();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        Name name0 = Name.identifier(this.a.getSimpleName());
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(klass.simpleName)");
        return name0;
    }

    @Nullable
    public ReflectJavaClass getOuterClass() {
        Class class0 = this.a.getDeclaringClass();
        return class0 == null ? null : new ReflectJavaClass(class0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public JavaClass getOuterClass() {
        return this.getOuterClass();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public Collection getPermittedTypes() {
        Class class0 = this.a;
        Intrinsics.checkNotNullParameter(class0, "clazz");
        Java16SealedRecordLoader.Cache java16SealedRecordLoader$Cache0 = a.k;
        Class[] arr_class = null;
        if(java16SealedRecordLoader$Cache0 == null) {
            try {
                java16SealedRecordLoader$Cache0 = new Java16SealedRecordLoader.Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            }
            catch(NoSuchMethodException unused_ex) {
                java16SealedRecordLoader$Cache0 = new Java16SealedRecordLoader.Cache(null, null, null, null);
            }
            a.k = java16SealedRecordLoader$Cache0;
        }
        Method method0 = java16SealedRecordLoader$Cache0.getGetPermittedSubclasses();
        if(method0 != null) {
            Object object0 = method0.invoke(class0, null);
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            arr_class = (Class[])object0;
        }
        if(arr_class != null) {
            Collection collection0 = new ArrayList(arr_class.length);
            for(int v = 0; v < arr_class.length; ++v) {
                ((ArrayList)collection0).add(new ReflectJavaClassifierType(arr_class[v]));
            }
            return collection0;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public Collection getRecordComponents() {
        Class class0 = this.a;
        Intrinsics.checkNotNullParameter(class0, "clazz");
        Java16SealedRecordLoader.Cache java16SealedRecordLoader$Cache0 = a.k;
        Object[] arr_object = null;
        if(java16SealedRecordLoader$Cache0 == null) {
            try {
                java16SealedRecordLoader$Cache0 = new Java16SealedRecordLoader.Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            }
            catch(NoSuchMethodException unused_ex) {
                java16SealedRecordLoader$Cache0 = new Java16SealedRecordLoader.Cache(null, null, null, null);
            }
            a.k = java16SealedRecordLoader$Cache0;
        }
        Method method0 = java16SealedRecordLoader$Cache0.getGetRecordComponents();
        if(method0 != null) {
            arr_object = (Object[])method0.invoke(class0, null);
        }
        if(arr_object == null) {
            arr_object = new Object[0];
        }
        Collection collection0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            ((ArrayList)collection0).add(new ReflectJavaRecordComponent(arr_object[v]));
        }
        return collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public Collection getSupertypes() {
        Class class0 = this.a;
        Type type0 = Object.class;
        if(Intrinsics.areEqual(class0, type0)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
        Type type1 = class0.getGenericSuperclass();
        if(type1 != null) {
            type0 = type1;
        }
        spreadBuilder0.add(type0);
        Type[] arr_type = class0.getGenericInterfaces();
        Intrinsics.checkNotNullExpressionValue(arr_type, "klass.genericInterfaces");
        spreadBuilder0.addSpread(arr_type);
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOf(spreadBuilder0.toArray(new Type[spreadBuilder0.size()]));
        Collection collection0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            collection0.add(new ReflectJavaClassifierType(((Type)object0)));
        }
        return collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List getTypeParameters() {
        TypeVariable[] arr_typeVariable = this.a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(arr_typeVariable, "klass.typeParameters");
        List list0 = new ArrayList(arr_typeVariable.length);
        for(int v = 0; v < arr_typeVariable.length; ++v) {
            list0.add(new ReflectJavaTypeParameter(arr_typeVariable[v]));
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

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean hasDefaultConstructor() {
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(this.getModifiers());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isAnnotationType() {
        return this.a.isAnnotation();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isEnum() {
        return this.a.isEnum();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(this.getModifiers());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isInterface() {
        return this.a.isInterface();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isRecord() {
        Class class0 = this.a;
        Intrinsics.checkNotNullParameter(class0, "clazz");
        Java16SealedRecordLoader.Cache java16SealedRecordLoader$Cache0 = a.k;
        Boolean boolean0 = null;
        if(java16SealedRecordLoader$Cache0 == null) {
            try {
                java16SealedRecordLoader$Cache0 = new Java16SealedRecordLoader.Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            }
            catch(NoSuchMethodException unused_ex) {
                java16SealedRecordLoader$Cache0 = new Java16SealedRecordLoader.Cache(null, null, null, null);
            }
            a.k = java16SealedRecordLoader$Cache0;
        }
        Method method0 = java16SealedRecordLoader$Cache0.isRecord();
        if(method0 != null) {
            Object object0 = method0.invoke(class0, null);
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Boolean");
            boolean0 = (Boolean)object0;
        }
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isSealed() {
        Class class0 = this.a;
        Intrinsics.checkNotNullParameter(class0, "clazz");
        Java16SealedRecordLoader.Cache java16SealedRecordLoader$Cache0 = a.k;
        Boolean boolean0 = null;
        if(java16SealedRecordLoader$Cache0 == null) {
            try {
                java16SealedRecordLoader$Cache0 = new Java16SealedRecordLoader.Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            }
            catch(NoSuchMethodException unused_ex) {
                java16SealedRecordLoader$Cache0 = new Java16SealedRecordLoader.Cache(null, null, null, null);
            }
            a.k = java16SealedRecordLoader$Cache0;
        }
        Method method0 = java16SealedRecordLoader$Cache0.isSealed();
        if(method0 != null) {
            Object object0 = method0.invoke(class0, null);
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Boolean");
            boolean0 = (Boolean)object0;
        }
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(this.getModifiers());
    }

    // 去混淆评级： 低(40)
    @Override
    @NotNull
    public String toString() {
        return "kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass: " + this.a;
    }
}

