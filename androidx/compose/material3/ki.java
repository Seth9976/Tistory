package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.navigation.NavBackStackEntry;
import com.google.accompanist.navigation.material.SheetContentHostKt;
import com.kakao.kandinsky.signature.SignatureScreenKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.SharedFlow;

public final class ki extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public ki(int v, Function2 function20, Function3 function30, Function2 function21, Function2 function22, MutableWindowInsets mutableWindowInsets0, Function2 function23) {
        this.w = 0;
        this.x = v;
        this.z = function20;
        this.y = function30;
        this.A = function21;
        this.B = function22;
        this.D = mutableWindowInsets0;
        this.C = function23;
        super(2);
    }

    public ki(Transition transition0, Function1 function10, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, Function3 function30, int v) {
        this.w = 5;
        this.z = transition0;
        this.A = function10;
        this.B = modifier0;
        this.C = enterTransition0;
        this.D = exitTransition0;
        this.y = function30;
        this.x = v;
        super(2);
    }

    public ki(WindowInsets windowInsets0, SubcomposeMeasureScope subcomposeMeasureScope0, ArrayList arrayList0, int v, ArrayList arrayList1, Integer integer0, Function3 function30) {
        this.w = 1;
        this.z = windowInsets0;
        this.A = subcomposeMeasureScope0;
        this.B = arrayList0;
        this.x = v;
        this.C = arrayList1;
        this.D = integer0;
        this.y = function30;
        super(2);
    }

    public ki(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, int v, int v1) {
        this.w = v1;
        this.z = object0;
        this.A = object1;
        this.B = object2;
        this.C = object3;
        this.y = object4;
        this.D = object5;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        float f1;
        switch(this.w) {
            case 0: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x8A07B92A, v, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                }
                ScaffoldKt.access$ScaffoldLayout-FMILGgc(this.x, ((Function2)this.z), ((Function3)this.y), ((Function2)this.A), ((Function2)this.B), ((MutableWindowInsets)this.D), ((Function2)this.C), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xB7AD96E0, v1, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                }
                SubcomposeMeasureScope subcomposeMeasureScope0 = (SubcomposeMeasureScope)this.A;
                PaddingValues paddingValues0 = WindowInsetsKt.asPaddingValues(((WindowInsets)this.z), subcomposeMeasureScope0);
                float f = ((ArrayList)this.B).isEmpty() ? paddingValues0.calculateTopPadding-D9Ej5fM() : subcomposeMeasureScope0.toDp-u2uoSUM(this.x);
                if(((ArrayList)this.C).isEmpty()) {
                    f1 = paddingValues0.calculateBottomPadding-D9Ej5fM();
                }
                else {
                    Integer integer0 = (Integer)this.D;
                    f1 = integer0 == null ? paddingValues0.calculateBottomPadding-D9Ej5fM() : subcomposeMeasureScope0.toDp-u2uoSUM(((int)integer0));
                }
                PaddingValues paddingValues1 = PaddingKt.PaddingValues-a9UjIt4(PaddingKt.calculateStartPadding(paddingValues0, subcomposeMeasureScope0.getLayoutDirection()), f, PaddingKt.calculateEndPadding(paddingValues0, subcomposeMeasureScope0.getLayoutDirection()), f1);
                ((Function3)this.y).invoke(paddingValues1, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                TimePickerKt.d(((Modifier)this.z), ((TimePickerState)this.A), ((TimePickerColors)this.B), ((MeasurePolicy)this.C), ((Shape)this.y), ((Shape)this.D), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                ((ComposableLambdaImpl)this.z).invoke(this.A, this.B, this.C, this.y, this.D, ((Composer)object0), this.x & -920350135 | ((0x24924924 & this.x) >> 1 | 306783378 & this.x) | (306783378 & this.x) << 1 & (0x24924924 & this.x) | 1);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                SheetContentHostKt.SheetContentHost(((ColumnScope)this.z), ((NavBackStackEntry)this.A), ((ModalBottomSheetState)this.B), ((SaveableStateHolder)this.C), ((Function1)this.y), ((Function1)this.D), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                AnimatedVisibilityKt.AnimatedVisibilityImpl(((Transition)this.z), ((Function1)this.A), ((Modifier)this.B), ((EnterTransition)this.C), ((ExitTransition)this.D), ((Function3)this.y), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                SignatureScreenKt.ConsumeEvent(((SharedFlow)this.z), ((Function1)this.A), ((Function1)this.B), ((Function0)this.C), ((Function0)this.y), ((Function1)this.D), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

