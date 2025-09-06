package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import d0.s;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSubstitutingScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n361#2,3:112\n364#2,4:116\n19#3:115\n1#4:120\n*S KotlinDebug\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n*L\n52#1:112,3\n52#1:116,4\n54#1:115\n*E\n"})
public final class SubstitutingScope implements MemberScope {
    public final MemberScope a;
    public final Lazy b;
    public final TypeSubstitutor c;
    public HashMap d;
    public final Lazy e;

    public SubstitutingScope(@NotNull MemberScope memberScope0, @NotNull TypeSubstitutor typeSubstitutor0) {
        Intrinsics.checkNotNullParameter(memberScope0, "workerScope");
        Intrinsics.checkNotNullParameter(typeSubstitutor0, "givenSubstitutor");
        super();
        this.a = memberScope0;
        this.b = c.lazy(new s(typeSubstitutor0, 5));
        TypeSubstitution typeSubstitution0 = typeSubstitutor0.getSubstitution();
        Intrinsics.checkNotNullExpressionValue(typeSubstitution0, "givenSubstitutor.substitution");
        this.c = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(typeSubstitution0, false, 1, null).buildSubstitutor();
        this.e = c.lazy(new kotlin.reflect.jvm.internal.impl.resolve.scopes.c(this));
    }

    public final Collection a(Collection collection0) {
        if(this.c.isEmpty()) {
            return collection0;
        }
        if(collection0.isEmpty()) {
            return collection0;
        }
        Collection collection1 = CollectionsKt.newLinkedHashSetWithExpectedSize(collection0.size());
        for(Object object0: collection0) {
            ((AbstractCollection)collection1).add(this.b(((DeclarationDescriptor)object0)));
        }
        return collection1;
    }

    public final DeclarationDescriptor b(DeclarationDescriptor declarationDescriptor0) {
        TypeSubstitutor typeSubstitutor0 = this.c;
        if(typeSubstitutor0.isEmpty()) {
            return declarationDescriptor0;
        }
        if(this.d == null) {
            this.d = new HashMap();
        }
        HashMap hashMap0 = this.d;
        Intrinsics.checkNotNull(hashMap0);
        DeclarationDescriptorNonRoot declarationDescriptorNonRoot0 = hashMap0.get(declarationDescriptor0);
        if(declarationDescriptorNonRoot0 == null) {
            if(!(declarationDescriptor0 instanceof Substitutable)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + declarationDescriptor0).toString());
            }
            declarationDescriptorNonRoot0 = ((Substitutable)declarationDescriptor0).substitute(typeSubstitutor0);
            if(declarationDescriptorNonRoot0 == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + declarationDescriptor0 + " substitution fails");
            }
            hashMap0.put(declarationDescriptor0, declarationDescriptorNonRoot0);
        }
        Intrinsics.checkNotNull(declarationDescriptorNonRoot0, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return declarationDescriptorNonRoot0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set getClassifierNames() {
        return this.a.getClassifierNames();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        ClassifierDescriptor classifierDescriptor0 = this.a.getContributedClassifier(name0, lookupLocation0);
        return classifierDescriptor0 == null ? null : ((ClassifierDescriptor)this.b(classifierDescriptor0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        return (Collection)this.e.getValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return this.a(this.a.getContributedFunctions(name0, lookupLocation0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return this.a(this.a.getContributedVariables(name0, lookupLocation0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set getFunctionNames() {
        return this.a.getFunctionNames();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set getVariableNames() {
        return this.a.getVariableNames();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public void recordLookup(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        DefaultImpls.recordLookup(this, name0, lookupLocation0);
    }
}

