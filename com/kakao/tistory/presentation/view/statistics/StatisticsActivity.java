package com.kakao.tistory.presentation.view.statistics;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType.CloseBlack;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\u000E\u001A\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001A\u0010\u0010\u001A\u00020\u000F8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/StatisticsActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "r", "I", "getContentLayoutResourceId", "()I", "contentLayoutResourceId", "", "profileEnabled", "Z", "getProfileEnabled", "()Z", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsActivity.kt\ncom/kakao/tistory/presentation/view/statistics/StatisticsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class StatisticsActivity extends Hilt_StatisticsActivity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/StatisticsActivity$Companion;", "", "", "EXTRA_BLOG_NAME", "Ljava/lang/String;", "EXTRA_ENTRY_ITEM", "EXTRA_FROM_ARTICLE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_BLOG_NAME = "EXTRA_BLOG_NAME";
    @NotNull
    public static final String EXTRA_ENTRY_ITEM = "EXTRA_ENTRY_ID";
    @NotNull
    public static final String EXTRA_FROM_ARTICLE = "EXTRA_FROM_ARTICLE";
    public final int r;

    static {
        StatisticsActivity.Companion = new Companion(null);
    }

    public StatisticsActivity() {
        this.r = layout.activity_fragment_container;
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
        String s1;
        EntryItem entryItem0;
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        String s = null;
        if(intent0 == null) {
            entryItem0 = null;
        }
        else {
            Bundle bundle1 = intent0.getExtras();
            entryItem0 = bundle1 == null ? null : ((EntryItem)bundle1.getParcelable("EXTRA_ENTRY_ID"));
        }
        Intent intent1 = this.getIntent();
        boolean z = false;
        if(intent1 != null) {
            Bundle bundle2 = intent1.getExtras();
            if(bundle2 != null) {
                z = bundle2.getBoolean("EXTRA_FROM_ARTICLE", false);
            }
        }
        Intent intent2 = this.getIntent();
        if(intent2 != null) {
            Bundle bundle3 = intent2.getExtras();
            if(bundle3 != null) {
                s = bundle3.getString("EXTRA_BLOG_NAME");
            }
        }
        if(bundle0 == null) {
            this.getSupportFragmentManager().beginTransaction().replace(id.fragment_container, StatisticsFragment.Companion.newInstance(entryItem0, s)).commitNow();
        }
        if(!z) {
            this.initAppBarHomeAsUp(CloseBlack.INSTANCE);
        }
        if(entryItem0 == null || entryItem0.getTitle() == null) {
            s1 = this.getString(string.label_statistics);
        }
        else {
            s1 = this.getString(string.label_statistics_entry);
            if(s1 == null) {
                s1 = this.getString(string.label_statistics);
            }
        }
        this.setTitle(s1);
        if(entryItem0 != null) {
            this.setMenuView(string.label_comment_entry_view, drawable.ic_navi_article, new j(entryItem0, this));
        }
    }
}

