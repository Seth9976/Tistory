package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class j5 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final Shape w;
    public final DatePickerColors x;
    public final float y;
    public final Function3 z;

    public j5(Shape shape0, DatePickerColors datePickerColors0, float f, Function3 function30, Function2 function20, Function2 function21) {
        this.w = shape0;
        this.x = datePickerColors0;
        this.y = f;
        this.z = function30;
        this.A = function20;
        this.B = function21;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-10625622, v, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:82)");
        }
        Modifier modifier0 = SizeKt.heightIn-VpY3zN4$default(SizeKt.requiredWidth-3ABfNKs(Modifier.Companion, 0.0f), 0.0f, 0.0f, 1, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-1706202235, true, new i5(this.A, this.B, this.z), ((Composer)object0), 54);
        SurfaceKt.Surface-T9BRK9s(modifier0, this.w, this.x.getContainerColor-0d7_KjU(), 0L, this.y, 0.0f, null, composableLambda0, ((Composer)object0), 0xC00006, 104);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

