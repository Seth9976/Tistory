package com.kakao.tistory.presentation.screen.home;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.home.usecase.GetCategorySlotListUseCase;
import com.kakao.tistory.domain.home.usecase.GetHomeSlotListUseCase;
import com.kakao.tistory.domain.home.usecase.SetCategoryPreferenceUseCase;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.usecase.FollowBlogUseCase;
import com.kakao.tistory.domain.usecase.UnFollowBlogUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.TistoryMVIViewmodel;
import com.kakao.tistory.presentation.screen.home.contract.DialogType.Alert;
import com.kakao.tistory.presentation.screen.home.contract.HomeEvent.ShowToast;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.ChangeFollow;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.FollowFail;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.HideDialog;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.Loading;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.OnClickFollow;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.OnClickUnFollow;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.SelectCategory;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.ShowDialog;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.ShowErrorDialog;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.SlotListLoadingFail;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.SlotListLoadingSuccess;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent.UpdateCategory;
import com.kakao.tistory.presentation.screen.home.contract.HomeIntent;
import com.kakao.tistory.presentation.screen.home.contract.HomeUiState;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotMapperKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.FollowableContents;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState;
import com.kakao.tistory.presentation.screen.item.ViewState.Error;
import com.kakao.tistory.presentation.screen.item.ViewState.Success;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B9\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/HomeViewModel;", "Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeEvent;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeUiState;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/home/usecase/GetHomeSlotListUseCase;", "getHomeSlotListUseCase", "Lcom/kakao/tistory/domain/home/usecase/GetCategorySlotListUseCase;", "getCategorySlotListUseCase", "Lcom/kakao/tistory/domain/home/usecase/SetCategoryPreferenceUseCase;", "setCategoryPreferenceUseCase", "Lcom/kakao/tistory/domain/usecase/FollowBlogUseCase;", "followBlogUseCase", "Lcom/kakao/tistory/domain/usecase/UnFollowBlogUseCase;", "unFollowBlogUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/home/usecase/GetHomeSlotListUseCase;Lcom/kakao/tistory/domain/home/usecase/GetCategorySlotListUseCase;Lcom/kakao/tistory/domain/home/usecase/SetCategoryPreferenceUseCase;Lcom/kakao/tistory/domain/usecase/FollowBlogUseCase;Lcom/kakao/tistory/domain/usecase/UnFollowBlogUseCase;)V", "createInitState", "()Lcom/kakao/tistory/presentation/screen/home/contract/HomeUiState;", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/screen/home/contract/HomeUiState;Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/kakao/tistory/presentation/screen/home/HomeViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n1#2:246\n1549#3:247\n1620#3,3:248\n1549#3:251\n1620#3,3:252\n1549#3:255\n1620#3,3:256\n1549#3:259\n1620#3,3:260\n1549#3:263\n1620#3,3:264\n1549#3:267\n1620#3,3:268\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/kakao/tistory/presentation/screen/home/HomeViewModel\n*L\n138#1:247\n138#1:248,3\n152#1:251\n152#1:252,3\n174#1:255\n174#1:256,3\n193#1:259\n193#1:260,3\n203#1:263\n203#1:264,3\n213#1:267\n213#1:268,3\n*E\n"})
public final class HomeViewModel extends TistoryMVIViewmodel {
    public static final int $stable = 8;
    public final AccountRepository f;
    public final GetHomeSlotListUseCase g;
    public final GetCategorySlotListUseCase h;
    public final SetCategoryPreferenceUseCase i;
    public final FollowBlogUseCase j;
    public final UnFollowBlogUseCase k;

