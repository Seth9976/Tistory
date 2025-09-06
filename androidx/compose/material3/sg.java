package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class sg extends Lambda implements Function2 {
    public final Modifier A;
    public final TextFieldColors B;
    public final Shape C;
    public final float D;
    public final float E;
    public final int F;
    public final int G;
    public final Object H;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final InteractionSource z;

    public sg(Object object0, boolean z, boolean z1, InteractionSource interactionSource0, Modifier modifier0, TextFieldColors textFieldColors0, Shape shape0, float f, float f1, int v, int v1, int v2) {
        this.w = v2;
        this.H = object0;
        this.x = z;
        this.y = z1;
        this.z = interactionSource0;
        this.A = modifier0;
        this.B = textFieldColors0;
        this.C = shape0;
        this.D = f;
        this.E = f1;
        this.F = v;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ((TextFieldDefaults)this.H).Container-4EFweAY(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.F | 1), this.G);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ((OutlinedTextFieldDefaults)this.H).Container-4EFweAY(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.F | 1), this.G);
        return Unit.INSTANCE;
    }
}

