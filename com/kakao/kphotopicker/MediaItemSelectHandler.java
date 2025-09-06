package com.kakao.kphotopicker;

import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0012\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\b2\u0018\u0010\u000E\u001A\u0014\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\u000F2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\r0\u000FH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/kphotopicker/MediaItemSelectHandler;", "Lcom/kakao/kphotopicker/ItemSelectHandler;", "Lcom/kakao/kphotopicker/PickerViewModel;", "pickerViewModel", "Lcom/kakao/kphotopicker/SelectedMediaManager;", "selectedMediaManager", "<init>", "(Lcom/kakao/kphotopicker/PickerViewModel;Lcom/kakao/kphotopicker/SelectedMediaManager;)V", "Lcom/kakao/kphotopicker/picker/MediaItem;", "item", "Lkotlin/Function2;", "", "", "", "onSizeOver", "Lkotlin/Function0;", "onCountOver", "onSuccess", "addMediaItem", "(Lcom/kakao/kphotopicker/picker/MediaItem;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MediaItemSelectHandler implements ItemSelectHandler {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[FileSizeToastType.values().length];
            try {
                arr_v[FileSizeToastType.MB.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FileSizeToastType.GB.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final PickerViewModel a;
    public final SelectedMediaManager b;

    public MediaItemSelectHandler(@NotNull PickerViewModel pickerViewModel0, @NotNull SelectedMediaManager selectedMediaManager0) {
        Intrinsics.checkNotNullParameter(pickerViewModel0, "pickerViewModel");
        Intrinsics.checkNotNullParameter(selectedMediaManager0, "selectedMediaManager");
        super();
        this.a = pickerViewModel0;
        this.b = selectedMediaManager0;
    }

    @Override  // com.kakao.kphotopicker.ItemSelectHandler
    public void addMediaItem(@NotNull MediaItem mediaItem0, @NotNull Function2 function20, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(mediaItem0, "item");
        Intrinsics.checkNotNullParameter(function20, "onSizeOver");
        Intrinsics.checkNotNullParameter(function00, "onCountOver");
        Intrinsics.checkNotNullParameter(function01, "onSuccess");
        PickerViewModel pickerViewModel0 = this.a;
        if(mediaItem0 instanceof Photo && !pickerViewModel0.isValidPhotoSize(((Photo)mediaItem0).getFileSize())) {
            function20.invoke(string.toast_photo_reach_limited, ((long)(pickerViewModel0.getLimitPhotoFileSize() / 0x100000L)));
            return;
        }
        if(mediaItem0 instanceof Video && !pickerViewModel0.isValidVideoSize(((Video)mediaItem0).getFileSize())) {
            switch(WhenMappings.$EnumSwitchMapping$0[pickerViewModel0.getConfig().getVideoFileSizeToastType().ordinal()]) {
                case 1: {
                    function20.invoke(string.kphotopicker_file_size_mb, ((long)(pickerViewModel0.getLimitVideoFileSize() / 0x100000L)));
                    return;
                }
                case 2: {
                    function20.invoke(string.kphotopicker_file_size_gb, ((long)(pickerViewModel0.getLimitVideoFileSize() / 0x40000000L)));
                    return;
                }
                default: {
                    return;
                }
            }
        }
        if(!pickerViewModel0.allowMediaAdd()) {
            function00.invoke();
            return;
        }
        this.b.addMedia(mediaItem0);
        function01.invoke();
    }
}

