package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(26)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\'\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000B\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u000E\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ%\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015H\u0007¢\u0006\u0004\b\u001A\u0010\u0019J\u0017\u0010\u001B\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015H\u0007¢\u0006\u0004\b\u001B\u0010\u0019J\u0017\u0010\u001C\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015H\u0007¢\u0006\u0004\b\u001C\u0010\u0019J\u0017\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0016\u001A\u00020\u0015H\u0007¢\u0006\u0004\b\u001E\u0010\u001F¨\u0006 "}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "Landroid/view/ViewStructure;", "structure", "Landroid/view/autofill/AutofillId;", "parent", "", "virtualId", "", "setAutofillId", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V", "getAutofillId", "(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;", "type", "setAutofillType", "(Landroid/view/ViewStructure;I)V", "", "", "hints", "setAutofillHints", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillValue;", "value", "", "isText", "(Landroid/view/autofill/AutofillValue;)Z", "isDate", "isList", "isToggle", "", "textValue", "(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AutofillApi26Helper {
    public static final int $stable;
    @NotNull
    public static final AutofillApi26Helper INSTANCE;

    static {
        AutofillApi26Helper.INSTANCE = new AutofillApi26Helper();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(26)
    @Nullable
    public final AutofillId getAutofillId(@NotNull ViewStructure viewStructure0) {
        return viewStructure0.getAutofillId();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isDate(@NotNull AutofillValue autofillValue0) {
        return autofillValue0.isDate();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isList(@NotNull AutofillValue autofillValue0) {
        return autofillValue0.isList();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isText(@NotNull AutofillValue autofillValue0) {
        return autofillValue0.isText();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isToggle(@NotNull AutofillValue autofillValue0) {
        return autofillValue0.isToggle();
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillHints(@NotNull ViewStructure viewStructure0, @NotNull String[] arr_s) {
        viewStructure0.setAutofillHints(arr_s);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillId(@NotNull ViewStructure viewStructure0, @NotNull AutofillId autofillId0, int v) {
        viewStructure0.setAutofillId(autofillId0, v);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillType(@NotNull ViewStructure viewStructure0, int v) {
        viewStructure0.setAutofillType(v);
    }

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    public final CharSequence textValue(@NotNull AutofillValue autofillValue0) {
        return autofillValue0.getTextValue();
    }
}

