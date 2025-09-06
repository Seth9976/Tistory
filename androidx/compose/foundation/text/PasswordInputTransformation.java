package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001A\u00020\u0003*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001A\u00020\u0003¢\u0006\u0004\b\n\u0010\u000BR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR+\u0010\u0018\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108@@BX\u0080\u008E\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/PasswordInputTransformation;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Lkotlin/Function0;", "", "scheduleHide", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "hide", "()V", "a", "Lkotlin/jvm/functions/Function0;", "getScheduleHide", "()Lkotlin/jvm/functions/Function0;", "", "<set-?>", "b", "Landroidx/compose/runtime/MutableIntState;", "getRevealCodepointIndex$foundation_release", "()I", "setRevealCodepointIndex", "(I)V", "revealCodepointIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,343:1\n75#2:344\n108#2,2:345\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n*L\n268#1:344\n268#1:345,2\n*E\n"})
public final class PasswordInputTransformation implements InputTransformation {
    public static final int $stable;
    public final Function0 a;
    public final MutableIntState b;

    public PasswordInputTransformation(@NotNull Function0 function00) {
        this.a = function00;
        this.b = SnapshotIntStateKt.mutableIntStateOf(-1);
    }

    public final int getRevealCodepointIndex$foundation_release() {
        return this.b.getIntValue();
    }

    @NotNull
    public final Function0 getScheduleHide() {
        return this.a;
    }

    public final void hide() {
        this.b.setIntValue(-1);
    }

    @Override  // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(@NotNull TextFieldBuffer textFieldBuffer0) {
        int v = textFieldBuffer0.getChanges().getChangeCount();
        MutableIntState mutableIntState0 = this.b;
        if(v == 1 && TextRange.getLength-impl(textFieldBuffer0.getChanges().getRange--jx7JFs(0)) == 1 && TextRange.getLength-impl(textFieldBuffer0.getChanges().getOriginalRange--jx7JFs(0)) == 0 && !textFieldBuffer0.hasSelection()) {
            int v1 = TextRange.getMin-impl(textFieldBuffer0.getChanges().getRange--jx7JFs(0));
            if(this.getRevealCodepointIndex$foundation_release() != v1) {
                this.a.invoke();
                mutableIntState0.setIntValue(v1);
            }
            return;
        }
        mutableIntState0.setIntValue(-1);
    }
}

