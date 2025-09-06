package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.ListItemKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import cb.h;
import com.kakao.kandinsky.textedit.TextEditorKt;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class t5 extends Lambda implements Function2 {
    public final Object A;
    public final boolean B;
    public final Object C;
    public final int D;
    public final int E;
    public final Object F;
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public t5(SliderState sliderState0, Modifier modifier0, boolean z, SliderColors sliderColors0, MutableInteractionSource mutableInteractionSource0, Function3 function30, Function3 function31, int v, int v1) {
        this.w = 2;
        this.F = sliderState0;
        this.x = modifier0;
        this.B = z;
        this.y = sliderColors0;
        this.z = mutableInteractionSource0;
        this.A = function30;
        this.C = function31;
        this.D = v;
        this.E = v1;
        super(2);
    }

    public t5(Modifier modifier0, Function2 function20, Function2 function21, boolean z, Function2 function22, Function2 function23, Function2 function24, int v, int v1) {
        this.w = 4;
        this.x = modifier0;
        this.z = function20;
        this.A = function21;
        this.B = z;
        this.F = function22;
        this.y = function23;
        this.C = function24;
        this.D = v;
        this.E = v1;
        super(2);
    }

    public t5(Object object0, Modifier modifier0, DatePickerFormatter datePickerFormatter0, Function2 function20, Function2 function21, boolean z, DatePickerColors datePickerColors0, int v, int v1, int v2) {
        this.w = v2;
        this.F = object0;
        this.x = modifier0;
        this.y = datePickerFormatter0;
        this.z = function20;
        this.A = function21;
        this.B = z;
        this.C = datePickerColors0;
        this.D = v;
        this.E = v1;
        super(2);
    }

    public t5(Object object0, boolean z, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, String s, Function3 function30, int v, int v1, int v2) {
        this.w = v2;
        this.F = object0;
        this.B = z;
        this.x = modifier0;
        this.y = enterTransition0;
        this.z = exitTransition0;
        this.A = s;
        this.C = function30;
        this.D = v;
        this.E = v1;
        super(2);
    }

    public t5(String s, List list0, Pair pair0, boolean z, h h0, Function2 function20, Function0 function00, int v, int v1) {
        this.w = 3;
        this.F = s;
        this.x = list0;
        this.y = pair0;
        this.B = z;
        this.A = h0;
        this.z = function20;
        this.C = function00;
        this.D = v;
        this.E = v1;
        super(2);
    }

    public t5(boolean z, Function0 function00, Modifier modifier0, PullToRefreshState pullToRefreshState0, Alignment alignment0, Function3 function30, Function3 function31, int v, int v1) {
        this.w = 7;
        this.B = z;
        this.F = function00;
        this.x = modifier0;
        this.y = pullToRefreshState0;
        this.z = alignment0;
        this.A = function30;
        this.C = function31;
        this.D = v;
        this.E = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                DatePickerKt.DatePicker(((DatePickerState)this.F), ((Modifier)this.x), ((DatePickerFormatter)this.y), ((Function2)this.z), ((Function2)this.A), this.B, ((DatePickerColors)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                DateRangePickerKt.DateRangePicker(((DateRangePickerState)this.F), ((Modifier)this.x), ((DatePickerFormatter)this.y), ((Function2)this.z), ((Function2)this.A), this.B, ((DatePickerColors)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                SliderKt.Slider(((SliderState)this.F), ((Modifier)this.x), this.B, ((SliderColors)this.y), ((MutableInteractionSource)this.z), ((Function3)this.A), ((Function3)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                TextEditorKt.access$TextEditor(((String)this.F), ((List)this.x), ((Pair)this.y), this.B, ((h)this.A), ((Function2)this.z), ((Function0)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                ListItemKt.ListItem(((Modifier)this.x), ((Function2)this.z), ((Function2)this.A), this.B, ((Function2)this.F), ((Function2)this.y), ((Function2)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                AnimatedVisibilityKt.AnimatedVisibility(((RowScope)this.F), this.B, ((Modifier)this.x), ((EnterTransition)this.y), ((ExitTransition)this.z), ((String)this.A), ((Function3)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 6: {
                ((Number)object1).intValue();
                AnimatedVisibilityKt.AnimatedVisibility(((ColumnScope)this.F), this.B, ((Modifier)this.x), ((EnterTransition)this.y), ((ExitTransition)this.z), ((String)this.A), ((Function3)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                PullToRefreshKt.PullToRefreshBox(this.B, ((Function0)this.F), ((Modifier)this.x), ((PullToRefreshState)this.y), ((Alignment)this.z), ((Function3)this.A), ((Function3)this.C), ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
        }
    }
}

