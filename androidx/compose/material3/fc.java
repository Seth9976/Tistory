package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Sticker;
import com.kakao.kandinsky.core.kdphoto.Text;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.crop.CropScreenKt;
import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import com.kakao.kandinsky.resize.ResizeViewModel;
import com.kakao.kandinsky.sticker.contract.StickerGroup;
import com.kakao.kandinsky.sticker.ui.StickerDecorationKt;
import com.kakao.kandinsky.sticker.ui.StickerTabBarKt;
import com.kakao.kandinsky.text.ui.TextDecorationKt;
import com.kakao.kandinsky.textedit.TextEditorKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
import p0.a6;

public final class fc extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public fc(ResizeViewModel resizeViewModel0, Function2 function20, Function1 function10, Function2 function21, Function0 function00, int v) {
        this.w = 5;
        this.A = resizeViewModel0;
        this.y = function20;
        this.B = function10;
        this.z = function21;
        this.C = function00;
        this.x = v;
        super(2);
    }

    public fc(Object object0, Object object1, Object object2, Object object3, Object object4, int v, int v1) {
        this.w = v1;
        this.y = object0;
        this.z = object1;
        this.A = object2;
        this.B = object3;
        this.C = object4;
        this.x = v;
        super(2);
    }

    public fc(a6 a60, Modifier modifier0, Function2 function20, ComposableLambda composableLambda0, ComposableLambda composableLambda1, int v) {
        this.w = 4;
        this.z = a60;
        this.A = modifier0;
        this.y = function20;
        this.B = composableLambda0;
        this.C = composableLambda1;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ListItemKt.access$ListItemLayout(((Function2)this.y), ((Function2)this.z), ((Function2)this.A), ((Function2)this.B), ((Function2)this.C), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                TextDecorationKt.TextDecoration-BRlu0J8(((DecorationStatus)this.y), ((ImmutableList)this.z), ((Text)this.A), ((Rect)this.B), ((DecorationControllerInterface)this.C), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                TextEditorKt.TextDecorationEditor(((String)this.y), ((List)this.z), ((TextData)this.A), ((Function1)this.B), ((Function0)this.C), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                ((ComposableLambdaImpl)this.y).invoke(this.z, this.A, this.B, this.C, ((Composer)object0), this.x & -920350135 | ((0x24924924 & this.x) >> 1 | 306783378 & this.x) | (306783378 & this.x) << 1 & (0x24924924 & this.x) | 1);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                ((a6)this.z).a(((Modifier)this.A), ((Function2)this.y), ((ComposableLambda)this.B), ((ComposableLambda)this.C), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                ReSizeScreenKt.ResizeScreen(((ResizeViewModel)this.A), ((Function2)this.y), ((Function1)this.B), ((Function2)this.z), ((Function0)this.C), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 6: {
                ((Number)object1).intValue();
                CropScreenKt.CropScreen(((BoxScope)this.y), ((CropViewModel)this.z), ((Function1)this.A), ((Function1)this.B), ((Function0)this.C), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 7: {
                ((Number)object1).intValue();
                StickerDecorationKt.StickerDecoration-BRlu0J8(((DecorationStatus)this.y), ((ImmutableList)this.z), ((Sticker)this.A), ((Rect)this.B), ((DecorationControllerInterface)this.C), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                StickerTabBarKt.StickerTabBar(((ImmutableList)this.y), ((StickerGroup)this.z), ((Function1)this.A), ((Function0)this.B), ((Function0)this.C), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

