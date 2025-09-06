package com.kakao.kphotopicker;

import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.annotation.CallSuper;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.work.impl.utils.e;
import com.kakao.kphotopicker.loader.GalleryType;
import com.kakao.kphotopicker.loader.MediaRepository;
import com.kakao.kphotopicker.picker.Folder;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import com.kakao.kphotopicker.util.MediaPermissionState;
import com.kakao.kphotopicker.util.SingleLiveEvent;
import hc.d;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import j0.t1;
import j2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import jb.b;
import jb.r;
import jb.s;
import jb.t;
import jb.u;
import jb.v;
import jb.w;
import jb.x;
import jb.y;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00AE\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u009E\u00012\u00020\u0001:\u0002\u009E\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0087\u0001\u0010\u001F\u001A\u00020\u000B2\b\u0010\u0016\u001A\u0004\u0018\u00010\u001526\u0010\u001C\u001A2\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\u000B0\u001726\u0010\u001E\u001A2\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\u000B0\u0017\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010!\u001A\u00020\u000B2\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u00A2\u0006\u0004\b!\u0010\"JQ\u0010*\u001A\u00020\u000B2\u0006\u0010$\u001A\u00020#2\u001A\b\u0002\u0010&\u001A\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000B0\u00172\u000E\b\u0002\u0010(\u001A\b\u0012\u0004\u0012\u00020\u000B0\'2\u000E\b\u0002\u0010)\u001A\b\u0012\u0004\u0012\u00020\u000B0\'\u00A2\u0006\u0004\b*\u0010+J\u0015\u0010-\u001A\u00020\u000B2\u0006\u0010,\u001A\u00020#\u00A2\u0006\u0004\b-\u0010.J\u0019\u0010/\u001A\u00020\u000B2\n\b\u0002\u0010,\u001A\u0004\u0018\u00010#\u00A2\u0006\u0004\b/\u0010.J/\u00106\u001A\u00020\u000B2\f\u00102\u001A\b\u0012\u0004\u0012\u000201002\u0012\u00105\u001A\u000E\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020403\u00A2\u0006\u0004\b6\u00107J\u0017\u00109\u001A\u00020\u000B2\b\b\u0002\u00108\u001A\u00020\u0012\u00A2\u0006\u0004\b9\u0010:J\u0015\u0010-\u001A\u00020\u000B2\u0006\u0010;\u001A\u00020\b\u00A2\u0006\u0004\b-\u0010<J\r\u0010=\u001A\u00020\u0012\u00A2\u0006\u0004\b=\u0010\u0014J\r\u0010>\u001A\u00020\u0012\u00A2\u0006\u0004\b>\u0010\u0014J\'\u0010@\u001A\u00020\u000B2\u0018\u0010?\u001A\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000B0\u0017\u00A2\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001A\u00020\u00122\u0006\u0010B\u001A\u00020%\u00A2\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001A\u00020\u00122\u0006\u0010B\u001A\u00020%\u00A2\u0006\u0004\bE\u0010DJ\u000F\u0010F\u001A\u00020\u000BH\u0015\u00A2\u0006\u0004\bF\u0010\rJ\u0015\u0010H\u001A\u00020\u000B2\u0006\u0010G\u001A\u000204\u00A2\u0006\u0004\bH\u0010IJ!\u0010L\u001A\u00020\u000B2\u0006\u0010J\u001A\u0002042\n\b\u0002\u0010K\u001A\u0004\u0018\u000104\u00A2\u0006\u0004\bL\u0010MJ\u0015\u0010P\u001A\u00020\u000B2\u0006\u0010O\u001A\u00020N\u00A2\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001A\u00020\u00122\u0006\u0010R\u001A\u00020#\u00A2\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001A\u0004\u0018\u00010\b2\u0006\u0010R\u001A\u00020#\u00A2\u0006\u0004\bU\u0010VR\"\u0010^\u001A\u00020W8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010c\u001A\u00020\u00128\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b_\u0010`\u001A\u0004\ba\u0010\u0014\"\u0004\bb\u0010:R#\u0010i\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E000d8\u0006\u00A2\u0006\f\n\u0004\be\u0010f\u001A\u0004\bg\u0010hR\u001D\u0010l\u001A\b\u0012\u0004\u0012\u00020\u000E0d8\u0006\u00A2\u0006\f\n\u0004\bj\u0010f\u001A\u0004\bk\u0010hR#\u0010r\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#000m8\u0006\u00A2\u0006\f\n\u0004\bn\u0010o\u001A\u0004\bp\u0010qR#\u0010u\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#000d8\u0006\u00A2\u0006\f\n\u0004\bs\u0010f\u001A\u0004\bt\u0010hR\u001D\u0010w\u001A\b\u0012\u0004\u0012\u00020\u00120d8\u0006\u00A2\u0006\f\n\u0004\bv\u0010f\u001A\u0004\bw\u0010hR\u001D\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0m8\u0006\u00A2\u0006\f\n\u0004\bx\u0010o\u001A\u0004\by\u0010qR \u0010\u0080\u0001\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010{0z8\u0006\u00A2\u0006\f\n\u0004\b|\u0010}\u001A\u0004\b~\u0010\u007FR&\u0010\u0083\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u000201000z8\u0006\u00A2\u0006\u000E\n\u0005\b\u0081\u0001\u0010}\u001A\u0005\b\u0082\u0001\u0010\u007FR&\u0010\u0086\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#000z8\u0006\u00A2\u0006\u000E\n\u0005\b\u0084\u0001\u0010}\u001A\u0005\b\u0085\u0001\u0010\u007FR\"\u0010\u0089\u0001\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010{0z8\u0006\u00A2\u0006\u000E\n\u0005\b\u0087\u0001\u0010}\u001A\u0005\b\u0088\u0001\u0010\u007FR\u001F\u0010H\u001A\b\u0012\u0004\u0012\u0002040z8\u0006\u00A2\u0006\u000E\n\u0005\b\u008A\u0001\u0010}\u001A\u0005\b\u008B\u0001\u0010\u007FR.\u0010L\u001A\u0017\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u0001040\u008C\u00010z8\u0006\u00A2\u0006\u000E\n\u0005\b\u008D\u0001\u0010}\u001A\u0005\b\u008E\u0001\u0010\u007FR \u0010\u0091\u0001\u001A\b\u0012\u0004\u0012\u00020N0d8\u0006\u00A2\u0006\u000E\n\u0005\b\u008F\u0001\u0010f\u001A\u0005\b\u0090\u0001\u0010hR \u0010\u0094\u0001\u001A\b\u0012\u0004\u0012\u00020\u00120m8\u0006\u00A2\u0006\u000E\n\u0005\b\u0092\u0001\u0010o\u001A\u0005\b\u0093\u0001\u0010qR\u0015\u0010\u0098\u0001\u001A\u00030\u0095\u00018F\u00A2\u0006\b\u001A\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0014\u0010\u009B\u0001\u001A\u00020%8F\u00A2\u0006\b\u001A\u0006\b\u0099\u0001\u0010\u009A\u0001R\u0014\u0010\u009D\u0001\u001A\u00020%8F\u00A2\u0006\b\u001A\u0006\b\u009C\u0001\u0010\u009A\u0001\u00A8\u0006\u009F\u0001"}, d2 = {"Lcom/kakao/kphotopicker/PickerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "Lcom/kakao/kphotopicker/loader/MediaRepository;", "mediaRepository", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/kakao/kphotopicker/loader/MediaRepository;)V", "", "selectedItemCount", "()I", "", "loadFolders", "()V", "Lcom/kakao/kphotopicker/picker/Folder;", "folder", "changeFolder", "(Lcom/kakao/kphotopicker/picker/Folder;)V", "", "isSinglePick", "()Z", "Landroid/net/Uri;", "uri", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "stringRes", "value", "invalidVideoSizeMessage", "countOver", "videoCountOverMessage", "addVideoMediaItemFromCamera", "(Landroid/net/Uri;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "addPhotoImage", "(Landroid/net/Uri;)V", "Lcom/kakao/kphotopicker/picker/MediaItem;", "item", "", "onSizeOver", "Lkotlin/Function0;", "onCountOver", "onSuccess", "addMediaItem", "(Lcom/kakao/kphotopicker/picker/MediaItem;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "mediaItem", "deleteSelectedMedia", "(Lcom/kakao/kphotopicker/picker/MediaItem;)V", "requestPhotoEdit", "", "Lcom/kakao/kphotopicker/picker/MediaItem$Photo;", "originalPhotoList", "", "", "output", "updatePhoto", "(Ljava/util/List;Ljava/util/Map;)V", "isImageGrid", "requestAttachSelectedMediaList", "(Z)V", "index", "(I)V", "allowMediaAdd", "isMaxSelected", "function", "requestCountOverMessage", "(Lkotlin/jvm/functions/Function2;)V", "size", "isValidPhotoSize", "(J)Z", "isValidVideoSize", "onCleared", "editorVersion", "loadEventWithVersion", "(Ljava/lang/String;)V", "layer2", "layer3", "clickEvent", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/kakao/kphotopicker/util/MediaPermissionState;", "state", "setMediaPermissionState", "(Lcom/kakao/kphotopicker/util/MediaPermissionState;)V", "media", "isSelectedMedia", "(Lcom/kakao/kphotopicker/picker/MediaItem;)Z", "getSelectionNo", "(Lcom/kakao/kphotopicker/picker/MediaItem;)Ljava/lang/Integer;", "Lcom/kakao/kphotopicker/PhotoPickerConfig;", "L0", "Lcom/kakao/kphotopicker/PhotoPickerConfig;", "getConfig", "()Lcom/kakao/kphotopicker/PhotoPickerConfig;", "setConfig", "(Lcom/kakao/kphotopicker/PhotoPickerConfig;)V", "config", "M0", "Z", "getHasGroupImage", "setHasGroupImage", "hasGroupImage", "Landroidx/lifecycle/MutableLiveData;", "N0", "Landroidx/lifecycle/MutableLiveData;", "getFolderItemList", "()Landroidx/lifecycle/MutableLiveData;", "folderItemList", "O0", "getCurrentFolder", "currentFolder", "Landroidx/lifecycle/LiveData;", "P0", "Landroidx/lifecycle/LiveData;", "getMediaItemList", "()Landroidx/lifecycle/LiveData;", "mediaItemList", "Q0", "getSelectedMediaList", "selectedMediaList", "R0", "isShowSelectedView", "S0", "getSelectedItemCount", "Lcom/kakao/kphotopicker/util/SingleLiveEvent;", "Ljava/lang/Void;", "U0", "Lcom/kakao/kphotopicker/util/SingleLiveEvent;", "getMediaItemUpdateEvent", "()Lcom/kakao/kphotopicker/util/SingleLiveEvent;", "mediaItemUpdateEvent", "V0", "getRequestPhotoEditEvent", "requestPhotoEditEvent", "W0", "getRequestAttacheSelectedListEvent", "requestAttacheSelectedListEvent", "X0", "getFolderChangedEvent", "folderChangedEvent", "Y0", "getLoadEventWithVersion", "Lkotlin/Pair;", "Z0", "getClickEvent", "a1", "getMediaPermissionState", "mediaPermissionState", "b1", "getEditButtonEnable", "editButtonEnable", "Lcom/kakao/kphotopicker/loader/GalleryType;", "getGalleryType", "()Lcom/kakao/kphotopicker/loader/GalleryType;", "galleryType", "getLimitPhotoFileSize", "()J", "limitPhotoFileSize", "getLimitVideoFileSize", "limitVideoFileSize", "Companion", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerViewModel.kt\ncom/kakao/kphotopicker/PickerViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,346:1\n1#2:347\n800#3,11:348\n1855#3,2:359\n215#4,2:361\n*S KotlinDebug\n*F\n+ 1 PickerViewModel.kt\ncom/kakao/kphotopicker/PickerViewModel\n*L\n188#1:348,11\n195#1:359,2\n285#1:361,2\n*E\n"})
public final class PickerViewModel extends ViewModel {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kphotopicker/PickerViewModel$Companion;", "", "Landroidx/activity/ComponentActivity;", "activity", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "provideFactory", "(Landroidx/activity/ComponentActivity;Landroid/os/Bundle;)Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final AbstractSavedStateViewModelFactory provideFactory(@NotNull ComponentActivity componentActivity0, @Nullable Bundle bundle0) {
            Intrinsics.checkNotNullParameter(componentActivity0, "activity");
            return new AbstractSavedStateViewModelFactory(bundle0/*ERROR_MISSING_ARG_1/*) {
                @Override  // androidx.lifecycle.AbstractSavedStateViewModelFactory
                @NotNull
                public ViewModel create(@NotNull String s, @NotNull Class class0, @NotNull SavedStateHandle savedStateHandle0) {
                    Intrinsics.checkNotNullParameter(s, "key");
                    Intrinsics.checkNotNullParameter(class0, "modelClass");
                    Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
                    Object object0 = savedStateHandle0.get("CONFIG");
                    Intrinsics.checkNotNull(object0);
                    List list0 = ((PhotoPickerConfig)object0).getExcludeMimeTypes();
                    return new PickerViewModel(savedStateHandle0, PickerMediaRepositoryFactory.INSTANCE.create(bundle0, ((PhotoPickerConfig)object0).getPickerType(), list0));
                }
            };
        }

        public static AbstractSavedStateViewModelFactory provideFactory$default(Companion pickerViewModel$Companion0, ComponentActivity componentActivity0, Bundle bundle0, int v, Object object0) {
            if((v & 2) != 0) {
                bundle0 = null;
            }
            return pickerViewModel$Companion0.provideFactory(componentActivity0, bundle0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final MediaRepository H0;
    public final HashMap I0;
    public final CompositeDisposable J0;
    public final SelectedMediaManager K0;
    public PhotoPickerConfig L0;
    public boolean M0;
    public final MutableLiveData N0;
    public final MutableLiveData O0;
    public final LiveData P0;
    public final MutableLiveData Q0;
    public final MutableLiveData R0;
    public final LiveData S0;
    public final Lazy T0;
    public final SingleLiveEvent U0;
    public final SingleLiveEvent V0;
    public final SingleLiveEvent W0;
    public final SingleLiveEvent X0;
    public final SingleLiveEvent Y0;
    public final SingleLiveEvent Z0;
    public final MutableLiveData a1;
    public final LiveData b1;

    static {
        PickerViewModel.Companion = new Companion(null);
    }

    public PickerViewModel(@NotNull SavedStateHandle savedStateHandle0, @NotNull MediaRepository mediaRepository0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
        Intrinsics.checkNotNullParameter(mediaRepository0, "mediaRepository");
        super();
        this.H0 = mediaRepository0;
        this.I0 = new HashMap();
        this.J0 = new CompositeDisposable();
        this.K0 = new SelectedMediaManager();
        Object object0 = savedStateHandle0.get("CONFIG");
        Intrinsics.checkNotNull(object0);
        this.L0 = (PhotoPickerConfig)object0;
        this.N0 = new MutableLiveData();
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.O0 = mutableLiveData0;
        this.P0 = Transformations.switchMap(mutableLiveData0, new t(this, 1));
        MutableLiveData mutableLiveData1 = new MutableLiveData(CollectionsKt__CollectionsKt.emptyList());
        this.Q0 = mutableLiveData1;
        this.R0 = new MutableLiveData();
        this.S0 = Transformations.map(mutableLiveData1, new t(this, 2));
        this.T0 = c.lazy(new j(this, 1));
        this.U0 = new SingleLiveEvent();
        this.V0 = new SingleLiveEvent();
        this.W0 = new SingleLiveEvent();
        this.X0 = new SingleLiveEvent();
        this.Y0 = new SingleLiveEvent();
        this.Z0 = new SingleLiveEvent();
        this.a1 = new MutableLiveData();
        this.b1 = Transformations.map(mutableLiveData1, x.w);
    }

    public static final void access$addSelectedVideoWhenValidate(PickerViewModel pickerViewModel0, Video mediaItem$Video0, Function2 function20, Function2 function21) {
        pickerViewModel0.getClass();
        PickerViewModel.addMediaItem$default(pickerViewModel0, mediaItem$Video0, new u(function20), new v(pickerViewModel0, function21), null, 8, null);
    }

    public static final Job access$cancelPreviousJobAndAssignNewJob(PickerViewModel pickerViewModel0, String s) {
        HashMap hashMap0 = pickerViewModel0.I0;
        Job job0 = (Job)hashMap0.get(s);
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        hashMap0.remove(s);
        hashMap0.put(s, JobKt.Job$default(null, 1, null));
        Object object0 = hashMap0.get(s);
        Intrinsics.checkNotNull(object0);
        return (Job)object0;
    }

    public static final SelectedMediaManager access$getSelectedMediaManager$p(PickerViewModel pickerViewModel0) {
        return pickerViewModel0.K0;
    }

    public static final void access$onLoadFolders(PickerViewModel pickerViewModel0, boolean z, Folder folder0) {
        Object object0;
        MutableLiveData mutableLiveData0;
        if(z) {
            pickerViewModel0.changeFolder(folder0);
            return;
        }
        List list0 = (List)pickerViewModel0.N0.getValue();
        if(list0 != null) {
            Iterator iterator0 = list0.iterator();
            do {
                boolean z1 = iterator0.hasNext();
                mutableLiveData0 = pickerViewModel0.O0;
                if(!z1) {
                    goto label_13;
                }
                object0 = iterator0.next();
                Folder folder1 = (Folder)mutableLiveData0.getValue();
            }
            while(folder1 == null || ((Folder)object0).getBucketId() != folder1.getBucketId());
            goto label_14;
        label_13:
            object0 = null;
        label_14:
            if(((Folder)object0) != null) {
                Folder folder2 = (Folder)mutableLiveData0.getValue();
                if(folder2 == null || folder2.getBucketSize() != ((Folder)object0).getBucketSize()) {
                    mutableLiveData0.postValue(((Folder)object0));
                }
            }
        }
    }

    public static final void access$reloadCurrentFolder(PickerViewModel pickerViewModel0) {
        pickerViewModel0.loadFolders();
    }

    public static final void access$updateSelectedMediaList(PickerViewModel pickerViewModel0) {
        pickerViewModel0.d();
    }

    public final void addMediaItem(@NotNull MediaItem mediaItem0, @NotNull Function2 function20, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(mediaItem0, "item");
        Intrinsics.checkNotNullParameter(function20, "onSizeOver");
        Intrinsics.checkNotNullParameter(function00, "onCountOver");
        Intrinsics.checkNotNullParameter(function01, "onSuccess");
        ((ItemSelectHandler)this.T0.getValue()).addMediaItem(mediaItem0, function20, function00, new t1(1, this, function01));
    }

    public static void addMediaItem$default(PickerViewModel pickerViewModel0, MediaItem mediaItem0, Function2 function20, Function0 function00, Function0 function01, int v, Object object0) {
        if((v & 2) != 0) {
            function20 = s.w;
        }
        if((v & 4) != 0) {
            function00 = b.z;
        }
        if((v & 8) != 0) {
            function01 = b.A;
        }
        pickerViewModel0.addMediaItem(mediaItem0, function20, function00, function01);
    }

    public final void addPhotoImage(@Nullable Uri uri0) {
        if(uri0 != null) {
            Disposable disposable0 = Maybe.fromCallable(new r(this, uri0, 1)).onErrorComplete().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(new t(this, 0), 3));
            this.J0.add(disposable0);
            return;
        }
        this.loadFolders();
    }

    public final void addVideoMediaItemFromCamera(@Nullable Uri uri0, @NotNull Function2 function20, @NotNull Function2 function21) {
        Intrinsics.checkNotNullParameter(function20, "invalidVideoSizeMessage");
        Intrinsics.checkNotNullParameter(function21, "videoCountOverMessage");
        if(uri0 != null) {
            Disposable disposable0 = Maybe.fromCallable(new r(this, uri0, 0)).onErrorComplete().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(new w(this, function20, function21), 2));
            this.J0.add(disposable0);
            return;
        }
        this.loadFolders();
    }

    public final boolean allowMediaAdd() {
        MutableLiveData mutableLiveData0 = this.Q0;
        if(this.c()) {
            List list0 = (List)mutableLiveData0.getValue();
            return (list0 == null ? 0 : list0.size()) < this.L0.getRemainCount$kphotopicker_release();
        }
        List list1 = (List)mutableLiveData0.getValue();
        return (list1 == null ? 0 : list1.size()) < this.L0.getMaxCount$kphotopicker_release();
    }

    public final boolean c() {
        return this.L0.getRemainCount$kphotopicker_release() > 0 && this.L0.getTotalCount$kphotopicker_release() > 0;
    }

    public final void changeFolder(@NotNull Folder folder0) {
        Intrinsics.checkNotNullParameter(folder0, "folder");
        this.X0.call();
        this.O0.postValue(folder0);
    }

    public final void clickEvent(@NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "layer2");
        Pair pair0 = TuplesKt.to(s, s1);
        this.Z0.setValue(pair0);
    }

    public static void clickEvent$default(PickerViewModel pickerViewModel0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        pickerViewModel0.clickEvent(s, s1);
    }

    public final void d() {
        List list0 = CollectionsKt___CollectionsKt.toList(this.K0.getSelectedMap().values());
        this.Q0.setValue(list0);
        this.U0.call();
    }

    public final void deleteSelectedMedia(int v) {
        this.K0.deleteMedia(v);
        this.d();
    }

    public final void deleteSelectedMedia(@NotNull MediaItem mediaItem0) {
        Intrinsics.checkNotNullParameter(mediaItem0, "mediaItem");
        this.K0.deleteMedia(mediaItem0);
        this.d();
    }

    @NotNull
    public final SingleLiveEvent getClickEvent() {
        return this.Z0;
    }

    @NotNull
    public final PhotoPickerConfig getConfig() {
        return this.L0;
    }

    @NotNull
    public final MutableLiveData getCurrentFolder() {
        return this.O0;
    }

    @NotNull
    public final LiveData getEditButtonEnable() {
        return this.b1;
    }

    @NotNull
    public final SingleLiveEvent getFolderChangedEvent() {
        return this.X0;
    }

    @NotNull
    public final MutableLiveData getFolderItemList() {
        return this.N0;
    }

    @NotNull
    public final GalleryType getGalleryType() {
        return this.L0.getPickerType();
    }

    public final boolean getHasGroupImage() {
        return this.M0;
    }

    public final long getLimitPhotoFileSize() {
        return this.L0.getLimitPhotoFileSize();
    }

    public final long getLimitVideoFileSize() {
        return this.L0.getLimitVideoFileSize();
    }

    @NotNull
    public final SingleLiveEvent getLoadEventWithVersion() {
        return this.Y0;
    }

    @NotNull
    public final LiveData getMediaItemList() {
        return this.P0;
    }

    @NotNull
    public final SingleLiveEvent getMediaItemUpdateEvent() {
        return this.U0;
    }

    @NotNull
    public final MutableLiveData getMediaPermissionState() {
        return this.a1;
    }

    @NotNull
    public final SingleLiveEvent getRequestAttacheSelectedListEvent() {
        return this.W0;
    }

    @NotNull
    public final SingleLiveEvent getRequestPhotoEditEvent() {
        return this.V0;
    }

    @NotNull
    public final LiveData getSelectedItemCount() {
        return this.S0;
    }

    @NotNull
    public final MutableLiveData getSelectedMediaList() {
        return this.Q0;
    }

    @Nullable
    public final Integer getSelectionNo(@NotNull MediaItem mediaItem0) {
        Intrinsics.checkNotNullParameter(mediaItem0, "media");
        return this.K0.getSelectionNo(mediaItem0);
    }

    public final boolean isMaxSelected() {
        if(this.isSinglePick()) {
            return false;
        }
        MutableLiveData mutableLiveData0 = this.Q0;
        if(this.c()) {
            List list0 = (List)mutableLiveData0.getValue();
            return (list0 == null ? 0 : list0.size()) >= this.L0.getRemainCount$kphotopicker_release();
        }
        List list1 = (List)mutableLiveData0.getValue();
        return (list1 == null ? 0 : list1.size()) >= this.L0.getMaxCount$kphotopicker_release();
    }

    public final boolean isSelectedMedia(@NotNull MediaItem mediaItem0) {
        Intrinsics.checkNotNullParameter(mediaItem0, "media");
        return this.K0.contains(mediaItem0);
    }

    @NotNull
    public final MutableLiveData isShowSelectedView() {
        return this.R0;
    }

    // 去混淆评级： 低(20)
    public final boolean isSinglePick() {
        return this.L0.getMaxCount$kphotopicker_release() == 1 && !this.c();
    }

    public final boolean isValidPhotoSize(long v) {
        return Long.compare(this.getLimitPhotoFileSize(), -1L) == 0 || v <= this.getLimitPhotoFileSize();
    }

    public final boolean isValidVideoSize(long v) {
        return Long.compare(this.getLimitVideoFileSize(), -1L) == 0 || v <= this.getLimitVideoFileSize();
    }

    public final void loadEventWithVersion(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "editorVersion");
        this.Y0.setValue(s);
    }

    public final void loadFolders() {
        boolean z = this.O0.getValue() == null;
        if(z) {
            this.X0.call();
        }
        Disposable disposable0 = Single.fromCallable(new e(this, 4)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(new y(this, z), 1));
        this.J0.add(disposable0);
    }

    @Override  // androidx.lifecycle.ViewModel
    @CallSuper
    public void onCleared() {
        this.J0.clear();
        for(Object object0: this.I0.entrySet()) {
            DefaultImpls.cancel$default(((Job)((Map.Entry)object0).getValue()), null, 1, null);
        }
        super.onCleared();
    }

    public final void requestAttachSelectedMediaList(boolean z) {
        List list0 = (List)this.Q0.getValue();
        if(list0 != null) {
            this.W0.postValue(list0);
        }
    }

    public static void requestAttachSelectedMediaList$default(PickerViewModel pickerViewModel0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        pickerViewModel0.requestAttachSelectedMediaList(z);
    }

    public final void requestCountOverMessage(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "function");
        int v = this.L0.isOpeningThisKPhotoPickerToAddMoreImagesInImageGrid() ? string.toast_photo_limit_selection_once_grid : string.toast_image_limit_selection_once;
        int v1 = this.L0.getMaxCount$kphotopicker_release();
        if(this.c()) {
            v = this.L0.getPickerType() == GalleryType.VideoOnly ? this.L0.getTotalVideoCountLimitRes() : this.L0.getTotalImageCountLimitRes();
            v1 = this.L0.getTotalCount$kphotopicker_release();
        }
        function20.invoke(v, v1);
    }

    public final void requestPhotoEdit(@Nullable MediaItem mediaItem0) {
        List list0;
        if(mediaItem0 == null) {
        label_3:
            list0 = (List)this.Q0.getValue();
            if(list0 == null) {
                return;
            }
        }
        else {
            list0 = k.listOf(mediaItem0);
            if(list0 == null) {
                goto label_3;
            }
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(object0 instanceof Photo) {
                arrayList0.add(object0);
            }
        }
        if(!arrayList0.isEmpty()) {
            this.V0.postValue(arrayList0);
        }
    }

    public static void requestPhotoEdit$default(PickerViewModel pickerViewModel0, MediaItem mediaItem0, int v, Object object0) {
        if((v & 1) != 0) {
            mediaItem0 = null;
        }
        pickerViewModel0.requestPhotoEdit(mediaItem0);
    }

    public final int selectedItemCount() {
        Integer integer0 = (Integer)this.S0.getValue();
        if(integer0 == null) {
            integer0 = 0;
        }
        return integer0.intValue();
    }

    public final void setConfig(@NotNull PhotoPickerConfig photoPickerConfig0) {
        Intrinsics.checkNotNullParameter(photoPickerConfig0, "<set-?>");
        this.L0 = photoPickerConfig0;
    }

    public final void setHasGroupImage(boolean z) {
        this.M0 = z;
    }

    public final void setMediaPermissionState(@NotNull MediaPermissionState mediaPermissionState0) {
        Intrinsics.checkNotNullParameter(mediaPermissionState0, "state");
        MutableLiveData mutableLiveData0 = this.a1;
        if(mutableLiveData0.getValue() == mediaPermissionState0) {
            return;
        }
        mutableLiveData0.setValue(mediaPermissionState0);
    }

    public final void updatePhoto(@NotNull List list0, @NotNull Map map0) {
        MutableLiveData mutableLiveData0;
        Intrinsics.checkNotNullParameter(list0, "originalPhotoList");
        Intrinsics.checkNotNullParameter(map0, "output");
        Iterator iterator0 = list0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            mutableLiveData0 = this.Q0;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            Photo mediaItem$Photo0 = (Photo)object0;
            String s = mediaItem$Photo0.getEditedPath();
            if(s == null) {
                s = mediaItem$Photo0.getData();
            }
            String s1 = (String)map0.get(s);
            if(s1 != null) {
                mediaItem$Photo0.setEditedPath(s1);
                mediaItem$Photo0.setOrientation(0);
            }
            List list1 = (List)mutableLiveData0.getValue();
            if(list1 == null || !list1.contains(mediaItem$Photo0)) {
                PickerViewModel.addMediaItem$default(this, mediaItem$Photo0, null, null, null, 14, null);
            }
        }
        List list2 = (List)mutableLiveData0.getValue();
        if(list2 == null) {
            return;
        }
        mutableLiveData0.postValue(list2);
        this.U0.call();
    }
}

