package com.google.android.gms.measurement.internal;

import a5.b;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzaq extends b0 {
    public long b;
    public String c;
    public AccountManager d;
    public Boolean e;
    public long f;

    public final long a() {
        this.zzg();
        return this.f;
    }

    public final boolean b() {
        this.zzg();
        long v = this.zzt.zzav().currentTimeMillis();
        if(Long.compare(v - this.f, 86400000L) > 0) {
            this.e = null;
        }
        Boolean boolean0 = this.e;
        if(boolean0 == null) {
            if(ContextCompat.checkSelfPermission(this.zzt.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
                this.zzt.zzay().zzm().zza("Permission error checking for dasher/unicorn accounts");
                this.f = v;
                this.e = Boolean.FALSE;
                return false;
            }
            if(this.d == null) {
                this.d = AccountManager.get(this.zzt.zzau());
            }
            try {
                Account[] arr_account = (Account[])this.d.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if(arr_account != null && arr_account.length > 0) {
                    this.e = Boolean.TRUE;
                    this.f = v;
                    return true;
                }
                Account[] arr_account1 = (Account[])this.d.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if(arr_account1 != null && arr_account1.length > 0) {
                    this.e = Boolean.TRUE;
                    this.f = v;
                    return true;
                }
            }
            catch(AuthenticatorException | IOException | OperationCanceledException authenticatorException0) {
                this.zzt.zzay().zzh().zzb("Exception checking account types", authenticatorException0);
            }
            this.f = v;
            this.e = Boolean.FALSE;
            return false;
        }
        return boolean0.booleanValue();
    }

    public final long zzb() {
        this.zzu();
        return this.b;
    }

    public final String zzc() {
        this.zzu();
        return this.c;
    }

    @Override  // com.google.android.gms.measurement.internal.b0
    public final boolean zzf() {
        Calendar calendar0 = Calendar.getInstance();
        TimeUnit timeUnit0 = TimeUnit.MINUTES;
        int v = calendar0.get(15);
        this.b = timeUnit0.convert(((long)(calendar0.get(16) + v)), TimeUnit.MILLISECONDS);
        Locale locale0 = Locale.getDefault();
        String s = locale0.getLanguage();
        Locale locale1 = Locale.ENGLISH;
        this.c = b.m(s.toLowerCase(locale1), "-", locale0.getCountry().toLowerCase(locale1));
        return false;
    }
}

