package androidx.compose.material3;

public final class k0 implements ScrolledOffset {
    public final int a;
    public final TopAppBarScrollBehavior b;

    public k0(TopAppBarScrollBehavior topAppBarScrollBehavior0, int v) {
        this.a = v;
        this.b = topAppBarScrollBehavior0;
        super();
    }

    @Override  // androidx.compose.material3.ScrolledOffset
    public final float offset() {
        if(this.a != 0) {
            TopAppBarScrollBehavior topAppBarScrollBehavior0 = this.b;
            if(topAppBarScrollBehavior0 != null) {
                TopAppBarState topAppBarState0 = topAppBarScrollBehavior0.getState();
                return topAppBarState0 == null ? 0.0f : topAppBarState0.getHeightOffset();
            }
            return 0.0f;
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior1 = this.b;
        if(topAppBarScrollBehavior1 != null) {
            TopAppBarState topAppBarState1 = topAppBarScrollBehavior1.getState();
            return topAppBarState1 == null ? 0.0f : topAppBarState1.getHeightOffset();
        }
        return 0.0f;
    }
}

