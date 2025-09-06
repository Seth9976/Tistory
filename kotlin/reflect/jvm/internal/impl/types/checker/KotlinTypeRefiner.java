package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class KotlinTypeRefiner extends AbstractTypeRefiner {
    public static final class Default extends KotlinTypeRefiner {
        @NotNull
        public static final Default INSTANCE;

        static {
            Default.INSTANCE = new Default();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeRefiner;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @Nullable
        public ClassDescriptor findClassAcrossModuleDependencies(@NotNull ClassId classId0) {
            Intrinsics.checkNotNullParameter(classId0, "classId");
            return null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        public MemberScope getOrPutScopeForClass(@NotNull ClassDescriptor classDescriptor0, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
            Intrinsics.checkNotNullParameter(function00, "compute");
            return (MemberScope)function00.invoke();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean isRefinementNeededForModule(@NotNull ModuleDescriptor moduleDescriptor0) {
            Intrinsics.checkNotNullParameter(moduleDescriptor0, "moduleDescriptor");
            return false;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean isRefinementNeededForTypeConstructor(@NotNull TypeConstructor typeConstructor0) {
            Intrinsics.checkNotNullParameter(typeConstructor0, "typeConstructor");
            return false;
        }

        @Nullable
        public ClassDescriptor refineDescriptor(@NotNull DeclarationDescriptor declarationDescriptor0) {
            Intrinsics.checkNotNullParameter(declarationDescriptor0, "descriptor");
            return null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public ClassifierDescriptor refineDescriptor(DeclarationDescriptor declarationDescriptor0) {
            return this.refineDescriptor(declarationDescriptor0);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        public Collection refineSupertypes(@NotNull ClassDescriptor classDescriptor0) {
            Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
            Collection collection0 = classDescriptor0.getTypeConstructor().getSupertypes();
            Intrinsics.checkNotNullExpressionValue(collection0, "classDescriptor.typeConstructor.supertypes");
            return collection0;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        public KotlinType refineType(@NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
            return (KotlinType)kotlinTypeMarker0;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        public KotlinTypeMarker refineType(KotlinTypeMarker kotlinTypeMarker0) {
            return this.refineType(kotlinTypeMarker0);
        }
    }

    @Nullable
    public abstract ClassDescriptor findClassAcrossModuleDependencies(@NotNull ClassId arg1);

    @NotNull
    public abstract MemberScope getOrPutScopeForClass(@NotNull ClassDescriptor arg1, @NotNull Function0 arg2);

    public abstract boolean isRefinementNeededForModule(@NotNull ModuleDescriptor arg1);

    public abstract boolean isRefinementNeededForTypeConstructor(@NotNull TypeConstructor arg1);

    @Nullable
    public abstract ClassifierDescriptor refineDescriptor(@NotNull DeclarationDescriptor arg1);

    @NotNull
    public abstract Collection refineSupertypes(@NotNull ClassDescriptor arg1);

    @NotNull
    public abstract KotlinType refineType(@NotNull KotlinTypeMarker arg1);
}

