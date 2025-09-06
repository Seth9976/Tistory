package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Registry;
import androidx.constraintlayout.core.state.RegistryCallback;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001B\u0010\f\u001A\u00020\u00062\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0006H\u0004¢\u0006\u0004\b\u000E\u0010\bJ\u0015\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u000F\u0010\u0005J\r\u0010\u0010\u001A\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001A\u00020\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u000F\u0010\u0014\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\r\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u001B\u0010\u001AJ\u0017\u0010\u001D\u001A\u00020\u00062\u0006\u0010\u001C\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001D\u0010\u0005J\r\u0010\u001E\u001A\u00020\u0002¢\u0006\u0004\b\u001E\u0010\u0011J\u000F\u0010 \u001A\u00020\u001FH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002H\u0014¢\u0006\u0004\b\"\u0010\u0005J\u0017\u0010%\u001A\u00020\u00062\u0006\u0010$\u001A\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u001D\u0010)\u001A\u00020\u00062\u0006\u0010\'\u001A\u00020\u00182\u0006\u0010(\u001A\u00020\u0018¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001A\u00020\u00062\u0006\u0010+\u001A\u00020\u0018H\u0004¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001A\u00020\u00062\u0006\u0010.\u001A\u00020\u0018H\u0004¢\u0006\u0004\b/\u0010-¨\u00060"}, d2 = {"Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "", "content", "<init>", "(Ljava/lang/String;)V", "", "initialization", "()V", "Landroidx/compose/runtime/MutableState;", "", "needsUpdate", "setUpdateFlag", "(Landroidx/compose/runtime/MutableState;)V", "signalUpdate", "setCurrentContent", "getCurrentContent", "()Ljava/lang/String;", "name", "setDebugName", "getDebugName", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "getForcedDrawDebug", "()Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "", "getForcedWidth", "()I", "getForcedHeight", "information", "setLayoutInformation", "getLayoutInformation", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "getLayoutInformationMode", "()Landroidx/constraintlayout/compose/LayoutInfoFlags;", "onNewContent", "", "progress", "onNewProgress", "(F)V", "width", "height", "onNewDimensions", "(II)V", "mode", "onLayoutInformation", "(I)V", "debugMode", "onDrawDebug", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@PublishedApi
public abstract class EditableJSONLayout implements LayoutInformationReceiver {
    public int a;
    public int b;
    public MotionLayoutDebugFlags c;
    public MutableState d;
    public LayoutInfoFlags e;
    public String f;
    public long g;
    public String h;
    public String i;

    public EditableJSONLayout(@Language("json5") @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "content");
        super();
        this.a = 0x80000000;
        this.b = 0x80000000;
        this.c = MotionLayoutDebugFlags.UNKNOWN;
        this.e = LayoutInfoFlags.NONE;
        this.f = "";
        this.g = System.nanoTime();
        this.i = s;
    }

    public static final String access$getCurrentContent$p(EditableJSONLayout editableJSONLayout0) {
        return editableJSONLayout0.i;
    }

    @NotNull
    public final String getCurrentContent() {
        return this.i;
    }

    @Nullable
    public final String getDebugName() {
        return this.h;
    }

    @NotNull
    public final MotionLayoutDebugFlags getForcedDrawDebug() {
        return this.c;
    }

    @Override  // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedHeight() {
        return this.b;
    }

    @Override  // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedWidth() {
        return this.a;
    }

    @NotNull
    public final String getLayoutInformation() {
        return this.f;
    }

    @Override  // androidx.constraintlayout.compose.LayoutInformationReceiver
    @NotNull
    public LayoutInfoFlags getLayoutInformationMode() {
        return this.e;
    }

    public final void initialization() {
        try {
            this.onNewContent(this.i);
            if(this.h != null) {
                androidx.constraintlayout.compose.EditableJSONLayout.initialization.callback.1 editableJSONLayout$initialization$callback$10 = new RegistryCallback() {
                    public final EditableJSONLayout a;

                    {
                        this.a = editableJSONLayout0;
                    }

                    @Override  // androidx.constraintlayout.core.state.RegistryCallback
                    @NotNull
                    public String currentLayoutInformation() {
                        return this.a.f;
                    }

                    @Override  // androidx.constraintlayout.core.state.RegistryCallback
                    @NotNull
                    public String currentMotionScene() {
                        return EditableJSONLayout.access$getCurrentContent$p(this.a);
                    }

                    @Override  // androidx.constraintlayout.core.state.RegistryCallback
                    public long getLastModified() {
                        return this.a.g;
                    }

                    @Override  // androidx.constraintlayout.core.state.RegistryCallback
                    public void onDimensions(int v, int v1) {
                        this.a.onNewDimensions(v, v1);
                    }

                    @Override  // androidx.constraintlayout.core.state.RegistryCallback
                    public void onNewMotionScene(@Nullable String s) {
                        if(s == null) {
                            return;
                        }
                        this.a.onNewContent(s);
                    }

                    @Override  // androidx.constraintlayout.core.state.RegistryCallback
                    public void onProgress(float f) {
                        this.a.onNewProgress(f);
                    }

                    @Override  // androidx.constraintlayout.core.state.RegistryCallback
                    public void setDrawDebug(int v) {
                        this.a.onDrawDebug(v);
                    }

                    @Override  // androidx.constraintlayout.core.state.RegistryCallback
                    public void setLayoutInformationMode(int v) {
                        this.a.onLayoutInformation(v);
                    }
                };
                Registry.getInstance().register(this.h, editableJSONLayout$initialization$callback$10);
            }
        }
        catch(CLParsingException unused_ex) {
        }
    }

    public final void onDrawDebug(int v) {
        if(v == -1) {
            this.c = MotionLayoutDebugFlags.UNKNOWN;
        }
        else {
            MotionLayoutDebugFlags motionLayoutDebugFlags0 = MotionLayoutDebugFlags.UNKNOWN;
            if(v == motionLayoutDebugFlags0.ordinal()) {
                this.c = motionLayoutDebugFlags0;
            }
            else {
                MotionLayoutDebugFlags motionLayoutDebugFlags1 = MotionLayoutDebugFlags.NONE;
                if(v == motionLayoutDebugFlags1.ordinal()) {
                    this.c = motionLayoutDebugFlags1;
                }
                else {
                    MotionLayoutDebugFlags motionLayoutDebugFlags2 = MotionLayoutDebugFlags.SHOW_ALL;
                    if(v == motionLayoutDebugFlags2.ordinal()) {
                        this.c = motionLayoutDebugFlags2;
                    }
                }
            }
        }
        this.signalUpdate();
    }

    public final void onLayoutInformation(int v) {
        LayoutInfoFlags layoutInfoFlags0 = LayoutInfoFlags.NONE;
        if(v == layoutInfoFlags0.ordinal()) {
            this.e = layoutInfoFlags0;
        }
        else {
            LayoutInfoFlags layoutInfoFlags1 = LayoutInfoFlags.BOUNDS;
            if(v == layoutInfoFlags1.ordinal()) {
                this.e = layoutInfoFlags1;
            }
        }
        this.signalUpdate();
    }

    public void onNewContent(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "content");
        this.i = s;
        try {
            CLObject cLObject0 = CLParser.parse(s);
            if(cLObject0 != null) {
                boolean z = this.h == null;
                if(z) {
                    CLObject cLObject1 = cLObject0.getObjectOrNull("Header");
                    if(cLObject1 != null) {
                        this.h = cLObject1.getStringOrNull("exportAs");
                    }
                }
                if(!z) {
                    this.signalUpdate();
                }
            }
        }
        catch(CLParsingException | Exception unused_ex) {
        }
    }

    public final void onNewDimensions(int v, int v1) {
        this.a = v;
        this.b = v1;
        this.signalUpdate();
    }

    public void onNewProgress(float f) {
    }

    public final void setCurrentContent(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "content");
        this.onNewContent(s);
    }

    public final void setDebugName(@Nullable String s) {
        this.h = s;
    }

    @Override  // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setLayoutInformation(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "information");
        this.g = System.nanoTime();
        this.f = s;
    }

    public final void setUpdateFlag(@NotNull MutableState mutableState0) {
        Intrinsics.checkNotNullParameter(mutableState0, "needsUpdate");
        this.d = mutableState0;
    }

    public final void signalUpdate() {
        MutableState mutableState0 = this.d;
        if(mutableState0 != null) {
            Intrinsics.checkNotNull(mutableState0);
            MutableState mutableState1 = this.d;
            Intrinsics.checkNotNull(mutableState1);
            mutableState0.setValue(((long)(((Number)mutableState1.getValue()).longValue() + 1L)));
        }
    }
}

