package androidx.compose.ui.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.Ref.IntRef;

public final class h extends Lambda implements Function1 {
    public final long w;
    public final float[] x;
    public final IntRef y;
    public final FloatRef z;

    public h(long v, float[] arr_f, IntRef ref$IntRef0, FloatRef ref$FloatRef0) {
        this.w = v;
        this.x = arr_f;
        this.y = ref$IntRef0;
        this.z = ref$FloatRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        FloatRef ref$FloatRef0;
        long v = TextRangeKt.TextRange(((ParagraphInfo)object0).toLocalIndex((((ParagraphInfo)object0).getStartIndex() <= TextRange.getMin-impl(this.w) ? TextRange.getMin-impl(this.w) : ((ParagraphInfo)object0).getStartIndex())), ((ParagraphInfo)object0).toLocalIndex((((ParagraphInfo)object0).getEndIndex() >= TextRange.getMax-impl(this.w) ? TextRange.getMax-impl(this.w) : ((ParagraphInfo)object0).getEndIndex())));
        IntRef ref$IntRef0 = this.y;
        float[] arr_f = this.x;
        ((ParagraphInfo)object0).getParagraph().fillBoundingBoxes-8ffj60Q(v, arr_f, ref$IntRef0.element);
        int v1 = TextRange.getLength-impl(v) * 4 + ref$IntRef0.element;
        for(int v2 = ref$IntRef0.element; true; v2 += 4) {
            ref$FloatRef0 = this.z;
            if(v2 >= v1) {
                break;
            }
            float f = ref$FloatRef0.element;
            arr_f[v2 + 1] += f;
            arr_f[v2 + 3] += f;
        }
        ref$IntRef0.element = v1;
        float f1 = ref$FloatRef0.element;
        ref$FloatRef0.element = ((ParagraphInfo)object0).getParagraph().getHeight() + f1;
        return Unit.INSTANCE;
    }
}

