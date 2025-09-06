package androidx.core.view;

import android.view.View;
import android.view.autofill.AutofillId;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.util.Collection;

public abstract class j0 {
    @DoNotInline
    public static void a(@NonNull View view0, Collection collection0, int v) {
        view0.addKeyboardNavigationClusters(collection0, v);
    }

    @DoNotInline
    public static AutofillId b(View view0) {
        return view0.getAutofillId();
    }

    @DoNotInline
    public static int c(View view0) {
        return view0.getImportantForAutofill();
    }

    @DoNotInline
    public static int d(@NonNull View view0) {
        return view0.getNextClusterForwardId();
    }

    @DoNotInline
    public static boolean e(@NonNull View view0) {
        return view0.hasExplicitFocusable();
    }

    @DoNotInline
    public static boolean f(@NonNull View view0) {
        return view0.isFocusedByDefault();
    }

    @DoNotInline
    public static boolean g(View view0) {
        return view0.isImportantForAutofill();
    }

    @DoNotInline
    public static boolean h(@NonNull View view0) {
        return view0.isKeyboardNavigationCluster();
    }

    @DoNotInline
    public static View i(@NonNull View view0, View view1, int v) {
        return view0.keyboardNavigationClusterSearch(view1, v);
    }

    @DoNotInline
    public static boolean j(@NonNull View view0) {
        return view0.restoreDefaultFocus();
    }

    @DoNotInline
    public static void k(@NonNull View view0, String[] arr_s) {
        view0.setAutofillHints(arr_s);
    }

    @DoNotInline
    public static void l(@NonNull View view0, boolean z) {
        view0.setFocusedByDefault(z);
    }

    @DoNotInline
    public static void m(View view0, int v) {
        view0.setImportantForAutofill(v);
    }

    @DoNotInline
    public static void n(@NonNull View view0, boolean z) {
        view0.setKeyboardNavigationCluster(z);
    }

    @DoNotInline
    public static void o(View view0, int v) {
        view0.setNextClusterForwardId(v);
    }

    @DoNotInline
    public static void p(@NonNull View view0, CharSequence charSequence0) {
        view0.setTooltipText(charSequence0);
    }
}

