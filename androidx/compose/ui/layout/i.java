package androidx.compose.ui.layout;

public final class i implements SubcomposeSlotReusePolicy {
    public static final i a;

    static {
        i.a = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean areCompatible(Object object0, Object object1) {
        return false;
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void getSlotsToRetain(SlotIdsSet subcomposeSlotReusePolicy$SlotIdsSet0) {
        subcomposeSlotReusePolicy$SlotIdsSet0.clear();
    }
}

