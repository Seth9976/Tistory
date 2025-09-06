package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ChipColors;
import androidx.compose.material.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.kakao.kandinsky.designsystem.common.KDButtonColors;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function2 {
    public final Modifier A;
    public final Object B;
    public final Object C;
    public final MutableInteractionSource D;
    public final int E;
    public final int F;
    public final Object G;
    public final Object H;
    public final int w;
    public final Object x;
    public final boolean y;
    public final Function z;

    public y(RangeSliderState rangeSliderState0, Modifier modifier0, boolean z, SliderColors sliderColors0, MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, Function3 function30, Function3 function31, Function3 function32, int v, int v1) {
        this.w = 2;
        this.x = rangeSliderState0;
        this.A = modifier0;
        this.y = z;
        this.B = sliderColors0;
        this.D = mutableInteractionSource0;
        this.C = mutableInteractionSource1;
        this.z = function30;
        this.G = function31;
        this.H = function32;
        this.E = v;
        this.F = v1;
        super(2);
    }

    public y(Function0 function00, Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, Shape shape0, BorderStroke borderStroke0, ChipColors chipColors0, Function2 function20, Function3 function30, int v, int v1) {
        this.w = 4;
        this.z = function00;
        this.A = modifier0;
        this.y = z;
        this.D = mutableInteractionSource0;
        this.B = shape0;
        this.C = borderStroke0;
        this.G = chipColors0;
        this.x = function20;
        this.H = function30;
        this.E = v;
        this.F = v1;
        super(2);
    }

    public y(Function0 function00, Modifier modifier0, boolean z, Shape shape0, KDButtonColors kDButtonColors0, BorderStroke borderStroke0, PaddingValues paddingValues0, MutableInteractionSource mutableInteractionSource0, Function3 function30, int v, int v1) {
        this.w = 3;
        this.z = function00;
        this.A = modifier0;
        this.y = z;
        this.x = shape0;
        this.B = kDButtonColors0;
        this.C = borderStroke0;
        this.H = paddingValues0;
        this.D = mutableInteractionSource0;
        this.G = function30;
        this.E = v;
        this.F = v1;
        super(2);
    }

    public y(Function2 function20, Function0 function00, Modifier modifier0, Function2 function21, Function2 function22, boolean z, MenuItemColors menuItemColors0, PaddingValues paddingValues0, MutableInteractionSource mutableInteractionSource0, int v, int v1) {
        this.w = 0;
        this.x = function20;
        this.z = function00;
        this.A = modifier0;
        this.B = function21;
        this.C = function22;
        this.y = z;
        this.G = menuItemColors0;
        this.H = paddingValues0;
        this.D = mutableInteractionSource0;
        this.E = v;
        this.F = v1;
        super(2);
    }

    public y(Function2 function20, boolean z, Function0 function00, Modifier modifier0, Function2 function21, Function2 function22, Shape shape0, NavigationDrawerItemColors navigationDrawerItemColors0, MutableInteractionSource mutableInteractionSource0, int v, int v1) {
        this.w = 1;
        this.x = function20;
        this.y = z;
        this.z = function00;
        this.A = modifier0;
        this.B = function21;
        this.C = function22;
        this.G = shape0;
        this.H = navigationDrawerItemColors0;
        this.D = mutableInteractionSource0;
        this.E = v;
        this.F = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                AndroidMenu_androidKt.DropdownMenuItem(((Function2)this.x), ((Function0)this.z), this.A, ((Function2)this.B), ((Function2)this.C), this.y, ((MenuItemColors)this.G), ((PaddingValues)this.H), this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                NavigationDrawerKt.NavigationDrawerItem(((Function2)this.x), this.y, ((Function0)this.z), this.A, ((Function2)this.B), ((Function2)this.C), ((Shape)this.G), ((NavigationDrawerItemColors)this.H), this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                SliderKt.RangeSlider(((RangeSliderState)this.x), this.A, this.y, ((SliderColors)this.B), this.D, ((MutableInteractionSource)this.C), ((Function3)this.z), ((Function3)this.G), ((Function3)this.H), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                KDButtonKt.KDButton(((Function0)this.z), this.A, this.y, ((Shape)this.x), ((KDButtonColors)this.B), ((BorderStroke)this.C), ((PaddingValues)this.H), this.D, ((Function3)this.G), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ChipKt.Chip(((Function0)this.z), this.A, this.y, this.D, ((Shape)this.B), ((BorderStroke)this.C), ((ChipColors)this.G), ((Function2)this.x), ((Function3)this.H), ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
        }
    }
}

