package f8;

import android.text.Editable;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.b;

public final class j extends TextWatcherAdapter {
    public final b a;

    public j(b b0) {
        this.a = b0;
        super();
    }

    @Override  // com.google.android.material.internal.TextWatcherAdapter
    public final void afterTextChanged(Editable editable0) {
        this.a.b().a();
    }

    @Override  // com.google.android.material.internal.TextWatcherAdapter
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        this.a.b().b();
    }
}

