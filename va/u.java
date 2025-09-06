package va;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.signature.ui.SignatureDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final int A;
    public final Modifier w;
    public final Text x;
    public final Rect y;
    public final int z;

    public u(Modifier modifier0, Text signature$Text0, Rect rect0, int v, int v1) {
        this.w = modifier0;
        this.x = signature$Text0;
        this.y = rect0;
        this.z = v;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SignatureDecorationKt.WatermarkSignatureContent(this.w, this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
        return Unit.INSTANCE;
    }
}

