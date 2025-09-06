package com.kakao.tistory.presentation.viewmodel;

import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import androidx.room.a;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click.Builder;
import com.kakao.tiara.data.Click;
import com.kakao.tiara.data.Meta;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.usecase.GetIllegalFilmReportUrlUseCase;
import com.kakao.tistory.domain.usecase.PostReportCommentUseCase;
import com.kakao.tistory.domain.usecase.ReportBlogUseCase;
import com.kakao.tistory.domain.usecase.ReportGuestbookUseCase;
import com.kakao.tistory.presentation.common.ReportType;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.view.entry.EntryTiara;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ{\u0010!\u001A\u00020 2\u0006\u0010\u000F\u001A\u00020\u000E2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\b\u0010\u0012\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u00102\b\u0010\u0014\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00020\u000E2\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00192\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u001C0\u00192\u0006\u0010\u001F\u001A\u00020\u001E\u00A2\u0006\u0004\b!\u0010\"J\r\u0010#\u001A\u00020 \u00A2\u0006\u0004\b#\u0010$J\u0015\u0010\'\u001A\u00020 2\u0006\u0010&\u001A\u00020%\u00A2\u0006\u0004\b\'\u0010(J\r\u0010)\u001A\u00020 \u00A2\u0006\u0004\b)\u0010$J\r\u0010*\u001A\u00020 \u00A2\u0006\u0004\b*\u0010$J\u001D\u0010-\u001A\u00020 2\u0006\u0010+\u001A\u00020\u000E2\u0006\u0010,\u001A\u00020\u000E\u00A2\u0006\u0004\b-\u0010.R\u001A\u00104\u001A\u00020/8\u0006X\u0086D\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R(\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b6\u00107\u001A\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010\u0011\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b<\u00107\u001A\u0004\b=\u00109\"\u0004\b>\u0010;R*\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b?\u00107\u001A\u0004\b@\u00109\"\u0004\bA\u0010;R*\u0010\u0018\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u0017058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bB\u00107\u001A\u0004\bC\u00109\"\u0004\bD\u0010;R$\u0010K\u001A\u0004\u0018\u00010\u000E8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bE\u0010F\u001A\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001D\u0010R\u001A\b\u0012\u0004\u0012\u00020M0L8\u0006\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\bP\u0010QR\u001D\u0010U\u001A\b\u0012\u0004\u0012\u00020M0L8\u0006\u00A2\u0006\f\n\u0004\bS\u0010O\u001A\u0004\bT\u0010QR\u001D\u0010X\u001A\b\u0012\u0004\u0012\u00020M0L8\u0006\u00A2\u0006\f\n\u0004\bV\u0010O\u001A\u0004\bW\u0010QR\u001D\u0010[\u001A\b\u0012\u0004\u0012\u00020/058\u0006\u00A2\u0006\f\n\u0004\bY\u00107\u001A\u0004\bZ\u00109R\u001D\u0010^\u001A\b\u0012\u0004\u0012\u00020/058\u0006\u00A2\u0006\f\n\u0004\b\\\u00107\u001A\u0004\b]\u00109R\u001D\u0010a\u001A\b\u0012\u0004\u0012\u00020\u000E0L8\u0006\u00A2\u0006\f\n\u0004\b_\u0010O\u001A\u0004\b`\u0010QR\u001D\u0010d\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0b0L8F\u00A2\u0006\u0006\u001A\u0004\bc\u0010QR\u001D\u0010f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0b0L8F\u00A2\u0006\u0006\u001A\u0004\be\u0010QR\u001D\u0010h\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0b0L8F\u00A2\u0006\u0006\u001A\u0004\bg\u0010Q\u00A8\u0006i"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/ReportViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/usecase/PostReportCommentUseCase;", "postReportCommentUseCase", "Lcom/kakao/tistory/domain/usecase/ReportGuestbookUseCase;", "reportGuestbookUseCase", "Lcom/kakao/tistory/domain/usecase/ReportBlogUseCase;", "reportBlogUseCase", "Lcom/kakao/tistory/domain/usecase/GetIllegalFilmReportUrlUseCase;", "getIllegalFilmReportUrlUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/usecase/PostReportCommentUseCase;Lcom/kakao/tistory/domain/usecase/ReportGuestbookUseCase;Lcom/kakao/tistory/domain/usecase/ReportBlogUseCase;Lcom/kakao/tistory/domain/usecase/GetIllegalFilmReportUrlUseCase;)V", "", "blogName", "", "entryId", "commentId", "blogId", "authorId", "authorName", "entryTitle", "Lcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;", "blogTopReportData", "", "Landroid/widget/ImageButton;", "buttons", "Landroid/widget/TextView;", "texts", "Landroid/view/View$OnClickListener;", "onClickListener", "", "init", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;Ljava/util/List;Ljava/util/List;Landroid/view/View$OnClickListener;)V", "afterTextChangedEtc", "()V", "Lcom/kakao/tistory/presentation/common/ReportType;", "tag", "onClickChange", "(Lcom/kakao/tistory/presentation/common/ReportType;)V", "onClickReport", "onClickUsurpation", "baseUrl", "illegalFilmType", "checkIllegalContentReportUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "", "l", "I", "getETC_TEXT_LENGTH", "()I", "ETC_TEXT_LENGTH", "Landroidx/lifecycle/MutableLiveData;", "m", "Landroidx/lifecycle/MutableLiveData;", "getBlogName", "()Landroidx/lifecycle/MutableLiveData;", "setBlogName", "(Landroidx/lifecycle/MutableLiveData;)V", "n", "getEntryId", "setEntryId", "o", "getCommentId", "setCommentId", "p", "getBlogTopReportData", "setBlogTopReportData", "t", "Ljava/lang/String;", "getReportMessage", "()Ljava/lang/String;", "setReportMessage", "(Ljava/lang/String;)V", "reportMessage", "Landroidx/lifecycle/LiveData;", "", "x", "Landroidx/lifecycle/LiveData;", "getTextCountEnable", "()Landroidx/lifecycle/LiveData;", "textCountEnable", "y", "getReportButtonEnabled", "reportButtonEnabled", "z", "getEtcFocusable", "etcFocusable", "A", "getEtcMessageMaxLength", "etcMessageMaxLength", "B", "getEtcMessageLength", "etcMessageLength", "G", "getIllegalFilmReportUrl", "illegalFilmReportUrl", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getShowReportSuccessDialog", "showReportSuccessDialog", "getOpenUsurpationPageEvent", "openUsurpationPageEvent", "getShowIllegalFilmingDialog", "showIllegalFilmingDialog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nReportViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/ReportViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1#2:351\n*E\n"})
public final class ReportViewModel extends TistoryViewModel {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ReportType.values().length];
            try {
                arr_v[ReportType.REPORT_ILLEGAL_FILMING.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    public final MutableLiveData A;
    public final MutableLiveData B;
    public final MutableLiveData C;
    public final MutableLiveData D;
    public final MutableLiveData E;
    public final MutableLiveData F;
    public final LiveData G;
    public final ReadWriteProperty H;
    public static final KProperty[] I;
    public final EntryRepository g;
    public final PostReportCommentUseCase h;
    public final ReportGuestbookUseCase i;
    public final ReportBlogUseCase j;
    public final GetIllegalFilmReportUrlUseCase k;
    public final int l;
    public MutableLiveData m;
    public MutableLiveData n;
    public MutableLiveData o;
    public MutableLiveData p;
    public final MutableLiveData q;
    public final MutableLiveData r;
    public final MutableLiveData s;
    public String t;
    public final MutableLiveData u;
    public final MutableLiveData v;
    public final MutableLiveData w;
    public final LiveData x;
    public final LiveData y;
    public final LiveData z;

    static {
        ReportViewModel.I = new KProperty[]{a.s(ReportViewModel.class, "blogId", "getBlogId()J", 0)};
        ReportViewModel.$stable = 8;
    }

    @Inject
    public ReportViewModel(@NotNull EntryRepository entryRepository0, @NotNull PostReportCommentUseCase postReportCommentUseCase0, @NotNull ReportGuestbookUseCase reportGuestbookUseCase0, @NotNull ReportBlogUseCase reportBlogUseCase0, @NotNull GetIllegalFilmReportUrlUseCase getIllegalFilmReportUrlUseCase0) {
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(postReportCommentUseCase0, "postReportCommentUseCase");
        Intrinsics.checkNotNullParameter(reportGuestbookUseCase0, "reportGuestbookUseCase");
        Intrinsics.checkNotNullParameter(reportBlogUseCase0, "reportBlogUseCase");
        Intrinsics.checkNotNullParameter(getIllegalFilmReportUrlUseCase0, "getIllegalFilmReportUrlUseCase");
        super();
        this.g = entryRepository0;
        this.h = postReportCommentUseCase0;
        this.i = reportGuestbookUseCase0;
        this.j = reportBlogUseCase0;
        this.k = getIllegalFilmReportUrlUseCase0;
        this.l = 500;
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.p = new MutableLiveData();
        this.q = new MutableLiveData();
        this.r = new MutableLiveData();
        this.s = new MutableLiveData();
        this.u = new MutableLiveData();
        this.v = new MutableLiveData();
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.w = mutableLiveData0;
        this.x = Transformations.map(mutableLiveData0, v3.a);
        this.y = Transformations.map(mutableLiveData0, new r3(this));
        this.z = Transformations.map(mutableLiveData0, p3.a);
        this.A = new MutableLiveData();
        this.B = new MutableLiveData();
        this.C = new MutableLiveData();
        this.D = new MutableLiveData();
        this.E = new MutableLiveData();
        MutableLiveData mutableLiveData1 = new MutableLiveData();
        this.F = mutableLiveData1;
        this.G = LiveDataExtensionKt.asLiveData(mutableLiveData1);
        this.H = Delegates.INSTANCE.notNull();
    }

    public static final long access$getBlogId(ReportViewModel reportViewModel0) {
        return ((Number)reportViewModel0.H.getValue(reportViewModel0, ReportViewModel.I[0])).longValue();
    }

    public final void afterTextChangedEtc() {
        this.w.setValue(ReportType.REPORT_ETC);
        this.B.setValue(((int)(this.t == null ? 0 : this.t.length())));
    }

    public final void checkIllegalContentReportUrl(@NotNull String s, @NotNull String s1) {
        Long long1;
        Intrinsics.checkNotNullParameter(s, "baseUrl");
        Intrinsics.checkNotNullParameter(s1, "illegalFilmType");
        boolean z = true;
        Long long0 = null;
        if((Intrinsics.areEqual(s1, "GUESTBOOK_COMMENT") ? true : Intrinsics.areEqual(s1, "PROFILE_IMAGE"))) {
            long1 = null;
        }
        else {
            Long long2 = (Long)this.n.getValue();
            if(long2 == null) {
                return;
            }
            long1 = long2;
        }
        if(!Intrinsics.areEqual(s1, "ARTICLE")) {
            z = Intrinsics.areEqual(s1, "PROFILE_IMAGE");
        }
        if(!z) {
            long0 = (Long)this.o.getValue();
            if(long0 == null) {
                return;
            }
        }
        Object object0 = this.p.getValue();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new o3(this, s, s1, long1, long0, ((BlogTopReportData)object0), null), 3, null);
    }

    @NotNull
    public final MutableLiveData getBlogName() {
        return this.m;
    }

    @NotNull
    public final MutableLiveData getBlogTopReportData() {
        return this.p;
    }

    @NotNull
    public final MutableLiveData getCommentId() {
        return this.o;
    }

    public final int getETC_TEXT_LENGTH() {
        return this.l;
    }

    @NotNull
    public final MutableLiveData getEntryId() {
        return this.n;
    }

    @NotNull
    public final LiveData getEtcFocusable() {
        return this.z;
    }

    @NotNull
    public final MutableLiveData getEtcMessageLength() {
        return this.B;
    }

    @NotNull
    public final MutableLiveData getEtcMessageMaxLength() {
        return this.A;
    }

    @NotNull
    public final LiveData getIllegalFilmReportUrl() {
        return this.G;
    }

    @NotNull
    public final LiveData getOpenUsurpationPageEvent() {
        return this.D;
    }

    @NotNull
    public final LiveData getReportButtonEnabled() {
        return this.y;
    }

    @Nullable
    public final String getReportMessage() {
        return this.t;
    }

    @NotNull
    public final LiveData getShowIllegalFilmingDialog() {
        return this.E;
    }

    @NotNull
    public final LiveData getShowReportSuccessDialog() {
        return this.C;
    }

    @NotNull
    public final LiveData getTextCountEnable() {
        return this.x;
    }

    public final void init(@NotNull String s, @Nullable Long long0, @Nullable Long long1, long v, @Nullable Long long2, @NotNull String s1, @NotNull String s2, @Nullable BlogTopReportData blogTopReportData0, @NotNull List list0, @NotNull List list1, @NotNull View.OnClickListener view$OnClickListener0) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "authorName");
        Intrinsics.checkNotNullParameter(s2, "entryTitle");
        Intrinsics.checkNotNullParameter(list0, "buttons");
        Intrinsics.checkNotNullParameter(list1, "texts");
        Intrinsics.checkNotNullParameter(view$OnClickListener0, "onClickListener");
        this.m.setValue(s);
        int v1 = 0;
        this.H.setValue(this, ReportViewModel.I[0], v);
        this.n.setValue(long0);
        this.o.setValue(long1);
        this.q.setValue(long2);
        this.r.setValue(s1);
        this.s.setValue(s2);
        this.p.setValue(blogTopReportData0);
        this.w.setValue(ReportType.NONE);
        this.B.setValue(0);
        this.A.setValue(this.l);
        this.u.setValue(list0);
        this.v.setValue(list1);
        int v2 = 0;
        for(Object object0: list0) {
            ((ImageButton)object0).setTag(ReportType.values()[v2]);
            ((ImageButton)object0).setOnClickListener(view$OnClickListener0);
            ++v2;
        }
        for(Object object1: list1) {
            ((TextView)object1).setTag(ReportType.values()[v1]);
            ((TextView)object1).setOnClickListener(view$OnClickListener0);
            ++v1;
        }
    }

    public static void init$default(ReportViewModel reportViewModel0, String s, Long long0, Long long1, long v, Long long2, String s1, String s2, BlogTopReportData blogTopReportData0, List list0, List list1, View.OnClickListener view$OnClickListener0, int v1, Object object0) {
        reportViewModel0.init(s, long0, long1, v, long2, s1, s2, ((v1 & 0x80) == 0 ? blogTopReportData0 : null), list0, list1, view$OnClickListener0);
    }

    public final void onClickChange(@NotNull ReportType reportType0) {
        Intrinsics.checkNotNullParameter(reportType0, "tag");
        List list0 = (List)this.u.getValue();
        if(list0 != null) {
            MutableLiveData mutableLiveData0 = this.w;
            if(WhenMappings.$EnumSwitchMapping$0[reportType0.ordinal()] == 1) {
                Event event0 = new Event(Unit.INSTANCE);
                this.E.postValue(event0);
                reportType0 = ReportType.NONE;
            }
            mutableLiveData0.setValue(reportType0);
            for(Object object0: list0) {
                ((ImageButton)object0).setSelected(((ImageButton)object0).getTag() == this.w.getValue());
            }
        }
    }

    public final void onClickReport() {
        if(((ReportType)this.w.getValue()) != null) {
            ReportType reportType0 = (ReportType)this.w.getValue();
            if(reportType0 != null) {
                Integer integer0 = reportType0.getNameRes();
                if(integer0 != null) {
                    String s = BaseKt.getAppContext().getString(integer0.intValue());
                    if(s != null) {
                        Object object0 = this.m.getValue();
                        if(((String)object0) == null) {
                            return;
                        }
                        Long long0 = (Long)this.n.getValue();
                        Long long1 = (Long)this.o.getValue();
                        if(long1 != null) {
                            if(this.q.getValue() == null) {
                                Map map0 = w.mapOf(TuplesKt.to("name", "NONE"));
                                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_REPORT_COMPLETE, null, null, null, map0, null, 0xB8, null);
                            }
                            else {
                                Long long2 = (Long)this.q.getValue();
                                String s1 = (String)this.r.getValue();
                                String s2 = "";
                                if(s1 == null) {
                                    s1 = "";
                                }
                                String s3 = (String)this.s.getValue();
                                if(s3 != null) {
                                    s2 = s3;
                                }
                                Builder click$Builder0 = new Builder();
                                click$Builder0.copy(s);
                                com.kakao.tiara.data.Meta.Builder meta$Builder0 = new com.kakao.tiara.data.Meta.Builder();
                                meta$Builder0.id(String.valueOf(long0));
                                meta$Builder0.name(s2);
                                meta$Builder0.provider(((String)object0));
                                meta$Builder0.author(s1);
                                meta$Builder0.authorId(String.valueOf(long2));
                                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_REPORT_COMPLETE, null, click$Builder0.build(), meta$Builder0.build(), null, null, 200, null);
                            }
                            if(long0 != null) {
                                if(((long)long0) == 0L) {
                                    BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new u3(this, ((String)object0), "NONE", ((long)long1), null), 3, null);
                                    return;
                                }
                                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new s3(this, ((String)object0), ((long)long0), ((long)long1), "NONE", null), 3, null);
                                return;
                            }
                            return;
                        }
                        if(long0 != null) {
                            EntryTiara.INSTANCE.trackClickReportComplete(long0.toString(), ((String)object0), "NONE", s);
                            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new t3(this, ((String)object0), ((long)long0), "NONE", null), 3, null);
                            return;
                        }
                        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
                        Meta meta0 = TistoryTiara.createMeta$default(TistoryTiara.INSTANCE, null, null, null, null, null, ((String)object0), null, null, null, null, null, null, null, null, null, 0x7FDF, null);
                        Map map1 = w.mapOf(TuplesKt.to("name", "NONE"));
                        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_REPORT_COMPLETE, null, click0, meta0, map1, null, 0x88, null);
                        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new q3(this, ((String)object0), "NONE", null), 3, null);
                    }
                }
            }
        }
    }

    public final void onClickUsurpation() {
        Event event0 = new Event(Unit.INSTANCE);
        this.D.setValue(event0);
    }

    public final void setBlogName(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.m = mutableLiveData0;
    }

    public final void setBlogTopReportData(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.p = mutableLiveData0;
    }

    public final void setCommentId(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.o = mutableLiveData0;
    }

    public final void setEntryId(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.n = mutableLiveData0;
    }

    public final void setReportMessage(@Nullable String s) {
        this.t = s;
    }
}

