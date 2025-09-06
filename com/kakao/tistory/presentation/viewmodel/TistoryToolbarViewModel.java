package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.entity.SortItem.DeveloperServerSortItem;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.presentation.common.DeveloperServerType;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\t¢\u0006\u0004\b\u000E\u0010\u000FR\u001F\u0010\u0016\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001F\u0010\u001D\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u001F\u0010!\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001E0\u00108\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u0013\u001A\u0004\b \u0010\u0015R\u001A\u0010&\u001A\u00020\u001E8\u0006X\u0086D¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u001A\u0010(\u001A\u00020\'8\u0006X\u0086D¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b(\u0010*R\u001D\u0010-\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0+0\u00108F¢\u0006\u0006\u001A\u0004\b,\u0010\u0015¨\u0006."}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TistoryToolbarViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/data/preference/DeviceInfoPreference;)V", "", "Lcom/kakao/tistory/domain/entity/SortItem;", "getSortItems", "()Ljava/util/List;", "item", "", "onClickServer", "(Lcom/kakao/tistory/domain/entity/SortItem;)V", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/domain/entity/User;", "h", "Landroidx/lifecycle/LiveData;", "getUser", "()Landroidx/lifecycle/LiveData;", "user", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/domain/entity/Blog;", "i", "Landroidx/lifecycle/MutableLiveData;", "getCurrentBlog", "()Landroidx/lifecycle/MutableLiveData;", "currentBlog", "", "j", "getCurrentBlogName", "currentBlogName", "k", "Ljava/lang/String;", "getAppVersion", "()Ljava/lang/String;", "appVersion", "", "isDebug", "Z", "()Z", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getShowFinishDialog", "showFinishDialog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TistoryToolbarViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final DeviceInfoPreference g;
    public final LiveData h;
    public final MutableLiveData i;
    public final LiveData j;
    public final String k;
    public final MutableLiveData l;

    @Inject
    public TistoryToolbarViewModel(@NotNull AccountRepository accountRepository0, @NotNull DeviceInfoPreference deviceInfoPreference0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        super();
        this.g = deviceInfoPreference0;
        this.h = accountRepository0.getOldUser();
        this.i = accountRepository0.getOldCurrentBlog();
        this.j = accountRepository0.getOldCurrentBlogName();
        this.k = "3.0.8_3080";
        this.l = new MutableLiveData();
    }

    @NotNull
    public final String getAppVersion() {
        return this.k;
    }

    @NotNull
    public final MutableLiveData getCurrentBlog() {
        return this.i;
    }

    @NotNull
    public final LiveData getCurrentBlogName() {
        return this.j;
    }

    @NotNull
    public final LiveData getShowFinishDialog() {
        return this.l;
    }

    @NotNull
    public final List getSortItems() {
        List list0 = new ArrayList();
        DeveloperServerType[] arr_developerServerType = DeveloperServerType.values();
        for(int v = 0; v < arr_developerServerType.length; ++v) {
            DeveloperServerType developerServerType0 = arr_developerServerType[v];
            DeveloperServerSortItem sortItem$DeveloperServerSortItem0 = new DeveloperServerSortItem(developerServerType0.getUrl(), developerServerType0.getTitle());
            String s = developerServerType0.getUrl();
            String s1 = this.g.getDeveloperServerHost();
            if(s1 == null) {
                s1 = "https://api.tistory.com";
            }
            sortItem$DeveloperServerSortItem0.setSelected(Intrinsics.areEqual(s, s1));
            ((ArrayList)list0).add(sortItem$DeveloperServerSortItem0);
        }
        return list0;
    }

    @NotNull
    public final LiveData getUser() {
        return this.h;
    }

    public final boolean isDebug() [...] // Inlined contents

    public final void onClickServer(@NotNull SortItem sortItem0) {
        Intrinsics.checkNotNullParameter(sortItem0, "item");
        this.g.setDeveloperServerHost(sortItem0.getType());
        Event event0 = new Event(Unit.INSTANCE);
        this.l.setValue(event0);
    }
}

