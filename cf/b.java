package cf;

import coil.size.Size;
import coil.util.HardwareBitmapService;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;

public final class b implements HardwareBitmapService, Neighbors {
    public final boolean a;

    public b(boolean z) {
        this.a = z;
        super();
    }

    @Override  // coil.util.HardwareBitmapService
    public boolean allowHardwareMainThread(Size size0) {
        return this.a;
    }

    @Override  // coil.util.HardwareBitmapService
    public boolean allowHardwareWorkerThread() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$Neighbors
    public Iterable getNeighbors(Object object0) {
        CallableMemberDescriptor callableMemberDescriptor0 = (CallableMemberDescriptor)object0;
        Collection collection0 = null;
        if(this.a) {
            callableMemberDescriptor0 = callableMemberDescriptor0 == null ? null : callableMemberDescriptor0.getOriginal();
        }
        if(callableMemberDescriptor0 != null) {
            collection0 = callableMemberDescriptor0.getOverriddenDescriptors();
        }
        return collection0 == null ? CollectionsKt__CollectionsKt.emptyList() : collection0;
    }
}

