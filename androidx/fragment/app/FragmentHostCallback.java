package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class FragmentHostCallback extends FragmentContainer {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final int d;
    public final d1 e;

    public FragmentHostCallback(Activity activity0, Context context0, Handler handler0, int v) {
        this.e = new d1();  // 初始化器: Landroidx/fragment/app/FragmentManager;-><init>()V
        this.a = activity0;
        this.b = (Context)Preconditions.checkNotNull(context0, "context == null");
        this.c = (Handler)Preconditions.checkNotNull(handler0, "handler == null");
        this.d = v;
    }

    public FragmentHostCallback(@NonNull Context context0, @NonNull Handler handler0, int v) {
        this((context0 instanceof Activity ? ((Activity)context0) : null), context0, handler0, v);
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY})
    public Handler getHandler() {
        return this.c;
    }

    public void onDump(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
    }

    @Override  // androidx.fragment.app.FragmentContainer
    @Nullable
    public View onFindViewById(int v) {
        return null;
    }

    @Nullable
    public abstract Object onGetHost();

    @NonNull
    public LayoutInflater onGetLayoutInflater() {
        return LayoutInflater.from(this.b);
    }

    public int onGetWindowAnimations() {
        return this.d;
    }

    @Override  // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
        return true;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    @Deprecated
    public void onRequestPermissionsFromFragment(@NonNull Fragment fragment0, @NonNull String[] arr_s, int v) {
    }

    public boolean onShouldSaveFragmentState(@NonNull Fragment fragment0) {
        return true;
    }

    public boolean onShouldShowRequestPermissionRationale(@NonNull String s) {
        return false;
    }

    public void onStartActivityFromFragment(@NonNull Fragment fragment0, @NonNull Intent intent0, int v) {
        this.onStartActivityFromFragment(fragment0, intent0, v, null);
    }

    public void onStartActivityFromFragment(@NonNull Fragment fragment0, @NonNull Intent intent0, int v, @Nullable Bundle bundle0) {
        if(v != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(this.b, intent0, bundle0);
    }

    @Deprecated
    public void onStartIntentSenderFromFragment(@NonNull Fragment fragment0, @NonNull IntentSender intentSender0, int v, @Nullable Intent intent0, int v1, int v2, int v3, @Nullable Bundle bundle0) throws IntentSender.SendIntentException {
        if(v != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        ActivityCompat.startIntentSenderForResult(this.a, intentSender0, -1, intent0, v1, v2, v3, bundle0);
    }

    public void onSupportInvalidateOptionsMenu() {
    }
}

