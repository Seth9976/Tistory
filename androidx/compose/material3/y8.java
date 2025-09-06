package androidx.compose.material3;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y8 extends Lambda implements Function1 {
    public final int w;
    public final float x;
    public final long y;

    public y8(long v, float f) {
        this.w = 2;
        this.y = v;
        this.x = f;
        super(1);
    }

    public y8(long v, float f, int v1) {
        this.w = v1;
        this.x = f;
        this.y = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                float f3 = ((DrawScope)object0).toPx-0680j_4(this.x);
                long v3 = OffsetKt.Offset(0.0f, ((DrawScope)object0).toPx-0680j_4(this.x) / 2.0f);
                long v4 = OffsetKt.Offset(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()), ((DrawScope)object0).toPx-0680j_4(this.x) / 2.0f);
                DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), this.y, v3, v4, f3, 0, null, 0.0f, null, 0, 0x1F0, null);
                return Unit.INSTANCE;
            }
            case 1: {
                float f4 = ((DrawScope)object0).toPx-0680j_4(this.x);
                long v5 = OffsetKt.Offset(((DrawScope)object0).toPx-0680j_4(this.x) / 2.0f, 0.0f);
                long v6 = OffsetKt.Offset(((DrawScope)object0).toPx-0680j_4(this.x) / 2.0f, Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()));
                DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), this.y, v5, v6, f4, 0, null, 0.0f, null, 0, 0x1F0, null);
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$drawBehind");
                long v7 = OffsetKt.Offset(0.0f, Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()) - this.x);
                DrawScope.drawRect-n-J9OG0$default(((DrawScope)object0), this.y, v7, 0L, 0.0f, null, null, 0, 0x7C, null);
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postRotate(-this.x, Offset.getX-impl(this.y), Offset.getY-impl(this.y));
                return Unit.INSTANCE;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postRotate(-this.x, Offset.getX-impl(this.y), Offset.getY-impl(this.y));
                return Unit.INSTANCE;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postRotate(this.x, Offset.getX-impl(this.y), Offset.getY-impl(this.y));
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$drawBehind");
                float f = ((DrawScope)object0).toPx-0680j_4(this.x);
                for(int v = 0; v < 2; ++v) {
                    float f1 = Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()) * ((float)(v + 1)) / 3.0f;
                    long v1 = OffsetKt.Offset(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()), f1);
                    DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), this.y, OffsetKt.Offset(0.0f, f1), v1, f, 0, null, 0.0f, null, 0, 0x1F0, null);
                    float f2 = Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()) * ((float)(v + 1)) / 3.0f;
                    long v2 = OffsetKt.Offset(f2, Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()));
                    DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), this.y, OffsetKt.Offset(f2, 0.0f), v2, f, 0, null, 0.0f, null, 0, 0x1F0, null);
                }
                return Unit.INSTANCE;
            }
        }
    }
}

