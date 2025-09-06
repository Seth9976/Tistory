package x9;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import com.kakao.kandinsky.crop.CropScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final int w;
    public final Function1 x;
    public final State y;

    public a(Function1 function10, State state0, int v) {
        this.w = v;
        this.x = function10;
        this.y = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            this.x.invoke(Boolean.FALSE);
            CropScreenKt.access$CropScreen$lambda$0(this.y).getOnMove().invoke(Offset.box-impl(((Offset)object0).unbox-impl()));
            return Unit.INSTANCE;
        }
        this.x.invoke(Boolean.FALSE);
        CropScreenKt.access$CropScreen$lambda$0(this.y).getOnZoom().invoke(((Number)object0).floatValue());
        return Unit.INSTANCE;
    }
}

