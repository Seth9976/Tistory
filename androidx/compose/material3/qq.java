package androidx.compose.material3;

import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.BasicTooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.window.PopupPositionProvider;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class qq extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Function C;
    public final int w;
    public final boolean x;
    public final Object y;
    public final int z;

    public qq(Modifier modifier0, boolean z, TextFieldValue textFieldValue0, Function1 function10, Function0 function00, int v) {
        this.w = 1;
        this.A = modifier0;
        this.x = z;
        this.B = textFieldValue0;
        this.C = function10;
        this.y = function00;
        this.z = v;
        super(2);
    }

    public qq(PopupPositionProvider popupPositionProvider0, Object object0, CoroutineScope coroutineScope0, boolean z, Function2 function20, int v, int v1) {
        this.w = v1;
        this.A = popupPositionProvider0;
        this.y = object0;
        this.B = coroutineScope0;
        this.x = z;
        this.C = function20;
        this.z = v;
        super(2);
    }

    public qq(boolean z, Shape shape0, Function0 function00, TimePickerColors timePickerColors0, Function3 function30, int v) {
        this.w = 0;
        this.x = z;
        this.A = shape0;
        this.y = function00;
        this.B = timePickerColors0;
        this.C = function30;
        this.z = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                TimePickerKt.g(this.x, ((Shape)this.A), ((Function0)this.y), ((TimePickerColors)this.B), ((Function3)this.C), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ReSizeScreenKt.access$CustomTypeToolbar(((Modifier)this.A), this.x, ((TextFieldValue)this.B), ((Function1)this.C), ((Function0)this.y), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                BasicTooltip_androidKt.a(((PopupPositionProvider)this.A), ((BasicTooltipState)this.y), ((CoroutineScope)this.B), this.x, ((Function2)this.C), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                androidx.compose.material3.internal.BasicTooltip_androidKt.a(((PopupPositionProvider)this.A), ((TooltipState)this.y), ((CoroutineScope)this.B), this.x, ((Function2)this.C), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

