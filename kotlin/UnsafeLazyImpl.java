package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0014\u0010\u0011\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkotlin/UnsafeLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UnsafeLazyImpl implements Serializable, Lazy {
    public Function0 a;
    public Object b;

    public UnsafeLazyImpl(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "initializer");
        super();
        this.a = function00;
        this.b = UNINITIALIZED_VALUE.INSTANCE;
    }

    @Override  // kotlin.Lazy
    public Object getValue() {
        if(this.b == UNINITIALIZED_VALUE.INSTANCE) {
            Function0 function00 = this.a;
            Intrinsics.checkNotNull(function00);
            this.b = function00.invoke();
            this.a = null;
        }
        return this.b;
    }

    @Override  // kotlin.Lazy
    public boolean isInitialized() {
        return this.b != UNINITIALIZED_VALUE.INSTANCE;
    }

    // 去混淆评级： 低(20)
    @Override
    @NotNull
    public String toString() {
        return this.isInitialized() ? String.valueOf(this.getValue()) : "Lazy value not initialized yet.";
    }
}

