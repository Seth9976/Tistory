package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import org.jetbrains.annotations.NotNull;

public final class ThrowingScope extends ErrorScope {
    public ThrowingScope(@NotNull ErrorScopeKind errorScopeKind0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(errorScopeKind0, "kind");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        super(errorScopeKind0, ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public Set getClassifierNames() {
        throw new IllegalStateException();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        throw new IllegalStateException(this.getDebugMessage() + ", required name: " + name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public Collection getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        throw new IllegalStateException(this.getDebugMessage());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    public Collection getContributedFunctions(Name name0, LookupLocation lookupLocation0) {
        return this.getContributedFunctions(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public Set getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        throw new IllegalStateException(this.getDebugMessage() + ", required name: " + name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    public Collection getContributedVariables(Name name0, LookupLocation lookupLocation0) {
        return this.getContributedVariables(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public Set getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        throw new IllegalStateException(this.getDebugMessage() + ", required name: " + name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public Set getFunctionNames() {
        throw new IllegalStateException();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public Set getVariableNames() {
        throw new IllegalStateException();
    }

    @NotNull
    public Void recordLookup(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        throw new IllegalStateException();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    public void recordLookup(Name name0, LookupLocation lookupLocation0) {
        this.recordLookup(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public String toString() {
        return "ThrowingScope{" + this.getDebugMessage() + '}';
    }
}

