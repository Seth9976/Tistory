package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@RequiresApi(26)
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\r\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001B\u001A\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "Landroid/view/View;", "view", "Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "<init>", "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "", "requestAutofillForNode", "(Landroidx/compose/ui/autofill/AutofillNode;)V", "cancelAutofillForNode", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "b", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "Landroid/view/autofill/AutofillManager;", "c", "Landroid/view/autofill/AutofillManager;", "getAutofillManager", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,143:1\n26#2:144\n26#2:145\n26#2:146\n26#2:147\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n*L\n56#1:144\n57#1:145\n58#1:146\n59#1:147\n*E\n"})
public final class AndroidAutofill implements Autofill {
    public static final int $stable = 8;
    public final View a;
    public final AutofillTree b;
    public final AutofillManager c;

    public AndroidAutofill(@NotNull View view0, @NotNull AutofillTree autofillTree0) {
        this.a = view0;
        this.b = autofillTree0;
        AutofillManager autofillManager0 = (AutofillManager)view0.getContext().getSystemService(AutofillManager.class);
        if(autofillManager0 == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = autofillManager0;
        view0.setImportantForAutofill(1);
    }

    @Override  // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(@NotNull AutofillNode autofillNode0) {
        int v = autofillNode0.getId();
        this.c.notifyViewExited(this.a, v);
    }

    @NotNull
    public final AutofillManager getAutofillManager() {
        return this.c;
    }

    @NotNull
    public final AutofillTree getAutofillTree() {
        return this.b;
    }

    @NotNull
    public final View getView() {
        return this.a;
    }

    @Override  // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(@NotNull AutofillNode autofillNode0) {
        Rect rect0 = autofillNode0.getBoundingBox();
        if(rect0 == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        android.graphics.Rect rect1 = new android.graphics.Rect(Math.round(rect0.getLeft()), Math.round(rect0.getTop()), Math.round(rect0.getRight()), Math.round(rect0.getBottom()));
        this.c.notifyViewEntered(this.a, autofillNode0.getId(), rect1);
    }
}

