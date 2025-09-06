package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\f\u001A\u00020\t¢\u0006\u0004\b\f\u0010\u0003R+\u0010\u0013\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00048F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u000B¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeGroupState;", "", "<init>", "()V", "", "index", "", "isCurrentIndex", "(I)Z", "", "updateIndex", "(I)V", "clearSwipe", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getCurrentIndex", "()I", "setCurrentIndex", "currentIndex", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableItem.kt\ncom/kakao/tistory/presentation/widget/swipe/CommonSwipeGroupState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,239:1\n81#2:240\n107#2,2:241\n*S KotlinDebug\n*F\n+ 1 SwipeableItem.kt\ncom/kakao/tistory/presentation/widget/swipe/CommonSwipeGroupState\n*L\n140#1:240\n140#1:241,2\n*E\n"})
public final class CommonSwipeGroupState {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeGroupState$Companion;", "", "", "NOTHING", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final MutableState a;

    static {
        CommonSwipeGroupState.Companion = new Companion(null);
    }

    public CommonSwipeGroupState() {
        this.a = SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
    }

    public final void clearSwipe() {
        this.setCurrentIndex(-1);
    }

    public final int getCurrentIndex() {
        return ((Number)this.a.getValue()).intValue();
    }

    public final boolean isCurrentIndex(int v) {
        return this.getCurrentIndex() == v;
    }

    public final void setCurrentIndex(int v) {
        this.a.setValue(v);
    }

    public final void updateIndex(int v) {
        if(!this.isCurrentIndex(v)) {
            this.setCurrentIndex(v);
        }
    }
}

