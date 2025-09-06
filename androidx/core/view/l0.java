package androidx.core.view;

import android.view.View.OnUnhandledKeyEventListener;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import androidx.core.R.id;
import androidx.core.view.autofill.AutofillIdCompat;
import java.util.Objects;

public abstract class l0 {
    @DoNotInline
    public static void a(@NonNull View view0, @NonNull OnUnhandledKeyEventListenerCompat viewCompat$OnUnhandledKeyEventListenerCompat0) {
        SimpleArrayMap simpleArrayMap0 = (SimpleArrayMap)view0.getTag(id.tag_unhandled_key_listeners);
        if(simpleArrayMap0 == null) {
            simpleArrayMap0 = new SimpleArrayMap();
            view0.setTag(id.tag_unhandled_key_listeners, simpleArrayMap0);
        }
        Objects.requireNonNull(viewCompat$OnUnhandledKeyEventListenerCompat0);
        k0 k00 = new k0(viewCompat$OnUnhandledKeyEventListenerCompat0);
        simpleArrayMap0.put(viewCompat$OnUnhandledKeyEventListenerCompat0, k00);
        view0.addOnUnhandledKeyEventListener(k00);
    }

    @DoNotInline
    public static CharSequence b(View view0) {
        return view0.getAccessibilityPaneTitle();
    }

    @DoNotInline
    public static boolean c(View view0) {
        return view0.isAccessibilityHeading();
    }

    @DoNotInline
    public static boolean d(View view0) {
        return view0.isScreenReaderFocusable();
    }

    @DoNotInline
    public static void e(@NonNull View view0, @NonNull OnUnhandledKeyEventListenerCompat viewCompat$OnUnhandledKeyEventListenerCompat0) {
        SimpleArrayMap simpleArrayMap0 = (SimpleArrayMap)view0.getTag(id.tag_unhandled_key_listeners);
        if(simpleArrayMap0 == null) {
            return;
        }
        View.OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener0 = (View.OnUnhandledKeyEventListener)simpleArrayMap0.get(viewCompat$OnUnhandledKeyEventListenerCompat0);
        if(view$OnUnhandledKeyEventListener0 != null) {
            view0.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener0);
        }
    }

    @DoNotInline
    public static Object f(View view0, int v) {
        return view0.requireViewById(v);
    }

    @DoNotInline
    public static void g(View view0, boolean z) {
        view0.setAccessibilityHeading(z);
    }

    @DoNotInline
    public static void h(View view0, CharSequence charSequence0) {
        view0.setAccessibilityPaneTitle(charSequence0);
    }

    @DoNotInline
    public static void i(View view0, AutofillIdCompat autofillIdCompat0) {
        view0.setAutofillId((autofillIdCompat0 == null ? null : autofillIdCompat0.toAutofillId()));
    }

    @DoNotInline
    public static void j(View view0, boolean z) {
        view0.setScreenReaderFocusable(z);
    }
}

