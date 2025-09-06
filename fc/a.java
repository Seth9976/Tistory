package fc;

import androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition;
import com.google.android.gms.tasks.OnFailureListener;
import com.kakao.tistory.presentation.view.SplashActivity;

public final class a implements KeepOnScreenCondition, OnFailureListener {
    public final SplashActivity a;

    public a(SplashActivity splashActivity0) {
        this.a = splashActivity0;
        super();
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception0) {
        SplashActivity.a(this.a, exception0);
    }

    @Override  // androidx.core.splashscreen.SplashScreen$KeepOnScreenCondition
    public boolean shouldKeepOnScreen() {
        return SplashActivity.a(this.a);
    }
}

