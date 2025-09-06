package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import fg.c;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {
    public final StorageManager a;
    public final KotlinMetadataFinder b;
    public final ModuleDescriptor c;
    protected DeserializationComponents components;
    public final MemoizedFunctionToNullable d;

    public AbstractDeserializedPackageFragmentProvider(@NotNull StorageManager storageManager0, @NotNull KotlinMetadataFinder kotlinMetadataFinder0, @NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinMetadataFinder0, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "moduleDescriptor");
        super();
        this.a = storageManager0;
        this.b = kotlinMetadataFinder0;
        this.c = moduleDescriptor0;
        this.d = storageManager0.createMemoizedFunctionWithNullableValues(new c(this, 26));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(collection0, "packageFragments");
        CollectionsKt.addIfNotNull(collection0, this.d.invoke(fqName0));
    }

    @Nullable
    public abstract DeserializedPackageFragment findPackage(@NotNull FqName arg1);

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents0 = this.components;
        if(deserializationComponents0 != null) {
            return deserializationComponents0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("components");
        return null;
    }

    @NotNull
    public final KotlinMetadataFinder getFinder() {
        return this.b;
    }

    @NotNull
    public final ModuleDescriptor getModuleDescriptor() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @NotNull
    public List getPackageFragments(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return CollectionsKt__CollectionsKt.listOfNotNull(this.d.invoke(fqName0));
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection getSubPackagesOf(@NotNull FqName fqName0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return this.d.isComputed(fqName0) ? ((PackageFragmentDescriptor)this.d.invoke(fqName0)) == null : this.findPackage(fqName0) == null;
    }

    public final void setComponents(@NotNull DeserializationComponents deserializationComponents0) {
        Intrinsics.checkNotNullParameter(deserializationComponents0, "<set-?>");
        this.components = deserializationComponents0;
    }
}

