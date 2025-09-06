package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.core.os.HandlerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s1.d;
import s1.e;
import s1.i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\t\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\nJ\r\u0010\f\u001A\u00020\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\rR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerManager;", "", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "<init>", "(Landroidx/compose/ui/graphics/CanvasHolder;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "", "persist", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "release", "destroy", "()V", "", "hasImageReader", "()Z", "updateLayerPersistence", "a", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayerManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,168:1\n1580#2:169\n1#3:170\n47#4,3:171\n50#4,2:201\n267#5,4:174\n237#5,7:178\n248#5,3:186\n251#5,2:190\n272#5,2:192\n254#5,6:194\n274#5:200\n1810#6:185\n1672#6:189\n305#7,6:203\n*S KotlinDebug\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n*L\n82#1:169\n123#1:171,3\n123#1:201,2\n126#1:174,4\n126#1:178,7\n126#1:186,3\n126#1:190,2\n126#1:192,2\n126#1:194,6\n126#1:200\n126#1:185\n126#1:189\n132#1:203,6\n*E\n"})
public final class LayerManager {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0003\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerManager$Companion;", "", "", "isRobolectric", "Z", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final boolean isRobolectric() {
            return false;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final CanvasHolder a;
    public final MutableScatterSet b;
    public ImageReader c;
    public final Handler d;
    public MutableObjectList e;
    public boolean f;
    public static final boolean g;

    static {
        LayerManager.Companion = new Companion(null);
        Intrinsics.checkNotNullExpressionValue("google/sunfish/sunfish:13/tq2a.230405.003/9719927:user/release-keys", "this as java.lang.String).toLowerCase(Locale.ROOT)");
        LayerManager.g = Intrinsics.areEqual("google/sunfish/sunfish:13/tq2a.230405.003/9719927:user/release-keys", "robolectric");
    }

    public LayerManager(@NotNull CanvasHolder canvasHolder0) {
        this.a = canvasHolder0;
        this.b = ScatterSetKt.mutableScatterSetOf();
        this.d = HandlerCompat.createAsync(Looper.getMainLooper(), new e(this));
    }

    public final void a(ScatterSet scatterSet0) {
        if(scatterSet0.isNotEmpty() && !LayerManager.g) {
            ImageReader imageReader0 = this.c;
            if(imageReader0 == null) {
                imageReader0 = ImageReader.newInstance(1, 1, 1, 3);
                imageReader0.setOnImageAvailableListener(new d(), this.d);  // 初始化器: Ljava/lang/Object;-><init>()V
                this.c = imageReader0;
            }
            Surface surface0 = imageReader0.getSurface();
            Canvas canvas0 = i.a.a(surface0);
            this.f = true;
            CanvasHolder canvasHolder0 = this.a;
            Canvas canvas1 = canvasHolder0.getAndroidCanvas().getInternalCanvas();
            canvasHolder0.getAndroidCanvas().setInternalCanvas(canvas0);
            AndroidCanvas androidCanvas0 = canvasHolder0.getAndroidCanvas();
            canvas0.save();
            canvas0.clipRect(0, 0, 1, 1);
            Object[] arr_object = scatterSet0.elements;
            long[] arr_v = scatterSet0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_31;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((v2 & 0xFFL) < 0x80L) {
                            ((GraphicsLayer)arr_object[(v1 << 3) + v4]).drawForPersistence$ui_graphics_release(androidCanvas0);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                    label_31:
                        if(v1 != v) {
                            ++v1;
                            continue;
                        }
                    }
                    goto label_34;
                }
            }
            else {
            label_34:
                canvas0.restore();
                canvasHolder0.getAndroidCanvas().setInternalCanvas(canvas1);
                this.f = false;
                MutableObjectList mutableObjectList0 = this.e;
                if(mutableObjectList0 != null && mutableObjectList0.isNotEmpty()) {
                    Object[] arr_object1 = mutableObjectList0.content;
                    int v5 = mutableObjectList0._size;
                    for(int v6 = 0; v6 < v5; ++v6) {
                        this.release(((GraphicsLayer)arr_object1[v6]));
                    }
                    mutableObjectList0.clear();
                }
            }
            surface0.unlockCanvasAndPost(canvas0);
        }
    }

    public static final boolean access$isRobolectric$cp() [...] // 潜在的解密器

    public final void destroy() {
        ImageReader imageReader0 = this.c;
        if(imageReader0 != null) {
            imageReader0.close();
        }
        this.c = null;
    }

    @NotNull
    public final CanvasHolder getCanvasHolder() {
        return this.a;
    }

    public final boolean hasImageReader() {
        return this.c != null;
    }

    public final void persist(@NotNull GraphicsLayer graphicsLayer0) {
        this.b.add(graphicsLayer0);
        Handler handler0 = this.d;
        if(!handler0.hasMessages(0)) {
            handler0.sendMessageAtFrontOfQueue(Message.obtain());
        }
    }

    public final void release(@NotNull GraphicsLayer graphicsLayer0) {
        if(this.f) {
            MutableObjectList mutableObjectList0 = this.e;
            if(mutableObjectList0 == null) {
                mutableObjectList0 = new MutableObjectList(0, 1, null);
                this.e = mutableObjectList0;
            }
            mutableObjectList0.add(graphicsLayer0);
        }
        else if(this.b.remove(graphicsLayer0)) {
            graphicsLayer0.discardDisplayList$ui_graphics_release();
        }
    }

    public final void updateLayerPersistence() {
        this.destroy();
        this.a(this.b);
    }
}

