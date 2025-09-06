package se;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

public final class c extends AbstractClassTypeConstructor {
    public final NotNullLazyValue c;
    public final LazyJavaClassDescriptor d;

    public c(LazyJavaClassDescriptor lazyJavaClassDescriptor0) {
        this.d = lazyJavaClassDescriptor0;
        super(lazyJavaClassDescriptor0.j.getStorageManager());
        this.c = lazyJavaClassDescriptor0.j.getStorageManager().createLazyValue(new b(lazyJavaClassDescriptor0, 0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection computeSupertypes() {
        SimpleType simpleType0;
        FqName fqName2;
        FqName fqName0;
        LazyJavaClassDescriptor lazyJavaClassDescriptor0 = this.d;
        Collection collection0 = lazyJavaClassDescriptor0.getJClass().getSupertypes();
        ArrayList arrayList0 = new ArrayList(collection0.size());
        ArrayList arrayList1 = new ArrayList(0);
        Intrinsics.checkNotNullExpressionValue(JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
        AnnotationDescriptor annotationDescriptor0 = lazyJavaClassDescriptor0.getAnnotations().findAnnotation(JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION);
        KotlinType kotlinType0 = null;
        if(annotationDescriptor0 == null) {
            fqName0 = null;
        }
        else {
            Object object0 = CollectionsKt___CollectionsKt.singleOrNull(annotationDescriptor0.getAllValueArguments().values());
            StringValue stringValue0 = object0 instanceof StringValue ? ((StringValue)object0) : null;
            if(stringValue0 == null) {
                fqName0 = null;
            }
            else {
                String s = (String)stringValue0.getValue();
                fqName0 = s == null || !FqNamesUtilKt.isValidJavaFqName(s) ? null : new FqName(s);
            }
        }
        if(fqName0 == null || fqName0.isRoot() || !fqName0.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME)) {
            fqName0 = null;
        }
        if(fqName0 == null) {
            FqName fqName1 = DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptor0);
            fqName2 = FakePureImplementationsProvider.INSTANCE.getPurelyImplementedInterface(fqName1);
            if(fqName2 == null) {
                simpleType0 = null;
            }
            else {
                goto label_29;
            }
        }
        else {
            fqName2 = fqName0;
        label_29:
            ClassDescriptor classDescriptor0 = DescriptorUtilsKt.resolveTopLevelClass(lazyJavaClassDescriptor0.j.getModule(), fqName2, NoLookupLocation.FROM_JAVA_LOADER);
            if(classDescriptor0 == null) {
                simpleType0 = null;
            }
            else {
                int v = classDescriptor0.getTypeConstructor().getParameters().size();
                List list0 = lazyJavaClassDescriptor0.getTypeConstructor().getParameters();
                Intrinsics.checkNotNullExpressionValue(list0, "getTypeConstructor().parameters");
                int v1 = list0.size();
                if(v1 == v) {
                    ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                    for(Object object1: list0) {
                        SimpleType simpleType1 = ((TypeParameterDescriptor)object1).getDefaultType();
                        arrayList2.add(new TypeProjectionImpl(Variance.INVARIANT, simpleType1));
                    }
                    simpleType0 = KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), classDescriptor0, arrayList2);
                }
                else if(v1 != 1 || v <= 1 || fqName0 != null) {
                    simpleType0 = null;
                }
                else {
                    SimpleType simpleType2 = ((TypeParameterDescriptor)CollectionsKt___CollectionsKt.single(list0)).getDefaultType();
                    TypeProjectionImpl typeProjectionImpl0 = new TypeProjectionImpl(Variance.INVARIANT, simpleType2);
                    IntRange intRange0 = new IntRange(1, v);
                    ArrayList arrayList3 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
                    Iterator iterator1 = intRange0.iterator();
                    while(iterator1.hasNext()) {
                        ((IntIterator)iterator1).nextInt();
                        arrayList3.add(typeProjectionImpl0);
                    }
                    simpleType0 = KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), classDescriptor0, arrayList3);
                }
            }
        }
        for(Object object2: collection0) {
            JavaClassifierType javaClassifierType0 = (JavaClassifierType)object2;
            KotlinType kotlinType1 = lazyJavaClassDescriptor0.j.getComponents().getSignatureEnhancement().enhanceSuperType(lazyJavaClassDescriptor0.j.getTypeResolver().transformJavaType(javaClassifierType0, JavaTypeAttributesKt.toAttributes$default(TypeUsage.SUPERTYPE, false, false, null, 7, null)), lazyJavaClassDescriptor0.j);
            if(kotlinType1.getConstructor().getDeclarationDescriptor() instanceof MockClassDescriptor) {
                arrayList1.add(javaClassifierType0);
            }
            if(!Intrinsics.areEqual(kotlinType1.getConstructor(), (simpleType0 == null ? null : simpleType0.getConstructor())) && !KotlinBuiltIns.isAnyOrNullableAny(kotlinType1)) {
                arrayList0.add(kotlinType1);
            }
        }
        ClassDescriptor classDescriptor1 = lazyJavaClassDescriptor0.i;
        if(classDescriptor1 != null) {
            kotlinType0 = MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptor1, lazyJavaClassDescriptor0).buildSubstitutor().substitute(classDescriptor1.getDefaultType(), Variance.INVARIANT);
        }
        CollectionsKt.addIfNotNull(arrayList0, kotlinType0);
        CollectionsKt.addIfNotNull(arrayList0, simpleType0);
        if(!arrayList1.isEmpty()) {
            ErrorReporter errorReporter0 = lazyJavaClassDescriptor0.j.getComponents().getErrorReporter();
            ArrayList arrayList4 = new ArrayList(l.collectionSizeOrDefault(arrayList1, 10));
            for(Object object3: arrayList1) {
                Intrinsics.checkNotNull(((JavaType)object3), "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                arrayList4.add(((JavaClassifierType)(((JavaType)object3))).getPresentableText());
            }
            errorReporter0.reportIncompleteHierarchy(lazyJavaClassDescriptor0, arrayList4);
        }
        return arrayList0.isEmpty() ? k.listOf(lazyJavaClassDescriptor0.j.getModule().getBuiltIns().getAnyType()) : CollectionsKt___CollectionsKt.toList(arrayList0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    public final ClassDescriptor getDeclarationDescriptor() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    public final ClassifierDescriptor getDeclarationDescriptor() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return (List)this.c.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        return this.d.j.getComponents().getSupertypeLoopChecker();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return true;
    }

    @Override
    public final String toString() {
        String s = this.d.getName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "name.asString()");
        return s;
    }
}

