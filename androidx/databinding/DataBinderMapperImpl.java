package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
    public DataBinderMapperImpl() {
        this.addMapper(new com.kakao.tistory.DataBinderMapperImpl());
    }
}

