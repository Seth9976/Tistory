package com.kakao.tistory.presentation.view.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.kakao.android.base.viewmodel.BaseViewModel;
import com.kakao.android.base.viewmodel.ViewModelExtensionKt;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.databinding.LayoutTistoryToolbarBinding;
import com.kakao.tistory.presentation.view.common.base.TistoryActivity;
import com.kakao.tistory.presentation.view.common.bottomsheet.CommonBottomDialogFragment;
import com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel;
import com.kakao.tistory.presentation.viewmodel.TistoryToolbarViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0007\u0018\u00002\u00020\u0001:\u00017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005B\u001B\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u0004\u0010\u000BJ/\u0010\u0013\u001A\u00020\u00122\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001B\u001A\u00020\u0012\u00A2\u0006\u0004\b\u001B\u0010\u001AJ#\u0010\u001F\u001A\u00020\u00122\u0006\u0010\u001C\u001A\u00020\u000E2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00120\u001D\u00A2\u0006\u0004\b\u001F\u0010 J)\u0010#\u001A\u00020\u00122\b\u0010\"\u001A\u0004\u0018\u00010!2\u0010\b\u0002\u0010\u001E\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001D\u00A2\u0006\u0004\b#\u0010$J3\u0010\'\u001A\u00020\u00122\n\b\u0003\u0010%\u001A\u0004\u0018\u00010\t2\n\b\u0003\u0010&\u001A\u0004\u0018\u00010\t2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00120\u001D\u00A2\u0006\u0004\b\'\u0010(J#\u0010)\u001A\u00020\u00122\u0006\u0010\u001C\u001A\u00020\u000E2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00120\u001D\u00A2\u0006\u0004\b)\u0010 R\"\u00101\u001A\u00020*8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R\u001B\u00106\u001A\u00020\t8FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105\u00A8\u00068"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;", "activity", "", "profileEnabled", "Lcom/kakao/tistory/presentation/viewmodel/BlogSwitchViewModel;", "blogSwitchViewModel", "", "init", "(Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;ZLcom/kakao/tistory/presentation/viewmodel/BlogSwitchViewModel;)V", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;", "appBarHomeAsUpButtonType", "initAppBarHomeAsUp", "(Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;)V", "initViewModel", "()V", "onCreateOptionsMenu", "enabled", "Lkotlin/Function0;", "onClick", "updateAppBarHomeAsUpEnabled", "(ZLkotlin/jvm/functions/Function0;)V", "Lcom/kakao/tistory/domain/entity/User;", "user", "updateAppBarUserImage", "(Lcom/kakao/tistory/domain/entity/User;Lkotlin/jvm/functions/Function0;)V", "iconNameStringId", "iconDrawableResId", "setMenuView", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "updateSearchButtonEnabled", "Lcom/kakao/tistory/presentation/databinding/LayoutTistoryToolbarBinding;", "b", "Lcom/kakao/tistory/presentation/databinding/LayoutTistoryToolbarBinding;", "getDataBinding", "()Lcom/kakao/tistory/presentation/databinding/LayoutTistoryToolbarBinding;", "setDataBinding", "(Lcom/kakao/tistory/presentation/databinding/LayoutTistoryToolbarBinding;)V", "dataBinding", "c", "Lkotlin/Lazy;", "getToolbarHeight", "()I", "toolbarHeight", "AppBarHomeAsUpButtonType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryToolbar.kt\ncom/kakao/tistory/presentation/view/common/widget/TistoryToolbar\n+ 2 ViewModelExtension.kt\ncom/kakao/android/base/viewmodel/ViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n17#2,5:231\n1#3:236\n*S KotlinDebug\n*F\n+ 1 TistoryToolbar.kt\ncom/kakao/tistory/presentation/view/common/widget/TistoryToolbar\n*L\n101#1:231,5\n101#1:236\n*E\n"})
public final class TistoryToolbar extends Toolbar {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000B\f\r\u000ER\u001A\u0010\u0007\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\n\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006\u0082\u0001\u0004\u000F\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;", "", "", "a", "I", "getDrawableResourceId", "()I", "drawableResourceId", "b", "getContentDescriptionStringId", "contentDescriptionStringId", "BackBlack", "BackWhite", "CloseBlack", "Custom", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType$BackBlack;", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType$BackWhite;", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType$CloseBlack;", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType$Custom;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class AppBarHomeAsUpButtonType {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType$BackBlack;", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class BackBlack extends AppBarHomeAsUpButtonType {
            public static final int $stable;
            @NotNull
            public static final BackBlack INSTANCE;

