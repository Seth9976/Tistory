package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDeserializedPackageMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedPackageMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedPackageMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1360#2:82\n1446#2,5:83\n1747#2,3:88\n*S KotlinDebug\n*F\n+ 1 DeserializedPackageMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedPackageMemberScope\n*L\n55#1:82\n55#1:83,5\n58#1:88,3\n*E\n"})
public class DeserializedPackageMemberScope extends DeserializedMemberScope {
    public final PackageFragmentDescriptor f;
    public final String g;
    public final FqName h;

    public DeserializedPackageMemberScope(@NotNull PackageFragmentDescriptor packageFragmentDescriptor0, @NotNull Package protoBuf$Package0, @NotNull NameResolver nameResolver0, @NotNull BinaryVersion binaryVersion0, @Nullable DeserializedContainerSource deserializedContainerSource0, @NotNull DeserializationComponents deserializationComponents0, @NotNull String s, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(packageFragmentDescriptor0, "packageDescriptor");
        Intrinsics.checkNotNullParameter(protoBuf$Package0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(binaryVersion0, "metadataVersion");
        Intrinsics.checkNotNullParameter(deserializationComponents0, "components");
        Intrinsics.checkNotNullParameter(s, "debugName");
        Intrinsics.checkNotNullParameter(function00, "classNames");
        TypeTable protoBuf$TypeTable0 = protoBuf$Package0.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(protoBuf$TypeTable0, "proto.typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(protoBuf$TypeTable0);
        VersionRequirementTable protoBuf$VersionRequirementTable0 = protoBuf$Package0.getVersionRequirementTable();
        Intrinsics.checkNotNullExpressionValue(protoBuf$VersionRequirementTable0, "proto.versionRequirementTable");
        DeserializationContext deserializationContext0 = deserializationComponents0.createContext(packageFragmentDescriptor0, nameResolver0, typeTable0, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion.create(protoBuf$VersionRequirementTable0), binaryVersion0, deserializedContainerSource0);
        List list0 = protoBuf$Package0.getFunctionList();
        Intrinsics.checkNotNullExpressionValue(list0, "proto.functionList");
        List list1 = protoBuf$Package0.getPropertyList();
        Intrinsics.checkNotNullExpressionValue(list1, "proto.propertyList");
        List list2 = protoBuf$Package0.getTypeAliasList();
        Intrinsics.checkNotNullExpressionValue(list2, "proto.typeAliasList");
        super(deserializationContext0, list0, list1, list2, function00);
        this.f = packageFragmentDescriptor0;
        this.g = s;
        this.h = packageFragmentDescriptor0.getFqName();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public void addEnumEntryDescriptors(@NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(collection0, "result");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    public ClassId createClassId(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        return new ClassId(this.h, name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.recordLookup(name0, lookupLocation0);
        return super.getContributedClassifier(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter0, Function1 function10) {
        return this.getContributedDescriptors(descriptorKindFilter0, function10);
    }

    @NotNull
    public List getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        Collection collection0 = this.computeDescriptors(descriptorKindFilter0, function10, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.getC().getComponents().getFictitiousClassDescriptorFactories()) {
            o.addAll(arrayList0, ((ClassDescriptorFactory)object0).getAllContributedClassesIfPossible(this.h));
        }
        return CollectionsKt___CollectionsKt.plus(collection0, arrayList0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @Nullable
    public Set getNonDeclaredClassifierNames() {
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    public Set getNonDeclaredFunctionNames() {
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    public Set getNonDeclaredVariableNames() {
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public boolean hasClass(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        if(!super.hasClass(name0)) {
            Iterable iterable0 = this.getC().getComponents().getFictitiousClassDescriptorFactories();
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    if(((ClassDescriptorFactory)object0).shouldCreateClass(this.h, name0)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public void recordLookup(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        UtilsKt.record(this.getC().getComponents().getLookupTracker(), lookupLocation0, this.f, name0);
    }

    @Override
    @NotNull
    public String toString() {
        return this.g;
    }
}

