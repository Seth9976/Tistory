package androidx.compose.material3;

import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.BasicTooltip_androidKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.window.PopupPositionProvider;
import com.kakao.kandinsky.crop.ui.CropBoxKt;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import com.kakao.kandinsky.designsystem.common.KDToggleButtonColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class gb extends Lambda implements Function2 {
    public final Function2 A;
    public final boolean B;
    public final Object C;
    public final int D;
    public final int E;
    public final Object F;
    public final int w;
    public final boolean x;
    public final Object y;
    public final Object z;

    public gb(Rect rect0, boolean z, boolean z1, Function1 function10, Function1 function11, Function2 function20, Function0 function00, int v, int v1) {
        this.w = 6;
        this.z = rect0;
        this.x = z;
        this.B = z1;
        this.y = function10;
        this.F = function11;
        this.A = function20;
        this.C = function00;
        this.D = v;
        this.E = v1;
        super(2);
    }

    public gb(PopupPositionProvider popupPositionProvider0, Function2 function20, Object object0, Modifier modifier0, boolean z, boolean z1, Function2 function21, int v, int v1, int v2) {
        this.w = v2;
        this.y = popupPositionProvider0;
        this.A = function20;
        this.F = object0;
        this.z = modifier0;
        this.x = z;
        this.B = z1;
        this.C = function21;
        this.D = v;
        this.E = v1;
        super(2);
    }

    public gb(PopupPositionProvider popupPositionProvider0, Function3 function30, TooltipState tooltipState0, Modifier modifier0, boolean z, boolean z1, Function2 function20, int v, int v1) {
        this.w = 2;
        this.y = popupPositionProvider0;
        this.F = function30;
        this.C = tooltipState0;
        this.z = modifier0;
        this.x = z;
        this.B = z1;
        this.A = function20;
        this.D = v;
        this.E = v1;
        super(2);
    }

    public gb(boolean z, Function1 function10, Modifier modifier0, Function2 function20, boolean z1, SwitchColors switchColors0, MutableInteractionSource mutableInteractionSource0, int v, int v1) {
        this.w = 1;
        this.x = z;
        this.y = function10;
        this.z = modifier0;
        this.A = function20;
        this.B = z1;
        this.F = switchColors0;
        this.C = mutableInteractionSource0;
        this.D = v;
        this.E = v1;
        super(2);
    }

    public gb(boolean z, Function1 function10, Modifier modifier0, boolean z1, Object object0, MutableInteractionSource mutableInteractionSource0, Function2 function20, int v, int v1, int v2) {
        this.w = v2;
        this.x = z;
        this.y = function10;
        this.z = modifier0;
        this.B = z1;
        this.F = object0;
        this.C = mutableInteractionSource0;
        this.A = function20;
        this.D = v;
        this.E = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                IconButtonKt.IconToggleButton(this.x, ((Function1)this.y), ((Modifier)this.z), this.B, ((IconToggleButtonColors)this.F), ((MutableInteractionSource)this.C), this.A, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                SwitchKt.Switch(this.x, ((Function1)this.y), ((Modifier)this.z), this.A, this.B, ((SwitchColors)this.F), ((MutableInteractionSource)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                TooltipKt.TooltipBox(((PopupPositionProvider)this.y), ((Function3)this.F), ((TooltipState)this.C), ((Modifier)this.z), this.x, this.B, this.A, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                KDButtonKt.KDIconToggleButton(this.x, ((Function1)this.y), ((Modifier)this.z), this.B, ((KDToggleButtonColors)this.F), ((MutableInteractionSource)this.C), this.A, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                BasicTooltip_androidKt.BasicTooltipBox(((PopupPositionProvider)this.y), this.A, ((BasicTooltipState)this.F), ((Modifier)this.z), this.x, this.B, ((Function2)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                androidx.compose.material3.internal.BasicTooltip_androidKt.BasicTooltipBox(((PopupPositionProvider)this.y), this.A, ((TooltipState)this.F), ((Modifier)this.z), this.x, this.B, ((Function2)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                CropBoxKt.CropBox(((Rect)this.z), this.x, this.B, ((Function1)this.y), ((Function1)this.F), this.A, ((Function0)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
        }
    }
}

