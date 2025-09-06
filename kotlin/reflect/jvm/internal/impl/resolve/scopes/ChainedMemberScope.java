package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nChainedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n92#2,14:92\n47#2,11:106\n47#2,11:117\n47#2,11:128\n10664#3,5:139\n10664#3,5:144\n13579#3,2:149\n*S KotlinDebug\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope\n*L\n35#1:92,14\n38#1:106,11\n41#1:117,11\n44#1:128,11\n46#1:139,5\n47#1:144,5\n51#1:149,2\n*E\n"})
public final class ChainedMemberScope implements MemberScope {
    @SourceDebugExtension({"SMAP\nChainedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,91:1\n37#2,2:92\n*S KotlinDebug\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope$Companion\n*L\n87#1:92,2\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final MemberScope create(@NotNull String s, @NotNull Iterable iterable0) {
            Intrinsics.checkNotNullParameter(s, "debugName");
            Intrinsics.checkNotNullParameter(iterable0, "scopes");
            SmartList smartList0 = new SmartList();
            for(Object object0: iterable0) {
                MemberScope memberScope0 = (MemberScope)object0;
                if(memberScope0 == Empty.INSTANCE) {
                }
                else if(memberScope0 instanceof ChainedMemberScope) {
                    o.addAll(smartList0, ((ChainedMemberScope)memberScope0).b);
                }
                else {
                    smartList0.add(memberScope0);
                }
            }
            return this.createOrSingle$descriptors(s, smartList0);
        }

        @NotNull
        public final MemberScope createOrSingle$descriptors(@NotNull String s, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "debugName");
            Intrinsics.checkNotNullParameter(list0, "scopes");
            switch(list0.size()) {
                case 0: {
                    return Empty.INSTANCE;
                }
                case 1: {
                    return (MemberScope)list0.get(0);
                }
                default: {
                    return new ChainedMemberScope(s, ((MemberScope[])list0.toArray(new MemberScope[0])), null);
                }
            }
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public final MemberScope[] b;

    static {
        ChainedMemberScope.Companion = new Companion(null);
    }

    public ChainedMemberScope(String s, MemberScope[] arr_memberScope, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = s;
        this.b = arr_memberScope;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set getClassifierNames() {
        return MemberScopeKt.flatMapClassifierNamesOrNull(ArraysKt___ArraysKt.asIterable(this.b));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        MemberScope[] arr_memberScope = this.b;
        ClassifierDescriptor classifierDescriptor0 = null;
        for(int v = 0; v < arr_memberScope.length; ++v) {
            ClassifierDescriptor classifierDescriptor1 = arr_memberScope[v].getContributedClassifier(name0, lookupLocation0);
            if(classifierDescriptor1 != null) {
                if(!(classifierDescriptor1 instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters)classifierDescriptor1).isExpect()) {
                    return classifierDescriptor1;
                }
                if(classifierDescriptor0 == null) {
                    classifierDescriptor0 = classifierDescriptor1;
                }
            }
        }
        return classifierDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        MemberScope[] arr_memberScope = this.b;
        switch(arr_memberScope.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return arr_memberScope[0].getContributedDescriptors(descriptorKindFilter0, function10);
            }
            default: {
                Collection collection0 = null;
                for(int v = 0; v < arr_memberScope.length; ++v) {
                    collection0 = ScopeUtilsKt.concat(collection0, arr_memberScope[v].getContributedDescriptors(descriptorKindFilter0, function10));
                }
                return collection0 == null ? f0.emptySet() : collection0;
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        MemberScope[] arr_memberScope = this.b;
        switch(arr_memberScope.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return arr_memberScope[0].getContributedFunctions(name0, lookupLocation0);
            }
            default: {
                Collection collection0 = null;
                for(int v = 0; v < arr_memberScope.length; ++v) {
                    collection0 = ScopeUtilsKt.concat(collection0, arr_memberScope[v].getContributedFunctions(name0, lookupLocation0));
                }
                return collection0 == null ? f0.emptySet() : collection0;
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        MemberScope[] arr_memberScope = this.b;
        switch(arr_memberScope.length) {
            case 0: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            case 1: {
                return arr_memberScope[0].getContributedVariables(name0, lookupLocation0);
            }
            default: {
                Collection collection0 = null;
                for(int v = 0; v < arr_memberScope.length; ++v) {
                    collection0 = ScopeUtilsKt.concat(collection0, arr_memberScope[v].getContributedVariables(name0, lookupLocation0));
                }
                return collection0 == null ? f0.emptySet() : collection0;
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set getFunctionNames() {
        Set set0 = new LinkedHashSet();
        MemberScope[] arr_memberScope = this.b;
        for(int v = 0; v < arr_memberScope.length; ++v) {
            o.addAll(set0, arr_memberScope[v].getFunctionNames());
        }
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set getVariableNames() {
        Set set0 = new LinkedHashSet();
        MemberScope[] arr_memberScope = this.b;
        for(int v = 0; v < arr_memberScope.length; ++v) {
            o.addAll(set0, arr_memberScope[v].getVariableNames());
        }
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public void recordLookup(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        MemberScope[] arr_memberScope = this.b;
        for(int v = 0; v < arr_memberScope.length; ++v) {
            arr_memberScope[v].recordLookup(name0, lookupLocation0);
        }
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }
}

