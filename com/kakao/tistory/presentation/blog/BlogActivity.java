package com.kakao.tistory.presentation.blog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import com.kakao.tistory.presentation.main.MainAppKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001A\u00020\t8\u0014@\u0014X\u0094\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000F¨\u0006\u0014²\u0006\f\u0010\u0013\u001A\u00020\u00128\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/blog/BlogActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryAppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "g", "I", "getRequestedInsets", "()I", "setRequestedInsets", "(I)V", "requestedInsets", "Companion", "", "isOnline", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogActivity.kt\ncom/kakao/tistory/presentation/blog/BlogActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,100:1\n1223#2,6:101\n1223#2,6:107\n81#3:113\n*S KotlinDebug\n*F\n+ 1 BlogActivity.kt\ncom/kakao/tistory/presentation/blog/BlogActivity\n*L\n54#1:101,6\n84#1:107,6\n56#1:113\n*E\n"})
public final class BlogActivity extends Hilt_BlogActivity {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\'\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000B\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/blog/BlogActivity$Companion;", "", "Landroid/content/Context;", "context", "", "blogName", "", "goDirectSetting", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/Intent;", "EXTRA_BLOG_NAME", "Ljava/lang/String;", "EXTRA_GO_DIRECT_SETTING", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context0, @NotNull String s, boolean z) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intent intent0 = new Intent(context0, BlogActivity.class);
            intent0.putExtra("EXTRA_BLOG_NAME", s);
            intent0.putExtra("EXTRA_GO_DIRECT_SETTING", z);
            return intent0;
        }

        public static Intent createIntent$default(Companion blogActivity$Companion0, Context context0, String s, boolean z, int v, Object object0) {
            if((v & 4) != 0) {
                z = false;
            }
            return blogActivity$Companion0.createIntent(context0, s, z);
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_BLOG_NAME = "EXTRA_BLOG_NAME";
    @NotNull
    public static final String EXTRA_GO_DIRECT_SETTING = "EXTRA_GO_DIRECT_SETTING";
    public int g;

    static {
        BlogActivity.Companion = new Companion(null);
        BlogActivity.$stable = 8;
    }

    public BlogActivity() {
        this.g = 8;
    }

    public static final void access$BlogApp(BlogActivity blogActivity0, String s, boolean z, Composer composer0, int v) {
        blogActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(0xB0C21698);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB0C21698, v1, -1, "com.kakao.tistory.presentation.blog.BlogActivity.BlogApp (BlogActivity.kt:51)");
            }
            BlogAppState blogAppState0 = BlogAppStateKt.rememberBlogAppState(s, null, null, composer1, v1 & 14, 6);
            composer1.startReplaceGroup(0x1E7F5540);
            SnackbarHostState snackbarHostState0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(snackbarHostState0 == composer$Companion0.getEmpty()) {
                snackbarHostState0 = new SnackbarHostState();
                composer1.updateRememberedValue(snackbarHostState0);
            }
            composer1.endReplaceGroup();
            State state0 = LiveDataAdapterKt.observeAsState(blogAppState0.getNetworkChecker(), Boolean.TRUE, composer1, 56);
            Boolean boolean0 = (Boolean)state0.getValue();
            boolean0.getClass();
            boolean z1 = true;
            CompositionLocalKt.CompositionLocalProvider(MainAppKt.getLocalOnlineState().provides(boolean0), ComposableLambdaKt.rememberComposableLambda(0xCBF9FB58, true, new d(blogAppState0, snackbarHostState0, state0), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            Boolean boolean1 = Boolean.valueOf(z);
            composer1.startReplaceGroup(0x1E7FF06D);
            if((v1 & 0x70) != 0x20) {
                z1 = false;
            }
            boolean z2 = composer1.changed(blogAppState0);
            e e0 = composer1.rememberedValue();
            if(z1 || z2 || e0 == composer$Companion0.getEmpty()) {
                e0 = new e(z, blogAppState0, null);
                composer1.updateRememberedValue(e0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolean1, e0, composer1, v1 >> 3 & 14 | 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(blogActivity0, s, z, v));
        }
    }

    public static final boolean access$BlogApp$lambda$1(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity
    public int getRequestedInsets() {
        return this.g;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity
    public void onCreate(@Nullable Bundle bundle0) {
        boolean z;
        String s;
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            s = null;
        }
        else {
            Bundle bundle1 = intent0.getExtras();
            s = bundle1 == null ? null : bundle1.getString("EXTRA_BLOG_NAME");
        }
        Intent intent1 = this.getIntent();
        if(intent1 == null) {
            z = false;
        }
        else {
            Bundle bundle2 = intent1.getExtras();
            z = bundle2 == null ? false : bundle2.getBoolean("EXTRA_GO_DIRECT_SETTING");
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(0xD8FCA8B6, true, new h(this, s, z)), 1, null);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity
    public void setRequestedInsets(int v) {
        this.g = v;
    }
}

