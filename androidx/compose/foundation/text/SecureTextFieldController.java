package androidx.compose.foundation.text;

import androidx.activity.c0;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import fg.c;
import j0.i;
import j0.s2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001A\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000F\u001A\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u0017\u0010\u0015\u001A\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001B\u001A\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/text/SecureTextFieldController;", "", "Landroidx/compose/runtime/State;", "", "obfuscationMaskState", "<init>", "(Landroidx/compose/runtime/State;)V", "", "observeHideEvents", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/PasswordInputTransformation;", "b", "Landroidx/compose/foundation/text/PasswordInputTransformation;", "getPasswordInputTransformation", "()Landroidx/compose/foundation/text/PasswordInputTransformation;", "passwordInputTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "c", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "getCodepointTransformation", "()Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/ui/Modifier;", "d", "Landroidx/compose/ui/Modifier;", "getFocusChangeModifier", "()Landroidx/compose/ui/Modifier;", "focusChangeModifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SecureTextFieldController {
    public static final int $stable = 8;
    public final State a;
    public final PasswordInputTransformation b;
    public final i c;
    public final Modifier d;
    public final Channel e;

    public SecureTextFieldController(@NotNull State state0) {
        this.a = state0;
        this.b = new PasswordInputTransformation(new c0(0, this, SecureTextFieldController.class, "scheduleHide", "scheduleHide()V", 0, 9));
        this.c = new i(this, 1);
        c c0 = new c(this, 10);
        this.d = FocusChangedModifierKt.onFocusChanged(Modifier.Companion, c0);
        this.e = ChannelKt.Channel$default(0x7FFFFFFF, null, null, 6, null);
    }

    public static final void access$scheduleHide(SecureTextFieldController secureTextFieldController0) {
        if(ChannelResult.isFailure-impl(secureTextFieldController0.e.trySend-JP2dKIU(Unit.INSTANCE))) {
            secureTextFieldController0.b.hide();
        }
    }

    @NotNull
    public final CodepointTransformation getCodepointTransformation() {
        return this.c;
    }

    @NotNull
    public final Modifier getFocusChangeModifier() {
        return this.d;
    }

    @NotNull
    public final PasswordInputTransformation getPasswordInputTransformation() {
        return this.b;
    }

    @Nullable
    public final Object observeHideEvents(@NotNull Continuation continuation0) {
        Object object0 = FlowKt.collectLatest(FlowKt.consumeAsFlow(this.e), new s2(this, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

