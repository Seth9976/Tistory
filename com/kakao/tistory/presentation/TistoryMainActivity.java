package com.kakao.tistory.presentation;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.kakao.tistory.presentation.common.utils.PermissionUtils;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000B\u001A\u00020\u00062\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000B\u0010\fR\"\u0010\u0014\u001A\u00020\r8\u0014@\u0014X\u0094\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/TistoryMainActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryAppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "startActivity", "(Landroid/content/Intent;)V", "", "h", "I", "getRequestedInsets", "()I", "setRequestedInsets", "(I)V", "requestedInsets", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryMainActivity.kt\ncom/kakao/tistory/presentation/TistoryMainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,57:1\n75#2,13:58\n*S KotlinDebug\n*F\n+ 1 TistoryMainActivity.kt\ncom/kakao/tistory/presentation/TistoryMainActivity\n*L\n19#1:58,13\n*E\n"})
public final class TistoryMainActivity extends Hilt_TistoryMainActivity {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/TistoryMainActivity$Companion;", "", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final ViewModelLazy g;
    public int h;

    static {
        TistoryMainActivity.Companion = new Companion(null);
        TistoryMainActivity.$stable = 8;
    }

    public TistoryMainActivity() {
        com.kakao.tistory.presentation.TistoryMainActivity.special..inlined.viewModels.default.1 tistoryMainActivity$special$$inlined$viewModels$default$10 = new Function0() {
            public final ComponentActivity a;

            {
                this.a = componentActivity0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.a.getDefaultViewModelProviderFactory();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.g = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TistoryMainViewModel.class), new Function0() {
            public final ComponentActivity a;

            {
                this.a = componentActivity0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return this.a.getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, tistoryMainActivity$special$$inlined$viewModels$default$10, new Function0(this) {
            public final Function0 a;
            public final ComponentActivity b;

            {
                this.a = function00;
                this.b = componentActivity0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                Function0 function00 = this.a;
                if(function00 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)function00.invoke();
                    return creationExtras0 == null ? this.b.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.b.getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.h = 8;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity
    public int getRequestedInsets() {
        return this.h;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ComponentActivityKt.setContent$default(this, null, ComposableSingletons.TistoryMainActivityKt.INSTANCE.getLambda-2$presentation_prodRelease(), 1, null);
        if(Build.VERSION.SDK_INT >= 33 && !PermissionUtils.INSTANCE.hasNotificationPermission(this) && !ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.POST_NOTIFICATIONS")) {
            this.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 0xD3);
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity
    public void setRequestedInsets(int v) {
        this.h = v;
    }

    @Override  // android.app.Activity
    public void startActivity(@Nullable Intent intent0) {
        ((TistoryMainViewModel)this.g.getValue()).clearEntryChangeList();
        super.startActivity(intent0);
    }
}

