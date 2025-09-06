package com.kakao.kphotopicker;

import a5.b;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import com.kakao.kphotopicker.loader.GalleryType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u0000 \u0093\u00012\u00020\u0001:\u0002\u0093\u0001B\u00C3\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\b\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\r\u001A\u00020\u000B\u0012\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\b\b\u0003\u0010\u0011\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0016\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0019\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u001A\u001A\u00020\u000B\u00A2\u0006\u0004\b\u001B\u0010\u001CJ?\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010\u0015\u001A\u00020\u000F2\b\b\u0002\u0010\u0016\u001A\u00020\u000F2\b\b\u0002\u0010\u0017\u001A\u00020\u000F2\b\b\u0002\u0010\u0018\u001A\u00020\u000F2\b\b\u0002\u0010\u001D\u001A\u00020\u000B\u00A2\u0006\u0004\b\u001F\u0010 J\u0015\u0010$\u001A\u00020#2\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010(\u001A\u00020\u0002H\u00C0\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010*\u001A\u00020\u0002H\u00C0\u0003\u00A2\u0006\u0004\b)\u0010\'J\u0010\u0010,\u001A\u00020\u0002H\u00C0\u0003\u00A2\u0006\u0004\b+\u0010\'J\u0010\u0010-\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010.J\u0010\u0010/\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b/\u00100J\u0010\u00101\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b1\u00100J\u0010\u00102\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b2\u00103J\u0010\u00104\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b4\u00103J\u0016\u00105\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u00C6\u0003\u00A2\u0006\u0004\b5\u00106J\u0010\u00107\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b7\u0010\'J\u0010\u00108\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b8\u0010\'J\u0010\u00109\u001A\u00020\u0013H\u00C6\u0003\u00A2\u0006\u0004\b9\u0010:J\u0010\u0010=\u001A\u00020\u000FH\u00C0\u0003\u00A2\u0006\u0004\b;\u0010<J\u0010\u0010?\u001A\u00020\u000FH\u00C0\u0003\u00A2\u0006\u0004\b>\u0010<J\u0010\u0010A\u001A\u00020\u000FH\u00C0\u0003\u00A2\u0006\u0004\b@\u0010<J\u0010\u0010C\u001A\u00020\u000FH\u00C0\u0003\u00A2\u0006\u0004\bB\u0010<J\u0010\u0010E\u001A\u00020\u000BH\u00C0\u0003\u00A2\u0006\u0004\bD\u00103J\u0010\u0010F\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\bF\u00103J\u00CA\u0001\u0010G\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\b\b\u0003\u0010\u0011\u001A\u00020\u00022\b\b\u0003\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0015\u001A\u00020\u000F2\b\b\u0002\u0010\u0016\u001A\u00020\u000F2\b\b\u0002\u0010\u0017\u001A\u00020\u000F2\b\b\u0002\u0010\u0018\u001A\u00020\u000F2\b\b\u0002\u0010\u0019\u001A\u00020\u000B2\b\b\u0002\u0010\u001A\u001A\u00020\u000BH\u00C6\u0001\u00A2\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001A\u00020\u000FH\u00D6\u0001\u00A2\u0006\u0004\bI\u0010<J\u0010\u0010J\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\bJ\u0010\'J\u001A\u0010M\u001A\u00020\u000B2\b\u0010L\u001A\u0004\u0018\u00010KH\u00D6\u0003\u00A2\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\bO\u0010\'J \u0010S\u001A\u00020\u001E2\u0006\u0010Q\u001A\u00020P2\u0006\u0010R\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\bS\u0010TR\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u0010\'R\u001A\u0010\u0004\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bX\u0010V\u001A\u0004\bY\u0010\'R\u001A\u0010\u0005\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bZ\u0010V\u001A\u0004\b[\u0010\'R\"\u0010\u0007\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\\\u0010]\u001A\u0004\b^\u0010.\"\u0004\b_\u0010`R\"\u0010\t\u001A\u00020\b8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\ba\u0010b\u001A\u0004\bc\u00100\"\u0004\bd\u0010eR\"\u0010\n\u001A\u00020\b8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bf\u0010b\u001A\u0004\bg\u00100\"\u0004\bh\u0010eR\"\u0010\f\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bi\u0010j\u001A\u0004\b\f\u00103\"\u0004\bk\u0010lR\"\u0010\r\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bm\u0010j\u001A\u0004\b\r\u00103\"\u0004\bn\u0010lR(\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bo\u0010p\u001A\u0004\bq\u00106\"\u0004\br\u0010sR\"\u0010\u0011\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bt\u0010V\u001A\u0004\bu\u0010\'\"\u0004\bv\u0010wR\"\u0010\u0012\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bx\u0010V\u001A\u0004\by\u0010\'\"\u0004\bz\u0010wR\"\u0010\u0014\u001A\u00020\u00138\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b{\u0010|\u001A\u0004\b}\u0010:\"\u0004\b~\u0010\u007FR\'\u0010\u0015\u001A\u00020\u000F8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001A\u0005\b\u0082\u0001\u0010<\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\'\u0010\u0016\u001A\u00020\u000F8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0081\u0001\u001A\u0005\b\u0086\u0001\u0010<\"\u0006\b\u0087\u0001\u0010\u0084\u0001R\'\u0010\u0017\u001A\u00020\u000F8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u0088\u0001\u0010\u0081\u0001\u001A\u0005\b\u0089\u0001\u0010<\"\u0006\b\u008A\u0001\u0010\u0084\u0001R\'\u0010\u0018\u001A\u00020\u000F8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0006\b\u008B\u0001\u0010\u0081\u0001\u001A\u0005\b\u008C\u0001\u0010<\"\u0006\b\u008D\u0001\u0010\u0084\u0001R%\u0010\u0019\u001A\u00020\u000B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0015\n\u0005\b\u008E\u0001\u0010j\u001A\u0005\b\u008F\u0001\u00103\"\u0005\b\u0090\u0001\u0010lR$\u0010\u001A\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0014\n\u0005\b\u0091\u0001\u0010j\u001A\u0004\b\u001A\u00103\"\u0005\b\u0092\u0001\u0010l\u00A8\u0006\u0094\u0001"}, d2 = {"Lcom/kakao/kphotopicker/PhotoPickerConfig;", "Landroid/os/Parcelable;", "", "maxCount", "remainCount", "totalCount", "Lcom/kakao/kphotopicker/loader/GalleryType;", "pickerType", "", "limitPhotoFileSize", "limitVideoFileSize", "", "isEnableImageGrid", "isOpeningThisKPhotoPickerToAddMoreImagesInImageGrid", "", "", "excludeMimeTypes", "totalImageCountLimitRes", "totalVideoCountLimitRes", "Lcom/kakao/kphotopicker/FileSizeToastType;", "videoFileSizeToastType", "serviceKey", "serviceDomain", "serviceReferrer", "serviceVersionName", "isEditorTrackerEnabled", "isDebugMode", "<init>", "(IIILcom/kakao/kphotopicker/loader/GalleryType;JJZZLjava/util/List;IILcom/kakao/kphotopicker/FileSizeToastType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "isEnabled", "", "editorTracker", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "buildIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "component1$kphotopicker_release", "()I", "component1", "component2$kphotopicker_release", "component2", "component3$kphotopicker_release", "component3", "component4", "()Lcom/kakao/kphotopicker/loader/GalleryType;", "component5", "()J", "component6", "component7", "()Z", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "()Lcom/kakao/kphotopicker/FileSizeToastType;", "component13$kphotopicker_release", "()Ljava/lang/String;", "component13", "component14$kphotopicker_release", "component14", "component15$kphotopicker_release", "component15", "component16$kphotopicker_release", "component16", "component17$kphotopicker_release", "component17", "component18", "copy", "(IIILcom/kakao/kphotopicker/loader/GalleryType;JJZZLjava/util/List;IILcom/kakao/kphotopicker/FileSizeToastType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/kakao/kphotopicker/PhotoPickerConfig;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "I", "getMaxCount$kphotopicker_release", "b", "getRemainCount$kphotopicker_release", "c", "getTotalCount$kphotopicker_release", "d", "Lcom/kakao/kphotopicker/loader/GalleryType;", "getPickerType", "setPickerType", "(Lcom/kakao/kphotopicker/loader/GalleryType;)V", "e", "J", "getLimitPhotoFileSize", "setLimitPhotoFileSize", "(J)V", "f", "getLimitVideoFileSize", "setLimitVideoFileSize", "g", "Z", "setEnableImageGrid", "(Z)V", "h", "setOpeningThisKPhotoPickerToAddMoreImagesInImageGrid", "i", "Ljava/util/List;", "getExcludeMimeTypes", "setExcludeMimeTypes", "(Ljava/util/List;)V", "j", "getTotalImageCountLimitRes", "setTotalImageCountLimitRes", "(I)V", "k", "getTotalVideoCountLimitRes", "setTotalVideoCountLimitRes", "l", "Lcom/kakao/kphotopicker/FileSizeToastType;", "getVideoFileSizeToastType", "setVideoFileSizeToastType", "(Lcom/kakao/kphotopicker/FileSizeToastType;)V", "m", "Ljava/lang/String;", "getServiceKey$kphotopicker_release", "setServiceKey$kphotopicker_release", "(Ljava/lang/String;)V", "n", "getServiceDomain$kphotopicker_release", "setServiceDomain$kphotopicker_release", "o", "getServiceReferrer$kphotopicker_release", "setServiceReferrer$kphotopicker_release", "p", "getServiceVersionName$kphotopicker_release", "setServiceVersionName$kphotopicker_release", "q", "isEditorTrackerEnabled$kphotopicker_release", "setEditorTrackerEnabled$kphotopicker_release", "r", "setDebugMode", "Companion", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class PhotoPickerConfig implements Parcelable {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/kphotopicker/PhotoPickerConfig$Companion;", "", "", "maxCount", "Lcom/kakao/kphotopicker/PhotoPickerConfig;", "create", "(I)Lcom/kakao/kphotopicker/PhotoPickerConfig;", "remainCount", "totalCount", "(II)Lcom/kakao/kphotopicker/PhotoPickerConfig;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PhotoPickerConfig create(int v) {
            return v <= 0 ? new PhotoPickerConfig(1, 0, 0, null, 0L, 0L, false, false, null, 0, 0, null, null, null, null, null, false, false, 0x3FFFE, null) : new PhotoPickerConfig(v, 0, 0, null, 0L, 0L, false, false, null, 0, 0, null, null, null, null, null, false, false, 0x3FFFE, null);
        }

        @NotNull
        public final PhotoPickerConfig create(int v, int v1) {
            return v <= 0 || v1 <= 0 ? new PhotoPickerConfig(1, 0, 0, null, 0L, 0L, false, false, null, 0, 0, null, null, null, null, null, false, false, 0x3FFF8, null) : new PhotoPickerConfig(1, v, v1, null, 0L, 0L, false, false, null, 0, 0, null, null, null, null, null, false, false, 0x3FFF8, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final PhotoPickerConfig createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            int v = parcel0.readInt();
            int v1 = parcel0.readInt();
            int v2 = parcel0.readInt();
            GalleryType galleryType0 = GalleryType.valueOf(parcel0.readString());
            long v3 = parcel0.readLong();
            long v4 = parcel0.readLong();
            boolean z = parcel0.readInt() != 0;
            boolean z1 = parcel0.readInt() != 0;
            ArrayList arrayList0 = parcel0.createStringArrayList();
            int v5 = parcel0.readInt();
            int v6 = parcel0.readInt();
            FileSizeToastType fileSizeToastType0 = FileSizeToastType.valueOf(parcel0.readString());
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            String s2 = parcel0.readString();
            String s3 = parcel0.readString();
            boolean z2 = parcel0.readInt() != 0;
            return parcel0.readInt() == 0 ? new PhotoPickerConfig(v, v1, v2, galleryType0, v3, v4, z, z1, arrayList0, v5, v6, fileSizeToastType0, s, s1, s2, s3, z2, false) : new PhotoPickerConfig(v, v1, v2, galleryType0, v3, v4, z, z1, arrayList0, v5, v6, fileSizeToastType0, s, s1, s2, s3, z2, true);
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final PhotoPickerConfig[] newArray(int v) {
            return new PhotoPickerConfig[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.newArray(v);
        }
    }

    @NotNull
    public static final Parcelable.Creator CREATOR;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final int b;
    public final int c;
    public GalleryType d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public List i;
    public int j;
    public int k;
    public FileSizeToastType l;
    public String m;
    public String n;
    public String o;
    public String p;
    public boolean q;
    public boolean r;

    static {
        PhotoPickerConfig.Companion = new Companion(null);
        PhotoPickerConfig.CREATOR = new Creator();
    }

    public PhotoPickerConfig() {
        this(0, 0, 0, null, 0L, 0L, false, false, null, 0, 0, null, null, null, null, null, false, false, 0x3FFFF, null);
    }

    public PhotoPickerConfig(int v, int v1, int v2, @NotNull GalleryType galleryType0, long v3, long v4, boolean z, boolean z1, @NotNull List list0, @StringRes int v5, @StringRes int v6, @NotNull FileSizeToastType fileSizeToastType0, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(galleryType0, "pickerType");
        Intrinsics.checkNotNullParameter(list0, "excludeMimeTypes");
        Intrinsics.checkNotNullParameter(fileSizeToastType0, "videoFileSizeToastType");
        Intrinsics.checkNotNullParameter(s, "serviceKey");
        Intrinsics.checkNotNullParameter(s1, "serviceDomain");
        Intrinsics.checkNotNullParameter(s2, "serviceReferrer");
        Intrinsics.checkNotNullParameter(s3, "serviceVersionName");
        super();
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = galleryType0;
        this.e = v3;
        this.f = v4;
        this.g = z;
        this.h = z1;
        this.i = list0;
        this.j = v5;
        this.k = v6;
        this.l = fileSizeToastType0;
        this.m = s;
        this.n = s1;
        this.o = s2;
        this.p = s3;
        this.q = z2;
        this.r = z3;
    }

    public PhotoPickerConfig(int v, int v1, int v2, GalleryType galleryType0, long v3, long v4, boolean z, boolean z1, List list0, int v5, int v6, FileSizeToastType fileSizeToastType0, String s, String s1, String s2, String s3, boolean z2, boolean z3, int v7, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v7 & 1) == 0 ? v : 1), ((v7 & 2) == 0 ? v1 : 0), ((v7 & 4) == 0 ? v2 : 0), ((v7 & 8) == 0 ? galleryType0 : GalleryType.AllMedia), ((v7 & 16) == 0 ? v3 : -1L), ((v7 & 0x20) == 0 ? v4 : -1L), ((v7 & 0x40) == 0 ? z : false), ((v7 & 0x80) == 0 ? z1 : false), ((v7 & 0x100) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v7 & 0x200) == 0 ? v5 : string.toast_image_limit_selection_once), ((v7 & 0x400) == 0 ? v6 : string.toast_video_limit_selection_total), ((v7 & 0x800) == 0 ? fileSizeToastType0 : FileSizeToastType.MB), ((v7 & 0x1000) == 0 ? s : ""), ((v7 & 0x2000) == 0 ? s1 : ""), ((v7 & 0x4000) == 0 ? s2 : ""), ((v7 & 0x8000) == 0 ? s3 : ""), ((v7 & 0x10000) == 0 ? z2 : true), ((v7 & 0x20000) == 0 ? z3 : false));
    }

    @NotNull
    public final Intent buildIntent(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intent intent0 = new Intent(context0, PhotoPickerActivity.class);
        intent0.putExtra("CONFIG", this);
        return intent0;
    }

    public final int component1$kphotopicker_release() {
        return this.a;
    }

    public final int component10() {
        return this.j;
    }

    public final int component11() {
        return this.k;
    }

    @NotNull
    public final FileSizeToastType component12() {
        return this.l;
    }

    @NotNull
    public final String component13$kphotopicker_release() {
        return this.m;
    }

    @NotNull
    public final String component14$kphotopicker_release() {
        return this.n;
    }

    @NotNull
    public final String component15$kphotopicker_release() {
        return this.o;
    }

    @NotNull
    public final String component16$kphotopicker_release() {
        return this.p;
    }

    public final boolean component17$kphotopicker_release() {
        return this.q;
    }

    public final boolean component18() {
        return this.r;
    }

    public final int component2$kphotopicker_release() {
        return this.b;
    }

    public final int component3$kphotopicker_release() {
        return this.c;
    }

    @NotNull
    public final GalleryType component4() {
        return this.d;
    }

    public final long component5() {
        return this.e;
    }

    public final long component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final boolean component8() {
        return this.h;
    }

    @NotNull
    public final List component9() {
        return this.i;
    }

    @NotNull
    public final PhotoPickerConfig copy(int v, int v1, int v2, @NotNull GalleryType galleryType0, long v3, long v4, boolean z, boolean z1, @NotNull List list0, @StringRes int v5, @StringRes int v6, @NotNull FileSizeToastType fileSizeToastType0, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(galleryType0, "pickerType");
        Intrinsics.checkNotNullParameter(list0, "excludeMimeTypes");
        Intrinsics.checkNotNullParameter(fileSizeToastType0, "videoFileSizeToastType");
        Intrinsics.checkNotNullParameter(s, "serviceKey");
        Intrinsics.checkNotNullParameter(s1, "serviceDomain");
        Intrinsics.checkNotNullParameter(s2, "serviceReferrer");
        Intrinsics.checkNotNullParameter(s3, "serviceVersionName");
        return new PhotoPickerConfig(v, v1, v2, galleryType0, v3, v4, z, z1, list0, v5, v6, fileSizeToastType0, s, s1, s2, s3, z2, z3);
    }

    public static PhotoPickerConfig copy$default(PhotoPickerConfig photoPickerConfig0, int v, int v1, int v2, GalleryType galleryType0, long v3, long v4, boolean z, boolean z1, List list0, int v5, int v6, FileSizeToastType fileSizeToastType0, String s, String s1, String s2, String s3, boolean z2, boolean z3, int v7, Object object0) {
        int v8 = (v7 & 1) == 0 ? v : photoPickerConfig0.a;
        int v9 = (v7 & 2) == 0 ? v1 : photoPickerConfig0.b;
        int v10 = (v7 & 4) == 0 ? v2 : photoPickerConfig0.c;
        GalleryType galleryType1 = (v7 & 8) == 0 ? galleryType0 : photoPickerConfig0.d;
        long v11 = (v7 & 16) == 0 ? v3 : photoPickerConfig0.e;
        long v12 = (v7 & 0x20) == 0 ? v4 : photoPickerConfig0.f;
        boolean z4 = (v7 & 0x40) == 0 ? z : photoPickerConfig0.g;
        boolean z5 = (v7 & 0x80) == 0 ? z1 : photoPickerConfig0.h;
        List list1 = (v7 & 0x100) == 0 ? list0 : photoPickerConfig0.i;
        int v13 = (v7 & 0x200) == 0 ? v5 : photoPickerConfig0.j;
        int v14 = (v7 & 0x400) == 0 ? v6 : photoPickerConfig0.k;
        FileSizeToastType fileSizeToastType1 = (v7 & 0x800) == 0 ? fileSizeToastType0 : photoPickerConfig0.l;
        String s4 = (v7 & 0x1000) == 0 ? s : photoPickerConfig0.m;
        String s5 = (v7 & 0x2000) == 0 ? s1 : photoPickerConfig0.n;
        String s6 = (v7 & 0x4000) == 0 ? s2 : photoPickerConfig0.o;
        String s7 = (v7 & 0x8000) == 0 ? s3 : photoPickerConfig0.p;
        boolean z6 = (v7 & 0x10000) == 0 ? z2 : photoPickerConfig0.q;
        return (v7 & 0x20000) == 0 ? photoPickerConfig0.copy(v8, v9, v10, galleryType1, v11, v12, z4, z5, list1, v13, v14, fileSizeToastType1, s4, s5, s6, s7, z6, z3) : photoPickerConfig0.copy(v8, v9, v10, galleryType1, v11, v12, z4, z5, list1, v13, v14, fileSizeToastType1, s4, s5, s6, s7, z6, photoPickerConfig0.r);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void editorTracker(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, boolean z) {
        Intrinsics.checkNotNullParameter(s, "serviceKey");
        Intrinsics.checkNotNullParameter(s1, "serviceDomain");
        Intrinsics.checkNotNullParameter(s2, "serviceReferrer");
        Intrinsics.checkNotNullParameter(s3, "serviceVersionName");
        this.m = s;
        this.n = s1;
        this.o = s2;
        this.p = s3;
        this.q = z;
    }

    public static void editorTracker$default(PhotoPickerConfig photoPickerConfig0, String s, String s1, String s2, String s3, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            s1 = "";
        }
        if((v & 4) != 0) {
            s2 = "";
        }
        if((v & 8) != 0) {
            s3 = "";
        }
        if((v & 16) != 0) {
            z = true;
        }
        photoPickerConfig0.editorTracker(s, s1, s2, s3, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PhotoPickerConfig)) {
            return false;
        }
        if(this.a != ((PhotoPickerConfig)object0).a) {
            return false;
        }
        if(this.b != ((PhotoPickerConfig)object0).b) {
            return false;
        }
        if(this.c != ((PhotoPickerConfig)object0).c) {
            return false;
        }
        if(this.d != ((PhotoPickerConfig)object0).d) {
            return false;
        }
        if(this.e != ((PhotoPickerConfig)object0).e) {
            return false;
        }
        if(this.f != ((PhotoPickerConfig)object0).f) {
            return false;
        }
        if(this.g != ((PhotoPickerConfig)object0).g) {
            return false;
        }
        if(this.h != ((PhotoPickerConfig)object0).h) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((PhotoPickerConfig)object0).i)) {
            return false;
        }
        if(this.j != ((PhotoPickerConfig)object0).j) {
            return false;
        }
        if(this.k != ((PhotoPickerConfig)object0).k) {
            return false;
        }
        if(this.l != ((PhotoPickerConfig)object0).l) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, ((PhotoPickerConfig)object0).m)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.n, ((PhotoPickerConfig)object0).n)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.o, ((PhotoPickerConfig)object0).o)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.p, ((PhotoPickerConfig)object0).p)) {
            return false;
        }
        return this.q == ((PhotoPickerConfig)object0).q ? this.r == ((PhotoPickerConfig)object0).r : false;
    }

    @NotNull
    public final List getExcludeMimeTypes() {
        return this.i;
    }

    public final long getLimitPhotoFileSize() {
        return this.e;
    }

    public final long getLimitVideoFileSize() {
        return this.f;
    }

    public final int getMaxCount$kphotopicker_release() {
        return this.a;
    }

    @NotNull
    public final GalleryType getPickerType() {
        return this.d;
    }

    public final int getRemainCount$kphotopicker_release() {
        return this.b;
    }

    @NotNull
    public final String getServiceDomain$kphotopicker_release() {
        return this.n;
    }

    @NotNull
    public final String getServiceKey$kphotopicker_release() {
        return this.m;
    }

    @NotNull
    public final String getServiceReferrer$kphotopicker_release() {
        return this.o;
    }

    @NotNull
    public final String getServiceVersionName$kphotopicker_release() {
        return this.p;
    }

    public final int getTotalCount$kphotopicker_release() {
        return this.c;
    }

    public final int getTotalImageCountLimitRes() {
        return this.j;
    }

    public final int getTotalVideoCountLimitRes() {
        return this.k;
    }

    @NotNull
    public final FileSizeToastType getVideoFileSizeToastType() {
        return this.l;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.r) + a.e(q.c(q.c(q.c(q.c((this.l.hashCode() + a.c(this.k, a.c(this.j, b.c(this.i, a.e(a.e(wb.a.k(this.f, wb.a.k(this.e, (this.d.hashCode() + a.c(this.c, a.c(this.b, this.a * 0x1F, 0x1F), 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F, this.g), 0x1F, this.h), 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F, this.m), 0x1F, this.n), 0x1F, this.o), 0x1F, this.p), 0x1F, this.q);
    }

    public final boolean isDebugMode() {
        return this.r;
    }

    public final boolean isEditorTrackerEnabled$kphotopicker_release() {
        return this.q;
    }

    public final boolean isEnableImageGrid() {
        return this.g;
    }

    public final boolean isOpeningThisKPhotoPickerToAddMoreImagesInImageGrid() {
        return this.h;
    }

    public final void setDebugMode(boolean z) {
        this.r = z;
    }

    public final void setEditorTrackerEnabled$kphotopicker_release(boolean z) {
        this.q = z;
    }

    public final void setEnableImageGrid(boolean z) {
        this.g = z;
    }

    public final void setExcludeMimeTypes(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.i = list0;
    }

    public final void setLimitPhotoFileSize(long v) {
        this.e = v;
    }

    public final void setLimitVideoFileSize(long v) {
        this.f = v;
    }

    public final void setOpeningThisKPhotoPickerToAddMoreImagesInImageGrid(boolean z) {
        this.h = z;
    }

    public final void setPickerType(@NotNull GalleryType galleryType0) {
        Intrinsics.checkNotNullParameter(galleryType0, "<set-?>");
        this.d = galleryType0;
    }

    public final void setServiceDomain$kphotopicker_release(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.n = s;
    }

    public final void setServiceKey$kphotopicker_release(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.m = s;
    }

    public final void setServiceReferrer$kphotopicker_release(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.o = s;
    }

    public final void setServiceVersionName$kphotopicker_release(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.p = s;
    }

    public final void setTotalImageCountLimitRes(int v) {
        this.j = v;
    }

    public final void setTotalVideoCountLimitRes(int v) {
        this.k = v;
    }

    public final void setVideoFileSizeToastType(@NotNull FileSizeToastType fileSizeToastType0) {
        Intrinsics.checkNotNullParameter(fileSizeToastType0, "<set-?>");
        this.l = fileSizeToastType0;
    }

    @Override
    @NotNull
    public String toString() {
        GalleryType galleryType0 = this.d;
        long v = this.e;
        long v1 = this.f;
        boolean z = this.g;
        boolean z1 = this.h;
        List list0 = this.i;
        int v2 = this.j;
        int v3 = this.k;
        FileSizeToastType fileSizeToastType0 = this.l;
        String s = this.m;
        String s1 = this.n;
        String s2 = this.o;
        boolean z2 = this.q;
        boolean z3 = this.r;
        String s3 = this.p;
        StringBuilder stringBuilder0 = new StringBuilder("PhotoPickerConfig(maxCount=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", remainCount=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", totalCount=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", pickerType=");
        stringBuilder0.append(galleryType0);
        stringBuilder0.append(", limitPhotoFileSize=");
        stringBuilder0.append(v);
        stringBuilder0.append(", limitVideoFileSize=");
        stringBuilder0.append(v1);
        stringBuilder0.append(", isEnableImageGrid=");
        stringBuilder0.append(z);
        stringBuilder0.append(", isOpeningThisKPhotoPickerToAddMoreImagesInImageGrid=");
        stringBuilder0.append(z1);
        stringBuilder0.append(", excludeMimeTypes=");
        stringBuilder0.append(list0);
        stringBuilder0.append(", totalImageCountLimitRes=");
        stringBuilder0.append(v2);
        stringBuilder0.append(", totalVideoCountLimitRes=");
        stringBuilder0.append(v3);
        stringBuilder0.append(", videoFileSizeToastType=");
        stringBuilder0.append(fileSizeToastType0);
        stringBuilder0.append(", serviceKey=");
        androidx.room.a.w(stringBuilder0, s, ", serviceDomain=", s1, ", serviceReferrer=");
        androidx.room.a.w(stringBuilder0, s2, ", serviceVersionName=", s3, ", isEditorTrackerEnabled=");
        stringBuilder0.append(z2);
        stringBuilder0.append(", isDebugMode=");
        stringBuilder0.append(z3);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "out");
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeString(this.d.name());
        parcel0.writeLong(this.e);
        parcel0.writeLong(this.f);
        parcel0.writeInt(((int)this.g));
        parcel0.writeInt(((int)this.h));
        parcel0.writeStringList(this.i);
        parcel0.writeInt(this.j);
        parcel0.writeInt(this.k);
        parcel0.writeString(this.l.name());
        parcel0.writeString(this.m);
        parcel0.writeString(this.n);
        parcel0.writeString(this.o);
        parcel0.writeString(this.p);
        parcel0.writeInt(((int)this.q));
        parcel0.writeInt(((int)this.r));
    }
}

