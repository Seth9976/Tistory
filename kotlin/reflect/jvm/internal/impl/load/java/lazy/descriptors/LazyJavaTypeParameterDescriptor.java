package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nLazyJavaTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1549#2:76\n1620#2,3:77\n*S KotlinDebug\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n*L\n62#1:76\n62#1:77,3\n*E\n"})
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    public final LazyJavaResolverContext k;
    public final JavaTypeParameter l;

    public LazyJavaTypeParameterDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull JavaTypeParameter javaTypeParameter0, int v, @NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(javaTypeParameter0, "javaTypeParameter");
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "containingDeclaration");
        StorageManager storageManager0 = lazyJavaResolverContext0.getStorageManager();
        LazyJavaAnnotations lazyJavaAnnotations0 = new LazyJavaAnnotations(lazyJavaResolverContext0, javaTypeParameter0, false, 4, null);
        Name name0 = javaTypeParameter0.getName();
        SupertypeLoopChecker supertypeLoopChecker0 = lazyJavaResolverContext0.getComponents().getSupertypeLoopChecker();
        super(storageManager0, declarationDescriptor0, lazyJavaAnnotations0, name0, Variance.INVARIANT, false, v, SourceElement.NO_SOURCE, supertypeLoopChecker0);
        this.k = lazyJavaResolverContext0;
        this.l = javaTypeParameter0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List processBoundsWithoutCycles(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "bounds");
        return this.k.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, list0, this.k);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public void reportSupertypeLoopError(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List resolveUpperBounds() {
        Collection collection0 = this.l.getUpperBounds();
        LazyJavaResolverContext lazyJavaResolverContext0 = this.k;
        if(collection0.isEmpty()) {
            SimpleType simpleType0 = lazyJavaResolverContext0.getModule().getBuiltIns().getAnyType();
            Intrinsics.checkNotNullExpressionValue(simpleType0, "c.module.builtIns.anyType");
            SimpleType simpleType1 = lazyJavaResolverContext0.getModule().getBuiltIns().getNullableAnyType();
            Intrinsics.checkNotNullExpressionValue(simpleType1, "c.module.builtIns.nullableAnyType");
            return k.listOf(KotlinTypeFactory.flexibleType(simpleType0, simpleType1));
        }
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
        for(Object object0: collection0) {
            arrayList0.add(lazyJavaResolverContext0.getTypeResolver().transformJavaType(((JavaClassifierType)object0), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList0;
    }
}

