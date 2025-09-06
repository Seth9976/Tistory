package com.kakao.tistory.presentation.view.editor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.KedtiorInitializerKt;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.TistoryGrammarChecker;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.databinding.ActivityEditorBinding;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel.EditorMode;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000F\u0010\u0012\u001A\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u001A\u0010\u0017\u001A\u00020\n8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;", "Lcom/kakao/tistory/presentation/databinding/ActivityEditorBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "onDestroy", "j", "I", "getLayoutResourceId", "()I", "layoutResourceId", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorActivity.kt\ncom/kakao/tistory/presentation/view/editor/EditorActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,325:1\n10#2,2:326\n10#2,2:342\n1#3:328\n1#3:344\n75#4,13:329\n75#4,13:345\n*S KotlinDebug\n*F\n+ 1 EditorActivity.kt\ncom/kakao/tistory/presentation/view/editor/EditorActivity\n*L\n62#1:326,2\n63#1:342,2\n62#1:328\n63#1:344\n62#1:329,13\n63#1:345,13\n*E\n"})
public final class EditorActivity extends Hilt_EditorActivity {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000F\u0010\u000ER\u0014\u0010\u0010\u001A\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000ER\u0014\u0010\u0012\u001A\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorActivity$Companion;", "", "Landroid/content/Context;", "context", "", "isOpenLatestEdit", "", "entryId", "", "blogName", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;ZLjava/lang/Long;Ljava/lang/String;)Landroid/content/Intent;", "EXTRA_BLOG_NAME", "Ljava/lang/String;", "EXTRA_ENTRY_ID", "EXTRA_IS_OPEN_LATEST_EDIT", "", "titleCharacterMaxCount", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nEditorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorActivity.kt\ncom/kakao/tistory/presentation/view/editor/EditorActivity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context0, boolean z, @Nullable Long long0, @Nullable String s) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intent intent0 = new Intent(context0, EditorActivity.class);
            if(s != null) {
                intent0.putExtra("EXTRA_BLOG_NAME", s);
            }
            if(long0 != null) {
                intent0.putExtra("EXTRA_ENTRY_ID", long0.longValue());
            }
            intent0.putExtra("EXTRA_IS_OPEN_LATEST_EDIT", z);
            return intent0;
        }

        public static Intent createIntent$default(Companion editorActivity$Companion0, Context context0, boolean z, Long long0, String s, int v, Object object0) {
            if((v & 2) != 0) {
                z = false;
            }
            if((v & 4) != 0) {
                long0 = null;
            }
            if((v & 8) != 0) {
                s = null;
            }
            return editorActivity$Companion0.createIntent(context0, z, long0, s);
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_BLOG_NAME = "EXTRA_BLOG_NAME";
    @NotNull
    public static final String EXTRA_ENTRY_ID = "EXTRA_ENTRY_ID";
    @NotNull
    public static final String EXTRA_IS_OPEN_LATEST_EDIT = "EXTRA_IS_OPEN_LATEST_EDIT";
    public final int j;
    public final BaseViewModelLazy k;
    public final BaseViewModelLazy l;
    public final String m;
    public final String n;
    public final String o;
    public static final int titleCharacterMaxCount = 80;

    static {
        EditorActivity.Companion = new Companion(null);
        EditorActivity.$stable = 8;
    }

    public EditorActivity() {
        this.j = layout.activity_editor;
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.k = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(EditorViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.l = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(DraftViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        this.m = "editorFragmentTAG";
        this.n = "settingFragmentTAG";
        this.o = "SettingEditTagFragmentTAG";
    }

    public static final void access$addFragment(EditorActivity editorActivity0, Fragment fragment0, String s) {
        FragmentManager fragmentManager0 = editorActivity0.getSupportFragmentManager();
        if(fragmentManager0.findFragmentByTag(s) == null) {
            fragmentManager0.beginTransaction().add(id.editor_setting_fragment_container, fragment0, s).addToBackStack(s).commit();
        }
    }

    public static final ActivityEditorBinding access$getDataBinding(EditorActivity editorActivity0) {
        return (ActivityEditorBinding)editorActivity0.getDataBinding();
    }

    public static final DraftViewModel access$getDraftViewModel(EditorActivity editorActivity0) {
        return (DraftViewModel)editorActivity0.l.getValue();
    }

    public static final EditorViewModel access$getEditorViewModel(EditorActivity editorActivity0) {
        return (EditorViewModel)editorActivity0.k.getValue();
    }

    public static final void access$removeFragment(EditorActivity editorActivity0, String s) {
        FragmentManager fragmentManager0 = editorActivity0.getSupportFragmentManager();
        Fragment fragment0 = fragmentManager0.findFragmentByTag(s);
        if(fragment0 != null) {
            fragmentManager0.beginTransaction().remove(fragment0).commit();
            fragmentManager0.popBackStack();
        }
    }

    @Override  // com.kakao.android.base.ui.BaseActivity
    public int getLayoutResourceId() {
        return this.j;
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        ((EditorViewModel)this.k.getValue()).handleActivityResult(v, v1, intent0);
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if(!((DraftViewModel)this.l.getValue()).onBackPressed() && !((EditorViewModel)this.k.getValue()).onClickBack()) {
            super.onBackPressed();
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void onCreate(@Nullable Bundle bundle0) {
        Long long0;
        String s;
        super.onCreate(bundle0);
        Logger.INSTANCE.log("onScreenLock");
        this.getWindow().addFlags(0x80);
        View view0 = this.getWindow().getCurrentFocus();
        if(view0 != null) {
            view0.clearFocus();
        }
        ((ActivityEditorBinding)this.getDataBinding()).setViewModel(((EditorViewModel)this.k.getValue()));
        ((ActivityEditorBinding)this.getDataBinding()).setDraftViewModel(((DraftViewModel)this.l.getValue()));
        this.setSupportActionBar(((ActivityEditorBinding)this.getDataBinding()).editorToolbar);
        ActionBar actionBar0 = this.getSupportActionBar();
        boolean z = false;
        if(actionBar0 != null) {
            actionBar0.setDisplayHomeAsUpEnabled(false);
        }
        ActionBar actionBar1 = this.getSupportActionBar();
        if(actionBar1 != null) {
            actionBar1.setDisplayShowTitleEnabled(false);
        }
        if(((EditorViewModel)this.k.getValue()).getEditorMode().getValue() == EditorMode.EDIT_MODE) {
            Fragment fragment0 = this.getSupportFragmentManager().findFragmentByTag(this.m);
            if(fragment0 == null) {
                fragment0 = EditorFragment.Companion.newInstance();
            }
            Intrinsics.checkNotNull(fragment0);
            this.getSupportFragmentManager().beginTransaction().replace(id.editor_setting_fragment_container, fragment0, this.m).commitNow();
        }
        boolean z1 = true;
        ((ActivityEditorBinding)this.getDataBinding()).editorDraftDialog.setContent(ComposableLambdaKt.composableLambdaInstance(207098877, true, new c0(this)));
        EditorViewModel editorViewModel0 = (EditorViewModel)this.k.getValue();
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowJsonExceptionDialog(), this, new f0(this));
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowNotMyBlogDialog(), this, new i0(this));
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowRegulationErrorEvent(), this, new k0(this));
        LiveDataExtensionKt.observeEvent(editorViewModel0.getFinishEditor(), this, new l0(this));
        LiveDataExtensionKt.observeEvent(editorViewModel0.getCanNotEditEntry(), this, new o0(this));
        LiveDataExtensionKt.observeEvent(editorViewModel0.getSaveDraftComplete(), this, new p0(this));
        LiveDataExtensionKt.observeEvent(editorViewModel0.getOnPublishEntry(), this, new q0(this, editorViewModel0));
        editorViewModel0.getEditorMode().observe(this, new y0(new r0(this)));
        LiveDataExtensionKt.observeEvent(editorViewModel0.getEntryModifyAlert(), this, new t0(this));
        DraftViewModel draftViewModel0 = (DraftViewModel)this.l.getValue();
        LiveDataExtensionKt.observeEvent(draftViewModel0.getShowDraftAccessibilityBottomSheet(), this, new v0(this));
        LiveDataExtensionKt.observeEvent(draftViewModel0.getShowDeleteDialog(), this, new x0(this));
        if(bundle0 != null) {
            z1 = false;
        }
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
            long0 = null;
        }
        else {
            Bundle bundle2 = intent1.getExtras();
            long0 = bundle2 == null ? null : bundle2.getLong("EXTRA_ENTRY_ID");
        }
        Intent intent2 = this.getIntent();
        if(intent2 != null) {
            Bundle bundle3 = intent2.getExtras();
            if(bundle3 != null) {
                z = bundle3.getBoolean("EXTRA_IS_OPEN_LATEST_EDIT");
            }
        }
        ((EditorViewModel)this.k.getValue()).init(s, long0, z, z1);
        Blog blog0 = ((EditorViewModel)this.k.getValue()).getBlog();
        List list0 = blog0 == null ? null : blog0.getEmoticons();
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        Blog blog1 = ((EditorViewModel)this.k.getValue()).getBlog();
        String s1 = blog1 == null ? null : blog1.getTitle();
        if(s1 == null) {
            s1 = "";
        }
        KedtiorInitializerKt.initKeditor(this, list0, new EditorActivity.initKeditor.1(this), new TistoryGrammarChecker(new z(this, null), new a0(this)), s1);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void onDestroy() {
        Logger.INSTANCE.log("offScreenLock");
        this.getWindow().clearFlags(0x80);
        super.onDestroy();
    }
}

