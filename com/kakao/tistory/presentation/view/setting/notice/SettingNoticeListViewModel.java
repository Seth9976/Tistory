package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import com.kakao.tistory.domain.blog.usecase.GetEntryListUseCase;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.presentation.common.TistoryMVIViewmodel;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListEvent.GoNotice;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListIntent.Load;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListIntent.LoadComplete;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListIntent;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListUiState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000B\u0010\fJ \u0010\u000F\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/SettingNoticeListViewModel;", "Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListIntent;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListEvent;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListUiState;", "Lcom/kakao/tistory/domain/blog/usecase/GetEntryListUseCase;", "getEntryListUseCase", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "<init>", "(Lcom/kakao/tistory/domain/blog/usecase/GetEntryListUseCase;Lcom/kakao/tistory/domain/repository/EntryRepository;)V", "createInitState", "()Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListUiState;", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListUiState;Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSettingNoticeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingNoticeViewModel.kt\ncom/kakao/tistory/presentation/view/setting/notice/SettingNoticeListViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,81:1\n53#2:82\n55#2:86\n50#3:83\n55#3:85\n107#4:84\n*S KotlinDebug\n*F\n+ 1 SettingNoticeViewModel.kt\ncom/kakao/tistory/presentation/view/setting/notice/SettingNoticeListViewModel\n*L\n56#1:82\n56#1:86\n56#1:83\n56#1:85\n56#1:84\n*E\n"})
public final class SettingNoticeListViewModel extends TistoryMVIViewmodel {
    public static final int $stable = 8;
    public final GetEntryListUseCase f;

    @Inject
    public SettingNoticeListViewModel(@NotNull GetEntryListUseCase getEntryListUseCase0, @NotNull EntryRepository entryRepository0) {
        Intrinsics.checkNotNullParameter(getEntryListUseCase0, "getEntryListUseCase");
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        super();
        this.f = getEntryListUseCase0;
        this.sendIntent(Load.INSTANCE);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new w(entryRepository0, this, null), 3, null);
    }

    public static final void access$onClickNoticeEntry(SettingNoticeListViewModel settingNoticeListViewModel0, String s, long v, String s1) {
        settingNoticeListViewModel0.getClass();
        SettingNoticeTiara.INSTANCE.onClickNotice(s1);
        settingNoticeListViewModel0.sendEvent(new GoNotice(s, v));
    }

    @NotNull
    public SettingNoticeListUiState createInitState() {
        return new SettingNoticeListUiState(null, 1, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object createInitState() {
        return this.createInitState();
    }

    @Nullable
    public Object handleIntent(@NotNull SettingNoticeListUiState settingNoticeListUiState0, @NotNull SettingNoticeListIntent settingNoticeListIntent0, @NotNull Continuation continuation0) {
        if(Intrinsics.areEqual(settingNoticeListIntent0, Load.INSTANCE)) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new z(this, "notice", null), 3, null);
            return settingNoticeListUiState0;
        }
        if(!(settingNoticeListIntent0 instanceof LoadComplete)) {
            throw new NoWhenBranchMatchedException();
        }
        return settingNoticeListUiState0.copy(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListViewModel.handleIntent..inlined.map.1.2 settingNoticeListViewModel$handleIntent$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListViewModel.handleIntent..inlined.map.1.2.1 settingNoticeListViewModel$handleIntent$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListViewModel.handleIntent..inlined.map.1.2.1) {
                            settingNoticeListViewModel$handleIntent$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListViewModel.handleIntent..inlined.map.1.2.1)continuation0;
                            int v = settingNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                settingNoticeListViewModel$handleIntent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object a;
                                    public int b;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.a = object0;
                                        this.b |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                settingNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            settingNoticeListViewModel$handleIntent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object a;
                                public int b;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.a = object0;
                                    this.b |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = settingNoticeListViewModel$handleIntent$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(settingNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                PagingData pagingData0 = PagingDataTransforms.map(((PagingData)object0), new y(this.b, null));
                                settingNoticeListViewModel$handleIntent$$inlined$map$1$2$10.b = 1;
                                return this.b.emit(pagingData0, settingNoticeListViewModel$handleIntent$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.collect(settingNoticeListViewModel$handleIntent$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        });
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((SettingNoticeListUiState)object0), ((SettingNoticeListIntent)object1), continuation0);
    }
}

