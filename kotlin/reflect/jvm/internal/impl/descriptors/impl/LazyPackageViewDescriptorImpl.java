package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {
    public final ModuleDescriptorImpl c;
    public final FqName d;
    public final NotNullLazyValue e;
    public final NotNullLazyValue f;
    public final LazyScopeAdapter g;
    public static final KProperty[] h;

    static {
        LazyPackageViewDescriptorImpl.h = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyPackageViewDescriptorImpl.class), "empty", "getEmpty()Z"))};
    }

    public LazyPackageViewDescriptorImpl(@NotNull ModuleDescriptorImpl moduleDescriptorImpl0, @NotNull FqName fqName0, @NotNull StorageManager storageManager0) {
        Intrinsics.checkNotNullParameter(moduleDescriptorImpl0, "module");
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Name name0 = fqName0.shortNameOrSpecial();
        super(Annotations.Companion.getEMPTY(), name0);
        this.c = moduleDescriptorImpl0;
        this.d = fqName0;
        this.e = storageManager0.createLazyValue(new l(this, 1));
        this.f = storageManager0.createLazyValue(new l(this, 0));
        this.g = new LazyScopeAdapter(storageManager0, new m(this));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(@NotNull DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        Intrinsics.checkNotNullParameter(declarationDescriptorVisitor0, "visitor");
        return declarationDescriptorVisitor0.visitPackageViewDescriptor(this, object0);
    }

    // 去混淆评级： 低(25)
    @Override
    public boolean equals(@Nullable Object object0) {
        PackageViewDescriptor packageViewDescriptor0 = object0 instanceof PackageViewDescriptor ? ((PackageViewDescriptor)object0) : null;
        return packageViewDescriptor0 == null ? false : Intrinsics.areEqual(this.getFqName(), packageViewDescriptor0.getFqName()) && Intrinsics.areEqual(this.getModule(), packageViewDescriptor0.getModule());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return this.getContainingDeclaration();
    }

    @Nullable
    public PackageViewDescriptor getContainingDeclaration() {
        if(this.getFqName().isRoot()) {
            return null;
        }
        FqName fqName0 = this.getFqName().parent();
        Intrinsics.checkNotNullExpressionValue(fqName0, "fqName.parent()");
        return this.getModule().getPackage(fqName0);
    }

    public final boolean getEmpty() {
        return ((Boolean)StorageKt.getValue(this.f, this, LazyPackageViewDescriptorImpl.h[1])).booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    public FqName getFqName() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    public List getFragments() {
        return (List)StorageKt.getValue(this.e, this, LazyPackageViewDescriptorImpl.h[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    public MemberScope getMemberScope() {
        return this.g;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public ModuleDescriptor getModule() {
        return this.getModule();
    }

    @NotNull
    public ModuleDescriptorImpl getModule() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.getFqName().hashCode() + this.getModule().hashCode() * 0x1F;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return this.getEmpty();
    }
}

