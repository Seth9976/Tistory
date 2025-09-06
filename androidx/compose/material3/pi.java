package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material.DismissState;
import androidx.compose.material.SwipeToDismissKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.textedit.contract.InputState;
import com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanelKt;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class pi extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final int w;
    public final Object x;
    public final int y;
    public final int z;

    public pi(int v, Function2 function20, Function3 function30, Function2 function21, Function2 function22, WindowInsets windowInsets0, Function2 function23, int v1) {
        this.w = 0;
        this.y = v;
        this.x = function20;
        this.D = function30;
        this.A = function21;
        this.B = function22;
        this.E = windowInsets0;
        this.C = function23;
        this.z = v1;
        super(2);
    }

    public pi(BoxWithConstraintsScope boxWithConstraintsScope0, Orientation orientation0, PagerState pagerState0, Function2 function20, Function4 function40, Function4 function41, int v, int v1) {
        this.w = 1;
        this.A = boxWithConstraintsScope0;
        this.B = orientation0;
        this.C = pagerState0;
        this.x = function20;
        this.D = function40;
        this.E = function41;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public pi(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, int v, int v1, int v2) {
        this.w = v2;
        this.x = object0;
        this.A = object1;
        this.B = object2;
        this.C = object3;
        this.D = object4;
        this.E = object5;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public pi(Object object0, Object object1, Object object2, Object object3, Object object4, Function3 function30, int v, int v1, int v2) {
        this.w = v2;
        this.x = object0;
        this.A = object1;
        this.B = object2;
        this.C = object3;
        this.E = object4;
        this.D = function30;
        this.y = v;
        this.z = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ScaffoldKt.access$ScaffoldLayout-FMILGgc(this.y, ((Function2)this.x), ((Function3)this.D), ((Function2)this.A), ((Function2)this.B), ((WindowInsets)this.E), ((Function2)this.C), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ItemSliderKt.access$Pager(((BoxWithConstraintsScope)this.A), ((Orientation)this.B), ((PagerState)this.C), ((Function2)this.x), ((Function4)this.D), ((Function4)this.E), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                TextStyleAndFontPanelKt.TextStyleAndFontPanel(((InputState)this.x), ((InputState)this.A), ((InputState)this.B), ((InputState)this.C), ((InputState)this.D), ((List)this.E), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                SwipeToDismissKt.SwipeToDismiss(((DismissState)this.x), ((Modifier)this.A), ((Set)this.B), ((Function1)this.C), ((Function3)this.D), ((Function3)this.E), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                AnimatedContentKt.AnimatedContent(((Transition)this.x), ((Modifier)this.A), ((Function1)this.B), ((Alignment)this.C), ((Function1)this.D), ((Function4)this.E), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                AnimatedVisibilityKt.AnimatedVisibility(((Transition)this.x), ((Function1)this.A), ((Modifier)this.B), ((EnterTransition)this.C), ((ExitTransition)this.E), ((Function3)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                AnimatedVisibilityKt.AnimatedVisibility(((MutableTransitionState)this.x), ((Modifier)this.A), ((EnterTransition)this.B), ((ExitTransition)this.C), ((String)this.E), ((Function3)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
        }
    }
}

