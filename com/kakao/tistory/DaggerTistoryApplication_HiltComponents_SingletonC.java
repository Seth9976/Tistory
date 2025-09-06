package com.kakao.tistory;

import com.kakao.tistory.module.ContextModule;
import com.kakao.tistory.module.DataStoreModule;
import com.kakao.tistory.module.GradleModule;
import com.kakao.tistory.module.PreferenceModule;
import com.kakao.tistory.module.PushBuilderModule;
import com.kakao.tistory.module.RetrofitModule;
import com.kakao.tistory.module.ServiceModule;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;

@DaggerGenerated
public final class DaggerTistoryApplication_HiltComponents_SingletonC {
    public static final class Builder {
        public ApplicationContextModule a;
        public ContextModule b;
        public DataStoreModule c;
        public GradleModule d;
        public PreferenceModule e;
        public PushBuilderModule f;
        public RetrofitModule g;
        public ServiceModule h;

        public Builder applicationContextModule(ApplicationContextModule applicationContextModule0) {
            this.a = (ApplicationContextModule)Preconditions.checkNotNull(applicationContextModule0);
            return this;
        }

        public SingletonC build() {
            Preconditions.checkBuilderRequirement(this.a, ApplicationContextModule.class);
            if(this.b == null) {
                this.b = new ContextModule();
            }
            if(this.c == null) {
                this.c = new DataStoreModule();
            }
            if(this.d == null) {
                this.d = new GradleModule();
            }
            if(this.e == null) {
                this.e = new PreferenceModule();
            }
            if(this.f == null) {
                this.f = new PushBuilderModule();
            }
            if(this.g == null) {
                this.g = new RetrofitModule();
            }
            if(this.h == null) {
                this.h = new ServiceModule();
            }
            return new k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public Builder contextModule(ContextModule contextModule0) {
            this.b = (ContextModule)Preconditions.checkNotNull(contextModule0);
            return this;
        }

        public Builder dataStoreModule(DataStoreModule dataStoreModule0) {
            this.c = (DataStoreModule)Preconditions.checkNotNull(dataStoreModule0);
            return this;
        }

        public Builder gradleModule(GradleModule gradleModule0) {
            this.d = (GradleModule)Preconditions.checkNotNull(gradleModule0);
            return this;
        }

        @Deprecated
        public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule0) {
            Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule0);
            return this;
        }

        public Builder preferenceModule(PreferenceModule preferenceModule0) {
            this.e = (PreferenceModule)Preconditions.checkNotNull(preferenceModule0);
            return this;
        }

        public Builder pushBuilderModule(PushBuilderModule pushBuilderModule0) {
            this.f = (PushBuilderModule)Preconditions.checkNotNull(pushBuilderModule0);
            return this;
        }

        public Builder retrofitModule(RetrofitModule retrofitModule0) {
            this.g = (RetrofitModule)Preconditions.checkNotNull(retrofitModule0);
            return this;
        }

        public Builder serviceModule(ServiceModule serviceModule0) {
            this.h = (ServiceModule)Preconditions.checkNotNull(serviceModule0);
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

