package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public final class SupportFragmentWrapper extends Stub {
    public Fragment a;

    @Nullable
    @KeepForSdk
    public static SupportFragmentWrapper wrap(@Nullable Fragment fragment0) {
        if(fragment0 != null) {
            SupportFragmentWrapper supportFragmentWrapper0 = new SupportFragmentWrapper();  // 初始化器: Lcom/google/android/gms/dynamic/IFragmentWrapper$Stub;-><init>()V
            supportFragmentWrapper0.a = fragment0;
            return supportFragmentWrapper0;
        }
        return null;
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzA() {
        return this.a.isVisible();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzb() {
        return this.a.getId();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzc() {
        return this.a.getTargetRequestCode();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    public final Bundle zzd() {
        return this.a.getArguments();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    public final IFragmentWrapper zze() {
        return SupportFragmentWrapper.wrap(this.a.getParentFragment());
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    public final IFragmentWrapper zzf() {
        return SupportFragmentWrapper.wrap(this.a.getTargetFragment());
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    @NonNull
    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.a.getActivity());
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    @NonNull
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.a.getResources());
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    @NonNull
    public final IObjectWrapper zzi() {
        return ObjectWrapper.wrap(this.a.getView());
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    public final String zzj() {
        return this.a.getTag();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzk(@NonNull IObjectWrapper iObjectWrapper0) {
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        Preconditions.checkNotNull(view0);
        this.a.registerForContextMenu(view0);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzl(boolean z) {
        this.a.setHasOptionsMenu(z);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzm(boolean z) {
        this.a.setMenuVisibility(z);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzn(boolean z) {
        this.a.setRetainInstance(z);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzo(boolean z) {
        this.a.setUserVisibleHint(z);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzp(@NonNull Intent intent0) {
        this.a.startActivity(intent0);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzq(@NonNull Intent intent0, int v) {
        this.a.startActivityForResult(intent0, v);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzr(@NonNull IObjectWrapper iObjectWrapper0) {
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        Preconditions.checkNotNull(view0);
        this.a.unregisterForContextMenu(view0);
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.a.getRetainInstance();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzt() {
        return this.a.getUserVisibleHint();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzu() {
        return this.a.isAdded();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzv() {
        return this.a.isDetached();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzw() {
        return this.a.isHidden();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzx() {
        return this.a.isInLayout();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzy() {
        return this.a.isRemoving();
    }

    @Override  // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzz() {
        return this.a.isResumed();
    }
}

