package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputLayout;

public final class m2 implements TextWatcher {
    public final int a;
    public final ViewGroup b;

    public m2(ViewGroup viewGroup0, int v) {
        this.a = v;
        this.b = viewGroup0;
        super();
    }

    private final void a(Editable editable0) {
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        if(this.a != 0 && this.a != 1) {
            TextInputLayout textInputLayout0 = (TextInputLayout)this.b;
            textInputLayout0.u(!textInputLayout0.D0, false);
            if(textInputLayout0.o) {
                textInputLayout0.n(editable0);
            }
            if(textInputLayout0.w) {
                textInputLayout0.v(editable0);
            }
        }
    }

    private final void b(Editable editable0) {
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    private final void c(CharSequence charSequence0, int v, int v1, int v2) {
    }

    private final void d(CharSequence charSequence0, int v, int v1, int v2) {
    }

    private final void e(CharSequence charSequence0, int v, int v1, int v2) {
    }

    private final void f(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        switch(this.a) {
            case 0: {
                SearchView searchView0 = (SearchView)this.b;
                Editable editable0 = searchView0.p.getText();
                searchView0.c0 = editable0;
                boolean z = TextUtils.isEmpty(editable0);
                searchView0.n(!z);
                searchView0.p(z);
                searchView0.j();
                searchView0.m();
                if(searchView0.K != null && !TextUtils.equals(charSequence0, searchView0.b0)) {
                    searchView0.K.onQueryTextChange(charSequence0.toString());
                }
                searchView0.b0 = charSequence0.toString();
                return;
            }
            case 1: {
                int v3 = charSequence0.length() <= 0 ? 8 : 0;
                ((com.google.android.material.search.SearchView)this.b).k.setVisibility(v3);
            }
        }
    }
}

