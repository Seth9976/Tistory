package aa;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.core.graphics.MatrixKt;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public final long x;
    public final Function0 y;

    public b(long v, Function0 function00) {
        this.w = 0;
        this.y = function00;
        this.x = v;
        super(1);
    }

    public b(long v, Function0 function00, int v1) {
        this.w = v1;
        this.x = v;
        this.y = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                long v = ((Offset)this.y.invoke()).unbox-impl();
                return Size.box-impl(RectExtensionKt.mapRect(MatrixKt.scaleMatrix(Offset.getX-impl(v), Offset.getY-impl(v)), SizeKt.toRect-uvyYCjk(this.x)).getSize-NH-jbRc());
            }
            case 1: {
                float f1 = ((Number)this.y.invoke()).floatValue();
                DrawScope.drawRect-n-J9OG0$default(((DrawScope)object0), this.x, 0L, 0L, f1, null, null, 0, 0x76, null);
                return Unit.INSTANCE;
            }
            default: {
                float f = ((Number)this.y.invoke()).floatValue();
                DrawScope.drawRect-n-J9OG0$default(((DrawScope)object0), this.x, 0L, 0L, f, null, null, 0, 0x76, null);
                return Unit.INSTANCE;
            }
        }
    }
}

