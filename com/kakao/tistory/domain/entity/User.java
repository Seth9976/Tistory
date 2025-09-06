package com.kakao.tistory.domain.entity;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.room.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b=\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00C5\u0001\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0010\u00A2\u0006\u0002\u0010\u0017J\u0010\u0010=\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010*J\u000B\u0010>\u001A\u0004\u0018\u00010\u0010H\u00C6\u0003J\u000B\u0010?\u001A\u0004\u0018\u00010\u0010H\u00C6\u0003J\u0011\u0010@\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013H\u00C6\u0003J\u0011\u0010A\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013H\u00C6\u0003J\u000B\u0010B\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010C\u001A\u0004\u0018\u00010\u0010H\u00C6\u0003J\u000B\u0010D\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010E\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010F\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u0010\u0010G\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0002\u0010,J\u0010\u0010H\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0002\u0010,J\u000B\u0010I\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u0010\u0010J\u001A\u0004\u0018\u00010\rH\u00C6\u0003\u00A2\u0006\u0002\u0010\"J\u000B\u0010K\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u00CE\u0001\u0010L\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0010H\u00C6\u0001\u00A2\u0006\u0002\u0010MJ\t\u0010N\u001A\u00020\rH\u00D6\u0001J\u0013\u0010O\u001A\u00020\t2\b\u0010P\u001A\u0004\u0018\u00010QH\u00D6\u0003J\t\u0010R\u001A\u00020\rH\u00D6\u0001J\t\u0010S\u001A\u00020\u0005H\u00D6\u0001J\u0019\u0010T\u001A\u00020U2\u0006\u0010V\u001A\u00020W2\u0006\u0010X\u001A\u00020\rH\u00D6\u0001R\u001C\u0010\u0015\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\u001C\u0010\u000F\u001A\u0004\u0018\u00010\u0010X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010\u0019R\u0015\u0010\f\u001A\u0004\u0018\u00010\r\u00A2\u0006\n\n\u0002\u0010#\u001A\u0004\b!\u0010\"R\u001C\u0010\u0016\u001A\u0004\u0018\u00010\u0010X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b$\u0010\u001D\"\u0004\b%\u0010\u001FR\u001C\u0010\u0011\u001A\u0004\u0018\u00010\u0010X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\u001D\"\u0004\b\'\u0010\u001FR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b(\u0010\u0019R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010+\u001A\u0004\b)\u0010*R\u0015\u0010\b\u001A\u0004\u0018\u00010\t\u00A2\u0006\n\n\u0002\u0010-\u001A\u0004\b\b\u0010,R\u001A\u0010.\u001A\u00020\tX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R\u0015\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\n\n\u0002\u0010-\u001A\u0004\b\n\u0010,R\"\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b2\u00103\"\u0004\b4\u00105R\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b6\u0010\u0019R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b7\u0010\u0019\"\u0004\b8\u0010\u001BR\"\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b9\u00103\"\u0004\b:\u00105R\u001C\u0010\u000E\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001B\u00A8\u0006Y"}, d2 = {"Lcom/kakao/tistory/domain/entity/User;", "Landroid/os/Parcelable;", "id", "", "name", "", "email", "created", "isDormancy", "", "isLock", "locked", "createdBlogCnt", "", "profileImageUrl", "blog", "Lcom/kakao/tistory/domain/entity/Blog;", "defaultBlog", "ownerBlogs", "", "joinedBlogs", "accountType", "currentBlog", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/Blog;Lcom/kakao/tistory/domain/entity/Blog;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/Blog;)V", "getAccountType", "()Ljava/lang/String;", "setAccountType", "(Ljava/lang/String;)V", "getBlog", "()Lcom/kakao/tistory/domain/entity/Blog;", "setBlog", "(Lcom/kakao/tistory/domain/entity/Blog;)V", "getCreated", "getCreatedBlogCnt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrentBlog", "setCurrentBlog", "getDefaultBlog", "setDefaultBlog", "getEmail", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isEmpty", "()Z", "setEmpty", "(Z)V", "getJoinedBlogs", "()Ljava/util/List;", "setJoinedBlogs", "(Ljava/util/List;)V", "getLocked", "getName", "setName", "getOwnerBlogs", "setOwnerBlogs", "getProfileImageUrl", "setProfileImageUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/Blog;Lcom/kakao/tistory/domain/entity/Blog;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/Blog;)Lcom/kakao/tistory/domain/entity/User;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class User implements Parcelable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final User createFromParcel(@NotNull Parcel parcel0) {
            ArrayList arrayList1;
            ArrayList arrayList0;
            Boolean boolean1;
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            Long long0 = parcel0.readInt() == 0 ? null : parcel0.readLong();
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            String s2 = parcel0.readString();
            boolean z = true;
            Boolean boolean0 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            if(parcel0.readInt() == 0) {
                boolean1 = null;
            }
            else {
                if(parcel0.readInt() == 0) {
                    z = false;
                }
                boolean1 = Boolean.valueOf(z);
            }
            String s3 = parcel0.readString();
            Integer integer0 = parcel0.readInt() == 0 ? null : parcel0.readInt();
            String s4 = parcel0.readString();
            Object object0 = parcel0.readInt() == 0 ? null : Blog.CREATOR.createFromParcel(parcel0);
            Object object1 = parcel0.readInt() == 0 ? null : Blog.CREATOR.createFromParcel(parcel0);
            if(parcel0.readInt() == 0) {
                arrayList0 = null;
            }
            else {
                int v = parcel0.readInt();
                arrayList0 = new ArrayList(v);
                for(int v1 = 0; v1 != v; ++v1) {
                    arrayList0.add(Blog.CREATOR.createFromParcel(parcel0));
                }
            }
            if(parcel0.readInt() == 0) {
                arrayList1 = null;
            }
            else {
                int v2 = parcel0.readInt();
                ArrayList arrayList2 = new ArrayList(v2);
                for(int v3 = 0; v3 != v2; ++v3) {
                    arrayList2.add(Blog.CREATOR.createFromParcel(parcel0));
                }
                arrayList1 = arrayList2;
            }
            String s5 = parcel0.readString();
            return parcel0.readInt() == 0 ? new User(long0, s, s1, s2, boolean0, boolean1, s3, integer0, s4, ((Blog)object0), ((Blog)object1), arrayList0, arrayList1, s5, null) : new User(long0, s, s1, s2, boolean0, boolean1, s3, integer0, s4, ((Blog)object0), ((Blog)object1), arrayList0, arrayList1, s5, ((Blog)Blog.CREATOR.createFromParcel(parcel0)));
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final User[] newArray(int v) {
            return new User[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.newArray(v);
        }
    }

    @NotNull
    public static final Parcelable.Creator CREATOR;
    @Nullable
    private String accountType;
    @Nullable
    private Blog blog;
    @Nullable
    private final String created;
    @Nullable
    private final Integer createdBlogCnt;
    @Nullable
    private Blog currentBlog;
    @Nullable
    private Blog defaultBlog;
    @Nullable
    private final String email;
    @Nullable
    private final Long id;
    @Nullable
    private final Boolean isDormancy;
    private boolean isEmpty;
    @Nullable
    private final Boolean isLock;
    @Nullable
    private List joinedBlogs;
    @Nullable
    private final String locked;
    @Nullable
    private String name;
    @Nullable
    private List ownerBlogs;
    @Nullable
    private String profileImageUrl;

    static {
        User.CREATOR = new Creator();
    }

    public User() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x7FFF, null);
    }

    public User(@Nullable Long long0, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable Boolean boolean0, @Nullable Boolean boolean1, @Nullable String s3, @Nullable Integer integer0, @Nullable String s4, @Nullable Blog blog0, @Nullable Blog blog1, @Nullable List list0, @Nullable List list1, @Nullable String s5, @Nullable Blog blog2) {
        this.id = long0;
        this.name = s;
        this.email = s1;
        this.created = s2;
        this.isDormancy = boolean0;
        this.isLock = boolean1;
        this.locked = s3;
        this.createdBlogCnt = integer0;
        this.profileImageUrl = s4;
        this.blog = blog0;
        this.defaultBlog = blog1;
        this.ownerBlogs = list0;
        this.joinedBlogs = list1;
        this.accountType = s5;
        this.currentBlog = blog2;
    }

    public User(Long long0, String s, String s1, String s2, Boolean boolean0, Boolean boolean1, String s3, Integer integer0, String s4, Blog blog0, Blog blog1, List list0, List list1, String s5, Blog blog2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        Blog blog3 = null;
        Boolean boolean2 = (v & 16) == 0 ? boolean0 : Boolean.FALSE;
        Boolean boolean3 = (v & 0x20) == 0 ? boolean1 : Boolean.FALSE;
        Integer integer1 = (v & 0x80) == 0 ? integer0 : 0;
        if((v & 0x4000) == 0) {
            blog3 = blog2;
        }
        this(((v & 1) == 0 ? long0 : null), ((v & 2) == 0 ? s : null), ((v & 4) == 0 ? s1 : null), ((v & 8) == 0 ? s2 : null), boolean2, boolean3, ((v & 0x40) == 0 ? s3 : null), integer1, ((v & 0x100) == 0 ? s4 : null), ((v & 0x200) == 0 ? blog0 : null), ((v & 0x400) == 0 ? blog1 : null), ((v & 0x800) == 0 ? list0 : null), ((v & 0x1000) == 0 ? list1 : null), ((v & 0x2000) == 0 ? s5 : null), blog3);
    }

    @Nullable
    public final Long component1() {
        return this.id;
    }

    @Nullable
    public final Blog component10() {
        return this.blog;
    }

    @Nullable
    public final Blog component11() {
        return this.defaultBlog;
    }

    @Nullable
    public final List component12() {
        return this.ownerBlogs;
    }

    @Nullable
    public final List component13() {
        return this.joinedBlogs;
    }

    @Nullable
    public final String component14() {
        return this.accountType;
    }

    @Nullable
    public final Blog component15() {
        return this.currentBlog;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.email;
    }

    @Nullable
    public final String component4() {
        return this.created;
    }

    @Nullable
    public final Boolean component5() {
        return this.isDormancy;
    }

    @Nullable
    public final Boolean component6() {
        return this.isLock;
    }

    @Nullable
    public final String component7() {
        return this.locked;
    }

    @Nullable
    public final Integer component8() {
        return this.createdBlogCnt;
    }

    @Nullable
    public final String component9() {
        return this.profileImageUrl;
    }

    @NotNull
    public final User copy(@Nullable Long long0, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable Boolean boolean0, @Nullable Boolean boolean1, @Nullable String s3, @Nullable Integer integer0, @Nullable String s4, @Nullable Blog blog0, @Nullable Blog blog1, @Nullable List list0, @Nullable List list1, @Nullable String s5, @Nullable Blog blog2) {
        return new User(long0, s, s1, s2, boolean0, boolean1, s3, integer0, s4, blog0, blog1, list0, list1, s5, blog2);
    }

    public static User copy$default(User user0, Long long0, String s, String s1, String s2, Boolean boolean0, Boolean boolean1, String s3, Integer integer0, String s4, Blog blog0, Blog blog1, List list0, List list1, String s5, Blog blog2, int v, Object object0) {
        Long long1 = (v & 1) == 0 ? long0 : user0.id;
        String s6 = (v & 2) == 0 ? s : user0.name;
        String s7 = (v & 4) == 0 ? s1 : user0.email;
        String s8 = (v & 8) == 0 ? s2 : user0.created;
        Boolean boolean2 = (v & 16) == 0 ? boolean0 : user0.isDormancy;
        Boolean boolean3 = (v & 0x20) == 0 ? boolean1 : user0.isLock;
        String s9 = (v & 0x40) == 0 ? s3 : user0.locked;
        Integer integer1 = (v & 0x80) == 0 ? integer0 : user0.createdBlogCnt;
        String s10 = (v & 0x100) == 0 ? s4 : user0.profileImageUrl;
        Blog blog3 = (v & 0x200) == 0 ? blog0 : user0.blog;
        Blog blog4 = (v & 0x400) == 0 ? blog1 : user0.defaultBlog;
        List list2 = (v & 0x800) == 0 ? list0 : user0.ownerBlogs;
        List list3 = (v & 0x1000) == 0 ? list1 : user0.joinedBlogs;
        String s11 = (v & 0x2000) == 0 ? s5 : user0.accountType;
        return (v & 0x4000) == 0 ? user0.copy(long1, s6, s7, s8, boolean2, boolean3, s9, integer1, s10, blog3, blog4, list2, list3, s11, blog2) : user0.copy(long1, s6, s7, s8, boolean2, boolean3, s9, integer1, s10, blog3, blog4, list2, list3, s11, user0.currentBlog);
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
        if(!(object0 instanceof User)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.id, ((User)object0).id)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.name, ((User)object0).name)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.email, ((User)object0).email)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.created, ((User)object0).created)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.isDormancy, ((User)object0).isDormancy)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.isLock, ((User)object0).isLock)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.locked, ((User)object0).locked)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.createdBlogCnt, ((User)object0).createdBlogCnt)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.profileImageUrl, ((User)object0).profileImageUrl)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.blog, ((User)object0).blog)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.defaultBlog, ((User)object0).defaultBlog)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.ownerBlogs, ((User)object0).ownerBlogs)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.joinedBlogs, ((User)object0).joinedBlogs)) {
            return false;
        }
        return Intrinsics.areEqual(this.accountType, ((User)object0).accountType) ? Intrinsics.areEqual(this.currentBlog, ((User)object0).currentBlog) : false;
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final Blog getBlog() {
        return this.blog;
    }

    @Nullable
    public final String getCreated() {
        return this.created;
    }

    @Nullable
    public final Integer getCreatedBlogCnt() {
        return this.createdBlogCnt;
    }

    @Nullable
    public final Blog getCurrentBlog() {
        return this.currentBlog;
    }

    @Nullable
    public final Blog getDefaultBlog() {
        return this.defaultBlog;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final List getJoinedBlogs() {
        return this.joinedBlogs;
    }

    @Nullable
    public final String getLocked() {
        return this.locked;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List getOwnerBlogs() {
        return this.ownerBlogs;
    }

    @Nullable
    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.id == null ? 0 : this.id.hashCode();
        int v2 = this.name == null ? 0 : this.name.hashCode();
        int v3 = this.email == null ? 0 : this.email.hashCode();
        int v4 = this.created == null ? 0 : this.created.hashCode();
        int v5 = this.isDormancy == null ? 0 : this.isDormancy.hashCode();
        int v6 = this.isLock == null ? 0 : this.isLock.hashCode();
        int v7 = this.locked == null ? 0 : this.locked.hashCode();
        int v8 = this.createdBlogCnt == null ? 0 : this.createdBlogCnt.hashCode();
        int v9 = this.profileImageUrl == null ? 0 : this.profileImageUrl.hashCode();
        int v10 = this.blog == null ? 0 : this.blog.hashCode();
        int v11 = this.defaultBlog == null ? 0 : this.defaultBlog.hashCode();
        int v12 = this.ownerBlogs == null ? 0 : this.ownerBlogs.hashCode();
        int v13 = this.joinedBlogs == null ? 0 : this.joinedBlogs.hashCode();
        int v14 = this.accountType == null ? 0 : this.accountType.hashCode();
        Blog blog0 = this.currentBlog;
        if(blog0 != null) {
            v = blog0.hashCode();
        }
        return (((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v;
    }

    @Nullable
    public final Boolean isDormancy() {
        return this.isDormancy;
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    @Nullable
    public final Boolean isLock() {
        return this.isLock;
    }

    public final void setAccountType(@Nullable String s) {
        this.accountType = s;
    }

    public final void setBlog(@Nullable Blog blog0) {
        this.blog = blog0;
    }

    public final void setCurrentBlog(@Nullable Blog blog0) {
        this.currentBlog = blog0;
    }

    public final void setDefaultBlog(@Nullable Blog blog0) {
        this.defaultBlog = blog0;
    }

    public final void setEmpty(boolean z) {
        this.isEmpty = z;
    }

    public final void setJoinedBlogs(@Nullable List list0) {
        this.joinedBlogs = list0;
    }

    public final void setName(@Nullable String s) {
        this.name = s;
    }

    public final void setOwnerBlogs(@Nullable List list0) {
        this.ownerBlogs = list0;
    }

    public final void setProfileImageUrl(@Nullable String s) {
        this.profileImageUrl = s;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.name;
        String s1 = this.profileImageUrl;
        Blog blog0 = this.blog;
        Blog blog1 = this.defaultBlog;
        List list0 = this.ownerBlogs;
        List list1 = this.joinedBlogs;
        String s2 = this.accountType;
        Blog blog2 = this.currentBlog;
        StringBuilder stringBuilder0 = new StringBuilder("User(id=");
        stringBuilder0.append(this.id);
        stringBuilder0.append(", name=");
        stringBuilder0.append(s);
        stringBuilder0.append(", email=");
        a.w(stringBuilder0, this.email, ", created=", this.created, ", isDormancy=");
        stringBuilder0.append(this.isDormancy);
        stringBuilder0.append(", isLock=");
        stringBuilder0.append(this.isLock);
        stringBuilder0.append(", locked=");
        stringBuilder0.append(this.locked);
        stringBuilder0.append(", createdBlogCnt=");
        stringBuilder0.append(this.createdBlogCnt);
        stringBuilder0.append(", profileImageUrl=");
        stringBuilder0.append(s1);
        stringBuilder0.append(", blog=");
        stringBuilder0.append(blog0);
        stringBuilder0.append(", defaultBlog=");
        stringBuilder0.append(blog1);
        stringBuilder0.append(", ownerBlogs=");
        stringBuilder0.append(list0);
        stringBuilder0.append(", joinedBlogs=");
        stringBuilder0.append(list1);
        stringBuilder0.append(", accountType=");
        stringBuilder0.append(s2);
        stringBuilder0.append(", currentBlog=");
        stringBuilder0.append(blog2);
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
        parcel0.writeString(this.email);
        parcel0.writeString(this.created);
        Boolean boolean0 = this.isDormancy;
        if(boolean0 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean0);
        }
        Boolean boolean1 = this.isLock;
        if(boolean1 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean1);
        }
        parcel0.writeString(this.locked);
        Integer integer0 = this.createdBlogCnt;
        if(integer0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(((int)integer0));
        }
        parcel0.writeString(this.profileImageUrl);
        Blog blog0 = this.blog;
        if(blog0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            blog0.writeToParcel(parcel0, v);
        }
        Blog blog1 = this.defaultBlog;
        if(blog1 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            blog1.writeToParcel(parcel0, v);
        }
        List list0 = this.ownerBlogs;
        if(list0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(list0.size());
            for(Object object0: list0) {
                ((Blog)object0).writeToParcel(parcel0, v);
            }
        }
        List list1 = this.joinedBlogs;
        if(list1 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(list1.size());
            for(Object object1: list1) {
                ((Blog)object1).writeToParcel(parcel0, v);
            }
        }
        parcel0.writeString(this.accountType);
        Blog blog2 = this.currentBlog;
        if(blog2 == null) {
            parcel0.writeInt(0);
            return;
        }
        parcel0.writeInt(1);
        blog2.writeToParcel(parcel0, v);
    }
}

