package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001D\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001A\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u001A\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\f0\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0014\u0010\u0012\u001A\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ThrowingCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "getMember", "()Ljava/lang/Void;", "member", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ThrowingCaller implements Caller {
    @NotNull
    public static final ThrowingCaller INSTANCE;

    static {
        ThrowingCaller.INSTANCE = new ThrowingCaller();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Nullable
    public Void getMember() [...] // Inlined contents

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    public Member getMember() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List getParameterTypes() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        Type type0 = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(type0, "TYPE");
        return type0;
    }
}

