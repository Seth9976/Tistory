package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class pl extends Lambda implements Function1 {
    public final int w;
    public final boolean x;
    public final Object y;

    public pl(PullRefreshState pullRefreshState0, boolean z) {
        this.w = 2;
        this.y = pullRefreshState0;
        this.x = z;
        super(1);
    }

    public pl(boolean z, Object object0, int v) {
        this.w = v;
        this.x = z;
        this.y = object0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                if(!this.x) {
                    SemanticsPropertiesKt.disabled(((SemanticsPropertyReceiver)object0));
                }
                SemanticsPropertiesKt.setProgress$default(((SemanticsPropertyReceiver)object0), null, new cl(((SliderState)this.y), 1), 1, null);
                return Unit.INSTANCE;
            }
            case 1: {
                LazyGridItemInfo lazyGridItemInfo0 = (LazyGridItemInfo)((List)this.y).get(((Number)object0).intValue());
                return this.x ? lazyGridItemInfo0.getRow() : lazyGridItemInfo0.getColumn();
            }
            default: {
                PullRefreshState pullRefreshState0 = (PullRefreshState)this.y;
                ((GraphicsLayerScope)object0).setTranslationY(pullRefreshState0.getPosition$material_release() - Size.getHeight-impl(((GraphicsLayerScope)object0).getSize-NH-jbRc()));
                if(this.x && !pullRefreshState0.getRefreshing$material_release()) {
                    float f = c.coerceIn(EasingKt.getLinearOutSlowInEasing().transform(pullRefreshState0.getPosition$material_release() / pullRefreshState0.getThreshold$material_release()), 0.0f, 1.0f);
                    ((GraphicsLayerScope)object0).setScaleX(f);
                    ((GraphicsLayerScope)object0).setScaleY(f);
                }
                return Unit.INSTANCE;
            }
        }
    }
}

