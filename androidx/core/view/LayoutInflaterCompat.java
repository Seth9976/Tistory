package androidx.core.view;

import android.view.LayoutInflater.Factory2;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;

public final class LayoutInflaterCompat {
    @Deprecated
    public static LayoutInflaterFactory getFactory(LayoutInflater layoutInflater0) {
        LayoutInflater.Factory layoutInflater$Factory0 = layoutInflater0.getFactory();
        return layoutInflater$Factory0 instanceof p ? ((p)layoutInflater$Factory0).a : null;
    }

    @Deprecated
    public static void setFactory(@NonNull LayoutInflater layoutInflater0, @NonNull LayoutInflaterFactory layoutInflaterFactory0) {
        layoutInflater0.setFactory2(new p(layoutInflaterFactory0));
    }

    public static void setFactory2(@NonNull LayoutInflater layoutInflater0, @NonNull LayoutInflater.Factory2 layoutInflater$Factory20) {
        layoutInflater0.setFactory2(layoutInflater$Factory20);
    }
}

