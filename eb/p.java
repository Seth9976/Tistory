package eb;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import com.kakao.kandinsky.textedit.ui.TextInputKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function3 {
    public final long w;
    public final long x;
    public final float y;
    public final MutableState z;

    public p(long v, long v1, float f, MutableState mutableState0) {
        this.w = v;
        this.x = v1;
        this.y = f;
        this.z = mutableState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((Function2)object0), "innerTextField");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-372629008, v, -1, "com.kakao.kandinsky.textedit.ui.TextInput.<anonymous> (TextInput.kt:101)");
        }
        Rect rect0 = TextInputKt.access$TextInput_ca1Bfew$lambda$8(this.z);
        float f = Size.getHeight-impl(this.x);
        Rect rect1 = RectExtensionKt.inflate(rect0, Size.getWidth-impl(this.x), f);
        TextInputKt.access$DrawBackground-cq6XJ1M(this.w, rect1, this.y, ((Composer)object1), 0x180);
        ((Function2)object0).invoke(((Composer)object1), ((int)(v & 14)));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

