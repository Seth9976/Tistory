package d0;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction;
import androidx.compose.ui.node.TraversableNode;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class h0 extends Lambda implements Function1 {
    public final ObjectRef w;

    public h0(ObjectRef ref$ObjectRef0) {
        this.w = ref$ObjectRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNull(((TraversableNode)object0), "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
        LazyLayoutPrefetchState lazyLayoutPrefetchState0 = ((i0)(((TraversableNode)object0))).n;
        ObjectRef ref$ObjectRef0 = this.w;
        List list0 = (List)ref$ObjectRef0.element;
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.mutableListOf(new LazyLayoutPrefetchState[]{lazyLayoutPrefetchState0});
        }
        else {
            list0.add(lazyLayoutPrefetchState0);
        }
        ref$ObjectRef0.element = list0;
        return TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
    }
}

