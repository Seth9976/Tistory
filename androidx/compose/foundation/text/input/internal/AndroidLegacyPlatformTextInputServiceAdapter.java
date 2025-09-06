package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0018\u0010\f\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000B0\b2\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000B0\bH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u000F\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000F\u0010\u0003J\u000F\u0010\u0011\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0014\u001A\u00020\u000B2\b\u0010\u0012\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u00020\u000B2\u0006\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JK\u0010#\u001A\u00020\u000B2\u0006\u0010\u001A\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001D2\u0012\u0010 \u001A\u000E\u0012\u0004\u0012\u00020\u001F\u0012\u0004\u0012\u00020\u000B0\b2\u0006\u0010!\u001A\u00020\u00162\u0006\u0010\"\u001A\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010$J\u000F\u0010%\u001A\u00020\u000BH\u0016¢\u0006\u0004\b%\u0010\u0003¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "<init>", "()V", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "stopInput", "oldValue", "newValue", "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "(Landroidx/compose/ui/geometry/Rect;)V", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "startStylusHandwriting", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLegacyPlatformTextInputServiceAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
public final class AndroidLegacyPlatformTextInputServiceAdapter extends LegacyPlatformTextInputServiceAdapter {
    public static final int $stable = 8;
    public Job b;
    public LegacyTextInputMethodRequest c;
    public MutableSharedFlow d;

    // 去混淆评级： 低(30)
    public final MutableSharedFlow a() {
        return this.d == null ? null : this.d;
    }

    public static final void access$startInput$localToScreen(LegacyPlatformTextInputNode legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0, float[] arr_f) {
        LayoutCoordinates layoutCoordinates0 = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0.getLayoutCoordinates();
        if(layoutCoordinates0 != null) {
            if(!layoutCoordinates0.isAttached()) {
                layoutCoordinates0 = null;
            }
            if(layoutCoordinates0 != null) {
                layoutCoordinates0.transformToScreen-58bKbWc(arr_f);
            }
        }
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(@NotNull Rect rect0) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest0 = this.c;
        if(legacyTextInputMethodRequest0 != null) {
            legacyTextInputMethodRequest0.notifyFocusedRect(rect0);
        }
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        LegacyPlatformTextInputNode legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 = this.getTextInputModifierNode();
        if(legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 != null) {
            this.b = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0.launchTextInputSession(new d(null, this, legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0, null));
        }
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(@NotNull TextFieldValue textFieldValue0, @NotNull ImeOptions imeOptions0, @NotNull Function1 function10, @NotNull Function1 function11) {
        a a0 = new a(textFieldValue0, this, imeOptions0, function10, function11);
        LegacyPlatformTextInputNode legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 = this.getTextInputModifierNode();
        if(legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 != null) {
            this.b = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0.launchTextInputSession(new d(a0, this, legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0, null));
        }
    }

    @Override  // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter
    public void startStylusHandwriting() {
        MutableSharedFlow mutableSharedFlow0 = this.a();
        if(mutableSharedFlow0 != null) {
            mutableSharedFlow0.tryEmit(Unit.INSTANCE);
        }
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        Job job0 = this.b;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.b = null;
        MutableSharedFlow mutableSharedFlow0 = this.a();
        if(mutableSharedFlow0 != null) {
            mutableSharedFlow0.resetReplayCache();
        }
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(@Nullable TextFieldValue textFieldValue0, @NotNull TextFieldValue textFieldValue1) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest0 = this.c;
        if(legacyTextInputMethodRequest0 != null) {
            legacyTextInputMethodRequest0.updateState(textFieldValue0, textFieldValue1);
        }
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(@NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Function1 function10, @NotNull Rect rect0, @NotNull Rect rect1) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest0 = this.c;
        if(legacyTextInputMethodRequest0 != null) {
            legacyTextInputMethodRequest0.updateTextLayoutResult(textFieldValue0, offsetMapping0, textLayoutResult0, rect0, rect1);
        }
    }
}

