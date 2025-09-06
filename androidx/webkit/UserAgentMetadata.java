package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class UserAgentMetadata {
    public static final class BrandVersion {
        public static final class Builder {
            public String a;
            public String b;
            public String c;

            public Builder() {
            }

            public Builder(@NonNull BrandVersion userAgentMetadata$BrandVersion0) {
                this.a = userAgentMetadata$BrandVersion0.getBrand();
                this.b = userAgentMetadata$BrandVersion0.getMajorVersion();
                this.c = userAgentMetadata$BrandVersion0.getFullVersion();
            }

            @NonNull
            public BrandVersion build() {
                if(this.a == null || this.a.trim().isEmpty() || (this.b == null || this.b.trim().isEmpty()) || (this.c == null || this.c.trim().isEmpty())) {
                    throw new IllegalStateException("Brand name, major version and full version should not be null or blank.");
                }
                return new BrandVersion(this.a, this.b, this.c);
            }

            @NonNull
            public Builder setBrand(@NonNull String s) {
                if(s.trim().isEmpty()) {
                    throw new IllegalArgumentException("Brand should not be blank.");
                }
                this.a = s;
                return this;
            }

            @NonNull
            public Builder setFullVersion(@NonNull String s) {
                if(s.trim().isEmpty()) {
                    throw new IllegalArgumentException("FullVersion should not be blank.");
                }
                this.c = s;
                return this;
            }

            @NonNull
            public Builder setMajorVersion(@NonNull String s) {
                if(s.trim().isEmpty()) {
                    throw new IllegalArgumentException("MajorVersion should not be blank.");
                }
                this.b = s;
                return this;
            }
        }

        public final String a;
        public final String b;
        public final String c;

        public BrandVersion(String s, String s1, String s2) {
            this.a = s;
            this.b = s1;
            this.c = s2;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof BrandVersion ? Objects.equals(this.a, ((BrandVersion)object0).a) && Objects.equals(this.b, ((BrandVersion)object0).b) && Objects.equals(this.c, ((BrandVersion)object0).c) : false;
        }

        @NonNull
        public String getBrand() {
            return this.a;
        }

        @NonNull
        public String getFullVersion() {
            return this.c;
        }

        @NonNull
        public String getMajorVersion() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c});
        }

        @Override
        @NonNull
        public String toString() {
            return this.a + "," + this.b + "," + this.c;
        }
    }

    public static final class androidx.webkit.UserAgentMetadata.Builder {
        public List a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public boolean g;
        public int h;
        public boolean i;

        public androidx.webkit.UserAgentMetadata.Builder() {
            this.a = new ArrayList();
            this.g = true;
            this.h = 0;
            this.i = false;
        }

        public androidx.webkit.UserAgentMetadata.Builder(@NonNull UserAgentMetadata userAgentMetadata0) {
            this.a = new ArrayList();
            this.g = true;
            this.h = 0;
            this.i = false;
            this.a = userAgentMetadata0.getBrandVersionList();
            this.b = userAgentMetadata0.getFullVersion();
            this.c = userAgentMetadata0.getPlatform();
            this.d = userAgentMetadata0.getPlatformVersion();
            this.e = userAgentMetadata0.getArchitecture();
            this.f = userAgentMetadata0.getModel();
            this.g = userAgentMetadata0.isMobile();
            this.h = userAgentMetadata0.getBitness();
            this.i = userAgentMetadata0.isWow64();
        }

        @NonNull
        public UserAgentMetadata build() {
            return new UserAgentMetadata(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder setArchitecture(@Nullable String s) {
            this.e = s;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder setBitness(int v) {
            this.h = v;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder setBrandVersionList(@NonNull List list0) {
            this.a = list0;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder setFullVersion(@Nullable String s) {
            if(s == null) {
                this.b = null;
                return this;
            }
            if(s.trim().isEmpty()) {
                throw new IllegalArgumentException("Full version should not be blank.");
            }
            this.b = s;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder setMobile(boolean z) {
            this.g = z;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder setModel(@Nullable String s) {
            this.f = s;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder setPlatform(@Nullable String s) {
            if(s == null) {
                this.c = null;
                return this;
            }
            if(s.trim().isEmpty()) {
                throw new IllegalArgumentException("Platform should not be blank.");
            }
            this.c = s;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder setPlatformVersion(@Nullable String s) {
            this.d = s;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder setWow64(boolean z) {
            this.i = z;
            return this;
        }
    }

    public static final int BITNESS_DEFAULT;
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final int h;
    public final boolean i;

    public UserAgentMetadata(List list0, String s, String s1, String s2, String s3, String s4, boolean z, int v, boolean z1) {
        this.a = list0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = z;
        this.h = v;
        this.i = z1;
    }

    // 去混淆评级： 低(23)
    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof UserAgentMetadata ? this.g == ((UserAgentMetadata)object0).g && this.h == ((UserAgentMetadata)object0).h && this.i == ((UserAgentMetadata)object0).i && Objects.equals(this.a, ((UserAgentMetadata)object0).a) && Objects.equals(this.b, ((UserAgentMetadata)object0).b) && Objects.equals(this.c, ((UserAgentMetadata)object0).c) && Objects.equals(this.d, ((UserAgentMetadata)object0).d) && Objects.equals(this.e, ((UserAgentMetadata)object0).e) && Objects.equals(this.f, ((UserAgentMetadata)object0).f) : false;
    }

    @Nullable
    public String getArchitecture() {
        return this.e;
    }

    public int getBitness() {
        return this.h;
    }

    @NonNull
    public List getBrandVersionList() {
        return this.a;
    }

    @Nullable
    public String getFullVersion() {
        return this.b;
    }

    @Nullable
    public String getModel() {
        return this.f;
    }

    @Nullable
    public String getPlatform() {
        return this.c;
    }

    @Nullable
    public String getPlatformVersion() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i)});
    }

    public boolean isMobile() {
        return this.g;
    }

    public boolean isWow64() {
        return this.i;
    }
}

