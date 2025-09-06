package ca;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.MenuButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t1 extends Lambda implements Function2 {
    public final int w;
    public final int x;
    public final int y;
    public final Object z;

    public t1(int v, String s, int v1) {
        this.w = 0;
        this.x = v;
        this.z = s;
        this.y = v1;
        super(2);
    }

    public t1(Modifier modifier0, int v, int v1) {
        this.w = 1;
        this.z = modifier0;
        this.x = v;
        this.y = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            AndroidCursorHandle_androidKt.access$DefaultCursorHandle(((Modifier)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)), this.y);
            return Unit.INSTANCE;
        }
        MenuButtonKt.access$DefaultIconTextContent(this.x, ((String)this.z), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
        return Unit.INSTANCE;
    }
}

