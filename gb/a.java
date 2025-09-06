package gb;

import com.kakao.editortracker.EditorTrackDomain;
import com.kakao.editortracker.EditorTrackerConfig.Builder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public static final a w;

    static {
        a.w = new a(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Builder)object0), "$this$$receiver");
        ((Builder)object0).setDebugMode(false);
        ((Builder)object0).setTrackDomain(EditorTrackDomain.Companion.from(((Builder)object0).isDebugMode()));
        ((Builder)object0).setEditorVersion("photos-android-");
        return Unit.INSTANCE;
    }
}

