package fg;

import android.widget.TextView;
import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.SecureTextFieldController;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.runtime.snapshots.d;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.work.JobListenableFuture;
import androidx.work.impl.utils.futures.SettableFuture;
import com.kakao.kandinsky.mosaic.MosaicScreenKt.MosaicScreen.3.1.invoke..inlined.onDispose.1;
import com.kakao.kandinsky.mosaic.MosaicViewModel;
import com.kakao.kphotopicker.PickerFragment;
import com.kakao.kphotopicker.widget.dragselection.DragSelectTouchListener;
import h1.f;
import java.util.Map.Entry;
import java.util.concurrent.CancellationException;
import jg.b;
import kotlin.Unit;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractMap;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import kotlin.sequences.Sequence;
import kotlin.text.MatcherMatchResult.groups.1;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel.DefaultImpls;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.json.JsonElement;

public final class c extends Lambda implements Function1 {
    public final int w;
    public final Object x;

    public c(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((ClassSerialDescriptorBuilder)object0), "$this$buildSerialDescriptor");
                for(Object object1: SealedClassSerializer.access$getSerialName2Serializer$p(((SealedClassSerializer)this.x)).entrySet()) {
                    ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), ((String)((Map.Entry)object1).getKey()), ((KSerializer)((Map.Entry)object1).getValue()).getDescriptor(), null, false, 12, null);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                SemanticsPropertiesKt.setRole-kuIjeqM(((SemanticsPropertyReceiver)object0), ((Role)this.x).unbox-impl());
                return Unit.INSTANCE;
            }
            case 2: {
                int v = ((Number)object0).intValue();
                return ((SerialDescriptorImpl)this.x).getElementName(v) + ": " + ((SerialDescriptorImpl)this.x).getElementDescriptor(v).getSerialName();
            }
            case 3: {
                SaveableStateRegistry saveableStateRegistry0 = ((f)this.x).c;
                return saveableStateRegistry0 == null ? true : Boolean.valueOf(saveableStateRegistry0.canBeSaved(object0));
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((ClassSerialDescriptorBuilder)object0), "$this$buildSerialDescriptor");
                ((ClassSerialDescriptorBuilder)object0).setAnnotations(ObjectSerializer.access$get_annotations$p(((ObjectSerializer)this.x)));
                return Unit.INSTANCE;
            }
            case 5: {
                int v1 = ((Number)object0).intValue();
                return ((PluginGeneratedSerialDescriptor)this.x).getElementName(v1) + ": " + ((PluginGeneratedSerialDescriptor)this.x).getElementDescriptor(v1).getSerialName();
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((ClassSerialDescriptorBuilder)object0), "$this$buildClassSerialDescriptor");
                ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "first", TripleSerializer.access$getASerializer$p(((TripleSerializer)this.x)).getDescriptor(), null, false, 12, null);
                ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "second", TripleSerializer.access$getBSerializer$p(((TripleSerializer)this.x)).getDescriptor(), null, false, 12, null);
                ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "third", TripleSerializer.access$getCSerializer$p(((TripleSerializer)this.x)).getDescriptor(), null, false, 12, null);
                return Unit.INSTANCE;
            }
            case 7: {
                if(!((SnapshotStateObserver)this.x).h) {
                    MutableVector mutableVector0 = ((SnapshotStateObserver)this.x).f;
                    synchronized(mutableVector0) {
                        d d0 = ((SnapshotStateObserver)this.x).i;
                        Intrinsics.checkNotNull(d0);
                        Object object2 = d0.b;
                        Intrinsics.checkNotNull(object2);
                        int v3 = d0.d;
                        MutableObjectIntMap mutableObjectIntMap0 = d0.c;
                        if(mutableObjectIntMap0 == null) {
                            mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
                            d0.c = mutableObjectIntMap0;
                            d0.f.set(object2, mutableObjectIntMap0);
                        }
                        d0.c(object0, v3, object2, mutableObjectIntMap0);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
            case 8: {
                ((TextView)this.x).setVisibility((((Boolean)object0).booleanValue() ? 0 : 8));
                return Unit.INSTANCE;
            }
            case 9: {
                long v4 = ((OffsetProvider)this.x).provide-F1C5BW0();
                ((SemanticsPropertyReceiver)object0).set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, v4, SelectionHandleAnchor.Middle, true, null));
                return Unit.INSTANCE;
            }
            case 10: {
                if(!((FocusState)object0).isFocused()) {
                    ((SecureTextFieldController)this.x).getPasswordInputTransformation().hide();
                }
                return Unit.INSTANCE;
            }
            case 11: {
                float f = ((Number)object0).floatValue();
                TextFieldScrollerPosition textFieldScrollerPosition0 = (TextFieldScrollerPosition)this.x;
                float f1 = textFieldScrollerPosition0.getOffset() + f;
                if(f1 > textFieldScrollerPosition0.getMaximum()) {
                    f = textFieldScrollerPosition0.getMaximum() - textFieldScrollerPosition0.getOffset();
                }
                else if(f1 < 0.0f) {
                    f = -textFieldScrollerPosition0.getOffset();
                }
                textFieldScrollerPosition0.setOffset(textFieldScrollerPosition0.getOffset() + f);
                return f;
            }
            case 12: {
                int v5 = ((Number)object0).intValue();
                DragSelectTouchListener dragSelectTouchListener0 = PickerFragment.access$getDragSelectTouchListener(((PickerFragment)this.x));
                if(dragSelectTouchListener0 != null) {
                    dragSelectTouchListener0.setIsActive(true, v5);
                }
                return Unit.INSTANCE;
            }
            case 13: {
                Intrinsics.checkNotNullParameter(((String)object0), "it");
                return TypeRegistry.access$getIdCounter$p(((TypeRegistry)this.x)).getAndIncrement();
            }
            case 14: {
                Intrinsics.checkNotNullParameter(((JsonElement)object0), "node");
                String s = (String)((b)this.x).getCurrentTag();
                ((b)this.x).b(s, ((JsonElement)object0));
                return Unit.INSTANCE;
            }
            case 15: {
                Throwable throwable0 = (Throwable)object0;
                JobListenableFuture jobListenableFuture0 = (JobListenableFuture)this.x;
                if(throwable0 != null) {
                    if(throwable0 instanceof CancellationException) {
                        jobListenableFuture0.b.cancel(true);
                        return Unit.INSTANCE;
                    }
                    SettableFuture settableFuture0 = jobListenableFuture0.b;
                    Throwable throwable1 = throwable0.getCause();
                    if(throwable1 != null) {
                        throwable0 = throwable1;
                    }
                    settableFuture0.setException(throwable0);
                }
                else if(!jobListenableFuture0.b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                return Unit.INSTANCE;
            }
            case 16: {
                Intrinsics.checkNotNullParameter(((k8.f)object0), "$this$$receiver");
                DefaultImpls.close$default(((ProducerScope)this.x), null, 1, null);
                return Unit.INSTANCE;
            }
            case 17: {
                Intrinsics.checkNotNullParameter(((DisposableEffectScope)object0), "$this$DisposableEffect");
                return new MosaicScreenKt.MosaicScreen.3.1.invoke..inlined.onDispose.1(((MosaicViewModel)this.x));
            }
            case 18: {
                Intrinsics.checkNotNullParameter(((FqName)object0), "fqName");
                return new EmptyPackageFragmentDescriptor(NotFoundClasses.access$getModule$p(((NotFoundClasses)this.x)), ((FqName)object0));
            }
            case 19: {
                return Boolean.valueOf(((Class)this.x).isInstance(object0));
            }
            case 20: {
                return Boolean.valueOf(ArraysKt___ArraysKt.contains(((Object[])this.x), object0));
            }
            case 21: {
                if(object0 == null) {
                    throw new IllegalArgumentException("null element found in " + ((Sequence)this.x) + '.');
                }
                return object0;
            }
            case 22: {
                return object0 == ((AbstractCollection)this.x) ? "(this Collection)" : String.valueOf(object0);
            }
            case 23: {
                Intrinsics.checkNotNullParameter(((Map.Entry)object0), "it");
                return AbstractMap.access$toString(((AbstractMap)this.x), ((Map.Entry)object0));
            }
            case 24: {
                Intrinsics.checkNotNullParameter(((KTypeProjection)object0), "it");
                return TypeReference.access$asString(((TypeReference)this.x), ((KTypeProjection)object0));
            }
            case 25: {
                Intrinsics.checkNotNullParameter(((FqName)object0), "fqName");
                PackageViewDescriptorFactory packageViewDescriptorFactory0 = ModuleDescriptorImpl.access$getPackageViewDescriptorFactory$p(((ModuleDescriptorImpl)this.x));
                StorageManager storageManager0 = ModuleDescriptorImpl.access$getStorageManager$p(((ModuleDescriptorImpl)this.x));
                return packageViewDescriptorFactory0.compute(((ModuleDescriptorImpl)this.x), ((FqName)object0), storageManager0);
            }
            case 26: {
                Intrinsics.checkNotNullParameter(((FqName)object0), "fqName");
                AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider0 = (AbstractDeserializedPackageFragmentProvider)this.x;
                DeserializedPackageFragment deserializedPackageFragment0 = abstractDeserializedPackageFragmentProvider0.findPackage(((FqName)object0));
                if(deserializedPackageFragment0 != null) {
                    deserializedPackageFragment0.initialize(abstractDeserializedPackageFragmentProvider0.getComponents());
                    return deserializedPackageFragment0;
                }
                return null;
            }
            case 27: {
                Intrinsics.checkNotNullParameter(((a)object0), "key");
                return ClassDeserializer.access$createClass(((ClassDeserializer)this.x), ((a)object0));
            }
            case 28: {
                return ((MatcherMatchResult.groups.1)this.x).get(((Number)object0).intValue());
            }
            default: {
                Intrinsics.checkNotNullParameter(((ModuleDescriptor)object0), "module");
                KotlinBuiltIns kotlinBuiltIns0 = ((ModuleDescriptor)object0).getBuiltIns();
                SimpleType simpleType0 = ((KotlinBuiltIns)this.x).getStringType();
                SimpleType simpleType1 = kotlinBuiltIns0.getArrayType(Variance.INVARIANT, simpleType0);
                Intrinsics.checkNotNullExpressionValue(simpleType1, "module.builtIns.getArray…ce.INVARIANT, stringType)");
                return simpleType1;
            }
        }
    }
}

