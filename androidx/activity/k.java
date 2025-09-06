package androidx.activity;

import android.app.Application;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.SavedStateViewModelFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final int w;
    public final ComponentActivity x;

    public k(ComponentActivity componentActivity0, int v) {
        this.w = v;
        this.x = componentActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                Application application0 = this.x.getApplication();
                return this.x.getIntent() == null ? new SavedStateViewModelFactory(application0, this.x, null) : new SavedStateViewModelFactory(application0, this.x, this.x.getIntent().getExtras());
            }
            case 1: {
                this.x.reportFullyDrawn();
                return Unit.INSTANCE;
            }
            default: {
                ComponentActivity componentActivity0 = this.x;
                OnBackPressedDispatcher onBackPressedDispatcher0 = new OnBackPressedDispatcher(new a(componentActivity0, 1));
                if(Build.VERSION.SDK_INT >= 33) {
                    if(!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new m(0, componentActivity0, onBackPressedDispatcher0));
                        return onBackPressedDispatcher0;
                    }
                    ComponentActivity.access$addObserverForBackInvoker(componentActivity0, onBackPressedDispatcher0);
                }
                return onBackPressedDispatcher0;
            }
        }
    }
}

