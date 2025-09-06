package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.EntryRestrictType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toState", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainEntryRestrictTypeKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[EntryRestrictType.values().length];
            try {
                arr_v[EntryRestrictType.ADMIN_DELETE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EntryRestrictType.TEMPORARY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final RestrictType toState(@NotNull EntryRestrictType entryRestrictType0) {
        Intrinsics.checkNotNullParameter(entryRestrictType0, "<this>");
        switch(WhenMappings.$EnumSwitchMapping$0[entryRestrictType0.ordinal()]) {
            case 1: {
                return RestrictType.ADMIN_DELETE;
            }
            case 2: {
                return RestrictType.TEMPORARY;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

