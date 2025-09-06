package jb;

import com.kakao.editortracker.EditorTrackDomain;
import com.kakao.editortracker.EditorTrackerConfig.Builder;
import com.kakao.kphotopicker.PhotoPickerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final boolean w;
    public final PhotoPickerActivity x;

    public e(boolean z, PhotoPickerActivity photoPickerActivity0) {
        this.w = z;
        this.x = photoPickerActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Builder)object0), "$this$$receiver");
        ((Builder)object0).setDebugMode(this.w);
        ((Builder)object0).setTrackDomain(EditorTrackDomain.Companion.from(this.w));
        ((Builder)object0).setEditorVersion("picker-android-0.21.0");
        ((Builder)object0).setTrackEnabled(this.x.h().getConfig().isEditorTrackerEnabled$kphotopicker_release());
        return Unit.INSTANCE;
    }
}

