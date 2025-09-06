package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.LabelKt;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.kakao.kandinsky.sticker.contract.StickerGroup;
import com.kakao.kandinsky.sticker.ui.StickerTabBarKt;
import com.kakao.kandinsky.textedit.ui.EditState;
import com.kakao.kandinsky.textedit.ui.EditTabBarKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final Object A;
    public final int w;
    public final boolean x;
    public final int y;
    public final Object z;

    public g(Object object0, Object object1, boolean z, int v, int v1) {
        this.w = v1;
        this.z = object0;
        this.A = object1;
        this.x = z;
        this.y = v;
        super(2);
    }

    public g(Object object0, boolean z, Function function0, int v, int v1) {
        this.w = v1;
        this.z = object0;
        this.x = z;
        this.A = function0;
        this.y = v;
        super(2);
    }

    public g(boolean z, Object object0, Object object1, int v, int v1) {
        this.w = v1;
        this.x = z;
        this.z = object0;
        this.A = object1;
        this.y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.w) {
            case 0: {
                AndroidSelectionHandles_androidKt.SelectionHandleIcon(((Modifier)this.z), ((Function0)this.A), this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                TextFieldSelectionManagerKt.TextFieldSelectionHandle(this.x, ((ResolvedTextDirection)this.z), ((TextFieldSelectionManager)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                LabelKt.access$HandleInteractions(this.x, ((TooltipState)this.z), ((MutableInteractionSource)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                TimePickerKt.ClockFace(((AnalogTimePickerState)this.z), ((TimePickerColors)this.A), this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 4: {
                EditTabBarKt.access$MenuButton(((EditState)this.z), this.x, ((Function0)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 5: {
                ContextMenu_androidKt.ContextMenuArea(((TextFieldSelectionState)this.z), this.x, ((Function2)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            default: {
                StickerTabBarKt.access$StickerGroupButton(((StickerGroup)this.z), this.x, ((Function1)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

