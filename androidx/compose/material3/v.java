package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import com.kakao.kandinsky.decoration.ControlKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function2 {
    public final long A;
    public final Object B;
    public final Object C;
    public final Function3 D;
    public final int E;
    public final int F;
    public final int w;
    public final boolean x;
    public final Function0 y;
    public final Modifier z;

    public v(Modifier modifier0, boolean z, long v, Function0 function00, Function0 function01, Function0 function02, Function3 function30, int v1, int v2) {
        this.w = 2;
        this.z = modifier0;
        this.x = z;
        this.A = v;
        this.y = function00;
        this.B = function01;
        this.C = function02;
        this.D = function30;
        this.E = v1;
        this.F = v2;
        super(2);
    }

    public v(boolean z, Function0 function00, Modifier modifier0, long v, ScrollState scrollState0, PopupProperties popupProperties0, Function3 function30, int v1, int v2, int v3) {
        this.w = v3;
        this.x = z;
        this.y = function00;
        this.z = modifier0;
        this.A = v;
        this.B = scrollState0;
        this.C = popupProperties0;
        this.D = function30;
        this.E = v1;
        this.F = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                AndroidMenu_androidKt.DropdownMenu-4kj-_NE(this.x, this.y, this.z, this.A, ((ScrollState)this.B), ((PopupProperties)this.C), this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                androidx.compose.material.AndroidMenu_androidKt.DropdownMenu-4kj-_NE(this.x, this.y, this.z, this.A, ((ScrollState)this.B), ((PopupProperties)this.C), this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ControlKt.ContentMoveControl-dBrA5TM(this.z, this.x, this.A, this.y, ((Function0)this.B), ((Function0)this.C), this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
                return Unit.INSTANCE;
            }
        }
    }
}