    @Inject
    public HomeViewModel(@NotNull AccountRepository accountRepository0, @NotNull GetHomeSlotListUseCase getHomeSlotListUseCase0, @NotNull GetCategorySlotListUseCase getCategorySlotListUseCase0, @NotNull SetCategoryPreferenceUseCase setCategoryPreferenceUseCase0, @NotNull FollowBlogUseCase followBlogUseCase0, @NotNull UnFollowBlogUseCase unFollowBlogUseCase0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(getHomeSlotListUseCase0, "getHomeSlotListUseCase");
        Intrinsics.checkNotNullParameter(getCategorySlotListUseCase0, "getCategorySlotListUseCase");
        Intrinsics.checkNotNullParameter(setCategoryPreferenceUseCase0, "setCategoryPreferenceUseCase");
        Intrinsics.checkNotNullParameter(followBlogUseCase0, "followBlogUseCase");
        Intrinsics.checkNotNullParameter(unFollowBlogUseCase0, "unFollowBlogUseCase");
        super();
        this.f = accountRepository0;
        this.g = getHomeSlotListUseCase0;
        this.h = getCategorySlotListUseCase0;
        this.i = setCategoryPreferenceUseCase0;
        this.j = followBlogUseCase0;
        this.k = unFollowBlogUseCase0;
        this.sendIntent(new Loading(false));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new x(this, null), 3, null);
    }

    public static final List access$slotListToUiState(HomeViewModel homeViewModel0, List list0) {
        homeViewModel0.getClass();
        return HomeSlotMapperKt.toUiState(list0, new k0(homeViewModel0), new l0(homeViewModel0), new m0(homeViewModel0), new n0(homeViewModel0), new o0(homeViewModel0), new p0(homeViewModel0));
    }

    @NotNull
    public HomeUiState createInitState() {
        return new HomeUiState(null, new y(this), false, null, new z(this), 13, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object createInitState() {
        return this.createInitState();
    }

    @Nullable
    public Object handleIntent(@NotNull HomeUiState homeUiState0, @NotNull HomeIntent homeIntent0, @NotNull Continuation continuation0) {
        Category homeSlotUiState$Category0 = null;
        if(homeIntent0 instanceof Loading) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a0(this, null), 3, null);
            if(((Loading)homeIntent0).isRefresh()) {
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b0(this, null), 3, null);
                return HomeUiState.copy$default(homeUiState0, null, null, true, null, null, 27, null);
            }
            return HomeUiState.copy$default(homeUiState0, com.kakao.tistory.presentation.screen.item.ViewState.Loading.INSTANCE, null, false, null, null, 30, null);
        }
        if(homeIntent0 instanceof SlotListLoadingSuccess) {
            return HomeUiState.copy$default(homeUiState0, new Success(((SlotListLoadingSuccess)homeIntent0).getSlotList()), null, false, null, null, 26, null);
        }
        if(homeIntent0 instanceof SlotListLoadingFail) {
            return HomeUiState.copy$default(homeUiState0, new Error(((SlotListLoadingFail)homeIntent0).getErrorModel()), null, false, null, null, 26, null);
        }
        if(homeIntent0 instanceof SelectCategory) {
            Object object0 = null;
            for(Object object1: homeUiState0.getSlotList()) {
                if(((HomeSlotUiState)object1) instanceof Category) {
                    object0 = object1;
                    break;
                }
            }
            if(object0 instanceof Category) {
                homeSlotUiState$Category0 = (Category)object0;
            }
            if(homeSlotUiState$Category0 == null) {
                return homeUiState0;
            }
            String s = ((SelectCategory)homeIntent0).getCategoryGroupId();
            j0 j00 = new j0(this, homeSlotUiState$Category0);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f0(this, s, homeSlotUiState$Category0.getCategoryGroups(), j00, null), 3, null);
            List list0 = homeUiState0.getSlotList();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object2: list0) {
                HomeSlotUiState homeSlotUiState0 = (HomeSlotUiState)object2;
                if(homeSlotUiState0 instanceof Category) {
                    homeSlotUiState0 = Category.copy$default(((Category)homeSlotUiState0), null, null, null, null, true, null, s, null, null, 0x1AF, null);
                }
                arrayList0.add(homeSlotUiState0);
            }
            return homeUiState0.updateSlotList(arrayList0);
        }
        if(homeIntent0 instanceof UpdateCategory) {
            List list1 = homeUiState0.getSlotList();
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
            for(Object object3: list1) {
                HomeSlotUiState homeSlotUiState1 = (HomeSlotUiState)object3;
                if(homeSlotUiState1 instanceof Category) {
                    homeSlotUiState1 = ((UpdateCategory)homeIntent0).getCategory();
                }
                arrayList1.add(homeSlotUiState1);
            }
            return homeUiState0.updateSlotList(arrayList1);
        }
        if(homeIntent0 instanceof OnClickFollow) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g0(this, homeIntent0, null), 3, null);
            List list2 = homeUiState0.getSlotList();
            ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
            for(Object object4: list2) {
                HomeSlotUiState homeSlotUiState2 = (HomeSlotUiState)object4;
                if(homeSlotUiState2 instanceof FollowableContents) {
                    homeSlotUiState2 = ((FollowableContents)homeSlotUiState2).follow(((OnClickFollow)homeIntent0).getBlogName());
                }
                arrayList2.add(homeSlotUiState2);
            }
            return homeUiState0.updateSlotList(arrayList2);
        }
        if(homeIntent0 instanceof OnClickUnFollow) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h0(this, homeIntent0, null), 3, null);
            List list3 = homeUiState0.getSlotList();
            ArrayList arrayList3 = new ArrayList(l.collectionSizeOrDefault(list3, 10));
            for(Object object5: list3) {
                HomeSlotUiState homeSlotUiState3 = (HomeSlotUiState)object5;
                if(homeSlotUiState3 instanceof FollowableContents) {
                    homeSlotUiState3 = ((FollowableContents)homeSlotUiState3).unFollow(((OnClickUnFollow)homeIntent0).getBlogName());
                }
                arrayList3.add(homeSlotUiState3);
            }
            return homeUiState0.updateSlotList(arrayList3);
        }
        if(homeIntent0 instanceof FollowFail) {
            this.sendEvent(new ShowToast(null, Boxing.boxInt(string.blog_follow_fail), 1, null));
            List list4 = homeUiState0.getSlotList();
            ArrayList arrayList4 = new ArrayList(l.collectionSizeOrDefault(list4, 10));
            for(Object object6: list4) {
                HomeSlotUiState homeSlotUiState4 = (HomeSlotUiState)object6;
                boolean z = homeSlotUiState4 instanceof FollowableContents;
                if(z && ((FollowFail)homeIntent0).isFollowRequest()) {
                    homeSlotUiState4 = ((FollowableContents)homeSlotUiState4).unFollow(((FollowFail)homeIntent0).getBlogName());
                }
                else if(z && !((FollowFail)homeIntent0).isFollowRequest()) {
                    homeSlotUiState4 = ((FollowableContents)homeSlotUiState4).follow(((FollowFail)homeIntent0).getBlogName());
                }
                arrayList4.add(homeSlotUiState4);
            }
            return homeUiState0.updateSlotList(arrayList4);
        }
        if(homeIntent0 instanceof ChangeFollow) {
            List list5 = homeUiState0.getSlotList();
            ArrayList arrayList5 = new ArrayList(l.collectionSizeOrDefault(list5, 10));
            for(Object object7: list5) {
                HomeSlotUiState homeSlotUiState5 = (HomeSlotUiState)object7;
                boolean z1 = homeSlotUiState5 instanceof FollowableContents;
                if(z1 && ((ChangeFollow)homeIntent0).isFollowing()) {
                    homeSlotUiState5 = ((FollowableContents)homeSlotUiState5).follow(((ChangeFollow)homeIntent0).getBlogName());
                }
                else if(z1 && !((ChangeFollow)homeIntent0).isFollowing()) {
                    homeSlotUiState5 = ((FollowableContents)homeSlotUiState5).unFollow(((ChangeFollow)homeIntent0).getBlogName());
                }
                arrayList5.add(homeSlotUiState5);
            }
            return homeUiState0.updateSlotList(arrayList5);
        }
        if(homeIntent0 instanceof ShowDialog) {
            return HomeUiState.copy$default(homeUiState0, null, null, false, ((ShowDialog)homeIntent0).getType(), null, 23, null);
        }
        if(homeIntent0 instanceof ShowErrorDialog) {
            ErrorModel errorModel0 = ((ShowErrorDialog)homeIntent0).getErrorModel();
            return HomeUiState.copy$default(homeUiState0, null, null, false, new Alert(errorModel0.getTitle(), null, errorModel0.getMessage(), null, null, false, 58, null), null, 23, null);
        }
        if(!Intrinsics.areEqual(homeIntent0, HideDialog.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return HomeUiState.copy$default(homeUiState0, null, null, false, null, null, 23, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((HomeUiState)object0), ((HomeIntent)object1), continuation0);
    }
}

