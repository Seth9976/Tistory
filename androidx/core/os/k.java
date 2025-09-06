package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

public final class k implements LocaleListInterface {
    public final LocaleList a;

    public k(LocaleList localeList0) {
        this.a = localeList0;
    }

    @Override
    public final boolean equals(Object object0) {
        Object object1 = ((LocaleListInterface)object0).getLocaleList();
        return this.a.equals(object1);
    }

    @Override  // androidx.core.os.LocaleListInterface
    public final Locale get(int v) {
        return this.a.get(v);
    }

    @Override  // androidx.core.os.LocaleListInterface
    public final Locale getFirstMatch(String[] arr_s) {
        return this.a.getFirstMatch(arr_s);
    }

    @Override  // androidx.core.os.LocaleListInterface
    public final Object getLocaleList() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.core.os.LocaleListInterface
    public final int indexOf(Locale locale0) {
        return this.a.indexOf(locale0);
    }

    @Override  // androidx.core.os.LocaleListInterface
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override  // androidx.core.os.LocaleListInterface
    public final int size() {
        return this.a.size();
    }

    @Override  // androidx.core.os.LocaleListInterface
    public final String toLanguageTags() {
        return this.a.toLanguageTags();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

