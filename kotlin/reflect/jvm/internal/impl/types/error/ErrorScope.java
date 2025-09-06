package kotlin.reflect.jvm.internal.impl.types.error;

import a5.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import wb.a;

public class ErrorScope implements MemberScope {
    public final String a;

    public ErrorScope(@NotNull ErrorScopeKind errorScopeKind0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(errorScopeKind0, "kind");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        super();
        Object[] arr_object = Arrays.copyOf(arr_s, arr_s.length);
        this.a = b.f(arr_object.length, errorScopeKind0.getDebugMessage(), "format(this, *args)", arr_object);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set getClassifierNames() {
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        String s = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name0}, 1));
        Intrinsics.checkNotNullExpressionValue(s, "format(this, *args)");
        Name name1 = Name.special(s);
        Intrinsics.checkNotNullExpressionValue(name1, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new ErrorClassDescriptor(name1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection getContributedFunctions(Name name0, LookupLocation lookupLocation0) {
        return this.getContributedFunctions(name0, lookupLocation0);
    }

    @NotNull
    public Set getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return e0.setOf(new ErrorFunctionDescriptor(ErrorUtils.INSTANCE.getErrorClass()));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection getContributedVariables(Name name0, LookupLocation lookupLocation0) {
        return this.getContributedVariables(name0, lookupLocation0);
    }

    @NotNull
    public Set getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return ErrorUtils.INSTANCE.getErrorPropertyGroup();
    }

    @NotNull
    public final String getDebugMessage() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set getFunctionNames() {
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set getVariableNames() {
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public void recordLookup(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ErrorScope{");
        return a.b('}', this.a, stringBuilder0);
    }
}

