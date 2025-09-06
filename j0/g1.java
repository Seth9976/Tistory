package j0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function3 {
    public static final g1 A;
    public static final g1 B;
    public final int w;
    public static final g1 x;
    public static final g1 y;
    public static final g1 z;

    static {
        g1.x = new g1(3, 0);
        g1.y = new g1(3, 1);
        g1.z = new g1(3, 2);
        g1.A = new g1(3, 3);
        g1.B = new g1(3, 4);
    }

    public g1(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.w) {
            case 0: {
                int v1 = ((Number)object2).intValue();
                if((v1 & 6) == 0) {
                    v1 |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
                }
                if((v1 & 19) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x3B79C49C, v1, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-1.<anonymous> (BasicTextField.kt:610)");
                }
                ((Function2)object0).invoke(((Composer)object1), ((int)(v1 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object2).intValue();
                if((v2 & 6) == 0) {
                    v2 |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
                }
                if((v2 & 19) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x7D8127EF, v2, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-2.<anonymous> (BasicTextField.kt:762)");
                }
                ((Function2)object0).invoke(((Composer)object1), ((int)(v2 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v3 = ((Number)object2).intValue();
                if((v3 & 6) == 0) {
                    v3 |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
                }
                if((v3 & 19) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x19E074DF, v3, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-3.<anonymous> (BasicTextField.kt:806)");
                }
                ((Function2)object0).invoke(((Composer)object1), ((int)(v3 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 3: {
                int v4 = ((Number)object2).intValue();
                if((v4 & 6) == 0) {
                    v4 |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
                }
                if((v4 & 19) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xFDEC79B2, v4, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-4.<anonymous> (BasicTextField.kt:846)");
                }
                ((Function2)object0).invoke(((Composer)object1), ((int)(v4 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object2).intValue();
                if((v & 6) == 0) {
                    v |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
                }
                if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x2803267D, v, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:219)");
                }
                ((Function2)object0).invoke(((Composer)object1), ((int)(v & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

