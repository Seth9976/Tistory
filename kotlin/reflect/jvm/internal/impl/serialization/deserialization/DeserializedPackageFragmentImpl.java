package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {
    public final BinaryVersion h;
    public final DeserializedContainerSource i;
    public final NameResolverImpl j;
    public final ProtoBasedClassDataFinder k;
    public PackageFragment l;
    public DeserializedPackageMemberScope m;

    public DeserializedPackageFragmentImpl(@NotNull FqName fqName0, @NotNull StorageManager storageManager0, @NotNull ModuleDescriptor moduleDescriptor0, @NotNull PackageFragment protoBuf$PackageFragment0, @NotNull BinaryVersion binaryVersion0, @Nullable DeserializedContainerSource deserializedContainerSource0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        Intrinsics.checkNotNullParameter(protoBuf$PackageFragment0, "proto");
        Intrinsics.checkNotNullParameter(binaryVersion0, "metadataVersion");
        super(fqName0, storageManager0, moduleDescriptor0);
        this.h = binaryVersion0;
        this.i = deserializedContainerSource0;
        StringTable protoBuf$StringTable0 = protoBuf$PackageFragment0.getStrings();
        Intrinsics.checkNotNullExpressionValue(protoBuf$StringTable0, "proto.strings");
        QualifiedNameTable protoBuf$QualifiedNameTable0 = protoBuf$PackageFragment0.getQualifiedNames();
        Intrinsics.checkNotNullExpressionValue(protoBuf$QualifiedNameTable0, "proto.qualifiedNames");
        NameResolverImpl nameResolverImpl0 = new NameResolverImpl(protoBuf$StringTable0, protoBuf$QualifiedNameTable0);
        this.j = nameResolverImpl0;
        this.k = new ProtoBasedClassDataFinder(protoBuf$PackageFragment0, nameResolverImpl0, binaryVersion0, new b(this));
        this.l = protoBuf$PackageFragment0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public ClassDataFinder getClassDataFinder() {
        return this.getClassDataFinder();
    }

    @NotNull
    public ProtoBasedClassDataFinder getClassDataFinder() {
        return this.k;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    public MemberScope getMemberScope() {
        MemberScope memberScope0 = this.m;
        if(memberScope0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_memberScope");
            return null;
        }
        return memberScope0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public void initialize(@NotNull DeserializationComponents deserializationComponents0) {
        Intrinsics.checkNotNullParameter(deserializationComponents0, "components");
        PackageFragment protoBuf$PackageFragment0 = this.l;
        if(protoBuf$PackageFragment0 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.l = null;
        Package protoBuf$Package0 = protoBuf$PackageFragment0.getPackage();
        Intrinsics.checkNotNullExpressionValue(protoBuf$Package0, "proto.`package`");
        c c0 = new c(this);
        this.m = new DeserializedPackageMemberScope(this, protoBuf$Package0, this.j, this.h, this.i, deserializationComponents0, "scope of " + this, c0);
    }
}

