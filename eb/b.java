package eb;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.filter.ui.EffectSliderKt;
import com.kakao.kandinsky.filter.ui.FilterSliderKt;
import com.kakao.kandinsky.textedit.contract.InputState;
import com.kakao.kandinsky.textedit.ui.ColorPanelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final int w;
    public final float x;
    public final Function2 y;
    public final int z;

    public b(InputState inputState0, InputState inputState1, float f, Function2 function20, int v) {
        this.w = 0;
        this.A = inputState0;
        this.B = inputState1;
        this.x = f;
        this.y = function20;
        this.z = v;
        super(2);
    }

    public b(Object object0, float f, Function1 function10, Function2 function20, int v, int v1) {
        this.w = v1;
        this.A = object0;
        this.x = f;
        this.B = function10;
        this.y = function20;
        this.z = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ColorPanelKt.ColorPanel(((InputState)this.A), ((InputState)this.B), this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                EffectSliderKt.EffectSlider(((EffectMenu)this.A), this.x, ((Function1)this.B), this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                FilterSliderKt.FilterSlider(((Filter)this.A), this.x, ((Function1)this.B), this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

