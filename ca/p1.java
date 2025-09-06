package ca;

import android.util.Range;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import com.kakao.kandinsky.designsystem.common.TickSliderOptions;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import r0.a;

public final class p1 extends Lambda implements Function1 {
    public final TickSliderOptions A;
    public final boolean B;
    public final Orientation w;
    public final ClosedFloatingPointRange x;
    public final float y;
    public final Range z;

    public p1(Orientation orientation0, ClosedFloatingPointRange closedFloatingPointRange0, float f, Range range0, TickSliderOptions tickSliderOptions0, boolean z) {
        this.w = orientation0;
        this.x = closedFloatingPointRange0;
        this.y = f;
        this.z = range0;
        this.A = tickSliderOptions0;
        this.B = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TickSliderOptions tickSliderOptions0;
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$Canvas");
        float f = Size.getHeight-impl(((DrawScope)object0).getDrawContext().getSize-NH-jbRc());
        float f1 = this.y;
        Range range0 = this.z;
        boolean z = this.B;
        long v = ((DrawScope)object0).getCenter-F1C5BW0();
        DrawContext drawContext0 = ((DrawScope)object0).getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().rotate-Uv8p0NA((this.w == Orientation.Portrait ? 0.0f : -90.0f), v);
            ((DrawScope)object0).getDrawContext().getTransform().translate(0.0f, f / 2.0f);
            try {
                IntRange intRange0 = new IntRange(((int)((Number)this.x.getStart()).floatValue()), ((int)((Number)this.x.getEndInclusive()).floatValue()));
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator0 = intRange0.iterator();
                while(true) {
                    boolean z1 = iterator0.hasNext();
                    tickSliderOptions0 = this.A;
                    if(!z1) {
                        break;
                    }
                    Object object1 = iterator0.next();
                    if(((Number)object1).intValue() % tickSliderOptions0.getDegreePerTick() == 0) {
                        arrayList0.add(object1);
                    }
                }
                KDSliderKt.access$drawSlider(((DrawScope)object0), f1, range0, arrayList0, tickSliderOptions0);
                KDSliderKt.access$drawCenterTick(((DrawScope)object0), z, tickSliderOptions0);
                return Unit.INSTANCE;
            }
            finally {
                ((DrawScope)object0).getDrawContext().getTransform().translate(-0.0f, -(f / 2.0f));
            }
        }
        finally {
            a.y(drawContext0, v1);
        }
    }
}

