package com.kakao.tistory;

import android.content.Context;
import androidx.room.a;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.usecase.GetCurrentBlogTitleUseCase;
import com.kakao.tistory.module.ContextModule;
import com.kakao.tistory.module.DataStoreModule;
import com.kakao.tistory.module.GradleModule;
import com.kakao.tistory.module.PreferenceModule;
import com.kakao.tistory.module.PushBuilderModule;
import com.kakao.tistory.module.RetrofitModule;
import com.kakao.tistory.module.ServiceModule;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;

public final class k extends SingletonC {
    public final Provider A;
    public final Provider B;
    public final Provider C;
    public final Provider D;
    public final Provider E;
    public final Provider F;
    public final Provider G;
    public final Provider H;
    public final Provider I;
    public final Provider J;
    public final Provider K;
    public final Provider L;
    public final Provider M;
    public final Provider N;
    public final Provider O;
    public final Provider P;
    public final Provider Q;
    public final Provider R;
    public final Provider S;
    public final Provider T;
    public final Provider U;
    public final Provider V;
    public final Provider W;
    public final Provider X;
    public final Provider Y;
    public final Provider Z;
    public final ApplicationContextModule a;
    public final Provider a0;
    public final PreferenceModule b;
    public final Provider b0;
    public final PushBuilderModule c;
    public final Provider c0;
    public final ServiceModule d;
    public final Provider d0;
    public final RetrofitModule e;
    public final Provider e0;
    public final GradleModule f;
    public final Provider f0;
    public final DataStoreModule g;
    public final Provider g0;
    public final ContextModule h;
    public final Provider h0;
    public final k i;
    public final Provider i0;
    public final Provider j;
    public final Provider j0;
    public final Provider k;
    public final Provider k0;
    public final Provider l;
    public final Provider l0;
    public final DelegateFactory m;
    public final Provider m0;
    public final j n;
    public final Provider n0;
    public final Provider o;
    public final Provider o0;
    public final Provider p;
    public final Provider p0;
    public final j q;
    public final Provider r;
    public final Provider s;
    public final Provider t;
    public final Provider u;
    public final Provider v;
    public final Provider w;
    public final Provider x;
    public final Provider y;
    public final Provider z;

    public k(ApplicationContextModule applicationContextModule0, ContextModule contextModule0, DataStoreModule dataStoreModule0, GradleModule gradleModule0, PreferenceModule preferenceModule0, PushBuilderModule pushBuilderModule0, RetrofitModule retrofitModule0, ServiceModule serviceModule0) {
        this.i = this;
        this.a = applicationContextModule0;
        this.b = preferenceModule0;
        this.c = pushBuilderModule0;
        this.d = serviceModule0;
        this.e = retrofitModule0;
        this.f = gradleModule0;
        this.g = dataStoreModule0;
        this.h = contextModule0;
        this.j = a.p(this, 0);
        this.k = a.p(this, 2);
        this.l = a.p(this, 5);
        this.m = new DelegateFactory();
        this.n = new j(this, 8);
        this.o = DoubleCheck.provider(new j(this, 11));
        this.p = DoubleCheck.provider(new j(this, 10));
        this.q = new j(this, 9);
        this.r = a.p(this, 7);
        this.s = a.p(this, 12);
        this.t = a.p(this, 6);
        this.u = a.p(this, 4);
        this.v = a.p(this, 3);
        Provider provider0 = DoubleCheck.provider(new j(this, 1));
        DelegateFactory.setDelegate(this.m, provider0);
        this.w = DoubleCheck.provider(new j(this, 14));
        this.x = DoubleCheck.provider(new j(this, 13));
        this.y = a.p(this, 16);
        this.z = DoubleCheck.provider(new j(this, 15));
        this.A = a.p(this, 18);
        this.B = DoubleCheck.provider(new j(this, 17));
        this.C = a.p(this, 21);
        this.D = a.p(this, 20);
        this.E = DoubleCheck.provider(new j(this, 19));
        this.F = a.p(this, 23);
        this.G = a.p(this, 24);
        this.H = DoubleCheck.provider(new j(this, 22));
        this.I = a.p(this, 26);
        this.J = DoubleCheck.provider(new j(this, 25));
        this.K = a.p(this, 28);
        this.L = DoubleCheck.provider(new j(this, 27));
        this.M = DoubleCheck.provider(new j(this, 29));
        this.N = DoubleCheck.provider(new j(this, 30));
        this.O = DoubleCheck.provider(new j(this, 0x1F));
        this.P = a.p(this, 33);
        this.Q = DoubleCheck.provider(new j(this, 0x20));
        this.R = a.p(this, 35);
        this.S = DoubleCheck.provider(new j(this, 34));
        this.T = a.p(this, 37);
        this.U = a.p(this, 38);
        this.V = DoubleCheck.provider(new j(this, 36));
        this.W = a.p(this, 40);
        this.X = DoubleCheck.provider(new j(this, 39));
        this.Y = a.p(this, 42);
        this.Z = DoubleCheck.provider(new j(this, 41));
        this.a0 = a.p(this, 44);
        this.b0 = a.p(this, 45);
        this.c0 = DoubleCheck.provider(new j(this, 43));
        this.d0 = a.p(this, 0x2F);
        this.e0 = DoubleCheck.provider(new j(this, 46));
        this.f0 = a.p(this, 49);
        this.g0 = DoubleCheck.provider(new j(this, 0x30));
        this.h0 = a.p(this, 51);
        this.i0 = a.p(this, 52);
        this.j0 = DoubleCheck.provider(new j(this, 50));
        this.k0 = a.p(this, 54);
        this.l0 = DoubleCheck.provider(new j(this, 53));
        this.m0 = a.p(this, 56);
        this.n0 = DoubleCheck.provider(new j(this, 55));
        this.o0 = a.p(this, 58);
        this.p0 = DoubleCheck.provider(new j(this, 57));
    }

    @Override  // dagger.hilt.android.flags.FragmentGetContextFix$FragmentGetContextFixEntryPoint
    public final Set getDisableFragmentGetContextFix() {
        return Collections.emptySet();
    }

    @Override  // com.kakao.tistory.TistoryApplication_GeneratedInjector
    public final void injectTistoryApplication(TistoryApplication tistoryApplication0) {
        Context context0 = ApplicationContextModule_ProvideContextFactory.provideContext(this.a);
        DeviceInfoPreference deviceInfoPreference0 = (DeviceInfoPreference)this.j.get();
        TistoryApplication_MembersInjector.injectSetPushChannelBuilder(tistoryApplication0, this.c.providePushChannelBuilder(context0, deviceInfoPreference0));
        TistoryApplication_MembersInjector.injectSetGetCurrentBlogTitleUseCase(tistoryApplication0, new GetCurrentBlogTitleUseCase(((AccountRepository)this.m.get())));
    }

    @Override  // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager$ActivityRetainedComponentBuilderEntryPoint
    public final ActivityRetainedComponentBuilder retainedComponentBuilder() {
        return new c(this.i);
    }

    @Override  // dagger.hilt.android.internal.managers.ServiceComponentManager$ServiceComponentBuilderEntryPoint
    public final ServiceComponentBuilder serviceComponentBuilder() {
        return new h(this.i);
    }
}

