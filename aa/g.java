package aa;

import androidx.compose.animation.core.Animatable;
import androidx.compose.material.BackdropScaffoldKt;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.base.KDMviViewModel;
import com.kakao.kandinsky.border.BorderScreenKt;
import com.kakao.kandinsky.border.BorderViewModel;
import com.kakao.kandinsky.core.kdphoto.Border;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.decoration.ControlKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.filter.FilterScreenKt;
import com.kakao.kandinsky.filter.FilterViewModel;
import com.kakao.kandinsky.preview.DimState;
import com.kakao.kandinsky.preview.ImagePreviewKt;
import com.kakao.kandinsky.signature.SignatureScreenKt;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt;
import com.kakao.kandinsky.signature.ui.SignatureDecorationKt;
import com.kakao.kandinsky.textedit.contract.InputState;
import com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanelKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class g extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final int w;
    public final Object x;
    public final int y;
    public final Object z;

    public g(int v, int v1, Object object0, Object object1, Object object2, Object object3) {
        this.w = v1;
        this.x = object0;
        this.z = object1;
        this.A = object2;
        this.B = object3;
        this.y = v;
        super(2);
    }

    public g(Modifier modifier0, Function2 function20, Function1 function10, Function4 function40, int v) {
        this.w = 6;
        this.x = modifier0;
        this.z = function20;
        this.B = function10;
        this.A = function40;
        this.y = v;
        super(2);
    }

    public g(KDMviViewModel kDMviViewModel0, Function1 function10, Function2 function20, Function0 function00, int v, int v1) {
        this.w = v1;
        this.z = kDMviViewModel0;
        this.B = function10;
        this.A = function20;
        this.x = function00;
        this.y = v;
        super(2);
    }

    public g(String s, Function0 function00, Function0 function01, Function2 function20, int v) {
        this.w = 11;
        this.A = s;
        this.x = function00;
        this.z = function01;
        this.B = function20;
        this.y = v;
        super(2);
    }

    public g(List list0, Function1 function10, Function1 function11, Function1 function12, int v) {
        this.w = 10;
        this.x = list0;
        this.B = function10;
        this.z = function11;
        this.A = function12;
        this.y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ControlKt.RotateScaleControl(((Function0)this.x), ((Function0)this.z), ((Function0)this.A), ((Function1)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ModalBottomSheet_androidKt.ModalBottomSheetDialog(((Function0)this.x), ((ModalBottomSheetProperties)this.z), ((Animatable)this.A), ((Function2)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                FilterScreenKt.FilterScreen(((FilterViewModel)this.z), ((Function1)this.B), ((Function2)this.A), ((Function0)this.x), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                TextStyleAndFontPanelKt.access$StylePanel(((InputState)this.x), ((InputState)this.z), ((InputState)this.A), ((InputState)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                ((ComposableLambdaImpl)this.x).invoke(this.z, this.A, this.B, ((Composer)object0), this.y & -920350135 | ((0x24924924 & this.y) >> 1 | 306783378 & this.y) | (306783378 & this.y) << 1 & (0x24924924 & this.y) | 1);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                ImagePreviewKt.access$ClippedBox(((DimState)this.x), ((DecorationStatus)this.z), ((Rect)this.A), ((Function2)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 6: {
                ((Number)object1).intValue();
                BackdropScaffoldKt.access$BackdropStack(((Modifier)this.x), ((Function2)this.z), ((Function1)this.B), ((Function4)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 7: {
                ((Number)object1).intValue();
                SignatureScreenKt.SignatureScreen(((SignatureVieModel)this.z), ((Function1)this.B), ((Function2)this.A), ((Function0)this.x), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 8: {
                ((Number)object1).intValue();
                BorderScreenKt.access$BorderList(((String)this.x), ((ImmutableList)this.z), ((Border)this.A), ((Function1)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 9: {
                ((Number)object1).intValue();
                BorderScreenKt.BorderScreen(((BorderViewModel)this.z), ((Function1)this.B), ((Function2)this.A), ((Function0)this.x), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 10: {
                ((Number)object1).intValue();
                SavedSignatureBottomSheetKt.SavedSignatureBottomSheet(((List)this.x), ((Function1)this.B), ((Function1)this.z), ((Function1)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 11: {
                ((Number)object1).intValue();
                SavedSignatureBottomSheetKt.access$SignatureContainer(((String)this.A), ((Function0)this.x), ((Function0)this.z), ((Function2)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                SignatureDecorationKt.SignatureDecoration(((DecorationStatus)this.x), ((Rect)this.z), ((Signature)this.A), ((DecorationControllerInterface)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

