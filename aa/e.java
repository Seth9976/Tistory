package aa;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.material.DismissDirection;
import androidx.compose.material.DismissValue;
import androidx.compose.material.SwipeToDismissKt;
import androidx.compose.material.ThresholdConfig;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.crop.contract.CropRatioTypeKt;
import com.kakao.kandinsky.filter.contract.MenuKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.p;

public final class e extends Lambda implements Function2 {
    public final int w;
    public final Function1 x;

    public e(Function1 function10, int v) {
        this.w = v;
        this.x = function10;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((PointerInputChange)object0), "<anonymous parameter 0>");
                Offset offset0 = Offset.box-impl(((Offset)object1).unbox-impl());
                this.x.invoke(offset0);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                return GridItemSpan.box-impl(((GridItemSpan)this.x.invoke(((LazyGridItemSpanScope)object0))).unbox-impl());
            }
            case 2: {
                TextData textData0 = (TextData)object0;
                ((Boolean)object1).booleanValue();
                Intrinsics.checkNotNullParameter(textData0, "textData");
                if(p.isBlank(textData0.getText())) {
                    textData0 = null;
                }
                this.x.invoke(textData0);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Boolean)object0).booleanValue();
                Object object3 = MenuKt.getEffectMenuList().get(((Number)object1).intValue());
                this.x.invoke(object3);
                return Unit.INSTANCE;
            }
            case 4: {
                DismissDirection dismissDirection0 = SwipeToDismissKt.access$getDismissDirection(((DismissValue)object0), ((DismissValue)object1));
                Intrinsics.checkNotNull(dismissDirection0);
                return (ThresholdConfig)this.x.invoke(dismissDirection0);
            }
            case 5: {
                Unit unit0 = (Unit)object1;
                this.x.invoke(object0);
                return Unit.INSTANCE;
            }
            case 6: {
                Unit unit1 = (Unit)object1;
                this.x.invoke(object0);
                return Unit.INSTANCE;
            }
            case 7: {
                Offset offset1 = Offset.box-impl(((PointerInputChange)object0).getPosition-F1C5BW0());
                this.x.invoke(offset1);
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object1).intValue();
                if(!((Boolean)object0).booleanValue()) {
                    Object object2 = CropRatioTypeKt.getCropRatioTypeList().get(v);
                    this.x.invoke(object2);
                }
                return Unit.INSTANCE;
            }
        }
    }
}

