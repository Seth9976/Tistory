package androidx.compose.material3;

import a4.c;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p0.f2;

public final class e3 extends Lambda implements Function1 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public e3(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, int v) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        this.A = object3;
        this.B = object4;
        this.C = object5;
        super(1);
    }

    public e3(f2 f20, State state0, State state1, State state2, State state3, State state4) {
        this.w = 2;
        this.C = f20;
        this.x = state0;
        this.y = state1;
        this.z = state2;
        this.A = state3;
        this.B = state4;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                float f1 = (float)Math.floor(((DrawScope)object0).toPx-0680j_4(2.0f));
                CheckboxKt.access$drawBox-1wkBAMs(((DrawScope)object0), ((Color)((State)this.x).getValue()).unbox-impl(), ((Color)((State)this.y).getValue()).unbox-impl(), ((DrawScope)object0).toPx-0680j_4(2.0f), f1);
                CheckboxKt.access$drawCheck-3IgeMak(((DrawScope)object0), ((Color)((State)this.z).getValue()).unbox-impl(), ((Number)((State)this.A).getValue()).floatValue(), ((Number)((State)this.B).getValue()).floatValue(), f1, ((b3)this.C));
                return Unit.INSTANCE;
            }
            case 1: {
                c c0 = new c(((Function0)this.B), 1);
                SemanticsPropertiesKt.dismiss(((SemanticsPropertyReceiver)object0), ((String)this.y), c0);
                SheetState sheetState0 = (SheetState)this.x;
                SheetValue sheetValue0 = sheetState0.getCurrentValue();
                CoroutineScope coroutineScope0 = (CoroutineScope)this.C;
                if(sheetValue0 == SheetValue.PartiallyExpanded) {
                    td td0 = new td(sheetState0, coroutineScope0, 1, sheetState0);
                    SemanticsPropertiesKt.expand(((SemanticsPropertyReceiver)object0), ((String)this.z), td0);
                    return Unit.INSTANCE;
                }
                if(sheetState0.getHasPartiallyExpandedState()) {
                    z1 z10 = new z1(sheetState0, coroutineScope0);
                    SemanticsPropertiesKt.collapse(((SemanticsPropertyReceiver)object0), ((String)this.A), z10);
                }
                return Unit.INSTANCE;
            }
            default: {
                float f = (float)Math.floor(((DrawScope)object0).toPx-0680j_4(2.0f));
                androidx.compose.material.CheckboxKt.access$drawBox-1wkBAMs(((DrawScope)object0), androidx.compose.material.CheckboxKt.access$CheckboxImpl$lambda$9(((State)this.x)), androidx.compose.material.CheckboxKt.access$CheckboxImpl$lambda$10(((State)this.y)), ((DrawScope)object0).toPx-0680j_4(2.0f), f);
                androidx.compose.material.CheckboxKt.access$drawCheck-3IgeMak(((DrawScope)object0), androidx.compose.material.CheckboxKt.access$CheckboxImpl$lambda$8(((State)this.z)), androidx.compose.material.CheckboxKt.access$CheckboxImpl$lambda$4(((State)this.A)), androidx.compose.material.CheckboxKt.access$CheckboxImpl$lambda$6(((State)this.B)), f, ((f2)this.C));
                return Unit.INSTANCE;
            }
        }
    }
}

