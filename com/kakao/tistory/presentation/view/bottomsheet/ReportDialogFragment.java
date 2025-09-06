package com.kakao.tistory.presentation.view.bottomsheet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.q;
import com.google.android.material.R.id;
import com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.datepicker.i;
import com.google.android.material.datepicker.t;
import com.kakao.android.base.tiara.TiaraDelegator;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.utils.UiUtils;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.common.IllegalFilmType;
import com.kakao.tistory.presentation.common.ReportType;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.databinding.FragmentBottomSheetReportBinding;
import com.kakao.tistory.presentation.viewmodel.BlogTopReportData;
import com.kakao.tistory.presentation.viewmodel.ReportViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import gc.b;
import hc.e;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000F\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0013\u001A\u00020\u00072\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0005R*\u0010\u001E\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00168\u0014@VX\u0094\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR\u001C\u0010$\u001A\u00020\u001F8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001E\u0010*\u001A\u0004\u0018\u00010%8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001C\u0010-\u001A\u00020\u001F8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001E\u00100\u001A\u0004\u0018\u00010\u001F8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b.\u0010!\"\u0004\b/\u0010#¨\u00062"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/ReportDialogFragment;", "Lcom/kakao/android/base/ui/bottomsheet/BaseBottomSheetDialogFragment;", "Lcom/kakao/tistory/presentation/databinding/FragmentBottomSheetReportBinding;", "Lcom/kakao/android/base/tiara/TiaraListener;", "<init>", "()V", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "updatePageInfo", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "dismiss", "", "<set-?>", "g", "I", "getLayoutResourceId", "()I", "setLayoutResourceId", "(I)V", "layoutResourceId", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "action", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "actionKind", "getPage", "setPage", "page", "getSection", "setSection", "section", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nReportDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDialogFragment.kt\ncom/kakao/tistory/presentation/view/bottomsheet/ReportDialogFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,342:1\n14#2,4:343\n1#3:347\n1#3:363\n106#4,15:348\n*S KotlinDebug\n*F\n+ 1 ReportDialogFragment.kt\ncom/kakao/tistory/presentation/view/bottomsheet/ReportDialogFragment\n*L\n94#1:343,4\n94#1:347\n94#1:348,15\n*E\n"})
public final class ReportDialogFragment extends Hilt_ReportDialogFragment implements TiaraListener {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0085\u0001\u0010\u0012\u001A\u00020\u00112\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001A\u00020\f2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001A\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001A\u0010\u0015R\u0014\u0010\u001B\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001B\u0010\u0015R\u0014\u0010\u001C\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001C\u0010\u0015R\u0014\u0010\u001D\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001D\u0010\u0015¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/ReportDialogFragment$Companion;", "", "", "section", "page", "blogName", "", "blogId", "entryId", "authorId", "authorName", "entryTitle", "Lcom/kakao/tistory/presentation/common/IllegalFilmType;", "illegalFilmType", "commentId", "Lcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;", "blogTopReportData", "Lcom/kakao/tistory/presentation/view/bottomsheet/ReportDialogFragment;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/common/IllegalFilmType;Ljava/lang/Long;Lcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;)Lcom/kakao/tistory/presentation/view/bottomsheet/ReportDialogFragment;", "BUNDLE_AUTHOR_ID", "Ljava/lang/String;", "BUNDLE_AUTHOR_NAME", "BUNDLE_BLOG_ID", "BUNDLE_BLOG_NAME", "BUNDLE_COMMENT_ID", "BUNDLE_ENTRY_ID", "BUNDLE_ENTRY_TITLE", "BUNDLE_ILLEGAL_FILM_TYPE", "BUNDLE_REPORT_DATA", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ReportDialogFragment newInstance(@Nullable String s, @NotNull String s1, @NotNull String s2, @Nullable Long long0, @Nullable Long long1, @Nullable Long long2, @Nullable String s3, @Nullable String s4, @NotNull IllegalFilmType illegalFilmType0, @Nullable Long long3, @Nullable BlogTopReportData blogTopReportData0) {
            Intrinsics.checkNotNullParameter(s1, "page");
            Intrinsics.checkNotNullParameter(s2, "blogName");
            Intrinsics.checkNotNullParameter(illegalFilmType0, "illegalFilmType");
            ReportDialogFragment reportDialogFragment0 = new ReportDialogFragment();
            Bundle bundle0 = new Bundle();
            bundle0.putString("BUNDLE_ILLEGAL_FILM_TYPE", illegalFilmType0.name());
            bundle0.putString("BUNDLE_TIARA_SECTION_TYPE", s);
            bundle0.putString("BUNDLE_TIARA_PAGE_TYPE", s1);
            bundle0.putString("BUNDLE_BLOG_NAME", s2);
            bundle0.putString("BUNDLE_AUTHOR_NAME", s3);
            bundle0.putString("BUNDLE_ENTRY_TITLE", s4);
            bundle0.putParcelable("BUNDLE_REPORT_DATA", blogTopReportData0);
            long v = -1L;
            bundle0.putLong("BUNDLE_ENTRY_ID", (long1 == null ? -1L : ((long)long1)));
            bundle0.putLong("BUNDLE_BLOG_ID", (long0 == null ? -1L : ((long)long0)));
            bundle0.putLong("BUNDLE_COMMENT_ID", (long3 == null ? -1L : ((long)long3)));
            if(long2 != null) {
                v = (long)long2;
            }
            bundle0.putLong("BUNDLE_AUTHOR_ID", v);
            reportDialogFragment0.setArguments(bundle0);
            return reportDialogFragment0;
        }

        public static ReportDialogFragment newInstance$default(Companion reportDialogFragment$Companion0, String s, String s1, String s2, Long long0, Long long1, Long long2, String s3, String s4, IllegalFilmType illegalFilmType0, Long long3, BlogTopReportData blogTopReportData0, int v, Object object0) {
            Long long4 = (v & 8) == 0 ? long0 : null;
            Long long5 = (v & 16) == 0 ? long1 : null;
            Long long6 = (v & 0x20) == 0 ? long2 : null;
            String s5 = (v & 0x40) == 0 ? s3 : null;
            String s6 = (v & 0x80) == 0 ? s4 : null;
            IllegalFilmType illegalFilmType1 = (v & 0x100) == 0 ? illegalFilmType0 : IllegalFilmType.ARTICLE;
            Long long7 = (v & 0x200) == 0 ? long3 : null;
            return (v & 0x400) == 0 ? reportDialogFragment$Companion0.newInstance(s, s1, s2, long4, long5, long6, s5, s6, illegalFilmType1, long7, blogTopReportData0) : reportDialogFragment$Companion0.newInstance(s, s1, s2, long4, long5, long6, s5, s6, illegalFilmType1, long7, null);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final TiaraDelegator f;
    public int g;
    public String h;
    public String i;
    public Long j;
    public Long k;
    public long l;
    public Long m;
    public String n;
    public String o;
    public BlogTopReportData p;
    public final BaseViewModelLazy q;
    public final ArrayList r;
    public final ArrayList s;
    public final View.OnClickListener t;

    static {
        ReportDialogFragment.Companion = new Companion(null);
        ReportDialogFragment.$stable = 8;
    }

    public ReportDialogFragment() {
        this.f = new TiaraDelegator();
        this.g = layout.fragment_bottom_sheet_report;
        this.l = -1L;
        this.n = "";
        this.o = "";
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        this.q = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ReportViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy0)));
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new t(this, 13);
    }

    public static final void a(ReportDialogFragment reportDialogFragment0, View view0) {
        Intrinsics.checkNotNullParameter(reportDialogFragment0, "this$0");
        ReportViewModel reportViewModel0 = (ReportViewModel)reportDialogFragment0.q.getValue();
        Object object0 = view0.getTag();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type com.kakao.tistory.presentation.common.ReportType");
        reportViewModel0.onClickChange(((ReportType)object0));
    }

    public static final void a(ReportDialogFragment reportDialogFragment0, View view0, boolean z) {
        Intrinsics.checkNotNullParameter(reportDialogFragment0, "this$0");
        if(z) {
            ((ReportViewModel)reportDialogFragment0.q.getValue()).onClickChange(ReportType.REPORT_ETC);
            return;
        }
        ((FragmentBottomSheetReportBinding)reportDialogFragment0.getDataBinding()).bottomSheetReportEtcEditText.clearFocus();
        EditText editText0 = ((FragmentBottomSheetReportBinding)reportDialogFragment0.getDataBinding()).bottomSheetReportEtcEditText;
        Intrinsics.checkNotNullExpressionValue(editText0, "bottomSheetReportEtcEditText");
        UiUtils.INSTANCE.hideSoftInput(editText0);
    }

    public static final void a(ReportDialogFragment reportDialogFragment0, Boolean boolean0) {
        Intrinsics.checkNotNullParameter(reportDialogFragment0, "this$0");
        Intrinsics.checkNotNull(boolean0);
        if(boolean0.booleanValue()) {
            ((FragmentBottomSheetReportBinding)reportDialogFragment0.getDataBinding()).bottomSheetReportEtcEditText.requestFocus();
            EditText editText0 = ((FragmentBottomSheetReportBinding)reportDialogFragment0.getDataBinding()).bottomSheetReportEtcEditText;
            Intrinsics.checkNotNullExpressionValue(editText0, "bottomSheetReportEtcEditText");
            UiUtils.INSTANCE.showSoftInput(editText0);
            return;
        }
        ((FragmentBottomSheetReportBinding)reportDialogFragment0.getDataBinding()).bottomSheetReportEtcEditText.clearFocus();
        EditText editText1 = ((FragmentBottomSheetReportBinding)reportDialogFragment0.getDataBinding()).bottomSheetReportEtcEditText;
        Intrinsics.checkNotNullExpressionValue(editText1, "bottomSheetReportEtcEditText");
        UiUtils.INSTANCE.hideSoftInput(editText1);
    }

    public static final void a(ReportViewModel reportViewModel0, ReportDialogFragment reportDialogFragment0, Integer integer0) {
        Intrinsics.checkNotNullParameter(reportViewModel0, "$this_apply");
        Intrinsics.checkNotNullParameter(reportDialogFragment0, "this$0");
        InputFilter[] arr_inputFilter = {new InputFilter.LengthFilter(reportViewModel0.getETC_TEXT_LENGTH())};
        ((FragmentBottomSheetReportBinding)reportDialogFragment0.getDataBinding()).bottomSheetReportLengthText.setFilters(arr_inputFilter);
    }

    public static final boolean a(TextView textView0, int v, KeyEvent keyEvent0) {
        if(v == 6) {
            Intrinsics.checkNotNull(textView0);
            UiUtils.INSTANCE.hideSoftInput(textView0);
        }
        return false;
    }

    public final void a() {
        FragmentBottomSheetReportBinding fragmentBottomSheetReportBinding0 = (FragmentBottomSheetReportBinding)this.getDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton1, "bottomSheetReportImageButton1");
        this.r.add(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton1);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton2, "bottomSheetReportImageButton2");
        this.r.add(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton2);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton3, "bottomSheetReportImageButton3");
        this.r.add(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton3);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton4, "bottomSheetReportImageButton4");
        this.r.add(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton4);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton5, "bottomSheetReportImageButton5");
        this.r.add(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton5);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton6, "bottomSheetReportImageButton6");
        this.r.add(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton6);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton7, "bottomSheetReportImageButton7");
        this.r.add(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton7);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton8, "bottomSheetReportImageButton8");
        this.r.add(fragmentBottomSheetReportBinding0.bottomSheetReportImageButton8);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportText1, "bottomSheetReportText1");
        this.s.add(fragmentBottomSheetReportBinding0.bottomSheetReportText1);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportText2, "bottomSheetReportText2");
        this.s.add(fragmentBottomSheetReportBinding0.bottomSheetReportText2);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportText3, "bottomSheetReportText3");
        this.s.add(fragmentBottomSheetReportBinding0.bottomSheetReportText3);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportText4, "bottomSheetReportText4");
        this.s.add(fragmentBottomSheetReportBinding0.bottomSheetReportText4);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportText5, "bottomSheetReportText5");
        this.s.add(fragmentBottomSheetReportBinding0.bottomSheetReportText5);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportText6, "bottomSheetReportText6");
        this.s.add(fragmentBottomSheetReportBinding0.bottomSheetReportText6);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportText7, "bottomSheetReportText7");
        this.s.add(fragmentBottomSheetReportBinding0.bottomSheetReportText7);
        Intrinsics.checkNotNullExpressionValue(fragmentBottomSheetReportBinding0.bottomSheetReportText8, "bottomSheetReportText8");
        this.s.add(fragmentBottomSheetReportBinding0.bottomSheetReportText8);
        i i0 = new i(this, 7);
        fragmentBottomSheetReportBinding0.bottomSheetReportEtcEditText.setOnFocusChangeListener(i0);
        e e0 = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        fragmentBottomSheetReportBinding0.bottomSheetReportEtcEditText.setOnEditorActionListener(e0);
        ReportDialogFragment.initView.1.1.3 reportDialogFragment$initView$1$1$30 = new ReportDialogFragment.initView.1.1.3(this);
        fragmentBottomSheetReportBinding0.bottomSheetReportEtcEditText.addTextChangedListener(reportDialogFragment$initView$1$1$30);
    }

    public static final ReportViewModel access$getReportViewModel(ReportDialogFragment reportDialogFragment0) {
        return (ReportViewModel)reportDialogFragment0.q.getValue();
    }

    public final void b() {
        FragmentBottomSheetReportBinding fragmentBottomSheetReportBinding0 = (FragmentBottomSheetReportBinding)this.getDataBinding();
        ReportViewModel reportViewModel0 = (ReportViewModel)this.q.getValue();
        reportViewModel0.getEtcFocusable().observe(this.getViewLifecycleOwner(), new q(this, 4));
        reportViewModel0.getEtcMessageMaxLength().observe(this.getViewLifecycleOwner(), new b(2, reportViewModel0, this));
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(reportViewModel0.getShowReportSuccessDialog(), lifecycleOwner0, new u(this));
        LifecycleOwner lifecycleOwner1 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner1, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(reportViewModel0.getShowErrorDialog(), lifecycleOwner1, new w(this));
        LifecycleOwner lifecycleOwner2 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner2, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(reportViewModel0.getShowIllegalFilmingDialog(), lifecycleOwner2, new y(this));
        LifecycleOwner lifecycleOwner3 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner3, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(reportViewModel0.getOpenUsurpationPageEvent(), lifecycleOwner3, new z(this));
        reportViewModel0.getIllegalFilmReportUrl().observe(this.getViewLifecycleOwner(), new b0(new a0(this)));
        fragmentBottomSheetReportBinding0.setViewModel(reportViewModel0);
        Object object0 = this.q.getValue();
        String s = this.i;
        if(s == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogName");
            s = null;
        }
        ((ReportViewModel)object0).init(s, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r, this.s, this.t);
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetDialogFragment
    public void dismiss() {
        View view0 = this.getView();
        if(view0 != null) {
            view0.clearFocus();
        }
        super.dismiss();
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getAction() {
        return "";
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @Nullable
    public ActionKind getActionKind() {
        return this.f.getActionKind();
    }

    @Override  // com.kakao.android.base.ui.bottomsheet.BaseBottomSheetDialogFragment
    public int getLayoutResourceId() {
        return this.g;
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getPage() {
        return "";
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @Nullable
    public String getSection() {
        return this.f.getSection();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDismiss(@NotNull DialogInterface dialogInterface0) {
        Intrinsics.checkNotNullParameter(dialogInterface0, "dialog");
        super.onDismiss(dialogInterface0);
        this.dismiss();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Unit unit1;
        Unit unit0;
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        view0.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Dialog dialog0 = this.b.getDialog();
                if(dialog0 != null) {
                    FrameLayout frameLayout0 = (FrameLayout)dialog0.findViewById(id.design_bottom_sheet);
                    if(frameLayout0 != null) {
                        frameLayout0.getLayoutParams().height = -1;
                        frameLayout0.requestLayout();
                        BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.from(frameLayout0);
                        bottomSheetBehavior0.setState(3);
                        bottomSheetBehavior0.setPeekHeight(0);
                        bottomSheetBehavior0.setFitToContents(false);
                        bottomSheetBehavior0.addBottomSheetCallback(new BottomSheetCallback() {
                            @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
                            public void onSlide(@NotNull View view0, float f) {
                                Intrinsics.checkNotNullParameter(view0, "bottomSheet");
                            }

                            @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
                            public void onStateChanged(@NotNull View view0, int v) {
                                Intrinsics.checkNotNullParameter(view0, "bottomSheet");
                                if(v == 4 || v == 5 || v == 6) {
                                    this.b.removeBottomSheetCallback(this);
                                    this.b.dismiss();
                                }
                            }
                        });
                    }
                }
            }
        });
        Bundle bundle1 = this.getArguments();
        Long long0 = null;
        if(bundle1 != null) {
            this.setSection(bundle1.getString("BUNDLE_TIARA_SECTION_TYPE"));
            String s = bundle1.getString("BUNDLE_TIARA_PAGE_TYPE");
            if(s == null) {
                s = "미정";
            }
            else {
                Intrinsics.checkNotNull(s);
            }
            this.setPage(s);
            String s1 = bundle1.getString("BUNDLE_BLOG_NAME");
            if(s1 == null) {
                unit0 = null;
            }
            else {
                Intrinsics.checkNotNull(s1);
                this.i = s1;
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                this.dismiss();
            }
            long v = bundle1.getLong("BUNDLE_BLOG_ID");
            Long long1 = v > -1L ? v : null;
            if(long1 == null) {
                unit1 = null;
            }
            else {
                this.l = long1.longValue();
                unit1 = Unit.INSTANCE;
            }
            if(unit1 == null) {
                this.dismiss();
            }
            BlogTopReportData blogTopReportData0 = (BlogTopReportData)bundle1.getParcelable("BUNDLE_REPORT_DATA");
            if(blogTopReportData0 != null) {
                this.p = blogTopReportData0;
            }
            long v1 = bundle1.getLong("BUNDLE_ENTRY_ID", -1L);
            this.j = v1 > -1L ? v1 : null;
            long v2 = bundle1.getLong("BUNDLE_COMMENT_ID", -1L);
            this.k = v2 > -1L ? v2 : null;
            long v3 = bundle1.getLong("BUNDLE_AUTHOR_ID", -1L);
            Long long2 = v3;
            if(v3 > -1L) {
                long0 = long2;
            }
            this.m = long0;
            String s2 = bundle1.getString("BUNDLE_AUTHOR_NAME", "");
            Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
            this.n = s2;
            String s3 = bundle1.getString("BUNDLE_ENTRY_TITLE", "");
            Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
            this.o = s3;
            String s4 = bundle1.getString("BUNDLE_ILLEGAL_FILM_TYPE");
            if(s4 == null) {
                s4 = "ARTICLE";
            }
            else {
                Intrinsics.checkNotNull(s4);
            }
            this.h = s4;
            long0 = Unit.INSTANCE;
        }
        if(long0 == null) {
            this.dismiss();
        }
        ((FragmentBottomSheetReportBinding)this.getDataBinding()).setLifecycleOwner(this);
        this.a();
        this.b();
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setAction(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.f.setAction(s);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setActionKind(@Nullable ActionKind actionKind0) {
        this.f.setActionKind(actionKind0);
    }

    public void setLayoutResourceId(int v) {
        this.g = v;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setPage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.f.setPage(s);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setSection(@Nullable String s) {
        this.f.setSection(s);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        this.f.trackPage(tiaraListener0);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void updatePageInfo(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        this.f.updatePageInfo(tiaraListener0);
    }
}

