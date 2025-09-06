package com.kakao.tistory.presentation.screen.notification;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.kakao.android.base.extension.LiveDataKt;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.android.base.viewmodel.Event;
import com.kakao.tistory.data.datasource.NotificationDataSource;
import com.kakao.tistory.domain.entity.NotificationItem.Banner;
import com.kakao.tistory.domain.entity.NotificationItem.Notification;
import com.kakao.tistory.domain.entity.NotificationItem;
import com.kakao.tistory.domain.entity.SortItem.NotificationSortItem;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.NotificationRepository;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.screen.notification.tiara.NotificationTiara;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 G2\u00020\u0001:\u0002GHB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\f\u001A\u00020\u000B2\b\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\n\u001A\u00020\b\u00A2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u000B\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\u000B\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u0015\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001A\u00020\u000B\u00A2\u0006\u0004\b\u0016\u0010\u000FJ\u0015\u0010\u0019\u001A\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0015\u0010\u001B\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u001B\u0010\u0014R#\u0010#\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001E0\u001D0\u001C8\u0006\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R*\u0010(\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001E0\u001C8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b$\u0010 \u001A\u0004\b%\u0010\"\"\u0004\b&\u0010\'R#\u0010/\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110*0)8\u0006\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R#\u00106\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001101008\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R#\u00109\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B01008\u0006\u00A2\u0006\f\n\u0004\b7\u00103\u001A\u0004\b8\u00105R#\u0010<\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B01008\u0006\u00A2\u0006\f\n\u0004\b:\u00103\u001A\u0004\b;\u00105R#\u0010?\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B01008\u0006\u00A2\u0006\f\n\u0004\b=\u00103\u001A\u0004\b>\u00105R#\u0010B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001101008\u0006\u00A2\u0006\f\n\u0004\b@\u00103\u001A\u0004\bA\u00105R.\u0010F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B010\u001C8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010 \u001A\u0004\bD\u0010\"\"\u0004\bE\u0010\'\u00A8\u0006I"}, d2 = {"Lcom/kakao/tistory/presentation/screen/notification/NotificationViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/repository/NotificationRepository;", "notificationRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/repository/NotificationRepository;)V", "", "section", "page", "", "updatePageInfo", "(Ljava/lang/String;Ljava/lang/String;)V", "syncUserProfile", "()V", "invalidate", "Lcom/kakao/tistory/domain/entity/NotificationItem;", "item", "onClickNotification", "(Lcom/kakao/tistory/domain/entity/NotificationItem;)V", "onLongClickNotification", "onClickSort", "Lcom/kakao/tistory/domain/entity/SortItem;", "selectSortItem", "updateSort", "(Lcom/kakao/tistory/domain/entity/SortItem;)V", "onClickDelete", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kakao/tistory/domain/entity/SortItem$NotificationSortItem;", "j", "Landroidx/lifecycle/MutableLiveData;", "getSortItems", "()Landroidx/lifecycle/MutableLiveData;", "sortItems", "k", "getSelectedSortItem", "setSelectedSortItem", "(Landroidx/lifecycle/MutableLiveData;)V", "selectedSortItem", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "l", "Lkotlinx/coroutines/flow/Flow;", "getNotifications", "()Lkotlinx/coroutines/flow/Flow;", "notifications", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/android/base/viewmodel/Event;", "n", "Landroidx/lifecycle/LiveData;", "getGoToDestination", "()Landroidx/lifecycle/LiveData;", "goToDestination", "p", "getShowToastDeleteEvent", "showToastDeleteEvent", "r", "getShowToastBackupTypeEvent", "showToastBackupTypeEvent", "t", "getShowToastPcTypeEvent", "showToastPcTypeEvent", "v", "getShowDeleteBottomSheetEvent", "showDeleteBottomSheetEvent", "w", "getShowBottomSortDialog", "setShowBottomSortDialog", "showBottomSortDialog", "Companion", "NotificationSortType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNotificationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationViewModel.kt\ncom/kakao/tistory/presentation/screen/notification/NotificationViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class NotificationViewModel extends TistoryViewModel {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/screen/notification/NotificationViewModel$Companion;", "", "", "NOTIFICATION_BACKUP_TYPE", "Ljava/lang/String;", "NOTIFICATION_PC_TYPE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/screen/notification/NotificationViewModel$NotificationSortType;", "", "", "a", "Ljava/lang/String;", "getGroupType", "()Ljava/lang/String;", "groupType", "", "b", "I", "getTitleResourceId", "()I", "titleResourceId", "ALL", "FOLLOW", "COMMENT", "GUESTBOOK", "NEW_ENTRY", "CHALLENGE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum NotificationSortType {
        ALL("all", string.label_notification_all),
        FOLLOW("subscription", string.label_notification_follow),
        COMMENT("comment", string.label_notification_comment),
        GUESTBOOK("guestbook", string.label_notification_guestbook),
        NEW_ENTRY("entry", string.label_notification_new_entry),
        CHALLENGE("challenge", string.label_notification_challenge);

        public final String a;
        public final int b;
        public static final NotificationSortType[] c;
        public static final EnumEntries d;

        static {
            NotificationSortType.c = arr_notificationViewModel$NotificationSortType;
            Intrinsics.checkNotNullParameter(arr_notificationViewModel$NotificationSortType, "entries");
            NotificationSortType.d = new a(arr_notificationViewModel$NotificationSortType);
        }

        public NotificationSortType(String s1, int v1) {
            this.a = s1;
            this.b = v1;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return NotificationSortType.d;
        }

        @NotNull
        public final String getGroupType() {
            return this.a;
        }

        public final int getTitleResourceId() {
            return this.b;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AccountRepository g;
    public final NotificationRepository h;
    public NotificationDataSource i;
    public final MutableLiveData j;
    public MutableLiveData k;
    public final Flow l;
    public final MutableLiveData m;
    public final LiveData n;
    public final MutableLiveData o;
    public final LiveData p;
    public final MutableLiveData q;
    public final LiveData r;
    public final MutableLiveData s;
    public final LiveData t;
    public final MutableLiveData u;
    public final LiveData v;
    public MutableLiveData w;

    static {
        NotificationViewModel.Companion = new Companion(null);
        NotificationViewModel.$stable = 8;
    }

    @Inject
    public NotificationViewModel(@NotNull AccountRepository accountRepository0, @NotNull NotificationRepository notificationRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(notificationRepository0, "notificationRepository");
        super();
        this.g = accountRepository0;
        this.h = notificationRepository0;
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
        this.l = CachedPagingDataKt.cachedIn(new Pager(new PagingConfig(20, 10, false, 20, 0, 0, 52, null), null, new w(this), 2, null).getFlow(), ViewModelKt.getViewModelScope(this));
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.m = mutableLiveData0;
        this.n = LiveDataKt.asLiveData(mutableLiveData0);
        MutableLiveData mutableLiveData1 = new MutableLiveData();
        this.o = mutableLiveData1;
        this.p = LiveDataKt.asLiveData(mutableLiveData1);
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.q = mutableLiveData2;
        this.r = LiveDataKt.asLiveData(mutableLiveData2);
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this.s = mutableLiveData3;
        this.t = LiveDataKt.asLiveData(mutableLiveData3);
        MutableLiveData mutableLiveData4 = new MutableLiveData();
        this.u = mutableLiveData4;
        this.v = LiveDataKt.asLiveData(mutableLiveData4);
        new ArrayList();
        this.w = new MutableLiveData();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new v(this, null), 3, null);
        this.updatePageInfo("알림", "알림");
    }

    public static final void access$goToDestination(NotificationViewModel notificationViewModel0, NotificationItem notificationItem0) {
        Event event0 = new Event(notificationItem0);
        notificationViewModel0.m.setValue(event0);
    }

    public static final void access$updateSortItems(NotificationViewModel notificationViewModel0, List list0) {
        NotificationSortItem sortItem$NotificationSortItem0;
        List list1;
        MutableLiveData mutableLiveData0 = notificationViewModel0.j;
        if(list0 == null) {
            list1 = new ArrayList();
        }
        else {
            list1 = CollectionsKt___CollectionsKt.toMutableList(list0);
            if(list1 == null) {
                list1 = new ArrayList();
            }
        }
        mutableLiveData0.setValue(list1);
        MutableLiveData mutableLiveData1 = notificationViewModel0.k;
        if(list0 == null) {
            sortItem$NotificationSortItem0 = null;
        }
        else {
            sortItem$NotificationSortItem0 = (NotificationSortItem)CollectionsKt___CollectionsKt.firstOrNull(list0);
            if(sortItem$NotificationSortItem0 == null) {
                sortItem$NotificationSortItem0 = null;
            }
            else {
                sortItem$NotificationSortItem0.setSelected(true);
            }
        }
        mutableLiveData1.setValue(sortItem$NotificationSortItem0);
    }

    @NotNull
    public final LiveData getGoToDestination() {
        return this.n;
    }

    @NotNull
    public final Flow getNotifications() {
        return this.l;
    }

    @NotNull
    public final MutableLiveData getSelectedSortItem() {
        return this.k;
    }

    @NotNull
    public final MutableLiveData getShowBottomSortDialog() {
        return this.w;
    }

    @NotNull
    public final LiveData getShowDeleteBottomSheetEvent() {
        return this.v;
    }

    @NotNull
    public final LiveData getShowToastBackupTypeEvent() {
        return this.r;
    }

    @NotNull
    public final LiveData getShowToastDeleteEvent() {
        return this.p;
    }

    @NotNull
    public final LiveData getShowToastPcTypeEvent() {
        return this.t;
    }

    @NotNull
    public final MutableLiveData getSortItems() {
        return this.j;
    }

    public final void invalidate() {
        NotificationDataSource notificationDataSource0 = this.i;
        if(notificationDataSource0 != null) {
            notificationDataSource0.invalidate();
        }
    }

    public final void onClickDelete(@NotNull NotificationItem notificationItem0) {
        Intrinsics.checkNotNullParameter(notificationItem0, "item");
        Notification notificationItem$Notification0 = notificationItem0 instanceof Notification ? ((Notification)notificationItem0) : null;
        if(notificationItem$Notification0 != null) {
            Long long0 = notificationItem$Notification0.getId();
            if(long0 != null) {
                long v = long0.longValue();
                NotificationTiara notificationTiara0 = NotificationTiara.INSTANCE;
                Long long1 = ((Notification)notificationItem0).getId();
                String s = long1 == null ? null : long1.toString();
                String s1 = "";
                if(s == null) {
                    s = "";
                }
                NotificationSortItem sortItem$NotificationSortItem0 = (NotificationSortItem)this.k.getValue();
                String s2 = sortItem$NotificationSortItem0 == null ? null : sortItem$NotificationSortItem0.getTitle();
                if(s2 != null) {
                    s1 = s2;
                }
                notificationTiara0.trackClickNotificationDelete(s, s1);
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new x(this, v, null), 3, null);
            }
        }
    }

    public final void onClickNotification(@NotNull NotificationItem notificationItem0) {
        Intrinsics.checkNotNullParameter(notificationItem0, "item");
        if(notificationItem0 instanceof Notification) {
            NotificationTiara notificationTiara0 = NotificationTiara.INSTANCE;
            String s = ((Notification)notificationItem0).getTitle();
            String s1 = "";
            if(s == null) {
                s = "";
            }
            NotificationSortItem sortItem$NotificationSortItem0 = (NotificationSortItem)this.k.getValue();
            String s2 = sortItem$NotificationSortItem0 == null ? null : sortItem$NotificationSortItem0.getTitle();
            if(s2 != null) {
                s1 = s2;
            }
            notificationTiara0.trackClickNotificationItem(s, s1);
            Long long0 = ((Notification)notificationItem0).getId();
            if(long0 != null) {
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new y(this, ((long)long0), notificationItem0, null), 3, null);
                return;
            }
            return;
        }
        if(notificationItem0 instanceof Banner) {
            TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_NOTIFICATION_BANNER, null, null, null, null, null, 0xF8, null);
            Event event0 = new Event(notificationItem0);
            this.m.setValue(event0);
        }
    }

    public final void onClickSort() {
        NotificationTiara.INSTANCE.trackClickNotificationSort();
        this.w.setValue(new Event(Unit.INSTANCE));
    }

    public final void onLongClickNotification(@NotNull NotificationItem notificationItem0) {
        Intrinsics.checkNotNullParameter(notificationItem0, "item");
        if(notificationItem0 instanceof Notification) {
            Event event0 = new Event(notificationItem0);
            this.u.setValue(event0);
        }
    }

    public final void setSelectedSortItem(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.k = mutableLiveData0;
    }

    public final void setShowBottomSortDialog(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.w = mutableLiveData0;
    }

    public final void syncUserProfile() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new z(this, null), 3, null);
    }

    public final void updatePageInfo(@Nullable String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s1, "page");
        this.setSection(s);
        this.setPage(s1);
    }

    public final void updateSort(@NotNull SortItem sortItem0) {
        Intrinsics.checkNotNullParameter(sortItem0, "selectSortItem");
        NotificationTiara.INSTANCE.trackClickNotificationSortItem(sortItem0.getTitle());
        if(!Intrinsics.areEqual(this.k.getValue(), sortItem0) && sortItem0 instanceof NotificationSortItem) {
            NotificationSortItem sortItem$NotificationSortItem0 = (NotificationSortItem)this.k.getValue();
            if(sortItem$NotificationSortItem0 != null) {
                sortItem$NotificationSortItem0.setSelected(false);
            }
            MutableLiveData mutableLiveData0 = this.k;
            ((NotificationSortItem)sortItem0).setSelected(true);
            mutableLiveData0.setValue(sortItem0);
            this.invalidate();
        }
    }
}

