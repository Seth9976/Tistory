package com.kakao.tistory.presentation.view.statistics;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType.BackBlack;
import com.kakao.tistory.presentation.viewmodel.RefererEtcViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\u000E\u001A\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001A\u0010\u0010\u001A\u00020\u000F8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/RefererEtcListActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "r", "I", "getContentLayoutResourceId", "()I", "contentLayoutResourceId", "", "profileEnabled", "Z", "getProfileEnabled", "()Z", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRefererEtcListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefererEtcListActivity.kt\ncom/kakao/tistory/presentation/view/statistics/RefererEtcListActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,64:1\n10#2,2:65\n1#3:67\n75#4,13:68\n*S KotlinDebug\n*F\n+ 1 RefererEtcListActivity.kt\ncom/kakao/tistory/presentation/view/statistics/RefererEtcListActivity\n*L\n29#1:65,2\n29#1:67\n29#1:68,13\n*E\n"})
public final class RefererEtcListActivity extends Hilt_RefererEtcListActivity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/RefererEtcListActivity$Companion;", "", "", "EXTRA_REFERER_ETC_BLOG_NAME", "Ljava/lang/String;", "EXTRA_REFERER_ETC_DATE", "EXTRA_REFERER_ETC_ENTRY_ID", "EXTRA_REFERER_ETC_GRANULARITY", "EXTRA_REFERER_ETC_METRICS", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_REFERER_ETC_BLOG_NAME = "EXTRA_REFERER_ETC_BLOG_NAME";
    @NotNull
    public static final String EXTRA_REFERER_ETC_DATE = "EXTRA_REFERER_ETC_DATE";
    @NotNull
    public static final String EXTRA_REFERER_ETC_ENTRY_ID = "EXTRA_REFERER_ETC_ENTRY_ID";
    @NotNull
    public static final String EXTRA_REFERER_ETC_GRANULARITY = "EXTRA_REFERER_ETC_GRANULARITY";
    @NotNull
    public static final String EXTRA_REFERER_ETC_METRICS = "EXTRA_REFERER_ETC_METRICS";
    public final int r;
    public final BaseViewModelLazy s;

    static {
        RefererEtcListActivity.Companion = new Companion(null);
        RefererEtcListActivity.$stable = 8;
    }

    public RefererEtcListActivity() {
        this.r = layout.activity_fragment_container;
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.s = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(RefererEtcViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public int getContentLayoutResourceId() {
        return this.r;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.initAppBarHomeAsUp(BackBlack.INSTANCE);
        this.setTitle(string.label_statistics_referer_etc);
        Intent intent0 = this.getIntent();
        Unit unit0 = null;
        if(intent0 != null) {
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 != null) {
                String s = bundle1.getString("EXTRA_REFERER_ETC_BLOG_NAME");
                long v = bundle1.getLong("EXTRA_REFERER_ETC_ENTRY_ID", -1L);
                String s1 = bundle1.getString("EXTRA_REFERER_ETC_DATE");
                String s2 = bundle1.getString("EXTRA_REFERER_ETC_GRANULARITY");
                String s3 = bundle1.getString("EXTRA_REFERER_ETC_METRICS");
                if(s != null) {
                    ((RefererEtcViewModel)this.s.getValue()).init(s, v, s1, s2, s3);
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 == null) {
                    this.finish();
                }
                unit0 = Unit.INSTANCE;
            }
        }
        if(unit0 == null) {
            this.finish();
        }
        if(bundle0 == null) {
            this.getSupportFragmentManager().beginTransaction().replace(id.fragment_container, RefererEtcListFragment.Companion.newInstance()).commitNow();
        }
    }
}

