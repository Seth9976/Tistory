package com.google.android.material.motion;

import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class MaterialBackOrchestrator {
    interface BackCallbackDelegate {
        void startListeningForBackCallbacks(@NonNull MaterialBackHandler arg1, @NonNull View arg2, boolean arg3);

        void stopListeningForBackCallbacks(@NonNull View arg1);
    }

    public final a a;
    public final MaterialBackHandler b;
    public final View c;

    public MaterialBackOrchestrator(@NonNull View view0) {
        this(((MaterialBackHandler)view0), view0);
    }

    public MaterialBackOrchestrator(@NonNull MaterialBackHandler materialBackHandler0, @NonNull View view0) {
        a a0;
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            a0 = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        else {
            a0 = v < 33 ? null : new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        this.a = a0;
        this.b = materialBackHandler0;
        this.c = view0;
    }

    public boolean shouldListenForBackCallbacks() {
        return this.a != null;
    }

    public void startListeningForBackCallbacks() {
        a a0 = this.a;
        if(a0 != null) {
            a0.startListeningForBackCallbacks(this.b, this.c, false);
        }
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        a a0 = this.a;
        if(a0 != null) {
            a0.startListeningForBackCallbacks(this.b, this.c, true);
        }
    }

    public void stopListeningForBackCallbacks() {
        a a0 = this.a;
        if(a0 != null) {
            a0.stopListeningForBackCallbacks(this.c);
        }
    }
}

