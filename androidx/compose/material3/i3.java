package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.CheckboxColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.state.ToggleableState;
import com.kakao.kandinsky.base.ui.KDAsyncImageKt;
import com.kakao.kandinsky.designsystem.common.KDButtonColors;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class i3 extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final int w;
    public final boolean x;
    public final Object y;
    public final Modifier z;

    public i3(ContextMenuState contextMenuState0, Function0 function00, Function1 function10, Modifier modifier0, boolean z, Function2 function20, int v, int v1) {
        this.w = 8;
        this.C = contextMenuState0;
        this.y = function00;
        this.D = function10;
        this.z = modifier0;
        this.x = z;
        this.E = function20;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public i3(ToggleableState toggleableState0, Function0 function00, Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, CheckboxColors checkboxColors0, int v, int v1) {
        this.w = 4;
        this.C = toggleableState0;
        this.y = function00;
        this.z = modifier0;
        this.x = z;
        this.E = mutableInteractionSource0;
        this.D = checkboxColors0;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public i3(ToggleableState toggleableState0, Function0 function00, Modifier modifier0, boolean z, androidx.compose.material3.CheckboxColors checkboxColors0, MutableInteractionSource mutableInteractionSource0, int v, int v1) {
        this.w = 0;
        this.C = toggleableState0;
        this.y = function00;
        this.z = modifier0;
        this.x = z;
        this.D = checkboxColors0;
        this.E = mutableInteractionSource0;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public i3(Object object0, boolean z, Object object1, Modifier modifier0, Object object2, Object object3, int v, int v1, int v2) {
        this.w = v2;
        this.C = object0;
        this.x = z;
        this.y = object1;
        this.z = modifier0;
        this.D = object2;
        this.E = object3;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public i3(String s, boolean z, ContextMenuColors contextMenuColors0, Modifier modifier0, Function3 function30, Function0 function00, int v, int v1) {
        this.w = 9;
        this.C = s;
        this.x = z;
        this.D = contextMenuColors0;
        this.z = modifier0;
        this.E = function30;
        this.y = function00;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public i3(Function0 function00, Modifier modifier0, boolean z, Object object0, MutableInteractionSource mutableInteractionSource0, Function2 function20, int v, int v1, int v2) {
        this.w = v2;
        this.y = function00;
        this.z = modifier0;
        this.x = z;
        this.C = object0;
        this.E = mutableInteractionSource0;
        this.D = function20;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public i3(boolean z, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, String s, Function3 function30, int v, int v1) {
        this.w = 7;
        this.x = z;
        this.z = modifier0;
        this.C = enterTransition0;
        this.y = exitTransition0;
        this.D = s;
        this.E = function30;
        this.A = v;
        this.B = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                CheckboxKt.TriStateCheckbox(((ToggleableState)this.C), ((Function0)this.y), this.z, this.x, ((androidx.compose.material3.CheckboxColors)this.D), ((MutableInteractionSource)this.E), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ((ExposedDropdownMenuBoxScope)this.C).ExposedDropdownMenu(this.x, ((Function0)this.y), this.z, ((ScrollState)this.D), ((Function3)this.E), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                IconButtonKt.IconButton(((Function0)this.y), this.z, this.x, ((IconButtonColors)this.C), ((MutableInteractionSource)this.E), ((Function2)this.D), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                KDButtonKt.KDIconButton(((Function0)this.y), this.z, this.x, ((KDButtonColors)this.C), ((MutableInteractionSource)this.E), ((Function2)this.D), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                androidx.compose.material.CheckboxKt.TriStateCheckbox(((ToggleableState)this.C), ((Function0)this.y), this.z, this.x, ((MutableInteractionSource)this.E), ((CheckboxColors)this.D), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                ((androidx.compose.material.ExposedDropdownMenuBoxScope)this.C).ExposedDropdownMenu(this.x, ((Function0)this.y), this.z, ((ScrollState)this.D), ((Function3)this.E), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 6: {
                ((Number)object1).intValue();
                KDAsyncImageKt.AsyncImage(this.C, this.x, ((String)this.y), this.z, ((Alignment)this.D), ((ContentScale)this.E), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 7: {
                ((Number)object1).intValue();
                AnimatedVisibilityKt.AnimatedVisibility(this.x, this.z, ((EnterTransition)this.C), ((ExitTransition)this.y), ((String)this.D), ((Function3)this.E), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            case 8: {
                ((Number)object1).intValue();
                ContextMenuArea_androidKt.ContextMenuArea(((ContextMenuState)this.C), ((Function0)this.y), ((Function1)this.D), this.z, this.x, ((Function2)this.E), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ContextMenuUi_androidKt.ContextMenuItem(((String)this.C), this.x, ((ContextMenuColors)this.D), this.z, ((Function3)this.E), ((Function0)this.y), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
                return Unit.INSTANCE;
            }
        }
    }
}

