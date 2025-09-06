package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class wg extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final Object z;

    public wg(NavigationItemColors navigationItemColors0, boolean z, boolean z1, TextStyle textStyle0, Function2 function20) {
        this.w = 2;
        this.z = navigationItemColors0;
        this.x = z;
        this.y = z1;
        this.A = textStyle0;
        this.B = function20;
        super(2);
    }

    public wg(boolean z, boolean z1, MutableInteractionSource mutableInteractionSource0, TextFieldColors textFieldColors0, Shape shape0, int v) {
        this.w = v;
        this.x = z;
        this.y = z1;
        this.z = mutableInteractionSource0;
        this.A = textFieldColors0;
        this.B = shape0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2108828640, v1, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                }
                OutlinedTextFieldDefaults.INSTANCE.Container-4EFweAY(this.x, this.y, ((MutableInteractionSource)this.z), null, ((TextFieldColors)this.A), ((Shape)this.B), 0.0f, 0.0f, ((Composer)object0), 0x6000000, 200);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xF3BB32D, v2, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                }
                OutlinedTextFieldDefaults.INSTANCE.Container-4EFweAY(this.x, this.y, ((MutableInteractionSource)this.z), null, ((TextFieldColors)this.A), ((Shape)this.B), 0.0f, 0.0f, ((Composer)object0), 0x6000000, 200);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-254668050, v, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:272)");
                }
                ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(((NavigationItemColors)this.z).textColor-WaAFU9c(this.x, this.y), ((TextStyle)this.A), ((Function2)this.B), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

