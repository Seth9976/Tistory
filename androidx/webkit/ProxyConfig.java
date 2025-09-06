package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ProxyConfig {
    public static final class Builder {
        public final List a;
        public final List b;
        public boolean c;

        public Builder() {
            this.c = false;
            this.a = new ArrayList();
            this.b = new ArrayList();
        }

        public Builder(@NonNull ProxyConfig proxyConfig0) {
            this.c = false;
            this.a = proxyConfig0.getProxyRules();
            this.b = proxyConfig0.getBypassRules();
            this.c = proxyConfig0.isReverseBypassEnabled();
        }

        @NonNull
        public Builder addBypassRule(@NonNull String s) {
            this.b.add(s);
            return this;
        }

        @NonNull
        public Builder addDirect() {
            return this.addDirect("*");
        }

        @NonNull
        public Builder addDirect(@NonNull String s) {
            ProxyRule proxyConfig$ProxyRule0 = new ProxyRule(s, "direct://");
            this.a.add(proxyConfig$ProxyRule0);
            return this;
        }

        @NonNull
        public Builder addProxyRule(@NonNull String s) {
            ProxyRule proxyConfig$ProxyRule0 = new ProxyRule(s);
            this.a.add(proxyConfig$ProxyRule0);
            return this;
        }

        @NonNull
        public Builder addProxyRule(@NonNull String s, @NonNull String s1) {
            ProxyRule proxyConfig$ProxyRule0 = new ProxyRule(s1, s);
            this.a.add(proxyConfig$ProxyRule0);
            return this;
        }

        @NonNull
        public ProxyConfig build() {
            return new ProxyConfig(this.a, this.b, this.c);
        }

        @NonNull
        public Builder bypassSimpleHostnames() {
            return this.addBypassRule("<local>");
        }

        @NonNull
        public Builder removeImplicitRules() {
            return this.addBypassRule("<-loopback>");
        }

        @NonNull
        public Builder setReverseBypassEnabled(boolean z) {
            this.c = z;
            return this;
        }
    }

    public static final class ProxyRule {
        public final String a;
        public final String b;

        @RestrictTo({Scope.LIBRARY})
        public ProxyRule(@NonNull String s) {
            this("*", s);
        }

        @RestrictTo({Scope.LIBRARY})
        public ProxyRule(@NonNull String s, @NonNull String s1) {
            this.a = s;
            this.b = s1;
        }

        @NonNull
        public String getSchemeFilter() {
            return this.a;
        }

        @NonNull
        public String getUrl() {
            return this.b;
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProxyScheme {
    }

    public static final String MATCH_ALL_SCHEMES = "*";
    public static final String MATCH_HTTP = "http";
    public static final String MATCH_HTTPS = "https";
    public final List a;
    public final List b;
    public final boolean c;

    @RestrictTo({Scope.LIBRARY})
    public ProxyConfig(@NonNull List list0, @NonNull List list1, boolean z) {
        this.a = list0;
        this.b = list1;
        this.c = z;
    }

    @NonNull
    public List getBypassRules() {
        return Collections.unmodifiableList(this.b);
    }

    @NonNull
    public List getProxyRules() {
        return Collections.unmodifiableList(this.a);
    }

    public boolean isReverseBypassEnabled() {
        return this.c;
    }
}

