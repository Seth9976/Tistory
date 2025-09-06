package se;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class s implements Neighbors {
    public static final s a;

    static {
        s.a = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$Neighbors
    public final Iterable getNeighbors(Object object0) {
        Collection collection0 = ((ClassDescriptor)object0).getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(collection0, "it.typeConstructor.supertypes");
        return SequencesKt___SequencesKt.asIterable(SequencesKt___SequencesKt.mapNotNull(CollectionsKt___CollectionsKt.asSequence(collection0), v.w));
    }
}

