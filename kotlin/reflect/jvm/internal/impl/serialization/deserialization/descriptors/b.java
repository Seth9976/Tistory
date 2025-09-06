package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import fg.i;
import j2.j;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class b extends DeserializedMemberScope {
    public final KotlinTypeRefiner f;
    public final NotNullLazyValue g;
    public final NotNullLazyValue h;
    public final DeserializedClassDescriptor i;

    public b(DeserializedClassDescriptor deserializedClassDescriptor0, KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        this.i = deserializedClassDescriptor0;
        DeserializationContext deserializationContext0 = deserializedClassDescriptor0.getC();
        List list0 = deserializedClassDescriptor0.getClassProto().getFunctionList();
        Intrinsics.checkNotNullExpressionValue(list0, "classProto.functionList");
        List list1 = deserializedClassDescriptor0.getClassProto().getPropertyList();
        Intrinsics.checkNotNullExpressionValue(list1, "classProto.propertyList");
        List list2 = deserializedClassDescriptor0.getClassProto().getTypeAliasList();
        Intrinsics.checkNotNullExpressionValue(list2, "classProto.typeAliasList");
        List list3 = deserializedClassDescriptor0.getClassProto().getNestedClassNameList();
        Intrinsics.checkNotNullExpressionValue(list3, "classProto.nestedClassNameList");
        NameResolver nameResolver0 = deserializedClassDescriptor0.getC().getNameResolver();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list3, 10));
        for(Object object0: list3) {
            arrayList0.add(NameResolverUtilKt.getName(nameResolver0, ((Number)object0).intValue()));
        }
        super(deserializationContext0, list0, list1, list2, new i(arrayList0, 1));
        this.f = kotlinTypeRefiner0;
        this.g = this.getC().getStorageManager().createLazyValue(new a(this));
        this.h = this.getC().getStorageManager().createLazyValue(new j(this, 14));
    }

    public final void a(Name name0, ArrayList arrayList0, List list0) {
        ArrayList arrayList1 = new ArrayList(list0);
        OverridingUtil overridingUtil0 = this.getC().getComponents().getKotlinTypeChecker().getOverridingUtil();
        DeserializedClassDescriptor.DeserializedClassMemberScope.generateFakeOverrides.1 deserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$10 = new DeserializedClassDescriptor.DeserializedClassMemberScope.generateFakeOverrides.1(list0);
        overridingUtil0.generateOverridesInFunctionGroup(name0, arrayList0, arrayList1, this.i, deserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$10);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void addEnumEntryDescriptors(Collection collection0, Function1 function10) {
        Collection collection1;
        Intrinsics.checkNotNullParameter(collection0, "result");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        f f0 = this.i.o;
        if(f0 == null) {
            collection1 = null;
        }
        else {
            Iterable iterable0 = f0.a.keySet();
            collection1 = new ArrayList();
            for(Object object0: iterable0) {
                Intrinsics.checkNotNullParameter(((Name)object0), "name");
                ClassDescriptor classDescriptor0 = (ClassDescriptor)f0.b.invoke(((Name)object0));
                if(classDescriptor0 != null) {
                    ((ArrayList)collection1).add(classDescriptor0);
                }
            }
        }
        if(collection1 == null) {
            collection1 = CollectionsKt__CollectionsKt.emptyList();
        }
        collection0.addAll(collection1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void computeNonDeclaredFunctions(Name name0, List list0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(list0, "functions");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Collection)this.h.invoke())) {
            arrayList0.addAll(((KotlinType)object0).getMemberScope().getContributedFunctions(name0, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        list0.addAll(this.getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name0, this.i));
        this.a(name0, arrayList0, list0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void computeNonDeclaredProperties(Name name0, List list0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(list0, "descriptors");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Collection)this.h.invoke())) {
            arrayList0.addAll(((KotlinType)object0).getMemberScope().getContributedVariables(name0, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        this.a(name0, arrayList0, list0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final ClassId createClassId(Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        ClassId classId0 = this.i.g.createNestedClassId(name0);
        Intrinsics.checkNotNullExpressionValue(classId0, "classId.createNestedClassId(name)");
        return classId0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final ClassifierDescriptor getContributedClassifier(Name name0, LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.recordLookup(name0, lookupLocation0);
        f f0 = this.i.o;
        if(f0 != null) {
            Intrinsics.checkNotNullParameter(name0, "name");
            ClassifierDescriptor classifierDescriptor0 = (ClassDescriptor)f0.b.invoke(name0);
            return classifierDescriptor0 == null ? super.getContributedClassifier(name0, lookupLocation0) : classifierDescriptor0;
        }
        return super.getContributedClassifier(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public final Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter0, Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        return (Collection)this.g.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Collection getContributedFunctions(Name name0, LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.recordLookup(name0, lookupLocation0);
        return super.getContributedFunctions(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Collection getContributedVariables(Name name0, LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.recordLookup(name0, lookupLocation0);
        return super.getContributedVariables(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set getNonDeclaredClassifierNames() {
        Iterable iterable0 = this.i.m.getSupertypes();
        Set set0 = new LinkedHashSet();
        for(Object object0: iterable0) {
            Iterable iterable1 = ((KotlinType)object0).getMemberScope().getClassifierNames();
            if(iterable1 == null) {
                return null;
            }
            o.addAll(set0, iterable1);
        }
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set getNonDeclaredFunctionNames() {
        DeserializedClassDescriptor deserializedClassDescriptor0 = this.i;
        Iterable iterable0 = deserializedClassDescriptor0.m.getSupertypes();
        Set set0 = new LinkedHashSet();
        for(Object object0: iterable0) {
            o.addAll(set0, ((KotlinType)object0).getMemberScope().getFunctionNames());
        }
        ((AbstractCollection)set0).addAll(this.getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(deserializedClassDescriptor0));
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set getNonDeclaredVariableNames() {
        Iterable iterable0 = this.i.m.getSupertypes();
        Set set0 = new LinkedHashSet();
        for(Object object0: iterable0) {
            o.addAll(set0, ((KotlinType)object0).getMemberScope().getVariableNames());
        }
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final boolean isDeclaredFunctionAvailable(SimpleFunctionDescriptor simpleFunctionDescriptor0) {
        Intrinsics.checkNotNullParameter(simpleFunctionDescriptor0, "function");
        return this.getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.i, simpleFunctionDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public final void recordLookup(Name name0, LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        UtilsKt.record(this.getC().getComponents().getLookupTracker(), lookupLocation0, this.i, name0);
    }
}

