package androidx.compose.foundation.text.selection;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.material.Colors;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.Shapes;
import androidx.compose.material.Typography;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import com.kakao.kandinsky.designsystem.common.CommonDialogKt;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.selector.SelectorBottomSheetKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final int w;
    public final Object x;
    public final int y;
    public final int z;

    public b0(Painter painter0, ColorProducer colorProducer0, String s, Modifier modifier0, int v, int v1) {
        this.w = 1;
        this.A = painter0;
        this.B = colorProducer0;
        this.C = s;
        this.x = modifier0;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public b0(PopupPositionProvider popupPositionProvider0, Function0 function00, Modifier modifier0, Function1 function10, int v, int v1) {
        this.w = 10;
        this.A = popupPositionProvider0;
        this.C = function00;
        this.x = modifier0;
        this.B = function10;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public b0(Object object0, Modifier modifier0, Object object1, Function function0, int v, int v1, int v2) {
        this.w = v2;
        this.A = object0;
        this.x = modifier0;
        this.B = object1;
        this.C = function0;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public b0(Object object0, Object object1, Object object2, Function function0, int v, int v1, int v2) {
        this.w = v2;
        this.x = object0;
        this.A = object1;
        this.B = object2;
        this.C = function0;
        this.y = v;
        this.z = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                SelectionContainerKt.SelectionContainer(((Modifier)this.x), ((Selection)this.A), ((Function1)this.B), ((Function2)this.C), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                IconKt.Icon(((Painter)this.A), ((ColorProducer)this.B), ((String)this.C), ((Modifier)this.x), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                CommonDialogKt.access$CommonDialog(((String)this.x), ((String)this.A), ((Function0)this.B), ((Function0)this.C), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                FeatureBottomBarKt.access$FeatureBottomBar(((Modifier)this.x), ((Function3)this.A), ((Function3)this.B), ((Function3)this.C), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                LazyLayoutKt.LazyLayout(((LazyLayoutItemProvider)this.A), ((Modifier)this.x), ((LazyLayoutPrefetchState)this.B), ((Function2)this.C), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                LazyLayoutKt.LazyLayout(((Function0)this.A), ((Modifier)this.x), ((LazyLayoutPrefetchState)this.B), ((Function2)this.C), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 6: {
                ((Number)object1).intValue();
                MaterialThemeKt.MaterialTheme(((Colors)this.x), ((Typography)this.A), ((Shapes)this.B), ((Function2)this.C), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 7: {
                ((Number)object1).intValue();
                SelectorBottomSheetKt.SelectorBottomSheet(((Function0)this.x), ((Function4)this.A), ((Function4)this.B), ((Function3)this.C), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 8: {
                ((Number)object1).intValue();
                CrossfadeKt.Crossfade(this.A, ((Modifier)this.x), ((FiniteAnimationSpec)this.B), ((Function3)this.C), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 9: {
                ((Number)object1).intValue();
                AndroidPopup_androidKt.Popup(((PopupPositionProvider)this.x), ((Function0)this.A), ((PopupProperties)this.B), ((Function2)this.C), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ContextMenuUi_androidKt.ContextMenuPopup(((PopupPositionProvider)this.A), ((Function0)this.C), ((Modifier)this.x), ((Function1)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
        }
    }
}

