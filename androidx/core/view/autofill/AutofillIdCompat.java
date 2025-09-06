package androidx.core.view.autofill;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

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