            static {
                BackBlack.INSTANCE = new BackBlack();
            }

            public BackBlack() {
                super(drawable.ic_navi_back_b, string.content_desc_back, null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType$BackWhite;", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class BackWhite extends AppBarHomeAsUpButtonType {
            public static final int $stable;
            @NotNull
            public static final BackWhite INSTANCE;

            static {
                BackWhite.INSTANCE = new BackWhite();
            }

            public BackWhite() {
                super(drawable.ic_navi_back_w, string.content_desc_back, null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType$CloseBlack;", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class CloseBlack extends AppBarHomeAsUpButtonType {
            public static final int $stable;
            @NotNull
            public static final CloseBlack INSTANCE;

            static {
                CloseBlack.INSTANCE = new CloseBlack();
            }

            public CloseBlack() {
                super(drawable.ic_navi_close_b, string.content_desc_close, null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u00022\b\b\u0003\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\bJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\bR\u001A\u0010\u0004\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001A\u0004\b\u0019\u0010\b¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType$Custom;", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;", "", "drawableResourceId", "contentDescriptionStringId", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType$Custom;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "I", "getDrawableResourceId", "d", "getContentDescriptionStringId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Custom extends AppBarHomeAsUpButtonType {
            public static final int $stable;
            public final int c;
            public final int d;

            public Custom(@DrawableRes int v, @StringRes int v1) {
                super(v, v1, null);
                this.c = v;
                this.d = v1;
            }

            public final int component1() {
                return this.c;
            }

            public final int component2() {
                return this.d;
            }

            @NotNull
            public final Custom copy(@DrawableRes int v, @StringRes int v1) {
                return new Custom(v, v1);
            }

            public static Custom copy$default(Custom tistoryToolbar$AppBarHomeAsUpButtonType$Custom0, int v, int v1, int v2, Object object0) {
                if((v2 & 1) != 0) {
                    v = tistoryToolbar$AppBarHomeAsUpButtonType$Custom0.c;
                }
                if((v2 & 2) != 0) {
                    v1 = tistoryToolbar$AppBarHomeAsUpButtonType$Custom0.d;
                }
                return tistoryToolbar$AppBarHomeAsUpButtonType$Custom0.copy(v, v1);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof Custom)) {
                    return false;
                }
                return this.c == ((Custom)object0).c ? this.d == ((Custom)object0).d : false;
            }

            @Override  // com.kakao.tistory.presentation.view.common.widget.TistoryToolbar$AppBarHomeAsUpButtonType
            public int getContentDescriptionStringId() {
                return this.d;
            }

            @Override  // com.kakao.tistory.presentation.view.common.widget.TistoryToolbar$AppBarHomeAsUpButtonType
            public int getDrawableResourceId() {
                return this.c;
            }

            @Override
            public int hashCode() {
                return this.d + this.c * 0x1F;
            }

            @Override
            @NotNull
            public String toString() {
                return "Custom(drawableResourceId=" + this.c + ", contentDescriptionStringId=" + this.d + ")";
            }
        }

        public static final int $stable;
        public final int a;
        public final int b;

        public AppBarHomeAsUpButtonType(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = v;
            this.b = v1;
        }

        public int getContentDescriptionStringId() {
            return this.b;
        }

        public int getDrawableResourceId() {
            return this.a;
        }
    }

    public static final int $stable = 8;
    public TistoryActivity a;
    public LayoutTistoryToolbarBinding b;
    public final Lazy c;
    public boolean d;
    public TistoryToolbarViewModel e;
    public BlogSwitchViewModel f;

    public TistoryToolbar(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(this.getContext()), layout.layout_tistory_toolbar, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.b = (LayoutTistoryToolbarBinding)viewDataBinding0;
        this.c = c.lazy(new g(this));
    }

    public TistoryToolbar(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(this.getContext()), layout.layout_tistory_toolbar, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.b = (LayoutTistoryToolbarBinding)viewDataBinding0;
        this.c = c.lazy(new g(this));
    }

    public TistoryToolbar(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(this.getContext()), layout.layout_tistory_toolbar, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.b = (LayoutTistoryToolbarBinding)viewDataBinding0;
        this.c = c.lazy(new g(this));
    }

    public static final void a(Function0 function00, View view0) {
        Intrinsics.checkNotNullParameter(function00, "$onClick");
        function00.invoke();
    }

    public static final boolean a(TistoryToolbar tistoryToolbar0, View view0) {
        Intrinsics.checkNotNullParameter(tistoryToolbar0, "this$0");
        CommonBottomDialogFragment commonBottomDialogFragment0 = CommonBottomDialogFragment.Companion.newInstance();
        TistoryToolbarViewModel tistoryToolbarViewModel0 = tistoryToolbar0.e;
        TistoryActivity tistoryActivity0 = null;
        if(tistoryToolbarViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tistoryToolbarViewModel");
            tistoryToolbarViewModel0 = null;
        }
        commonBottomDialogFragment0.setItems(tistoryToolbarViewModel0.getSortItems());
        commonBottomDialogFragment0.setOnSelectedItem(new k(tistoryToolbar0));
        TistoryActivity tistoryActivity1 = tistoryToolbar0.a;
        if(tistoryActivity1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        }
        else {
            tistoryActivity0 = tistoryActivity1;
        }
        commonBottomDialogFragment0.show(tistoryActivity0.getSupportFragmentManager(), "CommonBottomDialogFragment");
        return true;
    }

    public static final void b(Function0 function00, View view0) {
        Intrinsics.checkNotNullParameter(function00, "$onClick");
        function00.invoke();
    }

    public static final void c(Function0 function00, View view0) {
        Intrinsics.checkNotNullParameter(function00, "$onClick");
        function00.invoke();
    }

    @NotNull
    public final LayoutTistoryToolbarBinding getDataBinding() {
        return this.b;
    }

    public final int getToolbarHeight() {
        return ((Number)this.c.getValue()).intValue();
    }

    public final void init(@NotNull TistoryActivity tistoryActivity0, boolean z, @Nullable BlogSwitchViewModel blogSwitchViewModel0) {
        Intrinsics.checkNotNullParameter(tistoryActivity0, "activity");
        this.a = tistoryActivity0;
        this.d = z;
        this.f = blogSwitchViewModel0;
        this.initViewModel();
        this.initAppBarHomeAsUp(BackBlack.INSTANCE);
    }

    public static void init$default(TistoryToolbar tistoryToolbar0, TistoryActivity tistoryActivity0, boolean z, BlogSwitchViewModel blogSwitchViewModel0, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            blogSwitchViewModel0 = null;
        }
        tistoryToolbar0.init(tistoryActivity0, z, blogSwitchViewModel0);
    }

    public final void initAppBarHomeAsUp(@NotNull AppBarHomeAsUpButtonType tistoryToolbar$AppBarHomeAsUpButtonType0) {
        Intrinsics.checkNotNullParameter(tistoryToolbar$AppBarHomeAsUpButtonType0, "appBarHomeAsUpButtonType");
        ImageButton imageButton0 = this.b.commonAppBarHomeAsUpButton;
        imageButton0.setImageResource(tistoryToolbar$AppBarHomeAsUpButtonType0.getDrawableResourceId());
        imageButton0.setContentDescription(imageButton0.getContext().getString(tistoryToolbar$AppBarHomeAsUpButtonType0.getContentDescriptionStringId()));
        imageButton0.setVisibility(0);
    }

    public final void initViewModel() {
        TistoryActivity tistoryActivity0 = this.a;
        TistoryActivity tistoryActivity1 = null;
        if(tistoryActivity0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            tistoryActivity0 = null;
        }
        BaseViewModel baseViewModel0 = (BaseViewModel)new ViewModelProvider(tistoryActivity0).get(TistoryToolbarViewModel.class);
        ViewModelExtensionKt.setTiara(baseViewModel0, tistoryActivity0);
        TistoryToolbarViewModel tistoryToolbarViewModel0 = (TistoryToolbarViewModel)baseViewModel0;
        this.e = tistoryToolbarViewModel0;
        if(tistoryToolbarViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tistoryToolbarViewModel");
            tistoryToolbarViewModel0 = null;
        }
        LiveData liveData0 = tistoryToolbarViewModel0.getUser();
        TistoryActivity tistoryActivity2 = this.a;
        if(tistoryActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            tistoryActivity2 = null;
        }
        liveData0.observe(tistoryActivity2, new f(new com.kakao.tistory.presentation.view.common.widget.c(this)));
        LiveData liveData1 = tistoryToolbarViewModel0.getShowFinishDialog();
        TistoryActivity tistoryActivity3 = this.a;
        if(tistoryActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        }
        else {
            tistoryActivity1 = tistoryActivity3;
        }
        LiveDataExtensionKt.observeEvent(liveData1, tistoryActivity1, new e(this));
    }

    public final void onCreateOptionsMenu() {
        this.b.commonAppBarUserImage.setVisibility(4);
        this.b.commonToolbarMenuText.setVisibility(8);
    }

    public final void setDataBinding(@NotNull LayoutTistoryToolbarBinding layoutTistoryToolbarBinding0) {
        Intrinsics.checkNotNullParameter(layoutTistoryToolbarBinding0, "<set-?>");
        this.b = layoutTistoryToolbarBinding0;
    }

    public final void setMenuView(@StringRes @Nullable Integer integer0, @DrawableRes @Nullable Integer integer1, @NotNull Function0 function00) {
        int v1;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        this.b.commonAppBarUserImage.setVisibility(4);
        int v = 0;
        this.b.commonToolbarMenuContainer.setVisibility(0);
        TextView textView0 = this.b.commonToolbarMenuText;
        if(integer0 == null) {
            v1 = 8;
        }
        else {
            this.b.commonToolbarMenuText.setText(this.getContext().getString(integer0.intValue()));
            v1 = 0;
        }
        textView0.setVisibility(v1);
        ImageButton imageButton0 = this.b.commonToolbarMenuImageButton;
        if(integer1 == null) {
            v = 8;
        }
        else {
            this.b.commonToolbarMenuImageButton.setOnClickListener(new lc.c(function00, 0));
            this.b.commonToolbarMenuImageButton.setImageDrawable(this.getContext().getDrawable(integer1.intValue()));
            if(integer0 != null) {
                this.b.commonToolbarMenuImageButton.setContentDescription(this.getContext().getString(integer0.intValue()));
            }
        }
        imageButton0.setVisibility(v);
    }

    public static void setMenuView$default(TistoryToolbar tistoryToolbar0, Integer integer0, Integer integer1, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = null;
        }
        if((v & 2) != 0) {
            integer1 = null;
        }
        tistoryToolbar0.setMenuView(integer0, integer1, function00);
    }

