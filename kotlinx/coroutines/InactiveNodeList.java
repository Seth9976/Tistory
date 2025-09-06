package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\u000E\u001A\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/InactiveNodeList;", "Lkotlinx/coroutines/Incomplete;", "Lkotlinx/coroutines/NodeList;", "list", "<init>", "(Lkotlinx/coroutines/NodeList;)V", "", "toString", "()Ljava/lang/String;", "a", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "", "isActive", "()Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InactiveNodeList implements Incomplete {
    public final NodeList a;

    public InactiveNodeList(@NotNull NodeList nodeList0) {
        this.a = nodeList0;
    }

    @Override  // kotlinx.coroutines.Incomplete
    @NotNull
    public NodeList getList() {
        return this.a;
    }

    @Override  // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return false;
    }

    @Override
    @NotNull
    public String toString() {
        return super.toString();
    }
}

