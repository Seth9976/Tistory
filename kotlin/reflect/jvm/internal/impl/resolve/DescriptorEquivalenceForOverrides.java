package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner.Default;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ze.a;
import ze.b;
import ze.c;

public final class DescriptorEquivalenceForOverrides {
    @NotNull
    public static final DescriptorEquivalenceForOverrides INSTANCE;

    static {
        DescriptorEquivalenceForOverrides.INSTANCE = new DescriptorEquivalenceForOverrides();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final boolean a(DeclarationDescriptorNonRoot declarationDescriptorNonRoot0, DeclarationDescriptorNonRoot declarationDescriptorNonRoot1, Function2 function20, boolean z) {
        DeclarationDescriptor declarationDescriptor0 = declarationDescriptorNonRoot0.getContainingDeclaration();
        DeclarationDescriptor declarationDescriptor1 = declarationDescriptorNonRoot1.getContainingDeclaration();
        return declarationDescriptor0 instanceof CallableMemberDescriptor || declarationDescriptor1 instanceof CallableMemberDescriptor ? ((Boolean)function20.invoke(declarationDescriptor0, declarationDescriptor1)).booleanValue() : DescriptorEquivalenceForOverrides.areEquivalent$default(this, declarationDescriptor0, declarationDescriptor1, z, false, 8, null);
    }

    public final boolean areCallableDescriptorsEquivalent(@NotNull CallableDescriptor callableDescriptor0, @NotNull CallableDescriptor callableDescriptor1, boolean z, boolean z1, boolean z2, @NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(callableDescriptor0, "a");
        Intrinsics.checkNotNullParameter(callableDescriptor1, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        if(Intrinsics.areEqual(callableDescriptor0, callableDescriptor1)) {
            return true;
        }
        if(!Intrinsics.areEqual(callableDescriptor0.getName(), callableDescriptor1.getName())) {
            return false;
        }
        if(z1 && callableDescriptor0 instanceof MemberDescriptor && callableDescriptor1 instanceof MemberDescriptor && ((MemberDescriptor)callableDescriptor0).isExpect() != ((MemberDescriptor)callableDescriptor1).isExpect()) {
            return false;
        }
        if(Intrinsics.areEqual(callableDescriptor0.getContainingDeclaration(), callableDescriptor1.getContainingDeclaration())) {
            if(!z) {
                return false;
            }
            if(!Intrinsics.areEqual(DescriptorEquivalenceForOverrides.b(callableDescriptor0), DescriptorEquivalenceForOverrides.b(callableDescriptor1))) {
                return false;
            }
        }
        if(DescriptorUtils.isLocal(callableDescriptor0) || DescriptorUtils.isLocal(callableDescriptor1) || !this.a(callableDescriptor0, callableDescriptor1, b.w, z)) {
            return false;
        }
        OverridingUtil overridingUtil0 = OverridingUtil.create(kotlinTypeRefiner0, new a(callableDescriptor0, callableDescriptor1, z));
        Intrinsics.checkNotNullExpressionValue(overridingUtil0, "create(kotlinTypeRefiner…= a && y == b }\n        }");
        return overridingUtil0.isOverridableBy(callableDescriptor0, callableDescriptor1, null, !z2).getResult() == Result.OVERRIDABLE && overridingUtil0.isOverridableBy(callableDescriptor1, callableDescriptor0, null, !z2).getResult() == Result.OVERRIDABLE;
    }

    public static boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides0, CallableDescriptor callableDescriptor0, CallableDescriptor callableDescriptor1, boolean z, boolean z1, boolean z2, KotlinTypeRefiner kotlinTypeRefiner0, int v, Object object0) {
        if((v & 8) != 0) {
            z1 = true;
        }
        if((v & 16) != 0) {
            z2 = false;
        }
        return descriptorEquivalenceForOverrides0.areCallableDescriptorsEquivalent(callableDescriptor0, callableDescriptor1, z, z1, z2, kotlinTypeRefiner0);
    }

    public final boolean areEquivalent(@Nullable DeclarationDescriptor declarationDescriptor0, @Nullable DeclarationDescriptor declarationDescriptor1, boolean z, boolean z1) {
        if(declarationDescriptor0 instanceof ClassDescriptor && declarationDescriptor1 instanceof ClassDescriptor) {
            return Intrinsics.areEqual(((ClassDescriptor)declarationDescriptor0).getTypeConstructor(), ((ClassDescriptor)declarationDescriptor1).getTypeConstructor());
        }
        if(declarationDescriptor0 instanceof TypeParameterDescriptor && declarationDescriptor1 instanceof TypeParameterDescriptor) {
            return DescriptorEquivalenceForOverrides.areTypeParametersEquivalent$default(this, ((TypeParameterDescriptor)declarationDescriptor0), ((TypeParameterDescriptor)declarationDescriptor1), z, null, 8, null);
        }
        if(declarationDescriptor0 instanceof CallableDescriptor && declarationDescriptor1 instanceof CallableDescriptor) {
            return DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent$default(this, ((CallableDescriptor)declarationDescriptor0), ((CallableDescriptor)declarationDescriptor1), z, z1, false, Default.INSTANCE, 16, null);
        }
        return !(declarationDescriptor0 instanceof PackageFragmentDescriptor) || !(declarationDescriptor1 instanceof PackageFragmentDescriptor) ? Intrinsics.areEqual(declarationDescriptor0, declarationDescriptor1) : Intrinsics.areEqual(((PackageFragmentDescriptor)declarationDescriptor0).getFqName(), ((PackageFragmentDescriptor)declarationDescriptor1).getFqName());
    }

    public static boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides0, DeclarationDescriptor declarationDescriptor0, DeclarationDescriptor declarationDescriptor1, boolean z, boolean z1, int v, Object object0) {
        if((v & 8) != 0) {
            z1 = true;
        }
        return descriptorEquivalenceForOverrides0.areEquivalent(declarationDescriptor0, declarationDescriptor1, z, z1);
    }

