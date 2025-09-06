package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public abstract class DeserializedPackageFragment extends PackageFragmentDescriptorImpl {
    public final StorageManager g;

    public DeserializedPackageFragment(@NotNull FqName fqName0, @NotNull StorageManager storageManager0, @NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        super(moduleDescriptor0, fqName0);
        this.g = storageManager0;
    }

    @NotNull
    public abstract ClassDataFinder getClassDataFinder();

    public boolean hasTopLevelClass(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        MemberScope memberScope0 = this.getMemberScope();
        return memberScope0 instanceof DeserializedMemberScope && ((DeserializedMemberScope)memberScope0).getClassNames$deserialization().contains(name0);
    }

    public abstract void initialize(@NotNull DeserializationComponents arg1);
}

