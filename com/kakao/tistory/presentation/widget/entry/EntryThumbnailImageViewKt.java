package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import com.kakao.tistory.domain.entity.Thumbnail;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.ThumbnailType;
import com.kakao.tistory.presentation.common.utils.UrlUtils;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\'\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"EntryThumbnailImageView", "", "modifier", "Landroidx/compose/ui/Modifier;", "entryItem", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "type", "Lcom/kakao/tistory/presentation/common/ThumbnailType;", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/domain/entity/entry/EntryItem;Lcom/kakao/tistory/presentation/common/ThumbnailType;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryThumbnailImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryThumbnailImageView.kt\ncom/kakao/tistory/presentation/widget/entry/EntryThumbnailImageViewKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class EntryThumbnailImageViewKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ThumbnailType.values().length];
            try {
                arr_v[ThumbnailType.ORIGIN.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ThumbnailType.SMALL.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ThumbnailType.MEDIUM.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ThumbnailType.LARGE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Composable
    public static final void EntryThumbnailImageView(@Nullable Modifier modifier0, @NotNull EntryItem entryItem0, @NotNull ThumbnailType thumbnailType0, @Nullable Composer composer0, int v, int v1) {
        String s2;
        int v2;
        Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
        Intrinsics.checkNotNullParameter(thumbnailType0, "type");
        Composer composer1 = composer0.startRestartGroup(294064428);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(entryItem0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(thumbnailType0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294064428, v2, -1, "com.kakao.tistory.presentation.widget.entry.EntryThumbnailImageView (EntryThumbnailImageView.kt:15)");
            }
            Thumbnail thumbnail0 = entryItem0.getThumbnail();
            String s = null;
            if(thumbnail0 != null) {
                String s1 = thumbnail0.getOrigin();
                if(s1 == null) {
                label_32:
                    switch(WhenMappings.$EnumSwitchMapping$0[thumbnailType0.ordinal()]) {
                        case 1: {
                            s2 = thumbnail0.getOrigin();
                            break;
                        }
                        case 2: {
                            s2 = thumbnail0.getSmall();
                            break;
                        }
                        case 3: {
                            s2 = thumbnail0.getMedium();
                            break;
                        }
                        case 4: {
                            s2 = thumbnail0.getLarge();
                            break;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    s = s2;
                }
                else {
                    if(UrlUtils.INSTANCE.isGif(s1)) {
                        s = s1;
                    }
                    if(s == null) {
                        goto label_32;
                    }
                }
            }
            if(s != null) {
                CommonImageKt.CommonImage(s, null, modifier0, null, null, ContentScale.Companion.getCrop(), composer1, v2 << 6 & 0x380 | 0x30030, 24);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(modifier0, entryItem0, thumbnailType0, v, v1));
        }
    }
}

