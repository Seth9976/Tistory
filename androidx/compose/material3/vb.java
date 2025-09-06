package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class vb extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final Object C;
    public final Object D;
    public final int w;
    public final Object x;
    public final Object y;
    public final boolean z;

    public vb(SliderDefaults sliderDefaults0, Object object0, Modifier modifier0, SliderColors sliderColors0, boolean z, int v, int v1, int v2) {
        this.w = v2;
        this.C = sliderDefaults0;
        this.D = object0;
        this.y = modifier0;
        this.x = sliderColors0;
        this.z = z;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public vb(Modifier modifier0, boolean z, TextFieldValue textFieldValue0, Function1 function10, Function0 function00, int v, int v1) {
        this.w = 7;
        this.y = modifier0;
        this.z = z;
        this.C = textFieldValue0;
        this.D = function10;
        this.x = function00;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public vb(Function0 function00, Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, Function2 function20, int v, int v1) {
        this.w = 6;
        this.C = function00;
        this.y = modifier0;
        this.z = z;
        this.D = mutableInteractionSource0;
        this.x = function20;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public vb(Function2 function20, Modifier modifier0, DrawerState drawerState0, boolean z, Function2 function21, int v, int v1) {
        this.w = 1;
        this.x = function20;
        this.y = modifier0;
        this.C = drawerState0;
        this.z = z;
        this.D = function21;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public vb(Function3 function30, Modifier modifier0, MutableInteractionSource mutableInteractionSource0, boolean z, Function2 function20, int v, int v1) {
        this.w = 0;
        this.C = function30;
        this.y = modifier0;
        this.D = mutableInteractionSource0;
        this.z = z;
        this.x = function20;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public vb(boolean z, Function0 function00, Function0 function01, Function0 function02, Function2 function20, int v, int v1) {
        this.w = 5;
        this.z = z;
        this.C = function00;
        this.y = function01;
        this.D = function02;
        this.x = function20;
        this.A = v;
        this.B = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                LabelKt.Label(((Function3)this.C), ((Modifier)this.y), ((MutableInteractionSource)this.D), this.z, ((Function2)this.x), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                NavigationDrawerKt.DismissibleNavigationDrawer(((Function2)this.x), ((Modifier)this.y), ((DrawerState)this.C), this.z, ((Function2)this.D), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                ((SliderDefaults)this.C).Track(((SliderPositions)this.D), ((Modifier)this.y), ((SliderColors)this.x), this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                ((SliderDefaults)this.C).Track(((SliderState)this.D), ((Modifier)this.y), ((SliderColors)this.x), this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                ((SliderDefaults)this.C).Track(((RangeSliderState)this.D), ((Modifier)this.y), ((SliderColors)this.x), this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                FeatureBottomBarKt.CommonFeatureBottomBar(this.z, ((Function0)this.C), ((Function0)this.y), ((Function0)this.D), ((Function2)this.x), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 6: {
                ((Number)object1).intValue();
                IconButtonKt.IconButton(((Function0)this.C), ((Modifier)this.y), this.z, ((MutableInteractionSource)this.D), ((Function2)this.x), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ReSizeScreenKt.access$CustomSizeInputField(((Modifier)this.y), this.z, ((TextFieldValue)this.C), ((Function1)this.D), ((Function0)this.x), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
        }
    }
}

