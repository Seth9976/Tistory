package com.kakao.kphotopicker;

import com.kakao.kphotopicker.picker.MediaItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JL\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u001A\b\u0002\u0010\u0006\u001A\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00072\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u000B2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00030\u000BH&¨\u0006\r"}, d2 = {"Lcom/kakao/kphotopicker/ItemSelectHandler;", "", "addMediaItem", "", "item", "Lcom/kakao/kphotopicker/picker/MediaItem;", "onSizeOver", "Lkotlin/Function2;", "", "", "onCountOver", "Lkotlin/Function0;", "onSuccess", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ItemSelectHandler {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void addMediaItem$default(ItemSelectHandler itemSelectHandler0, MediaItem mediaItem0, Function2 function20, Function0 function00, Function0 function01, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMediaItem");
            }
            if((v & 2) != 0) {
                function20 = a.w;
            }
            if((v & 4) != 0) {
                function00 = b.w;
            }
            if((v & 8) != 0) {
                function01 = c.w;
            }
            itemSelectHandler0.addMediaItem(mediaItem0, function20, function00, function01);
        }
    }

    void addMediaItem(@NotNull MediaItem arg1, @NotNull Function2 arg2, @NotNull Function0 arg3, @NotNull Function0 arg4);
}

