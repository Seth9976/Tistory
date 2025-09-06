package com.kakao.tistory.domain.entity;

import a5.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.kakao.tistory.domain.blog.entity.a;
import com.kakao.tistory.domain.blog.entity.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bR\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00BF\u0002\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0005\u0012\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\f\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001A\u00020\u0013\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001B\u0012\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001D\u001A\u00020\u0013\u0012\b\b\u0002\u0010\u001E\u001A\u00020\u0013\u0012\b\b\u0002\u0010\u001F\u001A\u00020 \u0012\b\b\u0002\u0010!\u001A\u00020\u0013\u0012\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010#\u00A2\u0006\u0002\u0010$J\u0010\u0010V\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u00106J\u000B\u0010W\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010X\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010Y\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010Z\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\t\u0010[\u001A\u00020\u0013H\u00C6\u0003J\u000B\u0010\\\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010]\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010^\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u0010\u0010_\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u00106J\t\u0010`\u001A\u00020\u0013H\u00C6\u0003J\u000B\u0010a\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\t\u0010b\u001A\u00020\u0013H\u00C6\u0003J\u000B\u0010c\u001A\u0004\u0018\u00010\u001BH\u00C6\u0003J\u000B\u0010d\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\t\u0010e\u001A\u00020\u0013H\u00C6\u0003J\t\u0010f\u001A\u00020\u0013H\u00C6\u0003J\t\u0010g\u001A\u00020 H\u00C6\u0003J\t\u0010h\u001A\u00020\u0013H\u00C6\u0003J\u000B\u0010i\u001A\u0004\u0018\u00010#H\u00C6\u0003J\u000B\u0010j\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010k\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010l\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010m\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010n\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000F\u0010o\u001A\b\u0012\u0004\u0012\u00020\u00050\fH\u00C6\u0003J\u000B\u0010p\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u00C8\u0002\u0010q\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00052\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\f2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001A\u00020\u00132\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001A\u00020\u00132\b\b\u0002\u0010\u0019\u001A\u00020\u00132\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001D\u001A\u00020\u00132\b\b\u0002\u0010\u001E\u001A\u00020\u00132\b\b\u0002\u0010\u001F\u001A\u00020 2\b\b\u0002\u0010!\u001A\u00020\u00132\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010#H\u00C6\u0001\u00A2\u0006\u0002\u0010rJ\t\u0010s\u001A\u00020 H\u00D6\u0001J\u0013\u0010t\u001A\u00020\u00132\b\u0010u\u001A\u0004\u0018\u00010vH\u00D6\u0003J\t\u0010w\u001A\u00020 H\u00D6\u0001J\t\u0010x\u001A\u00020\u0005H\u00D6\u0001J\u0019\u0010y\u001A\u00020z2\u0006\u0010{\u001A\u00020|2\u0006\u0010}\u001A\u00020 H\u00D6\u0001R\u001A\u0010!\u001A\u00020\u0013X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001C\u0010)\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0013\u0010\t\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b.\u0010+R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b/\u0010+R\u0013\u0010\b\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b0\u0010+R\u001C\u0010\r\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b1\u0010+\"\u0004\b2\u0010-R\u0017\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\f\u00A2\u0006\b\n\u0000\u001A\u0004\b3\u00104R\u0015\u0010\u0017\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u00107\u001A\u0004\b5\u00106R\u001A\u0010\u001F\u001A\u00020 X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b8\u00109\"\u0004\b:\u0010;R\u001A\u0010<\u001A\u00020\u0013X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b=\u0010&\"\u0004\b>\u0010(R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u00107\u001A\u0004\b?\u00106R\u001A\u0010\u001E\u001A\u00020\u0013X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010&\"\u0004\b@\u0010(R\u001A\u0010\u001D\u001A\u00020\u0013X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010&\"\u0004\bA\u0010(R\u001A\u0010B\u001A\u00020\u0013X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bB\u0010&\"\u0004\bC\u0010(R\u0011\u0010\u0012\u001A\u00020\u0013\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010&R\u001A\u0010\u0018\u001A\u00020\u0013X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010&\"\u0004\bD\u0010(R\u0013\u0010\u000E\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bE\u0010+R\u0013\u0010\u0016\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bF\u0010+R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bG\u0010+R\u0011\u0010\u0019\u001A\u00020\u0013\u00A2\u0006\b\n\u0000\u001A\u0004\bH\u0010&R\u0013\u0010\u001C\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bI\u0010+R\u0013\u0010\u001A\u001A\u0004\u0018\u00010\u001B\u00A2\u0006\b\n\u0000\u001A\u0004\bJ\u0010KR\u0013\u0010\u0011\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bL\u0010+R\u0013\u0010\u0014\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bM\u0010+R\u0013\u0010\u0015\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bN\u0010+R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bO\u0010+R\u0013\u0010\u0010\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bP\u0010+R\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bQ\u0010+R\u001C\u0010\n\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bR\u0010+\"\u0004\bS\u0010-R\u0013\u0010\"\u001A\u0004\u0018\u00010#\u00A2\u0006\b\n\u0000\u001A\u0004\bT\u0010U\u00A8\u0006~"}, d2 = {"Lcom/kakao/tistory/domain/entity/Blog;", "Landroid/os/Parcelable;", "id", "", "name", "", "serviceDomain", "customDomain", "defaultDomain", "created", "title", "emoticons", "", "description", "language", "timezone", "status", "profileStatus", "isRestrict", "", "restrictLocked", "role", "logoImageUrl", "followerCount", "isSubscriber", "needCaptcha", "ownerUser", "Lcom/kakao/tistory/domain/entity/User;", "nickname", "isBlocking", "isBlocked", "guestbookCommentCount", "", "allowWriteOnGuestbook", "topCategory", "Lcom/kakao/tistory/domain/entity/TopCategory;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZLcom/kakao/tistory/domain/entity/User;Ljava/lang/String;ZZIZLcom/kakao/tistory/domain/entity/TopCategory;)V", "getAllowWriteOnGuestbook", "()Z", "setAllowWriteOnGuestbook", "(Z)V", "category", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getCreated", "getCustomDomain", "getDefaultDomain", "getDescription", "setDescription", "getEmoticons", "()Ljava/util/List;", "getFollowerCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGuestbookCommentCount", "()I", "setGuestbookCommentCount", "(I)V", "hasDivider", "getHasDivider", "setHasDivider", "getId", "setBlocked", "setBlocking", "isEmpty", "setEmpty", "setSubscriber", "getLanguage", "getLogoImageUrl", "getName", "getNeedCaptcha", "getNickname", "getOwnerUser", "()Lcom/kakao/tistory/domain/entity/User;", "getProfileStatus", "getRestrictLocked", "getRole", "getServiceDomain", "getStatus", "getTimezone", "getTitle", "setTitle", "getTopCategory", "()Lcom/kakao/tistory/domain/entity/TopCategory;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZLcom/kakao/tistory/domain/entity/User;Ljava/lang/String;ZZIZLcom/kakao/tistory/domain/entity/TopCategory;)Lcom/kakao/tistory/domain/entity/Blog;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class Blog implements Parcelable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final Blog createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            Object object0 = null;
            Long long0 = parcel0.readInt() == 0 ? null : parcel0.readLong();
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            String s2 = parcel0.readString();
            String s3 = parcel0.readString();
            String s4 = parcel0.readString();
            String s5 = parcel0.readString();
            ArrayList arrayList0 = parcel0.createStringArrayList();
            String s6 = parcel0.readString();
            String s7 = parcel0.readString();
            String s8 = parcel0.readString();
            String s9 = parcel0.readString();
            String s10 = parcel0.readString();
            boolean z = parcel0.readInt() != 0;
            String s11 = parcel0.readString();
            String s12 = parcel0.readString();
            String s13 = parcel0.readString();
            Long long1 = parcel0.readInt() == 0 ? null : parcel0.readLong();
            boolean z1 = parcel0.readInt() != 0;
            boolean z2 = parcel0.readInt() != 0;
            Object object1 = parcel0.readInt() == 0 ? null : User.CREATOR.createFromParcel(parcel0);
            String s14 = parcel0.readString();
            boolean z3 = parcel0.readInt() != 0;
            boolean z4 = parcel0.readInt() != 0;
            int v = parcel0.readInt();
            boolean z5 = parcel0.readInt() != 0;
            if(parcel0.readInt() != 0) {
                object0 = TopCategory.CREATOR.createFromParcel(parcel0);
            }
            return new Blog(long0, s, s1, s2, s3, s4, s5, arrayList0, s6, s7, s8, s9, s10, z, s11, s12, s13, long1, z1, z2, ((User)object1), s14, z3, z4, v, z5, ((TopCategory)object0));
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final Blog[] newArray(int v) {
            return new Blog[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.newArray(v);
        }
    }

    @NotNull
    public static final Parcelable.Creator CREATOR;
    private boolean allowWriteOnGuestbook;
    @Nullable
    private String category;
    @Nullable
    private final String created;
    @Nullable
    private final String customDomain;
    @Nullable
    private final String defaultDomain;
    @Nullable
    private String description;
    @NotNull
    private final List emoticons;
    @Nullable
    private final Long followerCount;
    private int guestbookCommentCount;
    private boolean hasDivider;
    @Nullable
    private final Long id;
    private boolean isBlocked;
    private boolean isBlocking;
    private boolean isEmpty;
    private final boolean isRestrict;
    private boolean isSubscriber;
    @Nullable
    private final String language;
    @Nullable
    private final String logoImageUrl;
    @Nullable
    private final String name;
    private final boolean needCaptcha;
    @Nullable
    private final String nickname;
    @Nullable
    private final User ownerUser;
    @Nullable
    private final String profileStatus;
    @Nullable
    private final String restrictLocked;
    @Nullable
    private final String role;
    @Nullable
    private final String serviceDomain;
    @Nullable
    private final String status;
    @Nullable
    private final String timezone;
    @Nullable
    private String title;
    @Nullable
    private final TopCategory topCategory;

    static {
        Blog.CREATOR = new Creator();
    }

    public Blog() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, false, false, 0, false, null, 0x7FFFFFF, null);
    }

    public Blog(@Nullable Long long0, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @NotNull List list0, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable String s10, boolean z, @Nullable String s11, @Nullable String s12, @Nullable String s13, @Nullable Long long1, boolean z1, boolean z2, @Nullable User user0, @Nullable String s14, boolean z3, boolean z4, int v, boolean z5, @Nullable TopCategory topCategory0) {
        Intrinsics.checkNotNullParameter(list0, "emoticons");
        super();
        this.id = long0;
        this.name = s;
        this.serviceDomain = s1;
        this.customDomain = s2;
        this.defaultDomain = s3;
        this.created = s4;
        this.title = s5;
        this.emoticons = list0;
        this.description = s6;
        this.language = s7;
        this.timezone = s8;
        this.status = s9;
        this.profileStatus = s10;
        this.isRestrict = z;
        this.restrictLocked = s11;
        this.role = s12;
        this.logoImageUrl = s13;
        this.followerCount = long1;
        this.isSubscriber = z1;
        this.needCaptcha = z2;
        this.ownerUser = user0;
        this.nickname = s14;
        this.isBlocking = z3;
        this.isBlocked = z4;
        this.guestbookCommentCount = v;
        this.allowWriteOnGuestbook = z5;
        this.topCategory = topCategory0;
    }

    public Blog(Long long0, String s, String s1, String s2, String s3, String s4, String s5, List list0, String s6, String s7, String s8, String s9, String s10, boolean z, String s11, String s12, String s13, Long long1, boolean z1, boolean z2, User user0, String s14, boolean z3, boolean z4, int v, boolean z5, TopCategory topCategory0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        List list1 = (v1 & 0x80) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        boolean z6 = false;
        Long long2 = (v1 & 0x20000) == 0 ? long1 : 0L;
        if((v1 & 0x2000000) == 0) {
            z6 = z5;
        }
        this(((v1 & 1) == 0 ? long0 : null), ((v1 & 2) == 0 ? s : null), ((v1 & 4) == 0 ? s1 : null), ((v1 & 8) == 0 ? s2 : null), ((v1 & 16) == 0 ? s3 : null), ((v1 & 0x20) == 0 ? s4 : null), ((v1 & 0x40) == 0 ? s5 : null), list1, ((v1 & 0x100) == 0 ? s6 : null), ((v1 & 0x200) == 0 ? s7 : null), ((v1 & 0x400) == 0 ? s8 : null), ((v1 & 0x800) == 0 ? s9 : null), ((v1 & 0x1000) == 0 ? s10 : null), ((v1 & 0x2000) == 0 ? z : false), ((v1 & 0x4000) == 0 ? s11 : null), ((v1 & 0x8000) == 0 ? s12 : null), ((v1 & 0x10000) == 0 ? s13 : null), long2, ((v1 & 0x40000) == 0 ? z1 : false), ((v1 & 0x80000) == 0 ? z2 : false), ((v1 & 0x100000) == 0 ? user0 : null), ((v1 & 0x200000) == 0 ? s14 : null), ((v1 & 0x400000) == 0 ? z3 : false), ((v1 & 0x800000) == 0 ? z4 : false), ((v1 & 0x1000000) == 0 ? v : 0), z6, ((v1 & 0x4000000) == 0 ? topCategory0 : null));
    }

    @Nullable
    public final Long component1() {
        return this.id;
    }

    @Nullable
    public final String component10() {
        return this.language;
    }

    @Nullable
    public final String component11() {
        return this.timezone;
    }

    @Nullable
    public final String component12() {
        return this.status;
    }

    @Nullable
    public final String component13() {
        return this.profileStatus;
    }

    public final boolean component14() {
        return this.isRestrict;
    }

    @Nullable
    public final String component15() {
        return this.restrictLocked;
    }

    @Nullable
    public final String component16() {
        return this.role;
    }

    @Nullable
    public final String component17() {
        return this.logoImageUrl;
    }

    @Nullable
    public final Long component18() {
        return this.followerCount;
    }

    public final boolean component19() {
        return this.isSubscriber;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    public final boolean component20() {
        return this.needCaptcha;
    }

    @Nullable
    public final User component21() {
        return this.ownerUser;
    }

    @Nullable
    public final String component22() {
        return this.nickname;
    }

    public final boolean component23() {
        return this.isBlocking;
    }

    public final boolean component24() {
        return this.isBlocked;
    }

    public final int component25() {
        return this.guestbookCommentCount;
    }

    public final boolean component26() {
        return this.allowWriteOnGuestbook;
    }

    @Nullable
    public final TopCategory component27() {
        return this.topCategory;
    }

    @Nullable
    public final String component3() {
        return this.serviceDomain;
    }

    @Nullable
    public final String component4() {
        return this.customDomain;
    }

    @Nullable
    public final String component5() {
        return this.defaultDomain;
    }

    @Nullable
    public final String component6() {
        return this.created;
    }

    @Nullable
    public final String component7() {
        return this.title;
    }

    @NotNull
    public final List component8() {
        return this.emoticons;
    }

    @Nullable
    public final String component9() {
        return this.description;
    }

    @NotNull
    public final Blog copy(@Nullable Long long0, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @NotNull List list0, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable String s10, boolean z, @Nullable String s11, @Nullable String s12, @Nullable String s13, @Nullable Long long1, boolean z1, boolean z2, @Nullable User user0, @Nullable String s14, boolean z3, boolean z4, int v, boolean z5, @Nullable TopCategory topCategory0) {
        Intrinsics.checkNotNullParameter(list0, "emoticons");
        return new Blog(long0, s, s1, s2, s3, s4, s5, list0, s6, s7, s8, s9, s10, z, s11, s12, s13, long1, z1, z2, user0, s14, z3, z4, v, z5, topCategory0);
    }

    public static Blog copy$default(Blog blog0, Long long0, String s, String s1, String s2, String s3, String s4, String s5, List list0, String s6, String s7, String s8, String s9, String s10, boolean z, String s11, String s12, String s13, Long long1, boolean z1, boolean z2, User user0, String s14, boolean z3, boolean z4, int v, boolean z5, TopCategory topCategory0, int v1, Object object0) {
        Long long2 = (v1 & 1) == 0 ? long0 : blog0.id;
        String s15 = (v1 & 2) == 0 ? s : blog0.name;
        String s16 = (v1 & 4) == 0 ? s1 : blog0.serviceDomain;
        String s17 = (v1 & 8) == 0 ? s2 : blog0.customDomain;
        String s18 = (v1 & 16) == 0 ? s3 : blog0.defaultDomain;
        String s19 = (v1 & 0x20) == 0 ? s4 : blog0.created;
        String s20 = (v1 & 0x40) == 0 ? s5 : blog0.title;
        List list1 = (v1 & 0x80) == 0 ? list0 : blog0.emoticons;
        String s21 = (v1 & 0x100) == 0 ? s6 : blog0.description;
        String s22 = (v1 & 0x200) == 0 ? s7 : blog0.language;
        String s23 = (v1 & 0x400) == 0 ? s8 : blog0.timezone;
        String s24 = (v1 & 0x800) == 0 ? s9 : blog0.status;
        String s25 = (v1 & 0x1000) == 0 ? s10 : blog0.profileStatus;
        boolean z6 = (v1 & 0x2000) == 0 ? z : blog0.isRestrict;
        String s26 = (v1 & 0x4000) == 0 ? s11 : blog0.restrictLocked;
        String s27 = (v1 & 0x8000) == 0 ? s12 : blog0.role;
        String s28 = (v1 & 0x10000) == 0 ? s13 : blog0.logoImageUrl;
        Long long3 = (v1 & 0x20000) == 0 ? long1 : blog0.followerCount;
        boolean z7 = (v1 & 0x40000) == 0 ? z1 : blog0.isSubscriber;
        boolean z8 = (v1 & 0x80000) == 0 ? z2 : blog0.needCaptcha;
        User user1 = (v1 & 0x100000) == 0 ? user0 : blog0.ownerUser;
        String s29 = (v1 & 0x200000) == 0 ? s14 : blog0.nickname;
        boolean z9 = (v1 & 0x400000) == 0 ? z3 : blog0.isBlocking;
        boolean z10 = (v1 & 0x800000) == 0 ? z4 : blog0.isBlocked;
        int v2 = (v1 & 0x1000000) == 0 ? v : blog0.guestbookCommentCount;
        boolean z11 = (v1 & 0x2000000) == 0 ? z5 : blog0.allowWriteOnGuestbook;
        return (v1 & 0x4000000) == 0 ? blog0.copy(long2, s15, s16, s17, s18, s19, s20, list1, s21, s22, s23, s24, s25, z6, s26, s27, s28, long3, z7, z8, user1, s29, z9, z10, v2, z11, topCategory0) : blog0.copy(long2, s15, s16, s17, s18, s19, s20, list1, s21, s22, s23, s24, s25, z6, s26, s27, s28, long3, z7, z8, user1, s29, z9, z10, v2, z11, blog0.topCategory);
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
        if(!(object0 instanceof Blog)) {
            return false;
        }
        Blog blog0 = (Blog)object0;
        if(!Intrinsics.areEqual(this.id, blog0.id)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.name, blog0.name)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.serviceDomain, blog0.serviceDomain)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.customDomain, blog0.customDomain)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.defaultDomain, blog0.defaultDomain)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.created, blog0.created)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.title, blog0.title)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.emoticons, blog0.emoticons)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.description, blog0.description)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.language, blog0.language)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.timezone, blog0.timezone)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.status, blog0.status)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.profileStatus, blog0.profileStatus)) {
            return false;
        }
        if(this.isRestrict != blog0.isRestrict) {
            return false;
        }
        if(!Intrinsics.areEqual(this.restrictLocked, blog0.restrictLocked)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.role, blog0.role)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.logoImageUrl, blog0.logoImageUrl)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.followerCount, blog0.followerCount)) {
            return false;
        }
        if(this.isSubscriber != blog0.isSubscriber) {
            return false;
        }
        if(this.needCaptcha != blog0.needCaptcha) {
            return false;
        }
        if(!Intrinsics.areEqual(this.ownerUser, blog0.ownerUser)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.nickname, blog0.nickname)) {
            return false;
        }
        if(this.isBlocking != blog0.isBlocking) {
            return false;
        }
        if(this.isBlocked != blog0.isBlocked) {
            return false;
        }
        if(this.guestbookCommentCount != blog0.guestbookCommentCount) {
            return false;
        }
        return this.allowWriteOnGuestbook == blog0.allowWriteOnGuestbook ? Intrinsics.areEqual(this.topCategory, blog0.topCategory) : false;
    }

    public final boolean getAllowWriteOnGuestbook() {
        return this.allowWriteOnGuestbook;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getCreated() {
        return this.created;
    }

    @Nullable
    public final String getCustomDomain() {
        return this.customDomain;
    }

    @Nullable
    public final String getDefaultDomain() {
        return this.defaultDomain;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List getEmoticons() {
        return this.emoticons;
    }

    @Nullable
    public final Long getFollowerCount() {
        return this.followerCount;
    }

    public final int getGuestbookCommentCount() {
        return this.guestbookCommentCount;
    }

    public final boolean getHasDivider() {
        return this.hasDivider;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getLogoImageUrl() {
        return this.logoImageUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getNeedCaptcha() {
        return this.needCaptcha;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final User getOwnerUser() {
        return this.ownerUser;
    }

    @Nullable
    public final String getProfileStatus() {
        return this.profileStatus;
    }

    @Nullable
    public final String getRestrictLocked() {
        return this.restrictLocked;
    }

    @Nullable
    public final String getRole() {
        return this.role;
    }

    @Nullable
    public final String getServiceDomain() {
        return this.serviceDomain;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTimezone() {
        return this.timezone;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final TopCategory getTopCategory() {
        return this.topCategory;
    }

    // 去混淆评级： 低(30)
    @Override
    public int hashCode() {
        int v = 0;
        int v1 = c.a(this.allowWriteOnGuestbook, a.a(this.guestbookCommentCount, c.a(this.isBlocked, c.a(this.isBlocking, ((c.a(this.needCaptcha, c.a(this.isSubscriber, ((((c.a(this.isRestrict, (((((b.c(this.emoticons, (((((((this.id == null ? 0 : this.id.hashCode()) * 0x1F + (this.name == null ? 0 : this.name.hashCode())) * 0x1F + (this.serviceDomain == null ? 0 : this.serviceDomain.hashCode())) * 0x1F + (this.customDomain == null ? 0 : this.customDomain.hashCode())) * 0x1F + (this.defaultDomain == null ? 0 : this.defaultDomain.hashCode())) * 0x1F + (this.created == null ? 0 : this.created.hashCode())) * 0x1F + (this.title == null ? 0 : this.title.hashCode())) * 0x1F, 0x1F) + (this.description == null ? 0 : this.description.hashCode())) * 0x1F + (this.language == null ? 0 : this.language.hashCode())) * 0x1F + (this.timezone == null ? 0 : this.timezone.hashCode())) * 0x1F + (this.status == null ? 0 : this.status.hashCode())) * 0x1F + (this.profileStatus == null ? 0 : this.profileStatus.hashCode())) * 0x1F, 0x1F) + (this.restrictLocked == null ? 0 : this.restrictLocked.hashCode())) * 0x1F + (this.role == null ? 0 : this.role.hashCode())) * 0x1F + (this.logoImageUrl == null ? 0 : this.logoImageUrl.hashCode())) * 0x1F + (this.followerCount == null ? 0 : this.followerCount.hashCode())) * 0x1F, 0x1F), 0x1F) + (this.ownerUser == null ? 0 : this.ownerUser.hashCode())) * 0x1F + (this.nickname == null ? 0 : this.nickname.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        TopCategory topCategory0 = this.topCategory;
        if(topCategory0 != null) {
            v = topCategory0.hashCode();
        }
        return v1 + v;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isBlocking() {
        return this.isBlocking;
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public final boolean isRestrict() {
        return this.isRestrict;
    }

    public final boolean isSubscriber() {
        return this.isSubscriber;
    }

    public final void setAllowWriteOnGuestbook(boolean z) {
        this.allowWriteOnGuestbook = z;
    }

    public final void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public final void setBlocking(boolean z) {
        this.isBlocking = z;
    }

    public final void setCategory(@Nullable String s) {
        this.category = s;
    }

    public final void setDescription(@Nullable String s) {
        this.description = s;
    }

    public final void setEmpty(boolean z) {
        this.isEmpty = z;
    }

    public final void setGuestbookCommentCount(int v) {
        this.guestbookCommentCount = v;
    }

    public final void setHasDivider(boolean z) {
        this.hasDivider = z;
    }

    public final void setSubscriber(boolean z) {
        this.isSubscriber = z;
    }

    public final void setTitle(@Nullable String s) {
        this.title = s;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.title;
        String s1 = this.description;
        boolean z = this.isSubscriber;
        boolean z1 = this.isBlocking;
        boolean z2 = this.isBlocked;
        int v = this.guestbookCommentCount;
        boolean z3 = this.allowWriteOnGuestbook;
        StringBuilder stringBuilder0 = new StringBuilder("Blog(id=");
        stringBuilder0.append(this.id);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", serviceDomain=");
        androidx.room.a.w(stringBuilder0, this.serviceDomain, ", customDomain=", this.customDomain, ", defaultDomain=");
        androidx.room.a.w(stringBuilder0, this.defaultDomain, ", created=", this.created, ", title=");
        stringBuilder0.append(s);
        stringBuilder0.append(", emoticons=");
        stringBuilder0.append(this.emoticons);
        stringBuilder0.append(", description=");
        androidx.room.a.w(stringBuilder0, s1, ", language=", this.language, ", timezone=");
        androidx.room.a.w(stringBuilder0, this.timezone, ", status=", this.status, ", profileStatus=");
        stringBuilder0.append(this.profileStatus);
        stringBuilder0.append(", isRestrict=");
        stringBuilder0.append(this.isRestrict);
        stringBuilder0.append(", restrictLocked=");
        androidx.room.a.w(stringBuilder0, this.restrictLocked, ", role=", this.role, ", logoImageUrl=");
        stringBuilder0.append(this.logoImageUrl);
        stringBuilder0.append(", followerCount=");
        stringBuilder0.append(this.followerCount);
        stringBuilder0.append(", isSubscriber=");
        stringBuilder0.append(z);
        stringBuilder0.append(", needCaptcha=");
        stringBuilder0.append(this.needCaptcha);
        stringBuilder0.append(", ownerUser=");
        stringBuilder0.append(this.ownerUser);
        stringBuilder0.append(", nickname=");
        stringBuilder0.append(this.nickname);
        stringBuilder0.append(", isBlocking=");
        stringBuilder0.append(z1);
        stringBuilder0.append(", isBlocked=");
        stringBuilder0.append(z2);
        stringBuilder0.append(", guestbookCommentCount=");
        stringBuilder0.append(v);
        stringBuilder0.append(", allowWriteOnGuestbook=");
        stringBuilder0.append(z3);
        stringBuilder0.append(", topCategory=");
        stringBuilder0.append(this.topCategory);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "out");
        Long long0 = this.id;
        if(long0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeLong(((long)long0));
        }
        parcel0.writeString(this.name);
        parcel0.writeString(this.serviceDomain);
        parcel0.writeString(this.customDomain);
        parcel0.writeString(this.defaultDomain);
        parcel0.writeString(this.created);
        parcel0.writeString(this.title);
        parcel0.writeStringList(this.emoticons);
        parcel0.writeString(this.description);
        parcel0.writeString(this.language);
        parcel0.writeString(this.timezone);
        parcel0.writeString(this.status);
        parcel0.writeString(this.profileStatus);
        parcel0.writeInt(((int)this.isRestrict));
        parcel0.writeString(this.restrictLocked);
        parcel0.writeString(this.role);
        parcel0.writeString(this.logoImageUrl);
        Long long1 = this.followerCount;
        if(long1 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeLong(((long)long1));
        }
        parcel0.writeInt(((int)this.isSubscriber));
        parcel0.writeInt(((int)this.needCaptcha));
        User user0 = this.ownerUser;
        if(user0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            user0.writeToParcel(parcel0, v);
        }
        parcel0.writeString(this.nickname);
        parcel0.writeInt(((int)this.isBlocking));
        parcel0.writeInt(((int)this.isBlocked));
        parcel0.writeInt(this.guestbookCommentCount);
        parcel0.writeInt(((int)this.allowWriteOnGuestbook));
        TopCategory topCategory0 = this.topCategory;
        if(topCategory0 == null) {
            parcel0.writeInt(0);
            return;
        }
        parcel0.writeInt(1);
        topCategory0.writeToParcel(parcel0, v);
    }
}

