package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import df.b;
import df.c;
import df.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nTypeIntersectionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n3190#2,10:60\n*S KotlinDebug\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope\n*L\n36#1:60,10\n*E\n"})
public final class TypeIntersectionScope extends AbstractScopeAdapter {
    @SourceDebugExtension({"SMAP\nTypeIntersectionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1549#2:60\n1620#2,3:61\n*S KotlinDebug\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope$Companion\n*L\n50#1:60\n50#1:61,3\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final MemberScope create(@NotNull String s, @NotNull Collection collection0) {
            Intrinsics.checkNotNullParameter(s, "message");
            Intrinsics.checkNotNullParameter(collection0, "types");
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
            for(Object object0: collection0) {
                arrayList0.add(((KotlinType)object0).getMemberScope());
            }
            SmartList smartList0 = ScopeUtilsKt.listOfNonEmptyScopes(arrayList0);
            MemberScope memberScope0 = ChainedMemberScope.Companion.createOrSingle$descriptors(s, smartList0);
            return smartList0.size() <= 1 ? memberScope0 : new TypeIntersectionScope(s, memberScope0, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final MemberScope a;

    static {
        TypeIntersectionScope.Companion = new Companion(null);
    }

    public TypeIntersectionScope(String s, MemberScope memberScope0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = memberScope0;
    }

    @JvmStatic
    @NotNull
    public static final MemberScope create(@NotNull String s, @NotNull Collection collection0) {
        return TypeIntersectionScope.Companion.create(s, collection0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    public Collection getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        Iterable iterable0 = super.getContributedDescriptors(descriptorKindFilter0, function10);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: iterable0) {
            if(((DeclarationDescriptor)object0) instanceof CallableDescriptor) {
                arrayList0.add(object0);
            }
            else {
                arrayList1.add(object0);
            }
        }
        Pair pair0 = new Pair(arrayList0, arrayList1);
        List list0 = (List)pair0.component1();
        Intrinsics.checkNotNull(list0, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return CollectionsKt___CollectionsKt.plus(OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list0, b.w), ((List)pair0.component2()));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    public Collection getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedFunctions(name0, lookupLocation0), c.w);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    public Collection getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedVariables(name0, lookupLocation0), d.w);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    public MemberScope getWorkerScope() {
        return this.a;
    }
}

