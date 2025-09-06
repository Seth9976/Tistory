package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class CompanionObjectMappingUtilsKt {
    public static final boolean isMappedIntrinsicCompanionObject(@NotNull CompanionObjectMapping companionObjectMapping0, @NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(companionObjectMapping0, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        if(DescriptorUtils.isCompanionObject(classDescriptor0)) {
            ClassId classId0 = DescriptorUtilsKt.getClassId(classDescriptor0);
            return CollectionsKt___CollectionsKt.contains(companionObjectMapping0.getClassIds(), (classId0 == null ? null : classId0.getOuterClassId()));
        }
        return false;
    }
}

