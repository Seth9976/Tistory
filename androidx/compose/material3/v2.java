package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt;
import androidx.compose.material.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class v2 extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Function D;
    public final int w;
    public final Modifier x;
    public final int y;
    public final int z;

    public v2(MutableTransitionState mutableTransitionState0, MutableState mutableState0, ScrollState scrollState0, Modifier modifier0, Function3 function30, int v, int v1) {
        this.w = 2;
        this.A = mutableTransitionState0;
        this.B = mutableState0;
        this.C = scrollState0;
        this.x = modifier0;
        this.D = function30;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public v2(Modifier modifier0, Shape shape0, CardColors cardColors0, CardElevation cardElevation0, Function3 function30, int v, int v1) {
        this.w = 0;
        this.x = modifier0;
        this.A = shape0;
        this.B = cardColors0;
        this.C = cardElevation0;
        this.D = function30;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public v2(Object object0, Modifier modifier0, Object object1, Object object2, Function function0, int v, int v1, int v2) {
        this.w = v2;
        this.A = object0;
        this.x = modifier0;
        this.B = object1;
        this.C = object2;
        this.D = function0;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public v2(Object object0, Object object1, Modifier modifier0, Object object2, Function1 function10, int v, int v1, int v2) {
        this.w = v2;
        this.A = object0;
        this.B = object1;
        this.x = modifier0;
        this.C = object2;
        this.D = function10;
        this.y = v;
        this.z = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                CardKt.ElevatedCard(this.x, ((Shape)this.A), ((CardColors)this.B), ((CardElevation)this.C), ((Function3)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                NavHostKt.NavHost(((NavHostController)this.A), ((String)this.B), this.x, ((String)this.C), ((Function1)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                MenuKt.DropdownMenuContent(((MutableTransitionState)this.A), ((MutableState)this.B), ((ScrollState)this.C), this.x, ((Function3)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                CrossfadeKt.Crossfade(this.A, this.x, ((FiniteAnimationSpec)this.B), ((String)this.C), ((Function3)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                CrossfadeKt.Crossfade(((Transition)this.A), this.x, ((FiniteAnimationSpec)this.B), ((Function1)this.C), ((Function3)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                AndroidView_androidKt.AndroidView(((Function1)this.A), this.x, ((Function1)this.B), ((Function1)this.C), ((Function1)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ContextMenuUi_androidKt.ContextMenuPopup(((PopupPositionProvider)this.A), ((Function0)this.B), this.x, ((ContextMenuColors)this.C), ((Function1)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
        }
    }
}

