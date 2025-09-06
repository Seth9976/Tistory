package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nInnerClassesScopeWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerClassesScopeWrapper.kt\norg/jetbrains/kotlin/resolve/scopes/InnerClassesScopeWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n800#2,11:56\n*S KotlinDebug\n*F\n+ 1 InnerClassesScopeWrapper.kt\norg/jetbrains/kotlin/resolve/scopes/InnerClassesScopeWrapper\n*L\n35#1:56,11\n*E\n"})
public final class InnerClassesScopeWrapper extends MemberScopeImpl {
    public final MemberScope a;

    public InnerClassesScopeWrapper(@NotNull MemberScope memberScope0) {
        Intrinsics.checkNotNullParameter(memberScope0, "workerScope");
        super();
        this.a = memberScope0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @Nullable
    public Set getClassifierNames() {
        return this.a.getClassifierNames();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        ClassifierDescriptor classifierDescriptor0 = this.a.getContributedClassifier(name0, lookupLocation0);
        if(classifierDescriptor0 != null) {
            ClassDescriptor classDescriptor0 = classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
            if(classDescriptor0 != null) {
                return classDescriptor0;
            }
            if(classifierDescriptor0 instanceof TypeAliasDescriptor) {
                return (TypeAliasDescriptor)classifierDescriptor0;
            }
        }
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter0, Function1 function10) {
        return this.getContributedDescriptors(descriptorKindFilter0, function10);
    }

    @NotNull
    public List getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        DescriptorKindFilter descriptorKindFilter1 = descriptorKindFilter0.restrictedToKindsOrNull(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK());
        if(descriptorKindFilter1 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterable iterable0 = this.a.getContributedDescriptors(descriptorKindFilter1, function10);
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(object0 instanceof ClassifierDescriptorWithTypeParameters) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Set getFunctionNames() {
        return this.a.getFunctionNames();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Set getVariableNames() {
        return this.a.getVariableNames();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public void recordLookup(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.a.recordLookup(name0, lookupLocation0);
    }

    @Override
    @NotNull
    public String toString() {
        return "Classes from " + this.a;
    }
}

