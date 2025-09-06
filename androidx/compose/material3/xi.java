package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class xi extends Lambda implements Function3 {
    public final Function2 A;
    public final Function2 B;
    public final TextFieldColors C;
    public final String w;
    public final boolean x;
    public final MutableInteractionSource y;
    public final Function2 z;

    public xi(String s, boolean z, MutableInteractionSource mutableInteractionSource0, Function2 function20, Function2 function21, Function2 function22, TextFieldColors textFieldColors0) {
        this.w = s;
        this.x = z;
        this.y = mutableInteractionSource0;
        this.z = function20;
        this.A = function21;
        this.B = function22;
        this.C = textFieldColors0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2029278807, v, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.android.kt:541)");
        }
        ((Composer)object1).startReplaceGroup(-1102017390);
        ComposableLambda composableLambda0 = this.A == null ? null : ComposableLambdaKt.rememberComposableLambda(-1401341985, true, new vi(this.A), ((Composer)object1), 54);
        ((Composer)object1).endReplaceGroup();
        ((Composer)object1).startReplaceGroup(-1102010155);
        ComposableLambda composableLambda1 = this.B == null ? null : ComposableLambdaKt.rememberComposableLambda(907752083, true, new wi(this.B), ((Composer)object1), 54);
        ((Composer)object1).endReplaceGroup();
        Shape shape0 = SearchBarDefaults.INSTANCE.getInputFieldShape(((Composer)object1), 6);
        PaddingValues paddingValues0 = TextFieldDefaults.contentPaddingWithoutLabel-a9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        TextFieldDefaults.INSTANCE.DecorationBox(this.w, ((Function2)object0), this.x, true, VisualTransformation.Companion.getNone(), this.y, false, null, this.z, composableLambda0, composableLambda1, null, null, null, shape0, this.C, paddingValues0, ComposableSingletons.SearchBar_androidKt.INSTANCE.getLambda-1$material3_release(), ((Composer)object1), v << 3 & 0x70 | 0x6C00, 0x6C00000, 0x38C0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

