package androidx.browser.browseractions;

import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;

@RestrictTo({Scope.LIBRARY_GROUP})
@VisibleForTesting
interface BrowserActionsFallbackMenuUi.BrowserActionsFallMenuUiListener {
    void onMenuShown(View arg1);
}

