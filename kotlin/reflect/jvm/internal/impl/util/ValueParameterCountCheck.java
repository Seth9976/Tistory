package kotlin.reflect.jvm.internal.impl.util;

import a5.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ValueParameterCountCheck implements Check {
    public static final class AtLeast extends ValueParameterCountCheck {
        public final int b;

        public AtLeast(int v) {
            StringBuilder stringBuilder0 = b.s(v, "must have at least ", " value parameter");
            stringBuilder0.append((v <= 1 ? "" : "s"));
            super(stringBuilder0.toString(), null);
            this.b = v;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor0) {
            Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
            return functionDescriptor0.getValueParameters().size() >= this.b;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {
        public final int b;

        public Equals(int v) {
            super("must have exactly " + v + " value parameters", null);
            this.b = v;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor0) {
            Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
            return functionDescriptor0.getValueParameters().size() == this.b;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {
        @NotNull
        public static final NoValueParameters INSTANCE;

        static {
            NoValueParameters.INSTANCE = new NoValueParameters("must have no value parameters", null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor0) {
            Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
            return functionDescriptor0.getValueParameters().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {
        @NotNull
        public static final SingleValueParameter INSTANCE;

        static {
            SingleValueParameter.INSTANCE = new SingleValueParameter("must have a single value parameter", null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor0) {
            Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
            return functionDescriptor0.getValueParameters().size() == 1;
        }
    }

    public final String a;

    public ValueParameterCountCheck(String s, DefaultConstructorMarker defaultConstructorMarker0) {
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

