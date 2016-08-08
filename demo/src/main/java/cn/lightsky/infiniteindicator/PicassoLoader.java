package cn.lightsky.infiniteindicator;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

import java.io.File;
import cn.lightsky.infiniteindicator.loader.ImageLoader;

/**
 * Created by lightsky on 16/1/28.
 */

public class PicassoLoader implements ImageLoader {

    public PicassoLoader getImageLoader(Context context) {
        return new PicassoLoader();
    }

    @Override
    public void initLoader(Context context) {

    }

    @Override
    public void load(Context context,ImageView targetView, Object res) {
        if (res == null) {
            return;
        }

        Picasso picasso = Picasso.with(context);
        RequestCreator requestCreator = null;

        if (res instanceof String) {
            requestCreator = picasso.load((String) res);
        } else if (res instanceof File) {
            requestCreator = picasso.load((File) res);
        } else if (res instanceof Integer) {
            requestCreator = picasso.load((Integer) res);
        }

        requestCreator
                .resize(ScreenUtil.getWidth(context),ScreenUtil.getHeightByRadio(context,1.6f))
                .into(targetView);

    }

}
