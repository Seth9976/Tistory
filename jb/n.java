package jb;

import com.kakao.kphotopicker.PickerFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public final int w;
    public final PickerFragment x;

    public n(PickerFragment pickerFragment0, int v) {
        this.w = v;
        this.x = pickerFragment0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            this.x.showMaxCountOver(((Number)object0).intValue(), ((Number)object1).intValue());
            return Unit.INSTANCE;
        }
        this.x.showMaxCountOver(((Number)object0).intValue(), ((Number)object1).intValue());
        return Unit.INSTANCE;
    }
}

