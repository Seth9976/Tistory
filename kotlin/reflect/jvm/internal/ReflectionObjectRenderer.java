package kotlin.reflect.jvm.internal;

import fe.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\u000B\u0010\tJ\u0015\u0010\u000E\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "", "renderProperty", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderFunction", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Ljava/lang/String;", "invoke", "renderLambda", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "parameter", "renderParameter", "(Lkotlin/reflect/jvm/internal/KParameterImpl;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "renderType", "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/String;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ReflectionObjectRenderer {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Kind.values().length];
            try {
                arr_v[Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.INSTANCE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.VALUE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final ReflectionObjectRenderer INSTANCE;
    public static final DescriptorRenderer a;

    static {
        ReflectionObjectRenderer.INSTANCE = new ReflectionObjectRenderer();  // 初始化器: Ljava/lang/Object;-><init>()V
        ReflectionObjectRenderer.a = DescriptorRenderer.FQ_NAMES_IN_TYPES;
    }

    public final void a(StringBuilder stringBuilder0, CallableMemberDescriptor callableMemberDescriptor0) {
        ReceiverParameterDescriptor receiverParameterDescriptor0 = UtilKt.getInstanceReceiverParameter(callableMemberDescriptor0);
        ReceiverParameterDescriptor receiverParameterDescriptor1 = callableMemberDescriptor0.getExtensionReceiverParameter();
        if(receiverParameterDescriptor0 != null) {
            KotlinType kotlinType0 = receiverParameterDescriptor0.getType();
            Intrinsics.checkNotNullExpressionValue(kotlinType0, "receiver.type");
            stringBuilder0.append(this.renderType(kotlinType0));
            stringBuilder0.append(".");
        }
        boolean z = receiverParameterDescriptor0 != null && receiverParameterDescriptor1 != null;
        if(z) {
            stringBuilder0.append("(");
        }
        if(receiverParameterDescriptor1 != null) {
            KotlinType kotlinType1 = receiverParameterDescriptor1.getType();
            Intrinsics.checkNotNullExpressionValue(kotlinType1, "receiver.type");
            stringBuilder0.append(this.renderType(kotlinType1));
            stringBuilder0.append(".");
        }
        if(z) {
            stringBuilder0.append(")");
        }
    }

    @NotNull
    public final String renderFunction(@NotNull FunctionDescriptor functionDescriptor0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "descriptor");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("fun ");
        ReflectionObjectRenderer.INSTANCE.a(stringBuilder0, functionDescriptor0);
        Name name0 = functionDescriptor0.getName();
        Intrinsics.checkNotNullExpressionValue(name0, "descriptor.name");
        stringBuilder0.append(ReflectionObjectRenderer.a.renderName(name0, true));
        List list0 = functionDescriptor0.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "descriptor.valueParameters");
        CollectionsKt___CollectionsKt.joinTo$default(list0, stringBuilder0, ", ", "(", ")", 0, null, a.E, 0x30, null);
        stringBuilder0.append(": ");
        KotlinType kotlinType0 = functionDescriptor0.getReturnType();
        Intrinsics.checkNotNull(kotlinType0);
        stringBuilder0.append(ReflectionObjectRenderer.INSTANCE.renderType(kotlinType0));
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @NotNull
    public final String renderLambda(@NotNull FunctionDescriptor functionDescriptor0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "invoke");
        StringBuilder stringBuilder0 = new StringBuilder();
        ReflectionObjectRenderer.INSTANCE.a(stringBuilder0, functionDescriptor0);
        List list0 = functionDescriptor0.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "invoke.valueParameters");
        CollectionsKt___CollectionsKt.joinTo$default(list0, stringBuilder0, ", ", "(", ")", 0, null, a.F, 0x30, null);
        stringBuilder0.append(" -> ");
        KotlinType kotlinType0 = functionDescriptor0.getReturnType();
        Intrinsics.checkNotNull(kotlinType0);
        stringBuilder0.append(ReflectionObjectRenderer.INSTANCE.renderType(kotlinType0));
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @NotNull
    public final String renderParameter(@NotNull KParameterImpl kParameterImpl0) {
        String s;
        Intrinsics.checkNotNullParameter(kParameterImpl0, "parameter");
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(WhenMappings.$EnumSwitchMapping$0[kParameterImpl0.getKind().ordinal()]) {
            case 1: {
                stringBuilder0.append("extension receiver parameter");
                break;
            }
            case 2: {
                stringBuilder0.append("instance parameter");
                break;
            }
            case 3: {
                stringBuilder0.append("parameter #" + kParameterImpl0.getIndex() + ' ' + kParameterImpl0.getName());
            }
        }
        stringBuilder0.append(" of ");
        ReflectionObjectRenderer reflectionObjectRenderer0 = ReflectionObjectRenderer.INSTANCE;
        CallableMemberDescriptor callableMemberDescriptor0 = kParameterImpl0.getCallable().getDescriptor();
        reflectionObjectRenderer0.getClass();
        if(callableMemberDescriptor0 instanceof PropertyDescriptor) {
            s = reflectionObjectRenderer0.renderProperty(((PropertyDescriptor)callableMemberDescriptor0));
        }
        else if(callableMemberDescriptor0 instanceof FunctionDescriptor) {
            s = reflectionObjectRenderer0.renderFunction(((FunctionDescriptor)callableMemberDescriptor0));
        }
        else {
            throw new IllegalStateException(("Illegal callable: " + callableMemberDescriptor0).toString());
        }
        stringBuilder0.append(s);
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
        return s1;
    }

    @NotNull
    public final String renderProperty(@NotNull PropertyDescriptor propertyDescriptor0) {
        Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append((propertyDescriptor0.isVar() ? "var " : "val "));
        ReflectionObjectRenderer.INSTANCE.a(stringBuilder0, propertyDescriptor0);
        Name name0 = propertyDescriptor0.getName();
        Intrinsics.checkNotNullExpressionValue(name0, "descriptor.name");
        stringBuilder0.append(ReflectionObjectRenderer.a.renderName(name0, true));
        stringBuilder0.append(": ");
        KotlinType kotlinType0 = propertyDescriptor0.getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "descriptor.type");
        stringBuilder0.append(ReflectionObjectRenderer.INSTANCE.renderType(kotlinType0));
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @NotNull
    public final String renderType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        return ReflectionObjectRenderer.a.renderType(kotlinType0);
    }
}

