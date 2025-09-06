package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ModuleDescriptor extends DeclarationDescriptor {
    public static final class DefaultImpls {
        @Nullable
        public static Object accept(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
            Intrinsics.checkNotNullParameter(declarationDescriptorVisitor0, "visitor");
            return declarationDescriptorVisitor0.visitModuleDeclaration(moduleDescriptor0, object0);
        }

        @Nullable
        public static DeclarationDescriptor getContainingDeclaration(@NotNull ModuleDescriptor moduleDescriptor0) [...] // Inlined contents
    }

    @NotNull
    KotlinBuiltIns getBuiltIns();

    @Nullable
    Object getCapability(@NotNull ModuleCapability arg1);

    @NotNull
    List getExpectedByModules();

    @NotNull
    PackageViewDescriptor getPackage(@NotNull FqName arg1);

    @NotNull
    Collection getSubPackagesOf(@NotNull FqName arg1, @NotNull Function1 arg2);

    boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor arg1);
}

