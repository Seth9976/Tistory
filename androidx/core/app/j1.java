package androidx.core.app;

import android.app.RemoteInput.Builder;
import android.app.RemoteInput;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;

public abstract class j1 {
    @DoNotInline
    public static RemoteInput.Builder a(RemoteInput.Builder remoteInput$Builder0, Bundle bundle0) {
        return remoteInput$Builder0.addExtras(bundle0);
    }

    @DoNotInline
    public static RemoteInput b(RemoteInput.Builder remoteInput$Builder0) {
        return remoteInput$Builder0.build();
    }

    @DoNotInline
    public static Parcelable c(RemoteInput remoteInput0) {
        return remoteInput0;
    }

    @DoNotInline
    public static RemoteInput.Builder d(String s) {
        return new RemoteInput.Builder(s);
    }

    @DoNotInline
    public static boolean e(RemoteInput remoteInput0) {
        return remoteInput0.getAllowFreeFormInput();
    }

    @DoNotInline
    public static CharSequence[] f(RemoteInput remoteInput0) {
        return remoteInput0.getChoices();
    }

    @DoNotInline
    public static Bundle g(RemoteInput remoteInput0) {
        return remoteInput0.getExtras();
    }

    @DoNotInline
    public static CharSequence h(RemoteInput remoteInput0) {
        return remoteInput0.getLabel();
    }

    @DoNotInline
    public static String i(RemoteInput remoteInput0) {
        return remoteInput0.getResultKey();
    }

    @DoNotInline
    public static RemoteInput.Builder j(RemoteInput.Builder remoteInput$Builder0, boolean z) {
        return remoteInput$Builder0.setAllowFreeFormInput(z);
    }

    @DoNotInline
    public static RemoteInput.Builder k(RemoteInput.Builder remoteInput$Builder0, CharSequence[] arr_charSequence) {
        return remoteInput$Builder0.setChoices(arr_charSequence);
    }

    @DoNotInline
    public static RemoteInput.Builder l(RemoteInput.Builder remoteInput$Builder0, CharSequence charSequence0) {
        return remoteInput$Builder0.setLabel(charSequence0);
    }
}

