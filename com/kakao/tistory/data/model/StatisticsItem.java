package com.kakao.tistory.data.model;

import a5.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.room.a;
import com.kakao.tistory.data.model.viewtype.StatisticsViewType;
import com.kakao.tistory.domain.entity.Thumbnail;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000B\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u001B\b\u0004\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f\u0082\u0001\u000B\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"¨\u0006#"}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem;", "", "statisticsViewType", "Lcom/kakao/tistory/data/model/viewtype/StatisticsViewType;", "exception", "", "(Lcom/kakao/tistory/data/model/viewtype/StatisticsViewType;Ljava/lang/String;)V", "getException", "()Ljava/lang/String;", "setException", "(Ljava/lang/String;)V", "getStatisticsViewType", "()Lcom/kakao/tistory/data/model/viewtype/StatisticsViewType;", "EmptyItem", "RefererChannel", "RefererKeyword", "RefererKeywordItem", "RefererLog", "RefererLogItem", "RefererRankItem", "Title", "TopEntryItem", "TopPostItem", "Trend", "Lcom/kakao/tistory/data/model/StatisticsItem$EmptyItem;", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererChannel;", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeyword;", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererLog;", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererLogItem;", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererRankItem;", "Lcom/kakao/tistory/data/model/StatisticsItem$Title;", "Lcom/kakao/tistory/data/model/StatisticsItem$TopEntryItem;", "Lcom/kakao/tistory/data/model/StatisticsItem$TopPostItem;", "Lcom/kakao/tistory/data/model/StatisticsItem$Trend;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class StatisticsItem {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001A\u0010\t\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EHÖ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$EmptyItem;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "emptyTextRes", "", "(Ljava/lang/Integer;)V", "getEmptyTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/kakao/tistory/data/model/StatisticsItem$EmptyItem;", "equals", "", "other", "", "hashCode", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class EmptyItem extends StatisticsItem {
        @Nullable
        private final Integer emptyTextRes;

        public EmptyItem() {
            this(null, 1, null);
        }

        public EmptyItem(@Nullable Integer integer0) {
            super(StatisticsViewType.EMPTY, null, 2, null);
            this.emptyTextRes = integer0;
        }

        public EmptyItem(Integer integer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                integer0 = null;
            }
            this(integer0);
        }

        @Nullable
        public final Integer component1() {
            return this.emptyTextRes;
        }

        @NotNull
        public final EmptyItem copy(@Nullable Integer integer0) {
            return new EmptyItem(integer0);
        }

        public static EmptyItem copy$default(EmptyItem statisticsItem$EmptyItem0, Integer integer0, int v, Object object0) {
            if((v & 1) != 0) {
                integer0 = statisticsItem$EmptyItem0.emptyTextRes;
            }
            return statisticsItem$EmptyItem0.copy(integer0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof EmptyItem ? Intrinsics.areEqual(this.emptyTextRes, ((EmptyItem)object0).emptyTextRes) : false;
        }

        @Nullable
        public final Integer getEmptyTextRes() {
            return this.emptyTextRes;
        }

        @Override
        public int hashCode() {
            return this.emptyTextRes == null ? 0 : this.emptyTextRes.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "EmptyItem(emptyTextRes=" + this.emptyTextRes + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000B\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$RefererChannel;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "pageView", "Lcom/kakao/tistory/data/model/RefererChannelItem;", "deviceType", "(Lcom/kakao/tistory/data/model/RefererChannelItem;Lcom/kakao/tistory/data/model/RefererChannelItem;)V", "getDeviceType", "()Lcom/kakao/tistory/data/model/RefererChannelItem;", "getPageView", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefererChannel extends StatisticsItem {
        @Nullable
        private final RefererChannelItem deviceType;
        @Nullable
        private final RefererChannelItem pageView;

        public RefererChannel() {
            this(null, null, 3, null);
        }

        public RefererChannel(@Nullable RefererChannelItem refererChannelItem0, @Nullable RefererChannelItem refererChannelItem1) {
            super(StatisticsViewType.REFERER_CHANNEL, null, 2, null);
            this.pageView = refererChannelItem0;
            this.deviceType = refererChannelItem1;
        }

        public RefererChannel(RefererChannelItem refererChannelItem0, RefererChannelItem refererChannelItem1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                refererChannelItem0 = null;
            }
            if((v & 2) != 0) {
                refererChannelItem1 = null;
            }
            this(refererChannelItem0, refererChannelItem1);
        }

        @Nullable
        public final RefererChannelItem component1() {
            return this.pageView;
        }

        @Nullable
        public final RefererChannelItem component2() {
            return this.deviceType;
        }

        @NotNull
        public final RefererChannel copy(@Nullable RefererChannelItem refererChannelItem0, @Nullable RefererChannelItem refererChannelItem1) {
            return new RefererChannel(refererChannelItem0, refererChannelItem1);
        }

        public static RefererChannel copy$default(RefererChannel statisticsItem$RefererChannel0, RefererChannelItem refererChannelItem0, RefererChannelItem refererChannelItem1, int v, Object object0) {
            if((v & 1) != 0) {
                refererChannelItem0 = statisticsItem$RefererChannel0.pageView;
            }
            if((v & 2) != 0) {
                refererChannelItem1 = statisticsItem$RefererChannel0.deviceType;
            }
            return statisticsItem$RefererChannel0.copy(refererChannelItem0, refererChannelItem1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RefererChannel)) {
                return false;
            }
            return Intrinsics.areEqual(this.pageView, ((RefererChannel)object0).pageView) ? Intrinsics.areEqual(this.deviceType, ((RefererChannel)object0).deviceType) : false;
        }

        @Nullable
        public final RefererChannelItem getDeviceType() {
            return this.deviceType;
        }

        @Nullable
        public final RefererChannelItem getPageView() {
            return this.pageView;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.pageView == null ? 0 : this.pageView.hashCode();
            RefererChannelItem refererChannelItem0 = this.deviceType;
            if(refererChannelItem0 != null) {
                v = refererChannelItem0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            return "RefererChannel(pageView=" + this.pageView + ", deviceType=" + this.deviceType + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001B\u0010\t\u001A\u00020\u00002\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000E\u001A\u00020\u000FHÖ\u0001J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeyword;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "items", "", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefererKeyword extends StatisticsItem {
        @Nullable
        private final List items;

        public RefererKeyword() {
            this(null, 1, null);
        }

        public RefererKeyword(@Nullable List list0) {
            super(StatisticsViewType.NOTHING, null, 2, null);
            this.items = list0;
        }

        public RefererKeyword(List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                list0 = null;
            }
            this(list0);
        }

        @Nullable
        public final List component1() {
            return this.items;
        }

        @NotNull
        public final RefererKeyword copy(@Nullable List list0) {
            return new RefererKeyword(list0);
        }

        public static RefererKeyword copy$default(RefererKeyword statisticsItem$RefererKeyword0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = statisticsItem$RefererKeyword0.items;
            }
            return statisticsItem$RefererKeyword0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RefererKeyword ? Intrinsics.areEqual(this.items, ((RefererKeyword)object0).items) : false;
        }

        @Nullable
        public final List getItems() {
            return this.items;
        }

        @Override
        public int hashCode() {
            return this.items == null ? 0 : this.items.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "RefererKeyword(items=" + this.items + ")";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0002\u0010\nJ\t\u0010\u001B\u001A\u00020\u0004H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\u0006H\u00C6\u0003J\u0010\u0010\u001D\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0002\u0010\u000EJ\u0010\u0010\u001E\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0002\u0010\u000EJ\u0010\u0010\u001F\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0002\u0010\u000EJF\u0010 \u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0004H\u00C6\u0001\u00A2\u0006\u0002\u0010!J\t\u0010\"\u001A\u00020#H\u00D6\u0001J\u0013\u0010$\u001A\u00020\u00122\b\u0010%\u001A\u0004\u0018\u00010&H\u00D6\u0003J\t\u0010\'\u001A\u00020#H\u00D6\u0001J\t\u0010(\u001A\u00020\u0006H\u00D6\u0001J\u0019\u0010)\u001A\u00020*2\u0006\u0010+\u001A\u00020,2\u0006\u0010-\u001A\u00020#H\u00D6\u0001R\u0011\u0010\u0003\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0015\u0010\b\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\r\u0010\u000ER\u0015\u0010\t\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\u0010\u0010\u000ER\u001A\u0010\u0011\u001A\u00020\u0012X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\u00020\u0012X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\u001A\u0010\u000E\u00A8\u0006."}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "Landroid/os/Parcelable;", "count", "", "keyword", "", "naver", "daum", "etc", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCount", "()J", "getDaum", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEtc", "isFirstItem", "", "()Z", "setFirstItem", "(Z)V", "isLastItem", "setLastItem", "getKeyword", "()Ljava/lang/String;", "getNaver", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Parcelize
    public static final class RefererKeywordItem extends StatisticsItem implements Parcelable {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class Creator implements Parcelable.Creator {
            @NotNull
            public final RefererKeywordItem createFromParcel(@NotNull Parcel parcel0) {
                Intrinsics.checkNotNullParameter(parcel0, "parcel");
                long v = parcel0.readLong();
                String s = parcel0.readString();
                Long long0 = parcel0.readInt() == 0 ? null : parcel0.readLong();
                Long long1 = parcel0.readInt() == 0 ? null : parcel0.readLong();
                return parcel0.readInt() == 0 ? new RefererKeywordItem(v, s, long0, long1, null) : new RefererKeywordItem(v, s, long0, long1, parcel0.readLong());
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            @NotNull
            public final RefererKeywordItem[] newArray(int v) {
                return new RefererKeywordItem[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        }

        @NotNull
        public static final Parcelable.Creator CREATOR;
        private final long count;
        @Nullable
        private final Long daum;
        @Nullable
        private final Long etc;
        private boolean isFirstItem;
        private boolean isLastItem;
        @NotNull
        private final String keyword;
        @Nullable
        private final Long naver;

        static {
            RefererKeywordItem.CREATOR = new Creator();
        }

        public RefererKeywordItem() {
            this(0L, null, null, null, null, 0x1F, null);
        }

        public RefererKeywordItem(long v, @NotNull String s, @Nullable Long long0, @Nullable Long long1, @Nullable Long long2) {
            Intrinsics.checkNotNullParameter(s, "keyword");
            super(StatisticsViewType.REFERER_KEYWORD, null, 2, null);
            this.count = v;
            this.keyword = s;
            this.naver = long0;
            this.daum = long1;
            this.etc = long2;
        }

        public RefererKeywordItem(long v, String s, Long long0, Long long1, Long long2, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 0L;
            }
            if((v1 & 2) != 0) {
                s = "";
            }
            this(v, s, ((v1 & 4) == 0 ? long0 : null), ((v1 & 8) == 0 ? long1 : null), ((v1 & 16) == 0 ? long2 : null));
        }

        public final long component1() {
            return this.count;
        }

        @NotNull
        public final String component2() {
            return this.keyword;
        }

        @Nullable
        public final Long component3() {
            return this.naver;
        }

        @Nullable
        public final Long component4() {
            return this.daum;
        }

        @Nullable
        public final Long component5() {
            return this.etc;
        }

        @NotNull
        public final RefererKeywordItem copy(long v, @NotNull String s, @Nullable Long long0, @Nullable Long long1, @Nullable Long long2) {
            Intrinsics.checkNotNullParameter(s, "keyword");
            return new RefererKeywordItem(v, s, long0, long1, long2);
        }

        public static RefererKeywordItem copy$default(RefererKeywordItem statisticsItem$RefererKeywordItem0, long v, String s, Long long0, Long long1, Long long2, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = statisticsItem$RefererKeywordItem0.count;
            }
            if((v1 & 2) != 0) {
                s = statisticsItem$RefererKeywordItem0.keyword;
            }
            if((v1 & 4) != 0) {
                long0 = statisticsItem$RefererKeywordItem0.naver;
            }
            if((v1 & 8) != 0) {
                long1 = statisticsItem$RefererKeywordItem0.daum;
            }
            if((v1 & 16) != 0) {
                long2 = statisticsItem$RefererKeywordItem0.etc;
            }
            return statisticsItem$RefererKeywordItem0.copy(v, s, long0, long1, long2);
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RefererKeywordItem)) {
                return false;
            }
            if(this.count != ((RefererKeywordItem)object0).count) {
                return false;
            }
            if(!Intrinsics.areEqual(this.keyword, ((RefererKeywordItem)object0).keyword)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.naver, ((RefererKeywordItem)object0).naver)) {
                return false;
            }
            return Intrinsics.areEqual(this.daum, ((RefererKeywordItem)object0).daum) ? Intrinsics.areEqual(this.etc, ((RefererKeywordItem)object0).etc) : false;
        }

        public final long getCount() {
            return this.count;
        }

        @Nullable
        public final Long getDaum() {
            return this.daum;
        }

        @Nullable
        public final Long getEtc() {
            return this.etc;
        }

        @NotNull
        public final String getKeyword() [...] // 潜在的解密器

        @Nullable
        public final Long getNaver() {
            return this.naver;
        }

        @Override
        public int hashCode() {
            int v = q.c(Long.hashCode(this.count) * 0x1F, 0x1F, this.keyword);
            int v1 = 0;
            int v2 = this.naver == null ? 0 : this.naver.hashCode();
            int v3 = this.daum == null ? 0 : this.daum.hashCode();
            Long long0 = this.etc;
            if(long0 != null) {
                v1 = long0.hashCode();
            }
            return ((v + v2) * 0x1F + v3) * 0x1F + v1;
        }

        public final boolean isFirstItem() {
            return this.isFirstItem;
        }

        public final boolean isLastItem() {
            return this.isLastItem;
        }

        public final void setFirstItem(boolean z) {
            this.isFirstItem = z;
        }

        public final void setLastItem(boolean z) {
            this.isLastItem = z;
        }

        @Override
        @NotNull
        public String toString() {
            return "RefererKeywordItem(count=" + this.count + ", keyword=" + this.keyword + ", naver=" + this.naver + ", daum=" + this.daum + ", etc=" + this.etc + ")";
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel0, int v) {
            Intrinsics.checkNotNullParameter(parcel0, "out");
            parcel0.writeLong(this.count);
            parcel0.writeString(this.keyword);
            Long long0 = this.naver;
            if(long0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                parcel0.writeLong(((long)long0));
            }
            Long long1 = this.daum;
            if(long1 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                parcel0.writeLong(((long)long1));
            }
            Long long2 = this.etc;
            if(long2 == null) {
                parcel0.writeInt(0);
                return;
            }
            parcel0.writeInt(1);
            parcel0.writeLong(((long)long2));
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001B\u0010\t\u001A\u00020\u00002\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000E\u001A\u00020\u000FHÖ\u0001J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$RefererLog;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "items", "", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererLogItem;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefererLog extends StatisticsItem {
        @Nullable
        private final List items;

        public RefererLog() {
            this(null, 1, null);
        }

        public RefererLog(@Nullable List list0) {
            super(StatisticsViewType.NOTHING, null, 2, null);
            this.items = list0;
        }

        public RefererLog(List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                list0 = null;
            }
            this(list0);
        }

        @Nullable
        public final List component1() {
            return this.items;
        }

        @NotNull
        public final RefererLog copy(@Nullable List list0) {
            return new RefererLog(list0);
        }

        public static RefererLog copy$default(RefererLog statisticsItem$RefererLog0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = statisticsItem$RefererLog0.items;
            }
            return statisticsItem$RefererLog0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RefererLog ? Intrinsics.areEqual(this.items, ((RefererLog)object0).items) : false;
        }

        @Nullable
        public final List getItems() {
            return this.items;
        }

        @Override
        public int hashCode() {
            return this.items == null ? 0 : this.items.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "RefererLog(items=" + this.items + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001CHÖ\u0003J\t\u0010\u001D\u001A\u00020\u001EHÖ\u0001J\t\u0010\u001F\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000BR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000B¨\u0006 "}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$RefererLogItem;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "timestamp", "", "pv", "", "serviceIcon", "keyword", "refUrl", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKeyword", "()Ljava/lang/String;", "getPv", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRefUrl", "getServiceIcon", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/data/model/StatisticsItem$RefererLogItem;", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefererLogItem extends StatisticsItem {
        @Nullable
        private final String keyword;
        @Nullable
        private final Long pv;
        @Nullable
        private final String refUrl;
        @Nullable
        private final String serviceIcon;
        @Nullable
        private final String timestamp;

        public RefererLogItem() {
            this(null, null, null, null, null, 0x1F, null);
        }

        public RefererLogItem(@Nullable String s, @Nullable Long long0, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
            super(StatisticsViewType.NOTHING, null, 2, null);
            this.timestamp = s;
            this.pv = long0;
            this.serviceIcon = s1;
            this.keyword = s2;
            this.refUrl = s3;
        }

        public RefererLogItem(String s, Long long0, String s1, String s2, String s3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? long0 : null), ((v & 4) == 0 ? s1 : null), ((v & 8) == 0 ? s2 : null), ((v & 16) == 0 ? s3 : null));
        }

        @Nullable
        public final String component1() {
            return this.timestamp;
        }

        @Nullable
        public final Long component2() {
            return this.pv;
        }

        @Nullable
        public final String component3() {
            return this.serviceIcon;
        }

        @Nullable
        public final String component4() {
            return this.keyword;
        }

        @Nullable
        public final String component5() {
            return this.refUrl;
        }

        @NotNull
        public final RefererLogItem copy(@Nullable String s, @Nullable Long long0, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
            return new RefererLogItem(s, long0, s1, s2, s3);
        }

        public static RefererLogItem copy$default(RefererLogItem statisticsItem$RefererLogItem0, String s, Long long0, String s1, String s2, String s3, int v, Object object0) {
            if((v & 1) != 0) {
                s = statisticsItem$RefererLogItem0.timestamp;
            }
            if((v & 2) != 0) {
                long0 = statisticsItem$RefererLogItem0.pv;
            }
            if((v & 4) != 0) {
                s1 = statisticsItem$RefererLogItem0.serviceIcon;
            }
            if((v & 8) != 0) {
                s2 = statisticsItem$RefererLogItem0.keyword;
            }
            if((v & 16) != 0) {
                s3 = statisticsItem$RefererLogItem0.refUrl;
            }
            return statisticsItem$RefererLogItem0.copy(s, long0, s1, s2, s3);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RefererLogItem)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.timestamp, ((RefererLogItem)object0).timestamp)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.pv, ((RefererLogItem)object0).pv)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.serviceIcon, ((RefererLogItem)object0).serviceIcon)) {
                return false;
            }
            return Intrinsics.areEqual(this.keyword, ((RefererLogItem)object0).keyword) ? Intrinsics.areEqual(this.refUrl, ((RefererLogItem)object0).refUrl) : false;
        }

        @Nullable
        public final String getKeyword() {
            return this.keyword;
        }

        @Nullable
        public final Long getPv() {
            return this.pv;
        }

        @Nullable
        public final String getRefUrl() {
            return this.refUrl;
        }

        @Nullable
        public final String getServiceIcon() {
            return this.serviceIcon;
        }

        @Nullable
        public final String getTimestamp() {
            return this.timestamp;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.timestamp == null ? 0 : this.timestamp.hashCode();
            int v2 = this.pv == null ? 0 : this.pv.hashCode();
            int v3 = this.serviceIcon == null ? 0 : this.serviceIcon.hashCode();
            int v4 = this.keyword == null ? 0 : this.keyword.hashCode();
            String s = this.refUrl;
            if(s != null) {
                v = s.hashCode();
            }
            return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("RefererLogItem(timestamp=");
            stringBuilder0.append(this.timestamp);
            stringBuilder0.append(", pv=");
            stringBuilder0.append(this.pv);
            stringBuilder0.append(", serviceIcon=");
            a.w(stringBuilder0, this.serviceIcon, ", keyword=", this.keyword, ", refUrl=");
            return r0.a.o(stringBuilder0, this.refUrl, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0019\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001A\u001A\u00020\f2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001CHÖ\u0003J\t\u0010\u001D\u001A\u00020\u001EHÖ\u0001J\t\u0010\u001F\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\u00020\fX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\r\"\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0010\u001A\u00020\f8F¢\u0006\u0006\u001A\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0012¨\u0006 "}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$RefererRankItem;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "serviceIcon", "", "count", "", "refType", "refLabel", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getCount", "()J", "isLastItem", "", "()Z", "setLastItem", "(Z)V", "isRefTypeEtc", "getRefLabel", "()Ljava/lang/String;", "getRefType", "getServiceIcon", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefererRankItem extends StatisticsItem {
        private final long count;
        private boolean isLastItem;
        @Nullable
        private final String refLabel;
        @NotNull
        private final String refType;
        @Nullable
        private final String serviceIcon;

        public RefererRankItem() {
            this(null, 0L, null, null, 15, null);
        }

        public RefererRankItem(@Nullable String s, long v, @NotNull String s1, @Nullable String s2) {
            Intrinsics.checkNotNullParameter(s1, "refType");
            super(StatisticsViewType.REFERER_RANK, null, 2, null);
            this.serviceIcon = s;
            this.count = v;
            this.refType = s1;
            this.refLabel = s2;
        }

        public RefererRankItem(String s, long v, String s1, String s2, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 2) != 0) {
                v = 0L;
            }
            if((v1 & 4) != 0) {
                s1 = "";
            }
            this(((v1 & 1) == 0 ? s : null), v, s1, ((v1 & 8) == 0 ? s2 : null));
        }

        @Nullable
        public final String component1() {
            return this.serviceIcon;
        }

        public final long component2() {
            return this.count;
        }

        @NotNull
        public final String component3() {
            return this.refType;
        }

        @Nullable
        public final String component4() {
            return this.refLabel;
        }

        @NotNull
        public final RefererRankItem copy(@Nullable String s, long v, @NotNull String s1, @Nullable String s2) {
            Intrinsics.checkNotNullParameter(s1, "refType");
            return new RefererRankItem(s, v, s1, s2);
        }

        public static RefererRankItem copy$default(RefererRankItem statisticsItem$RefererRankItem0, String s, long v, String s1, String s2, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = statisticsItem$RefererRankItem0.serviceIcon;
            }
            if((v1 & 2) != 0) {
                v = statisticsItem$RefererRankItem0.count;
            }
            if((v1 & 4) != 0) {
                s1 = statisticsItem$RefererRankItem0.refType;
            }
            if((v1 & 8) != 0) {
                s2 = statisticsItem$RefererRankItem0.refLabel;
            }
            return statisticsItem$RefererRankItem0.copy(s, v, s1, s2);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RefererRankItem)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.serviceIcon, ((RefererRankItem)object0).serviceIcon)) {
                return false;
            }
            if(this.count != ((RefererRankItem)object0).count) {
                return false;
            }
            return Intrinsics.areEqual(this.refType, ((RefererRankItem)object0).refType) ? Intrinsics.areEqual(this.refLabel, ((RefererRankItem)object0).refLabel) : false;
        }

        public final long getCount() {
            return this.count;
        }

        @Nullable
        public final String getRefLabel() {
            return this.refLabel;
        }

        @NotNull
        public final String getRefType() {
            return this.refType;
        }

        @Nullable
        public final String getServiceIcon() {
            return this.serviceIcon;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = q.c(wb.a.k(this.count, (this.serviceIcon == null ? 0 : this.serviceIcon.hashCode()) * 0x1F, 0x1F), 0x1F, this.refType);
            String s = this.refLabel;
            if(s != null) {
                v = s.hashCode();
            }
            return v1 + v;
        }

        public final boolean isLastItem() {
            return this.isLastItem;
        }

        public final boolean isRefTypeEtc() {
            return Intrinsics.areEqual(this.refLabel, "기타 유입");
        }

        public final void setLastItem(boolean z) {
            this.isLastItem = z;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("RefererRankItem(serviceIcon=");
            stringBuilder0.append(this.serviceIcon);
            stringBuilder0.append(", count=");
            stringBuilder0.append(this.count);
            a.w(stringBuilder0, ", refType=", this.refType, ", refLabel=", this.refLabel);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0014\u001A\u00020\u0007HÆ\u0003J.\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001A\u00020\u00072\b\u0010\u0018\u001A\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0005HÖ\u0001J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$Title;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "childViewType", "Lcom/kakao/tistory/data/model/viewtype/StatisticsViewType;", "titleResourceId", "", "hasSeeAll", "", "(Lcom/kakao/tistory/data/model/viewtype/StatisticsViewType;Ljava/lang/Integer;Z)V", "getChildViewType", "()Lcom/kakao/tistory/data/model/viewtype/StatisticsViewType;", "setChildViewType", "(Lcom/kakao/tistory/data/model/viewtype/StatisticsViewType;)V", "getHasSeeAll", "()Z", "getTitleResourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/kakao/tistory/data/model/viewtype/StatisticsViewType;Ljava/lang/Integer;Z)Lcom/kakao/tistory/data/model/StatisticsItem$Title;", "equals", "other", "", "hashCode", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Title extends StatisticsItem {
        @NotNull
        private StatisticsViewType childViewType;
        private final boolean hasSeeAll;
        @Nullable
        private final Integer titleResourceId;

        public Title(@NotNull StatisticsViewType statisticsViewType0, @Nullable Integer integer0, boolean z) {
            Intrinsics.checkNotNullParameter(statisticsViewType0, "childViewType");
            super(StatisticsViewType.TITLE, null, 2, null);
            this.childViewType = statisticsViewType0;
            this.titleResourceId = integer0;
            this.hasSeeAll = z;
        }

        public Title(StatisticsViewType statisticsViewType0, Integer integer0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                integer0 = statisticsViewType0.getTitleResourceId();
            }
            if((v & 4) != 0) {
                z = false;
            }
            this(statisticsViewType0, integer0, z);
        }

        @NotNull
        public final StatisticsViewType component1() {
            return this.childViewType;
        }

        @Nullable
        public final Integer component2() {
            return this.titleResourceId;
        }

        public final boolean component3() {
            return this.hasSeeAll;
        }

        @NotNull
        public final Title copy(@NotNull StatisticsViewType statisticsViewType0, @Nullable Integer integer0, boolean z) {
            Intrinsics.checkNotNullParameter(statisticsViewType0, "childViewType");
            return new Title(statisticsViewType0, integer0, z);
        }

        public static Title copy$default(Title statisticsItem$Title0, StatisticsViewType statisticsViewType0, Integer integer0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                statisticsViewType0 = statisticsItem$Title0.childViewType;
            }
            if((v & 2) != 0) {
                integer0 = statisticsItem$Title0.titleResourceId;
            }
            if((v & 4) != 0) {
                z = statisticsItem$Title0.hasSeeAll;
            }
            return statisticsItem$Title0.copy(statisticsViewType0, integer0, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Title)) {
                return false;
            }
            if(this.childViewType != ((Title)object0).childViewType) {
                return false;
            }
            return Intrinsics.areEqual(this.titleResourceId, ((Title)object0).titleResourceId) ? this.hasSeeAll == ((Title)object0).hasSeeAll : false;
        }

        @NotNull
        public final StatisticsViewType getChildViewType() {
            return this.childViewType;
        }

        public final boolean getHasSeeAll() {
            return this.hasSeeAll;
        }

        @Nullable
        public final Integer getTitleResourceId() {
            return this.titleResourceId;
        }

        @Override
        public int hashCode() {
            int v = this.childViewType.hashCode();
            return this.titleResourceId == null ? Boolean.hashCode(this.hasSeeAll) + v * 961 : Boolean.hashCode(this.hasSeeAll) + (v * 0x1F + this.titleResourceId.hashCode()) * 0x1F;
        }

        public final void setChildViewType(@NotNull StatisticsViewType statisticsViewType0) {
            Intrinsics.checkNotNullParameter(statisticsViewType0, "<set-?>");
            this.childViewType = statisticsViewType0;
        }

        @Override
        @NotNull
        public String toString() {
            return "Title(childViewType=" + this.childViewType + ", titleResourceId=" + this.titleResourceId + ", hasSeeAll=" + this.hasSeeAll + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000E\u0010\b\u001A\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001E\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001A\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EHÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001A\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$TopEntryItem;", "T", "Lcom/kakao/tistory/data/model/StatisticsItem;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/kakao/tistory/data/model/StatisticsItem$TopEntryItem;", "equals", "", "other", "", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class TopEntryItem extends StatisticsItem {
        private final Object data;

        public TopEntryItem(Object object0) {
            super(StatisticsViewType.TOP_POST, null, 2, null);
            this.data = object0;
        }

        public final Object component1() {
            return this.data;
        }

        @NotNull
        public final TopEntryItem copy(Object object0) {
            return new TopEntryItem(object0);
        }

        public static TopEntryItem copy$default(TopEntryItem statisticsItem$TopEntryItem0, Object object0, int v, Object object1) {
            if((v & 1) != 0) {
                object0 = statisticsItem$TopEntryItem0.data;
            }
            return statisticsItem$TopEntryItem0.copy(object0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof TopEntryItem ? Intrinsics.areEqual(this.data, ((TopEntryItem)object0).data) : false;
        }

        public final Object getData() {
            return this.data;
        }

        @Override
        public int hashCode() {
            return this.data == null ? 0 : this.data.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "TopEntryItem(data=" + this.data + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001A\u00020\u000B\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0002\u0010\rJ\u0010\u0010%\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\u000FJ\u000B\u0010&\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\t\u0010\'\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010(\u001A\u0004\u0018\u00010\bH\u00C6\u0003J\u000B\u0010)\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\t\u0010*\u001A\u00020\u000BH\u00C6\u0003J\t\u0010+\u001A\u00020\u000BH\u00C6\u0003J\\\u0010,\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u00C6\u0001\u00A2\u0006\u0002\u0010-J\u0013\u0010.\u001A\u00020\u000B2\b\u0010/\u001A\u0004\u0018\u000100H\u00D6\u0003J\t\u00101\u001A\u000202H\u00D6\u0001J\t\u00103\u001A\u00020\u0005H\u00D6\u0001R\u001E\u0010\u0002\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0012\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u001A\u0010\n\u001A\u00020\u000BX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\f\u001A\u00020\u000BX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\u0013\"\u0004\b\u0016\u0010\u0015R\u001C\u0010\t\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR\u001C\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010\u0018\"\u0004\b \u0010\u001AR\u001A\u0010\u0006\u001A\u00020\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00A8\u00064"}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$TopPostItem;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "id", "", "title", "", "viewCount", "thumbnail", "Lcom/kakao/tistory/domain/entity/Thumbnail;", "ranking", "isFirstItem", "", "isLastItem", "(Ljava/lang/Long;Ljava/lang/String;JLcom/kakao/tistory/domain/entity/Thumbnail;Ljava/lang/String;ZZ)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "()Z", "setFirstItem", "(Z)V", "setLastItem", "getRanking", "()Ljava/lang/String;", "setRanking", "(Ljava/lang/String;)V", "getThumbnail", "()Lcom/kakao/tistory/domain/entity/Thumbnail;", "setThumbnail", "(Lcom/kakao/tistory/domain/entity/Thumbnail;)V", "getTitle", "setTitle", "getViewCount", "()J", "setViewCount", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/String;JLcom/kakao/tistory/domain/entity/Thumbnail;Ljava/lang/String;ZZ)Lcom/kakao/tistory/data/model/StatisticsItem$TopPostItem;", "equals", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class TopPostItem extends StatisticsItem {
        @Nullable
        private Long id;
        private boolean isFirstItem;
        private boolean isLastItem;
        @Nullable
        private String ranking;
        @Nullable
        private Thumbnail thumbnail;
        @Nullable
        private String title;
        private long viewCount;

        public TopPostItem() {
            this(null, null, 0L, null, null, false, false, 0x7F, null);
        }

        public TopPostItem(@Nullable Long long0, @Nullable String s, long v, @Nullable Thumbnail thumbnail0, @Nullable String s1, boolean z, boolean z1) {
            super(StatisticsViewType.TOP_POST, null, 2, null);
            this.id = long0;
            this.title = s;
            this.viewCount = v;
            this.thumbnail = thumbnail0;
            this.ranking = s1;
            this.isFirstItem = z;
            this.isLastItem = z1;
        }

        public TopPostItem(Long long0, String s, long v, Thumbnail thumbnail0, String s1, boolean z, boolean z1, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v1 & 1) == 0 ? long0 : null), ((v1 & 2) == 0 ? s : null), ((v1 & 4) == 0 ? v : 0L), ((v1 & 8) == 0 ? thumbnail0 : null), ((v1 & 16) == 0 ? s1 : null), ((v1 & 0x20) == 0 ? z : false), ((v1 & 0x40) == 0 ? z1 : false));
        }

        @Nullable
        public final Long component1() {
            return this.id;
        }

        @Nullable
        public final String component2() {
            return this.title;
        }

        public final long component3() {
            return this.viewCount;
        }

        @Nullable
        public final Thumbnail component4() {
            return this.thumbnail;
        }

        @Nullable
        public final String component5() {
            return this.ranking;
        }

        public final boolean component6() {
            return this.isFirstItem;
        }

        public final boolean component7() {
            return this.isLastItem;
        }

        @NotNull
        public final TopPostItem copy(@Nullable Long long0, @Nullable String s, long v, @Nullable Thumbnail thumbnail0, @Nullable String s1, boolean z, boolean z1) {
            return new TopPostItem(long0, s, v, thumbnail0, s1, z, z1);
        }

        public static TopPostItem copy$default(TopPostItem statisticsItem$TopPostItem0, Long long0, String s, long v, Thumbnail thumbnail0, String s1, boolean z, boolean z1, int v1, Object object0) {
            Long long1 = (v1 & 1) == 0 ? long0 : statisticsItem$TopPostItem0.id;
            String s2 = (v1 & 2) == 0 ? s : statisticsItem$TopPostItem0.title;
            long v2 = (v1 & 4) == 0 ? v : statisticsItem$TopPostItem0.viewCount;
            Thumbnail thumbnail1 = (v1 & 8) == 0 ? thumbnail0 : statisticsItem$TopPostItem0.thumbnail;
            String s3 = (v1 & 16) == 0 ? s1 : statisticsItem$TopPostItem0.ranking;
            boolean z2 = (v1 & 0x20) == 0 ? z : statisticsItem$TopPostItem0.isFirstItem;
            return (v1 & 0x40) == 0 ? statisticsItem$TopPostItem0.copy(long1, s2, v2, thumbnail1, s3, z2, z1) : statisticsItem$TopPostItem0.copy(long1, s2, v2, thumbnail1, s3, z2, statisticsItem$TopPostItem0.isLastItem);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof TopPostItem)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.id, ((TopPostItem)object0).id)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.title, ((TopPostItem)object0).title)) {
                return false;
            }
            if(this.viewCount != ((TopPostItem)object0).viewCount) {
                return false;
            }
            if(!Intrinsics.areEqual(this.thumbnail, ((TopPostItem)object0).thumbnail)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.ranking, ((TopPostItem)object0).ranking)) {
                return false;
            }
            return this.isFirstItem == ((TopPostItem)object0).isFirstItem ? this.isLastItem == ((TopPostItem)object0).isLastItem : false;
        }

        @Nullable
        public final Long getId() {
            return this.id;
        }

        @Nullable
        public final String getRanking() {
            return this.ranking;
        }

        @Nullable
        public final Thumbnail getThumbnail() {
            return this.thumbnail;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final long getViewCount() {
            return this.viewCount;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = wb.a.k(this.viewCount, ((this.id == null ? 0 : this.id.hashCode()) * 0x1F + (this.title == null ? 0 : this.title.hashCode())) * 0x1F, 0x1F);
            int v2 = this.thumbnail == null ? 0 : this.thumbnail.hashCode();
            String s = this.ranking;
            if(s != null) {
                v = s.hashCode();
            }
            return Boolean.hashCode(this.isLastItem) + r0.a.e(((v1 + v2) * 0x1F + v) * 0x1F, 0x1F, this.isFirstItem);
        }

        public final boolean isFirstItem() {
            return this.isFirstItem;
        }

        public final boolean isLastItem() {
            return this.isLastItem;
        }

        public final void setFirstItem(boolean z) {
            this.isFirstItem = z;
        }

        public final void setId(@Nullable Long long0) {
            this.id = long0;
        }

        public final void setLastItem(boolean z) {
            this.isLastItem = z;
        }

        public final void setRanking(@Nullable String s) {
            this.ranking = s;
        }

        public final void setThumbnail(@Nullable Thumbnail thumbnail0) {
            this.thumbnail = thumbnail0;
        }

        public final void setTitle(@Nullable String s) {
            this.title = s;
        }

        public final void setViewCount(long v) {
            this.viewCount = v;
        }

        @Override
        @NotNull
        public String toString() {
            return "TopPostItem(id=" + this.id + ", title=" + this.title + ", viewCount=" + this.viewCount + ", thumbnail=" + this.thumbnail + ", ranking=" + this.ranking + ", isFirstItem=" + this.isFirstItem + ", isLastItem=" + this.isLastItem + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\u000F\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001A\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u001B\u001A\u0004\u0018\u00010\tHÆ\u0003JO\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001A\u00020\u00032\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001D\u001A\u00020\u001E2\b\u0010\u001F\u001A\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001A\u00020\"HÖ\u0001J\t\u0010#\u001A\u00020\tHÖ\u0001R\u0011\u0010\n\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\u000B\u001A\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000E¨\u0006$"}, d2 = {"Lcom/kakao/tistory/data/model/StatisticsItem$Trend;", "Lcom/kakao/tistory/data/model/StatisticsItem;", "visitorToday", "", "total", "items", "", "Lcom/kakao/tistory/domain/entity/TrendItem;", "lastUpdateTime", "", "increase", "increaseEffect", "(JJLjava/util/List;Ljava/lang/String;JLjava/lang/String;)V", "getIncrease", "()J", "getIncreaseEffect", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getLastUpdateTime", "getTotal", "getVisitorToday", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Trend extends StatisticsItem {
        private final long increase;
        @Nullable
        private final String increaseEffect;
        @NotNull
        private final List items;
        @Nullable
        private final String lastUpdateTime;
        private final long total;
        private final long visitorToday;

        public Trend() {
            this(0L, 0L, null, null, 0L, null, 0x3F, null);
        }

        public Trend(long v, long v1, @NotNull List list0, @Nullable String s, long v2, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(list0, "items");
            super(StatisticsViewType.TREND, null, 2, null);
            this.visitorToday = v;
            this.total = v1;
            this.items = list0;
            this.lastUpdateTime = s;
            this.increase = v2;
            this.increaseEffect = s1;
        }

        public Trend(long v, long v1, List list0, String s, long v2, String s1, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
            long v4 = 0L;
            List list1 = (v3 & 4) == 0 ? list0 : new ArrayList();
            String s2 = null;
            if((v3 & 16) == 0) {
                v4 = v2;
            }
            if((v3 & 0x20) == 0) {
                s2 = s1;
            }
            this(((v3 & 1) == 0 ? v : 0L), ((v3 & 2) == 0 ? v1 : 0L), list1, ((v3 & 8) == 0 ? s : null), v4, s2);
        }

        public final long component1() {
            return this.visitorToday;
        }

        public final long component2() {
            return this.total;
        }

        @NotNull
        public final List component3() {
            return this.items;
        }

        @Nullable
        public final String component4() {
            return this.lastUpdateTime;
        }

        public final long component5() {
            return this.increase;
        }

        @Nullable
        public final String component6() {
            return this.increaseEffect;
        }

        @NotNull
        public final Trend copy(long v, long v1, @NotNull List list0, @Nullable String s, long v2, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(list0, "items");
            return new Trend(v, v1, list0, s, v2, s1);
        }

        public static Trend copy$default(Trend statisticsItem$Trend0, long v, long v1, List list0, String s, long v2, String s1, int v3, Object object0) {
            long v4 = (v3 & 1) == 0 ? v : statisticsItem$Trend0.visitorToday;
            long v5 = (v3 & 2) == 0 ? v1 : statisticsItem$Trend0.total;
            List list1 = (v3 & 4) == 0 ? list0 : statisticsItem$Trend0.items;
            String s2 = (v3 & 8) == 0 ? s : statisticsItem$Trend0.lastUpdateTime;
            long v6 = (v3 & 16) == 0 ? v2 : statisticsItem$Trend0.increase;
            return (v3 & 0x20) == 0 ? statisticsItem$Trend0.copy(v4, v5, list1, s2, v6, s1) : statisticsItem$Trend0.copy(v4, v5, list1, s2, v6, statisticsItem$Trend0.increaseEffect);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Trend)) {
                return false;
            }
            if(this.visitorToday != ((Trend)object0).visitorToday) {
                return false;
            }
            if(this.total != ((Trend)object0).total) {
                return false;
            }
            if(!Intrinsics.areEqual(this.items, ((Trend)object0).items)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.lastUpdateTime, ((Trend)object0).lastUpdateTime)) {
                return false;
            }
            return this.increase == ((Trend)object0).increase ? Intrinsics.areEqual(this.increaseEffect, ((Trend)object0).increaseEffect) : false;
        }

        public final long getIncrease() {
            return this.increase;
        }

        @Nullable
        public final String getIncreaseEffect() {
            return this.increaseEffect;
        }

        @NotNull
        public final List getItems() {
            return this.items;
        }

        @Nullable
        public final String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public final long getTotal() {
            return this.total;
        }

        public final long getVisitorToday() {
            return this.visitorToday;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = wb.a.k(this.increase, (b.c(this.items, wb.a.k(this.total, Long.hashCode(this.visitorToday) * 0x1F, 0x1F), 0x1F) + (this.lastUpdateTime == null ? 0 : this.lastUpdateTime.hashCode())) * 0x1F, 0x1F);
            String s = this.increaseEffect;
            if(s != null) {
                v = s.hashCode();
            }
            return v1 + v;
        }

        @Override
        @NotNull
        public String toString() {
            return "Trend(visitorToday=" + this.visitorToday + ", total=" + this.total + ", items=" + this.items + ", lastUpdateTime=" + this.lastUpdateTime + ", increase=" + this.increase + ", increaseEffect=" + this.increaseEffect + ")";
        }
    }

    @Nullable
    private String exception;
    @NotNull
    private final StatisticsViewType statisticsViewType;

    private StatisticsItem(StatisticsViewType statisticsViewType0, String s) {
        this.statisticsViewType = statisticsViewType0;
        this.exception = s;
    }

    public StatisticsItem(StatisticsViewType statisticsViewType0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(statisticsViewType0, s, null);
    }

    public StatisticsItem(StatisticsViewType statisticsViewType0, String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this(statisticsViewType0, s);
    }

    @Nullable
    public final String getException() {
        return this.exception;
    }

    @NotNull
    public final StatisticsViewType getStatisticsViewType() {
        return this.statisticsViewType;
    }

    public final void setException(@Nullable String s) {
        this.exception = s;
    }
}

