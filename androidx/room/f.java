package androidx.room;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

public final class f extends Lambda implements Function1 {
    public final int w;
    public final int x;
    public final Object y;

    public f(int v, Collection collection0) {
        this.w = 2;
        this.x = v;
        this.y = collection0;
        super(1);
    }

    public f(Object object0, int v, int v1) {
        this.w = v1;
        this.y = object0;
        this.x = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((List)object0), "indices");
                Iterator iterator0 = ((List)object0).iterator();
                if(!iterator0.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object object1 = iterator0.next();
                int v = ((Number)object1).intValue();
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    int v1 = ((Number)object2).intValue();
                    if(v > v1) {
                        v = v1;
                    }
                }
                Iterator iterator1 = ((List)object0).iterator();
                if(!iterator1.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object object3 = iterator1.next();
                int v2 = ((Number)object3).intValue();
                while(iterator1.hasNext()) {
                    Object object4 = iterator1.next();
                    int v3 = ((Number)object4).intValue();
                    if(v2 < v3) {
                        v2 = v3;
                    }
                }
                ((List)((ArrayList)this.y).get(this.x)).add(new b(((List)object0), new IntRange(v, v2)));
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
                int v4 = ((PagerState)this.y).getCurrentPage();
                ((GraphicsLayerScope)object0).setScaleX(MathHelpersKt.lerp(0.8f, 1.0f, 1.0f - c.coerceIn(Math.abs(((PagerState)this.y).getCurrentPageOffsetFraction() + ((float)(v4 - this.x))), 0.0f, 1.0f)));
                ((GraphicsLayerScope)object0).setScaleY(((GraphicsLayerScope)object0).getScaleX());
                return Unit.INSTANCE;
            }
            default: {
                return Boolean.valueOf(((List)object0).addAll(this.x, ((Collection)this.y)));
            }
        }
    }
}

