package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager.AutofillCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(26)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001J\'\u0010\b\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\u000E\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/autofill/AutofillCallback;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "Landroid/view/View;", "view", "", "virtualId", "event", "", "onAutofillEvent", "(Landroid/view/View;II)V", "Landroidx/compose/ui/autofill/AndroidAutofill;", "autofill", "register", "(Landroidx/compose/ui/autofill/AndroidAutofill;)V", "unregister", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AutofillCallback extends AutofillManager.AutofillCallback {
    public static final int $stable;
    @NotNull
    public static final AutofillCallback INSTANCE;

    static {
        AutofillCallback.INSTANCE = new AutofillCallback();  // 初始化器: Landroid/view/autofill/AutofillManager$AutofillCallback;-><init>()V
    }

    @Override  // android.view.autofill.AutofillManager$AutofillCallback
    public void onAutofillEvent(@NotNull View view0, int v, int v1) {
        String s;
        super.onAutofillEvent(view0, v, v1);
        switch(v1) {
            case 1: {
                s = "Autofill popup was shown.";
                break;
            }
            case 2: {
                s = "Autofill popup was hidden.";
                break;
            }
            case 3: {
                s = "Autofill popup isn\'t shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                break;
            }
            default: {
                s = "Unknown status event.";
            }
        }
        Log.d("Autofill Status", s);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void register(@NotNull AndroidAutofill androidAutofill0) {
        androidAutofill0.getAutofillManager().registerCallback(this);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void unregister(@NotNull AndroidAutofill androidAutofill0) {
        androidAutofill0.getAutofillManager().unregisterCallback(this);
    }
}

