package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ReturnsCheck implements Check {
    public static final class ReturnsBoolean extends ReturnsCheck {
        @NotNull
        public static final ReturnsBoolean INSTANCE;

        static {
            ReturnsBoolean.INSTANCE = new ReturnsBoolean("Boolean", c.w, null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/ReturnsCheck;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {
        @NotNull
        public static final ReturnsInt INSTANCE;

        static {
            ReturnsInt.INSTANCE = new ReturnsInt("Int", d.w, null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/ReturnsCheck;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {
        @NotNull
        public static final ReturnsUnit INSTANCE;

        static {
            ReturnsUnit.INSTANCE = new ReturnsUnit("Unit", e.w, null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/ReturnsCheck;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public final Function1 a;
    public final String b;

    public ReturnsCheck(String s, Function1 function10, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = function10;
        this.b = "must return " + s;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(@NotNull FunctionDescriptor functionDescriptor0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
        KotlinType kotlinType0 = functionDescriptor0.getReturnType();
        KotlinBuiltIns kotlinBuiltIns0 = DescriptorUtilsKt.getBuiltIns(functionDescriptor0);
        return Intrinsics.areEqual(kotlinType0, this.a.invoke(kotlinBuiltIns0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor0) {
        return DefaultImpls.invoke(this, functionDescriptor0);
    }
}

