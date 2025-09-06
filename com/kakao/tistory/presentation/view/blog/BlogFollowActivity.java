package com.kakao.tistory.presentation.view.blog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentTransaction;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\u000E\u001A\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001A\u0010\u0010\u001A\u00020\u000F8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/presentation/view/blog/BlogFollowActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "r", "I", "getContentLayoutResourceId", "()I", "contentLayoutResourceId", "", "profileEnabled", "Z", "getProfileEnabled", "()Z", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogFollowActivity extends Hilt_BlogFollowActivity {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\'\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000B\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/view/blog/BlogFollowActivity$Companion;", "", "Landroid/content/Context;", "context", "", "blogName", "Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;", "type", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;)Landroid/content/Intent;", "EXTRA_BLOG_FOLLOW_BLOG_NAME", "Ljava/lang/String;", "EXTRA_BLOG_FOLLOW_TYPE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context0, @Nullable String s, @NotNull Type blogFollowViewModel$Type0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(blogFollowViewModel$Type0, "type");
            Intent intent0 = new Intent(context0, BlogFollowActivity.class);
            intent0.putExtra("EXTRA_BLOG_FOLLOW_BLOG_NAME", s);
            intent0.putExtra("EXTRA_BLOG_FOLLOW_TYPE", blogFollowViewModel$Type0);
            return intent0;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Type.values().length];
            try {
                arr_v[Type.FOLLOWING.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.FOLLOWER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_BLOG_FOLLOW_BLOG_NAME = "EXTRA_BLOG_FOLLOW_BLOG_NAME";
    @NotNull
    public static final String EXTRA_BLOG_FOLLOW_TYPE = "EXTRA_BLOG_FOLLOW_TYPE";
    public final int r;

    static {
        BlogFollowActivity.Companion = new Companion(null);
    }

    public BlogFollowActivity() {
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
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        String s = null;
        Serializable serializable0 = intent0 == null ? null : intent0.getSerializableExtra("EXTRA_BLOG_FOLLOW_TYPE");
        Type blogFollowViewModel$Type0 = serializable0 instanceof Type ? ((Type)serializable0) : null;
        if(blogFollowViewModel$Type0 == null) {
            blogFollowViewModel$Type0 = Type.FOLLOWING;
        }
        this.setTitle(blogFollowViewModel$Type0.getTitleStringId());
        if(bundle0 == null) {
            switch(WhenMappings.$EnumSwitchMapping$0[blogFollowViewModel$Type0.ordinal()]) {
                case 1: {
                    this.getSupportFragmentManager().beginTransaction().replace(id.fragment_container, BlogFollowingFragment.Companion.newInstance()).commitNow();
                    break;
                }
                case 2: {
                    FragmentTransaction fragmentTransaction0 = this.getSupportFragmentManager().beginTransaction();
                    int v = id.fragment_container;
                    com.kakao.tistory.presentation.view.blog.BlogFollowerFragment.Companion blogFollowerFragment$Companion0 = BlogFollowerFragment.Companion;
                    Intent intent1 = this.getIntent();
                    if(intent1 != null) {
                        s = intent1.getStringExtra("EXTRA_BLOG_FOLLOW_BLOG_NAME");
                    }
                    fragmentTransaction0.replace(v, blogFollowerFragment$Companion0.newInstance(s)).commitNow();
                }
            }
        }
    }
}

