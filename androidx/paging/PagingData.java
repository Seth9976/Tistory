package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s4.m0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u001E*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001EBE\b\u0000\u0012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0016\b\u0002\u0010\f\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000B0\n¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000BH\u0000¢\u0006\u0004\b\u000F\u0010\u0010R&\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0007\u001A\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\t\u001A\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Landroidx/paging/PagingData;", "", "T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PageEvent;", "flow", "Landroidx/paging/UiReceiver;", "uiReceiver", "Landroidx/paging/HintReceiver;", "hintReceiver", "Lkotlin/Function0;", "Landroidx/paging/PageEvent$Insert;", "cachedPageEvent", "<init>", "(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/UiReceiver;Landroidx/paging/HintReceiver;Lkotlin/jvm/functions/Function0;)V", "cachedEvent$paging_common_release", "()Landroidx/paging/PageEvent$Insert;", "cachedEvent", "a", "Lkotlinx/coroutines/flow/Flow;", "getFlow$paging_common_release", "()Lkotlinx/coroutines/flow/Flow;", "b", "Landroidx/paging/UiReceiver;", "getUiReceiver$paging_common_release", "()Landroidx/paging/UiReceiver;", "c", "Landroidx/paging/HintReceiver;", "getHintReceiver$paging_common_release", "()Landroidx/paging/HintReceiver;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PagingData {
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0004\u0010\tJ-\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJA\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000ER\u001A\u0010\u0010\u001A\u00020\u000F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0015\u001A\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/paging/PagingData$Companion;", "", "T", "Landroidx/paging/PagingData;", "empty", "()Landroidx/paging/PagingData;", "Landroidx/paging/LoadStates;", "sourceLoadStates", "mediatorLoadStates", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PagingData;", "", "data", "from", "(Ljava/util/List;)Landroidx/paging/PagingData;", "(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PagingData;", "Landroidx/paging/UiReceiver;", "NOOP_UI_RECEIVER", "Landroidx/paging/UiReceiver;", "getNOOP_UI_RECEIVER$paging_common_release", "()Landroidx/paging/UiReceiver;", "Landroidx/paging/HintReceiver;", "NOOP_HINT_RECEIVER", "Landroidx/paging/HintReceiver;", "getNOOP_HINT_RECEIVER$paging_common_release", "()Landroidx/paging/HintReceiver;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final PagingData empty() {
            return new PagingData(FlowKt.flowOf(new StaticList(CollectionsKt__CollectionsKt.emptyList(), null, null)), this.getNOOP_UI_RECEIVER$paging_common_release(), this.getNOOP_HINT_RECEIVER$paging_common_release(), u0.w);
        }

        @JvmOverloads
        @JvmStatic
        @NotNull
        public final PagingData empty(@NotNull LoadStates loadStates0) {
            Intrinsics.checkNotNullParameter(loadStates0, "sourceLoadStates");
            return Companion.empty$default(this, loadStates0, null, 2, null);
        }

        @JvmOverloads
        @JvmStatic
        @NotNull
        public final PagingData empty(@NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
            Intrinsics.checkNotNullParameter(loadStates0, "sourceLoadStates");
            return new PagingData(FlowKt.flowOf(new StaticList(CollectionsKt__CollectionsKt.emptyList(), loadStates0, loadStates1)), this.getNOOP_UI_RECEIVER$paging_common_release(), this.getNOOP_HINT_RECEIVER$paging_common_release(), new v0(loadStates0, loadStates1));
        }

        public static PagingData empty$default(Companion pagingData$Companion0, LoadStates loadStates0, LoadStates loadStates1, int v, Object object0) {
            if((v & 2) != 0) {
                loadStates1 = null;
            }
            return pagingData$Companion0.empty(loadStates0, loadStates1);
        }

        @JvmStatic
        @NotNull
        public final PagingData from(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "data");
            return new PagingData(FlowKt.flowOf(new StaticList(list0, null, null)), this.getNOOP_UI_RECEIVER$paging_common_release(), this.getNOOP_HINT_RECEIVER$paging_common_release(), new w0(list0));
        }

        @JvmOverloads
        @JvmStatic
        @NotNull
        public final PagingData from(@NotNull List list0, @NotNull LoadStates loadStates0) {
            Intrinsics.checkNotNullParameter(list0, "data");
            Intrinsics.checkNotNullParameter(loadStates0, "sourceLoadStates");
            return Companion.from$default(this, list0, loadStates0, null, 4, null);
        }

        @JvmOverloads
        @JvmStatic
        @NotNull
        public final PagingData from(@NotNull List list0, @NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
            Intrinsics.checkNotNullParameter(list0, "data");
            Intrinsics.checkNotNullParameter(loadStates0, "sourceLoadStates");
            return new PagingData(FlowKt.flowOf(new StaticList(list0, loadStates0, loadStates1)), this.getNOOP_UI_RECEIVER$paging_common_release(), this.getNOOP_HINT_RECEIVER$paging_common_release(), new x0(list0, loadStates0, loadStates1));
        }

        public static PagingData from$default(Companion pagingData$Companion0, List list0, LoadStates loadStates0, LoadStates loadStates1, int v, Object object0) {
            if((v & 4) != 0) {
                loadStates1 = null;
            }
            return pagingData$Companion0.from(list0, loadStates0, loadStates1);
        }

        @NotNull
        public final HintReceiver getNOOP_HINT_RECEIVER$paging_common_release() {
            return PagingData.f;
        }

        @NotNull
        public final UiReceiver getNOOP_UI_RECEIVER$paging_common_release() {
            return PagingData.e;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Flow a;
    public final UiReceiver b;
    public final HintReceiver c;
    public final Function0 d;
    public static final PagingData.Companion.NOOP_UI_RECEIVER.1 e;
    public static final PagingData.Companion.NOOP_HINT_RECEIVER.1 f;

    static {
        PagingData.Companion = new Companion(null);
        PagingData.e = new PagingData.Companion.NOOP_UI_RECEIVER.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        PagingData.f = new PagingData.Companion.NOOP_HINT_RECEIVER.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public PagingData(@NotNull Flow flow0, @NotNull UiReceiver uiReceiver0, @NotNull HintReceiver hintReceiver0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(flow0, "flow");
        Intrinsics.checkNotNullParameter(uiReceiver0, "uiReceiver");
        Intrinsics.checkNotNullParameter(hintReceiver0, "hintReceiver");
        Intrinsics.checkNotNullParameter(function00, "cachedPageEvent");
        super();
        this.a = flow0;
        this.b = uiReceiver0;
        this.c = hintReceiver0;
        this.d = function00;
    }

    public PagingData(Flow flow0, UiReceiver uiReceiver0, HintReceiver hintReceiver0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            function00 = m0.y;
        }
        this(flow0, uiReceiver0, hintReceiver0, function00);
    }

    @Nullable
    public final Insert cachedEvent$paging_common_release() {
        return (Insert)this.d.invoke();
    }

    @JvmStatic
    @NotNull
    public static final PagingData empty() {
        return PagingData.Companion.empty();
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final PagingData empty(@NotNull LoadStates loadStates0) {
        return PagingData.Companion.empty(loadStates0);
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final PagingData empty(@NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
        return PagingData.Companion.empty(loadStates0, loadStates1);
    }

    @JvmStatic
    @NotNull
    public static final PagingData from(@NotNull List list0) {
        return PagingData.Companion.from(list0);
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final PagingData from(@NotNull List list0, @NotNull LoadStates loadStates0) {
        return PagingData.Companion.from(list0, loadStates0);
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final PagingData from(@NotNull List list0, @NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
        return PagingData.Companion.from(list0, loadStates0, loadStates1);
    }

    @NotNull
    public final Flow getFlow$paging_common_release() {
        return this.a;
    }

    @NotNull
    public final HintReceiver getHintReceiver$paging_common_release() {
        return this.c;
    }

    @NotNull
    public final UiReceiver getUiReceiver$paging_common_release() {
        return this.b;
    }
}

