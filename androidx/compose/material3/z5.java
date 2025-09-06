package androidx.compose.material3;

import androidx.activity.compose.ActivityResultLauncherHolder;
import androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult.1.1.invoke..inlined.onDispose.1;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt.Popup.2.1.invoke..inlined.onDispose.1;
import androidx.compose.ui.window.PopupLayout;
import androidx.compose.ui.window.PopupProperties;
import com.kakao.keditor.plugin.pluginspec.poll.creator.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class z5 extends Lambda implements Function1 {
    public final Object A;
    public final Object B;
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public z5(Object object0, Object object1, Object object2, Object object3, Object object4, int v) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        this.A = object3;
        this.B = object4;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Rect rect0;
        switch(this.w) {
            case 0: {
                boolean z = DatePickerKt.access$DatePickerContent$lambda$8(((MutableState)this.y));
                DatePickerKt.access$DatePickerContent$lambda$9(((MutableState)this.y), !z);
                y5 y50 = new y5(((LazyListState)this.z), ((Number)object0).intValue(), ((IntRange)this.A), ((CalendarMonth)this.B), null);
                BuildersKt.launch$default(((CoroutineScope)this.x), null, null, y50, 3, null);
                return Unit.INSTANCE;
            }
            case 1: {
                DisposableEffectScope disposableEffectScope1 = (DisposableEffectScope)object0;
                b b0 = new b(((State)this.B), 1);
                ActivityResultLauncher activityResultLauncher0 = ((ActivityResultRegistry)this.y).register(((String)this.z), ((ActivityResultContract)this.A), b0);
                ((ActivityResultLauncherHolder)this.x).setLauncher(activityResultLauncher0);
                return new ActivityResultRegistryKt.rememberLauncherForActivityResult.1.1.invoke..inlined.onDispose.1(((ActivityResultLauncherHolder)this.x));
            }
            case 2: {
                ((ContentDrawScope)object0).drawContent();
                float f = ((CursorAnimationState)this.x).getCursorAlpha();
                if(f != 0.0f) {
                    int v = ((OffsetMapping)this.y).originalToTransformed(TextRange.getStart-impl(((TextFieldValue)this.z).getSelection-d9O1mEE()));
                    TextLayoutResultProxy textLayoutResultProxy0 = ((LegacyTextFieldState)this.A).getLayoutResult();
                    if(textLayoutResultProxy0 == null) {
                        rect0 = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    else {
                        TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
                        if(textLayoutResult0 == null) {
                            rect0 = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        else {
                            rect0 = textLayoutResult0.getCursorRect(v);
                            if(rect0 == null) {
                                rect0 = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                        }
                    }
                    float f1 = ((ContentDrawScope)object0).toPx-0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                    float f2 = c.coerceAtLeast(c.coerceAtMost(rect0.getLeft() + f1 / 2.0f, Size.getWidth-impl(((ContentDrawScope)object0).getSize-NH-jbRc()) - f1 / 2.0f), f1 / 2.0f);
                    DrawScope.drawLine-1RTmtNc$default(((ContentDrawScope)object0), ((Brush)this.B), OffsetKt.Offset(f2, rect0.getTop()), OffsetKt.Offset(f2, rect0.getBottom()), f1, 0, null, f, null, 0, 0x1B0, null);
                }
                return Unit.INSTANCE;
            }
            default: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                ((PopupLayout)this.x).show();
                ((PopupLayout)this.x).updateParameters(((Function0)this.y), ((PopupProperties)this.z), ((String)this.A), ((LayoutDirection)this.B));
                return new AndroidPopup_androidKt.Popup.2.1.invoke..inlined.onDispose.1(((PopupLayout)this.x));
            }
        }
    }
}

