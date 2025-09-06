package com.kakao.kphotopicker;

import com.kakao.kphotopicker.picker.MediaItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\n\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\n\u0010\rJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0012R#\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Lcom/kakao/kphotopicker/SelectedMediaManager;", "", "<init>", "()V", "", "clear", "Lcom/kakao/kphotopicker/picker/MediaItem;", "media", "addMedia", "(Lcom/kakao/kphotopicker/picker/MediaItem;)V", "deleteMedia", "", "index", "(I)V", "", "contains", "(Lcom/kakao/kphotopicker/picker/MediaItem;)Z", "getSelectionNo", "(Lcom/kakao/kphotopicker/picker/MediaItem;)Ljava/lang/Integer;", "getIndexOf", "", "", "a", "Ljava/util/Map;", "getSelectedMap", "()Ljava/util/Map;", "selectedMap", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectedMediaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectedMediaManager.kt\ncom/kakao/kphotopicker/SelectedMediaManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class SelectedMediaManager {
    public final LinkedHashMap a;

    public SelectedMediaManager() {
        this.a = new LinkedHashMap();
    }

    public final void addMedia(@NotNull MediaItem mediaItem0) {
        Intrinsics.checkNotNullParameter(mediaItem0, "media");
        Long long0 = mediaItem0.getId();
        this.a.put(long0, mediaItem0);
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(@NotNull MediaItem mediaItem0) {
        Intrinsics.checkNotNullParameter(mediaItem0, "media");
        Long long0 = mediaItem0.getId();
        return this.a.containsKey(long0);
    }

    public final void deleteMedia(int v) {
        if(v >= 0) {
            LinkedHashMap linkedHashMap0 = this.a;
            if(v < linkedHashMap0.size()) {
                linkedHashMap0.remove(((Number)CollectionsKt___CollectionsKt.toList(linkedHashMap0.keySet()).get(v)).longValue());
            }
        }
    }

    public final void deleteMedia(@NotNull MediaItem mediaItem0) {
        Intrinsics.checkNotNullParameter(mediaItem0, "media");
        Long long0 = mediaItem0.getId();
        this.a.remove(long0);
    }

    @Nullable
    public final Integer getIndexOf(@NotNull MediaItem mediaItem0) {
        Intrinsics.checkNotNullParameter(mediaItem0, "media");
        return this.a.containsKey(mediaItem0.getId()) ? CollectionsKt___CollectionsKt.indexOf(this.a.keySet(), mediaItem0.getId()) : null;
    }

    @NotNull
    public final Map getSelectedMap() {
        return this.a;
    }

    @Nullable
    public final Integer getSelectionNo(@NotNull MediaItem mediaItem0) {
        Intrinsics.checkNotNullParameter(mediaItem0, "media");
        Integer integer0 = this.getIndexOf(mediaItem0);
        return integer0 == null ? null : ((int)(((int)integer0) + 1));
    }
}

