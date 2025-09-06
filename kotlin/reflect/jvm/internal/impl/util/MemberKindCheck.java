package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class MemberKindCheck implements Check {
    public static final class Member extends MemberKindCheck {
        @NotNull
        public static final Member INSTANCE;

        static {
            Member.INSTANCE = new Member("must be a member function", null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/MemberKindCheck;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor0) {
            Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
            return functionDescriptor0.getDispatchReceiverParameter() != null;
        }
    }

    public static final class MemberOrExtension extends MemberKindCheck {
        @NotNull
        public static final MemberOrExtension INSTANCE;

        static {
            MemberOrExtension.INSTANCE = new MemberOrExtension("must be a member or an extension function", null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/MemberKindCheck;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor0) {
            Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
            return functionDescriptor0.getDispatchReceiverParameter() != null || functionDescriptor0.getExtensionReceiverParameter() != null;
        }
    }

    public final String a;

    public MemberKindCheck(String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = s;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor0) {
        return DefaultImpls.invoke(this, functionDescriptor0);
    }
}

