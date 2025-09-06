package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import fg.c;
import j2.j;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.x;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nModuleDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n19#2:177\n19#2:181\n19#2:182\n766#3:178\n857#3,2:179\n1#4:183\n*S KotlinDebug\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n*L\n72#1:177\n75#1:181\n78#1:182\n72#1:178\n72#1:179,2\n*E\n"})
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {
    public final StorageManager c;
    public final KotlinBuiltIns d;
    public final Map e;
    public final PackageViewDescriptorFactory f;
    public ModuleDependencies g;
    public PackageFragmentProvider h;
    public final boolean i;
    public final MemoizedFunctionToNotNull j;
    public final Lazy k;

    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name name0, @NotNull StorageManager storageManager0, @NotNull KotlinBuiltIns kotlinBuiltIns0, @Nullable TargetPlatform targetPlatform0) {
        Intrinsics.checkNotNullParameter(name0, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        this(name0, storageManager0, kotlinBuiltIns0, targetPlatform0, null, null, 0x30, null);
    }

    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name name0, @NotNull StorageManager storageManager0, @NotNull KotlinBuiltIns kotlinBuiltIns0, @Nullable TargetPlatform targetPlatform0, @NotNull Map map0, @Nullable Name name1) {
        Intrinsics.checkNotNullParameter(name0, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        Intrinsics.checkNotNullParameter(map0, "capabilities");
        super(Annotations.Companion.getEMPTY(), name0);
        this.c = storageManager0;
        this.d = kotlinBuiltIns0;
        if(!name0.isSpecial()) {
            throw new IllegalArgumentException("Module name must be special: " + name0);
        }
        this.e = map0;
        PackageViewDescriptorFactory packageViewDescriptorFactory0 = (PackageViewDescriptorFactory)this.getCapability(PackageViewDescriptorFactory.Companion.getCAPABILITY());
        if(packageViewDescriptorFactory0 == null) {
            packageViewDescriptorFactory0 = Default.INSTANCE;
        }
        this.f = packageViewDescriptorFactory0;
        this.i = true;
        this.j = storageManager0.createMemoizedFunction(new c(this, 25));
        this.k = md.c.lazy(new j(this, 13));
    }

    public ModuleDescriptorImpl(Name name0, StorageManager storageManager0, KotlinBuiltIns kotlinBuiltIns0, TargetPlatform targetPlatform0, Map map0, Name name1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(name0, storageManager0, kotlinBuiltIns0, ((v & 8) == 0 ? targetPlatform0 : null), ((v & 16) == 0 ? map0 : x.emptyMap()), ((v & 0x20) == 0 ? name1 : null));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public Object accept(@NotNull DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return DefaultImpls.accept(this, declarationDescriptorVisitor0, object0);
    }

    public static final ModuleDependencies access$getDependencies$p(ModuleDescriptorImpl moduleDescriptorImpl0) {
        return moduleDescriptorImpl0.g;
    }

    public static final String access$getId(ModuleDescriptorImpl moduleDescriptorImpl0) {
        String s = moduleDescriptorImpl0.getName().toString();
        Intrinsics.checkNotNullExpressionValue(s, "name.toString()");
        return s;
    }

    public static final PackageFragmentProvider access$getPackageFragmentProviderForModuleContent$p(ModuleDescriptorImpl moduleDescriptorImpl0) {
        return moduleDescriptorImpl0.h;
    }

    public static final PackageViewDescriptorFactory access$getPackageViewDescriptorFactory$p(ModuleDescriptorImpl moduleDescriptorImpl0) {
        return moduleDescriptorImpl0.f;
    }

    public static final StorageManager access$getStorageManager$p(ModuleDescriptorImpl moduleDescriptorImpl0) {
        return moduleDescriptorImpl0.c;
    }

    public static final boolean access$isInitialized(ModuleDescriptorImpl moduleDescriptorImpl0) {
        return moduleDescriptorImpl0.h != null;
    }

    public void assertValid() {
        if(!this.isValid()) {
            InvalidModuleExceptionKt.moduleInvalidated(this);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    public Object getCapability(@NotNull ModuleCapability moduleCapability0) {
        Intrinsics.checkNotNullParameter(moduleCapability0, "capability");
        Object object0 = this.e.get(moduleCapability0);
        return object0 == null ? null : object0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public DeclarationDescriptor getContainingDeclaration() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public List getExpectedByModules() {
        ModuleDependencies moduleDependencies0 = this.g;
        if(moduleDependencies0 != null) {
            return moduleDependencies0.getDirectExpectedByDependencies();
        }
        String s = this.getName().toString();
        Intrinsics.checkNotNullExpressionValue(s, "name.toString()");
        throw new AssertionError("Dependencies of module " + s + " were not set");
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public PackageViewDescriptor getPackage(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        this.assertValid();
        return (PackageViewDescriptor)this.j.invoke(fqName0);
    }

    @NotNull
    public final PackageFragmentProvider getPackageFragmentProvider() {
        this.assertValid();
        return (CompositePackageFragmentProvider)this.k.getValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public Collection getSubPackagesOf(@NotNull FqName fqName0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        this.assertValid();
        return this.getPackageFragmentProvider().getSubPackagesOf(fqName0, function10);
    }

    public final void initialize(@NotNull PackageFragmentProvider packageFragmentProvider0) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider0, "providerForModuleContent");
        this.h = packageFragmentProvider0;
    }

    public boolean isValid() {
        return this.i;
    }

    public final void setDependencies(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "descriptors");
        this.setDependencies(list0, f0.emptySet());
    }

    public final void setDependencies(@NotNull List list0, @NotNull Set set0) {
        Intrinsics.checkNotNullParameter(list0, "descriptors");
        Intrinsics.checkNotNullParameter(set0, "friends");
        this.setDependencies(new ModuleDependenciesImpl(list0, set0, CollectionsKt__CollectionsKt.emptyList(), f0.emptySet()));
    }

    public final void setDependencies(@NotNull ModuleDependencies moduleDependencies0) {
        Intrinsics.checkNotNullParameter(moduleDependencies0, "dependencies");
        this.g = moduleDependencies0;
    }

    public final void setDependencies(@NotNull ModuleDescriptorImpl[] arr_moduleDescriptorImpl) {
        Intrinsics.checkNotNullParameter(arr_moduleDescriptorImpl, "descriptors");
        this.setDependencies(ArraysKt___ArraysKt.toList(arr_moduleDescriptorImpl));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "targetModule");
        if(Intrinsics.areEqual(this, moduleDescriptor0)) {
            return true;
        }
        ModuleDependencies moduleDependencies0 = this.g;
        Intrinsics.checkNotNull(moduleDependencies0);
        if(CollectionsKt___CollectionsKt.contains(moduleDependencies0.getModulesWhoseInternalsAreVisible(), moduleDescriptor0)) {
            return true;
        }
        return this.getExpectedByModules().contains(moduleDescriptor0) ? true : moduleDescriptor0.getExpectedByModules().contains(this);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        String s = super.toString();
        Intrinsics.checkNotNullExpressionValue(s, "super.toString()");
        return this.isValid() ? s : s + " !isValid";
    }
}

