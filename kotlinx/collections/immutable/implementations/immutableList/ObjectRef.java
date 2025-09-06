package kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0002\u001A\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "", "value", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ObjectRef {
    public Object a;

    public ObjectRef(@Nullable Object object0) {
        this.a = object0;
    }

    @Nullable
    public final Object getValue() {
        return this.a;
    }

    public final void setValue(@Nullable Object object0) {
        this.a = object0;
    }
}

