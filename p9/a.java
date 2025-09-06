package p9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.Listener.switchAccessListener.1;
import androidx.compose.material3.internal.Listener.touchExplorationListener.1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import com.kakao.kandinsky.base.contract.DialogUiState;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.crop.CropScreenKt;
import com.kakao.kandinsky.crop.contract.TouchCirclePoint;
import com.kakao.kandinsky.crop.contract.TouchLinePoint;
import com.kakao.kandinsky.crop.ui.CropBoxKt;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import com.kakao.kandinsky.signature.ui.SignatureMenu;
import com.kakao.kandinsky.sticker.contract.StickerGroup;
import com.kakao.kandinsky.sticker.contract.StickerItem;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlinx.coroutines.channels.Channel;
import u.q2;
import w0.a1;
import w0.z0;

public final class a extends Lambda implements Function0 {
    public final int w;
    public final Object x;
    public final Object y;

    public a(int v, Object object0, Object object1) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                ((DialogUiState)this.x).getOnConfirm().invoke();
                ((Function0)this.y).invoke();
                return Unit.INSTANCE;
            }
            case 1: {
                SimpleType simpleType0 = ((LazyJavaResolverContext)this.x).getModule().getBuiltIns().getBuiltInClassByFqName(((JavaAnnotationDescriptor)this.y).getFqName()).getDefaultType();
                Intrinsics.checkNotNullExpressionValue(simpleType0, "c.module.builtIns.getBui…qName(fqName).defaultType");
                return simpleType0;
            }
            case 2: {
                MultipleImageSelectorKt.access$cancelTrackerClickEvent(((String)this.x));
                ((Function0)this.y).invoke();
                return Unit.INSTANCE;
            }
            case 3: {
                Annotations annotations0 = ((ClassOrPackageFragmentDescriptor)this.y).getAnnotations();
                return ContextKt.computeNewDefaultTypeQualifiers(((LazyJavaResolverContext)this.x), annotations0);
            }
            case 4: {
                return ContextKt.computeNewDefaultTypeQualifiers(((LazyJavaResolverContext)this.x), ((Annotations)this.y));
            }
            case 5: {
                return new LazyJavaPackageFragment(LazyJavaPackageFragmentProvider.access$getC$p(((LazyJavaPackageFragmentProvider)this.x)), ((JavaPackage)this.y));
            }
            case 6: {
                return ((LazyJavaResolverContext)this.x).getComponents().getFinder().knownClassNamesInPackage(((LazyJavaPackageScope)this.y).getOwnerDescriptor().getFqName());
            }
            case 7: {
                ((Channel)this.x).trySend-JP2dKIU(this.y);
                return Unit.INSTANCE;
            }
            case 8: {
                Density density0 = DelegatableNodeKt.requireDensity(((q2)this.y));
                int v = ((q2)this.y).r.getIntValue();
                int v1 = ((q2)this.y).s.getIntValue();
                return ((MarqueeSpacing)this.x).calculateSpacing(density0, v, v1);
            }
            case 9: {
                Integer integer0 = ((Signature)this.y).getNo();
                ((Function1)this.x).invoke(integer0);
                return Unit.INSTANCE;
            }
            case 10: {
                ((Function1)this.x).invoke(((SignatureMenu)this.y));
                return Unit.INSTANCE;
            }
            case 11: {
                a1 a10 = (a1)this.x;
                a10.getClass();
                AccessibilityManager accessibilityManager0 = (AccessibilityManager)this.y;
                accessibilityManager0.removeAccessibilityStateChangeListener(a10);
                Listener.touchExplorationListener.1 listener$touchExplorationListener$10 = a10.b;
                if(listener$touchExplorationListener$10 != null) {
                    accessibilityManager0.removeTouchExplorationStateChangeListener(listener$touchExplorationListener$10);
                }
                if(Build.VERSION.SDK_INT >= 33) {
                    Listener.switchAccessListener.1 listener$switchAccessListener$10 = a10.c;
                    if(listener$switchAccessListener$10 != null) {
                        z0.b(accessibilityManager0, listener$switchAccessListener$10);
                    }
                }
                return Unit.INSTANCE;
            }
            case 12: {
                AnchoredDraggableState anchoredDraggableState0 = (AnchoredDraggableState)this.x;
                AnchoredDragScope anchoredDragScope0 = anchoredDraggableState0.o;
                DraggableAnchors draggableAnchors0 = anchoredDraggableState0.getAnchors();
                Object object0 = this.y;
                float f = draggableAnchors0.positionOf(object0);
                if(!Float.isNaN(f)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope0, f, 0.0f, 2, null);
                    AnchoredDraggableState.access$setDragTarget(anchoredDraggableState0, null);
                }
                anchoredDraggableState0.b(object0);
                return Unit.INSTANCE;
            }
            case 13: {
                ((Function1)this.x).invoke(Boolean.TRUE);
                CropScreenKt.access$CropScreen$lambda$0(((State)this.y)).getOnFinishInteraction().invoke();
                return Unit.INSTANCE;
            }
            case 14: {
                ((ComposerImpl)this.x).m(((MovableContentStateReference)this.y).getContent$runtime_release(), ((MovableContentStateReference)this.y).getLocals$runtime_release(), ((MovableContentStateReference)this.y).getParameter$runtime_release(), true);
                return Unit.INSTANCE;
            }
            case 15: {
                Object[] arr_object = ((MutableScatterSet)this.x).elements;
                long[] arr_v = ((MutableScatterSet)this.x).metadata;
                int v2 = arr_v.length - 2;
                if(v2 >= 0) {
                    int v3 = 0;
                    while(true) {
                        long v4 = arr_v[v3];
                        if((~v4 << 7 & v4 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v5 = 8 - (~(v3 - v2) >>> 0x1F);
                            for(int v6 = 0; v6 < v5; ++v6) {
                                if((0xFFL & v4) < 0x80L) {
                                    ((ControlledComposition)this.y).recordWriteOf(arr_object[(v3 << 3) + v6]);
                                }
                                v4 >>= 8;
                            }
                            if(v5 == 8) {
                                goto label_72;
                            }
                            break;
                        }
                    label_72:
                        if(v3 == v2) {
                            break;
                        }
                        ++v3;
                    }
                }
                return Unit.INSTANCE;
            }
            case 16: {
                SharedPreferences sharedPreferences0 = ((Context)this.x).getSharedPreferences(((String)this.y), 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences0, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences0;
            }
            case 17: {
                ((Function1)this.x).invoke(((StickerItem)this.y));
                return Unit.INSTANCE;
            }
            case 18: {
                ((Function1)this.x).invoke(((StickerGroup)this.y));
                return Unit.INSTANCE;
            }
            case 19: {
                Intrinsics.checkNotNullExpressionValue(((Context)this.x), "applicationContext");
                String s = ((PreferenceDataStoreSingletonDelegate)this.y).a;
                return PreferenceDataStoreFile.preferencesDataStoreFile(((Context)this.x), s);
            }
            case 20: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "crop-tab", "crop-degree", null, null, 12, null);
                CropBoxKt.access$CropBox$lambda$2(((MutableState)this.y), ((TouchLinePoint)this.x));
                return Unit.INSTANCE;
            }
            default: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "crop-tab", "crop-degree", null, null, 12, null);
                CropBoxKt.access$CropBox$lambda$2(((MutableState)this.y), ((TouchCirclePoint)this.x));
                return Unit.INSTANCE;
            }
        }
    }
}

