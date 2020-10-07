package tw.tim.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.HashMap;

public class A_TypeMyView extends MyViewHolders {


    private final ImageView imageView01;

    public A_TypeMyView(@NonNull View itemView) {
        super(itemView);
        imageView01 = itemView.findViewById(R.id.imageView01);

    }
    /**將資料綁到介面Ａ的內容*/
    @Override
    public void bindViewHolder(HashMap<String, String> hashMap) {
//        tvTitle.setText(hashMap.get("ENGLISH"));
    }
}