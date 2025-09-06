package p0;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldImplKt.CommonDecorationBox.3.WhenMappings;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextFieldType;
import androidx.compose.material3.ua;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;

public final class ib extends Lambda implements Function6 {
    public final boolean A;
    public final boolean B;
    public final InteractionSource C;
    public final Function2 D;
    public final Function2 E;
    public final TextFieldType F;
    public final Function2 G;
    public final boolean H;
    public final PaddingValues I;
    public final boolean J;
    public final Function2 K;
    public final Function2 w;
    public final Function2 x;
    public final String y;
    public final TextFieldColors z;

    public ib(Function2 function20, Function2 function21, String s, TextFieldColors textFieldColors0, boolean z, boolean z1, InteractionSource interactionSource0, Function2 function22, Function2 function23, TextFieldType textFieldType0, Function2 function24, boolean z2, PaddingValues paddingValues0, boolean z3, Function2 function25) {
        this.w = function20;
        this.x = function21;
        this.y = s;
        this.z = textFieldColors0;
        this.A = z;
        this.B = z1;
        this.C = interactionSource0;
        this.D = function22;
        this.E = function23;
        this.F = textFieldType0;
        this.G = function24;
        this.H = z2;
        this.I = paddingValues0;
        this.J = z3;
        this.K = function25;
        super(6);
    }

    @Override  // kotlin.jvm.functions.Function6
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        float f = ((Number)object0).floatValue();
        long v = ((Color)object1).unbox-impl();
        long v1 = ((Color)object2).unbox-impl();
        float f1 = ((Number)object3).floatValue();
        Composer composer0 = (Composer)object4;
        int v2 = ((Number)object5).intValue();
        int v3 = (v2 & 14) == 0 ? (composer0.changed(f) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer0.changed(v1) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer0.changed(f1) ? 0x800 : 0x400);
        }
        if((0xB6DB & v3) == 9362 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x146073D8, v3, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:119)");
        }
        ComposableLambda composableLambda0 = this.w == null ? null : ComposableLambdaKt.composableLambda(composer0, 0x15A0DC9E, true, new fb(f, v1, this.w, this.J, v));
        ComposableLambda composableLambda1 = this.x == null || this.y.length() != 0 || f1 <= 0.0f ? null : ComposableLambdaKt.composableLambda(composer0, 1120552650, true, new gb(f1, this.z, this.A, this.x));
        long v4 = ((Color)this.z.leadingIconColor(this.A, this.B, this.C, composer0, 0).getValue()).unbox-impl();
        ComposableLambda composableLambda2 = this.D == null ? null : ComposableLambdaKt.composableLambda(composer0, 0x59B977F0, true, new ua(v4, this.D, 2));
        long v5 = ((Color)this.z.trailingIconColor(this.A, this.B, this.C, composer0, 0).getValue()).unbox-impl();
        ComposableLambda composableLambda3 = this.E == null ? null : ComposableLambdaKt.composableLambda(composer0, 0x8F10C1E4, true, new ua(v5, this.E, 3));
        switch(TextFieldImplKt.CommonDecorationBox.3.WhenMappings.$EnumSwitchMapping$0[this.F.ordinal()]) {
            case 1: {
                composer0.startReplaceableGroup(0xBF6FB790);
                TextFieldKt.TextFieldLayout(Modifier.Companion, this.G, composableLambda0, composableLambda1, composableLambda2, composableLambda3, this.H, f, this.I, composer0, 0x1C00000 & v3 << 21 | 6);
                composer0.endReplaceableGroup();
                break;
            }
            case 2: {
                MutableState mutableState0 = q.h(-1083197009, composer0, 0xE2A708A4);
                Companion composer$Companion0 = Composer.Companion;
                if(mutableState0 == composer$Companion0.getEmpty()) {
                    mutableState0 = SnapshotStateKt.mutableStateOf$default(Size.box-impl(0L), null, 2, null);
                    composer0.updateRememberedValue(mutableState0);
                }
                composer0.endReplaceableGroup();
                ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer0, 0x8568183, true, new hb(mutableState0, this.I, this.K));
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                composer0.startReplaceableGroup(-1004887033);
                boolean z = composer0.changed(f);
                boolean z1 = composer0.changed(mutableState0);
                eb eb0 = composer0.rememberedValue();
                if(z || z1 || eb0 == composer$Companion0.getEmpty()) {
                    eb0 = new eb(f, mutableState0, 0);
                    composer0.updateRememberedValue(eb0);
                }
                composer0.endReplaceableGroup();
                OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier$Companion0, this.G, composableLambda1, composableLambda0, composableLambda2, composableLambda3, this.H, f, eb0, composableLambda4, this.I, composer0, v3 << 21 & 0x1C00000 | 0x30000006, 0);
                composer0.endReplaceableGroup();
                break;
            }
            default: {
                composer0.startReplaceableGroup(0xBF6FBF71);
                composer0.endReplaceableGroup();
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

