package tw.noel.sung.com.practice_asynclistdiffer.async_list_differ.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;



public class CustomDiffUtilCallBack<T extends BaseAsyncListDifferModel> extends DiffUtil.ItemCallback {


    @Override
    public boolean areItemsTheSame(@NonNull Object oldItem, @NonNull Object newItem) {
        BaseAsyncListDifferModel oldAsyncListDifferModel = (BaseAsyncListDifferModel) oldItem;
        BaseAsyncListDifferModel newAsyncListDifferModel = (BaseAsyncListDifferModel) newItem;
        return oldAsyncListDifferModel.getObjectName().equals(newAsyncListDifferModel.getObjectName());
    }

    @Override
    public boolean areContentsTheSame(@NonNull Object oldItem, @NonNull Object newItem) {
        BaseAsyncListDifferModel oldAsyncListDifferModel = (BaseAsyncListDifferModel) oldItem;
        BaseAsyncListDifferModel newAsyncListDifferModel = (BaseAsyncListDifferModel) newItem;
        return !(oldAsyncListDifferModel.getObjectId().equals(newAsyncListDifferModel.getObjectId()));
    }
}
