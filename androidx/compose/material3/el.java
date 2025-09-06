package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.textedit.TextEditorKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class el extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Function C;
    public final Function D;
    public final int w;
    public final boolean x;
    public final int y;
    public final Object z;

    public el(Modifier modifier0, SliderState sliderState0, boolean z, MutableInteractionSource mutableInteractionSource0, Function3 function30, Function3 function31, int v) {
        this.w = 0;
        this.z = modifier0;
        this.A = sliderState0;
        this.x = z;
        this.B = mutableInteractionSource0;
        this.C = function30;
        this.D = function31;
        this.y = v;
        super(2);
    }

    public el(String s, List list0, TextData textData0, boolean z, Function2 function20, Function0 function00, int v) {
        this.w = 1;
        this.z = s;
        this.A = list0;
        this.B = textData0;
        this.x = z;
        this.C = function20;
        this.D = function00;
        this.y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TextEditorKt.TextSignatureEditor(((String)this.z), ((List)this.A), ((TextData)this.B), this.x, ((Function2)this.C), ((Function0)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        SliderKt.b(((Modifier)this.z), ((SliderState)this.A), this.x, ((MutableInteractionSource)this.B), ((Function3)this.C), ((Function3)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
        return Unit.INSTANCE;
    }
}

