package aa;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.decoration.TextKt;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final int w;
    public final float x;
    public final int y;
    public final int z;

    public f0(Object object0, float f, Object object1, int v, int v1, int v2) {
        this.w = v2;
        this.A = object0;
        this.x = f;
        this.B = object1;
        this.y = v;
        this.z = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            KDSliderKt.access$SliderNumber(((BoxScope)this.A), this.x, ((String)this.B), this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        TextKt.Text(((TextData)this.A), this.x, ((Modifier)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
        return Unit.INSTANCE;
    }
}

