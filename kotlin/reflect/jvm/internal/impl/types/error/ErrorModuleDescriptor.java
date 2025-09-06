package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ErrorModuleDescriptor implements ModuleDescriptor {
    @NotNull
    public static final ErrorModuleDescriptor INSTANCE;
    public static final Name a;
    public static final List b;
    public static final List c;
    public static final Set d;
    public static final DefaultBuiltIns e;

    static {
        ErrorModuleDescriptor.INSTANCE = new ErrorModuleDescriptor();  // 初始化器: Ljava/lang/Object;-><init>()V
        Name name0 = Name.special("<Error module>");
        Intrinsics.checkNotNullExpressionValue(name0, "special(ErrorEntity.ERROR_MODULE.debugText)");
        ErrorModuleDescriptor.a = name0;
        ErrorModuleDescriptor.b = CollectionsKt__CollectionsKt.emptyList();
        ErrorModuleDescriptor.c = CollectionsKt__CollectionsKt.emptyList();
        ErrorModuleDescriptor.d = f0.emptySet();
        ErrorModuleDescriptor.e = DefaultBuiltIns.Companion.getInstance();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public Object accept(@NotNull DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        Intrinsics.checkNotNullParameter(declarationDescriptorVisitor0, "visitor");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return ErrorModuleDescriptor.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    public Object getCapability(@NotNull ModuleCapability moduleCapability0) {
        Intrinsics.checkNotNullParameter(moduleCapability0, "capability");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public DeclarationDescriptor getContainingDeclaration() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public List getExpectedByModules() {
        return ErrorModuleDescriptor.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return this.getStableName();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public PackageViewDescriptor getPackage(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @NotNull
    public Name getStableName() {
        return ErrorModuleDescriptor.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public Collection getSubPackagesOf(@NotNull FqName fqName0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "targetModule");
        return false;
    }
}

