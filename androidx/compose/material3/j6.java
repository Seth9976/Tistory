package androidx.compose.material3;

import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.VectorGroup;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import b0.h;
import com.kakao.kandinsky.crop.ui.RotateMenuKt;
import com.kakao.kandinsky.designsystem.common.MenuButtonKt;
import e0.e;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j6 extends Lambda implements Function2 {
    public final Object A;
    public final int w;
    public final int x;
    public final int y;
    public final Object z;

    public j6(int v, String s, Function0 function00, int v1) {
        this.w = 3;
        this.x = v;
        this.z = s;
        this.A = function00;
        this.y = v1;
        super(2);
    }

    public j6(VectorGroup vectorGroup0, Map map0, int v, int v1) {
        this.w = 6;
        this.z = vectorGroup0;
        this.A = map0;
        this.x = v;
        this.y = v1;
        super(2);
    }

    public j6(Object object0, int v, Object object1, int v1, int v2) {
        this.w = v2;
        this.z = object0;
        this.x = v;
        this.A = object1;
        this.y = v1;
        super(2);
    }

    public j6(Function1 function10, Function1 function11, int v, int v1) {
        this.w = 7;
        this.A = function10;
        this.z = function11;
        this.x = v;
        this.y = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.w) {
            case 0: {
                DatePickerKt.DisplayModeToggleButton-tER2X8s(((Modifier)this.z), this.x, ((Function1)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((h)this.z).Item(this.x, this.A, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                ((c0.h)this.z).Item(this.x, this.A, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                MenuButtonKt.MenuIconTextButton(this.x, ((String)this.z), ((Function0)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 4: {
                ((e)this.z).Item(this.x, this.A, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 5: {
                ((PagerLazyLayoutItemProvider)this.z).Item(this.x, this.A, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 6: {
                VectorPainterKt.RenderVectorGroup(((VectorGroup)this.z), ((Map)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)), this.y);
                return Unit.INSTANCE;
            }
            default: {
                RotateMenuKt.RotateMenu(((Function1)this.A), ((Function1)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)), this.y);
                return Unit.INSTANCE;
            }
        }
    }
}

