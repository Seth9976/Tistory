package se;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;

public final class f extends Lambda implements Function0 {
    public final int w;
    public final LazyJavaResolverContext x;
    public final LazyJavaClassMemberScope y;

    public f(LazyJavaResolverContext lazyJavaResolverContext0, LazyJavaClassMemberScope lazyJavaClassMemberScope0) {
        this.w = 1;
        this.x = lazyJavaResolverContext0;
        this.y = lazyJavaClassMemberScope0;
        super(0);
    }

    public f(LazyJavaClassMemberScope lazyJavaClassMemberScope0, LazyJavaResolverContext lazyJavaResolverContext0) {
        this.w = 0;
        this.y = lazyJavaClassMemberScope0;
        this.x = lazyJavaResolverContext0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            return CollectionsKt___CollectionsKt.toSet(this.x.getComponents().getSyntheticPartsProvider().getNestedClassNames(this.x, this.y.getOwnerDescriptor()));
        }
        LazyJavaClassMemberScope lazyJavaClassMemberScope0 = this.y;
        Collection collection0 = lazyJavaClassMemberScope0.n.getConstructors();
        Collection collection1 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            ((ArrayList)collection1).add(LazyJavaClassMemberScope.access$resolveConstructor(lazyJavaClassMemberScope0, ((JavaConstructor)object0)));
        }
        boolean z = lazyJavaClassMemberScope0.n.isRecord();
        LazyJavaResolverContext lazyJavaResolverContext0 = this.x;
        if(z) {
            ClassConstructorDescriptor classConstructorDescriptor0 = LazyJavaClassMemberScope.access$createDefaultRecordConstructor(lazyJavaClassMemberScope0);
            String s = MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor0, false, false, 2, null);
            if(!((ArrayList)collection1).isEmpty()) {
                for(Object object1: ((ArrayList)collection1)) {
                    if(!Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default(((ClassConstructorDescriptor)object1), false, false, 2, null), s)) {
                        continue;
                    }
                    goto label_23;
                }
            }
            ((ArrayList)collection1).add(classConstructorDescriptor0);
            lazyJavaResolverContext0.getComponents().getJavaResolverCache().recordConstructor(lazyJavaClassMemberScope0.n, classConstructorDescriptor0);
        }
    label_23:
        lazyJavaResolverContext0.getComponents().getSyntheticPartsProvider().generateConstructors(lazyJavaResolverContext0, lazyJavaClassMemberScope0.getOwnerDescriptor(), ((List)collection1));
        SignatureEnhancement signatureEnhancement0 = lazyJavaResolverContext0.getComponents().getSignatureEnhancement();
        if(((ArrayList)collection1).isEmpty()) {
            collection1 = CollectionsKt__CollectionsKt.listOfNotNull(LazyJavaClassMemberScope.access$createDefaultConstructor(lazyJavaClassMemberScope0));
        }
        return CollectionsKt___CollectionsKt.toList(signatureEnhancement0.enhanceSignatures(lazyJavaResolverContext0, collection1));
    }
}

