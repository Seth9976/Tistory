package com.kakao.tiara;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashMap;

public class TiaraSettings {
    public static class Builder {
        public Integer a;
        public Integer b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public Boolean k;
        public String l;
        public Boolean m;
        public Boolean n;
        public Boolean o;
        public HashMap p;
        public HashMap q;

        public Builder accessToken(String s) {
            this.i = s;
            return this;
        }

        public Builder accountId(String s) {
            this.h = s;
            return this;
        }

        public Builder adid(String s) {
            this.j = s;
            return this;
        }

        public Builder appAdTrackId(String s) {
            this.d = s;
            return this;
        }

        public Builder appUserId(String s) {
            this.e = s;
            return this;
        }

        public Builder batchInterval(int v) {
            this.a = v;
            return this;
        }

        public Builder batchSize(int v) {
            this.b = v;
            return this;
        }

        @NonNull
        public TiaraSettings build() {
            TiaraSettings tiaraSettings0 = new TiaraSettings();  // 初始化器: Ljava/lang/Object;-><init>()V
            tiaraSettings0.f = 300;
            tiaraSettings0.g = 1;
            tiaraSettings0.h = false;
            tiaraSettings0.i = true;
            tiaraSettings0.j = 30;
            tiaraSettings0.k = 5;
            tiaraSettings0.l = this.d;
            tiaraSettings0.n = this.c;
            tiaraSettings0.m = this.e;
            tiaraSettings0.o = this.f;
            tiaraSettings0.p = this.g;
            tiaraSettings0.q = this.h;
            tiaraSettings0.s = this.j;
            tiaraSettings0.r = this.i;
            tiaraSettings0.u = this.l;
            tiaraSettings0.v = this.m;
            tiaraSettings0.w = this.n;
            tiaraSettings0.y = this.p;
            tiaraSettings0.z = this.q;
            tiaraSettings0.x = this.o;
            tiaraSettings0.t = this.k;
            Integer integer0 = this.a;
            if(integer0 != null) {
                tiaraSettings0.j = (int)integer0;
            }
            Integer integer1 = this.b;
            if(integer1 != null) {
                tiaraSettings0.k = (int)integer1;
            }
            return tiaraSettings0;
        }

        public Builder daumUserId(String s) {
            this.f = s;
            return this;
        }

        public Builder deployment(String s) {
            this.c = s;
            return this;
        }

        public Builder disableAppLog() {
            this.o = Boolean.FALSE;
            return this;
        }

        public Builder enableAppLog() {
            this.o = Boolean.TRUE;
            return this;
        }

        public Builder kakaoAppKey(String s) {
            this.l = s;
            return this;
        }

        public Builder limitAdTrackingEnabled(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public Builder melonId(String s) {
            this.g = s;
            return this;
        }

        public Builder thirdAdAgree(Boolean boolean0) {
            this.n = boolean0;
            return this;
        }

        public Builder thirdProvideAgree(Boolean boolean0) {
            this.m = boolean0;
            return this;
        }

        public Builder userExAccount(HashMap hashMap0) {
            this.p = hashMap0;
            return this;
        }

        public Builder userExAnonymous(HashMap hashMap0) {
            this.q = hashMap0;
            return this;
        }
    }

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public Boolean t;
    public String u;
    public Boolean v;
    public Boolean w;
    public Boolean x;
    public HashMap y;
    public HashMap z;

    public final void a() {
        if(this.h && this.i) {
            Boolean boolean0 = this.t;
            if(boolean0 != null) {
                a.d("DaumKakaoAdTrackingEnabled", (boolean0.booleanValue() ? "0" : "1"), 1, 10, a.a);
            }
        }
    }

    public final void b() {
        if(this.h && this.i && !TextUtils.isEmpty(this.s)) {
            a.d("DaumKakaoAdID", this.s, 1, 10, a.a);
        }
    }

    public final void c() {
        if(this.h && this.i) {
            a.f(this.b, (this.t == null ? null : Boolean.valueOf(!this.t.booleanValue())), this.s);
        }
    }

    public String getAccessToken() {
        return this.r;
    }

    public String getAccountId() {
        return this.q;
    }

    public String getAdid() {
        return this.s;
    }

    @RestrictTo({Scope.LIBRARY})
    public String getAndIncreaseSeqNum() {
        int v = this.g;
        this.g = v + 1;
        return String.valueOf(v);
    }

    public String getAppAdTrackId() {
        return this.l;
    }

    public String getAppInstallDate() {
        return this.d;
    }

    public String getAppUserId() {
        return this.m;
    }

    public String getAppVersion() {
        return this.c;
    }

    public int getBatchInterval() {
        return this.j;
    }

    public long getBatchIntervalMillis() {
        return ((long)this.j) * 1000L;
    }

    public int getBatchSize() {
        return this.k;
    }

    public String getDaumUserId() {
        return this.o;
    }

    public String getDeployment() {
        return this.n;
    }

    public String getKakaoAppKey() {
        return this.u;
    }

    public Boolean getLimitAdTrackingEnabled() {
        return this.t;
    }

    public String getMelonId() {
        return this.p;
    }

    public int getSessionTimeout() {
        return this.f;
    }

    public String getSvcDomain() {
        return this.e;
    }

    public Boolean getThirdAdAgree() {
        return this.w;
    }

    public Boolean getThirdProvideAgree() {
        return this.v;
    }

    public String getTuid() {
        return this.a;
    }

    public HashMap getUserExAccount() {
        return this.y;
    }

    public HashMap getUserExAnonymous() {
        return this.z;
    }

    public String getUuid() {
        return this.b;
    }

    @Deprecated
    public boolean isLimitAdTrackingEnabled() {
        return this.t != null && this.t.booleanValue();
    }

    public void setAccessToken(String s) {
        this.r = s;
    }

    public void setAccountId(String s) {
        this.q = s;
        if(this.h && this.i) {
            if(TextUtils.isEmpty(s)) {
                a.e("T_UACD", "", "Sat, 01-Jan-1972 00:00:00 GMT", a.a);
                return;
            }
            String s1 = b.a(1, this.q);
            if(s1 != null) {
                a.d("T_UACD", s1, 1, 10, a.a);
            }
        }
    }

    @Deprecated
    public void setAdid(String s) {
        this.s = s;
        this.b();
        this.c();
    }

    public void setAdid(String s, boolean z) {
        this.s = s;
        this.t = Boolean.valueOf(z);
        this.b();
        this.a();
        this.c();
    }

    public void setAppUserId(String s) {
        this.m = s;
    }

    public void setDaumUserId(String s) {
        this.o = s;
    }

    @Deprecated
    public void setLimitAdTrackingEnabled(boolean z) {
        this.t = Boolean.valueOf(z);
        this.a();
        this.c();
    }

    public void setMelonId(String s) {
        this.p = s;
    }

    public void setThirdAdAgree(Boolean boolean0) {
        this.w = boolean0;
    }

    public void setThirdProvideAgree(Boolean boolean0) {
        this.v = boolean0;
    }

    public void setUserExAccount(HashMap hashMap0) {
        this.y = hashMap0;
    }

    public void setUserExAnonymous(HashMap hashMap0) {
        this.z = hashMap0;
    }
}

