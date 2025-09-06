package com.google.android.play.core.ktx;

import android.content.IntentSender.SendIntentException;
import androidx.appcompat.view.menu.f;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import k8.a;
import k8.c;
import k8.d;
import k8.e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A5\u0010 \u001A\u0002H!\"\u0004\b\u0000\u0010!2\f\u0010\"\u001A\b\u0012\u0004\u0012\u0002H!0#2\u000E\b\u0002\u0010$\u001A\b\u0012\u0004\u0012\u00020&0%H\u0080@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\'\u001A\u0015\u0010(\u001A\u00020\u0002*\u00020)H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010*\u001A\u0015\u0010+\u001A\u00020&*\u00020)H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010*\u001A\u0010\u0010,\u001A\b\u0012\u0004\u0012\u00020.0-*\u00020)\u001A*\u0010/\u001A\u00020\f*\u00020)2\u0006\u00100\u001A\u00020\u00022\u0006\u00101\u001A\u0002022\u0006\u00103\u001A\u0002042\u0006\u00105\u001A\u00020\b\u001A%\u00106\u001A\u00020\f\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u0002H7082\u0006\u00109\u001A\u0002H7H\u0000\u00A2\u0006\u0002\u0010:\"\u0016\u0010\u0000\u001A\u00020\u0001*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0000\u001A\u00020\u0001*\u00020\u00058\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0003\u0010\u0006\"\u0018\u0010\u0007\u001A\u0004\u0018\u00010\b*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\t\u0010\n\"\u0016\u0010\u000B\u001A\u00020\f*\u00020\u00058\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\r\u0010\u000E\"\u0016\u0010\u000F\u001A\u00020\b*\u00020\u00058\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0012\u001A\u00020\b*\u00020\u00028\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014\"\u0016\u0010\u0012\u001A\u00020\b*\u00020\u00058\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0011\"\u0016\u0010\u0015\u001A\u00020\f*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016\"\u0016\u0010\u0017\u001A\u00020\f*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0016\"\u0016\u0010\u0018\u001A\u00020\u0019*\u00020\u00058\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u001A\u0010\u001B\"\u0016\u0010\u001C\u001A\u00020\u0001*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u001D\u0010\u0004\"\u0016\u0010\u001C\u001A\u00020\u0001*\u00020\u00058\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u001D\u0010\u0006\"\u0016\u0010\u001E\u001A\u00020\b*\u00020\u00028\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006;"}, d2 = {"bytesDownloaded", "", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getBytesDownloaded", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)J", "Lcom/google/android/play/core/install/InstallState;", "(Lcom/google/android/play/core/install/InstallState;)J", "clientVersionStalenessDays", "", "getClientVersionStalenessDays", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Ljava/lang/Integer;", "hasTerminalStatus", "", "getHasTerminalStatus", "(Lcom/google/android/play/core/install/InstallState;)Z", "installErrorCode", "getInstallErrorCode", "(Lcom/google/android/play/core/install/InstallState;)I", "installStatus", "getInstallStatus", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)I", "isFlexibleUpdateAllowed", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Z", "isImmediateUpdateAllowed", "packageName", "", "getPackageName", "(Lcom/google/android/play/core/install/InstallState;)Ljava/lang/String;", "totalBytesToDownload", "getTotalBytesToDownload", "updatePriority", "getUpdatePriority", "runTask", "T", "task", "Lcom/google/android/gms/tasks/Task;", "onCanceled", "Lkotlin/Function0;", "", "(Lcom/google/android/gms/tasks/Task;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestAppUpdateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCompleteUpdate", "requestUpdateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "startUpdateFlowForResult", "appUpdateInfo", "fragment", "Landroidx/fragment/app/Fragment;", "options", "Lcom/google/android/play/core/appupdate/AppUpdateOptions;", "requestCode", "tryOffer", "E", "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AppUpdateManagerKtxKt {
    public static final long getBytesDownloaded(@NotNull AppUpdateInfo appUpdateInfo0) {
        Intrinsics.checkNotNullParameter(appUpdateInfo0, "<this>");
        return appUpdateInfo0.bytesDownloaded();
    }

    public static final long getBytesDownloaded(@NotNull InstallState installState0) {
        Intrinsics.checkNotNullParameter(installState0, "<this>");
        return installState0.bytesDownloaded();
    }

    @Nullable
    public static final Integer getClientVersionStalenessDays(@NotNull AppUpdateInfo appUpdateInfo0) {
        Intrinsics.checkNotNullParameter(appUpdateInfo0, "<this>");
        return appUpdateInfo0.clientVersionStalenessDays();
    }

    public static final boolean getHasTerminalStatus(@NotNull InstallState installState0) {
        Intrinsics.checkNotNullParameter(installState0, "<this>");
        switch(installState0.installStatus()) {
            case 0: 
            case 5: 
            case 6: 
            case 11: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @InstallErrorCode
    public static final int getInstallErrorCode(@NotNull InstallState installState0) {
        Intrinsics.checkNotNullParameter(installState0, "<this>");
        return installState0.installErrorCode();
    }

    @InstallStatus
    public static final int getInstallStatus(@NotNull AppUpdateInfo appUpdateInfo0) {
        Intrinsics.checkNotNullParameter(appUpdateInfo0, "<this>");
        return appUpdateInfo0.installStatus();
    }

    @InstallStatus
    public static final int getInstallStatus(@NotNull InstallState installState0) {
        Intrinsics.checkNotNullParameter(installState0, "<this>");
        return installState0.installStatus();
    }

    @NotNull
    public static final String getPackageName(@NotNull InstallState installState0) {
        Intrinsics.checkNotNullParameter(installState0, "<this>");
        String s = installState0.packageName();
        Intrinsics.checkNotNullExpressionValue(s, "packageName()");
        return s;
    }

    public static final long getTotalBytesToDownload(@NotNull AppUpdateInfo appUpdateInfo0) {
        Intrinsics.checkNotNullParameter(appUpdateInfo0, "<this>");
        return appUpdateInfo0.totalBytesToDownload();
    }

    public static final long getTotalBytesToDownload(@NotNull InstallState installState0) {
        Intrinsics.checkNotNullParameter(installState0, "<this>");
        return installState0.totalBytesToDownload();
    }

    public static final int getUpdatePriority(@NotNull AppUpdateInfo appUpdateInfo0) {
        Intrinsics.checkNotNullParameter(appUpdateInfo0, "<this>");
        return appUpdateInfo0.updatePriority();
    }

    public static final boolean isFlexibleUpdateAllowed(@NotNull AppUpdateInfo appUpdateInfo0) {
        Intrinsics.checkNotNullParameter(appUpdateInfo0, "<this>");
        return appUpdateInfo0.isUpdateTypeAllowed(0);
    }

    public static final boolean isImmediateUpdateAllowed(@NotNull AppUpdateInfo appUpdateInfo0) {
        Intrinsics.checkNotNullParameter(appUpdateInfo0, "<this>");
        return appUpdateInfo0.isUpdateTypeAllowed(1);
    }

    @Nullable
    public static final Object requestAppUpdateInfo(@NotNull AppUpdateManager appUpdateManager0, @NotNull Continuation continuation0) {
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.p;
            if((v & 0x80000000) == 0) {
                a0 = new a(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                a0.p = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = a0.o;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Task task0 = appUpdateManager0.getAppUpdateInfo();
                Intrinsics.checkNotNullExpressionValue(task0, "appUpdateInfo");
                a0.p = 1;
                object0 = AppUpdateManagerKtxKt.runTask$default(task0, null, a0, 2, null);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Intrinsics.checkNotNullExpressionValue(object0, "runTask(appUpdateInfo)");
        return object0;
    }

    @Nullable
    public static final Object requestCompleteUpdate(@NotNull AppUpdateManager appUpdateManager0, @NotNull Continuation continuation0) {
        Task task0 = appUpdateManager0.completeUpdate();
        Intrinsics.checkNotNullExpressionValue(task0, "completeUpdate()");
        Object object0 = AppUpdateManagerKtxKt.runTask$default(task0, null, continuation0, 2, null);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public static final Flow requestUpdateFlow(@NotNull AppUpdateManager appUpdateManager0) throws InstallException {
        Intrinsics.checkNotNullParameter(appUpdateManager0, "<this>");
        return FlowKt.conflate(FlowKt.callbackFlow(new c(appUpdateManager0, null)));
    }

    @Nullable
    public static final Object runTask(@NotNull Task task0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        cancellableContinuationImpl0.invokeOnCancellation(new aa.a(function00, 12));
        if(!task0.isComplete()) {
            task0.addOnSuccessListener(new e(cancellableContinuationImpl0));
            task0.addOnFailureListener(new e(cancellableContinuationImpl0));
        }
        else if(task0.isSuccessful()) {
            cancellableContinuationImpl0.resumeWith(Result.constructor-impl(task0.getResult()));
        }
        else {
            Exception exception0 = task0.getException();
            Intrinsics.checkNotNull(exception0);
            cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(exception0)));
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == qd.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    public static Object runTask$default(Task task0, Function0 function00, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            function00 = d.w;
        }
        return AppUpdateManagerKtxKt.runTask(task0, function00, continuation0);
    }

    public static final boolean startUpdateFlowForResult(@NotNull AppUpdateManager appUpdateManager0, @NotNull AppUpdateInfo appUpdateInfo0, @NotNull Fragment fragment0, @NotNull AppUpdateOptions appUpdateOptions0, int v) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(appUpdateManager0, "<this>");
        Intrinsics.checkNotNullParameter(appUpdateInfo0, "appUpdateInfo");
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        Intrinsics.checkNotNullParameter(appUpdateOptions0, "options");
        return appUpdateManager0.startUpdateFlowForResult(appUpdateInfo0, new f(fragment0, 24), appUpdateOptions0, v);
    }

    public static final boolean tryOffer(@NotNull SendChannel sendChannel0, Object object0) {
        Intrinsics.checkNotNullParameter(sendChannel0, "<this>");
        return ChannelResult.isSuccess-impl(sendChannel0.trySend-JP2dKIU(object0));
    }
}

