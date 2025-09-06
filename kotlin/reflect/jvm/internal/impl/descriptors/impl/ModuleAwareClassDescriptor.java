package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public abstract class ModuleAwareClassDescriptor implements ClassDescriptor {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final MemberScope getRefinedMemberScopeIfPossible$descriptors(@NotNull ClassDescriptor classDescriptor0, @NotNull TypeSubstitution typeSubstitution0, @NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
            MemberScope memberScope0;
            Intrinsics.checkNotNullParameter(classDescriptor0, "<this>");
            Intrinsics.checkNotNullParameter(typeSubstitution0, "typeSubstitution");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
            ModuleAwareClassDescriptor moduleAwareClassDescriptor0 = classDescriptor0 instanceof ModuleAwareClassDescriptor ? ((ModuleAwareClassDescriptor)classDescriptor0) : null;
            if(moduleAwareClassDescriptor0 == null) {
                memberScope0 = classDescriptor0.getMemberScope(typeSubstitution0);
                Intrinsics.checkNotNullExpressionValue(memberScope0, "this.getMemberScope(\n   …ubstitution\n            )");
            }
            else {
                memberScope0 = moduleAwareClassDescriptor0.getMemberScope(typeSubstitution0, kotlinTypeRefiner0);
                if(memberScope0 == null) {
                    memberScope0 = classDescriptor0.getMemberScope(typeSubstitution0);
                    Intrinsics.checkNotNullExpressionValue(memberScope0, "this.getMemberScope(\n   …ubstitution\n            )");
                    return memberScope0;
                }
            }
            return memberScope0;
        }

        @NotNull
        public final MemberScope getRefinedUnsubstitutedMemberScopeIfPossible$descriptors(@NotNull ClassDescriptor classDescriptor0, @NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
            MemberScope memberScope0;
            Intrinsics.checkNotNullParameter(classDescriptor0, "<this>");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
            ModuleAwareClassDescriptor moduleAwareClassDescriptor0 = classDescriptor0 instanceof ModuleAwareClassDescriptor ? ((ModuleAwareClassDescriptor)classDescriptor0) : null;
            if(moduleAwareClassDescriptor0 == null) {
                memberScope0 = classDescriptor0.getUnsubstitutedMemberScope();
                Intrinsics.checkNotNullExpressionValue(memberScope0, "this.unsubstitutedMemberScope");
            }
            else {
                memberScope0 = moduleAwareClassDescriptor0.getUnsubstitutedMemberScope(kotlinTypeRefiner0);
                if(memberScope0 == null) {
                    memberScope0 = classDescriptor0.getUnsubstitutedMemberScope();
                    Intrinsics.checkNotNullExpressionValue(memberScope0, "this.unsubstitutedMemberScope");
                    return memberScope0;
                }
            }
            return memberScope0;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        ModuleAwareClassDescriptor.Companion = new Companion(null);
    }

    @NotNull
    public abstract MemberScope getMemberScope(@NotNull TypeSubstitution arg1, @NotNull KotlinTypeRefiner arg2);

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public ClassifierDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @NotNull
    public abstract MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner arg1);
}

