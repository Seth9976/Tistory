package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n*L\n1#1,497:1\n46#2,6:498\n*E\n"})
public final class TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.1.1.invoke..inlined.onDispose.1 implements DisposableEffectResult {
    public final MutableState a;
    public final MutableInteractionSource b;

    public TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.1.1.invoke..inlined.onDispose.1(MutableState mutableState0, MutableInteractionSource mutableInteractionSource0) {
        this.a = mutableState0;
        this.b = mutableInteractionSource0;
        super();
    }

    @Override  // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        MutableState mutableState0 = this.a;
        Press pressInteraction$Press0 = (Press)mutableState0.getValue();
        if(pressInteraction$Press0 != null) {
            Cancel pressInteraction$Cancel0 = new Cancel(pressInteraction$Press0);
            MutableInteractionSource mutableInteractionSource0 = this.b;
            if(mutableInteractionSource0 != null) {
                mutableInteractionSource0.tryEmit(pressInteraction$Cancel0);
            }
            mutableState0.setValue(null);
        }
    }
}

