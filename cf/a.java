package cf;

import java.util.ArrayList;
import kotlin.collections.l;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;

public final class a implements Neighbors {
    public static final a a;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$Neighbors
    public final Iterable getNeighbors(Object object0) {
        Iterable iterable0 = ((ValueParameterDescriptor)object0).getOverriddenDescriptors();
        Iterable iterable1 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object1: iterable0) {
            ((ArrayList)iterable1).add(((ValueParameterDescriptor)object1).getOriginal());
        }
        return iterable1;
    }
}

