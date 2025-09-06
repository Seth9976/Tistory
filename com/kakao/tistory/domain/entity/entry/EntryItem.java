package com.kakao.tistory.domain.entity.entry;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.runtime.Stable;
import com.kakao.tistory.domain.blog.entity.c;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.Thumbnail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Stable
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00A3\u0002\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\t\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000B\u001A\u00020\t\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001B\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u001C\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u001D\u001A\u00020\t\u0012\b\b\u0002\u0010\u001E\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u001F\u001A\u00020\t\u00A2\u0006\u0002\u0010 J\u0010\u0010F\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010$J\u000B\u0010G\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010H\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010I\u001A\u0004\u0018\u00010\u0011H\u00C6\u0003J\u0010\u0010J\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010$J\u000B\u0010K\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010L\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010M\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010N\u001A\u0004\u0018\u00010\u0017H\u00C6\u0003J\u000B\u0010O\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010P\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u0010\u0010Q\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010$J\u000B\u0010R\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\t\u0010S\u001A\u00020\u0003H\u00C6\u0003J\t\u0010T\u001A\u00020\u0003H\u00C6\u0003J\t\u0010U\u001A\u00020\tH\u00C6\u0003J\t\u0010V\u001A\u00020\u0003H\u00C6\u0003J\t\u0010W\u001A\u00020\tH\u00C6\u0003J\u000B\u0010X\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010Y\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\t\u0010Z\u001A\u00020\tH\u00C6\u0003J\u000B\u0010[\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\t\u0010\\\u001A\u00020\tH\u00C6\u0003J\u000B\u0010]\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010^\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u00AC\u0002\u0010_\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000B\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001B\u001A\u00020\u00032\b\b\u0002\u0010\u001C\u001A\u00020\u00032\b\b\u0002\u0010\u001D\u001A\u00020\t2\b\b\u0002\u0010\u001E\u001A\u00020\u00032\b\b\u0002\u0010\u001F\u001A\u00020\tH\u00C6\u0001\u00A2\u0006\u0002\u0010`J\t\u0010a\u001A\u00020bH\u00D6\u0001J\u0013\u0010c\u001A\u00020\t2\b\u0010d\u001A\u0004\u0018\u00010eH\u00D6\u0003J\t\u0010f\u001A\u00020bH\u00D6\u0001J\t\u0010g\u001A\u00020\u0006H\u00D6\u0001J\u0019\u0010h\u001A\u00020i2\u0006\u0010j\u001A\u00020k2\u0006\u0010l\u001A\u00020bH\u00D6\u0001R\u0011\u0010\u000B\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b!\u0010\"R\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010%\u001A\u0004\b#\u0010$R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b&\u0010\'R\u0013\u0010\u0016\u001A\u0004\u0018\u00010\u0017\u00A2\u0006\b\n\u0000\u001A\u0004\b(\u0010)R\u001C\u0010\u0019\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b*\u0010\'\"\u0004\b+\u0010,R\u001C\u0010\u0018\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b-\u0010\'\"\u0004\b.\u0010,R\u0015\u0010\u0012\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010%\u001A\u0004\b/\u0010$R\u0013\u0010\u0013\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b0\u0010\'R\u001A\u0010\u001B\u001A\u00020\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b1\u00102\"\u0004\b3\u00104R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010%\u001A\u0004\b5\u0010$R\u0011\u0010\u001F\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010\"R\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\b\u0010\"R\u001A\u0010\u001C\u001A\u00020\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b6\u00102\"\u0004\b7\u00104R\u0011\u0010\u001D\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b8\u0010\"R\u001C\u0010\u001A\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b9\u0010\'\"\u0004\b:\u0010,R\u0013\u0010\u0014\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b;\u0010\'R\u0013\u0010\u0015\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b<\u0010\'R\u0013\u0010\n\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b=\u0010\'R\u0013\u0010\u000E\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b>\u0010\'R\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b?\u0010\'R\u0013\u0010\u0010\u001A\u0004\u0018\u00010\u0011\u00A2\u0006\b\n\u0000\u001A\u0004\b@\u0010AR\u0013\u0010\f\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\bB\u0010\'R\u0013\u0010\r\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\bC\u0010\'R\u0011\u0010\u001E\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\bD\u00102R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\bE\u0010\'\u00A8\u0006m"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "Landroid/os/Parcelable;", "id", "", "author", "authorName", "", "visibility", "isRestrict", "", "restrictType", "acceptComment", "title", "type", "scheduleStatus", "summary", "thumbnail", "Lcom/kakao/tistory/domain/entity/Thumbnail;", "category", "categoryLabel", "permalink", "published", "blog", "Lcom/kakao/tistory/domain/entity/Blog;", "blogTitle", "blogName", "password", "commentCount", "likeCount", "likeFlag", "viewCount", "isBlocked", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/Thumbnail;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/Blog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZJZ)V", "getAcceptComment", "()Z", "getAuthor", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAuthorName", "()Ljava/lang/String;", "getBlog", "()Lcom/kakao/tistory/domain/entity/Blog;", "getBlogName", "setBlogName", "(Ljava/lang/String;)V", "getBlogTitle", "setBlogTitle", "getCategory", "getCategoryLabel", "getCommentCount", "()J", "setCommentCount", "(J)V", "getId", "getLikeCount", "setLikeCount", "getLikeFlag", "getPassword", "setPassword", "getPermalink", "getPublished", "getRestrictType", "getScheduleStatus", "getSummary", "getThumbnail", "()Lcom/kakao/tistory/domain/entity/Thumbnail;", "getTitle", "getType", "getViewCount", "getVisibility", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/Thumbnail;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/Blog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZJZ)Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class EntryItem implements Parcelable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final EntryItem createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            Object object0 = null;
            Long long0 = parcel0.readInt() == 0 ? null : parcel0.readLong();
            Long long1 = parcel0.readInt() == 0 ? null : parcel0.readLong();
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            boolean z = parcel0.readInt() != 0;
            String s2 = parcel0.readString();
            boolean z1 = parcel0.readInt() != 0;
            String s3 = parcel0.readString();
            String s4 = parcel0.readString();
            String s5 = parcel0.readString();
            String s6 = parcel0.readString();
            Object object1 = parcel0.readInt() == 0 ? null : Thumbnail.CREATOR.createFromParcel(parcel0);
            Long long2 = parcel0.readInt() == 0 ? null : parcel0.readLong();
            String s7 = parcel0.readString();
            String s8 = parcel0.readString();
            String s9 = parcel0.readString();
            if(parcel0.readInt() != 0) {
                object0 = Blog.CREATOR.createFromParcel(parcel0);
            }
            String s10 = parcel0.readString();
            String s11 = parcel0.readString();
            String s12 = parcel0.readString();
            long v = parcel0.readLong();
            long v1 = parcel0.readLong();
            boolean z2 = parcel0.readInt() != 0;
            long v2 = parcel0.readLong();
            return parcel0.readInt() == 0 ? new EntryItem(long0, long1, s, s1, z, s2, z1, s3, s4, s5, s6, ((Thumbnail)object1), long2, s7, s8, s9, ((Blog)object0), s10, s11, s12, v, v1, z2, v2, false) : new EntryItem(long0, long1, s, s1, z, s2, z1, s3, s4, s5, s6, ((Thumbnail)object1), long2, s7, s8, s9, ((Blog)object0), s10, s11, s12, v, v1, z2, v2, true);
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final EntryItem[] newArray(int v) {
            return new EntryItem[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.newArray(v);
        }
    }

    @NotNull
    public static final Parcelable.Creator CREATOR;
    private final boolean acceptComment;
    @Nullable
    private final Long author;
    @Nullable
    private final String authorName;
    @Nullable
    private final Blog blog;
    @Nullable
    private String blogName;
    @Nullable
    private String blogTitle;
    @Nullable
    private final Long category;
    @Nullable
    private final String categoryLabel;
    private long commentCount;
    @Nullable
    private final Long id;
    private final boolean isBlocked;
    private final boolean isRestrict;
    private long likeCount;
    private final boolean likeFlag;
    @Nullable
    private String password;
    @Nullable
    private final String permalink;
    @Nullable
    private final String published;
    @Nullable
    private final String restrictType;
    @Nullable
    private final String scheduleStatus;
    @Nullable
    private final String summary;
    @Nullable
    private final Thumbnail thumbnail;
    @Nullable
    private final String title;
    @Nullable
    private final String type;
    private final long viewCount;
    @Nullable
    private final String visibility;

    static {
        EntryItem.CREATOR = new Creator();
    }

    public EntryItem() {
        this(null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, false, 0L, false, 0x1FFFFFF, null);
    }

    public EntryItem(@Nullable Long long0, @Nullable Long long1, @Nullable String s, @Nullable String s1, boolean z, @Nullable String s2, boolean z1, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable Thumbnail thumbnail0, @Nullable Long long2, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable Blog blog0, @Nullable String s10, @Nullable String s11, @Nullable String s12, long v, long v1, boolean z2, long v2, boolean z3) {
        this.id = long0;
        this.author = long1;
        this.authorName = s;
        this.visibility = s1;
        this.isRestrict = z;
        this.restrictType = s2;
        this.acceptComment = z1;
        this.title = s3;
        this.type = s4;
        this.scheduleStatus = s5;
        this.summary = s6;
        this.thumbnail = thumbnail0;
        this.category = long2;
        this.categoryLabel = s7;
        this.permalink = s8;
        this.published = s9;
        this.blog = blog0;
        this.blogTitle = s10;
        this.blogName = s11;
        this.password = s12;
        this.commentCount = v;
        this.likeCount = v1;
        this.likeFlag = z2;
        this.viewCount = v2;
        this.isBlocked = z3;
    }

    public EntryItem(Long long0, Long long1, String s, String s1, boolean z, String s2, boolean z1, String s3, String s4, String s5, String s6, Thumbnail thumbnail0, Long long2, String s7, String s8, String s9, Blog blog0, String s10, String s11, String s12, long v, long v1, boolean z2, long v2, boolean z3, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v3 & 1) == 0 ? long0 : null), ((v3 & 2) == 0 ? long1 : null), ((v3 & 4) == 0 ? s : null), ((v3 & 8) == 0 ? s1 : null), ((v3 & 16) == 0 ? z : false), ((v3 & 0x20) == 0 ? s2 : null), ((v3 & 0x40) == 0 ? z1 : true), ((v3 & 0x80) == 0 ? s3 : null), ((v3 & 0x100) == 0 ? s4 : null), ((v3 & 0x200) == 0 ? s5 : null), ((v3 & 0x400) == 0 ? s6 : null), ((v3 & 0x800) == 0 ? thumbnail0 : null), ((v3 & 0x1000) == 0 ? long2 : null), ((v3 & 0x2000) == 0 ? s7 : null), ((v3 & 0x4000) == 0 ? s8 : null), ((v3 & 0x8000) == 0 ? s9 : null), ((v3 & 0x10000) == 0 ? blog0 : null), ((v3 & 0x20000) == 0 ? s10 : null), ((v3 & 0x40000) == 0 ? s11 : null), ((v3 & 0x80000) == 0 ? s12 : null), ((v3 & 0x100000) == 0 ? v : 0L), ((v3 & 0x200000) == 0 ? v1 : 0L), ((v3 & 0x400000) == 0 ? z2 : false), ((v3 & 0x800000) == 0 ? v2 : 0L), ((v3 & 0x1000000) == 0 ? z3 : false));
    }

    @Nullable
    public final Long component1() {
        return this.id;
    }

    @Nullable
    public final String component10() {
        return this.scheduleStatus;
    }

    @Nullable
    public final String component11() {
        return this.summary;
    }

    @Nullable
    public final Thumbnail component12() {
        return this.thumbnail;
    }

    @Nullable
    public final Long component13() {
        return this.category;
    }

    @Nullable
    public final String component14() {
        return this.categoryLabel;
    }

    @Nullable
    public final String component15() {
        return this.permalink;
    }

    @Nullable
    public final String component16() {
        return this.published;
    }

    @Nullable
    public final Blog component17() {
        return this.blog;
    }

    @Nullable
    public final String component18() {
        return this.blogTitle;
    }

    @Nullable
    public final String component19() {
        return this.blogName;
    }

    @Nullable
    public final Long component2() {
        return this.author;
    }

    @Nullable
    public final String component20() {
        return this.password;
    }

    public final long component21() {
        return this.commentCount;
    }

    public final long component22() {
        return this.likeCount;
    }

    public final boolean component23() {
        return this.likeFlag;
    }

    public final long component24() {
        return this.viewCount;
    }

    public final boolean component25() {
        return this.isBlocked;
    }

    @Nullable
    public final String component3() {
        return this.authorName;
    }

    @Nullable
    public final String component4() {
        return this.visibility;
    }

    public final boolean component5() {
        return this.isRestrict;
    }

    @Nullable
    public final String component6() {
        return this.restrictType;
    }

    public final boolean component7() {
        return this.acceptComment;
    }

    @Nullable
    public final String component8() {
        return this.title;
    }

    @Nullable
    public final String component9() {
        return this.type;
    }

    @NotNull
    public final EntryItem copy(@Nullable Long long0, @Nullable Long long1, @Nullable String s, @Nullable String s1, boolean z, @Nullable String s2, boolean z1, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable Thumbnail thumbnail0, @Nullable Long long2, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable Blog blog0, @Nullable String s10, @Nullable String s11, @Nullable String s12, long v, long v1, boolean z2, long v2, boolean z3) {
        return new EntryItem(long0, long1, s, s1, z, s2, z1, s3, s4, s5, s6, thumbnail0, long2, s7, s8, s9, blog0, s10, s11, s12, v, v1, z2, v2, z3);
    }

    public static EntryItem copy$default(EntryItem entryItem0, Long long0, Long long1, String s, String s1, boolean z, String s2, boolean z1, String s3, String s4, String s5, String s6, Thumbnail thumbnail0, Long long2, String s7, String s8, String s9, Blog blog0, String s10, String s11, String s12, long v, long v1, boolean z2, long v2, boolean z3, int v3, Object object0) {
        Long long3 = (v3 & 1) == 0 ? long0 : entryItem0.id;
        Long long4 = (v3 & 2) == 0 ? long1 : entryItem0.author;
        String s13 = (v3 & 4) == 0 ? s : entryItem0.authorName;
        String s14 = (v3 & 8) == 0 ? s1 : entryItem0.visibility;
        boolean z4 = (v3 & 16) == 0 ? z : entryItem0.isRestrict;
        String s15 = (v3 & 0x20) == 0 ? s2 : entryItem0.restrictType;
        boolean z5 = (v3 & 0x40) == 0 ? z1 : entryItem0.acceptComment;
        String s16 = (v3 & 0x80) == 0 ? s3 : entryItem0.title;
        String s17 = (v3 & 0x100) == 0 ? s4 : entryItem0.type;
        String s18 = (v3 & 0x200) == 0 ? s5 : entryItem0.scheduleStatus;
        String s19 = (v3 & 0x400) == 0 ? s6 : entryItem0.summary;
        Thumbnail thumbnail1 = (v3 & 0x800) == 0 ? thumbnail0 : entryItem0.thumbnail;
        Long long5 = (v3 & 0x1000) == 0 ? long2 : entryItem0.category;
        String s20 = (v3 & 0x2000) == 0 ? s7 : entryItem0.categoryLabel;
        String s21 = (v3 & 0x4000) == 0 ? s8 : entryItem0.permalink;
        String s22 = (v3 & 0x8000) == 0 ? s9 : entryItem0.published;
        Blog blog1 = (v3 & 0x10000) == 0 ? blog0 : entryItem0.blog;
        String s23 = (v3 & 0x20000) == 0 ? s10 : entryItem0.blogTitle;
        String s24 = (v3 & 0x40000) == 0 ? s11 : entryItem0.blogName;
        String s25 = (v3 & 0x80000) == 0 ? s12 : entryItem0.password;
        long v4 = (v3 & 0x100000) == 0 ? v : entryItem0.commentCount;
        long v5 = (v3 & 0x200000) == 0 ? v1 : entryItem0.likeCount;
        boolean z6 = (v3 & 0x400000) == 0 ? z2 : entryItem0.likeFlag;
        long v6 = (0x800000 & v3) == 0 ? v2 : entryItem0.viewCount;
        return (v3 & 0x1000000) == 0 ? entryItem0.copy(long3, long4, s13, s14, z4, s15, z5, s16, s17, s18, s19, thumbnail1, long5, s20, s21, s22, blog1, s23, s24, s25, v4, v5, z6, v6, z3) : entryItem0.copy(long3, long4, s13, s14, z4, s15, z5, s16, s17, s18, s19, thumbnail1, long5, s20, s21, s22, blog1, s23, s24, s25, v4, v5, z6, v6, entryItem0.isBlocked);
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
        if(!(object0 instanceof EntryItem)) {
            return false;
        }
        EntryItem entryItem0 = (EntryItem)object0;
        if(!Intrinsics.areEqual(this.id, entryItem0.id)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.author, entryItem0.author)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.authorName, entryItem0.authorName)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.visibility, entryItem0.visibility)) {
            return false;
        }
        if(this.isRestrict != entryItem0.isRestrict) {
            return false;
        }
        if(!Intrinsics.areEqual(this.restrictType, entryItem0.restrictType)) {
            return false;
        }
        if(this.acceptComment != entryItem0.acceptComment) {
            return false;
        }
        if(!Intrinsics.areEqual(this.title, entryItem0.title)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.type, entryItem0.type)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.scheduleStatus, entryItem0.scheduleStatus)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.summary, entryItem0.summary)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.thumbnail, entryItem0.thumbnail)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.category, entryItem0.category)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.categoryLabel, entryItem0.categoryLabel)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.permalink, entryItem0.permalink)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.published, entryItem0.published)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.blog, entryItem0.blog)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.blogTitle, entryItem0.blogTitle)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.blogName, entryItem0.blogName)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.password, entryItem0.password)) {
            return false;
        }
        if(this.commentCount != entryItem0.commentCount) {
            return false;
        }
        if(this.likeCount != entryItem0.likeCount) {
            return false;
        }
        if(this.likeFlag != entryItem0.likeFlag) {
            return false;
        }
        return this.viewCount == entryItem0.viewCount ? this.isBlocked == entryItem0.isBlocked : false;
    }

    public final boolean getAcceptComment() {
        return this.acceptComment;
    }

    @Nullable
    public final Long getAuthor() {
        return this.author;
    }

    @Nullable
    public final String getAuthorName() {
        return this.authorName;
    }

    @Nullable
    public final Blog getBlog() {
        return this.blog;
    }

    @Nullable
    public final String getBlogName() {
        return this.blogName;
    }

    @Nullable
    public final String getBlogTitle() {
        return this.blogTitle;
    }

    @Nullable
    public final Long getCategory() {
        return this.category;
    }

    @Nullable
    public final String getCategoryLabel() {
        return this.categoryLabel;
    }

    public final long getCommentCount() {
        return this.commentCount;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    public final long getLikeCount() {
        return this.likeCount;
    }

    public final boolean getLikeFlag() {
        return this.likeFlag;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    public final String getPermalink() {
        return this.permalink;
    }

    @Nullable
    public final String getPublished() {
        return this.published;
    }

    @Nullable
    public final String getRestrictType() {
        return this.restrictType;
    }

    @Nullable
    public final String getScheduleStatus() {
        return this.scheduleStatus;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    @Nullable
    public final Thumbnail getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final long getViewCount() {
        return this.viewCount;
    }

    @Nullable
    public final String getVisibility() {
        return this.visibility;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = c.a(this.acceptComment, (c.a(this.isRestrict, ((((this.id == null ? 0 : this.id.hashCode()) * 0x1F + (this.author == null ? 0 : this.author.hashCode())) * 0x1F + (this.authorName == null ? 0 : this.authorName.hashCode())) * 0x1F + (this.visibility == null ? 0 : this.visibility.hashCode())) * 0x1F, 0x1F) + (this.restrictType == null ? 0 : this.restrictType.hashCode())) * 0x1F, 0x1F);
        int v2 = this.title == null ? 0 : this.title.hashCode();
        int v3 = this.type == null ? 0 : this.type.hashCode();
        int v4 = this.scheduleStatus == null ? 0 : this.scheduleStatus.hashCode();
        int v5 = this.summary == null ? 0 : this.summary.hashCode();
        int v6 = this.thumbnail == null ? 0 : this.thumbnail.hashCode();
        int v7 = this.category == null ? 0 : this.category.hashCode();
        int v8 = this.categoryLabel == null ? 0 : this.categoryLabel.hashCode();
        int v9 = this.permalink == null ? 0 : this.permalink.hashCode();
        int v10 = this.published == null ? 0 : this.published.hashCode();
        int v11 = this.blog == null ? 0 : this.blog.hashCode();
        int v12 = this.blogTitle == null ? 0 : this.blogTitle.hashCode();
        int v13 = this.blogName == null ? 0 : this.blogName.hashCode();
        String s = this.password;
        if(s != null) {
            v = s.hashCode();
        }
        return Boolean.hashCode(this.isBlocked) + a.k(this.viewCount, c.a(this.likeFlag, a.k(this.likeCount, a.k(this.commentCount, (((((((((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isRestrict() {
        return this.isRestrict;
    }

    public final void setBlogName(@Nullable String s) {
        this.blogName = s;
    }

    public final void setBlogTitle(@Nullable String s) {
        this.blogTitle = s;
    }

    public final void setCommentCount(long v) {
        this.commentCount = v;
    }

    public final void setLikeCount(long v) {
        this.likeCount = v;
    }

    public final void setPassword(@Nullable String s) {
        this.password = s;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.blogTitle;
        String s1 = this.blogName;
        String s2 = this.password;
        long v = this.commentCount;
        long v1 = this.likeCount;
        StringBuilder stringBuilder0 = new StringBuilder("EntryItem(id=");
        stringBuilder0.append(this.id);
        stringBuilder0.append(", author=");
        stringBuilder0.append(this.author);
        stringBuilder0.append(", authorName=");
        androidx.room.a.w(stringBuilder0, this.authorName, ", visibility=", this.visibility, ", isRestrict=");
        stringBuilder0.append(this.isRestrict);
        stringBuilder0.append(", restrictType=");
        stringBuilder0.append(this.restrictType);
        stringBuilder0.append(", acceptComment=");
        stringBuilder0.append(this.acceptComment);
        stringBuilder0.append(", title=");
        stringBuilder0.append(this.title);
        stringBuilder0.append(", type=");
        androidx.room.a.w(stringBuilder0, this.type, ", scheduleStatus=", this.scheduleStatus, ", summary=");
        stringBuilder0.append(this.summary);
        stringBuilder0.append(", thumbnail=");
        stringBuilder0.append(this.thumbnail);
        stringBuilder0.append(", category=");
        stringBuilder0.append(this.category);
        stringBuilder0.append(", categoryLabel=");
        stringBuilder0.append(this.categoryLabel);
        stringBuilder0.append(", permalink=");
        androidx.room.a.w(stringBuilder0, this.permalink, ", published=", this.published, ", blog=");
        stringBuilder0.append(this.blog);
        stringBuilder0.append(", blogTitle=");
        stringBuilder0.append(s);
        stringBuilder0.append(", blogName=");
        androidx.room.a.w(stringBuilder0, s1, ", password=", s2, ", commentCount=");
        stringBuilder0.append(v);
        stringBuilder0.append(", likeCount=");
        stringBuilder0.append(v1);
        stringBuilder0.append(", likeFlag=");
        stringBuilder0.append(this.likeFlag);
        stringBuilder0.append(", viewCount=");
        stringBuilder0.append(this.viewCount);
        stringBuilder0.append(", isBlocked=");
        stringBuilder0.append(this.isBlocked);
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
        Long long1 = this.author;
        if(long1 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeLong(((long)long1));
        }
        parcel0.writeString(this.authorName);
        parcel0.writeString(this.visibility);
        parcel0.writeInt(((int)this.isRestrict));
        parcel0.writeString(this.restrictType);
        parcel0.writeInt(((int)this.acceptComment));
        parcel0.writeString(this.title);
        parcel0.writeString(this.type);
        parcel0.writeString(this.scheduleStatus);
        parcel0.writeString(this.summary);
        Thumbnail thumbnail0 = this.thumbnail;
        if(thumbnail0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            thumbnail0.writeToParcel(parcel0, v);
        }
        Long long2 = this.category;
        if(long2 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeLong(((long)long2));
        }
        parcel0.writeString(this.categoryLabel);
        parcel0.writeString(this.permalink);
        parcel0.writeString(this.published);
        Blog blog0 = this.blog;
        if(blog0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            blog0.writeToParcel(parcel0, v);
        }
        parcel0.writeString(this.blogTitle);
        parcel0.writeString(this.blogName);
        parcel0.writeString(this.password);
        parcel0.writeLong(this.commentCount);
        parcel0.writeLong(this.likeCount);
        parcel0.writeInt(((int)this.likeFlag));
        parcel0.writeLong(this.viewCount);
        parcel0.writeInt(((int)this.isBlocked));
    }
}

