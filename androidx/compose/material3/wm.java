package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.kakao.kandinsky.textedit.ui.EditState;
import com.kakao.kandinsky.textedit.ui.EditTabBarKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class wm extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Function C;
    public final Object D;
    public final Object E;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    public wm(Object object0, boolean z, boolean z1, Object object1, Function function0, Object object2, Object object3, int v, int v1) {
        this.w = v1;
        this.A = object0;
        this.x = z;
        this.y = z1;
        this.B = object1;
        this.C = function0;
        this.D = object2;
        this.E = object3;
        this.z = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            EditTabBarKt.EditTabBar(((EditState)this.A), this.x, this.y, ((Function0)this.B), ((Function1)this.C), ((Function1)this.D), ((Function0)this.E), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        SwitchKt.a(((Modifier)this.A), this.x, this.y, ((SwitchColors)this.B), ((Function2)this.C), ((InteractionSource)this.D), ((Shape)this.E), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
        return Unit.INSTANCE;
    }
}

