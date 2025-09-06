package ca;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function2 {
    public final MutableInteractionSource A;
    public final boolean B;
    public final Function0 C;
    public final PaddingValues D;
    public final Function3 E;
    public final Modifier w;
    public final BorderStroke x;
    public final Shape y;
    public final long z;

    public h1(Modifier modifier0, BorderStroke borderStroke0, Shape shape0, long v, MutableInteractionSource mutableInteractionSource0, boolean z, Function0 function00, PaddingValues paddingValues0, Function3 function30) {
        this.w = modifier0;
        this.x = borderStroke0;
        this.y = shape0;
        this.z = v;
        this.A = mutableInteractionSource0;
        this.B = z;
        this.C = function00;
        this.D = paddingValues0;
        this.E = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x127C53FC, v, -1, "com.kakao.kandinsky.designsystem.common.KDButton.<anonymous> (KDButton.kt:36)");
        }
        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(((Composer)object0), MaterialTheme.$stable).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(1270533419, true, new g1(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E), ((Composer)object0), 54), ((Composer)object0), 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

