package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\"\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "computeScaleFactor", "Landroidx/compose/ui/layout/ScaleFactor;", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeScaleFactor-H7hwNQA", "(JJ)J", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ContentScale {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R \u0010\r\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001A\u0004\b\u000B\u0010\u0006R \u0010\u0011\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000E\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001A\u0004\b\u000F\u0010\u0006R \u0010\u0015\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001A\u0004\b\u0013\u0010\u0006R \u0010\u0019\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001A\u0004\b\u0017\u0010\u0006R \u0010 \u001A\u00020\u001A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u0012\u0004\b\u001F\u0010\b\u001A\u0004\b\u001D\u0010\u001ER \u0010$\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0004\u0012\u0004\b#\u0010\b\u001A\u0004\b\"\u0010\u0006¨\u0006%"}, d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "Landroidx/compose/ui/layout/ContentScale;", "b", "Landroidx/compose/ui/layout/ContentScale;", "getCrop", "()Landroidx/compose/ui/layout/ContentScale;", "getCrop$annotations", "()V", "Crop", "c", "getFit", "getFit$annotations", "Fit", "d", "getFillHeight", "getFillHeight$annotations", "FillHeight", "e", "getFillWidth", "getFillWidth$annotations", "FillWidth", "f", "getInside", "getInside$annotations", "Inside", "Landroidx/compose/ui/layout/FixedScale;", "g", "Landroidx/compose/ui/layout/FixedScale;", "getNone", "()Landroidx/compose/ui/layout/FixedScale;", "getNone$annotations", "None", "h", "getFillBounds", "getFillBounds$annotations", "FillBounds", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final ContentScale.Companion.Crop.1 b;
        public static final ContentScale.Companion.Fit.1 c;
        public static final ContentScale.Companion.FillHeight.1 d;
        public static final ContentScale.Companion.FillWidth.1 e;
        public static final ContentScale.Companion.Inside.1 f;
        public static final FixedScale g;
        public static final ContentScale.Companion.FillBounds.1 h;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new ContentScale.Companion.Crop.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.c = new ContentScale.Companion.Fit.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.d = new ContentScale.Companion.FillHeight.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.e = new ContentScale.Companion.FillWidth.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.f = new ContentScale.Companion.Inside.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.g = new FixedScale(1.0f);
            Companion.h = new ContentScale.Companion.FillBounds.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final ContentScale getCrop() {
            return Companion.b;
        }

        @Stable
        public static void getCrop$annotations() {
        }

        @NotNull
        public final ContentScale getFillBounds() {
            return Companion.h;
        }

        @Stable
        public static void getFillBounds$annotations() {
        }

        @NotNull
        public final ContentScale getFillHeight() {
            return Companion.d;
        }

        @Stable
        public static void getFillHeight$annotations() {
        }

        @NotNull
        public final ContentScale getFillWidth() {
            return Companion.e;
        }

        @Stable
        public static void getFillWidth$annotations() {
        }

        @NotNull
        public final ContentScale getFit() {
            return Companion.c;
        }

        @Stable
        public static void getFit$annotations() {
        }

        @NotNull
        public final ContentScale getInside() {
            return Companion.f;
        }

        @Stable
        public static void getInside$annotations() {
        }

        @NotNull
        public final FixedScale getNone() {
            return Companion.g;
        }

        @Stable
        public static void getNone$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        ContentScale.Companion = Companion.a;
    }

    long computeScaleFactor-H7hwNQA(long arg1, long arg2);
}

