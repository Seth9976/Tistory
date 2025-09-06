package com.kakao.tiara;

import androidx.annotation.NonNull;

public class TiaraConfiguration {
    public static class Builder {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
        public String e;
        public String[] f;

        public Builder() {
            this.a = -1;
            this.b = false;
            this.c = true;
            this.d = false;
        }

        public Builder blockAppLog() {
            this.d = true;
            return this;
        }

        @NonNull
        public TiaraConfiguration build() {
            TiaraConfiguration tiaraConfiguration0 = new TiaraConfiguration();  // 初始化器: Ljava/lang/Object;-><init>()V
            tiaraConfiguration0.a = 300;
            tiaraConfiguration0.b = this.b;
            tiaraConfiguration0.c = this.c;
            tiaraConfiguration0.d = this.d;
            tiaraConfiguration0.e = this.e;
            tiaraConfiguration0.f = this.f;
            int v = this.a;
            if(v >= 0) {
                tiaraConfiguration0.a = v;
            }
            return tiaraConfiguration0;
        }

        public Builder cookieDomains(String[] arr_s) {
            this.f = arr_s;
            return this;
        }

        public Builder serverUrl(String s) {
            this.e = s;
            return this;
        }

        public Builder sessionTimeout(int v) {
            this.a = v;
            return this;
        }

        public Builder setCookieSyncAtInstanceEnabled(boolean z) {
            this.c = z;
            return this;
        }

        public Builder syncTiaraUserToWebview(boolean z) {
            this.b = z;
            return this;
        }
    }

    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public String e;
    public String[] f;

}