    public final void updateAppBarHomeAsUpEnabled(boolean z, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onClick");
        ImageButton imageButton0 = this.b.commonAppBarHomeAsUpButton;
        imageButton0.setOnClickListener(new lc.c(function00, 2));
        imageButton0.setVisibility((z ? 0 : 8));
    }

    public final void updateAppBarUserImage(@Nullable User user0, @Nullable Function0 function00) {
        boolean z;
        TistoryToolbarViewModel tistoryToolbarViewModel0 = null;
        if(user0 != null) {
            ComposeView composeView0 = this.b.commonAppBarUserImage;
            TistoryToolbarViewModel tistoryToolbarViewModel1 = this.e;
            if(tistoryToolbarViewModel1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tistoryToolbarViewModel");
                tistoryToolbarViewModel1 = null;
            }
            User user1 = (User)tistoryToolbarViewModel1.getUser().getValue();
            if(user1 == null) {
                z = false;
            }
            else {
                Long long0 = user1.getId();
                if(long0 == null) {
                    z = false;
                }
                else {
                    Long long1 = user0.getId();
                    z = long1 == null || long0.longValue() != ((long)long1) ? false : true;
                }
            }
            composeView0.setVisibility(0);
            composeView0.setContent(ComposableLambdaKt.composableLambdaInstance(0xF88EC222, true, new j(user0, z, this, function00)));
            if(this.e == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tistoryToolbarViewModel");
            }
            tistoryToolbarViewModel0 = Unit.INSTANCE;
        }
        if(tistoryToolbarViewModel0 == null) {
            this.b.commonAppBarUserImage.setVisibility(8);
        }
    }

    public static void updateAppBarUserImage$default(TistoryToolbar tistoryToolbar0, User user0, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            function00 = null;
        }
        tistoryToolbar0.updateAppBarUserImage(user0, function00);
    }

    public final void updateSearchButtonEnabled(boolean z, @NotNull Function0 function00) {
        int v;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        ImageButton imageButton0 = this.b.commonAppSearchButton;
        if(z) {
            imageButton0.setOnClickListener(new lc.c(function00, 1));
            v = 0;
        }
        else {
            v = 8;
        }
        imageButton0.setVisibility(v);
    }
}

