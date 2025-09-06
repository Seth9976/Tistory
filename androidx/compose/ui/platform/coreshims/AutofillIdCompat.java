package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public class AutofillIdCompat {
    public final AutofillId a;

    public AutofillIdCompat(AutofillId autofillId0) {
        this.a = autofillId0;
    }

    @NonNull
    @RequiresApi(26)
    public AutofillId toAutofillId() {
        return this.a;
    }

    @NonNull
    @RequiresApi(26)
    public static AutofillIdCompat toAutofillIdCompat(@NonNull AutofillId autofillId0) {
        return new AutofillIdCompat(autofillId0);
    }
}

