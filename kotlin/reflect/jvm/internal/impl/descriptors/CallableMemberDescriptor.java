package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

public interface CallableMemberDescriptor extends CallableDescriptor, MemberDescriptor {
    public static enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != Kind.FAKE_OVERRIDE;
        }
    }

    @NotNull
    CallableMemberDescriptor copy(DeclarationDescriptor arg1, Modality arg2, DescriptorVisibility arg3, Kind arg4, boolean arg5);

    @NotNull
    Kind getKind();

    @NotNull
    CallableMemberDescriptor getOriginal();

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    Collection getOverriddenDescriptors();

    void setOverriddenDescriptors(@NotNull Collection arg1);
}

