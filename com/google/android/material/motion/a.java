package com.google.android.material.motion;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a0;
import java.util.Objects;

public class a implements BackCallbackDelegate {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(MaterialBackHandler materialBackHandler0) {
        Objects.requireNonNull(materialBackHandler0);
        return new a0(materialBackHandler0, 2);
    }

    @Override  // com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate
    @DoNotInline
    public void startListeningForBackCallbacks(@NonNull MaterialBackHandler materialBackHandler0, @NonNull View view0, boolean z) {
        if(this.a != null) {
            return;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher0 = view0.findOnBackInvokedDispatcher();
        if(onBackInvokedDispatcher0 == null) {
            return;
        }
        OnBackInvokedCallback onBackInvokedCallback0 = this.a(materialBackHandler0);
        this.a = onBackInvokedCallback0;
        onBackInvokedDispatcher0.registerOnBackInvokedCallback((z ? 1000000 : 0), onBackInvokedCallback0);
    }

    @Override  // com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate
    @DoNotInline
    public void stopListeningForBackCallbacks(@NonNull View view0) {
        OnBackInvokedDispatcher onBackInvokedDispatcher0 = view0.findOnBackInvokedDispatcher();
        if(onBackInvokedDispatcher0 == null) {
            return;
        }
        onBackInvokedDispatcher0.unregisterOnBackInvokedCallback(this.a);
        this.a = null;
    }
}

