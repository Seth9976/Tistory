package jb;

import androidx.compose.material3.ni;
import com.kakao.kphotopicker.PickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function0 {
    public final PickerViewModel w;
    public final Function2 x;

    public v(PickerViewModel pickerViewModel0, Function2 function20) {
        this.w = pickerViewModel0;
        this.x = function20;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ni ni0 = new ni(this.x, 4);
        this.w.requestCountOverMessage(ni0);
        return Unit.INSTANCE;
    }
}

