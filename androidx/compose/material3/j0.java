package androidx.compose.material3;

import androidx.compose.material.DrawerKt;
import androidx.compose.material.DrawerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function0 {
    public final int w;
    public final float x;
    public final Object y;

    public j0(float f, DrawerState drawerState0) {
        this.w = 1;
        this.x = f;
        this.y = drawerState0;
        super(0);
    }

    public j0(TopAppBarScrollBehavior topAppBarScrollBehavior0, float f) {
        this.w = 0;
        this.y = topAppBarScrollBehavior0;
        this.x = f;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Float float0;
        if(this.w != 0) {
            float f = ((DrawerState)this.y).requireOffset$material_release();
            return DrawerKt.access$calculateFraction(this.x, 0.0f, f);
        }
        TopAppBarState topAppBarState0 = null;
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = (TopAppBarScrollBehavior)this.y;
        if(topAppBarScrollBehavior0 == null) {
            float0 = null;
        }
        else {
            TopAppBarState topAppBarState1 = topAppBarScrollBehavior0.getState();
            float0 = topAppBarState1 == null ? null : topAppBarState1.getHeightOffsetLimit();
        }
        float f1 = -this.x;
        if(!Intrinsics.areEqual(float0, f1)) {
            if(topAppBarScrollBehavior0 != null) {
                topAppBarState0 = topAppBarScrollBehavior0.getState();
            }
            if(topAppBarState0 != null) {
                topAppBarState0.setHeightOffsetLimit(f1);
            }
        }
        return Unit.INSTANCE;
    }
}

