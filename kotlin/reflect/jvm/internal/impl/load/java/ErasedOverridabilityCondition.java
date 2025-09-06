package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import oe.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nErasedOverridabilityCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErasedOverridabilityCondition.kt\norg/jetbrains/kotlin/load/java/ErasedOverridabilityCondition\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,63:1\n1229#2,2:64\n*S KotlinDebug\n*F\n+ 1 ErasedOverridabilityCondition.kt\norg/jetbrains/kotlin/load/java/ErasedOverridabilityCondition\n*L\n44#1:64,2\n*E\n"})
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Result.values().length];
            try {
                arr_v[Result.OVERRIDABLE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public Contract getContract() {
        return Contract.SUCCESS_ONLY;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result isOverridable(@NotNull CallableDescriptor callableDescriptor0, @NotNull CallableDescriptor callableDescriptor1, @Nullable ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(callableDescriptor0, "superDescriptor");
        Intrinsics.checkNotNullParameter(callableDescriptor1, "subDescriptor");
        if(callableDescriptor1 instanceof JavaMethodDescriptor) {
            List list0 = ((JavaMethodDescriptor)callableDescriptor1).getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(list0, "subDescriptor.typeParameters");
            if(list0.isEmpty()) {
                OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo0 = OverridingUtil.getBasicOverridabilityProblem(callableDescriptor0, callableDescriptor1);
                if((overridingUtil$OverrideCompatibilityInfo0 == null ? null : overridingUtil$OverrideCompatibilityInfo0.getResult()) != null) {
                    return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List list1 = ((JavaMethodDescriptor)callableDescriptor1).getValueParameters();
                Intrinsics.checkNotNullExpressionValue(list1, "subDescriptor.valueParameters");
                Sequence sequence0 = SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(list1), d.w);
                KotlinType kotlinType0 = ((JavaMethodDescriptor)callableDescriptor1).getReturnType();
                Intrinsics.checkNotNull(kotlinType0);
                Sequence sequence1 = SequencesKt___SequencesKt.plus(sequence0, kotlinType0);
                ReceiverParameterDescriptor receiverParameterDescriptor0 = ((JavaMethodDescriptor)callableDescriptor1).getExtensionReceiverParameter();
                for(Object object0: SequencesKt___SequencesKt.plus(sequence1, CollectionsKt__CollectionsKt.listOfNotNull((receiverParameterDescriptor0 == null ? null : receiverParameterDescriptor0.getType())))) {
                    if(!((KotlinType)object0).getArguments().isEmpty() && !(((KotlinType)object0).unwrap() instanceof RawTypeImpl)) {
                        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                    if(false) {
                        break;
                    }
                }
                CallableDescriptor callableDescriptor2 = (CallableDescriptor)callableDescriptor0.substitute(new RawSubstitution(null, 1, null).buildSubstitutor());
                if(callableDescriptor2 == null) {
                    return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if(callableDescriptor2 instanceof SimpleFunctionDescriptor) {
                    List list2 = ((SimpleFunctionDescriptor)callableDescriptor2).getTypeParameters();
                    Intrinsics.checkNotNullExpressionValue(list2, "erasedSuper.typeParameters");
                    if(!list2.isEmpty()) {
                        callableDescriptor2 = ((SimpleFunctionDescriptor)callableDescriptor2).newCopyBuilder().setTypeParameters(CollectionsKt__CollectionsKt.emptyList()).build();
                        Intrinsics.checkNotNull(callableDescriptor2);
                    }
                }
                Result overridingUtil$OverrideCompatibilityInfo$Result0 = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor2, callableDescriptor1, false).getResult();
                Intrinsics.checkNotNullExpressionValue(overridingUtil$OverrideCompatibilityInfo$Result0, "DEFAULT.isOverridableByW…Descriptor, false).result");
                return WhenMappings.$EnumSwitchMapping$0[overridingUtil$OverrideCompatibilityInfo$Result0.ordinal()] == 1 ? kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE : kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}

