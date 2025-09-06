package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult;", "", "Available", "Downloaded", "InProgress", "NotAvailable", "Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class AppUpdateResult {
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001B\u0010\f\u001A\u00020\u000B2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u001D\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\f\u0010\u0012J\u001D\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\f\u0010\u0015J\u001B\u0010\u0016\u001A\u00020\u000B2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0016\u0010\rJ\u001D\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\u001D\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "updateInfo", "<init>", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "activityResultLauncher", "", "startFlexibleUpdate", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Landroid/app/Activity;", "activity", "", "requestCode", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;I)Z", "startImmediateUpdate", "b", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getUpdateInfo", "()Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Available extends AppUpdateResult {
        public final AppUpdateManager a;
        public final AppUpdateInfo b;

        public Available(@NotNull AppUpdateManager appUpdateManager0, @NotNull AppUpdateInfo appUpdateInfo0) {
            Intrinsics.checkNotNullParameter(appUpdateManager0, "appUpdateManager");
            Intrinsics.checkNotNullParameter(appUpdateInfo0, "updateInfo");
            super(null);
            this.a = appUpdateManager0;
            this.b = appUpdateInfo0;
        }

        @NotNull
        public final AppUpdateInfo getUpdateInfo() {
            return this.b;
        }

        public final boolean startFlexibleUpdate(@NotNull Activity activity0, int v) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            AppUpdateOptions appUpdateOptions0 = AppUpdateOptions.newBuilder(0).build();
            return this.a.startUpdateFlowForResult(this.b, activity0, appUpdateOptions0, v);
        }

        public final boolean startFlexibleUpdate(@NotNull ActivityResultLauncher activityResultLauncher0) {
            Intrinsics.checkNotNullParameter(activityResultLauncher0, "activityResultLauncher");
            AppUpdateOptions appUpdateOptions0 = AppUpdateOptions.newBuilder(0).build();
            return this.a.startUpdateFlowForResult(this.b, activityResultLauncher0, appUpdateOptions0);
        }

        public final boolean startFlexibleUpdate(@NotNull Fragment fragment0, int v) {
            Intrinsics.checkNotNullParameter(fragment0, "fragment");
            AppUpdateOptions appUpdateOptions0 = AppUpdateOptions.newBuilder(0).build();
            Intrinsics.checkNotNullExpressionValue(appUpdateOptions0, "newBuilder(AppUpdateType.FLEXIBLE).build()");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(this.a, this.b, fragment0, appUpdateOptions0, v);
        }

        public final boolean startImmediateUpdate(@NotNull Activity activity0, int v) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            AppUpdateOptions appUpdateOptions0 = AppUpdateOptions.newBuilder(1).build();
            return this.a.startUpdateFlowForResult(this.b, activity0, appUpdateOptions0, v);
        }

        public final boolean startImmediateUpdate(@NotNull ActivityResultLauncher activityResultLauncher0) {
            Intrinsics.checkNotNullParameter(activityResultLauncher0, "activityResultLauncher");
            AppUpdateOptions appUpdateOptions0 = AppUpdateOptions.newBuilder(1).build();
            return this.a.startUpdateFlowForResult(this.b, activityResultLauncher0, appUpdateOptions0);
        }

        public final boolean startImmediateUpdate(@NotNull Fragment fragment0, int v) {
            Intrinsics.checkNotNullParameter(fragment0, "fragment");
            AppUpdateOptions appUpdateOptions0 = AppUpdateOptions.newBuilder(1).build();
            Intrinsics.checkNotNullExpressionValue(appUpdateOptions0, "newBuilder(AppUpdateType.IMMEDIATE).build()");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(this.a, this.b, fragment0, appUpdateOptions0, v);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001A\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateManager", "<init>", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;)V", "", "completeUpdate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Downloaded extends AppUpdateResult {
        public final AppUpdateManager a;

        public Downloaded(@NotNull AppUpdateManager appUpdateManager0) {
            Intrinsics.checkNotNullParameter(appUpdateManager0, "appUpdateManager");
            super(null);
            this.a = appUpdateManager0;
        }

        @Nullable
        public final Object completeUpdate(@NotNull Continuation continuation0) {
            Object object0 = AppUpdateManagerKtxKt.requestCompleteUpdate(this.a, continuation0);
            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/google/android/play/core/install/InstallState;", "installState", "<init>", "(Lcom/google/android/play/core/install/InstallState;)V", "a", "Lcom/google/android/play/core/install/InstallState;", "getInstallState", "()Lcom/google/android/play/core/install/InstallState;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class InProgress extends AppUpdateResult {
        public final InstallState a;

        public InProgress(@NotNull InstallState installState0) {
            Intrinsics.checkNotNullParameter(installState0, "installState");
            super(null);
            this.a = installState0;
        }

        @NotNull
        public final InstallState getInstallState() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class NotAvailable extends AppUpdateResult {
        @NotNull
        public static final NotAvailable INSTANCE;

        static {
            NotAvailable.INSTANCE = new NotAvailable(null);  // 初始化器: Lcom/google/android/play/core/ktx/AppUpdateResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public AppUpdateResult(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

