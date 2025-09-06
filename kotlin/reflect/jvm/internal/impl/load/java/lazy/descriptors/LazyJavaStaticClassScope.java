package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import je.e;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import se.s;
import se.t;
import se.u;

@SourceDebugExtension({"SMAP\nLazyJavaStaticClassScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,171:1\n1#2:172\n1477#3:173\n1502#3,3:174\n1505#3,3:184\n1549#3:193\n1620#3,3:194\n361#4,7:177\n76#5:187\n96#5,5:188\n*S KotlinDebug\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n*L\n112#1:173\n112#1:174,3\n112#1:184,3\n168#1:193\n168#1:194,3\n112#1:177,7\n114#1:187\n114#1:188,5\n*E\n"})
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {
    public final JavaClass m;
    public final JavaClassDescriptor n;
    public static final int o;

    public LazyJavaStaticClassScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull JavaClass javaClass0, @NotNull JavaClassDescriptor javaClassDescriptor0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(javaClass0, "jClass");
        Intrinsics.checkNotNullParameter(javaClassDescriptor0, "ownerDescriptor");
        super(lazyJavaResolverContext0);
        this.m = javaClass0;
        this.n = javaClassDescriptor0;
    }

    public static PropertyDescriptor a(PropertyDescriptor propertyDescriptor0) {
        if(propertyDescriptor0.getKind().isReal()) {
            return propertyDescriptor0;
        }
        Collection collection0 = propertyDescriptor0.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(collection0, "this.overriddenDescriptors");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
        for(Object object0: collection0) {
            Intrinsics.checkNotNullExpressionValue(((PropertyDescriptor)object0), "it");
            arrayList0.add(LazyJavaStaticClassScope.a(((PropertyDescriptor)object0)));
        }
        return (PropertyDescriptor)CollectionsKt___CollectionsKt.single(CollectionsKt___CollectionsKt.distinct(arrayList0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Set set0 = CollectionsKt___CollectionsKt.toMutableSet(((DeclaredMemberIndex)this.getDeclaredMemberIndex().invoke()).getMethodNames());
        LazyJavaStaticClassScope lazyJavaStaticClassScope0 = UtilKt.getParentJavaStaticClassScope(this.getOwnerDescriptor());
        Set set1 = lazyJavaStaticClassScope0 == null ? null : lazyJavaStaticClassScope0.getFunctionNames();
        if(set1 == null) {
            set1 = f0.emptySet();
        }
        set0.addAll(set1);
        if(this.m.isEnum()) {
            set0.addAll(CollectionsKt__CollectionsKt.listOf(new Name[]{StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES}));
        }
        set0.addAll(this.getC().getComponents().getSyntheticPartsProvider().getStaticFunctionNames(this.getC(), this.getOwnerDescriptor()));
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeImplicitlyDeclaredFunctions(@NotNull Collection collection0, @NotNull Name name0) {
        Intrinsics.checkNotNullParameter(collection0, "result");
        Intrinsics.checkNotNullParameter(name0, "name");
        this.getC().getComponents().getSyntheticPartsProvider().generateStaticFunctions(this.getC(), this.getOwnerDescriptor(), name0, collection0);
    }

    @NotNull
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.m, t.w);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclaredMemberIndex computeMemberIndex() {
        return this.computeMemberIndex();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection collection0, @NotNull Name name0) {
        Intrinsics.checkNotNullParameter(collection0, "result");
        Intrinsics.checkNotNullParameter(name0, "name");
        LazyJavaStaticClassScope lazyJavaStaticClassScope0 = UtilKt.getParentJavaStaticClassScope(this.getOwnerDescriptor());
        Collection collection1 = DescriptorResolverUtils.resolveOverridesForStaticMembers(name0, (lazyJavaStaticClassScope0 == null ? f0.emptySet() : CollectionsKt___CollectionsKt.toSet(lazyJavaStaticClassScope0.getContributedFunctions(name0, NoLookupLocation.WHEN_GET_SUPER_MEMBERS))), collection0, this.getOwnerDescriptor(), this.getC().getComponents().getErrorReporter(), this.getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collection1, "resolveOverridesForStati…rridingUtil\n            )");
        collection0.addAll(collection1);
        if(this.m.isEnum()) {
            if(Intrinsics.areEqual(name0, StandardNames.ENUM_VALUE_OF)) {
                SimpleFunctionDescriptor simpleFunctionDescriptor0 = DescriptorFactory.createEnumValueOfMethod(this.getOwnerDescriptor());
                Intrinsics.checkNotNullExpressionValue(simpleFunctionDescriptor0, "createEnumValueOfMethod(ownerDescriptor)");
                collection0.add(simpleFunctionDescriptor0);
                return;
            }
            if(Intrinsics.areEqual(name0, StandardNames.ENUM_VALUES)) {
                SimpleFunctionDescriptor simpleFunctionDescriptor1 = DescriptorFactory.createEnumValuesMethod(this.getOwnerDescriptor());
                Intrinsics.checkNotNullExpressionValue(simpleFunctionDescriptor1, "createEnumValuesMethod(ownerDescriptor)");
                collection0.add(simpleFunctionDescriptor1);
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope
    public void computeNonDeclaredProperties(@NotNull Name name0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(collection0, "result");
        JavaClassDescriptor javaClassDescriptor0 = this.getOwnerDescriptor();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        e e0 = new e(name0, 1);
        Collection collection1 = k.listOf(javaClassDescriptor0);
        LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.2 lazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$20 = new LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.2(javaClassDescriptor0, linkedHashSet0, e0);
        DFS.dfs(collection1, s.a, lazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$20);
        if(collection0.isEmpty()) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object0: linkedHashSet0) {
                PropertyDescriptor propertyDescriptor0 = LazyJavaStaticClassScope.a(((PropertyDescriptor)object0));
                ArrayList arrayList0 = linkedHashMap0.get(propertyDescriptor0);
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                    linkedHashMap0.put(propertyDescriptor0, arrayList0);
                }
                arrayList0.add(object0);
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: linkedHashMap0.entrySet()) {
                Collection collection3 = DescriptorResolverUtils.resolveOverridesForStaticMembers(name0, ((Collection)((Map.Entry)object1).getValue()), collection0, this.getOwnerDescriptor(), this.getC().getComponents().getErrorReporter(), this.getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
                Intrinsics.checkNotNullExpressionValue(collection3, "resolveOverridesForStati…ingUtil\n                )");
                o.addAll(arrayList1, collection3);
            }
            collection0.addAll(arrayList1);
        }
        else {
            Collection collection2 = DescriptorResolverUtils.resolveOverridesForStaticMembers(name0, linkedHashSet0, collection0, this.getOwnerDescriptor(), this.getC().getComponents().getErrorReporter(), this.getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
            Intrinsics.checkNotNullExpressionValue(collection2, "resolveOverridesForStati…ingUtil\n                )");
            collection0.addAll(collection2);
        }
        if(this.m.isEnum() && Intrinsics.areEqual(name0, StandardNames.ENUM_ENTRIES)) {
            CollectionsKt.addIfNotNull(collection0, DescriptorFactory.createEnumEntriesProperty(this.getOwnerDescriptor()));
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Set set0 = CollectionsKt___CollectionsKt.toMutableSet(((DeclaredMemberIndex)this.getDeclaredMemberIndex().invoke()).getFieldNames());
        JavaClassDescriptor javaClassDescriptor0 = this.getOwnerDescriptor();
        Collection collection0 = k.listOf(javaClassDescriptor0);
        LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.2 lazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$20 = new LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.2(javaClassDescriptor0, set0, u.w);
        DFS.dfs(collection0, s.a, lazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$20);
        if(this.m.isEnum()) {
            set0.add(StandardNames.ENUM_ENTRIES);
        }
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.getOwnerDescriptor();
    }

    @NotNull
    public JavaClassDescriptor getOwnerDescriptor() {
        return this.n;
    }
}