    @JvmOverloads
    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor typeParameterDescriptor0, @NotNull TypeParameterDescriptor typeParameterDescriptor1, boolean z) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "a");
        Intrinsics.checkNotNullParameter(typeParameterDescriptor1, "b");
        return DescriptorEquivalenceForOverrides.areTypeParametersEquivalent$default(this, typeParameterDescriptor0, typeParameterDescriptor1, z, null, 8, null);
    }

    @JvmOverloads
    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor typeParameterDescriptor0, @NotNull TypeParameterDescriptor typeParameterDescriptor1, boolean z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "a");
        Intrinsics.checkNotNullParameter(typeParameterDescriptor1, "b");
        Intrinsics.checkNotNullParameter(function20, "equivalentCallables");
        if(Intrinsics.areEqual(typeParameterDescriptor0, typeParameterDescriptor1)) {
            return true;
        }
        if(Intrinsics.areEqual(typeParameterDescriptor0.getContainingDeclaration(), typeParameterDescriptor1.getContainingDeclaration())) {
            return false;
        }
        return this.a(typeParameterDescriptor0, typeParameterDescriptor1, function20, z) ? typeParameterDescriptor0.getIndex() == typeParameterDescriptor1.getIndex() : false;
    }

    public static boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides0, TypeParameterDescriptor typeParameterDescriptor0, TypeParameterDescriptor typeParameterDescriptor1, boolean z, Function2 function20, int v, Object object0) {
        if((v & 8) != 0) {
            function20 = c.w;
        }
        return descriptorEquivalenceForOverrides0.areTypeParametersEquivalent(typeParameterDescriptor0, typeParameterDescriptor1, z, function20);
    }

    public static SourceElement b(CallableDescriptor callableDescriptor0) {
        while(callableDescriptor0 instanceof CallableMemberDescriptor && ((CallableMemberDescriptor)callableDescriptor0).getKind() == Kind.FAKE_OVERRIDE) {
            Collection collection0 = ((CallableMemberDescriptor)callableDescriptor0).getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(collection0, "overriddenDescriptors");
            callableDescriptor0 = (CallableMemberDescriptor)CollectionsKt___CollectionsKt.singleOrNull(collection0);
            if(callableDescriptor0 == null) {
                return null;
            }
            if(false) {
                break;
            }
        }
        return callableDescriptor0.getSource();
    }
}

