package io.reactivex.rxkotlin;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u001C\n\u0002\u0010(\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/reactivex/rxkotlin/FlowableKt$toIterable$1", "", "", "iterator", "()Ljava/util/Iterator;", "rxkotlin"}, k = 1, mv = {1, 4, 0})
public final class FlowableKt.toIterable.1 implements Iterable, KMappedMarker {
    public final Iterator a;

    public FlowableKt.toIterable.1(Iterator iterator0) {
        this.a = iterator0;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.a;
    }
}

