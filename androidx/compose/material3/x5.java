package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.kakao.kandinsky.base.ConsumeDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x5 extends Lambda implements Function0 {
    public final int w;
    public final MutableState x;

    public x5(MutableState mutableState0, int v) {
        this.w = v;
        this.x = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                boolean z = DatePickerKt.access$DatePickerContent$lambda$8(this.x);
                DatePickerKt.access$DatePickerContent$lambda$9(this.x, !z);
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.setValue(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            case 2: {
                return (LayoutCoordinates)this.x.getValue();
            }
            default: {
                ConsumeDialogKt.access$ConsumeDialog$lambda$3(this.x, false);
                return Unit.INSTANCE;
            }
        }
    }
}

