package xf;

import ea.d;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import wb.a;

public final class t2 implements SharingStarted {
    public final long a;
    public final long b;

    public t2(long v, long v1) {
        this.a = v;
        this.b = v1;
        if(Long.compare(v, 0L) < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + v + " ms) cannot be negative").toString());
        }
        if(v1 < 0L) {
            throw new IllegalArgumentException(("replayExpiration(" + v1 + " ms) cannot be negative").toString());
        }
    }

    @Override  // kotlinx.coroutines.flow.SharingStarted
    public final Flow command(StateFlow stateFlow0) {
        return FlowKt.distinctUntilChanged(FlowKt.dropWhile(FlowKt.transformLatest(stateFlow0, new d(1, this, null)), new s2(2, null)));  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof t2 && this.a == ((t2)object0).a && this.b == ((t2)object0).b;
    }

    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + Long.hashCode(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        List list0 = k.createListBuilder(2);
        long v = this.a;
        if(Long.compare(v, 0L) > 0) {
            list0.add("stopTimeout=" + v + "ms");
        }
        long v1 = this.b;
        if(v1 < 0x7FFFFFFFFFFFFFFFL) {
            list0.add("replayExpiration=" + v1 + "ms");
        }
        List list1 = k.build(list0);
        StringBuilder stringBuilder0 = new StringBuilder("SharingStarted.WhileSubscribed(");
        return a.b(')', CollectionsKt___CollectionsKt.joinToString$default(list1, null, null, null, 0, null, null, 0x3F, null), stringBuilder0);
    }
}

