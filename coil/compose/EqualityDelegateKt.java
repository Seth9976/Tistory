package coil.compose;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcoil/compose/EqualityDelegate;", "a", "Lcoil/compose/EqualityDelegate;", "getDefaultModelEqualityDelegate", "()Lcoil/compose/EqualityDelegate;", "DefaultModelEqualityDelegate", "coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class EqualityDelegateKt {
    public static final EqualityDelegateKt.DefaultModelEqualityDelegate.1 a;

    static {
        EqualityDelegateKt.a = new EqualityDelegateKt.DefaultModelEqualityDelegate.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public static final EqualityDelegate getDefaultModelEqualityDelegate() {
        return EqualityDelegateKt.a;
    }
}

