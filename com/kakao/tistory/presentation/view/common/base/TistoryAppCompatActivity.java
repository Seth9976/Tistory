package com.kakao.tistory.presentation.view.common.base;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.h;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat.Builder;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.webkit.internal.k;
import com.kakao.android.base.extension.LiveDataKt;
import com.kakao.tistory.presentation.viewmodel.SavedStateViewModel;
import com.kakao.tistory.presentation.viewmodel.ThrowableViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001A\u00020\t8\u0014@\u0014X\u0094\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/base/TistoryAppCompatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "c", "I", "getRequestedInsets", "()I", "setRequestedInsets", "(I)V", "requestedInsets", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryAppCompatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryAppCompatActivity.kt\ncom/kakao/tistory/presentation/view/common/base/TistoryAppCompatActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,91:1\n75#2,13:92\n75#2,13:105\n*S KotlinDebug\n*F\n+ 1 TistoryAppCompatActivity.kt\ncom/kakao/tistory/presentation/view/common/base/TistoryAppCompatActivity\n*L\n21#1:92,13\n22#1:105,13\n*E\n"})
public abstract class TistoryAppCompatActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public final ViewModelLazy a;
    public final ViewModelLazy b;
    public int c;

    public TistoryAppCompatActivity() {
        com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity.special..inlined.viewModels.default.1 tistoryAppCompatActivity$special$$inlined$viewModels$default$10 = new Function0() {
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
        this.a = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SavedStateViewModel.class), new Function0() {
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
        }, tistoryAppCompatActivity$special$$inlined$viewModels$default$10, new Function0(this) {
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
        com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity.special..inlined.viewModels.default.4 tistoryAppCompatActivity$special$$inlined$viewModels$default$40 = new Function0() {
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
        this.b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ThrowableViewModel.class), new Function0() {
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
        }, tistoryAppCompatActivity$special$$inlined$viewModels$default$40, new Function0(this) {
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
        this.c = 15;
    }

    public static final WindowInsetsCompat a(TistoryAppCompatActivity tistoryAppCompatActivity0, View view0, WindowInsetsCompat windowInsetsCompat0) {
        Intrinsics.checkNotNullParameter(tistoryAppCompatActivity0, "this$0");
        Intrinsics.checkNotNullParameter(view0, "v");
        Intrinsics.checkNotNullParameter(windowInsetsCompat0, "insets");
        Insets insets0 = windowInsetsCompat0.getInsets(tistoryAppCompatActivity0.getRequestedInsets());
        Intrinsics.checkNotNullExpressionValue(insets0, "getInsets(...)");
        Insets insets1 = windowInsetsCompat0.getInsets(0x8F & ~tistoryAppCompatActivity0.getRequestedInsets());
        Intrinsics.checkNotNullExpressionValue(insets1, "getInsets(...)");
        view0.setPadding(insets0.left + insets1.left, insets0.top, insets0.right + insets1.right, insets0.bottom);
        return new Builder(windowInsetsCompat0).setInsets(tistoryAppCompatActivity0.getRequestedInsets(), Insets.NONE).build();
    }

    public final void a() {
        ViewCompat.setOnApplyWindowInsetsListener(this.getWindow().getDecorView(), new h(this, 18));
    }

    public int getRequestedInsets() {
        return this.c;
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        EdgeToEdge.enable$default(this, null, null, 3, null);
        super.onCreate(bundle0);
        this.a();
        Window window0 = this.getWindow();
        if(Build.VERSION.SDK_INT >= 29) {
            k.u(window0);
        }
        else {
            window0.setNavigationBarColor(0);
        }
        ((SavedStateViewModel)this.a.getValue()).init();
        ThrowableViewModel throwableViewModel0 = (ThrowableViewModel)this.b.getValue();
        LiveDataKt.observeEvent(throwableViewModel0.getShowSessionErrorDialog(), this, new f(this));
        LiveDataKt.observeEvent(throwableViewModel0.getShowInspectionDialog(), this, new com.kakao.tistory.presentation.view.common.base.h(this));
    }

    public void setRequestedInsets(int v) {
        this.c = v;
    }
}

