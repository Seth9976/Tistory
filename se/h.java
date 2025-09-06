package se;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

public final class h extends Lambda implements Function1 {
    public final LazyJavaClassMemberScope w;
    public final LazyJavaResolverContext x;

    public h(LazyJavaClassMemberScope lazyJavaClassMemberScope0, LazyJavaResolverContext lazyJavaResolverContext0) {
        this.w = lazyJavaClassMemberScope0;
        this.x = lazyJavaResolverContext0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Name)object0), "name");
        LazyJavaClassMemberScope lazyJavaClassMemberScope0 = this.w;
        boolean z = ((Set)lazyJavaClassMemberScope0.q.invoke()).contains(((Name)object0));
        LazyJavaResolverContext lazyJavaResolverContext0 = this.x;
        if(z) {
            JavaClassFinder javaClassFinder0 = lazyJavaResolverContext0.getComponents().getFinder();
            ClassId classId0 = DescriptorUtilsKt.getClassId(lazyJavaClassMemberScope0.getOwnerDescriptor());
            Intrinsics.checkNotNull(classId0);
            ClassId classId1 = classId0.createNestedClassId(((Name)object0));
            Intrinsics.checkNotNullExpressionValue(classId1, "ownerDescriptor.classId!…createNestedClassId(name)");
            JavaClass javaClass0 = javaClassFinder0.findClass(new Request(classId1, null, lazyJavaClassMemberScope0.n, 2, null));
            if(javaClass0 != null) {
                ClassDescriptor classDescriptor0 = new LazyJavaClassDescriptor(this.x, lazyJavaClassMemberScope0.getOwnerDescriptor(), javaClass0, null, 8, null);
                this.x.getComponents().getJavaClassesTracker().reportClass(((JavaClassDescriptor)classDescriptor0));
                return classDescriptor0;
            }
        }
        else if(((Set)lazyJavaClassMemberScope0.r.invoke()).contains(((Name)object0))) {
            List list0 = k.createListBuilder();
            lazyJavaResolverContext0.getComponents().getSyntheticPartsProvider().generateNestedClass(lazyJavaResolverContext0, lazyJavaClassMemberScope0.getOwnerDescriptor(), ((Name)object0), list0);
            List list1 = k.build(list0);
            switch(list1.size()) {
                case 0: {
                    break;
                }
                case 1: {
                    return (ClassDescriptor)CollectionsKt___CollectionsKt.single(list1);
                }
                default: {
                    throw new IllegalStateException(("Multiple classes with same name are generated: " + list1).toString());
                }
            }
        }
        else {
            JavaField javaField0 = (JavaField)((Map)lazyJavaClassMemberScope0.s.invoke()).get(((Name)object0));
            if(javaField0 != null) {
                return EnumEntrySyntheticClassDescriptor.create(lazyJavaResolverContext0.getStorageManager(), lazyJavaClassMemberScope0.getOwnerDescriptor(), ((Name)object0), lazyJavaResolverContext0.getStorageManager().createLazyValue(new g(lazyJavaClassMemberScope0, 2)), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext0, javaField0), lazyJavaResolverContext0.getComponents().getSourceElementFactory().source(javaField0));
            }
        }
        return null;
    }
}

