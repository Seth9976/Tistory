package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import a4.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class DeserializedMemberScope extends MemberScopeImpl {
    interface Implementation {
        void addFunctionsAndPropertiesTo(@NotNull Collection arg1, @NotNull DescriptorKindFilter arg2, @NotNull Function1 arg3, @NotNull LookupLocation arg4);

        @NotNull
        Collection getContributedFunctions(@NotNull Name arg1, @NotNull LookupLocation arg2);

        @NotNull
        Collection getContributedVariables(@NotNull Name arg1, @NotNull LookupLocation arg2);

        @NotNull
        Set getFunctionNames();

        @Nullable
        TypeAliasDescriptor getTypeAliasByName(@NotNull Name arg1);

        @NotNull
        Set getTypeAliasNames();

        @NotNull
        Set getVariableNames();
    }

    public final DeserializationContext a;
    public final Implementation b;
    public final NotNullLazyValue c;
    public final NullableLazyValue d;
    public static final KProperty[] e;

    static {
        DeserializedMemberScope.e = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public DeserializedMemberScope(@NotNull DeserializationContext deserializationContext0, @NotNull List list0, @NotNull List list1, @NotNull List list2, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(deserializationContext0, "c");
        Intrinsics.checkNotNullParameter(list0, "functionList");
        Intrinsics.checkNotNullParameter(list1, "propertyList");
        Intrinsics.checkNotNullParameter(list2, "typeAliasList");
        Intrinsics.checkNotNullParameter(function00, "classNames");
        super();
        this.a = deserializationContext0;
        r r0 = deserializationContext0.getComponents().getConfiguration().getPreserveDeclarationsOrdering() ? new r(this, list0, list1, list2) : new u(this, list0, list1, list2);
        this.b = r0;
        this.c = deserializationContext0.getStorageManager().createLazyValue(new c(function00, 8));
        this.d = deserializationContext0.getStorageManager().createNullableLazyValue(new v(this));
    }

    public abstract void addEnumEntryDescriptors(@NotNull Collection arg1, @NotNull Function1 arg2);

    @NotNull
    public final Collection computeDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        ArrayList arrayList0 = new ArrayList(0);
        if(descriptorKindFilter0.acceptsKinds(2)) {
            this.addEnumEntryDescriptors(arrayList0, function10);
        }
        Implementation deserializedMemberScope$Implementation0 = this.b;
        deserializedMemberScope$Implementation0.addFunctionsAndPropertiesTo(arrayList0, descriptorKindFilter0, function10, lookupLocation0);
        if(descriptorKindFilter0.acceptsKinds(7)) {
            for(Object object0: this.getClassNames$deserialization()) {
                Name name0 = (Name)object0;
                if(((Boolean)function10.invoke(name0)).booleanValue()) {
                    ClassId classId0 = this.createClassId(name0);
                    CollectionsKt.addIfNotNull(arrayList0, this.a.getComponents().deserializeClass(classId0));
                }
            }
        }
        if(descriptorKindFilter0.acceptsKinds(4)) {
            for(Object object1: deserializedMemberScope$Implementation0.getTypeAliasNames()) {
                Name name1 = (Name)object1;
                if(((Boolean)function10.invoke(name1)).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList0, deserializedMemberScope$Implementation0.getTypeAliasByName(name1));
                }
            }
        }
        return CollectionsKt.compact(arrayList0);
    }

    public void computeNonDeclaredFunctions(@NotNull Name name0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(list0, "functions");
    }

    public void computeNonDeclaredProperties(@NotNull Name name0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(list0, "descriptors");
    }

    @NotNull
    public abstract ClassId createClassId(@NotNull Name arg1);

    @NotNull
    public final DeserializationContext getC() {
        return this.a;
    }

    @NotNull
    public final Set getClassNames$deserialization() {
        return (Set)StorageKt.getValue(this.c, this, DeserializedMemberScope.e[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @Nullable
    public Set getClassifierNames() {
        return (Set)StorageKt.getValue(this.d, this, DeserializedMemberScope.e[1]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        if(this.hasClass(name0)) {
            ClassId classId0 = this.createClassId(name0);
            return this.a.getComponents().deserializeClass(classId0);
        }
        Implementation deserializedMemberScope$Implementation0 = this.b;
        return deserializedMemberScope$Implementation0.getTypeAliasNames().contains(name0) ? deserializedMemberScope$Implementation0.getTypeAliasByName(name0) : null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Collection getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return this.b.getContributedFunctions(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Collection getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return this.b.getContributedVariables(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Set getFunctionNames() {
        return this.b.getFunctionNames();
    }

    @Nullable
    public abstract Set getNonDeclaredClassifierNames();

    @NotNull
    public abstract Set getNonDeclaredFunctionNames();

    @NotNull
    public abstract Set getNonDeclaredVariableNames();

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Set getVariableNames() {
        return this.b.getVariableNames();
    }

    public boolean hasClass(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        return this.getClassNames$deserialization().contains(name0);
    }

    public boolean isDeclaredFunctionAvailable(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor0) {
        Intrinsics.checkNotNullParameter(simpleFunctionDescriptor0, "function");
        return true;
    }
}

