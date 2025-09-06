package com.kakao.tistory.presentation.screen.blog.common.ui;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function3 {
    public final EntryVisibilityType a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final List f;
    public final Function1 g;
    public final Function0 h;
    public final MutableState i;

    public d(EntryVisibilityType entryVisibilityType0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, List list0, Function1 function10, Function0 function04, MutableState mutableState0) {
        this.a = entryVisibilityType0;
        this.b = function00;
        this.c = function01;
        this.d = function02;
        this.e = function03;
        this.f = list0;
        this.g = function10;
        this.h = function04;
        this.i = mutableState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$TistoryComposeBottomSheet");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3E2FB25F, v, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.BlogEntryModifyBottomSheet.<anonymous> (BlogEntryModifyBottomSheet.kt:43)");
        }
        switch(BlogEntryModifyBottomSheetKt.BlogEntryModifyBottomSheet.1.WhenMappings.$EnumSwitchMapping$0[BlogEntryModifyBottomSheetKt.access$BlogEntryModifyBottomSheet$lambda$1(this.i).ordinal()]) {
            case 1: {
                ((Composer)object1).startReplaceGroup(740721113);
                EntryVisibilityType entryVisibilityType0 = this.a;
                ((Composer)object1).startReplaceGroup(0xE8A67318);
                MutableState mutableState0 = this.i;
                b b0 = ((Composer)object1).rememberedValue();
                if(b0 == Composer.Companion.getEmpty()) {
                    b0 = new b(mutableState0);
                    ((Composer)object1).updateRememberedValue(b0);
                }
                ((Composer)object1).endReplaceGroup();
                BlogEntryModifyBottomSheetKt.access$BlogEntryModifyTop(entryVisibilityType0, b0, this.b, this.c, this.d, this.e, ((Composer)object1), 0x30);
                ((Composer)object1).endReplaceGroup();
                break;
            }
            case 2: {
                ((Composer)object1).startReplaceGroup(0x2C2E039B);
                EntryVisibilityType entryVisibilityType1 = this.a;
                List list0 = this.f;
                ((Composer)object1).startReplaceGroup(0xE8A6B6E6);
                MutableState mutableState1 = this.i;
                c c0 = ((Composer)object1).rememberedValue();
                if(c0 == Composer.Companion.getEmpty()) {
                    c0 = new c(mutableState1);
                    ((Composer)object1).updateRememberedValue(c0);
                }
                ((Composer)object1).endReplaceGroup();
                BlogEntryModifyBottomSheetKt.access$BlogEntryModifyVisibility(entryVisibilityType1, list0, c0, this.g, this.h, this.e, ((Composer)object1), 0x1C0);
                ((Composer)object1).endReplaceGroup();
                break;
            }
            default: {
                ((Composer)object1).startReplaceGroup(0x2C338C0A);
                ((Composer)object1).endReplaceGroup();
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

