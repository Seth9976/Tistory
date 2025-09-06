package m0;

import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.NonMeasureInputs.Companion.mutationPolicy.1;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.NonMeasureInputs.Companion;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.text.TextStyle;
import r0.a;

public final class c1 {
    public final TransformedTextFieldState a;
    public final TextStyle b;
    public final boolean c;
    public final boolean d;
    public static final TextFieldLayoutStateCache.NonMeasureInputs.Companion e;
    public static final TextFieldLayoutStateCache.NonMeasureInputs.Companion.mutationPolicy.1 f;

    static {
        c1.e = new TextFieldLayoutStateCache.NonMeasureInputs.Companion(null);
        c1.f = new TextFieldLayoutStateCache.NonMeasureInputs.Companion.mutationPolicy.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public c1(TransformedTextFieldState transformedTextFieldState0, TextStyle textStyle0, boolean z, boolean z1) {
        this.a = transformedTextFieldState0;
        this.b = textStyle0;
        this.c = z;
        this.d = z1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NonMeasureInputs(textFieldState=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", textStyle=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", singleLine=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", softWrap=");
        return a.p(stringBuilder0, this.d, ')');
    }
}

