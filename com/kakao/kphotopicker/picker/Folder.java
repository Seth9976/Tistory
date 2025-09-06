package com.kakao.kphotopicker.picker;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b(\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013B;\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\n\u0010\u000BJ\r\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0012J\u0010\u0010\u001B\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0014J\u001A\u0010\u001D\u001A\u00020\f2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u0010R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0012R\"\u0010\u0007\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0014\"\u0004\b(\u0010)R$\u0010\b\u001A\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b*\u0010#\u001A\u0004\b+\u0010\u0012\"\u0004\b,\u0010-R$\u0010\t\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u0017\"\u0004\b1\u00102\u00A8\u00064"}, d2 = {"Lcom/kakao/kphotopicker/picker/Folder;", "", "", "bucketId", "", "bucketName", "", "bucketSize", "thumbnailUrl", "dateModified", "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/Long;)V", "", "isAllItemsFolder", "()Z", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "component5", "()Ljava/lang/Long;", "copy", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/Long;)Lcom/kakao/kphotopicker/picker/Folder;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getBucketId", "b", "Ljava/lang/String;", "getBucketName", "c", "I", "getBucketSize", "setBucketSize", "(I)V", "d", "getThumbnailUrl", "setThumbnailUrl", "(Ljava/lang/String;)V", "e", "Ljava/lang/Long;", "getDateModified", "setDateModified", "(Ljava/lang/Long;)V", "Companion", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Folder {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0005\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/kphotopicker/picker/Folder$Companion;", "", "", "Lcom/kakao/kphotopicker/picker/Folder;", "list", "getAllItemsFolder", "(Ljava/util/List;)Lcom/kakao/kphotopicker/picker/Folder;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nMediaItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaItem.kt\ncom/kakao/kphotopicker/picker/Folder$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n1789#2,3:79\n*S KotlinDebug\n*F\n+ 1 MediaItem.kt\ncom/kakao/kphotopicker/picker/Folder$Companion\n*L\n71#1:79,3\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Folder getAllItemsFolder(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "list");
            int v = 0;
            for(Object object0: list0) {
                v += ((Folder)object0).getBucketSize();
            }
            Folder folder0 = (Folder)CollectionsKt___CollectionsKt.firstOrNull(list0);
            String s = folder0 == null ? null : folder0.getThumbnailUrl();
            Folder folder1 = (Folder)CollectionsKt___CollectionsKt.firstOrNull(list0);
            return folder1 == null ? new Folder(-1L, "", v, s, null) : new Folder(-1L, "", v, s, folder1.getDateModified());
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public final String b;
    public int c;
    public String d;
    public Long e;

    static {
        Folder.Companion = new Companion(null);
    }

    public Folder(long v, @NotNull String s, int v1, @Nullable String s1, @Nullable Long long0) {
        Intrinsics.checkNotNullParameter(s, "bucketName");
        super();
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = s1;
        this.e = long0;
    }

    public Folder(long v, String s, int v1, String s1, Long long0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            s = "";
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        this(v, s, v1, ((v2 & 8) == 0 ? s1 : null), ((v2 & 16) == 0 ? long0 : null));
    }

    public final long component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @Nullable
    public final String component4() {
        return this.d;
    }

    @Nullable
    public final Long component5() {
        return this.e;
    }

    @NotNull
    public final Folder copy(long v, @NotNull String s, int v1, @Nullable String s1, @Nullable Long long0) {
        Intrinsics.checkNotNullParameter(s, "bucketName");
        return new Folder(v, s, v1, s1, long0);
    }

    public static Folder copy$default(Folder folder0, long v, String s, int v1, String s1, Long long0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = folder0.a;
        }
        if((v2 & 2) != 0) {
            s = folder0.b;
        }
        if((v2 & 4) != 0) {
            v1 = folder0.c;
        }
        if((v2 & 8) != 0) {
            s1 = folder0.d;
        }
        if((v2 & 16) != 0) {
            long0 = folder0.e;
        }
        return folder0.copy(v, s, v1, s1, long0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Folder)) {
            return false;
        }
        if(this.a != ((Folder)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Folder)object0).b)) {
            return false;
        }
        if(this.c != ((Folder)object0).c) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((Folder)object0).d) ? Intrinsics.areEqual(this.e, ((Folder)object0).e) : false;
    }

    public final long getBucketId() {
        return this.a;
    }

    @NotNull
    public final String getBucketName() {
        return this.b;
    }

    public final int getBucketSize() {
        return this.c;
    }

    @Nullable
    public final Long getDateModified() {
        return this.e;
    }

    @Nullable
    public final String getThumbnailUrl() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = a.c(this.c, q.c(Long.hashCode(this.a) * 0x1F, 0x1F, this.b), 0x1F);
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        Long long0 = this.e;
        if(long0 != null) {
            v1 = long0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    public final boolean isAllItemsFolder() {
        return this.a == -1L;
    }

    public final void setBucketSize(int v) {
        this.c = v;
    }

    public final void setDateModified(@Nullable Long long0) {
        this.e = long0;
    }

    public final void setThumbnailUrl(@Nullable String s) {
        this.d = s;
    }

    @Override
    @NotNull
    public String toString() {
        return "Folder(bucketId=" + this.a + ", bucketName=" + this.b + ", bucketSize=" + this.c + ", thumbnailUrl=" + this.d + ", dateModified=" + this.e + ")";
    }
}

