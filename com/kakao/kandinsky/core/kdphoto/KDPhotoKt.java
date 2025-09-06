package com.kakao.kandinsky.core.kdphoto;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.PersistentList.Builder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A#\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"updateDecoration", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "no", "", "decoration", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Ljava/lang/Integer;Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;)Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "kdphoto_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKDPhoto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDPhoto.kt\ncom/kakao/kandinsky/core/kdphoto/KDPhotoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n350#2,7:81\n*S KotlinDebug\n*F\n+ 1 KDPhoto.kt\ncom/kakao/kandinsky/core/kdphoto/KDPhotoKt\n*L\n65#1:81,7\n*E\n"})
public final class KDPhotoKt {
    @NotNull
    public static final KDPhoto updateDecoration(@NotNull KDPhoto kDPhoto0, @Nullable Integer integer0, @Nullable Absolute decoration$Absolute0) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "<this>");
        int v = 0;
        Iterator iterator0 = kDPhoto0.getDecorationList().iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                v = -1;
                break;
            }
            Object object0 = iterator0.next();
            if(integer0 != null && ((Absolute)object0).getNo() == ((int)integer0)) {
                break;
            }
            ++v;
        }
        if(v >= 0) {
            if(decoration$Absolute0 != null) {
                Builder persistentList$Builder0 = kDPhoto0.getDecorationList().builder();
                persistentList$Builder0.remove(v);
                persistentList$Builder0.add(decoration$Absolute0);
                return KDPhoto.copy-2Ycw6ww$default(kDPhoto0, null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, persistentList$Builder0.build(), null, null, 0x37FF, null);
            }
            return KDPhoto.copy-2Ycw6ww$default(kDPhoto0, null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, kDPhoto0.getDecorationList().removeAt(v), null, null, 0x37FF, null);
        }
        return decoration$Absolute0 == null ? KDPhoto.copy-2Ycw6ww$default(kDPhoto0, null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, kDPhoto0.getDecorationList(), null, null, 0x37FF, null) : KDPhoto.copy-2Ycw6ww$default(kDPhoto0, null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, kDPhoto0.getDecorationList().add(decoration$Absolute0), null, null, 0x37FF, null);
    }
}

